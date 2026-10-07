package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme


@Preview
@Composable
fun App(){
    MyApplicationTheme{
        Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding ->
            Column(Modifier.padding(innerPadding)) {

                Text(text = "我正在学习Git")
            }
        }
    }
}