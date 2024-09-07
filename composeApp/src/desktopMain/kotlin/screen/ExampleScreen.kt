package screen

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen

class ExampleScreen : Screen {
    @Composable
    override fun Content() {
        ScrollableList()
    }
}

fun ScrollableList() {
    val verticalScroll = rememberScrollState(0)
    val horizontalScroll = rememberScrollState(0)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 12.dp, bottom = 12.dp)
    ) {
       for (item in 0..30) {
           Text(
               modifier = Modifier.padding(all = 12.dp),
               text = "This is the item number #$item"
           )
       }
    }
    VerticalScrollbar(
        modifier = 
    )
}