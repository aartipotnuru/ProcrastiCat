package com.aartipotnurusapplication.app.modules.timeoptions.`data`.model

import com.aartipotnurusapplication.app.R
import com.aartipotnurusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TimeOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProcrastiCat: String? = MyApp.getInstance().resources.getString(R.string.lbl_procrasticat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStudyTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_study_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_45_minutes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_minutes)

)
