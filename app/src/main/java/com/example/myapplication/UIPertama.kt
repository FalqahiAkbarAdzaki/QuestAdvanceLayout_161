package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme













@Composable
fun ActivitasPertama(modifier: Modifier){
    column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 35.sp
            fontWeight = Fontweight.Bold
        )
        Text(
            stringResource(R.string.univ)
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp)
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row() {
                val gambar = painterResource(R.drawable.logo_umy)
                image(
                    painter = gambar
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
                Spacer(modifier = Modifier.width(50.dp))
                Column() {
                    Text(
                        stringResource(R.string.nama)
                        fontSize = 30.sp
                        fontFamily = FontFamily.Cursive
                        color = Color.White
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        stringResource(R.string.copy)
                        modifier = Modifier
                        align(Alignment.BottomCenter)
                    )
                }
            }
        }
    }
}