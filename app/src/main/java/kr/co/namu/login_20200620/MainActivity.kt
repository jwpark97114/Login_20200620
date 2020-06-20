package kr.co.namu.login_20200620

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val inputId = idEdt.text
            val inputPw = pwEdt.text
            if(inputId.toString() == "admin" && inputPw.toString() == "qwer"){
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()

            }
            }
        }
    }
