package jp.techacademy.yukari.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)

        val value1 = editText1.text.toString()    //getDoubleExtra
        val value2 = editText2.text.toString()     //getDoubleExtra

        if (value1 == "" || value2 == "" || value1 == "." || value2 == ".") {
            val mySnackbar = Snackbar.make(v, "入力してください", Snackbar.LENGTH_INDEFINITE)
            (mySnackbar.show())
        } else {
            val num1 = value1.toDouble()
            val num2 = value2.toDouble()
            var result = 0.0
            if (v.id == R.id.button1) {
                result = num1 + num2
            } else if (v.id == R.id.button2) {
                result = num1 - num2
            } else if (v.id == R.id.button3) {
                result = num1 * num2
            } else {
                result = num1 / num2
            }
            intent.putExtra("RESULT", result)   //結果
            startActivity(intent)  //２画面目に

        }

    }
}


