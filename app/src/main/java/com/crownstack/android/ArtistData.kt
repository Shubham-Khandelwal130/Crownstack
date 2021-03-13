package com.crownstack.android

import android.content.Context
import java.io.IOException
import java.nio.charset.Charset

object ArtistData {
     fun loadJSONFromAsset(context:Context): String {
        val json: String?
        try {
            val inputStream =context.assets.open("sample.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            val charset: Charset = Charsets.UTF_8
            inputStream.read(buffer)
            inputStream.close()
            json = String(buffer, charset)
        }
        catch (ex: IOException) {
            ex.printStackTrace()
            return ""
        }
        return json
    }



}