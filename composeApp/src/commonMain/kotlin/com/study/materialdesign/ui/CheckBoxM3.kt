package com.study.materialdesign.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckBoxM3(){
    // Lista de itens que terão checkboxes associados
    val items = listOf("Pickels", "Tomato", "Lettuce", "Cheese")

    // Mapa reativo que armazena o estado de cada item (checado ou não)
    val checkboxStates = remember { mutableStateMapOf<String, Boolean>().withDefault{false} }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        // Para cada item, cria uma linha com Checkbox + Texto
        items.forEach { item->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .toggleable(  // torna a Row "clicável" como um todo
                        value = checkboxStates.getValue(item),
                        onValueChange = {checkboxStates[item] = it}
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                // Componente visual do checkbox
                Checkbox(
                    checked = checkboxStates.getValue(item),
                    onCheckedChange = {checkboxStates[item] = it}
                )
                // Texto ao lado do checkbox
                Text(text = item,
                    modifier = Modifier.padding(start = 16.dp))
            }
        }
    }
}