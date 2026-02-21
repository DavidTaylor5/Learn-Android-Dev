package com.andaagi.learnandroiddev.data.datasource

import android.content.Context
import android.util.Log
import com.andaagi.learnandroiddev.R
import com.andaagi.learnandroiddev.data.NoteCardData
import com.andaagi.learnandroiddev.data.NoteCardListData
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.serialization.json.Json

class LocalNotecardDataSourceImpl(
    @ApplicationContext private val context: Context
): LocalNotecardDataSource {

    private var model: NoteCardListData? = null


    override fun getNotecardList(): Flow<List<NoteCardData>> {
        return flowOf()
//        if(model == null) refreshModel()
//        model?.let {
//            //TODO learn the ins and outs of creating these flows and collecting them!
//        }
    }

    private fun refreshModel() {
        try {
            val noteCardStr = context.resources.openRawResource(R.raw.note_cards)
                .bufferedReader()
                .use { it.readText() }
            val file = context.resources.getResourceName(R.raw.note_cards)
            model = Json.Default.decodeFromString<NoteCardListData>(noteCardStr)
        } catch(e: Exception) {
            Log.d("refreshModel: ", "Error reading the Json!")
        }
    }
}