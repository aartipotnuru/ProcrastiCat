package com.aartipotnurusapplication.app.modules.timefortyfive.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityTimeFortyfiveBinding
import com.aartipotnurusapplication.app.modules.timefortyfive.`data`.viewmodel.TimeFortyfiveVM
import kotlin.String
import kotlin.Unit

class TimeFortyfiveActivity :
    BaseActivity<ActivityTimeFortyfiveBinding>(R.layout.activity_time_fortyfive) {
  private val viewModel: TimeFortyfiveVM by viewModels<TimeFortyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeFortyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TIME_FORTYFIVE_ACTIVITY"

  }
}
