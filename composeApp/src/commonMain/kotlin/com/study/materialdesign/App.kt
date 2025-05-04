package com.study.materialdesign

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.study.materialdesign.ui.RadioButtonM3
import com.study.materialdesign.ui.SliderM3
import com.study.materialdesign.ui.SwitchM3
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            //BadgeM3()
            //SwitchM3()
            //SliderM3()
            RadioButtonM3()
        }
    }
}