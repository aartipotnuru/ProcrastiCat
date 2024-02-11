package com.aartipotnurusapplication.app.modules.breakfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aartipotnurusapplication.app.modules.breakfifteen.`data`.model.BreakFifteenModel
import org.koin.core.KoinComponent

class BreakFifteenVM : ViewModel(), KoinComponent {
  val breakFifteenModel: MutableLiveData<BreakFifteenModel> = MutableLiveData(BreakFifteenModel())

  var navArguments: Bundle? = null
}
