package com.example.room_sample_mvvm.database

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SleepNightTable::class], version = 1)
abstract class SleepDataBase : RoomDatabase() {

    abstract val sleepNightDao : SleepNightDao
    companion object {}

    @Volatile
    private var DATABASE_INSTANCE : SleepDataBase? = null

    fun getInstance(context: Context) : SleepDataBase {
        synchronized(this){
            var insatnce = DATABASE_INSTANCE
            if(insatnce == null){
                insatnce = Room.databaseBuilder(context.applicationContext,SleepDataBase::class.java, "aample_aoom_aatabase" )
                    .fallbackToDestructiveMigration()
                    .build()
                DATABASE_INSTANCE = insatnce;
            }

            return insatnce;
        }

    }

}