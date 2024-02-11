package com.aartipotnurusapplication.app.modules.seeschedule.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivitySeeScheduleBinding
import com.aartipotnurusapplication.app.modules.seeschedule.`data`.viewmodel.SeeScheduleVM
import kotlin.String
import kotlin.Unit

class SeeScheduleActivity : BaseActivity<ActivitySeeScheduleBinding>(R.layout.activity_see_schedule)
    {
  private val viewModel: SeeScheduleVM by viewModels<SeeScheduleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seeScheduleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEE_SCHEDULE_ACTIVITY"

  }
}
