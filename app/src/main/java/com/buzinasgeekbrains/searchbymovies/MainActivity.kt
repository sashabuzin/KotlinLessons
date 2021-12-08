package com.buzinasgeekbrains.searchbymovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testFor()
        val myPerson : Person = Person("Александр", 28)
        val button : Button = findViewById(R.id.button)
        val textView : TextView = findViewById(R.id.text_view)
        val result: String = "Имя: " + myPerson.name + "\n" + "Возраст: " + myPerson.age + "лет."
        button.setOnClickListener{textView.text = result}



    }

    fun testFor() {
        for (i in 50 downTo 29 step 3) {
            println(i)
        }
    }
}