package com.test.pojo;


public class Slideshow {

  private int photoId;
  private String photofile;
  private String pType;

  public Slideshow(int photoId, String photofile, String pType) {
    this.photoId = photoId;
    this.photofile = photofile;
    this.pType = pType;
  }

  public Slideshow() {
  }

  @Override
  public String toString() {
    return "Slideshow{" +
            "photoId=" + photoId +
            ", photofile='" + photofile + '\'' +
            ", pType='" + pType + '\'' +
            '}';
  }

  public int getPhotoId() {
    return photoId;
  }

  public void setPhotoId(int photoId) {
    this.photoId = photoId;
  }


  public String getPhotofile() {
    return photofile;
  }

  public void setPhotofile(String photofile) {
    this.photofile = photofile;
  }


  public String getPType() {
    return pType;
  }

  public void setPType(String pType) {
    this.pType = pType;
  }

}
