package com.study.materialdesign.ui

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

// AssistChip – Ajudar com ações secundárias como ajuda, favoritos, detalhes
// ElevatedAssistChip – Igual ao AssistChip, mas com elevação
// FilterChip – Para ativar ou desativar filtros
// SuggestionChip – Sugerir ações ou caminhos ao usuário
// InputChip – Representa entradas ou seleções do usuário (como tags)

@Composable
fun AssistChipsM3(){
    AssistChip(
        onClick = {/*do something*/},
        label = { Text(text = "Assist Chip") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Composable
fun ElevatedAssistChipM3(){
    ElevatedAssistChip(
        onClick = {/*do something*/},
        label = { Text(text = "Elevated Chip") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(AssistChipDefaults.IconSize)
            )
        }
    )
}

@Composable
fun FilterChipM3() {

    var selected by remember { mutableStateOf(false) }

    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text(text = "Filter Chip")},
        leadingIcon = if (selected) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = null,
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else null
    )
}

@Composable
fun SuggestionChipM3() {
    SuggestionChip(
        onClick = { /* do something! */ },
        label = { Text(text = "Suggestion Chip")},
        icon = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(SuggestionChipDefaults.IconSize)
            )
        }
    )
}

@Composable
fun InputChipM3() {
    var selected by remember { mutableStateOf(false) }
    InputChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text(text = "Input Chip")},
        avatar = {
            Icon(
                imageVector = Icons.Filled.Settings,
                contentDescription = null,
                modifier = Modifier.size(SuggestionChipDefaults.IconSize)
            )
        }
    )
}

