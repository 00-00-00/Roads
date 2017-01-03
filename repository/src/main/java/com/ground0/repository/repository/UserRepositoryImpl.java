package com.ground0.repository.repository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by zer0 on 20/10/16.
 */
@Singleton public class UserRepositoryImpl implements UserRepository {

  @Inject public UserRepositoryImpl() {
  }

  @Inject @Named("cloudStore") UserRepository cloudDataStore;
}
