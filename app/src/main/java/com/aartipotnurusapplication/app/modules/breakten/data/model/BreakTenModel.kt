package com.aartipotnurusapplication.app.modules.breakten.`data`.model

import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BreakTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProcrastiCat: String? = MyApp.getInstance().resources.getString(R.string.lbl_procrasticat)

)
