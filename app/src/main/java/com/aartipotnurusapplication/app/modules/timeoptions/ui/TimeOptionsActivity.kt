package com.aartipotnurusapplication.app.modules.timeoptions.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityTimeOptionsBinding
import com.aartipotnurusapplication.app.modules.timeoptions.`data`.viewmodel.TimeOptionsVM
import kotlin.String
import kotlin.Unit

class TimeOptionsActivity : BaseActivity<ActivityTimeOptionsBinding>(R.layout.activity_time_options)
    {
  private val viewModel: TimeOptionsVM by viewModels<TimeOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.timeOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TIME_OPTIONS_ACTIVITY"

  }
}
