package com.ot.roomdbdemo

import androidx.lifecycle.LiveData

class WordRepository(private val wordDAO: WordDAO) {

    val allWord: LiveData<List<Word>> = wordDAO.getAlphabetizeWords()

    suspend fun insertWord(word: Word){
        wordDAO.insert(word)
    }

}