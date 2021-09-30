/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */
package id.husni.muyah.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "office_word")
data class Office(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id : Int,

    @ColumnInfo(name = "word")
    var word: String,

    @ColumnInfo(name = "meaning")
    var meaning: String,

    @ColumnInfo(name = "example")
    var example: String,

    @ColumnInfo(name = "example_meaning")
    var exampleMeaning: String
)
