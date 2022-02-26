package com.test.pojo;


public class Applicationform {

  private int ApplyID;
  private String UID;
  private int activeID;
  private int w_id;
  private String activeName;
  private String activePicture;
  private String activeNote;
  private int activeNumber;
  private int activeCode;

  public Applicationform(int applyID, String UID, int activeID, int w_id, String activeName, String activePicture, String activeNote, int activeNumber, int activeCode) {
    ApplyID = applyID;
    this.UID = UID;
    this.activeID = activeID;
    this.w_id = w_id;
    this.activeName = activeName;
    this.activePicture = activePicture;
    this.activeNote = activeNote;
    this.activeNumber = activeNumber;
    this.activeCode = activeCode;
  }

  public Applicationform() {
  }

  @Override
  public String toString() {
    return "Applicationform{" +
            "ApplyID=" + ApplyID +
            ", UID='" + UID + '\'' +
            ", activeID=" + activeID +
            ", w_id=" + w_id +
            ", activeName='" + activeName + '\'' +
            ", activePicture='" + activePicture + '\'' +
            ", activeNote='" + activeNote + '\'' +
            ", activeNumber=" + activeNumber +
            ", activeCode=" + activeCode +
            '}';
  }

  public int getApplyID() {
    return ApplyID;
  }

  public void setApplyID(int applyID) {
    ApplyID = applyID;
  }

  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public int getActiveID() {
    return activeID;
  }

  public void setActiveID(int activeID) {
    this.activeID = activeID;
  }

  public int getW_id() {
    return w_id;
  }

  public void setW_id(int w_id) {
    this.w_id = w_id;
  }

  public String getActiveName() {
    return activeName;
  }

  public void setActiveName(String activeName) {
    this.activeName = activeName;
  }

  public String getActivePicture() {
    return activePicture;
  }

  public void setActivePicture(String activePicture) {
    this.activePicture = activePicture;
  }

  public String getActiveNote() {
    return activeNote;
  }

  public void setActiveNote(String activeNote) {
    this.activeNote = activeNote;
  }

  public int getActiveNumber() {
    return activeNumber;
  }

  public void setActiveNumber(int activeNumber) {
    this.activeNumber = activeNumber;
  }

  public int getActiveCode() {
    return activeCode;
  }

  public void setActiveCode(int activeCode) {
    this.activeCode = activeCode;
  }
}
