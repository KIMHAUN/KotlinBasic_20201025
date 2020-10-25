package kr.co.neoplus.kotlinbasic_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //layout폴더에 있는 activity _main을 가져다 쓸게요.
        //kt파일이 xml파일을 선택해서 불러온다.
    }
}