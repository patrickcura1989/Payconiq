package com.example.models.response;

public class ChangeStatus {

  private Integer total;
  private Integer additions;
  private Integer deletions;

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public ChangeStatus withTotal(Integer total) {
    this.total = total;
    return this;
  }

  public Integer getAdditions() {
    return additions;
  }

  public void setAdditions(Integer additions) {
    this.additions = additions;
  }

  public ChangeStatus withAdditions(Integer additions) {
    this.additions = additions;
    return this;
  }

  public Integer getDeletions() {
    return deletions;
  }

  public void setDeletions(Integer deletions) {
    this.deletions = deletions;
  }

  public ChangeStatus withDeletions(Integer deletions) {
    this.deletions = deletions;
    return this;
  }
}
