/*
 * Copyright © 2017-2019 Harvard Pilgrim Health Care Institute (HPHCI) and its Contributors.
 * Copyright 2020-2021 Google LLC
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * Funding Source: Food and Drug Administration (“Funding Agency”) effective 18 September 2014 as Contract no. HHSF22320140030I/HHSF22301006T (the “Prime Contract”).
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.harvard.usermodule.webservicemodel;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Studies extends RealmObject {
  @PrimaryKey private String studyId;

  private String status;

  private String siteId;

  private String enrolledDate;

  private String participantId;

  private int completion;

  private int adherence;

  private String version;

  private String hashedToken;

  private String userStudyVersion;

  private String dataSharingPermission;

  public String getHashedToken() {
    return hashedToken;
  }

  public void setHashedToken(String hashedToken) {
    this.hashedToken = hashedToken;
  }

  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public int getCompletion() {
    return completion;
  }

  public void setCompletion(int completion) {
    this.completion = completion;
  }

  public int getAdherence() {
    return adherence;
  }

  public void setAdherence(int adherence) {
    this.adherence = adherence;
  }

  public String getParticipantId() {
    return participantId;
  }

  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  public String getStudyId() {
    return studyId;
  }

  public void setStudyId(String studyId) {
    this.studyId = studyId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getEnrolledDate() {
    return enrolledDate;
  }

  public void setEnrolledDate(String enrolledDate) {
    this.enrolledDate = enrolledDate;
  }

  public String getUserStudyVersion() {
    return userStudyVersion;
  }

  public void setUserStudyVersion(String userStudyVersion) {
    this.userStudyVersion = userStudyVersion;
  }

  public String getDataSharingPermission() {
    return dataSharingPermission;
  }

  public void setDataSharingPermission(String dataSharingPermission) {
    this.dataSharingPermission = dataSharingPermission;
  }
}
