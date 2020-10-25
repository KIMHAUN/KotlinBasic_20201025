package kr.co.neoplus.kotlinbasic_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //layout폴더에 있는 activity _main을 가져다 쓸게요.
        //kt파일이 xml파일을 선택해서 불러온다.

        logBtn.setOnClickListener {
            Log.d("메인 화면", "로그 버튼 눌림")


        }
    }
}