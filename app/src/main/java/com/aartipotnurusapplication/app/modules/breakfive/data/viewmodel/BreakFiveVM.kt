package com.aartipotnurusapplication.app.modules.breakfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.breakfive.`data`.model.BreakFiveModel
import org.koin.core.KoinComponent

class BreakFiveVM : ViewModel(), KoinComponent {
  val breakFiveModel: MutableLiveData<BreakFiveModel> = MutableLiveData(BreakFiveModel())

  var navArguments: Bundle? = null
}
