package com.info.nodepad_crud

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.info.nodepad_crud.db.ProductDao

class ProductViewModelFactory(
    private val dao:ProductDao):ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(ProductViewModel::class.java)){
                return ProductViewModel(dao)as T
            }
            throw java.lang.IllegalArgumentException("Unknown view  model Class")
        }
}