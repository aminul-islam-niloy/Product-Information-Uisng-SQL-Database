package com.info.nodepad_crud.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class ProductDatabase:RoomDatabase() {

    abstract  fun productDao():ProductDao
    companion object{
        @Volatile
        private var INISTANCE :ProductDatabase?=null
        fun getInstance(context:Context):ProductDatabase{
            synchronized(this){
                var instance= INISTANCE
                if(instance==null){
                    instance= Room.databaseBuilder(
                        context.applicationContext,
                        ProductDatabase::class.java,
                        "product_data_database"
                    ).build()

                }
                return instance
            }
        }
    }
}