package com.example.a15desember2023.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    @SerialName("email") //kn pakai ini? karena menggantikan alamat
    val alamat: String,
    val nohp: String,
)
