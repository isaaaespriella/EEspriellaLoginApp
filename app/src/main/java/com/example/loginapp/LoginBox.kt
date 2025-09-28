package com.example.loginapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun LoginBox(){
    Box(
        modifier = Modifier
            .padding(top = 100.dp)
            .clip(RoundedCornerShape(topStart = 100.dp))
            .background(Color.White)
            .fillMaxSize()
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun LoginBoxPreview() {
    LoginAppTheme {
        LoginBox()
    }
}