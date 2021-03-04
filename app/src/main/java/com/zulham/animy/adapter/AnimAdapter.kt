package com.zulham.animy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zulham.animy.R
import com.zulham.animy.model.DataModel
import kotlinx.android.synthetic.main.item.view.*

class AnimAdapter(private val list: ArrayList<DataModel>)
    : RecyclerView.Adapter<AnimAdapter.ViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: DataModel)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val w = 1000
        val h = 1000

        fun bind(item: DataModel){
            with(itemView){
                Glide.with(itemView.context)
                    .load(item.img)
                    .apply(RequestOptions().override(w, h))
                    .into(img_poster)


                tv_item_title.text = item.title
                tv_item_date.text = item.releaseDate
                tv_item_genre.text = item.genre

                itemView.setOnClickListener { onItemClickCallback?.onItemClicked(item) }
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
