package com.assignment1.mk.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.assignment1.mk.ui.ResourceColor

@Composable
fun PlanCard(
    modifier: Modifier = Modifier,
    month: String,
    textBold: String,
    desc: String,
    showLastRow: Boolean,
    image: Painter,
    imageLastRow: Painter,
    textBtn: String,
    time: String
) {
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(20))
            .background(color = Color.White),
    ) {
        // Icon and Its column:
        Column(
            modifier = Modifier
                .weight(2f)
                .padding(
                    top = 10.dp,
                    start = 15.dp
                )
        ) {
            RoundImage(
                image = image,
                modifier = Modifier
                    .size(50.dp)
            )
        }
        // Right Area Column:
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .weight(7f)
        ) {
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = month,
                    fontSize = 12.sp,
                    letterSpacing = 1.05.sp,
                    fontWeight = FontWeight.Bold,
                    color = ResourceColor.Blue,
                    textAlign = TextAlign.Start,
                )
            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                Text(
                    text = textBold,
                    fontSize = 15.sp,
                    letterSpacing = .7.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                )
                Text(
                    text = time,
                    fontSize = 15.sp,
                    letterSpacing = .7.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(end = 20.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                Text(
                    text = desc,
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Italic,
                    letterSpacing = .7.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(end = 20.dp)
                )
            }
            if (showLastRow) {
                Row(
                    verticalAlignment = Alignment.Top,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 5.dp, bottom = 10.dp)
                ) {
                    Image(
                        painter = imageLastRow,
                        contentDescription = "Avatars",
                        modifier = Modifier
                            .weight(4f)
                            .padding(end = 5.dp)
                    )
                    Spacer(modifier = Modifier.weight(.2f))
                    TextButton(
                        onClick = { },
                        Modifier
                            .border(
                                2.dp,
                                color = ResourceColor.Orange,
                                shape = RoundedCornerShape(60)
                            )
                            .clip(RoundedCornerShape(60))
                            .background(color = Color.White)
                            .weight(4f)
                    ) {
                        Text(
                            text = textBtn,
                            color = ResourceColor.Orange,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            } else {
                Spacer(modifier = Modifier.padding(bottom = 10.dp))
            }
        }
    }
}