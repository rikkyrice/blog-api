package com.sample.blog.app.api.domain.user;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class User {
  @NotNull
  private String id;

  @NotNull
  private String email;

  @NotNull
  private String password;

  @NotNull
  private OffsetDateTime createdAt;

  public User(String id, String email, String password, OffsetDateTime createdAt) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.createdAt = createdAt;
  }  
}
