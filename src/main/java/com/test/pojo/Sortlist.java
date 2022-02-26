package com.test.pojo;


public class Sortlist {

  private String sort_name;
  private int sort_id;
  private String sort_content;
  private String sort_picture;
  private String sorthing;
  private String sort_introduce;

  public Sortlist(String sort_name, int sort_id, String sort_content, String sort_picture, String sorthing, String sort_introduce) {
    this.sort_name = sort_name;
    this.sort_id = sort_id;
    this.sort_content = sort_content;
    this.sort_picture = sort_picture;
    this.sorthing = sorthing;
    this.sort_introduce = sort_introduce;
  }

  public Sortlist() {
  }

  @Override
  public String toString() {
    return "Sortlist{" +
            "sort_name='" + sort_name + '\'' +
            ", sort_id=" + sort_id +
            ", sort_content='" + sort_content + '\'' +
            ", sort_picture='" + sort_picture + '\'' +
            ", sorthing='" + sorthing + '\'' +
            ", sort_introduce='" + sort_introduce + '\'' +
            '}';
  }

  public String getSort_introduce() {
    return sort_introduce;
  }

  public void setSort_introduce(String sort_introduce) {
    this.sort_introduce = sort_introduce;
  }

  public String getSort_name() {
    return sort_name;
  }

  public void setSort_name(String sort_name) {
    this.sort_name = sort_name;
  }

  public int  getSort_id() {
    return sort_id;
  }

  public void setSort_id(int sort_id) {
    this.sort_id = sort_id;
  }

  public String getSort_content() {
    return sort_content;
  }

  public void setSort_content(String sort_content) {
    this.sort_content = sort_content;
  }

  public String getSort_picture() {
    return sort_picture;
  }

  public void setSort_picture(String sort_picture) {
    this.sort_picture = sort_picture;
  }

  public String getSorthing() {
    return sorthing;
  }

  public void setSorthing(String sorthing) {
    this.sorthing = sorthing;
  }

}
