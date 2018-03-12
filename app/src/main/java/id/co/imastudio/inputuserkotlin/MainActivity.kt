package id.co.imastudio.inputuserkotlin

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //event klik button
        btnHitung.setOnClickListener {

            if (input1.text.toString().isNotEmpty() &&
                    input2.text.toString().isNotEmpty()) {
                //ambil dari inputan user
                val angka1 = input1.text.toString().toDouble()
                val angka2 = input2.text.toString().toDouble()


                val hasil = 0.5 * angka1 * angka2

                Toast.makeText(this,hasil.toString(),Toast.LENGTH_SHORT).show()
                //hasilnya tmpil di alert
                val inialert = AlertDialog.Builder(this)
                inialert.setTitle(hasil.toString())
                inialert.setPositiveButton("pindah", DialogInterface.OnClickListener {
                    dialogInterface, i ->

                    //pindah halaman
                    var iniIntent = Intent(this,SecondActivity::class.java)
                    iniIntent.putExtra("hasil",hasil.toString())

                    startActivity(iniIntent)



                })
                inialert.show()
            }
            else{

                input2.setError("hei,")



                Toast.makeText(this,"tidak boleh kosong",Toast.LENGTH_SHORT)
                        .show()
            }


        }
    }
}
