package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun offlineFilesEnable(benable: Bool, pbrebootrequired: COpaquePointer?): UInt

public expect fun offlineFilesQueryStatus(pbactive: COpaquePointer?, pbenabled: COpaquePointer?): UInt

public expect fun offlineFilesQueryStatusEx(pbactive: COpaquePointer?, pbenabled: COpaquePointer?, pbavailable: COpaquePointer?): UInt

public expect fun offlineFilesStart(): UInt
