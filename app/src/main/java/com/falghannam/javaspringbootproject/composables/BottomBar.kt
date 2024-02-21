package com.falghannam.javaspringbootproject.composables

import android.graphics.drawable.Icon
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.falghannam.javaspringbootproject.R
import com.falghannam.javaspringbootproject.data.BottomNavigationItemData
import com.falghannam.javaspringbootproject.utils.Routes

data class BottomNavigationItemData(
    val route: String,
    val label: String,
    @DrawableRes val icon: Int
)
@Composable
fun BottomBar(selectedRoute: String, onItemSelected: (String) -> Unit={}) {
    BottomNavigation {
        val items = listOf(
            BottomNavigationItemData(
                route = "home",
                label = "Home",
                icon = R.drawable.ic_home // Ensure this is a vector drawable resource
            ),
            BottomNavigationItemData(
                route = "profile",
                label = "Profile",
                icon = R.drawable.ic_profile // Ensure this is a vector drawable resource
            )
        )

//        items.forEach { item ->
//            BottomNavigationItem(
//                icon = {
//                    Icon(
//                        ImageVector.vectorResource(id = item.icon),
//                        contentDescription = item.label
//                    )
//                },
//                label = { Text(item.label) },
//                selected = item.route == selectedRoute,
//                onClick = { onItemSelected(item.route) }
//            )
//        }

 }}

@Preview
@Composable
fun PreviewBottomBar(){
    BottomBar("")
}
