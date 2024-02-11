package com.aartipotnurusapplication.app.modules.breakten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.breakten.`data`.model.BreakTenModel
import org.koin.core.KoinComponent

class BreakTenVM : ViewModel(), KoinComponent {
  val breakTenModel: MutableLiveData<BreakTenModel> = MutableLiveData(BreakTenModel())

  var navArguments: Bundle? = null
}
