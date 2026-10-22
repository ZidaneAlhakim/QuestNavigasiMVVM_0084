package com.example.pert6.view

import android.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import java.lang.reflect.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    Scaffold(modifier= Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = "Form Isian"), color = Color.White)}
            )
        })
}




