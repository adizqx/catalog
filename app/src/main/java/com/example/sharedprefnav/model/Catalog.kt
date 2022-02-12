package com.example.sharedprefnav.model

import java.io.Serializable

data class Catalog(
    val name: String,
    val placeName: String,
    val amenities: String,
    val description: String,
    val image: String,
    val images: ArrayList<ImagesDetails>
):Serializable
