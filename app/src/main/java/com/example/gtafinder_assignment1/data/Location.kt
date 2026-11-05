package com.example.gtafinder_assignment1.data

data class Location(
    val id: Long = 0,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val createdDatetime: String = ""
)

