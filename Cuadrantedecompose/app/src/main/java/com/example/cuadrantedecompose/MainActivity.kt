package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadrantesJuntos()
                }
            }
        }
    }
}

@Composable
fun CuadrantesJuntos(){
    Column (Modifier.fillMaxWidth()) {
        Row (Modifier.weight(1f)){
            Cuadrante(
                title = stringResource(R.string.textComposable),
                textDisplayed = stringResource(R.string.textDescription),
                colorFondo = 0xFFEADDFF,
                modifier = Modifier
                    .weight(1f)
            )
            Cuadrante(
                title = stringResource(R.string.imageComposable),
                textDisplayed = stringResource(R.string.imageDescription),
                colorFondo = 0xFFD0BCFF,
                modifier = Modifier
                    .weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            Cuadrante(
                title = stringResource(R.string.rowComposable),
                textDisplayed = stringResource(R.string.rowDescription),
                colorFondo = 0xFFB69DF8,
                modifier = Modifier
                    .weight(1f)
            )
            Cuadrante(
                title = stringResource(R.string.columnComposable),
                textDisplayed = stringResource(R.string.columnDescription),
                colorFondo = 0xFFF6EDFF,
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

@Composable
fun Cuadrante(title: String, textDisplayed: String, colorFondo: Long, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(color = Color(colorFondo))
            .padding(16.dp)
            .fillMaxSize()
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = textDisplayed,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        CuadrantesJuntos()
    }
}