package com.amirahmadadibi.projects.objectboxsample

import android.app.Application
import com.amirahmadadibi.projects.objectboxsample.database.ObjectBox

/**
 * Created by Amirahmad Adibi.
 * ObjectBoxSample | Copyrights 2019-11-10.
 */
class Configuration:Application() {
    override fun onCreate() {
        super.onCreate()
        ObjectBox.init(this)
    }
}