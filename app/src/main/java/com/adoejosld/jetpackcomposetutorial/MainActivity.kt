package com.adoejosld.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adoejosld.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                MyComponents()
            }
        }
    }
}

@Composable
fun MyComponents() {
    Row(modifier = Modifier.padding(all = 12.dp)) {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts() {
    Column(modifier = Modifier.padding(all = 8.dp)) {
        MyText(text = "Hola Jetpack Compose", Color.Black)
        Spacer(modifier = Modifier.heightIn(6.dp))
        MyText("Soy Aramis", Color.Blue)
        Spacer(modifier = Modifier.heightIn(6.dp))
        MyText(text = "Aprendo a Programar", Color.Red)
    }
}

@Composable
fun MyImage() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Imagen de Prueba",
        modifier = Modifier
            .size(85.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}

@Composable
private fun MyText(text: String, color: Color) {
    Text(text, color = color)
}

@Preview
@Composable
fun PreviewComponent() {
    MyComponents()
}

