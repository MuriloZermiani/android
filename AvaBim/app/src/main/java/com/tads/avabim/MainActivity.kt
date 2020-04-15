package com.tads.avabim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener {

            val intent = Intent(applicationContext, SegundaActivity::class.java)

            //calculo

            var ho = txt_homem.text.toString().toDouble()
            var mul = txt_mulher.text.toString().toDouble()
            var cr = txt_cri.text.toString().toDouble()

            var qch = ho*0.3
            var qcm = mul*0.25
            var qcc = cr*0.18
            var ttc = qch+qcm+qcc


            var qlh = ho*0.1
            var qlm = mul*0.05
            var qlc = cr*0.02
            var ttli = qlh+qlm+qlc

            intent.putExtra("boi", ttc)
            intent.putExtra("ling", ttli)

            startActivity(intent)

        }
    }
}
