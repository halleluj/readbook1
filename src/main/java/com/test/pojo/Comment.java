package com.test.pojo;


public class Comment {

  private int commentId;
  private int article_id;
  private int togetherId;
  private String UID;
  private String commentNote;

  public Comment(int commentId, int article_id, int togetherId, String UID, String commentNote) {
    this.commentId = commentId;
    this.article_id = article_id;
    this.togetherId = togetherId;
    this.UID = UID;
    this.commentNote = commentNote;
  }

  @Override
  public String toString() {
    return "Comment{" +
            "commentId=" + commentId +
            ", article_id=" + article_id +
            ", togetherId=" + togetherId +
            ", UID='" + UID + '\'' +
            ", commentNote='" + commentNote + '\'' +
            '}';
  }

  public int getCommentId() {
    return commentId;
  }

  public void setCommentId(int commentId) {
    this.commentId = commentId;
  }

  public int getArticle_id() {
    return article_id;
  }

  public void setArticle_id(int article_id) {
    this.article_id = article_id;
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

  public String getCommentNote() {
    return commentNote;
  }

  public void setCommentNote(String commentNote) {
    this.commentNote = commentNote;
  }
}
