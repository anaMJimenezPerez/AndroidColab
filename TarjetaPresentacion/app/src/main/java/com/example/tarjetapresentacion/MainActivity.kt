package com.example.tarjetapresentacion

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.colorspace.ColorModel
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0XFFD2E8D4))
    ){
        DatosPersonales(
            photo = painterResource(R.drawable._1144517_jovem_f_mea_ilustra__o_projeto_isolado_vector),
            name = stringResource(R.string.name),
            job = stringResource(R.string.job)
        )
        DatosContacto(
            phoneNumber = stringResource(R.string.phoneNumber),
            webPage = stringResource(R.string.webPage),
            email = stringResource(R.string.email)
        )
    }
}

@Composable
fun DatosPersonales(photo: Painter, name: String, job: String){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = photo,
            contentDescription = null,
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )
        Text(
            text = name,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp
        )

        Text(
            text = job,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF227C50),
            fontSize = 15.sp
            )
    }
}

@Composable
fun DatosContacto(phoneNumber: String, webPage: String, email: String){
    Row (
        verticalAlignment = Alignment.Bottom

    ){
        Column {
            Icon(
                painter = painterResource(id = R.drawable.call_icon),
                contentDescription = null,
                tint = Color(0xFF227C50)
            )
            Icon(
                painter = painterResource(id = R.drawable.share_icon),
                contentDescription = null,
                tint = Color(0xFF227C50)
            )
            Icon(
                painter = painterResource(id = R.drawable.email_icon),
                contentDescription = null,
                tint = Color(0xFF227C50)
            )
        }
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(start = 15.dp)
                ){
            Text(
                text = phoneNumber,
                modifier = Modifier.padding(bottom = 3.dp)
            )
            Text(
                text = webPage,
                modifier = Modifier.padding(bottom = 3.dp)
            )

            Text(
                text = email,
                modifier = Modifier.padding(bottom = 3.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}