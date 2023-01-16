package com.sample.blog.app.api.ui.healthcheck;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthcheckResponse {
  @JsonProperty
  private String status;

  public HealthcheckResponse() {
    this.status = "ok";
  }
}
