package com.example.shoplist.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ShopItemDbModel::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {
    abstract fun shopListDao(): Dao
}