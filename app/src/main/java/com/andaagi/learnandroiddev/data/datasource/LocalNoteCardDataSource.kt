package com.andaagi.learnandroiddev.data.datasource

import com.andaagi.learnandroiddev.data.NoteCardData

interface LocalNoteCardDataSource {

    fun getNotecardList(): List<NoteCardData>

}