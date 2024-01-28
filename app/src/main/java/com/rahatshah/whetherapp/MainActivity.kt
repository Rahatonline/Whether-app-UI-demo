package com.rahatshah.whetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rahatshah.whetherapp.ui.screens.RainyUi
import com.rahatshah.whetherapp.ui.screens.SnowyUi
import com.rahatshah.whetherapp.ui.screens.SunnyUi
import com.rahatshah.whetherapp.ui.theme.WhetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {


                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.HomeRoute.route,
                        modifier = Modifier.fillMaxSize()
                    ) {

                        composable(Routes.HomeRoute.route) {

                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                ElevatedButton(onClick = {
                                    navController.navigate(Routes.SnowyRoute.route)
                                }) {

                                    Text(text = "Snowy Whether demo")
                                }


                                ElevatedButton(onClick = {navController.navigate(Routes.SunnyRoute.route) }) {

                                    Text(text = "Sunny Whether demo")
                                }


                                ElevatedButton(onClick = { navController.navigate(Routes.RainyRoute.route) }) {

                                    Text(text = "Rainy Whether demo")
                                }


                            }

                        }


                        composable(Routes.SnowyRoute.route) {

                            SnowyUi()

                        }


                        composable(Routes.SunnyRoute.route) {

                            SunnyUi()
                        }


                        composable(Routes.RainyRoute.route) {

                            RainyUi()

                        }


                    }

                }
            }

        }
    }
}


sealed class Routes(val route: String) {
    object HomeRoute : Routes("HomeRoute")
    object SnowyRoute : Routes("SnowyRoute")
    object SunnyRoute : Routes("SunnyRoute")
    object RainyRoute : Routes("RainyRoute")
}