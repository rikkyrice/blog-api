package com.sample.blog.app.api.ui.healthcheck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.blog.app.api.application.SampleService;

@RestController
@RequestMapping("healthcheck")
public class HealthcheckResource {
  @Autowired SampleService service;
  
  @GetMapping(
    value = "app/status",
    produces = {"application/json"})
  public ResponseEntity<HealthcheckResponse> getAppStatus() {
    return new ResponseEntity<HealthcheckResponse>(new HealthcheckResponse(), HttpStatus.OK);
  }

  @GetMapping(
    value = "db/status",
    produces = {"application/json"})
  public ResponseEntity<HealthcheckResponse> getDBStatus() {
    service.touch();
    return new ResponseEntity<HealthcheckResponse>(new HealthcheckResponse(), HttpStatus.OK);
  }
}
