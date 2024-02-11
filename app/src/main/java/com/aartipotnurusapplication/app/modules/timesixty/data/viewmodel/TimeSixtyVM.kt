package com.aartipotnurusapplication.app.modules.timesixty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.timesixty.`data`.model.TimeSixtyModel
import org.koin.core.KoinComponent

class TimeSixtyVM : ViewModel(), KoinComponent {
  val timeSixtyModel: MutableLiveData<TimeSixtyModel> = MutableLiveData(TimeSixtyModel())

  var navArguments: Bundle? = null
}
