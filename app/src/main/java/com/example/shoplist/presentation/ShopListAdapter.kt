package com.example.shoplist.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoplist.R
import com.example.shoplist.domain.ShopItem

class ShopListAdapter: androidx.recyclerview.widget.ListAdapter
<ShopItem, ShopListAdapter.ShopItemViewHolder>(ShopItemCallBack()) {

    var counter = 0
    var onShopClickListener: ((ShopItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        Log.e("TAG", "onCreateViewHolder: ${counter++}", )
        val layout = when (viewType){
            VIEW_TYPE_ENABLE -> R.layout.enable_shop
            VIEW_TYPE_DISABLE -> R.layout.disable_shop
            else -> throw RuntimeException("Unknown view type: $viewType")
        }
        return ShopItemViewHolder(
            LayoutInflater.from(parent.context).inflate(layout, parent,false))
    }

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        holder.onBind(getItem(position))
        holder.itemView.setOnClickListener {
            onShopClickListener?.invoke(getItem(position))
        }
    }

    class ShopItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name = itemView.findViewById<TextView>(R.id.tv_name)
        private val count = itemView.findViewById<TextView>(R.id.tv_count)
        fun onBind(shopItem: ShopItem) {
            name.text = shopItem.name
            count.text = shopItem.count.toString()
        }
    }

    companion object{
        const val VIEW_TYPE_ENABLE = 100
        const val VIEW_TYPE_DISABLE = 101
        const val MAX_POOL_SIZE = 10
    }
}
