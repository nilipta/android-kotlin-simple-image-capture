package com.example.camera

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SendPictureActivity : AppCompatActivity() {

    private var imagePath: String? = null
    private var userInputText: String? = null
    private var serverUrl: String? = null  // QRコードで取得するサーバーのURL
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_send_picture)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // PictureActivityから画像パスとテキストを受け取る
        imagePath = intent.getStringExtra("imagePath")
        userInputText = intent.getStringExtra("resultText")

    }
}