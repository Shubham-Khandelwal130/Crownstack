package com.crownstack.android

import java.io.Serializable

public class ArtistModel(

	val results: ArrayList<ResultsItem>
):Serializable



data class ResultsItem(



	val artworkUrl100: String,

	val trackTimeMillis: Int,

	val longDescription: String,

	val trackHdRentalPrice: Double,

	val country: String,

	val previewUrl: String,

	val collectionHdPrice: Double,

	val hasITunesExtras: Boolean,

	val trackName: String,

	val artworkUrl30: String,

	val wrapperType: String,

	val currency: String,


	val trackExplicitness: String,


	val trackHdPrice: Double,


	val contentAdvisoryRating: String,

	val releaseDate: String,

	val kind: String,

	val trackId: Int,

	val trackRentalPrice: Double,

	val collectionPrice: Double,

	val primaryGenreName: String,

	val trackPrice: Double,

	val collectionExplicitness: String,

	val trackViewUrl: String,

	val artworkUrl60: String,

	val trackCensoredName: String,

	val artistName: String,

	val artistId: Int,

	val collectionName: String,


	val artistViewUrl: String,

	val discNumber: Int,

	val trackCount: Int,

	val collectionId: Int,

	val isStreamable: Boolean,

	val collectionViewUrl: String,

	val trackNumber: Int,

	val discCount: Int,

	val collectionCensoredName: String,

	val collectionArtistName: String,

	val collectionArtistId: Int,

	val collectionArtistViewUrl: String,

	val copyright: String,

	val description: String



):Serializable

