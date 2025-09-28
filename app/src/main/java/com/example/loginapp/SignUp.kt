package com.example.loginapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.ui.theme.LoginAppTheme

@Composable
fun SignUp(navController: NavController) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp, start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "←",
                fontSize = 28.sp,
                color = Color.White,
                modifier = Modifier.clickable { navController.popBackStack() }
            )
            Text(
                text = "Sign Up",
                fontSize = 32.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Text(text = " ", fontSize = 28.sp, color = Color.Transparent)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 120.dp)
                .clip(RoundedCornerShape(topStart = 70.dp))
                .background(Color.White)
                .padding(30.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            FieldBox(
                label = "First name",
                value = firstName,
                onValueChange = { firstName = it },
                placeholder = "Vijay",
                modifier = Modifier.padding(bottom = 24.dp)
            )

            FieldBox(
                label = "Last name",
                value = lastName,
                onValueChange = { lastName = it },
                placeholder = "Bhuva",
                modifier = Modifier.padding(bottom = 24.dp)
            )

            FieldBox(
                label = "Email",
                value = email,
                onValueChange = { email = it },
                placeholder = "vijaybhuva90@gmail.com",
                modifier = Modifier.padding(bottom = 24.dp)
            )

            FieldBox(
                label = "Password",
                value = password,
                onValueChange = { password = it },
                placeholder = "••••••",
                isPassword = true,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            FieldBox(
                label = "Confirm password",
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                placeholder = "••••••",
                isPassword = true,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Button(
                onClick = {  },
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
                    containerColor = Color.Black,
                    contentColor = Color.White
                )
            ) {
                Text("Sign Up")
            }
            Spacer(modifier = Modifier.height(40.dp))
            Text(
                text = "Already have any account? Sign In",
                color = Color.Black,
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.Bottom)
                    .clickable { navController.navigate("login") }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    LoginAppTheme {
        SignUp(rememberNavController())
    }
}
