package com.QYC.twitch.model;

import com.QYC.twitch.db.entity.ItemEntity;

public record FavoriteRequestBody(
        ItemEntity favorite
) {
}
