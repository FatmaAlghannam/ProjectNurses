package com.falghannam.javaspringbootproject.composables


import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.falghannam.javaspringbootproject.R
import com.falghannam.javaspringbootproject.data.Nurse
import com.falghannam.javaspringbootproject.viewModel.NursesViewModel

//
//@Preview
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Booking(
//) {
//    var Nurse by remember {
//        mutableStateOf("")
//    }
//    Column(
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Scaffold(
//            topBar = {
//                TopAppBar(title = {
//                    Text(
//                        text = "Nurses",
//                        fontWeight = FontWeight.Bold,
//                        color = Color.DarkGray,
//                        fontSize = 19.sp
//                    )
//
//                })
//            }
//
//        ) { padding ->
//            Column(
//                modifier = Modifier
//                    .padding(padding)
//                    .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            ) {
//                Card(
//                    colors = CardDefaults.cardColors(containerColor = Color.LightGray),
//
//                    modifier = Modifier
//                        .padding(padding)
//                        .align(Alignment.CenterHorizontally)
//                        .width(350.dp)
//                        .height(100.dp)
//                ) {
//
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(16.dp)
//                    ) {
//
//                    }
//                }
//                Card(
//                    colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
//                    modifier = Modifier
//                        .padding(padding)
//                        .align(Alignment.CenterHorizontally)
//                        .width(350.dp)
//                        .height(100.dp)
//
//                ) {
//
//                    Row(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(16.dp)
//                    ) {
//
//
//
//                    }
//                }
//                Spacer(modifier = Modifier.height(18.dp))
//
//                OutlinedButton(
//                    modifier = Modifier.padding(16.dp),
//                    colors = ButtonDefaults.buttonColors(containerColor = Color.White),
//                    onClick = {
//
//                        //BUTTON TRANSFER
//                    },
//                    shape = RoundedCornerShape(30)
//                ) {
//
//
//                }
//            }
//        }
//    }
//}
//

@Composable
fun NurseList(viewModel: NursesViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    LazyColumn {
        items(viewModel.nurses) {
            NurseCard(it)
        }
    }
}

@Composable
fun NurseCard(nurse: Nurse) {
    Row(
        modifier = Modifier
            .padding(16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .background(color = Color.LightGray)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(8.dp)
        )

        {
            Text(
                text = "Name: ${nurse.name}",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )
            Text(
                text = "Specialized: ${nurse.speciality}",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )
            Text(
                text = "Age: ${nurse.age}",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            )

            Rating(rating = 2)

        }

        Image(
            modifier = Modifier.size(90.dp),
            painter = painterResource(nurse.image),
            contentDescription = null,
            alignment = Alignment.TopCenter,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun Rating(rating: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        repeat(rating) {
            Image(
                painter = painterResource(id = R.drawable.fillstar),
                contentDescription = null,
                modifier = Modifier.size(16.dp)
            )
        }
        repeat(5 - rating) {
            Image(
                painter = painterResource(id = R.drawable.nonfillstar),
                contentDescription = null,
                modifier = Modifier
                    .size(16.dp)
                    .clip(CircleShape)
            )
        }
    }
}
