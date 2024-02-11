package com.aartipotnurusapplication.app.modules.breakoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.breakoptions.`data`.model.BreakOptionsModel
import org.koin.core.KoinComponent

class BreakOptionsVM : ViewModel(), KoinComponent {
  val breakOptionsModel: MutableLiveData<BreakOptionsModel> = MutableLiveData(BreakOptionsModel())

  var navArguments: Bundle? = null
}
