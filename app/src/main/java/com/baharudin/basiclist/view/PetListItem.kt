package com.baharudin.basiclist.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.baharudin.basiclist.data.Pet

@Composable
fun PetListItem(pet : Pet){
    Card(
        modifier = Modifier
            .padding(
                horizontal = 8.dp, vertical = 8.dp
            )
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            PetImage(pet = pet)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = pet.title, style = typography.h6, color = Color.Black)
                Text(text = "VIEW DETAIL", style = typography.caption, color = Color.Black)
            }
        }
    }
}

@Composable
private fun PetImage(pet : Pet) {
    Image(
        painter = painterResource(
        id = pet.puppyImageId),
        contentDescription = "iMAGE",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(80.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )

}