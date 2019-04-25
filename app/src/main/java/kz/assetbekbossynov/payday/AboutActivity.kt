package kz.assetbekbossynov.payday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.toolbar.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import kotlinx.android.synthetic.main.toolbar.title as titleLayout

class AboutActivity : AppCompatActivity() {

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        Fabric.with(this, Crashlytics())

        backbutton.setOnClickListener {
            onBackPressed()
        }

        val intent = intent
        if (intent.hasExtra("title")){
            descTitle.text = intent.getStringExtra("title")
            descContent.text = intent.getStringExtra("content")

            titleLayout.text = "Additional information"
        }else{
            descTitle.visibility = View.GONE
            descContent.text = getTextFromFile("howitworks.txt")
            titleLayout.text = "About Service"
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
