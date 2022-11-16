package com.info.nodepad_crud.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDao {
    @Insert
    suspend fun insertProduct(product: Product)
    @Update
    suspend fun updateProduct(product: Product)
    @Delete
    suspend fun deleteProduct(product: Product)
    @Query("SELECT * FROM Product_data_table")
    fun getAllProducts():LiveData<List<Product>>
}