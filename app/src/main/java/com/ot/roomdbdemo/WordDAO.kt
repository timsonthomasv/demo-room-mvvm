package com.ot.roomdbdemo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDAO {

    @Query("select * from word_table ORDER by word ASC")
    fun getAlphabetizeWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("DELETE from word_table")
    suspend fun deleteAll()

}