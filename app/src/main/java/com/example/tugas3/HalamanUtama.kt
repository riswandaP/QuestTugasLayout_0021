package com.example.tugas3

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun HalamanUtama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(
                top = dimensionResource(R.dimen.padding_atas),
                start = dimensionResource(R.dimen.padding_layar),
                end = dimensionResource(R.dimen.padding_layar),
                bottom = dimensionResource(R.dimen.padding_bawah)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = dimensionResource(R.dimen.font_judul).value.sp,
            fontWeight = FontWeight.Bold
        )
    }
}