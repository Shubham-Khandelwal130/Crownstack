package com.crownstack.android

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide


class MyListAdapter(
    private val context: Activity,
    private val artistDataList: ArrayList<ResultsItem>
) : ArrayAdapter<ResultsItem>(context, R.layout.artist_card, artistDataList) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.artist_card, null, true)

        val artistId = rowView.findViewById<TextView>(R.id.artistId)
        val wrapperType = rowView.findViewById<TextView>(R.id.wrapperType)
        val collectionId = rowView.findViewById<TextView>(R.id.collectionId)
        val parentLayout = rowView.findViewById(R.id.parentLayout) as LinearLayout
        val image = rowView.findViewById<ImageView>(R.id.image)
        artistId.text = artistDataList.get(position).artistName
        wrapperType.text = artistDataList.get(position).wrapperType
        Glide.with(context).load(artistDataList.get(position).artworkUrl60).into(image)

        parentLayout.setOnClickListener(View.OnClickListener { view ->


            val intent = Intent(context, ArtistDetails::class.java)
            intent.putExtra("data", artistDataList[position])
            context.startActivity(intent)
        })

        return rowView
    }
}