package com.leopold.mvvm.di

import com.leopold.mvvm.data.remote.api.SearchAPI
import org.koin.dsl.module
import retrofit2.Retrofit

/**
 * @author Leopold
 */
val apiModule = module {
    single(createdAtStart = false) { get<Retrofit>().create(SearchAPI::class.java) }
}