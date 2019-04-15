package kz.assetbekbossynov.payday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import com.crashlytics.android.answers.Answers
import com.crashlytics.android.answers.CustomEvent
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.expandable_item.view.*
import kotlinx.android.synthetic.main.activity_policy.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.title as titleLayout
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class PolicyActivity : AppCompatActivity() {

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policy)

        Fabric.with(this, Crashlytics())

        Answers.getInstance().logCustom(CustomEvent("Policy_page"))

        rates.div_title.text = "Rates and Fees"
        terms.div_title.text = "Terms of Use"
        privacy.div_title.text = "Privacy Policy"
        econsent.div_title.text = "E-Consent"
        responsible.div_title.text = "Responsible Lending  Policy"
        marketing.div_title.text = "Marketing Practices"
        faq.div_title.text = "FAQ"
        disclaimer.div_title.text = "Disclaimer and APR Representative "

        if (intent.getStringExtra("btn") == "installment"){
            rates.info.text = getTextFromFile("ratesinstallment.txt")
            terms.info.text = getTextFromFile("termsinstallment.txt")
            privacy.info.text = getTextFromFile("privacyinstallment.txt")
            econsent.info.text = getTextFromFile("econsentinstallment.txt")
            responsible.info.text = getTextFromFile("responsibleinstallment.txt")
            marketing.info.text = getTextFromFile("marketinginstallment.txt")
            faq.info.text = getTextFromFile("faqinstallment.txt")
            disclaimer.info.text = getTextFromFile("disclaimerinstallment.txt")
        }else if (intent.getStringExtra("btn") == "payday"){
            rates.info.text = getTextFromFile("rates.txt")
            terms.info.text = getTextFromFile("terms.txt")
            privacy.info.text = getTextFromFile("privacy.txt")
            econsent.info.text = getTextFromFile("econsent.txt")
            responsible.info.text = getTextFromFile("responsible.txt")
            marketing.info.text = getTextFromFile("marketing.txt")
            faq.info.text = getTextFromFile("faq.txt")
            disclaimer.info.text = getTextFromFile("disclaimer.txt")
        }

        rates.setOnClickListener {
            rates.div_content.toggle()
            if (rates.div_content.isExpanded){
                rates.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                rates.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        terms.setOnClickListener {
            terms.div_content.toggle()
            if (terms.div_content.isExpanded){
                terms.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                terms.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        privacy.setOnClickListener {
            privacy.div_content.toggle()
            if (privacy.div_content.isExpanded){
                privacy.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                privacy.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        econsent.setOnClickListener {
            econsent.div_content.toggle()
            if (econsent.div_content.isExpanded){
                econsent.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                econsent.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        responsible.setOnClickListener {
            responsible.div_content.toggle()
            if (responsible.div_content.isExpanded){
                responsible.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                responsible.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        marketing.setOnClickListener {
            marketing.div_content.toggle()
            if (marketing.div_content.isExpanded){
                marketing.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                marketing.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        faq.setOnClickListener {
            faq.div_content.toggle()
            if (faq.div_content.isExpanded){
                faq.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                faq.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }

        disclaimer.setOnClickListener {
            disclaimer.div_content.toggle()
            if (disclaimer.div_content.isExpanded){
                disclaimer.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.up, 0)
            }else{
                disclaimer.div_title.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.down, 0)
            }
        }


        titleLayout.text = "Questionnaire"

        backbutton.setOnClickListener {
            onBackPressed()
        }
    }

    fun getTextFromFile(path: String): String {

        var reader: BufferedReader? = null

        try {
            reader = BufferedReader(
                    InputStreamReader(assets.open(path)));

            text = reader.readLines().joinToString("\n")

        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            if (reader != null) {
                try {
                    reader.close()
                } catch (e: IOException) {
                }
            }
        }
        return text
    }
}
