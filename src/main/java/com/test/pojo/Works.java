package com.test.pojo;

public class Works {
   private int w_id;
   private String UID;
   private String text_content;
   private String w_data;
   private int wCode;

   public Works() {
   }

   public Works(int w_id, String UID, String text_content, String w_data, int wCode) {
      this.w_id = w_id;
      this.UID = UID;
      this.text_content = text_content;
      this.w_data = w_data;
      this.wCode = wCode;
   }

   @Override
   public String toString() {
      return "Works{" +
              "w_id=" + w_id +
              ", UID='" + UID + '\'' +
              ", text_content='" + text_content + '\'' +
              ", w_data='" + w_data + '\'' +
              ", wCode=" + wCode +
              '}';
   }

   public int getwCode() {
      return wCode;
   }

   public void setwCode(int wCode) {
      this.wCode = wCode;
   }

   public int getW_id() {
      return w_id;
   }

   public void setW_id(int w_id) {
      this.w_id = w_id;
   }

   public String getUID() {
      return UID;
   }

   public void setUID(String UID) {
      this.UID = UID;
   }

   public String getText_content() {
      return text_content;
   }

   public void setText_content(String text_content) {
      this.text_content = text_content;
   }

   public String getW_data() {
      return w_data;
   }

   public void setW_data(String w_data) {
      this.w_data = w_data;
   }
}
