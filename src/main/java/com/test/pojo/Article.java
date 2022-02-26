package com.test.pojo;


public class Article {

  private int  article_id;
  private String article_name;
  private String article_picture;
  private String article_part;
  private String article_content;

  public Article() {
  }

  public Article(int  article_id, String article_name, String article_picture, String article_part, String article_content) {
    this.article_id = article_id;
    this.article_name = article_name;
    this.article_picture = article_picture;
    this.article_part = article_part;
    this.article_content = article_content;
  }

  @Override
  public String toString() {
    return "Article{" +
            "article_id=" + article_id +
            ", article_name='" + article_name + '\'' +
            ", article_picture='" + article_picture + '\'' +
            ", article_part='" + article_part + '\'' +
            ", article_content='" + article_content + '\'' +
            '}';
  }

  public int  getArticle_id() {
    return article_id;
  }

  public void setArticle_id(int  article_id) {
    this.article_id = article_id;
  }

  public String getArticle_name() {
    return article_name;
  }

  public void setArticle_name(String article_name) {
    this.article_name = article_name;
  }

  public String getArticle_picture() {
    return article_picture;
  }

  public void setArticle_picture(String article_picture) {
    this.article_picture = article_picture;
  }

  public String getArticle_part() {
    return article_part;
  }

  public void setArticle_part(String article_part) {
    this.article_part = article_part;
  }

  public String getArticle_content() {
    return article_content;
  }

  public void setArticle_content(String article_content) {
    this.article_content = article_content;
  }
}
