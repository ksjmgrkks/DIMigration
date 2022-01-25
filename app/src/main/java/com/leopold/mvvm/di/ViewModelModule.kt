package com.leopold.mvvm.di

import com.leopold.mvvm.ui.bookmark.BookmarkViewModel
import com.leopold.mvvm.ui.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author Leopold
 */
val viewModelModule = module {
    viewModel { SearchViewModel(get(), get()) }
    viewModel { BookmarkViewModel(get()) }
}