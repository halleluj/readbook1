package com.test.pojo;


public class Commentuser {

  private String UID;
  private int togetherId;
  private int article_id;
  private int commentId;
  private String commentNote;
  private String username;
  private String headpicture;

  public Commentuser(String UID, int togetherId, int article_id, int commentId, String commentNote, String username, String headpicture) {
    this.UID = UID;
    this.togetherId = togetherId;
    this.article_id = article_id;
    this.commentId = commentId;
    this.commentNote = commentNote;
    this.username = username;
    this.headpicture = headpicture;
  }

  @Override
  public String toString() {
    return "Commentuser{" +
            "UID='" + UID + '\'' +
            ", togetherId=" + togetherId +
            ", article_id=" + article_id +
            ", commentId=" + commentId +
            ", commentNote='" + commentNote + '\'' +
            ", username='" + username + '\'' +
            ", headpicture='" + headpicture + '\'' +
            '}';
  }

  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public int getTogetherId() {
    return togetherId;
  }

  public void setTogetherId(int togetherId) {
    this.togetherId = togetherId;
  }

  public int getArticle_id() {
    return article_id;
  }

  public void setArticle_id(int article_id) {
    this.article_id = article_id;
  }

  public int getCommentId() {
    return commentId;
  }

  public void setCommentId(int commentId) {
    this.commentId = commentId;
  }

  public String getCommentNote() {
    return commentNote;
  }

  public void setCommentNote(String commentNote) {
    this.commentNote = commentNote;
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
