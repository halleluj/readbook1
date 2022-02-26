package com.test.pojo;


public class Togetherwork {

  private int ID;
  private int togetherId;
  private String UID;
  private String togetherContent;
  private String togetherMap;
  private int tCode;

  public Togetherwork(int ID, int togetherId, String UID, String togetherContent, String togetherMap, int tCode) {
    this.ID = ID;
    this.togetherId = togetherId;
    this.UID = UID;
    this.togetherContent = togetherContent;
    this.togetherMap = togetherMap;
    this.tCode = tCode;
  }

  public Togetherwork() {
  }

  @Override
  public String toString() {
    return "Togetherwork{" +
            "ID=" + ID +
            ", togetherId=" + togetherId +
            ", UID='" + UID + '\'' +
            ", togetherContent='" + togetherContent + '\'' +
            ", togetherMap='" + togetherMap + '\'' +
            ", tCode=" + tCode +
            '}';
  }

  public int gettCode() {
    return tCode;
  }

  public void settCode(int tCode) {
    this.tCode = tCode;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }


  public int getTogetherId() {
    return togetherId;
  }

  public void setTogetherId(int togetherId) {
    this.togetherId = togetherId;
  }


  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public String getTogetherContent() {
    return togetherContent;
  }

  public void setTogetherContent(String togetherContent) {
    this.togetherContent = togetherContent;
  }


  public String getTogetherMap() {
    return togetherMap;
  }

  public void setTogetherMap(String togetherMap) {
    this.togetherMap = togetherMap;
  }

}
