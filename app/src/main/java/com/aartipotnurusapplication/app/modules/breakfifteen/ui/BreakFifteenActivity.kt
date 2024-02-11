package com.aartipotnurusapplication.app.modules.breakfifteen.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityBreakFifteenBinding
import com.aartipotnurusapplication.app.modules.breakfifteen.`data`.viewmodel.BreakFifteenVM
import kotlin.String
import kotlin.Unit

class BreakFifteenActivity :
    BaseActivity<ActivityBreakFifteenBinding>(R.layout.activity_break_fifteen) {
  private val viewModel: BreakFifteenVM by viewModels<BreakFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.breakFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BREAK_FIFTEEN_ACTIVITY"

  }
}
