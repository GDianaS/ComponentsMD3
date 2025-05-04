package com.study.materialdesign.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BadgeM3(){
    // BadgedBox é um contêiner que combina um conteúdo (como um ícone)
    // com um "badge" (um selo/indicador visual, geralmente usado para notificações)
    BadgedBox(
        badge = {
            // Aqui definimos o conteúdo do badge: um selo com o texto "99+"
            Badge(
                containerColor = Color.Red, // cor de fundo do selo
                contentColor = Color.White, // cor do texto do selo
                modifier = Modifier.padding(4.dp)
            ){
                Text(text = "99+")
            }
        }
    ){
        // Conteúdo principal da BadgedBox: um ícone de "Favorite"
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorite",
            modifier = Modifier.size(40.dp),

        )
    }
}