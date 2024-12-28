package com.gdgoc.jackpotnumberapp.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gdgoc.jackpotnumberapp.core.theme.PoppinsTypography
import com.gdgoc.jackpotnumberapp.core.theme.Primary
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.graphics.Color
import com.gdgoc.jackpotnumberapp.core.theme.Secondary

@Composable
fun JackpotCard(
    number: Int = 0,
    isJackpot: Boolean = false,
    isEven: Boolean = true,
    onButtonClick: () -> Unit = {},
    buttonEnabled: Boolean = true
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(containerColor = Primary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Rectangle field untuk angka
            Box(
                modifier = Modifier
                    .size(width = 44.dp, height = 33.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = number.toString(),
                    style = PoppinsTypography.bodyMedium,
                    color = Primary
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Text status jackpot atau ganjil/genap
            Text(
                text = if (isJackpot) {
                    "Selamat! Anda 'Jackpot' pada angka $number"
                } else {
                    "Nilai anda bernilai ${if (isEven) "genap" else "ganjil"}, dan belum beruntung"
                },
                style = PoppinsTypography.bodyMedium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Button Cari
            PrimaryButton(
                onClick = onButtonClick,
                backgroundColor = Secondary,
                contentColor = Color.White,
                typography = PoppinsTypography.bodyMedium,
                text = "Cari",
                modifier = Modifier.fillMaxWidth(),
                enabled = buttonEnabled
            )
        }
    }
}