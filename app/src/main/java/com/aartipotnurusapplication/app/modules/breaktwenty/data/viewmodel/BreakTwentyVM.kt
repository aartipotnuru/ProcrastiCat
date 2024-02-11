package com.aartipotnurusapplication.app.modules.breaktwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.breaktwenty.`data`.model.BreakTwentyModel
import org.koin.core.KoinComponent

class BreakTwentyVM : ViewModel(), KoinComponent {
  val breakTwentyModel: MutableLiveData<BreakTwentyModel> = MutableLiveData(BreakTwentyModel())

  var navArguments: Bundle? = null
}
