package com.example.room_sample_mvvm.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SleepNightDao {

    @Insert
    fun insertNight(night: SleepNightTable)

    @Delete
    fun deleteNight(night: SleepNightTable)

    @Query("SELECT * FROM  daily_sleep_quality")
    fun getAllNights() : LiveData<List<SleepNightTable>>



}