package com.assignment1.mk.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.NotificationsNone
import androidx.compose.material.icons.filled.Sort
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Sort,
            contentDescription = null,
            Modifier.size(40.dp)
        )
        Row() {
            Icon(
                imageVector = Icons.Filled.NotificationsNone,
                contentDescription = null,
                Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.width(15.dp))
            Icon(
                imageVector = Icons.Filled.AccountCircle,
                contentDescription = null,
                Modifier.size(40.dp)
            )
        }

    }
}