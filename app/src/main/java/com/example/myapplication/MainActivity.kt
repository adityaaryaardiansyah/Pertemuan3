package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    imageback(pengirim = "PENDI",
                        isi = stringResource(R.string.HARTAKARUN),
                        judul = stringResource(R.string.KANGTF))
                }
            }
        }
    }
}

@Composable
fun GreetingText(pengirim: String, isi: String, judul: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
    )

    Column (
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text =judul,
            fontSize = 55.sp,
            textAlign = TextAlign.Center,
            lineHeight = 80.sp

        )
    }
    Column(
        verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()
    ){
        Text(
            text =isi,
            fontSize = 45.sp,
            textAlign = TextAlign.Center,
            lineHeight = 45.sp
        )
    }
    Column (
        verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End, modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text =pengirim,
            fontSize = 50.sp,
            textAlign = TextAlign.End,
        )

    }
}
@Composable
fun imageback(pengirim: String, isi: String, judul: String, modifier: Modifier = Modifier){
    val Gambar = painterResource(R.drawable.dana)
    Box {
        Image(
            painter = Gambar,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.5F,
            contentScale = ContentScale.Crop

        )
        GreetingText(
            isi = isi,
            pengirim = pengirim,
            judul = judul, modifier = Modifier.fillMaxSize())}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        imageback(pengirim = "PENDI",
            isi = stringResource(R.string.HARTAKARUN),
            judul = stringResource(R.string.KANGTF))
    }
}