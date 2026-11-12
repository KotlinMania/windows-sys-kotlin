package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun offlineFilesEnable(benable: Bool, pbrebootrequired: MutPtr<Bool>): UInt

public expect fun offlineFilesQueryStatus(pbactive: MutPtr<Bool>, pbenabled: MutPtr<Bool>): UInt

public expect fun offlineFilesQueryStatusEx(pbactive: MutPtr<Bool>, pbenabled: MutPtr<Bool>, pbavailable: MutPtr<Bool>): UInt

public expect fun offlineFilesStart(): UInt
