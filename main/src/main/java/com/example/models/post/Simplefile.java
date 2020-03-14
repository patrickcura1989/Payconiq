package com.example.models.post;

public class Simplefile {

  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Simplefile withContent(String content) {
    this.content = content;
    return this;
  }
}
