package com.falghannam.javaspringbootproject.composables

import android.location.Address
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.falghannam.WelcomeScreen
import com.falghannam.javaspringbootproject.R
import com.falghannam.javaspringbootproject.ui.theme.seed

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    //  TODO: viewModel: ViewModel = viewModel(),
    onSignupClick: () -> Unit = {}
) {
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var MedicalRecord by remember {
        mutableStateOf("")
    }
    var Age by remember {
        mutableStateOf("")
    }
    var Address by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Scaffold(
//            topBar = {
//                TopAppBar(title = {
//                    Text(
//                        "Welcome",
//                        fontWeight = FontWeight.ExtraBold,
//                        color = Color.DarkGray,
//                        textAlign = TextAlign.Center,
//                        fontSize = 15.sp,
//                    )
//                })
//            }

//        ) { padding ->
//
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(21.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {

        Image(
            painter = painterResource(id = R.drawable.logo2),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(MaterialTheme.shapes.medium),
            contentScale = ContentScale.Fit
        )

                Row(modifier = Modifier) {
                    Text(
                        text = " My Information ", textAlign = TextAlign.Left,
                        fontFamily = FontFamily.Monospace,
                       // letterSpacing = 0.5.em,
                        fontSize = 15.sp
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = {Text("Username:")}
                )


                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password:") },
                    visualTransformation = PasswordVisualTransformation()

                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = MedicalRecord,
                    onValueChange = { MedicalRecord = it },
                    label = { Text("MedicalRecord:") }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = Age,
                    onValueChange = { Age = it },
                    label = { Text("Age:") }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = Address,
                    onValueChange = { Address = it },
                    label = { Text("Address:") }
                )
                Spacer(
                    modifier = Modifier
                        .height(25.dp)
                        .padding(40.dp)
                )


                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Button(
                        modifier = Modifier.padding(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = seed),
                        onClick = {
                            //viewModel.signup(username, password, "")
                        },
                        shape = RoundedCornerShape(30)
                    ) {
                        Text(
                            "Sign Up ",

                            modifier = Modifier
                                .width(150.dp)
                                .height(30.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily.Monospace,
                            fontSize = 18.sp
                        )
                    }


                }
            }
        }
