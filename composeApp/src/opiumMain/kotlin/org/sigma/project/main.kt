package org.sigma.project

import App
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState(width = 800.dp, height = 450.dp)
    Window(
        onCloseRequest = ::exitApplication,
        state = windowState,
        title = "opium macro",
        resizable = false,
        undecorated = true
    ) {
        App()
    }
}