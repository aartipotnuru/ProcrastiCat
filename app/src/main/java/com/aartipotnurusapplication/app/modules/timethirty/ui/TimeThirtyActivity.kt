package com.aartipotnurusapplication.app.modules.timethirty.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityTimeThirtyBinding
import com.aartipotnurusapplication.app.modules.timethirty.`data`.viewmodel.TimeThirtyVM
import kotlin.String
import kotlin.Unit

class TimeThirtyActivity : BaseActivity<ActivityTimeThirtyBinding>(R.layout.activity_time_thirty) {
  private val viewModel: TimeThirtyVM by viewModels<TimeThirtyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeThirtyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TIME_THIRTY_ACTIVITY"

  }
}
