package com.aartipotnurusapplication.app.modules.timefortyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.timefortyfive.`data`.model.TimeFortyfiveModel
import org.koin.core.KoinComponent

class TimeFortyfiveVM : ViewModel(), KoinComponent {
  val timeFortyfiveModel: MutableLiveData<TimeFortyfiveModel> =
      MutableLiveData(TimeFortyfiveModel())

  var navArguments: Bundle? = null
}
