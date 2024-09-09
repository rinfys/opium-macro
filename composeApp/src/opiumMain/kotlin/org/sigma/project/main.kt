package org.sigma.project

import App
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@OptIn(ExperimentalComposeUiApi::class)
fun main() = application {
    val windowopened = remember { mutableStateOf(false) }
    val mainWindowState = rememberWindowState(width = 775.dp, height = 442.dp)
    val secondWindowState = rememberWindowState(
        width = 100.dp,
        height = 100.dp,
        position = WindowPosition(780.dp, 460.dp)
    )
    var alwaysOnTop by remember { mutableStateOf(true) }

    Window(
        onCloseRequest = ::exitApplication,
        state = mainWindowState,
        title = "opium macro",
        resizable = false,
        undecorated = true
    ) {
        App()
    }
    Window(
        onCloseRequest = {},
        state = secondWindowState,
        resizable = false,
        undecorated = true,
        transparent = true,
        alwaysOnTop = alwaysOnTop,
        focusable = true
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .onFocusChanged {
                    alwaysOnTop = it.isFocused
                }
        ) {
            Image(
                painter = painterResource("tosha.png"),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}