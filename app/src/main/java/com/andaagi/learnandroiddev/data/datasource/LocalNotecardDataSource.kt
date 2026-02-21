package com.andaagi.learnandroiddev.data.datasource

import com.andaagi.learnandroiddev.data.NoteCardData
import com.andaagi.learnandroiddev.data.NoteCardListData
import kotlinx.coroutines.flow.Flow

interface LocalNotecardDataSource {

    fun getNotecardList(): Flow<List<NoteCardData>>

}