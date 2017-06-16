package com.expedia.hotel.mvc;

import java.util.ArrayList;

public class hotelUrgencyInfo { public hotelUrgencyInfo() {}
  private int airAttachRemainingTime = 0;
  private int numberOfPeopleViewing = 0;
  private int numberOfPeopleBooked = 0;
  private int numberOfRoomsLeft = 0;
  private String lastBookedTime = null;
  private String almostSoldStatus = null;
  private String link = null;
  private ArrayList almostSoldOutRoomTypeInfoCollection = new ArrayList();
  private boolean airAttachEnabled = false;
  
  public int getAirAttachRemainingTime() { return airAttachRemainingTime; }
  
  public void setAirAttachRemainingTime(int airAttachRemainingTime) {
    this.airAttachRemainingTime = airAttachRemainingTime;
  }
  
  public int getNumberOfPeopleViewing() { return numberOfPeopleViewing; }
  
  public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
    this.numberOfPeopleViewing = numberOfPeopleViewing;
  }
  
  public int getNumberOfPeopleBooked() { return numberOfPeopleBooked; }
  
  public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
    this.numberOfPeopleBooked = numberOfPeopleBooked;
  }
  
  public int getNumberOfRoomsLeft() { return numberOfRoomsLeft; }
  
  public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
    this.numberOfRoomsLeft = numberOfRoomsLeft;
  }
  
  public String getLastBookedTime() { return lastBookedTime; }
  
  public void setLastBookedTime(String lastBookedTime) {
    this.lastBookedTime = lastBookedTime;
  }
  
  public String getAlmostSoldStatus() { return almostSoldStatus; }
  
  public void setAlmostSoldStatus(String almostSoldStatus) {
    this.almostSoldStatus = almostSoldStatus;
  }
  
  public String getLink() { return link; }
  
  public void setLink(String link) {
    this.link = link;
  }
  
  public ArrayList getAlmostSoldOutRoomTypeInfoCollection() { return almostSoldOutRoomTypeInfoCollection; }
  
  public void setAlmostSoldOutRoomTypeInfoCollection(ArrayList almostSoldOutRoomTypeInfoCollection) {
    this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
  }
  
  public boolean isAirAttachEnabled() { return airAttachEnabled; }
  
  public void setAirAttachEnabled(boolean airAttachEnabled) {
    this.airAttachEnabled = airAttachEnabled;
  }
  
  public String toString() {
    return 
    


      "hotelUrgencyInfo [airAttachRemainingTime=" + airAttachRemainingTime + ", numberOfPeopleViewing=" + numberOfPeopleViewing + ", numberOfPeopleBooked=" + numberOfPeopleBooked + ", numberOfRoomsLeft=" + numberOfRoomsLeft + ", lastBookedTime=" + lastBookedTime + ", almostSoldStatus=" + almostSoldStatus + ", link=" + link + ", almostSoldOutRoomTypeInfoCollection=" + almostSoldOutRoomTypeInfoCollection + ", airAttachEnabled=" + airAttachEnabled + "]";
  }
}