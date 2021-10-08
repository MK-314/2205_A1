package com.assignment1.mk.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assignment1.mk.ui.ResourceColor


@Composable
fun HeaderView(text: String, view: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 15.dp)
    ) {
        Text(
            text = text,
            fontSize = 17.sp,
            letterSpacing = 1.05.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Start,
        )
        Text(
            text = view,
            fontSize = 15.sp,
            letterSpacing = 1.05.sp,
            fontWeight = FontWeight.Bold,
            color = ResourceColor.Orange,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(end = 15.dp)
        )
    }
}