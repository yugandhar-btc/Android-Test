package com.harvard.studyappmodule.studymodel;

import io.realm.RealmObject;

public class ConsentData extends RealmObject {
  private String content;

  private String type;

  private String version;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

}
