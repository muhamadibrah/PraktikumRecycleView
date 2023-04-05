package com.example.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Manga(
    val imgManga: Int,
    val nameManga: String,
    val descManga: String
) :Parcelable
