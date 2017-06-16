package com.expedia.hotel.mvc;
// THIS CLASS IS USED TO STORE INFORMATION OFDESTINATION
class Destination { Destination() {}
  private int regionID = 0;
  private String longName = null;
  private String country = null;
  private String province = null;
  private String city = null;
  
  public int getRegionID() { return regionID; }
  
  public void setRegionID(int regionID) {
    this.regionID = regionID;
  }
  
  public String getLongName() { return longName; }
  
  public void setLongName(String longName) {
    this.longName = longName;
  }
  
  public String getCountry() { return country; }
  
  public void setCountry(String country) {
    this.country = country;
  }
  
  public String getProvince() { return province; }
  
  public void setProvince(String province) {
    this.province = province;
  }
  
  public String getCity() { return city; }
  
  public void setCity(String city) {
    this.city = city;
  }
}