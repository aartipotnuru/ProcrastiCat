package com.aartipotnurusapplication.app.modules.timeoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.timeoptions.`data`.model.TimeOptionsModel
import org.koin.core.KoinComponent

class TimeOptionsVM : ViewModel(), KoinComponent {
  val timeOptionsModel: MutableLiveData<TimeOptionsModel> = MutableLiveData(TimeOptionsModel())

  var navArguments: Bundle? = null
}
