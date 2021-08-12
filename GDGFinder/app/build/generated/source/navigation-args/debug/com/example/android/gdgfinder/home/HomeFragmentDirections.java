package com.example.android.gdgfinder.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.gdgfinder.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToGdgListFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_gdgListFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAddGdgFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_addGdgFragment);
  }
}
