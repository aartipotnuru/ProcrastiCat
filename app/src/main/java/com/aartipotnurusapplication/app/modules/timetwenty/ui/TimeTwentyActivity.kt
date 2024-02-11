package com.aartipotnurusapplication.app.modules.timetwenty.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityTimeTwentyBinding
import com.aartipotnurusapplication.app.modules.timetwenty.`data`.viewmodel.TimeTwentyVM
import kotlin.String
import kotlin.Unit

class TimeTwentyActivity : BaseActivity<ActivityTimeTwentyBinding>(R.layout.activity_time_twenty) {
  private val viewModel: TimeTwentyVM by viewModels<TimeTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TIME_TWENTY_ACTIVITY"

  }
}
