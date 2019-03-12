package kz.assetbekbossynov.payday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Fabric.with(this, Crashlytics())
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
