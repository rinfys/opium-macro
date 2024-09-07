import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.TooltipArea
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        TooltipArea(
            tooltip = {
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colors.surface)
                        .padding(8.dp)
                ) {
                    Text("this a opium macro")
                }
            },
            delayMillis = 600
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(16.dp)
            ) {
                Text("opium macro")
            }
        }
    }
}