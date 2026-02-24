package com.andaagi.learnandroiddev.data.repository

import com.andaagi.learnandroiddev.data.NoteCardData
import com.andaagi.learnandroiddev.data.datasource.LocalNoteCardDataSource
import javax.inject.Inject


class NoteCardRepositoryImpl @Inject constructor(
    val localNoteCards: LocalNoteCardDataSource
): NoteCardRepository {


    override fun getNoteCards(): List<NoteCardData> {
        return localNoteCards.getNotecardList()
    }
}