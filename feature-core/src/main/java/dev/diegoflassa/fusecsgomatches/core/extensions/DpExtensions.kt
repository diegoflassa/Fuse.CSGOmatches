@file:Suppress("unused")

package dev.diegoflassa.fusecsgomatches.core.extensions

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import dev.diegoflassa.fusecsgomatches.core.ui.Resolution
import dev.diegoflassa.fusecsgomatches.core.ui.calculateScale
import dev.diegoflassa.fusecsgomatches.core.ui.getCurrentResolution

/**
 * Dp scaled using the current resolution and optionally a custom reference.
 */
@Composable
fun Dp.scaled(): Dp {
    val currentResolution = getCurrentResolution()
    val escala = calculateScale(currentResolution)
    val ret = (value * escala).dp
    return ret
}

@Composable
fun Dp.scaled(referencia: Resolution): Dp {
    val escala = calculateScale(referencia, getCurrentResolution())
    return (value * escala).dp
}
