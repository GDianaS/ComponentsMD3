package com.study.materialdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.study.materialdesign.ui.BadgeM3
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import com.study.materialdesign.ui.SliderM3
import com.study.materialdesign.ui.SwitchM3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComponentsPreview(){
    Column {
        BadgeM3()

        SwitchM3()

        SliderM3()
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}