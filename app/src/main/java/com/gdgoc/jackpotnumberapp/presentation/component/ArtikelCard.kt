package com.gdgoc.jackpotnumberapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.gdgoc.jackpotnumberapp.core.theme.PoppinsTypography
import com.gdgoc.jackpotnumberapp.core.theme.Primary
import com.gdgoc.jackpotnumberapp.core.theme.Secondary

@Composable
fun ArtikelCard(
    modifier: Modifier = Modifier,
    title: String,
    creator: String,
    imgPainter: Painter
) {
    Card(
        modifier = modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.padding(8.dp)
            ) {
                Image(
                    painter = imgPainter,
                    contentDescription = null,
                    modifier = Modifier
                        .size(67.dp)
                        .clip(RoundedCornerShape(5.dp))
                )

                Spacer(modifier = Modifier.width(14.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    // Judul artikel
                    Text(
                        text = title,
                        style = PoppinsTypography.bodyMedium,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    // Box dengan warna Secondary dan shape 5.dp
                    Box(
                        modifier = Modifier
                            .background(
                                color = Secondary,
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = creator,
                            style = PoppinsTypography.bodyMedium,
                            color = Primary
                        )
                    }
                }
            }
        }
    }
}
