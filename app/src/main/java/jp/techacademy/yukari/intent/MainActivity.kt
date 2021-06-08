package jp.techacademy.yukari.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second.*
import android.support.design.widget.Snackbar;


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "+"
        button1.setOnClickListener() {
            String.text = editText1.getText().toString();
            String.text = editText2.getText().toString();


        }
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        val value1 = editText1
        val value2 = editText2
        if (v.id == R.id.button1) {
            textView.text = "${value1 + value2}"}
            else if (v.id == R.id.button2) {
                textView.text = "${value1 - value2}"
            }else if (v.id == R.id.button3){textView.text = "${value1 * value2}"}
        else if (v.id == R.id.button4){textView.text = "${value1 % value2}"}
        else (var=null){ Snackbar.make(view, "入力してください", Snackbar.LENGTH_INDEFINITE).show();}



            // val intent = Intent(this, SecondActivity::class.java)
            // intent.putExtra("VALUE1", 10)
            //  intent.putExtra("VALUE2", 20)
            // startActivity(intent)
        }
    }