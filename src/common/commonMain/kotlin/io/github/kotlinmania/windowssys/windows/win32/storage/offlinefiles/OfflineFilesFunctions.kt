package io.github.kotlinmania.windowssys.windows.win32.storage.offlinefiles

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun OfflineFilesEnable(benable: BOOL, pbrebootrequired: Long): UInt {
    return Win32DynamicFfi.invoke("cscapi.dll", "OfflineFilesEnable", longArrayOf(benable.toLong(), pbrebootrequired)).toUInt()
}

public fun OfflineFilesQueryStatus(pbactive: Long, pbenabled: Long): UInt {
    return Win32DynamicFfi.invoke("cscapi.dll", "OfflineFilesQueryStatus", longArrayOf(pbactive, pbenabled)).toUInt()
}

public fun OfflineFilesQueryStatusEx(pbactive: Long, pbenabled: Long, pbavailable: Long): UInt {
    return Win32DynamicFfi.invoke("cscapi.dll", "OfflineFilesQueryStatusEx", longArrayOf(pbactive, pbenabled, pbavailable)).toUInt()
}

public fun OfflineFilesStart(): UInt {
    return Win32DynamicFfi.invoke("cscapi.dll", "OfflineFilesStart", longArrayOf()).toUInt()
}
