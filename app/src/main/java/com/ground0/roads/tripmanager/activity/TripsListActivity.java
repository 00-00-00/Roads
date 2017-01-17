package com.ground0.roads.tripmanager.activity;

import com.ground0.roads.core.components.BaseActivity;
import com.ground0.roads.tripmanager.viewmodel.TripsListActivityViewModel;
import javax.inject.Inject;

/**
 * Created by zer0 on 17/1/17.
 */

public class TripsListActivity extends BaseActivity {

  @Inject TripsListActivityViewModel viewModel;

  @Override protected void registerActivityWithViewModel() {
    viewModel.registerActivity(this);
  }

  @Override protected void initializeModuleComponent() {
    getApplicationComponent().inject(this);
  }
}
