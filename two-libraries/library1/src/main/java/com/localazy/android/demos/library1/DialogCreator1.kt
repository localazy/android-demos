package com.localazy.android.demos.library1

import android.content.Context
import androidx.appcompat.app.AlertDialog

class DialogCreator1(private val context: Context) {

    fun testDialog() {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(R.string.dialog_title)
        builder.setMessage(R.string.dialog_message)
        builder.show()
    }

}