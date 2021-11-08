package com.second.guara.entity;

public class Message {
   private String content;
   private User fromUser;
   private User toUser;

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public User getFromUser() {
      return fromUser;
   }

   public void setFromUser(User fromUser) {
      this.fromUser = fromUser;
   }

   public User getToUser() {
      return toUser;
   }

   public void setToUser(User toUser) {
      this.toUser = toUser;
   }

   public Message(String content, User fromUser, User toUser) {
      this.content = content;
      this.fromUser = fromUser;
      this.toUser = toUser;
   }

}
