package com.ot.roomdbdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
data class Word(@PrimaryKey val word: String)