package com.study.materialdesign.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RadioButtonM3(){

    // Lista de opções exibidas
    val options = listOf("English", "Portuguese", "Spanish")
    // Estado que armazena a opção atualmente selecionada
    var selectedOption by remember { mutableStateOf(options[0])}

    Column(
        modifier = Modifier.fillMaxSize(), // ocupa toda a altura da tela
        verticalArrangement = Arrangement.Center // centraliza o conteúdo verticalmente
    ) {
        // Para cada opção da lista, cria um par (linha) com o botão e o texto
        options.forEach { option ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp) // altura mínima para acessibilidade
                    .selectable(
                        selected = selectedOption == option,
                        onClick = {selectedOption = option}
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically

            ){
                RadioButton(
                    selected = selectedOption == option, // define se o botão está marcado
                    onClick = { selectedOption = option } // atualiza o estado ao clicar
                )
                // Texto ao lado do botão
                Text(text = option)
            }
        }
    }
}