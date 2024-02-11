package com.aartipotnurusapplication.app.modules.breakoptions.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityBreakOptionsBinding
import com.aartipotnurusapplication.app.modules.breakoptions.`data`.viewmodel.BreakOptionsVM
import kotlin.String
import kotlin.Unit

class BreakOptionsActivity :
    BaseActivity<ActivityBreakOptionsBinding>(R.layout.activity_break_options) {
  private val viewModel: BreakOptionsVM by viewModels<BreakOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.breakOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BREAK_OPTIONS_ACTIVITY"

  }
}
