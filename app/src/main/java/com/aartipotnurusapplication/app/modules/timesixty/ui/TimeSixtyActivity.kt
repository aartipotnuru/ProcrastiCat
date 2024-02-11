package com.aartipotnurusapplication.app.modules.timesixty.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityTimeSixtyBinding
import com.aartipotnurusapplication.app.modules.timesixty.`data`.viewmodel.TimeSixtyVM
import kotlin.String
import kotlin.Unit

class TimeSixtyActivity : BaseActivity<ActivityTimeSixtyBinding>(R.layout.activity_time_sixty) {
  private val viewModel: TimeSixtyVM by viewModels<TimeSixtyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeSixtyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TIME_SIXTY_ACTIVITY"

  }
}
