package com.test.pojo;


public class Togethertopic {

  private int  togetherId;
  private String togetherName;
  private String togetherGlance;
  private String togetherFire;
  private String togetherType;
  private String togetherPicture;

  public Togethertopic() {
  }

  public Togethertopic(int  togetherId, String togetherName, String togetherGlance, String togetherFire, String togetherType, String togetherPicture) {
    this.togetherId = togetherId;
    this.togetherName = togetherName;
    this.togetherGlance = togetherGlance;
    this.togetherFire = togetherFire;
    this.togetherType = togetherType;
    this.togetherPicture = togetherPicture;
  }

  @Override
  public String toString() {
    return "Togethertopic{" +
            "togetherId=" + togetherId +
            ", togetherName='" + togetherName + '\'' +
            ", togetherGlance='" + togetherGlance + '\'' +
            ", togetherFire='" + togetherFire + '\'' +
            ", togetherType='" + togetherType + '\'' +
            ", togetherPicture='" + togetherPicture + '\'' +
            '}';
  }

  public int getTogetherId() {
    return togetherId;
  }

  public void setTogetherId(int togetherId) {
    this.togetherId = togetherId;
  }


  public String getTogetherName() {
    return togetherName;
  }

  public void setTogetherName(String togetherName) {
    this.togetherName = togetherName;
  }


  public String getTogetherGlance() {
    return togetherGlance;
  }

  public void setTogetherGlance(String togetherGlance) {
    this.togetherGlance = togetherGlance;
  }


  public String getTogetherFire() {
    return togetherFire;
  }

  public void setTogetherFire(String togetherFire) {
    this.togetherFire = togetherFire;
  }


  public String getTogetherType() {
    return togetherType;
  }

  public void setTogetherType(String togetherType) {
    this.togetherType = togetherType;
  }


  public String getTogetherPicture() {
    return togetherPicture;
  }

  public void setTogetherPicture(String togetherPicture) {
    this.togetherPicture = togetherPicture;
  }

}
