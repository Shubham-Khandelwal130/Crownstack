package com.crownstack.android

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.artist.*

class Artist : AppCompatActivity() {

    private var serveyList:ArrayList<ResultsItem> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.artist)
        setTitle("Artist List")

        val gson = GsonBuilder().create()
        serveyList  = gson.fromJson<ArtistModel>(ArtistData.loadJSONFromAsset(this), object :  TypeToken<ArtistModel>(){}.type).results
        Log.e("Json",serveyList.toString())

        artistListview.adapter = MyListAdapter(this,serveyList)

        }

}