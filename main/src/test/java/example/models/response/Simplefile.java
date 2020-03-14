package example.models.response;

public class Simplefile {

  private String filename;
  private String type;
  private Object language;
  private String rawUrl;
  private Integer size;
  private Boolean truncated;
  private String content;

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public Simplefile withFilename(String filename) {
    this.filename = filename;
    return this;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Simplefile withType(String type) {
    this.type = type;
    return this;
  }

  public Object getLanguage() {
    return language;
  }

  public void setLanguage(Object language) {
    this.language = language;
  }

  public Simplefile withLanguage(Object language) {
    this.language = language;
    return this;
  }

  public String getRawUrl() {
    return rawUrl;
  }

  public void setRawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
  }

  public Simplefile withRawUrl(String rawUrl) {
    this.rawUrl = rawUrl;
    return this;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Simplefile withSize(Integer size) {
    this.size = size;
    return this;
  }

  public Boolean getTruncated() {
    return truncated;
  }

  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  public Simplefile withTruncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }

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
