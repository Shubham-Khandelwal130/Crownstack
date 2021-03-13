package com.crownstack.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.artist_details.*

class ArtistDetails : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artist_details)


        setTitle("Artist Details")


        val resultsItem: ResultsItem = intent.getSerializableExtra("data") as ResultsItem
        Glide.with(this).load(resultsItem.artworkUrl60).into(image)
        wrapperType.setText(resultsItem.wrapperType)
        artistName.setText(resultsItem.artistName)
        artistId.setText(resultsItem.artistId.toString())
        releaseDate.setText(resultsItem.releaseDate)
        country.setText(resultsItem.country)
        primaryGenreName.setText(resultsItem.primaryGenreName)
        collectionCensoredName.setText(resultsItem.collectionCensoredName)
        description.setText(resultsItem.description)


    }
}