package id.co.imastudio.inputuserkotlin

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnKali.setOnClickListener{hitung("*")}
        btnBagi.setOnClickListener { hitung("/") }
        btnKurang.setOnClickListener {  hitung("-")}
        btnTambah.setOnClickListener {hitung("+")  }
        btnClear.setOnClickListener { input1.setText("")
                                         input2.setText("")}


    }



    private fun hitung(s: String) {
        var angk1 = input1.text.toString()
        var angk2 = input2.text.toString()
        if(angk1.isNotEmpty() && angk2.isNotEmpty()){

            when(s){
                "*" ->   alert(angk1.toInt() * angk2.toInt())
                "-" -> alert(angk1.toInt()  - angk2.toInt())
                "+" -> alert(angk1.toInt()  + angk2.toInt())
                "/" -> alert(angk1.toInt()  / angk2.toInt())

            }
        }
    }

    private fun alert(i: Int) {
        var alert = AlertDialog.Builder(this)
        alert.setTitle("hasil")
        alert.setMessage(i.toString())
        alert.show()
    }
}
