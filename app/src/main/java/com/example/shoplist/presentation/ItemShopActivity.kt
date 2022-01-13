package com.example.shoplist.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.shoplist.R

class ItemShopActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_shop)

        btn = findViewById(R.id.btn_save)
        editText = findViewById(R.id.data_et)

        btn.setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra("key",editText.text.toString()))
            finish()
        }
    }
}