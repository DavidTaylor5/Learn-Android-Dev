package com.andaagi.learnandroiddev.data.repository

import com.andaagi.learnandroiddev.data.NoteCardData

interface NoteCardRepository {

    fun getNoteCards(): List<NoteCardData>


}