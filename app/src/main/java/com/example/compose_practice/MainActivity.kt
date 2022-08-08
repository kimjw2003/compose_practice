package com.example.compose_practice

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_practice.ui.theme.Compose_practiceTheme
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_practiceTheme {
                Surface(
                    color = MaterialTheme.colors.primary,
                ) {
                    Section(name = "Kim")
                }
            }
        }
    }
}

@Composable
fun Section(name: String) {
    val mContext = LocalContext.current
    Scaffold {
        Row(
            Modifier.padding(top = 10.dp)
        ) {
            Column(
                Modifier.padding(start = 20.dp)
            ) {
                Text(
                    text = "1번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "1번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "2번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "2번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
                Text(
                    text = "3번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "3번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "4번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "4번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
            }
            Column {
                Text(
                    text = "5번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "5번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "6번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "6번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
                Text(
                    text = "7번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "7번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "8번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "8번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
            }
            Column {
                Text(
                    text = "9번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "9번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "10번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "10번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
                Text(
                    text = "11번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "11번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "12번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "12번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
            }
            Column {
                Text(
                    text = "13번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "13번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "14번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "14번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
                Text(
                    text = "15번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "15번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                    ),
                )
                Text(
                    text = "16번 $name!",
                    Modifier
                        .size(size = 100.dp)
                        .background(Color.LightGray)
                        .border(width = 0.5.dp, color = Color.White)
                        .clickable(onClick = {
                            showToast(mContext, text = "16번 $name")
                        }),
                    style = TextStyle(
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                    ),
                )
            }
        }
    }
}


@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    Compose_practiceTheme {
        Section(name = "Android")
    }
}


fun showToast(context: Context, text: String) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}
