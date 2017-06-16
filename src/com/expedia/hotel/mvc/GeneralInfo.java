package com.expedia.hotel.mvc;
//THIS CLASS IS THEGENERAL CLASS
public class GeneralInfo {
  private OfferInfo offerInfo;
  private UserInfo userInfo;
  private Offers offers;
  
  public GeneralInfo() {}
  
  public OfferInfo getOfferInfo() { return offerInfo; }
  
  public void setOfferInfo(OfferInfo offerInfo) {
    this.offerInfo = offerInfo;
  }
  
  public UserInfo getUserInfo() { return userInfo; }
  
  public void setUserInfo(UserInfo userInfo) {
    this.userInfo = userInfo;
  }
  
  public Offers getOffers() { return offers; }
  
  public void setOffers(Offers offers) {
    this.offers = offers;
  }
}