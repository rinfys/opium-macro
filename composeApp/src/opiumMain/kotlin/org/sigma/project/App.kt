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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.sigma.project.requests.MainRequests
import androidx.compose.foundation.border
import opium_macro.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161616))
            .border(1.dp, Color.Black),
        contentAlignment = Alignment.TopStart
    ) {
        TooltipArea(
            tooltip = {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Text(MainRequests.statusCode)
                }
            },
        ) {
            Button(
                onClick = {},
                modifier = Modifier.padding(start = 15.dp, top = 10.dp),
                shape = RoundedCornerShape(16.dp)
            ) {
                Text("Button")
            }
        }
    }
}