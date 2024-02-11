package com.aartipotnurusapplication.app.modules.homepage.ui

import androidx.activity.viewModels
import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.base.BaseActivity
import com.aartipotnurusapplication.app.databinding.ActivityHomepageBinding
import com.aartipotnurusapplication.app.modules.homepage.`data`.viewmodel.HomepageVM
import kotlin.String
import kotlin.Unit

class HomepageActivity : BaseActivity<ActivityHomepageBinding>(R.layout.activity_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOMEPAGE_ACTIVITY"

  }
}
