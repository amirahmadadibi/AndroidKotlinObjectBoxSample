package com.amirahmadadibi.projects.objectboxsample.database

import android.content.Context
import com.amirahmadadibi.projects.objectboxsample.model.MyObjectBox
import io.objectbox.BoxStore

/**
 * Created by Amirahmad Adibi.
 * ObjectBoxSample | Copyrights 2019-11-10.
 */

object ObjectBox {

    lateinit var boxStore: BoxStore
        private set

    fun init(context: Context) {
        boxStore = MyObjectBox.builder().androidContext(context.applicationContext).build()
    }
}