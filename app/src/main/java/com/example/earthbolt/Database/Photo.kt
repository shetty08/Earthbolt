package com.example.earthbolt.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photos")
data class Photo(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val uri: String,
    val timestamp: Long,
    val albumName: String
)
