package com.sample.blog.app.api.infrastructure.sample;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.ApplicationScope;
import com.sample.blog.app.api.domain.sample.SampleRepository;
import com.sample.blog.app.api.infrastructure.blog.BlogEntity;

@Repository
@ApplicationScope
public class SampleRepositoryImpl implements SampleRepository {
  @PersistenceContext private EntityManager manager;

  @Override
  public void touch() {
    manager.createQuery("SELECT b FROM BlogEntity b", BlogEntity.class).setMaxResults(1).getSingleResult();
  }
}
