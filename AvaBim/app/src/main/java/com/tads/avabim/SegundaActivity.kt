package com.tads.avabim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val dado: Bundle? = intent.extras

        val fca = dado?.getDouble("boi")
            txt_carne.text = fca.toString()

        val flin = dado?.getDouble("ling")
            txt_ling.text = flin.toString()


    }
}
