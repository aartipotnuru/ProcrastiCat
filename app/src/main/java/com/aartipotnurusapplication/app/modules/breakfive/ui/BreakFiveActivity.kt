package com.aartipotnurusapplication.app.modules.breakfive.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityBreakFiveBinding
import com.aartipotnurusapplication.app.modules.breakfive.`data`.viewmodel.BreakFiveVM
import kotlin.String
import kotlin.Unit

class BreakFiveActivity : BaseActivity<ActivityBreakFiveBinding>(R.layout.activity_break_five) {
  private val viewModel: BreakFiveVM by viewModels<BreakFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.breakFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BREAK_FIVE_ACTIVITY"

  }
}
