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
import org.sigma.project.requests.Discord

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    val rodcol = 0xFF060606
    val rodcol1 = 0xFF217189
    val profile1 = "Tabby.png"
    val profile2 = "bee1wind.png"
    val profile3 = "Gumball.png"
    val profile4 = "Diamond.png"
    var lineColor1 by remember { mutableStateOf(rodcol1) }
    var lineColor2 by remember { mutableStateOf(rodcol) }
    var lineColor3 by remember { mutableStateOf(rodcol) }
    var fieldchoicePF1: String
    var shapechoicePF1: String
    var fieldchoicePF2: String
    var shapechoicePF2: String
    var fieldchoicePF3: String
    var shapechoicePF3: String
    var fieldchoicePF4: String
    var shapechoicePF4: String
    val fields1 = listOf(
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
    val shapes1 = listOf(
        "squares",
        "snake",
        "e_lol",
        "typewriter",
        "superdog",
        "stationary",
        "cornerxsnake",
        "spiral",
        "cornerxe_lol",
    )
    val interfont = FontFamily(
        Font("font/Inter-VariableFont_opsz,wght.ttf", FontWeight.Normal)
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
    var isCheckedPF1 by remember { mutableStateOf(false) }
    var isCheckedPF2 by remember { mutableStateOf(false) }
    var isCheckedPF3 by remember { mutableStateOf(false) }
    var isCheckedPF4 by remember { mutableStateOf(false) }
    val expandedFields = remember { mutableStateListOf(false, false, false, false) }
    val expandedShapes = remember { mutableStateListOf(false, false, false, false) }
    val selectedFields = remember { mutableStateListOf("Choose field", "Choose field", "Choose field", "Choose field") }
    val selectedShapes = remember { mutableStateListOf("Choose shape", "Choose shape", "Choose shape", "Choose shape") }

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
                    painter = painterResource(profile1),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 15.dp, top = 15.dp)
                )
                Icon(painter = painterResource("ProfSettings.png"),
                    tint = Color(0xFF535353),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 181.dp, top = 85.dp).clickable {

                        // CLICKABLE
                        // CLICKABLE
                        // CLICKABLE

                    })
                Icon(painter = painterResource("Download.png"),
                    tint = Color(0xFF535353),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 182.dp, top = 60.dp).clickable {

                        // CLICKABLE DOWNLOAD
                        // CLICKABLE DOWNLOAD
                        // CLICKABLE DOWNLOAD

                    })
                // START OF PROFILE 1 FIELD DROPDOWN
                // START OF PROFILE 1 FIELD DROPDOWN
                // START OF PROFILE 1 FIELD DROPDOWN
                Box(
                    modifier = Modifier.padding(start = 70.dp, top = 40.dp)
                ) {
                    Button(
                        onClick = { expandedFields[0] = true },
                        modifier = Modifier.size(90.dp, 17.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            selectedFields[0], color = Color(0xFFFFFFFF), style = TextStyle(
                                fontFamily = monserratLight,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                fontSize = 10.sp
                            )
                        )
                    }
                    DropdownMenu(
                        expanded = expandedFields[0],
                        onDismissRequest = { expandedFields[0] = false },
                        modifier = Modifier.background(Color(0xFFFFFFFF))
                    ) {
                        fields1.forEach { itemF ->
                            DropdownMenuItem(onClick = {
                                selectedFields[0] = itemF
                                expandedFields[0] = false
                                fieldchoicePF1 = itemF
                                println("USER PICKED THE FIELD: $fieldchoicePF1 ON PROFILE 1")
                            }) {
                                Text(itemF)
                            }
                        }
                    }
                }
                // START OF PROFILE 1 SHAPES DROPDOWN
                // START OF PROFILE 1 SHAPES DROPDOWN
                // START OF PROFILE 1 SHAPES DROPDOWN
                Box(
                    modifier = Modifier.padding(start = 76.dp, top = 62.dp)
                ) {
                    Button(
                        onClick = { expandedShapes[0] = true },
                        modifier = Modifier.size(90.dp, 17.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                        contentPadding = PaddingValues(0.dp)
                    ) {
                        Text(
                            selectedShapes[0], color = Color(0xFFFFFFFF), style = TextStyle(
                                fontFamily = monserratLight,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                fontSize = 10.sp
                            )
                        )
                    }
                    DropdownMenu(
                        expanded = expandedShapes[0],
                        onDismissRequest = { expandedShapes[0] = false },
                        modifier = Modifier.background(Color(0xFFFFFFFF))
                    ) {
                        shapes1.forEach { itemSh ->
                            DropdownMenuItem(onClick = {
                                selectedShapes[0] = itemSh
                                expandedShapes[0] = false
                                shapechoicePF1 = itemSh
                                println("USER PICKED THE SHAPE: $shapechoicePF1 ON PROFILE 1")
                            }) {
                                Text(itemSh)
                            }
                        }
                    }
                }
                // CHECKBOX FOR PROFILE 1
                // CHECKBOX FOR PROFILE 1
                // CHECKBOX FOR PROFILE 1
                Row(
                    modifier = Modifier.padding(start = 170.dp, top = 0.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = isCheckedPF1,
                        onCheckedChange = { isCheckedPF1 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.White,
                            uncheckedColor = Color(0xFF535353),
                            checkmarkColor = Color(0xFF535353),
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    LaunchedEffect(isCheckedPF1) {
                        if (isCheckedPF1) {
                            println("THE USER CHECKED: $isCheckedPF1 ON PROFILE 1")
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
            // CHECKBOX FOR PROFILE 2
            // CHECKBOX FOR PROFILE 2
            // CHECKBOX FOR PROFILE 2
            Row(
                modifier = Modifier.padding(start = 170.dp, top = 0.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isCheckedPF2, onCheckedChange = { isCheckedPF2 = it }, colors = CheckboxDefaults.colors(
                        checkedColor = Color.White,
                        uncheckedColor = Color(0xFF535353),
                        checkmarkColor = Color(0xFF535353),
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                LaunchedEffect(isCheckedPF2) {
                    if (isCheckedPF2) {
                        println("THE USER CHECKED: $isCheckedPF2 ON PROFILE 2")
                    }
                }
            }
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
                painter = painterResource(profile2),
                contentDescription = null,
                modifier = Modifier.padding(start = 15.dp, top = 15.dp)
            )
            Icon(painter = painterResource("ProfSettings.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 181.dp, top = 85.dp).clickable {

                    // CLICKABLE
                    // CLICKABLE
                    // CLICKABLE

                })
            Icon(painter = painterResource("Download.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 182.dp, top = 60.dp).clickable {

                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD

                })
            // START OF PROFILE 2 FIELD DROPDOWN
            // START OF PROFILE 2 FIELD DROPDOWN
            // START OF PROFILE 2 FIELD DROPDOWN
            Box(
                modifier = Modifier.padding(start = 70.dp, top = 40.dp)
            ) {
                Button(
                    onClick = { expandedFields[1] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedFields[1], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedFields[1],
                    onDismissRequest = { expandedFields[1] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    fields1.forEach { itemF2 ->
                        DropdownMenuItem(onClick = {
                            selectedFields[1] = itemF2
                            expandedFields[1] = false
                            fieldchoicePF2 = itemF2
                            println("USER PICKED THE FIELD: $fieldchoicePF2 ON PROFILE 2")
                        }) {
                            Text(itemF2)
                        }
                    }
                }
            }
            // START OF PROFILE 2 SHAPES DROPDOWN
            // START OF PROFILE 2 SHAPES DROPDOWN
            // START OF PROFILE 2 SHAPES DROPDOWN
            Box(
                modifier = Modifier.padding(start = 76.dp, top = 62.dp)
            ) {
                Button(
                    onClick = { expandedShapes[1] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedShapes[1], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedShapes[1],
                    onDismissRequest = { expandedShapes[1] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    shapes1.forEach { itemSh2 ->
                        DropdownMenuItem(onClick = {
                            selectedShapes[1] = itemSh2
                            expandedShapes[1] = false
                            shapechoicePF2 = itemSh2
                            println("USER PICKED THE SHAPE: $shapechoicePF2 ON PROFILE 2")
                        }) {
                            Text(itemSh2)
                        }
                    }
                }
            }
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
            // CHECKBOX FOR PROFILE 3
            // CHECKBOX FOR PROFILE 3
            // CHECKBOX FOR PROFILE 3
            Row(
                modifier = Modifier.padding(start = 170.dp, top = 0.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isCheckedPF3, onCheckedChange = { isCheckedPF3 = it }, colors = CheckboxDefaults.colors(
                        checkedColor = Color.White,
                        uncheckedColor = Color(0xFF535353),
                        checkmarkColor = Color(0xFF535353),
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                LaunchedEffect(isCheckedPF3) {
                    if (isCheckedPF3) {
                        println("THE USER CHECKED: $isCheckedPF3 ON PROFILE 3")
                    }
                }
            }
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
                painter = painterResource(profile3), contentDescription = null, modifier = Modifier.padding(
                    start = 15.dp, top = 15.dp
                )
            )
            Icon(painter = painterResource("ProfSettings.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 181.dp, top = 85.dp).clickable {

                    // CLICKABLE
                    // CLICKABLE
                    // CLICKABLE

                })
            Icon(painter = painterResource("Download.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 182.dp, top = 60.dp).clickable {

                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD

                })
            // START OF PROFILE 3 FIELD DROPDOWN
            // START OF PROFILE 3 FIELD DROPDOWN
            // START OF PROFILE 3 FIELD DROPDOWN
            Box(
                modifier = Modifier.padding(start = 70.dp, top = 40.dp)
            ) {
                Button(
                    onClick = { expandedFields[2] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedFields[2], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedFields[2],
                    onDismissRequest = { expandedFields[2] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    fields1.forEach { itemF3 ->
                        DropdownMenuItem(onClick = {
                            selectedFields[2] = itemF3
                            expandedFields[2] = false
                            fieldchoicePF3 = itemF3
                            println("USER PICKED THE FIELD: $fieldchoicePF3 ON PROFILE 3")
                        }) {
                            Text(itemF3)
                        }
                    }
                }
            }

            // START OF PROFILE 3 SHAPES DROPDOWN
            // START OF PROFILE 3 SHAPES DROPDOWN
            // START OF PROFILE 3 SHAPES DROPDOWN
            Box(
                modifier = Modifier.padding(start = 76.dp, top = 62.dp)
            ) {
                Button(
                    onClick = { expandedShapes[2] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedShapes[2], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedShapes[2],
                    onDismissRequest = { expandedShapes[0] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    shapes1.forEach { itemSh3 ->
                        DropdownMenuItem(onClick = {
                            selectedShapes[2] = itemSh3
                            expandedShapes[2] = false
                            shapechoicePF3 = itemSh3
                            println("USER PICKED THE SHAPE: $shapechoicePF3 ON PROFILE 3")
                        }) {
                            Text(itemSh3)
                        }
                    }
                }

            }
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
            // CHECKBOX FOR PROFILE 4
            // CHECKBOX FOR PROFILE 4
            // CHECKBOX FOR PROFILE 4
            Row(
                modifier = Modifier.padding(start = 170.dp, top = 0.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isCheckedPF4, onCheckedChange = { isCheckedPF4 = it }, colors = CheckboxDefaults.colors(
                        checkedColor = Color.White,
                        uncheckedColor = Color(0xFF535353),
                        checkmarkColor = Color(0xFF535353),
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                LaunchedEffect(isCheckedPF4) {
                    if (isCheckedPF4) {
                        println("THE USER CHECKED: $isCheckedPF4 ON PROFILE 4")
                    }
                }
            }
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
                painter = painterResource(profile4),
                contentDescription = null,
                modifier = Modifier.padding(start = 15.dp, top = 15.dp)
            )
            Icon(painter = painterResource("ProfSettings.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 181.dp, top = 85.dp).clickable {

                    // CLICKABLE
                    // CLICKABLE
                    // CLICKABLE

                })
            Icon(painter = painterResource("Download.png"),
                tint = Color(0xFF535353),
                contentDescription = null,
                modifier = Modifier.padding(start = 182.dp, top = 60.dp).clickable {

                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD
                    // CLICKABLE DOWNLOAD

                })
            // START OF PROFILE 4 FIELD DROPDOWN
            // START OF PROFILE 4 FIELD DROPDOWN
            // START OF PROFILE 4 FIELD DROPDOWN
            Box(
                modifier = Modifier.padding(start = 70.dp, top = 40.dp)
            ) {
                Button(
                    onClick = { expandedFields[3] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedFields[3], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedFields[3],
                    onDismissRequest = { expandedFields[3] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    fields1.forEach { itemF4 ->
                        DropdownMenuItem(onClick = {
                            selectedFields[3] = itemF4
                            expandedFields[3] = false
                            fieldchoicePF4 = itemF4
                            println("USER PICKED THE FIELD: $fieldchoicePF4 ON PROFILE 4")
                        }) {
                            Text(itemF4)
                        }
                    }
                }
            }
            // START OF PROFILE 4 SHAPES DROPDOWN
            // START OF PROFILE 4 SHAPES DROPDOWN
            // START OF PROFILE 4 SHAPES DROPDOWN
            Box(
                modifier = Modifier.padding(start = 76.dp, top = 62.dp)
            ) {
                Button(
                    onClick = { expandedShapes[3] = true },
                    modifier = Modifier.size(90.dp, 17.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2A2A2A)),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        selectedShapes[3], color = Color(0xFFFFFFFF), style = TextStyle(
                            fontFamily = monserratLight,
                            fontWeight = FontWeight.Normal,
                            fontStyle = FontStyle.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
                DropdownMenu(
                    expanded = expandedShapes[3],
                    onDismissRequest = { expandedShapes[3] = false },
                    modifier = Modifier.background(Color(0xFFFFFFFF))
                ) {
                    shapes1.forEach { itemSh4 ->
                        DropdownMenuItem(onClick = {
                            selectedShapes[3] = itemSh4
                            expandedShapes[3] = false
                            shapechoicePF4 = itemSh4
                            println("USER PICKED THE SHAPE: $shapechoicePF4 ON PROFILE 4")
                        }) {
                            Text(itemSh4)
                        }
                    }
                }
            }
        }
    }
    // MAIN HUB
    Box(
        modifier = Modifier.padding(start = 30.dp, top = 150.dp)
            .background(Color(0xFF1B1B1B), shape = RoundedCornerShape(16.dp)).height(270.dp).width(150.dp)
    ) {
        Text("Active profile", color = Color(0xFFFFFFFF), style = TextStyle(
            fontFamily = monserratBold, fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = 20.sp), modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )
    }
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
            color = Color(lineColor1), start = Offset(50f, 88.5f), end = Offset(92f, 88.5f), strokeWidth = 1.dp.toPx()
        )
    }
    // Line 2
    Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
        drawLine(
            color = Color(lineColor2), start = Offset(160f, 88.5f), end = Offset(215f, 88.5f), strokeWidth = 1.dp.toPx()
        )
    }
    // Line 3
    Canvas(modifier = Modifier.fillMaxSize().padding(top = 50.dp)) {
        drawLine(
            color = Color(lineColor3), start = Offset(290f, 88.5f), end = Offset(315f, 88.5f), strokeWidth = 1.dp.toPx()
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
    Text(
        "version 1.0.32", color = Color(0xFFC6CDCD), style = TextStyle(
            fontFamily = interfont, fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal
        ), modifier = Modifier.padding(start = 660.dp, top = 425.dp)
    )
    // Settings
    Icon(painter = painterResource("Settings1.png"),
        tint = Color(0xFFA4A4A4),
        contentDescription = null,
        modifier = Modifier.padding(start = 700.dp, top = 31.dp).clickable {

        })
    // Close
    Icon(
        painter = painterResource("X.png"),
        tint = Color(0xFFA4A4A4),
        contentDescription = null,
        modifier = Modifier.padding(start = 725.dp, top = 30.dp).clickable {
            exitProcess(0)
            })
    }
