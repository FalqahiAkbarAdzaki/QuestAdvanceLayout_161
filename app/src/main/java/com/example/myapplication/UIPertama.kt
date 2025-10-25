package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("10:25", color = Color.White, fontSize = 12.sp)
            Spacer(modifier = Modifier.weight(1f))
            Box(Modifier.size(16.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Box(Modifier.size(16.dp))
            Spacer(modifier = Modifier.width(4.dp))
            Box(Modifier.size(16.dp))
        }

        Spacer(modifier = Modifier.height(32.dp))
        Image(
            painter = painterResource(id = R.drawable.foto_aqa),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Fit, // Ubah dari Crop jadi Fit
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.DarkGray)
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Social Media Icons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Red))
            Spacer(modifier = Modifier.width(16.dp))
            Box(Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Blue))
            Spacer(modifier = Modifier.width(16.dp))
            Box(Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Yellow))
            Spacer(modifier = Modifier.width(16.dp))
            Box(Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Green))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Name and Title
        Text(
            "Falqahi Akbar Adzaki",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Text(
            "@Falqahi_AA",
            fontSize = 14.sp,
            color = Color.LightGray
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            "Saya seorang Back End Developer",
            fontSize = 16.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Menu Items

        // Item "Privacy"
        MenuItem(icon = Icons.Default.Lock, text = "Privacy")
        Spacer(modifier = Modifier.height(16.dp))

        // Item "Riwayat Transaksi"
        MenuItem(icon = Icons.Default.List, text = "Riwayat Transaksi")
        Spacer(modifier = Modifier.height(16.dp))

        // Item "Pengaturan"
        MenuItem(icon = Icons.Default.Settings, text = "Pengaturan")

        // Bottom copyright text
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 24.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                "© 2025 Falqahi Akbar Adzaki",
                color = Color.Gray,
                fontSize = 12.sp
            )
        }
    }
}

// Komponen SocialMediaIcon dan MenuItem tetap sama seperti sebelumnya
@Composable
fun SocialMediaIcon(painter: Painter, backgroundColor: Color) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun MenuItem(icon: ImageVector, text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .height(60.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF313142)), // Darker card color
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = text,
                color = Color.White,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(">", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Light)
        }
    }
}