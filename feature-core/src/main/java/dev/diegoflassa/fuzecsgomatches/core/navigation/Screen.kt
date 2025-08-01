package dev.diegoflassa.fuzecsgomatches.core.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Screen : NavKey {
    @Serializable
    data object Main : Screen

    @Serializable
    data class Details(
        val matchIdOrSlug: String,
        val leagueName: String?,
        val serieFullName: String?,
        val scheduledAt: String?,
    ) : Screen
}
