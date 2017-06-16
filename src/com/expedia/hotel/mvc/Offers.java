package com.expedia.hotel.mvc;

import java.util.List;

public class Offers {
  private List<Hotel> Hotel;
  
  public Offers() {
    Hotel = new java.util.ArrayList();
  }
  
  public List<Hotel> getHotels() { return Hotel; }
  
  public void setHotels(List<Hotel> hotels) {
    Hotel = Hotel;
  }
  
  public String toString() {
    return "Offers [hotels=" + Hotel + "]";
  }
}