package com.gy.motion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent= Intent()
        btn_four_block.setOnClickListener {
            intent.setClass(this,FourBlockActivity::class.java)
            startActivity(intent)
        }

        btn_arc.setOnClickListener {
            intent.setClass(this,MainActivityArc::class.java)
            startActivity(intent)
        }

        btn_diagonal.setOnClickListener {
            intent.setClass(this,MainActivityDiagonal::class.java)
            startActivity(intent)
        }

        btn_movie.setOnClickListener {
            intent.setClass(this,MainActivityMovie::class.java)
            startActivity(intent)
        }

        btn_shape.setOnClickListener {
            intent.setClass(this,ShapeActivity::class.java)
            startActivity(intent)
        }
    }
}
