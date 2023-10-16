package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackImage(stringResource(R.string.titulo_jetpack), stringResource(R.string.primer_parrafo), stringResource(R.string.segundo_parrafo))
                }
            }
        }
    }
}

@Composable
fun JetpackInformation(title: String, parrafo1: String, parrafo2: String, modifier: Modifier = Modifier) {

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = parrafo1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp,end=16.dp)
        )
        Text(
            text = parrafo2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )

}

@Composable
fun JetpackImage(title: String, parrafo1: String, parrafo2: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        JetpackInformation(
            title = title,
            parrafo1 = parrafo1,
            parrafo2 = parrafo2
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        JetpackImage(stringResource(R.string.titulo_jetpack), stringResource(R.string.primer_parrafo), stringResource(R.string.segundo_parrafo))
    }
}