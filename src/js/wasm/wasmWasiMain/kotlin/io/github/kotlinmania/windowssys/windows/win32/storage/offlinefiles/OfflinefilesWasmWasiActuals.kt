@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun OfflineFilesEnable(benable: BOOL, pbrebootrequired: Long): UInt =
    0u

public actual fun OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): UInt =
    0u

public actual fun OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): UInt =
    0u

public actual fun OfflineFilesStart(): UInt =
    0u
