package com.aartipotnurusapplication.app.modules.breakten.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityBreakTenBinding
import com.aartipotnurusapplication.app.modules.breakten.`data`.viewmodel.BreakTenVM
import kotlin.String
import kotlin.Unit

class BreakTenActivity : BaseActivity<ActivityBreakTenBinding>(R.layout.activity_break_ten) {
  private val viewModel: BreakTenVM by viewModels<BreakTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.breakTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BREAK_TEN_ACTIVITY"

  }
}
