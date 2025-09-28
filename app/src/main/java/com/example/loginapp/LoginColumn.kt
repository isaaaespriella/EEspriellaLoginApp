package com.example.loginapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun LoginColumn(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .clip(RoundedCornerShape(topStart = 70.dp))
            .background(Color.White)
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Login",
            fontSize = 32.sp,
            modifier = Modifier.padding(20.dp)
        )

        FieldBox(
            label = "Email",
            value = email,
            onValueChange = { email = it },
            placeholder = "vijaybhuva90@gmail.com",
            modifier = Modifier
                .padding(bottom = 30.dp)
        )

        FieldBox(
            label = "Password",
            value = password,
            onValueChange = { password = it },
            placeholder = "••••••",
            isPassword = true,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(
                topStart = 20.dp,
                topEnd = 0.dp,
                bottomEnd = 20.dp,
                bottomStart = 20.dp
            ),
            colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black, // fondo
            contentColor = Color.White     // texto
        )
        ) {
            Text("Login")
        }


        Text(
            text = "Don’t have any account? Sign Up",
            color = Color.Black,
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight(align = Alignment.Bottom)
                .clickable { navController.navigate("signup") }
        )
    }
}

@Composable
fun FieldBox(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String = "",
    isPassword: Boolean = false,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .shadow(
                elevation = 6.dp,
                shape = RoundedCornerShape(12.dp),
                ambientColor = Color.Black.copy(alpha = 0.15f),
                spotColor = Color.Black.copy(alpha = 0.15f)
            )
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White)
            .padding(15.dp)
    ) {
        Column {
            Text(
                text = label,
                color = Color.Black,
                fontSize = 18.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
            TextField(
                value = value,
                onValueChange = onValueChange,
                placeholder = { if (placeholder.isNotEmpty()) Text(placeholder) },
                singleLine = true,
                visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
                shape = RoundedCornerShape(0.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    errorContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    focusedPlaceholderColor = Color(0xFFB8B8B8),
                    unfocusedPlaceholderColor = Color(0xFFB8B8B8),
                    focusedTextColor = Color(0xFF222222),
                    unfocusedTextColor = Color(0xFF222222),

                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginColumnPreview() {
    LoginAppTheme {
        LoginColumn(rememberNavController())
    }
}

