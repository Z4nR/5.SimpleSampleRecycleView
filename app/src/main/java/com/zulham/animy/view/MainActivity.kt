package com.zulham.animy.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.zulham.animy.R
import com.zulham.animy.adapter.AnimAdapter
import com.zulham.animy.model.DataModel
import com.zulham.animy.utils.DataAnim
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ibProfil()

        recyclerV()

    }

    private fun ibProfil(){

        val profile = findViewById<View>(R.id.iB_Profil) as ImageButton

        profile.setOnClickListener {

            val bottomSheetDialog = BottomSheetDialog(
                    this@MainActivity
            )

            val bottomSheetView = LayoutInflater.from(applicationContext)
                    .inflate(R.layout.bottom_sheet_profile,
                            findViewById<ConstraintLayout>(R.id.profile)
                    )

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()

        }
    }

    private fun recyclerV() {
        rv_ListPilem.apply {
            val filmAdapter = AnimAdapter(DataAnim.list)

            adapter = filmAdapter

            filmAdapter.setOnItemClickCallback(object : AnimAdapter.OnItemClickCallback {
                override fun onItemClicked(data: DataModel) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("film", data)
                    startActivity(intent)
                }

            })

            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }
}