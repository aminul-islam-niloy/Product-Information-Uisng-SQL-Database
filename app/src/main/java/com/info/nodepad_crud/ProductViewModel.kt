package com.info.nodepad_crud

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.info.nodepad_crud.db.Product
import com.info.nodepad_crud.db.ProductDao
import kotlinx.coroutines.launch

class ProductViewModel(private val dao: ProductDao):ViewModel() {

    val students= dao.getAllProducts()
    fun insertProduct(product: Product)=viewModelScope.launch {
        dao.insertProduct(product)
    }

    fun updateProduct(product: Product)=viewModelScope.launch {
        dao.updateProduct(product)
    }
    fun deleteProduct(product: Product)=viewModelScope.launch {
        dao.deleteProduct(product)
    }
}