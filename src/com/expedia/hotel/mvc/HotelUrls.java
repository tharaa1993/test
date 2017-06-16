package com.expedia.hotel.mvc;

public class HotelUrls { public HotelUrls() {}
  private String hotelInfositeUrl = null;
  private String hotelSearchResultUrl = null;
  
  public String getHotelInfositeUrl() { return hotelInfositeUrl; }
  
  public void setHotelInfositeUrl(String hotelInfositeUrl) {
    this.hotelInfositeUrl = hotelInfositeUrl;
  }
  
  public String getHotelSearchResultUrl() { return hotelSearchResultUrl; }
  
  public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
    this.hotelSearchResultUrl = hotelSearchResultUrl;
  }
}