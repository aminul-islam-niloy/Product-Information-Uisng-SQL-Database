package com.info.nodepad_crud.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product_data_table")
data class Product (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="product_Id")
    var id:Int,
    @ColumnInfo(name="product_Name")
    var name:String,
    @ColumnInfo(name="product_Description")
    var Description:String
        )

