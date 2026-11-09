package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun OfflineFilesEnable(benable: BOOL, pbrebootrequired: Long): UInt

public expect fun OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): UInt

public expect fun OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): UInt

public expect fun OfflineFilesStart(): UInt
