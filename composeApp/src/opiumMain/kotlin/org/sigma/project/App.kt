import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import kotlin.system.exitProcess

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    val rodcol = 0xFF060606
    val rodcol1 = 0xFF217189
    var lineColor1 by remember { mutableStateOf(rodcol1) }
    var lineColor2 by remember { mutableStateOf(rodcol) }
    var lineColor3 by remember { mutableStateOf(rodcol) }
    val items1 = listOf(
        "Rose",
        "Bamboo",
        "Mountain Top",
        "Dandelion",
        "Sunflower",
        "Blue Flower",
        "Mushroom",
        "Clover",
        "Pine Tree",
        "Pepper",
        "Pineapple",
        "Spider",
        "Strawberry",
        "Coconut",
        "Stump",
        "Pumpkin",
        "Cactus"
    )

    val monserrat = FontFamily(
        Font("font/Montserrat-Black.ttf", FontWeight.Normal)
    )
    val monserratLight = FontFamily(
        Font("font/Montserrat-Light.ttf", FontWeight.Normal)
    )
    val monserratBold = FontFamily(
        Font("font/Montserrat-Bold.ttf", FontWeight.Normal)
    )

    var expanded by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf("Choose field") }

    Box(
        modifier = Modifier.fillMaxSize().background(Color(0xFF161616)).border(1.dp, Color.Black),
        contentAlignment = Alignment.TopStart
    ) {
        // PROFILE 1 [OPIUM]
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                modifier = Modifier.padding(start = 194.dp, top = 165.dp)
                    .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(113.dp).width(210.dp)
            ) {
                Text(
                    "PROFILE 1", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratBold,
   baselineShift = ,,                       fontWeigh ght.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 20.sp
                    ), modifier = Modifier.padding(start = 36.dp, top = 13.dp)
                )
                Text(
                    "FIELD", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 42.dp)
                )
                Text(
                    "SHAPE", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 64.dp)
                )
                Image(
                    painter = painterResource("Tabby.png"),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Box(
                    modifier = Modifier.padding(start = 70.dp, top = 40.dp)
                ) {
                    Button(
                        onClick = { expanded = true },
                        modifier = Modifier.size(90.dp, 17.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            selectedItem, color = Color(0xFFFFFFFF), style = TextStyle(
                                fontFamily = monserratLight,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                fontSize = 10.sp
                            )
                        )
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier.background(Color(0xFFFFFFFF))
                    ) {
                        items1.forEach { item ->
                            DropdownMenuItem(onClick = {
                                selectedItem = item
                                expanded = false
                            }) {
                                Text(item)
                            }
                        }
                    }
                }
            }
        }

        // PROFILE 2 [OPIUM]
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                modifier = Modifier.padding(start = 194.dp, top = 290.dp)
                    .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(113.dp).width(210.dp)
            ) {
                Text(
                    "PROFILE 2", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratBold,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 20.sp
                    ), modifier = Modifier.padding(start = 36.dp, top = 13.dp)
                )
                Text(
                    "FIELD", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 42.dp)
                )
                Text(
                    "SHAPE", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 64.dp)
                )
                Image(
                    painter = painterResource("bee1wind.png"),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
            }
        }

        // PROFILE 3 [OPIUM]
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                modifier = Modifier.padding(start = 414.dp, top = 165.dp)
                    .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(113.dp).width(210.dp)
            ) {
                Text(
                    "PROFILE 3", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratBold,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 20.sp
                    ), modifier = Modifier.padding(start = 36.dp, top = 13.dp)
                )
                Text(
                    "FIELD", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 42.dp)
                )
                Text(
                    "SHAPE", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 64.dp)
                )
                Image(
                    painter = painterResource("Gumball.png"),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
            }
        }

        // PROFILE 4 [OPIUM]
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Box(
                modifier = Modifier.padding(start = 414.dp, top = 290.dp)
                    .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(113.dp).width(210.dp)
            ) {
                Text(
                    "PROFILE 4", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratBold,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 20.sp
                    ), modifier = Modifier.padding(start = 36.dp, top = 13.dp)
                )
                Text(
                    "FIELD", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 42.dp)
                )
                Text(
                    "SHAPE", color = Color(0xFFFFFFFF), style = TextStyle(
                        fontFamily = monserratLight,
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                        fontSize = 13.sp
                    ), modifier = Modifier.padding(start = 24.dp, top = 64.dp)
                )
                Image(
                    painter = painterResource("Diamond.png"),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
            }
        }
        // MAIN HUB
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 150.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(270.dp).width(150.dp)
        )
        // Thing
        Box(
            modifier = Modifier.padding(start = 30.dp, top = 80.dp)
                .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).padding(5.dp).width(300.dp)
        ) {
            // Button 1
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
                Text(
                    "main", color = Color(0xFFC6CDCD), style = TextStyle(
                        fontFamily = monserratLight, fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal
                    )
                )
            }
            // Button 2
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
                Text(
                    "addons", color = Color(0xFFC6CDCD), style = TextStyle(
                        fontFamily = monserratLight, fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal
                    )
                )
            }
            // Button 3
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
                        fontFamily = monserratLight, fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal
                    )
                )
            }
        }
        // Line 1
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor1),
                start = Offset(50f, 88.5f),
                end = Offset(92f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        // Line 2
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor2),
                start = Offset(160f, 88.5f),
                end = Offset(215f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        // Line 3
        Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
            drawLine(
                color = Color(lineColor3),
                start = Offset(290f, 88.5f),
                end = Offset(315f, 88.5f),
                strokeWidth = 1.dp.toPx()
            )
        }
        // Logo icon
        Image(
            painter = painterResource("sig.png"),
            contentDescription = null,
            modifier = Modifier.padding(5.dp).padding(start = 20.dp, top = 20.dp)
        )
        // Github icon
        Image(
            painter = painterResource("Github.png"),
            contentDescription = null,
            modifier = Modifier.padding(5.dp).padding(start = 72.dp, top = 26.dp)
        )
        // Settings
        Icon(painter = painterResource("Icon.png"),
            tint = Color(0xFFA4A4A4),
            contentDescription = null,
            modifier = Modifier.padding(start = 700.dp, top = 31.dp).clickable {

            })
        // Close
        Icon(painter = painterResource("X.png"),
            tint = Color(0xFFA4A4A4),
            contentDescription = null,
            modifier = Modifier.padding(start = 725.dp, top = 30.dp).clickable {
                exitProcess(0)
            })
    }
}