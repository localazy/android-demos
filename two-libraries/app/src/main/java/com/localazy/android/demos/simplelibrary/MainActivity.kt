package com.localazy.android.demos.simplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.localazy.android.demos.library1.DialogCreator1
import com.localazy.android.demos.library2.DialogCreator2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog_button1.setOnClickListener {
            DialogCreator1(this@MainActivity).testDialog()
        }

        dialog_button2.setOnClickListener {
            DialogCreator2(this@MainActivity).testDialog()
        }

    }

}
