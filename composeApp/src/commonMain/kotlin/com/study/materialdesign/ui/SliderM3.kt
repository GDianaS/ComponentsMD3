package com.study.materialdesign.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SliderM3(){

    // Estado que armazena a posição atual do slider (de 0.0 a 10.0)
    var sliderPosition by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier.padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Exibe o valor atual do slider como texto
        Text(text = sliderPosition.toString())

        Slider(
            value = sliderPosition, //valor atual do slide
            onValueChange = {sliderPosition = it}, //atualiza o valor
            valueRange = 0f..10f, //intervalo
            steps = 4, //número de intervalos
            onValueChangeFinished = {
                // Chamado quando o usuário solta o dedo/mouse (interação finalizada)
                //Exemplo: ViewModel.updateSelectedSliderValue(sliderPosition)
        },

        )
    }


}
