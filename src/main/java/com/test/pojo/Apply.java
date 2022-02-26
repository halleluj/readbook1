package com.test.pojo;


public class Apply {

  private String UID;
  private int activeID;
  private int w_id;
  private int ApplyID;


  public Apply(String UID, int activeID, int w_id, int applyID) {
    this.UID = UID;
    this.activeID = activeID;
    this.w_id = w_id;
    ApplyID = applyID;
  }

  public Apply() {
  }

  @Override
  public String toString() {
    return "Apply{" +
            "UID='" + UID + '\'' +
            ", activeID=" + activeID +
            ", w_id=" + w_id +
            ", ApplyID=" + ApplyID +
            '}';
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

  public int getApplyID() {
    return ApplyID;
  }

  public void setApplyID(int applyID) {
    ApplyID = applyID;
  }
}
