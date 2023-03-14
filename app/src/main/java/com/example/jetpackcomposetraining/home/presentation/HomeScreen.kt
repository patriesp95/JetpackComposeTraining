package com.example.jetpackcomposetraining.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(
    viewmodel: HomeViewModel =  hiltViewModel()
){
    viewmodel
    Column(modifier= Modifier.fillMaxSize()) {
        Text(text="Home")
    }
}