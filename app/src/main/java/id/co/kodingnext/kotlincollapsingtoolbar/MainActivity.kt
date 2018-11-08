package id.co.kodingnext.kotlincollapsingtoolbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.CollapsingToolbarLayout
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);


        var collapsingToolbar: CollapsingToolbarLayout
        collapsingToolbar = findViewById<View>(R.id.collapsing_toolbar) as CollapsingToolbarLayout
        collapsingToolbar.setExpandedTitleColor(resources.getColor(android.R.color.transparent))

        iv_image_detail.setImageDrawable(resources.getDrawable(R.drawable.dummytshirt))

        collapsingToolbar.title = "Batik Indonesia"

        tv_nama_produk.text ="Batik Indonesia"

        tv_deskripsi_detail.text = "Batik is a technique of wax-resist dyeing applied to whole cloth, or cloth made using this technique originated from Indonesia. Batik is made either by drawing dots and lines of the resist with a spouted tool called a canting, or by printing the resist with a copper stamp called a cap. The applied wax resists dyes and therefore allows the artisan to colour selectively by soaking the cloth in one colour, removing the wax with boiling water, and repeating if multiple colours are desired."
    }
}
