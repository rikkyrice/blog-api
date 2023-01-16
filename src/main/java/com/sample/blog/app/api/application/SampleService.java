package com.sample.blog.app.api.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.sample.blog.app.api.domain.sample.SampleRepository;

import lombok.RequiredArgsConstructor;

@Service
@ApplicationScope
@RequiredArgsConstructor
public class SampleService {
  @Autowired SampleRepository repository;

  public void touch() {
    repository.touch();
  }
}
