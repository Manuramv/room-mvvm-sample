package com.example.room_sample_mvvm.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "daily_sleep_quality")
data class SleepNightTable(

    @PrimaryKey(autoGenerate = true)
    val nightId : Long = 0L,

    @ColumnInfo(name = "startTimeMilliSec" )
    val startTimeMilliSec : Long = System.currentTimeMillis(),

    @ColumnInfo(name = "endTimeMilliSec")
    val endTimeMilliSec : Long = System.currentTimeMillis(),

    @ColumnInfo(name = "sleepQuality" )
    val sleepQuality : Int

)
