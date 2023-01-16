package com.sample.blog.app.api.infrastructure.blog;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "BLOGS")
@NoArgsConstructor
public class BlogEntity {
  @Id
  private String id;

  @Column(name = "TITLE")
  private String title;
  
  @Column(name = "BODY")
  private String body;

  @Column(name = "POSTED_AT")
  private OffsetDateTime postedAt;

  @Column(name = "POSTED_BY")
  private String postedBy;

  public BlogEntity(String id, String postedBy, String title, String body, OffsetDateTime postedAt) {
    this.id = id;
    this.postedBy = postedBy;
    this.title = title;
    this.body = body;
    this.postedAt = postedAt;
  }
}
