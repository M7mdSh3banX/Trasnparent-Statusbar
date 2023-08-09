package com.shaban.trasnparentstatusbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // The primary step for ensuring that your app goes edge-to-edge.
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}