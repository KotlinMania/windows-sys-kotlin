// port-lint: source Windows/Win32/UI/Shell/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.internal.Kernel32Jni
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun SHGetKnownFolderPath(
    rfid: Long,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    Kernel32Jni.SHGetKnownFolderPath(rfid, dwflags.toInt(), htoken, ppszpath)

public fun SHGetKnownFolderPath(
    rfid: GUID,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT {
    val d4 = ByteArray(8) { i -> rfid.data4[i].toByte() }
    return Kernel32Jni.SHGetKnownFolderPathGuid(
        rfid.data1.toInt(),
        rfid.data2.toShort(),
        rfid.data3.toShort(),
        d4,
        dwflags.toInt(),
        htoken,
        ppszpath,
    )
}
