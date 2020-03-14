package com.example.models.response;

public class History {

  private User user;
  private String version;
  private String committedAt;
  private ChangeStatus changeStatus;
  private String url;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public History withUser(User user) {
    this.user = user;
    return this;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public History withVersion(String version) {
    this.version = version;
    return this;
  }

  public String getCommittedAt() {
    return committedAt;
  }

  public void setCommittedAt(String committedAt) {
    this.committedAt = committedAt;
  }

  public History withCommittedAt(String committedAt) {
    this.committedAt = committedAt;
    return this;
  }

  public ChangeStatus getChangeStatus() {
    return changeStatus;
  }

  public void setChangeStatus(ChangeStatus changeStatus) {
    this.changeStatus = changeStatus;
  }

  public History withChangeStatus(ChangeStatus changeStatus) {
    this.changeStatus = changeStatus;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public History withUrl(String url) {
    this.url = url;
    return this;
  }
}
