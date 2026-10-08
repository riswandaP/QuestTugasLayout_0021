package com.example.tugas3

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun KartuProfil(
    @StringRes nama: Int,
    @StringRes alamat: Int,
    @ColorRes warnaCard: Int,
    @ColorRes warnaNama: Int,
    @ColorRes warnaAlamat: Int,
    modifier: Modifier = Modifier,
    @StringRes telepon: Int? = null,
    @ColorRes warnaTelepon: Int = R.color.teks_cyan,
    @DrawableRes logo: Int = R.drawable.logo_umy,
    fontNama: FontFamily = FontFamily.Default,
    fontWeightNama: FontWeight = FontWeight.Bold
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.radius_card)),
        colors = CardDefaults.cardColors(containerColor = colorResource(warnaCard))
    ) {
        Row(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_card)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.jarak_sedang))
        ) {
            Image(
                painter = painterResource(logo),
                contentDescription = null,
                modifier = Modifier.size(dimensionResource(R.dimen.ukuran_logo))
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(nama),
                    fontSize = dimensionResource(R.dimen.font_nama).value.sp,
                    fontFamily = fontNama,
                    fontWeight = fontWeightNama,
                    color = colorResource(warnaNama)
                )
                if (telepon != null) {
                    Text(
                        text = stringResource(telepon),
                        fontSize = dimensionResource(R.dimen.font_detail).value.sp,
                        color = colorResource(warnaTelepon),
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.jarak_kecil))
                    )
                }
                // alamat menyusul
            }
            // logo kanan menyusul
        }
    }
}