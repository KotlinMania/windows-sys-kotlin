package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun offlineFilesEnable(benable: Bool, pbrebootrequired: MutPtr): UInt

public expect fun offlineFilesQueryStatus(pbactive: MutPtr, pbenabled: MutPtr): UInt

public expect fun offlineFilesQueryStatusEx(pbactive: MutPtr, pbenabled: MutPtr, pbavailable: MutPtr): UInt

public expect fun offlineFilesStart(): UInt
