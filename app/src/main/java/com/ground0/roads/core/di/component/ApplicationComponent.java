package com.ground0.roads.core.di.component;

import android.content.Context;
import com.ground0.roads.core.components.BaseActivity;
import com.ground0.roads.core.components.BaseApplication;
import com.ground0.roads.core.Event;
import com.ground0.roads.core.di.module.BaseApplicationModule;
import com.ground0.roads.core.di.module.BaseModule;
import com.ground0.roads.core.rx.SubscriptionBuilder;
import com.ground0.repository.repository.UserRepository;
import com.ground0.roads.tripmanager.activity.TripsListActivity;
import dagger.Component;
import javax.inject.Singleton;
import rx.subjects.BehaviorSubject;

/**
 * Created by zer0 on 9/10/16.
 */

@Singleton @Component(modules = { BaseApplicationModule.class, BaseModule.class })
public interface ApplicationComponent {

  void inject(BaseApplication baseApplication);

  void inject(BaseActivity baseActivity);

  void inject(TripsListActivity tripsListActivity);

  //Exposed to sub-graphs.
  Context context();

  // ThreadExecutor threadExecutor();
  // PostExecutionThread postExecutionThread();

  BaseApplication baseApplication();

  BehaviorSubject<Event> systemBehaviorSubject();

  SubscriptionBuilder defaultActivitySubscription();

  UserRepository userRepository();
}
