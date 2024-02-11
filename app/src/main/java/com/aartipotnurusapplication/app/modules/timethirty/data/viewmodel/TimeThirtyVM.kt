package com.aartipotnurusapplication.app.modules.timethirty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.timethirty.`data`.model.TimeThirtyModel
import org.koin.core.KoinComponent

class TimeThirtyVM : ViewModel(), KoinComponent {
  val timeThirtyModel: MutableLiveData<TimeThirtyModel> = MutableLiveData(TimeThirtyModel())

  var navArguments: Bundle? = null
}
