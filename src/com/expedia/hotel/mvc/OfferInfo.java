package com.expedia.hotel.mvc;

public class OfferInfo { public OfferInfo() {}
  private int siteID = 0;
  private String language = null;
  private String currency = null;
  
  public int getSiteID() { return siteID; }
  
  public void setSiteID(int siteID) {
    this.siteID = siteID;
  }
  
  public String toString() {
    return "OfferInfo [siteID=" + siteID + ", language=" + language + ", currency=" + currency + "]";
  }
  
  public String getLanguage() { return language; }
  
  public void setLanguage(String language) {
    this.language = language;
  }
  
  public String getCurrency() { return currency; }
  
  public void setCurrency(String currency) {
    this.currency = currency;
  }
}