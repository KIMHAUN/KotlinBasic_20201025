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
            val mybirthday:Int //한번 기록하면 변경 x 상수, 값(Value)
            var myName:String //변경 가능(변수)Variable

            mybirthday = 3

        }

        okBtn.setOnClickListener {
//            Ctrl + / 해당 줄을 주석을 변경

//            okBtn이 눌리면 >> 1. 뭐라고 입력했는지 조회 2. 그 내용을 텍스트뷰에 반영.
            val inputContent = contentEdt.text.toString() //value

            contentTxt.text = inputContent

            //조건문 예시 : 입력한 내용이 안녕하세요일 때 토스트로 인사 메세지 문구 출력
            if(inputContent == "안녕하세요"){
                Toast.makeText(this, "인사 메세지", Toast.LENGTH_SHORT).show()
            }
            else if(inputContent == "안녕히가세요"){
                Toast.makeText(this, "작별인사메세지", Toast.LENGTH_SHORT).show()
            }
            else if(inputContent == "Hello"){
                Toast.makeText(this, "영문 인사", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "그 외의 문장", Toast.LENGTH_SHORT).show()
            }
        }
    }
}