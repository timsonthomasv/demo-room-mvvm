package com.ot.roomdbdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "text_table")
data class Text(@PrimaryKey val text: String)