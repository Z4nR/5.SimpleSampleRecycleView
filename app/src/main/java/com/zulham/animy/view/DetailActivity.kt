package com.zulham.animy.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.zulham.animy.R
import com.zulham.animy.model.DataModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        detailFilm()

        ibBack()

    }

    private fun detailFilm(){
        val movie = intent.getParcelableExtra<DataModel>("film")
        movie?.let { iv_img_detail.setImageResource(it.img) }
        tv_title_detail.text = movie?.title
        tv_releaseDate_detail.text = movie?.releaseDate
        tv_PH_detail.text = movie?.production
        tv_genre_detail.text = movie?.genre
        tv_desc_detail.text = movie?.desc
    }

    private fun ibBack(){
        val back = findViewById<View>(R.id.iB_Back) as ImageButton

        back.setOnClickListener {
            finish()
        }
    }
}