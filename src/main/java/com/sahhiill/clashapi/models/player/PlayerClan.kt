package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.common.BadgeUrls
import kotlinx.serialization.Serializable

@Serializable
data class PlayerClan(val tag: String, val clanLevel: Int, val name: String, val badgeUrls: BadgeUrls)