package com.expedia.hotel.mvc;

public class HotelScores { public HotelScores() {}
  private double rawAppealScore = 0.0D;
  private double movingAverageScore = 0.0D;
  
  public double getMovingAverageScore() { return movingAverageScore; }
  
  public void setMovingAverageScore(double movingAverageScore) {
    this.movingAverageScore = movingAverageScore;
  }
}