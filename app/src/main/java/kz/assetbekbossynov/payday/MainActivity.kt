package kz.assetbekbossynov.payday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pdloan.setOnClickListener {
            val intent = Intent(this, QuestionnaireActivity::class.java)
            intent.putExtra("btn", "payday")
            startActivity(intent)
        }

        iloan.setOnClickListener {
            val intent = Intent(this, QuestionnaireActivity::class.java)
            intent.putExtra("btn", "installment")
            startActivity(intent)
        }
    }
}
