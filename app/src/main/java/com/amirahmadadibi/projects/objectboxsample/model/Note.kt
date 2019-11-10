package com.amirahmadadibi.projects.objectboxsample.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id
import java.util.*

/**
 * Created by Amirahmad Adibi.
 * ObjectBoxSample | Copyrights 2019-11-10.
 */

@Entity
data class Note (
    @Id var id: Long = 0,
    var titile: String?,
    var longDescription: String?,
    var updatedAt:Date = Calendar.getInstance().time
)