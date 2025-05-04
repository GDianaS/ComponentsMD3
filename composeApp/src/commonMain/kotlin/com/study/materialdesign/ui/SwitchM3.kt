package com.study.materialdesign.ui

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun SwitchM3(){

    // Estado que controla se o switch está ativado (true) ou não (false)
    var isChecked by remember { mutableStateOf(false) }

    // Ícone exibido no thumb (dentro do botão) conforme o estado do switch
    val icons = if (isChecked) Icons.Filled.Check else Icons.Filled.Close

    Switch(
        checked = isChecked, // valor atual (ligado/desligado)
        onCheckedChange = {
            isChecked = it // atualiza o estado quando o usuário interage
        },
        thumbContent = {
            // Conteúdo dentro do "thumb" (parte redonda que se move)
            Icon(
                imageVector = icons, // Ícone de check ou close
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize) // Tamanho padrão

                )
        }
    )
}