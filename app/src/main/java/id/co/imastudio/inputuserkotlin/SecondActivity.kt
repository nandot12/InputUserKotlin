package id.co.imastudio.inputuserkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


      val hasiltangkap =   intent.getStringExtra("hasil")

        Toast.makeText(this,hasiltangkap,Toast.LENGTH_SHORT).show()
        
    }
}
