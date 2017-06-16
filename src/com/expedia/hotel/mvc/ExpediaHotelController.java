package com.expedia.hotel.mvc;
//AUTHOR: THARAA ABU ASHOUR
//THIS CLASS IS THE CONTROLLER CLASS; WILL CONTROL THE OPERATION BETWEEN VIEW AND MODAL
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/ExpediaHotelController" })
public class ExpediaHotelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<ExpediaHotelModal> Hotel_list = new ArrayList();

	public ExpediaHotelController() {
	}
	//THIS FUNCTION IS USED TO CALL API AND RETURN RETURN DATA IN JSON FORMAT
	private String getHotelDeals(HttpServletRequest request) throws IOException {
		String output = "";

		try {
			//PREPARE QUERY STRING , WHICH USED AS A SEARCH FILTERS
			String string_query = "";
			String target_destination = request.getParameter("destinationName");
			String start_date = request.getParameter("minTripStartDate");
			String max_date = request.getParameter("maxTripStartDate");
			String min_star_rate = request.getParameter("minStarRating");
			String min_guest_rate = request.getParameter("minGuestRating");

			if (target_destination != "") {
				string_query = string_query + "&destinationName=" + target_destination;
			}
			if (start_date != "") {
				string_query = string_query + "&minTripStartDate=" + start_date;
			}
			if (max_date != "") {
				string_query = string_query + "&maxTripStartDate=" + max_date;
			}
			if (min_star_rate != "") {
				string_query = string_query + "&minStarRating=" + min_star_rate;
			}
			if (min_guest_rate != "") {
				string_query = string_query + "&minGuestRating=" + min_guest_rate;
			}
			//CLEAN UP URL FROM SPACE!
			String tmp_url = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel"
					+ string_query;
			String api_url = tmp_url.replaceAll(" ", "%20");

			//OPEN THE CONNECTION AND CALL API
			URL url = new URL(api_url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			output = br.readLine();
			conn.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}
	//THISFUNCTIONIS USED TO STORE DATA ASCENDING
	private void SortDataAsc(String sort_by) {
		Collections.sort(Hotel_list, new Comparator<ExpediaHotelModal>() {
			@Override
			public int compare(ExpediaHotelModal arg0, ExpediaHotelModal arg1) {
				switch (sort_by) {
					case "star_rate" :
						return  Double.compare(arg0.getHotelStarRating(), arg1.getHotelStarRating());
					case "guest_rate" :
						return  Double.compare(arg0.getHotelGuestReviewRating(), arg1.getHotelGuestReviewRating());
					case "price" :
						return  Double.compare(arg0.getHotelTotalRate(), arg1.getHotelTotalRate());
				}
				return 0;
			}
		});
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sort_p = Integer.parseInt(request.getParameter("sort_p"));
		String sort_by = "";
		if (sort_p == 1) {
			//THE DATA IS ALREADY STORED IN THE LIST AND SHOULD BE SORT IT
			sort_by = request.getParameter("sort_value");
			SortDataAsc(sort_by);
		} else {
			//GET DATA FROM API
			String jsonData = getHotelDeals(request);
			
			//CONVERT JSON DATA TO LIST
			Gson gson = new Gson();
			GeneralInfo generalObjectInfo = (GeneralInfo) gson.fromJson(jsonData, GeneralInfo.class);
			List<Hotel> hotel_objects = generalObjectInfo.getOffers().getHotels();

			ExpediaHotelModal temp_obj = new ExpediaHotelModal();

			for (int i = 0; i < hotel_objects.size(); i++) {
				//FORMAT /SET SOME ATTRIBUTES
				temp_obj = ((Hotel) hotel_objects.get(i)).getHotelInfo();
				temp_obj.setHotelStartDate(((Hotel) hotel_objects.get(i)).getOfferDateRange().getTravelStartDate().toString());
				temp_obj.setHotelEndDate(((Hotel) hotel_objects.get(i)).getOfferDateRange().getTravelEndDate().toString());
				temp_obj.setHotelTotalRate(((Hotel) hotel_objects.get(i)).getHotelPricingInfo().getTotalPriceValue());
				temp_obj.setCurrency(((Hotel) hotel_objects.get(i)).getHotelPricingInfo().getCurrency().toString());

				Hotel_list.add(temp_obj);
			}
		}
		request.setAttribute("sort_by", sort_by);
		request.setAttribute("Hotel", Hotel_list);
		getServletContext().getRequestDispatcher("/ExpediaHotelSearchResults.jsp").forward(request, response);
	}
}