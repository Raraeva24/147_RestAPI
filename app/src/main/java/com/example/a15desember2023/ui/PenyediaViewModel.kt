package com.example.a15desember2023.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a15desember2023.KontakApplication
import com.example.a15desember2023.ui.home.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer{
            HomeViewModel(aplikasiKontak().container.kontakRepository)
        }
    }
}

fun CreationExtras.aplikasiKontak(): KontakApplication=
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)