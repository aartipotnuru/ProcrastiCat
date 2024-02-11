package com.aartipotnurusapplication.app.modules.timetwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.timetwenty.`data`.model.TimeTwentyModel
import org.koin.core.KoinComponent

class TimeTwentyVM : ViewModel(), KoinComponent {
  val timeTwentyModel: MutableLiveData<TimeTwentyModel> = MutableLiveData(TimeTwentyModel())

  var navArguments: Bundle? = null
}
