package com.ot.roomdbdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText

class NewWordActivity : AppCompatActivity() {

    private lateinit var editWordView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        editWordView = findViewById(R.id.edit_word)
        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyInt = Intent()
            if (TextUtils.isEmpty(editWordView.text)){
                setResult(Activity.RESULT_CANCELED, replyInt)
            } else{
                val word = editWordView.text.toString()
                replyInt.putExtra(EXTRA_REPLY, word)
                setResult(Activity.RESULT_OK, replyInt)
            }
        }
    }
    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}
