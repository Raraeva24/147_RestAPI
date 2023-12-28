package com.example.a15desember2023.navigation

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a15desember2023.ui.home.screen.DestinasiHome
import com.example.a15desember2023.ui.home.screen.HomeScreen
import com.example.a15desember2023.ui.kontak.screen.DestinasiEntry
import com.example.a15desember2023.ui.kontak.screen.EntryKontakScreen
import com.example.databaseapi.ui.home.screens.DestinasiHome
import com.example.databaseapi.ui.home.screens.HomeScreen
import com.example.databaseapi.ui.kontak.screen.DestinasiEntry
import com.example.databaseapi.ui.kontak.screen.EntryKontakScreen

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = {navController.navigate(DestinasiEntry.route)
                },
                onDetailClick = {

                }
            )
        }
        composable(DestinasiEntry.route){
            EntryKontakScreen(navigateBack = {
                navController.navigate(
                    DestinasiHome.route
                ) {
                    popUpTo(DestinasiHome.route){
                        inclusive = true
                    }
                }
            })

        }
    }

}