package com.expedia.hotel.mvc;

public class HotelPricingInfo { public HotelPricingInfo() {}
  private double averagePriceValue = 0.0D;
  private double totalPriceValue = 0.0D;
  private double originalPricePerNight = 0.0D;
  private double hotelTotalBaseRate = 0.0D;
  private double hotelTotalTaxesAndFees = 0.0D;
  private String currency = null;
  private double hotelTotalMandatoryTaxesAndFees = 0.0D;
  private double percentSavings = 0.0D;
  private boolean drr = false;
  
  public double getAveragePriceValue() { return averagePriceValue; }
  
  public void setAveragePriceValue(double averagePriceValue) {
    this.averagePriceValue = averagePriceValue;
  }
  
  public double getTotalPriceValue() { return totalPriceValue; }
  
  public void setTotalPriceValue(double totalPriceValue) {
    this.totalPriceValue = totalPriceValue;
  }
  
  public double getOriginalPricePerNight() { return originalPricePerNight; }
  
  public void setOriginalPricePerNight(double originalPricePerNight) {
    this.originalPricePerNight = originalPricePerNight;
  }
  
  public double getHotelTotalBaseRate() { return hotelTotalBaseRate; }
  
  public void setHotelTotalBaseRate(double hotelTotalBaseRate) {
    this.hotelTotalBaseRate = hotelTotalBaseRate;
  }
  
  public double getHotelTotalTaxesAndFees() { return hotelTotalTaxesAndFees; }
  
  public void setHotelTotalTaxesAndFees(double hotelTotalTaxesAndFees) {
    this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
  }
  
  public String getCurrency() { return currency; }
  
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  
  public double getHotelTotalMandatoryTaxesAndFees() { return hotelTotalMandatoryTaxesAndFees; }
  
  public void setHotelTotalMandatoryTaxesAndFees(double hotelTotalMandatoryTaxesAndFees) {
    this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
  }
  
  public double getPercentSavings() { return percentSavings; }
  
  public void setPercentSavings(double percentSavings) {
    this.percentSavings = percentSavings;
  }
  
  public boolean isDrr() { return drr; }
  
  public void setDrr(boolean drr) {
    this.drr = drr;
  }
}