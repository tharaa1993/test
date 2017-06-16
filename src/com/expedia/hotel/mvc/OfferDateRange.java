package com.expedia.hotel.mvc;

import java.util.List;

public class OfferDateRange
{
  private List<Integer> travelStartDate;
  private List<Integer> travelEndDate = null;
  private int lengthOfStay = 0;
  
  public OfferDateRange() { travelStartDate = new java.util.ArrayList();
    travelEndDate = new java.util.ArrayList();
  }
  
  public String getTravelStartDate() { String date_formatter = travelStartDate.get(0) + "-" + travelStartDate.get(1) + "-" + travelStartDate.get(2);
    return date_formatter;
  }
  
  public void setTravelStartDate(List<Integer> travelStartDate) { this.travelStartDate = travelStartDate; }
  
  public String getTravelEndDate() {
    String date_formatter = travelEndDate.get(0) + "-" + travelEndDate.get(1) + "-" + travelEndDate.get(2);
    return date_formatter;
  }
  
  public void setTravelEndDate(List<Integer> travelEndDate) { this.travelEndDate = travelEndDate; }
  
  public int getLengthOfStay() {
    return lengthOfStay;
  }
  
  public void setLengthOfStay(int lengthOfStay) { this.lengthOfStay = lengthOfStay; }
  
  public String toString()
  {
    return 
      "offerDateRange [travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate + ", lengthOfStay=" + lengthOfStay + "]";
  }
}