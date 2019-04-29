package kz.assetbekbossynov.payday

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.toolbar.*
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
            descTitle.text = getString(R.string.how_it_works_title)
            descTitle.textSize = 18f
            descContent.text = getString(R.string.how_it_works)
            val step1 = TextView(this)
            val step1Content = TextView(this)
            val step2 = TextView(this)
            val step2Content = TextView(this)
            val step3 = TextView(this)
            val step3Content = TextView(this)
            step1.typeface = Typeface.DEFAULT_BOLD
            step2.typeface = Typeface.DEFAULT_BOLD
            step3.typeface = Typeface.DEFAULT_BOLD
            step1.text = "Step 1"
            step2.text = "Step 2"
            step3.text = "Step 3"
            step1Content.text = getString(R.string.step1)
            step2Content.text = getString(R.string.step2)
            step3Content.text = getString(R.string.step3)
            step1.setTextColor(resources.getColor(R.color.white))
            step2.setTextColor(resources.getColor(R.color.white))
            step3.setTextColor(resources.getColor(R.color.white))
            step1Content.setTextColor(resources.getColor(R.color.white))
            step2Content.setTextColor(resources.getColor(R.color.white))
            step3Content.setTextColor(resources.getColor(R.color.white))
            step1.textSize = 18f
            step2.textSize = 18f
            step3.textSize = 18f
            step1Content.textSize = 18f
            step2Content.textSize = 18f
            step3Content.textSize = 18f
            main.addView(step1)
            main.addView(step1Content)
            main.addView(step2)
            main.addView(step2Content)
            main.addView(step3)
            main.addView(step3Content)

            titleLayout.text = "About Service"
        }
    }
}
