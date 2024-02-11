package com.aartipotnurusapplication.app.modules.seeschedule.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.seeschedule.`data`.model.SeeScheduleModel
import org.koin.core.KoinComponent

class SeeScheduleVM : ViewModel(), KoinComponent {
  val seeScheduleModel: MutableLiveData<SeeScheduleModel> = MutableLiveData(SeeScheduleModel())

  var navArguments: Bundle? = null
}
