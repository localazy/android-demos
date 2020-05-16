package com.localazy.android.demos.dialoglibrary

import android.content.Context
import androidx.appcompat.app.AlertDialog

class DialogCreator(private val context: Context) {

    fun testDialog() {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(R.string.dialog_title)
        builder.setMessage(R.string.dialog_message)
        builder.show()
    }

}