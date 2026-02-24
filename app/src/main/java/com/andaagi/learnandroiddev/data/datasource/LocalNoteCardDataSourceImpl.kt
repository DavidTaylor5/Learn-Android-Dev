package com.andaagi.learnandroiddev.data.datasource

import android.content.Context
import android.util.Log
import com.andaagi.learnandroiddev.R
import com.andaagi.learnandroiddev.data.NoteCardData
import com.andaagi.learnandroiddev.data.NoteCardListData
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.serialization.json.Json
import javax.inject.Inject

class LocalNoteCardDataSourceImpl @Inject constructor(
    @param:ApplicationContext private val context: Context
): LocalNoteCardDataSource {

    private var model: NoteCardListData? = null

    override fun getNotecardList(): List<NoteCardData> {
        if(model == null) refreshModel()
        return model?.cards ?: listOf()
    }

    private fun refreshModel() {
        try {
            val noteCardStr = context.resources.openRawResource(R.raw.note_cards)
                .bufferedReader()
                .use { it.readText() }
            //val file = context.resources.getResourceName(R.raw.note_cards)
            model = Json.Default.decodeFromString<NoteCardListData>(noteCardStr)
        } catch(e: Exception) {
            Log.d("refreshModel: ", "Error reading the Json!")
        }
    }
}