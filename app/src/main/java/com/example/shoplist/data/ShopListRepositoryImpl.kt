package com.example.shoplist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.shoplist.App
import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopListRepository

class ShopListRepositoryImpl: ShopListRepository {

    private val shopListDao = App.shopDataBase.shopListDao()
    private val mapper = ShopListMap()

    override suspend fun addShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override suspend fun editShopItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override suspend fun getShopItem(shopId: Int): ShopItem {
        TODO("Not yet implemented")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        TODO("Not yet implemented")
    }


}