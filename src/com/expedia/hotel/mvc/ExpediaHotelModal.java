package com.expedia.hotel.mvc;
// THIS CLASS IS THE MOST USED WHICH CONTAIN ALL THE DETAILS OF THE HOTEL
// AUTHOR: THARAA ABU ASHOUR
public class ExpediaHotelModal {
	private int hotelId = 0;
	private String description = null;
	private String hotelName = null;
	private String hotelDestination = null;
	private String hotelCity = null;
	private double hotelStarRating = 0.0D;
	private double hotelGuestReviewRating = 0.0D;
	private String hotelStartDate = null;
	private String hotelEndDate = null;
	private String hotelImageUrl = null;
	private String hotelDesciption = null;
	private double hotelTotalRate = 0.0D;
	private double hotelAverageScore = 0.0D;
	private int hotelDestinationRegionID = 0;

	public ExpediaHotelModal() {
	}

	private String hotelLongDestination = null;

	private String hotelStreetAddress = null;
	private String hotelProvince = null;
	private String hotelCountryCode = null;
	private String hotelLocation = null;
	private double hotelLatitude = 0.0D;
	private double hotelLongitude = 0.0D;
	private double carPackageScore = 0.0D;
	private double distanceFromUser = 0.0D;
	private String language = null;
	private double movingAverageScore = 0.0D;
	private double promotionAmount = 0.0D;
	private String promotionDescription = null;
	private String promotionTag = null;
	private double rawAppealScore = 0.0D;
	private double relevanceScore = 0.0D;
	private double statusCode = 0.0D;
	private String statusDescription = null;
	private String allInclusive = null;
	private String carPackage = null;
	private String currency = null;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(int hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public double getCarPackageScore() {
		return carPackageScore;
	}

	public void setCarPackageScore(double carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	public double getDistanceFromUser() {
		return distanceFromUser;
	}

	public void setDistanceFromUser(double distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getMovingAverageScore() {
		return movingAverageScore;
	}

	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	public double getPromotionAmount() {
		return promotionAmount;
	}

	public void setPromotionAmount(double promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	public String getPromotionDescription() {
		return promotionDescription;
	}

	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getPromotionTag() {
		return promotionTag;
	}

	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	public double getRawAppealScore() {
		return rawAppealScore;
	}

	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	public double getRelevanceScore() {
		return relevanceScore;
	}

	public void setRelevanceScore(double relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	public double getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(double statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	public String getAllInclusive() {
		return allInclusive;
	}

	public void setAllInclusive(String allInclusive) {
		this.allInclusive = allInclusive;
	}

	public String getCarPackage() {
		return carPackage;
	}

	public void setCarPackage(String carPackage) {
		this.carPackage = carPackage;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public String toString() {
		return

		"<strong> Hotel Name: " + hotelName + "</strong><br><strong>Descriptions: </strong>" + description
				+ "<br><span><strong>Destination: </strong>" + hotelDestination
				+ "&nbsp;&nbsp;-&nbsp;&nbsp;<strong>City: </strong>" + hotelCity
				+ "&nbsp;&nbsp;-&nbsp;&nbsp;<strong>Street:</strong>" + hotelStreetAddress
				+ "</span><br><strong> Star Rate: </strong>" + hotelStarRating
				+ "&nbsp;&nbsp;-&nbsp;&nbsp;<strong>Guest Rate:</strong>" + hotelGuestReviewRating
				+ "<br><strong>Start Date: </strong>" + hotelStartDate + "<br><strong>End Date: </strong>"
				+ hotelEndDate + "<br><strong>" + "Price: </strong>" + hotelTotalRate + " " + currency
				+ "<br><strong>Average Score: </strong>" + hotelAverageScore;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public double getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(double hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public String getHotelStartDate() {
		return hotelStartDate;
	}

	public void setHotelStartDate(String hotelStartDate) {
		this.hotelStartDate = hotelStartDate;
	}

	public String getHotelEndDate() {
		return hotelEndDate;
	}

	public void setHotelEndDate(String hotelEndDate) {
		this.hotelEndDate = hotelEndDate;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public String getHotelDesciption() {
		return hotelDesciption;
	}

	public void setHotelDesciption(String hotelDesciption) {
		this.hotelDesciption = hotelDesciption;
	}

	public double getHotelTotalRate() {
		return hotelTotalRate;
	}

	public void setHotelTotalRate(double hotelTotalRate) {
		this.hotelTotalRate = hotelTotalRate;
	}

	public double getHotelAverageScore() {
		return hotelAverageScore;
	}

	public void setHotelAverageScore(double hotelAverageScore) {
		this.hotelAverageScore = hotelAverageScore;
	}
}