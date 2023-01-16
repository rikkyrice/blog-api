package com.sample.blog.app.api.domain.blog;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class Blog {
  @NotNull
  private String id;

  @NotNull
  private String userId;

  @NotNull
  private String title;

  @NotNull
  private String body;

  @NotNull
  private OffsetDateTime postedAt;

  public Blog(String id, String userId, String title, String body, OffsetDateTime postedAt) {
    this.id = id;
    this.userId = userId;
    this.title = title;
    this.body = body;
    this.postedAt = postedAt;
  }
}
