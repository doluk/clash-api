package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.league.LegendSeasonResult
import kotlinx.serialization.Serializable


@Serializable
data class PlayerLegendStatistics( // everything is nullable??
    val currentSeason: LegendSeasonResult? = null,
    val previousVersusSeason: LegendSeasonResult? = null,
    val bestVersusSeason: LegendSeasonResult? = null,
    val legendTrophies: Int? = null,
    val previousSeason: LegendSeasonResult? = null,
    val bestSeason: LegendSeasonResult? = null
)