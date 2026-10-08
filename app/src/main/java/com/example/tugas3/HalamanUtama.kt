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
        Text(
            text = stringResource(R.string.univ),
            fontSize = dimensionResource(R.dimen.font_univ).value.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_judul)))

        KartuProfil(
            nama = R.string.nama_1,
            alamat = R.string.alamat_1,
            warnaCard = R.color.card_abu,
            warnaNama = R.color.teks_putih,
            warnaAlamat = R.color.teks_kuning,
            fontNama = FontFamily.Cursive,
            fontWeightNama = FontWeight.Normal
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.jarak_sedang)))
        KartuProfil(
            nama = R.string.nama_2,
            telepon = R.string.telp_2,
            alamat = R.string.alamat_2,
            warnaCard = R.color.card_ungu,
            warnaNama = R.color.teks_putih,
            warnaAlamat = R.color.teks_kuning
        )
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(R.string.copy),
            fontSize = dimensionResource(R.dimen.font_copy).value.sp
        )
    }
}