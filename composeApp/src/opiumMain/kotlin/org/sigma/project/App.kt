import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.sigma.project.requests.MainRequests
import kotlin.system.exitProcess

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    var rodcol: Long = 0xFF060606
    var rodcol1: Long = 0xFF217189
    var lineColor1 by remember { mutableStateOf(rodcol1) }
    var lineColor2 by remember { mutableStateOf(rodcol) }
    var lineColor3 by remember { mutableStateOf(rodcol) }

    val monserratFont = FontFamily(
        Font("font/Montserrat-ExtraLight.ttf", FontWeight.Normal)
    )

    Column {
        Box(
            modifier = Modifier.padding(start = 80.dp, top = 150.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(270.dp).width(150.dp),
        )
    }
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
        ) {}
        // other
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 150.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(270.dp).width(150.dp),
        )
        // buttons hub
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 80.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).padding(5.dp).width(300.dp),
        ) {
            Button(
                onClick = {
                    lineColor1 = 0xFF217189
                    lineColor2 = 0xFF060606
                    lineColor3 = 0xFF060606
                },
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterStart),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text("main", color = Color(0xFFC6CDCD), style = TextStyle(
                    fontFamily = monserratFont,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                ))
            }

            Button(
                onClick = {
                    lineColor1 = 0xFF060606
                    lineColor2 = 0xFF217189
                    lineColor3 = 0xFF060606
                },
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterStart).padding(start = 108.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text("addons", color = Color(0xFFC6CDCD), style = TextStyle(
                    fontFamily = monserratFont,
                    fontWeight = FontWeight.Normal,
                    fontStyle = FontStyle.Normal
                ))
            }

            Button(
                onClick = {
                    lineColor1 = 0xFF060606
                    lineColor2 = 0xFF060606
                    lineColor3 = 0xFF217189
                },
                shape = RoundedCornerShape(0.dp),
                modifier = Modifier.align(Alignment.CenterEnd),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                elevation = null
            ) {
                Text(
                    "user", color = Color(0xFFC6CDCD), style = TextStyle(
                        fontFamily = monserratFont,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal
                    )
                )
            }
        }

        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor1),
                start = Offset(50f, 88.5f),
                end = Offset(92f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }

        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor2),
                start = Offset(160f, 88.5f),
                end = Offset(215f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }

        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor3),
                start = Offset(290f, 88.5f),
                end = Offset(315f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }

        Image(
            painter = painterResource("sig.png"),
            contentDescription = null,
            modifier = Modifier.padding(5.dp).padding(start = 20.dp, top = 20.dp),
        )

        Icon(
            painter = painterResource("Settings.png"),
            tint = Color(0xFFB7B7B7),
            contentDescription = null,
            modifier = Modifier.padding(start = 700.dp, top = 30.dp).clickable {

            },
        )

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