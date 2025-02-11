package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                GreetingPreview()

            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview(){
        Content(mensaje1 = "Hello", mensaje2 = "Mundo")
    }
    @Composable
    fun Content(mensaje1:String, mensaje2:String){
        Column { //Row{
            Text(mensaje1,
                fontSize = 50.sp)
            Text(mensaje2,
                lineHeight = 30.sp) //lineHeight es para la separacion entre las palabras
            Text("Alondra",
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                lineHeight = 32.sp)
        }
    }
}