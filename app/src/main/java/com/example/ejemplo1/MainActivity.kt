package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme{
                GreetingPreview()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
    Content()
}

@Composable
fun Content(){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        SimpleImage()
        SimpleButton()
    }
}

@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.descuento),
        contentDescription = "Cuphead",
        modifier = Modifier.fillMaxWidth(),
        alignment = Alignment.TopCenter
    )
}

@Composable
fun TextField1():TextFieldValue {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column (
        modifier = Modifier.padding(top = 20.dp)
    ){
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "Precio") },
            placeholder = { Text(text = "Ingresa el precio") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
    return text
}

@Composable
fun TextField2():TextFieldValue {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Column (
        modifier = Modifier.padding(top = 20.dp)
    ){
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text(text = "Descuento") },
            placeholder = { Text(text = "Valor del descuento") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
    return text
}

@Composable
fun SimpleButton() {
    var numero1 = TextField1()
    var numero2 = TextField2()
    var descuento by remember { mutableStateOf(0.0)}
    var final by remember { mutableStateOf(0.0)}
    Button(
        onClick = { /* Acción al hacer clic */
            val precio = numero1.text.toDouble()
            val porcentajeDescuento = numero2.text.toDouble()
            descuento = precio * (porcentajeDescuento / 100)
            final = precio - descuento
        },
        modifier = Modifier
            .padding(top = 10.dp) // Agrega 32.dp de padding en la parte superior
    ) {
        Text("Calcular")
    }

    Text(
        text = "Precio final: $final",
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(10.dp)
    )
}