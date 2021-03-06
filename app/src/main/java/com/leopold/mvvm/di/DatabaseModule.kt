package com.leopold.mvvm.di

import com.leopold.mvvm.data.db.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * @author Leopold
 */
val roomModule = module {
    single { AppDatabase.getInstance(androidApplication()) }
    single(createdAtStart = false) { get<AppDatabase>().getBookmarkDao() }
}