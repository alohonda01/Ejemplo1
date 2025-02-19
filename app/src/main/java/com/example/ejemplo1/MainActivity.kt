package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplo1.ui.theme.Ejemplo1Theme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


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
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SimpleImage()
        TextFieldPlaceholder1()
        TextFieldPlaceholder2()
        SimpleButton()
    }
}

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.fondo_cuphead),
        contentDescription = "Cuphead",
        modifier = Modifier.fillMaxWidth(),
        alignment = Alignment.TopCenter
    )
}

@Composable
fun TextFieldPlaceholder1(){
    var text by remember {mutableStateOf("")}
    Column(
        modifier = Modifier.padding(top = 30.dp, bottom = 10.dp),
    ){
        TextField(
            value = text,
            onValueChange = { newText ->
                text=newText
            },
            //label = {Text("")} ,
            placeholder = {Text("Valor 1")},
            
        )
        //Text(text = "Tu nombre es: $text")
    }
}

@Composable
fun TextFieldPlaceholder2(){
    var text by remember {mutableStateOf("")}
    Column(
        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
    ){
        TextField(
            value = text,
            onValueChange = { newText ->
                text=newText
            },
            //label = {Text("")} ,
            placeholder = {Text("Valor 2")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

    }
}

@Composable
fun SimpleButton() {
    Button(
        onClick = { /* Acción al hacer clic */ },
        modifier = Modifier
            .padding(top = 10.dp) // Agrega 32.dp de padding en la parte superior

    ) {
        Text("Calcular")
    }
}