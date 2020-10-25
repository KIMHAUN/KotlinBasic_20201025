package kr.co.neoplus.kotlinbasic_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //layout폴더에 있는 activity _main을 가져다 쓸게요.
        //kt파일이 xml파일을 선택해서 불러온다.

        logBtn.setOnClickListener {
            //debug
            Log.d("메인 화면", "로그 버튼 눌림")
            //error(빨간색)
            Log.e("메인화면", "E로 로그 찍어보기")
        }

        toastBtn.setOnClickListener {
            Toast.makeText(this,"토스트 띄우기", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "자동완성 토스트", Toast.LENGTH_SHORT).show()
        }

        changeTextBtn.setOnClickListener {
            resultTxt.text = "문구 변경 버튼이 눌림"

        }


    }
}