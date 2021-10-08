package com.assignment1.mk.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.assignment1.mk.components.HeaderView
import com.assignment1.mk.components.PlanCard
import com.assignment1.mk.components.TopBar
import com.assignment1.mk.navigation.Screen
import com.assignment1.mk.ui.ResourceColor

@Composable
fun PlannerScreen(navController: NavController) {
    val fabShape = RoundedCornerShape(50)
    val selectedItem = remember { mutableStateOf("value") }
    Scaffold(
        modifier = Modifier
            .background(color = ResourceColor.DarkBlue),
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = ResourceColor.DefaultBg)
                    .padding(10.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                TopBar()
                TextDayPlanner()
                HeaderView(text = "Invitation", view = "View all")
                PlanCard(
                    month = "Sep 20, 2021",
                    textBold = "Workshop Design",
                    time = "08:00 AM",
                    desc = "Workshop that discusses design freelance on the 3rd floor ICT Building",
                    showLastRow = true,
                    image = painterResource(id = com.assignment1.mk.R.drawable.groupofpeople),
                    imageLastRow = painterResource(com.assignment1.mk.R.drawable.avatars1),
                    textBtn = "Accept"
                )
                HeaderView(text = "Upcoming Plans", view = "View all")
                repeat(3){
                    PlanCard(
                        month = "Oct 08, 2021",
                        textBold = "2205 Android",
                        time = "09:30 AM",
                        desc = "Jetpack Compose is Android's modern toolkit for building native UI. t simplifies and accelerates UI development on Android",
                        showLastRow = false,
                        image = painterResource(id = com.assignment1.mk.R.drawable.human_avatar),
                        imageLastRow = painterResource(com.assignment1.mk.R.drawable.avatars1),
                        textBtn = "Accept"
                    )
                    PlanCard(
                        month = "Oct 11, 2021",
                        textBold = "Small Meeting",
                        time = "11:00 AM",
                        desc = "Will be thinking about new app's features",
                        showLastRow = false,
                        image = painterResource(id = com.assignment1.mk.R.drawable.groupofpeople),
                        imageLastRow = painterResource(com.assignment1.mk.R.drawable.avatars1),
                        textBtn = "Accept"
                    )
                }
                Spacer(modifier = Modifier.padding(bottom = 200.dp))
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = fabShape,
                backgroundColor = ResourceColor.Orange,
                contentColor = Color.White
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center,

        bottomBar = {
            BottomAppBar(
                cutoutShape = fabShape,
                backgroundColor = Color.White,
                content = {
                    BottomNavigation( backgroundColor = Color.White,) {
                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.Home, "")
                            },
                            label = { Text(text = "Home") },
                            selected = selectedItem.value == "home",
                            onClick = { navController.navigate(Screen.WelcomeScreen.route) },
                            alwaysShowLabel = false
                        )
                        BottomNavigationItem(
                            icon = {
                                Icon(Icons.Filled.EventNote, "")
                            },
                            label = { Text(text = "Calendar") },
                            selected = selectedItem.value == "calendar",
                            onClick = {

                            },
                            alwaysShowLabel = false
                        )
                    }
                }
            )
        }
    )
}


@Composable
fun TextDayPlanner() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 15.dp)
    ) {
        Text(
            text = "Hello Yudhvir",
            fontSize = 15.sp,
            letterSpacing = 1.2.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            textAlign = TextAlign.Start,
        )
        Icon(
            imageVector = Icons.Filled.Soap,
            contentDescription = null,
            tint = ResourceColor.Orange,
            modifier = Modifier.padding(bottom = 5.dp, start = 10.dp)
        )

    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp, start = 15.dp)
    ) {
        Text(
            text = "Let's Planning your day",
            fontSize = 20.sp,
            letterSpacing = 1.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start,
        )
    }

}
