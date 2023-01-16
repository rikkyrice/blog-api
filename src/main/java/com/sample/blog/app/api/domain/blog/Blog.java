package com.sample.blog.app.api.domain.blog;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotNull;

import com.sample.blog.app.api.domain.user.User;

import lombok.Getter;

@Getter
public class Blog {
  @NotNull
  private String id;

  @NotNull
  private String title;

  @NotNull
  private String body;

  @NotNull
  private OffsetDateTime postedAt;

  @NotNull
  private User postedBy;

  public Blog(String id, User postedBy, String title, String body, OffsetDateTime postedAt) {
    this.id = id;
    this.postedBy = postedBy;
    this.title = title;
    this.body = body;
    this.postedAt = postedAt;
  }
}
