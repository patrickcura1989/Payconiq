package com.example.models.post;

public class PostGist {

  private String description;
  private Boolean _public;
  private Files files;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostGist withDescription(String description) {
    this.description = description;
    return this;
  }

  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public PostGist withPublic(Boolean _public) {
    this._public = _public;
    return this;
  }

  public Files getFiles() {
    return files;
  }

  public void setFiles(Files files) {
    this.files = files;
  }

  public PostGist withFiles(Files files) {
    this.files = files;
    return this;
  }
}
