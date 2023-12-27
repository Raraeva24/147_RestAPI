package com.example.a15desember2023

import android.app.Application
import com.example.a15desember2023.repository.AppContainer
import com.example.a15desember2023.repository.KontakContainer

class KontakApplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}