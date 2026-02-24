package com.andaagi.learnandroiddev.di

import com.andaagi.learnandroiddev.data.datasource.LocalNoteCardDataSource
import com.andaagi.learnandroiddev.data.datasource.LocalNoteCardDataSourceImpl
import com.andaagi.learnandroiddev.data.repository.NoteCardRepository
import com.andaagi.learnandroiddev.data.repository.NoteCardRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    abstract fun getLocalNoteCardDataSource(
        impl: LocalNoteCardDataSourceImpl
    ): LocalNoteCardDataSource

    @Binds
    abstract fun getNoteCardRepository(
        impl: NoteCardRepositoryImpl
    ): NoteCardRepository
}