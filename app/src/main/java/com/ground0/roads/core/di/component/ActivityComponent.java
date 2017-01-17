package com.ground0.roads.core.di.component;

/**
 * Created by zer0 on 9/10/16.
 */

import com.ground0.roads.core.di.PerActivity;
import com.ground0.roads.core.di.module.BaseActivityModule;
import com.ground0.roads.core.di.module.BaseApplicationModule;
import dagger.Component;

@PerActivity @Component(dependencies = ApplicationComponent.class, modules = {
    BaseActivityModule.class
}) public interface ActivityComponent {

}