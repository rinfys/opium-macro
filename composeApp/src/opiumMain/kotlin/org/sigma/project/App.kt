import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.TooltipArea
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.sigma.project.requests.MainRequests
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.width
import androidx.compose.material.ButtonDefaults

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFF161616)).border(1.dp, Color.Black),
        contentAlignment = Alignment.TopStart
    ) {
        TooltipArea(
            tooltip = {
                Box(
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(MainRequests.statusCode)
                }
            },
        ) {
        }
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 80.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).padding(30.dp).width(200.dp)
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                modifier = Modifier.align(Alignment.TopStart),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF222222))
            ) {
                Text("main:", color = Color(0xFFC6CDCD))
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                modifier = Modifier.align(Alignment.TopEnd),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF222222))
            ) {
                Text("settings:", color = Color(0xFFC6CDCD))
        }
        }
        Icon(
            painter = painterResource("menuimg.png"),
            tint = Color(0xFF434249),
            contentDescription = null,
            modifier = Modifier.padding(start = 30.dp, top = 30.dp),
        )
        Icon(
            painter = painterResource("X.png"),
            tint = Color(0xFF434249),
            contentDescription = null,
            modifier = Modifier.padding(start = 725.dp, top = 30.dp),
        )
    }
}