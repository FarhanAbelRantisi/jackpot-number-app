package com.gdgoc.jackpotnumberapp.presentation.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdgoc.jackpotnumberapp.core.theme.PoppinsTypography
import com.gdgoc.jackpotnumberapp.core.theme.Primary
import com.gdgoc.jackpotnumberapp.presentation.component.JackpotCard
import com.gdgoc.jackpotnumberapp.presentation.component.TopBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import com.gdgoc.jackpotnumberapp.presentation.component.ArtikelCard
import com.gdgoc.jackpotnumberapp.R
import com.gdgoc.jackpotnumberapp.core.theme.Neutral


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen (
){
    var number by remember { mutableStateOf(0) }
    var probability by remember { mutableStateOf(0.01f) }

    var showDialog by remember { mutableStateOf(false) }

    val isJackpot = number > 10 &&
            number % 2 != 0 &&
            Math.random() < probability

    val isEven = number % 2 == 0

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("Jackpot!") },
            text = { Text("Selamat! Anda 'Jackpot' pada angka $number") },
            confirmButton = {
                TextButton(onClick = { showDialog = false }) {
                    Text("OK")
                }
            }
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Column(
        ) {
            TopBar()

            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Coba lihat angka keberuntunganmu!",
                    style = PoppinsTypography.headlineMedium,
                    color = Primary
                )

                Spacer(modifier = Modifier.height(12.dp))

                JackpotCard(
                    number = number,
                    isJackpot = isJackpot,
                    isEven = isEven,
                    onButtonClick = {
                        number++
                        if (!isJackpot) {
                            probability = minOf(probability + 0.01f, 0.05f)
                        } else {
                            showDialog = true
                        }
                    },
                    buttonEnabled = !isJackpot
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Artikel",
                    style = PoppinsTypography.headlineMedium,
                    color = Primary
                )

                Spacer(modifier = Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .background(
                            color = Primary,
                            shape = RoundedCornerShape(15.dp)
                        )
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                ) {
                    Column {
                        ArtikelCard(
                            title = "Angka Keberuntungan di Berbagai Budaya, Pahami Filosofinya",
                            creator = "Liputan 6",
                            imgPainter = painterResource(id = R.drawable.img_koin)
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Divider(
                            color = Neutral,
                            thickness = 1.dp,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        ArtikelCard(
                            title = "Apakah Ada Angka Keberuntungan Menurut Islam? Ini Penjelasannya",
                            creator = "Kumparan",
                            imgPainter = painterResource(id = R.drawable.img_dadu)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainActivityPreview() {
    MaterialTheme {
        MainActivity()
    }
}