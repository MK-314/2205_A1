package com.assignment1.mk.screens


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.assignment1.mk.R
import com.assignment1.mk.navigation.Screen
import com.assignment1.mk.ui.ResourceColor


@Composable
fun WelcomeScreen(navController: NavController) {

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp)
                    .verticalScroll(rememberScrollState())
                    .background(color = ResourceColor.DarkBlue),
            ) {
                MainCalendarImg()
                DescText(
                    text = "Manage Your Plans\nEasily on Phone",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                DescText(
                    text = "The Best app for management\nyour plans easily on mobile phone",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                )
                ContinueBtn(navController = navController)
                Spacer(modifier = Modifier.height(10.dp))
                DescText(
                    text = "Have another account? ",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Normal,
                    login = true
                )
            }
        }
    )
}

@Composable
fun ContinueBtn(navController: NavController) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)
    ) {
        TextButton(
            onClick = { navController.navigate(Screen.PlannerScreen.route) },
            Modifier
                .border(4.dp, color = Color.Transparent, shape = RoundedCornerShape(60))
                .clip(RoundedCornerShape(60))
                .background(color = ResourceColor.Orange)

        ) {
            Text(
                text = "Continue as Yudhvir",
                Modifier
                    .padding(horizontal = 60.dp, vertical = 11.dp),
                color = Color.White,
                fontSize = 17.sp,
                fontStyle = FontStyle.Italic
            )
        }
    }
}

@Composable
private fun DescText(
    text: String,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    login: Boolean = false
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = fontSize,
            fontWeight = fontWeight,
            textAlign = TextAlign.Center,
            letterSpacing = 1.8.sp,
        )
        if (login) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = ResourceColor.Blue,
                        fontSize = fontSize,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.8.sp,
                    )) {
                        append("LogIn")
                    }
                }
            )
        }
    }
}

@Composable
private fun MainCalendarImg() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 60.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.calendar_img2),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .size(350.dp)
                .weight(1f)
        )
    }
}