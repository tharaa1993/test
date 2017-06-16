package com.expedia.hotel.mvc;

public class Hotel {
	private OfferDateRange offerDateRange;
	private Destination destination;
	private ExpediaHotelModal hotelInfo;
	private hotelUrgencyInfo hotelUrgencyInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	private HotelScores hotelScores;

	public Hotel() {
	}

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public ExpediaHotelModal getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(ExpediaHotelModal hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public hotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(hotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	public HotelScores getHotelScores() {
		return hotelScores;
	}

	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}
}