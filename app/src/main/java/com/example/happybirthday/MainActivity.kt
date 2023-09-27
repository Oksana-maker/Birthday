package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import android.graphics.Typeface
import android.widget.TextView
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
//               ) {
//                    GreetingText(massage = "Happy Birthday Sam!", from = "From Emma")
//               }
//                {
//                    GreetingImage1(
//                        stringResource(R.string.text1),
//                        stringResource(R.string.text2),
//                        stringResource(R.string.text3)
//                    )
//                }
//                {
//                    GreetingText1(massage = "Hello, World!", from = "Without padding" )
//                }
                {
                    FinalScreenshot(stringResource(R.string.text4), stringResource(R.string.text5))
                }
            }
        }
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Text(
            text = "Hello, World!",
            modifier = Modifier.background(color = Color.Green),
        )
        GreetingText(
            massage = message, from = from, modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun FinalScreenshot(message1: String, message2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop, alpha = 0.5F,
            modifier = Modifier.align(alignment = Alignment.Center)
        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message1,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 300.dp, bottom = 8.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = message2,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun GreetingImage1(message1: String, message2: String, message3: String) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5F,
            modifier = Modifier.align(alignment = Alignment.TopCenter)
        )
        GreetingText2(
            message1 = message1, message2 = message2, message3 = message3, modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun GreetingText2(
    message1: String,
    message2: String,
    message3: String,
    modifier: Modifier = Modifier
) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message1,
            fontSize = 24.sp,
//            lineHeight = 16.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(start = 0.dp, end = 16.dp, bottom = 16.dp, top = 100.dp)
                .align(alignment = Alignment.End)
        )
        Text(
            text = message2,
            fontSize = 16.sp,
//            lineHeight = 16.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .align(alignment = Alignment.End)
        )
        Text(
            text = message3,
            fontSize = 16.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
                .align(alignment = Alignment.End)
        )

    }

}

@Composable
fun GreetingText1(massage: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = massage,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
//    Text(
//        text = from,
//        fontSize = 36.sp,
//        modifier = Modifier.padding(16.dp).align(alignment =  Alignment.End)
//        )
//    Text(
//        text = from,
//        fontSize = 36.sp,
//        modifier = Modifier.padding(16.dp,
//            top = 16.dp,
//            end = 16.dp,
//            bottom = 16.dp) )
//    Text(
//        text = from,
//        fontSize = 36.sp,
//        modifier = Modifier.fillMaxSize().padding(8.dp)
//    )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun GreetingText(massage: String, from: String, modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = massage,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        FinalScreenshot(stringResource(R.string.text4), stringResource(R.string.text5))
//        GreetingImage1(
//            stringResource(R.string.text1),
//            stringResource(R.string.text2),
//            stringResource(R.string.text3)
//        )
//        GreetingText1( stringResource(R.string.happy_birthday_text), stringResource(R.string.signature_text) )
//        GreetingText("Happy Birthday Sam!", "From Emma")
//GreetingImage(massage = "Happy Birthday Sam!", from = "From Emma")
    }
}


