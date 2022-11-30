package com.baharudin.basiclist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.baharudin.basiclist.data.DataProvider
import com.baharudin.basiclist.ui.theme.BasicListTheme
import com.baharudin.basiclist.view.PetListItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicListTheme {
                MainPage()
            }
        }
    }
}

@Composable
fun MainPage() {
    Scaffold(
        content = {
            HomeContent()
        }
    )
}

@Composable
fun HomeContent(){
    val pettie = remember {
        DataProvider.kitterList
    }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = pettie,
            itemContent = {
                PetListItem(pet = it)
            }
        )
    }
}