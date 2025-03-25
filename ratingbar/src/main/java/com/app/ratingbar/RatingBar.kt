package com.app.ratingbar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    maxRating: Int = 5,
    initialRating: Int = 2,
    @DrawableRes selectedDrawableRes: Int = R.drawable.ic_selected_star,
    @DrawableRes unSelectedDrawableRes: Int = R.drawable.ic_unselected_star,
    selectedDrawableTint: Color = Color(0xFFED8A19),
    unSelectedDrawableTint: Color = Color.Gray,
    imageSize: Dp = 30.dp,
    itemSpacing: Dp = 10.dp,
    isEditable: Boolean = false,
    rating: (Int) -> Unit
) {
    require(initialRating <= maxRating) {
        "initialRating ($initialRating) cannot be greater than maxRating ($maxRating)"
    }
    val currentRating = remember {
        mutableIntStateOf(initialRating)
    }
    rating(currentRating.intValue)
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(itemSpacing),
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 0 until maxRating) {
            Image(painter = painterResource(id = if (i < currentRating.intValue) selectedDrawableRes else unSelectedDrawableRes),
                contentDescription = "star icon",
                contentScale = ContentScale.FillBounds,
                colorFilter = ColorFilter.tint(
                    color =
                    if (i < currentRating.intValue) selectedDrawableTint else unSelectedDrawableTint
                ),
                modifier = Modifier
                    .size(imageSize)
                    .clickable {
                        if (isEditable) currentRating.intValue = i + 1
                    }
            )
        }


    }

}

