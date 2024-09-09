import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import org.sigma.project.requests.MainRequests
import kotlin.system.exitProcess

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
            modifier = Modifier.padding(start = 30.dp, top = 150.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(270.dp).width(150.dp),
        )
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 80.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).padding(5.dp).width(300.dp),
        ) {
            Button(
                onClick = {},
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterStart),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text("main:", color = Color(0xFFC6CDCD))
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterStart).padding(start = 89.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text("settings:", color = Color(0xFFC6CDCD))
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterEnd),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text("addons:", color = Color(0xFFC6CDCD))
            }
        }
        // blu one
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(0xFF15AEFF),
                start = androidx.compose.ui.geometry.Offset(50f, 88.5f),
                end = androidx.compose.ui.geometry.Offset(94f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        // darker one
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(0xFF060606),
                start = androidx.compose.ui.geometry.Offset(140f, 88.5f),
                end = androidx.compose.ui.geometry.Offset(210f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(0xFF060606),
                start = androidx.compose.ui.geometry.Offset(254f, 88.5F),
                end = androidx.compose.ui.geometry.Offset(318f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        // logo
        Image(
            painter = painterResource("sig.png"),
            contentDescription = null,
            modifier = Modifier.padding(5.dp).padding(start = 20.dp, top = 20.dp),
        )
        // settings
        Icon(
            painter = painterResource("Settings.png"),
            tint = Color(0xFFB7B7B7),
            contentDescription = null,
            modifier = Modifier.padding(start = 700.dp, top = 30.dp).clickable
            {

            },
        )
        // close
        Icon(
            painter = painterResource("X.png"),
            tint = Color(0xFFB7B7B7),
            contentDescription = null,
            modifier = Modifier.padding(start = 725.dp, top = 30.dp).clickable {
                exitProcess(0)
            },

            )
    }
}