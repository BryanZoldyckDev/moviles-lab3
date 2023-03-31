package com.labo3_00014820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tCounter: TextView;
    private lateinit var bFivecents: ImageView;
    private lateinit var tFivecents: TextView;
    private lateinit var bTencents: ImageView;
    private lateinit var tTencents: TextView;
    private lateinit var bQuarter: ImageView;
    private lateinit var tQuarter: TextView;
    private lateinit var bDollar: ImageView;
    private lateinit var tDollar: TextView;

    var counter: Double = 0.0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind();
        listener();
    }

    fun bind() {
        bFivecents = findViewById(R.id.image_five_cents)
        tFivecents = findViewById(R.id.text_five_cents)
        bTencents = findViewById(R.id.image_ten_cents)
        tTencents = findViewById(R.id.text_ten_cents)
        bQuarter = findViewById(R.id.image_quarter)
        tQuarter = findViewById(R.id.text_quarter)
        bDollar = findViewById(R.id.image_dollar)
        tDollar = findViewById(R.id.text_dollar)
        tCounter = findViewById(R.id.text_counter)
    }

    fun listener () {
        bFivecents.setOnClickListener{wallet(0.05)};
        tFivecents.setOnClickListener{wallet(0.05)};
        bTencents.setOnClickListener{wallet(0.10)};
        tTencents.setOnClickListener{wallet(0.10)};
        bQuarter.setOnClickListener{wallet(0.25)};
        tQuarter.setOnClickListener{wallet(0.25)};
        bDollar.setOnClickListener{wallet(1.00)};
        tDollar.setOnClickListener{wallet(1.00)};
    }

    fun wallet(income: Double) {

        counter+=income;

        tCounter.text = "$" + counter.toString();
    }

}