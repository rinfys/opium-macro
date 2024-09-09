package org.sigma.project

import App
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.Alignment

fun main() = application {
    val windowState = rememberWindowState(width = 775.dp, height = 442.dp)
    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "opium macro",
        resizable = false,
        undecorated = true
    ) {
        val imageWindowState = rememberWindowState(
            width = 200.dp,
            height = 200.dp,
            position = WindowPosition(Alignment.TopStart)
        )
        Window(
            onCloseRequest = {},
            state = rememberWindowState(width = 200.dp, height = 200.dp),
            undecorated = true,
            transparent = true
        ) {
            Box(
                modifier = Modifier.fillMaxSize().background(Color.Transparent)
            ) {
                Image(
                    painter = painterResource("tosha.png"),
                    contentDescription = null,
                    modifier = Modifier.padding(5.dp)
                )
            }
        App()
        }
    }
}