package com.abel.libarayutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abel.libtest.STest
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.getLogger("${STest.add(1, 2)}")
    }
}
