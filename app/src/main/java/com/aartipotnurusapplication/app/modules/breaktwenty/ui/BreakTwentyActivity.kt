package com.aartipotnurusapplication.app.modules.breaktwenty.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityBreakTwentyBinding
import com.aartipotnurusapplication.app.modules.breaktwenty.`data`.viewmodel.BreakTwentyVM
import kotlin.String
import kotlin.Unit

class BreakTwentyActivity : BaseActivity<ActivityBreakTwentyBinding>(R.layout.activity_break_twenty)
    {
  private val viewModel: BreakTwentyVM by viewModels<BreakTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.breakTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BREAK_TWENTY_ACTIVITY"

  }
}
