package com.test.pojo;


public class Tworklinkuser {

  private int ID;
  private int togetherId;
  private String UID;
  private String togetherContent;
  private String togetherMap;
  private int tCode;
  private String username;
  private String headpicture;

  public Tworklinkuser(int ID, int togetherId, String UID, String togetherContent, String togetherMap, int tCode, String username, String headpicture) {
    this.ID = ID;
    this.togetherId = togetherId;
    this.UID = UID;
    this.togetherContent = togetherContent;
    this.togetherMap = togetherMap;
    this.tCode = tCode;
    this.username = username;
    this.headpicture = headpicture;
  }

  public Tworklinkuser() {
  }

  @Override
  public String toString() {
    return "Tworklinkuser{" +
            "ID=" + ID +
            ", togetherId=" + togetherId +
            ", UID='" + UID + '\'' +
            ", togetherContent='" + togetherContent + '\'' +
            ", togetherMap='" + togetherMap + '\'' +
            ", tCode=" + tCode +
            ", username='" + username + '\'' +
            ", headpicture='" + headpicture + '\'' +
            '}';
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

  public int gettCode() {
    return tCode;
  }

  public void settCode(int tCode) {
    this.tCode = tCode;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getHeadpicture() {
    return headpicture;
  }

  public void setHeadpicture(String headpicture) {
    this.headpicture = headpicture;
  }
}
