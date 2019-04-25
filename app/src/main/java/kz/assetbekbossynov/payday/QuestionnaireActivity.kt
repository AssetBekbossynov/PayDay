package kz.assetbekbossynov.payday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questionnaire.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.title as activityTitle

class QuestionnaireActivity : AppCompatActivity() {

    private var url: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire)

        if (intent.getStringExtra("btn") == "installment"){
            url = "http://orihuelacosta.ru/InstallmentLoans.html"
            activityTitle.text = "Installment"
        }else{
            url = "http://orihuelacosta.ru/PaydayLoans.html"
            activityTitle.text = "PayDay"
        }

        val webSettings = web!!.getSettings()
        webSettings.setJavaScriptEnabled(true)

        web.loadUrl(url)

        backbutton.setOnClickListener { onBackPressed() }
    }
}
