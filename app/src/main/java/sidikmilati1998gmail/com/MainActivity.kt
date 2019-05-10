package sidikmilati1998gmail.com

import android.support.v7.app.AppCompatActivity
import android.R.layout.simple_list_item_1
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = listOf("java","kotlin","javascript","php","phyton")
       list1.adapter=ArrayAdapter(this,simple_list_item_1,languages)
        list1.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"anda memilih:${languages[position]}",Toast.LENGTH_SHORT).show()}
        }

    }

