package com.localazy.android.demos.simplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.localazy.android.demos.dialoglibrary.DialogCreator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog_button.setOnClickListener {
            DialogCreator(this@MainActivity).testDialog()
        }

    }

}
