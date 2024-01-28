package com.rahatshah.whetherapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rahatshah.whetherapp.R

@Preview
@Composable
fun SunnyUi() {

    Box(modifier = Modifier.fillMaxSize()) {


        Image(
            alpha = .5f,
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.sunnybg),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        SunnyScreen()

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SunnyScreen() {


    Scaffold(
        containerColor = Color.Transparent,
        topBar = {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "back",
                        modifier = Modifier.size(50.dp),
                        tint = Color.White
                    )
                }

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.more_horizontal_icon),
                        contentDescription = "options",
                        tint = Color.White,
                    )
                }

            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Spacer(modifier = Modifier.height(20.dp))

            Column {
                Text(
                    text = "SYDNEY",
                    fontSize = 50.sp,
                    letterSpacing = 3.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "TUESDAY, 1 JAN 2024",
                    color = Color.White,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }


          //  Spacer(modifier = Modifier.height(10.dp))



            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(
                    modifier = Modifier.height(350.dp),
                    verticalArrangement = Arrangement.Center
                ) {

                    Row(
                        modifier = Modifier.offset(x = 15.dp)
                    ) {
                        Text(
                            text = "33",
                            fontSize = 100.sp,
                            color = Color.White,
                            modifier = Modifier.height(120.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.round_circle_icon),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.offset(y = 33.dp)
                        )
                    }


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {

                        Icon(
                            painter = painterResource(id = R.drawable.sun_outlined_icon),
                            contentDescription = null,
                            tint = Color.White
                        )
                        Text(
                            text = "Sunny",
                            fontSize = 20.sp,
                            color = Color.White,
                            letterSpacing = 2.sp,
                        //    fontWeight = FontWeight.Bold
                        )
                    }

                }



                Divider(
                    modifier = Modifier
                        .width(1.5.dp)
                        .height(380.dp),
                       color = Color.White
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .height(350.dp)
                        .padding(end = 16.dp)
                ) {


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "Wind", color = Color.White, fontSize = 16.sp)
                        Text(
                            text = "25",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 18.sp
                        )
                        Text(text = "km/h", color = Color.White)

                        LinearProgressIndicator(
                            color = Color.Green,
                            progress = .16f,
                            modifier = Modifier.width(80.dp)
                        )


                    }




                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        Text(text = "Precipitation", color = Color.White, fontSize = 16.sp)

                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "%0",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 18.sp
                        )

                        LinearProgressIndicator(
                            color = Color.Green,
                            progress = 0f,
                            modifier = Modifier.width(80.dp)
                        )


                    }




                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "Humidity", color = Color.White, fontSize = 16.sp)

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "%41",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 18.sp
                        )

                        LinearProgressIndicator(
                            color = Color.Green,
                            progress = .41f,
                            modifier = Modifier.width(80.dp)
                        )


                    }


                }
            }


            LazyRow(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "MON", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.cloud),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "32",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        modifier = Modifier
                            .offset(y = (-5).dp)
                            .padding(horizontal = 5.dp),
                        verticalArrangement = Arrangement.spacedBy(13.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = "TUESDAY",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Icon(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(45.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "33",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(8.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "WED.", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.cloud),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "29",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "THIRS.", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "31",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "FRI.", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.cloud),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "33",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "SAT.", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "36",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }





                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "SUN.", color = Color.White, fontSize = 12.sp)

                        Icon(
                            painter = painterResource(id = R.drawable.sun),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )


                        Row(
                        ) {
                            Text(
                                text = "33",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.round_circle_icon),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(7.dp)
                            )
                        }

                    }
                }


            }


        }
    }

}