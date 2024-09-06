package com.rharris.simpleapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rharris.simpleapp.ui.theme.SimpleAppTheme
import com.rharris.simpleapp.ui.theme.dolphinsAqua
import com.rharris.simpleapp.ui.theme.dolphinsOrange
import com.rharris.simpleapp.ui.theme.hornetsPurple
import com.rharris.simpleapp.ui.theme.hornetsTeal
import com.rharris.simpleapp.ui.theme.marlinsBlack
import com.rharris.simpleapp.ui.theme.marlinsBlue
import com.rharris.simpleapp.ui.theme.marlinsRed
import com.rharris.simpleapp.ui.theme.tarheelBlue
import com.rharris.simpleapp.ui.theme.tarheelWhite

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleAppTheme {
                    AppNavigation()
                }
            }
        }
    }

@Composable
fun Greeting(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = hornetsTeal)
            .padding(top = 70.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp), // adds space between text and the edge
                text = "Charlotte Hornets",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    color = hornetsPurple
                )
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 70.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Click below for Dolphins page",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = hornetsPurple
                    )
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    modifier = Modifier
                        .height(40.dp)
                        .width(200.dp),
                    onClick = { navController.navigate("dolphin_screen") },
                    colors = ButtonColors(
                        containerColor = hornetsPurple,
                        contentColor = hornetsTeal,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Gray
                    ),
                ) {
                    Text(
                        text = "To Dolphins Page",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 30.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Click below for Marlins page",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = hornetsPurple
                    )
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    modifier = Modifier
                        .height(40.dp)
                        .width(200.dp),
                    onClick = {navController.navigate("marlin_screen") },
                    colors = ButtonColors(
                        containerColor = hornetsPurple,
                        contentColor = hornetsTeal,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Gray
                    ),
                ) {
                    Text(
                        text = "To Marlins Page",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .padding(top = 30.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Click below for Tarheels page",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = hornetsPurple
                    )
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    modifier = Modifier
                        .height(40.dp)
                        .width(200.dp),
                    onClick = { navController.navigate("tarheel_screen")},
                    colors = ButtonColors(
                        containerColor = hornetsPurple,
                        contentColor = hornetsTeal,
                        disabledContainerColor = Color.Gray,
                        disabledContentColor = Color.Gray
                    ),
                ) {
                    Text(
                        text = "To Tarheels Page",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                    )
                    )
                }
            }
        }
        Image(
            painter = painterResource(id = R.drawable.hornets_logo_4),
            contentDescription = "Hornets Logo",
            modifier = Modifier
                .padding(50.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun DolphinScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = dolphinsOrange)
            .padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Miami Dolphins",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    color = dolphinsAqua
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 70.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Hornets page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = dolphinsAqua
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = dolphinsAqua,
                    contentColor = dolphinsOrange,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("greeting") },
            ) {
                Text(
                    text = "To Hornets Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Marlins page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = dolphinsAqua
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = dolphinsAqua,
                    contentColor = dolphinsOrange,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("marlin_screen") },
            ) {
                Text(
                    text = "To Marlins Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Tarheels page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    color = dolphinsAqua
                )
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                onClick = { navController.navigate("tarheel_screen")},
                colors = ButtonColors(
                    containerColor = dolphinsAqua,
                    contentColor = dolphinsOrange,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
            ) {
                Text(
                    text = "To Tarheels Page",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.miami_dolphins_logo),

            contentDescription = "Dolphins Logo",
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()
                .width(200.dp)
                .height(200.dp)
        )
    }
}

@Composable
fun MarlinScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = marlinsBlack)
            .padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Miami Marlins",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    color = marlinsBlue
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 70.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Hornets page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = marlinsBlue
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = marlinsBlue,
                    contentColor = marlinsRed,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("greeting") },
            ) {
                Text(
                    text = "To Hornets Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Dolphins page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = marlinsBlue
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = marlinsBlue,
                    contentColor = marlinsRed,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("dolphin_screen") },
            ) {
                Text(
                    text = "To Dolphins Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Tarheels page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = marlinsBlue
                )
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                onClick = { navController.navigate("tarheel_screen")},
                colors = ButtonColors(
                    containerColor = marlinsBlue,
                    contentColor = marlinsRed,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
            ) {
                Text(
                    text = "To Tarheels Page",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.marlins_logo),
            contentDescription = "Marlins Logo",
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun TarheelScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = tarheelBlue)
            .padding(top = 70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Carolina Tarheels",
                style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    color = tarheelWhite
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 70.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Hornets page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = tarheelWhite
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = tarheelWhite,
                    contentColor = tarheelBlue,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("greeting") },
            ) {
                Text(
                    text = "To Hornets Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Dolphins page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = tarheelWhite
                )
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                colors = ButtonColors(
                    containerColor = tarheelWhite,
                    contentColor = tarheelBlue,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
                onClick = { navController.navigate("dolphin_screen") },
            ) {
                Text(
                    text = "To Dolphins Page",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Click below for Marlins page",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = tarheelWhite
                )
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier
                    .height(40.dp)
                    .width(200.dp),
                onClick = { navController.navigate("marlin_screen")},
                colors = ButtonColors(
                    containerColor = tarheelWhite,
                    contentColor = tarheelBlue,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Gray
                ),
            ) {
                Text(
                    text = "To Marlins Page",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                )
            }
        }
        Image(
            painter = painterResource(id = R.drawable.tarheel_logo),
            contentDescription = "Tarheel Logo",
            modifier = Modifier
                .padding(top = 80.dp)
                .fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun PrevDolphinScreen() {
    val navController = rememberNavController()
    DolphinScreen(navController = navController)
}

@Preview
@Composable
fun PrevMarlinScreen() {
    val navController = rememberNavController()
    MarlinScreen(navController = navController)
}

@Preview
@Composable
fun PrevTarheelScreen() {
    val navController = rememberNavController()
    TarheelScreen(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun PrevGreeting() {
    AppNavigation()
}