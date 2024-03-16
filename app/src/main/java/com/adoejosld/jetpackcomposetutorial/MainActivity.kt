package com.adoejosld.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComponents()
        }
    }
}

@Composable
fun MyComponents() {
    Row {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts() {
    Column {
        MyText(text = "Hola Jetpack Compose")
        MyText("Soy Aramis")
        MyText(text = "Aprendo a Programar")
    }
}


@Composable
fun MyImage() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Imagen de Prueba"
    )
}


@Composable
private fun MyText(text: String) {
    Text(text)
}

@Preview
@Composable
fun PreviewComponent() {
    MyComponents()
}

