package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Column {
        Content1()
        Content2()
        Content3()
        Content4()
        Content5()
    }
}

@Composable
fun Content1(){
    Text("ALONDRA VICTORIA OLVERA MARTINEZ",
        Modifier
            .padding(32.dp)
            .background(color = Color.Green)
    )
}

@Composable
fun Content2(){
    Text("ALONDRA VICTORIA OLVERA MARTINEZ",
        color = Color.Red,
        modifier = Modifier
            .padding(32.dp)
            .background(color = Color.Yellow)
    )
}

@Composable
fun Content3(){
    Text(
        text = "Tamaño de Texto",
        color = Color.White,
        modifier = Modifier
            .padding(32.dp)
            .background(Color.Cyan)
            .size(width=250.dp, height = 100.dp)
    )
}

@Composable
fun Content4(){
    Text(
        text = "Alondra Victoria Olvera Martinez",
        color = Color.White,
        modifier = Modifier
            .background(Color.Gray)
            .padding(Dp(40f))
            .fillMaxWidth(1f)
    )
}

@Composable
fun Content5(){
    Text(
        text = " Text with 75% Height ",
        color = Color.White,
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.75f) //75% area fill
    )
}