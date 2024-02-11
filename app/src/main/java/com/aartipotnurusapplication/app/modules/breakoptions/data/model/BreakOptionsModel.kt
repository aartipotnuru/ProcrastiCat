package com.aartipotnurusapplication.app.modules.breakoptions.`data`.model

import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BreakOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProcrastiCat: String? = MyApp.getInstance().resources.getString(R.string.lbl_procrasticat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_minutes)

)
