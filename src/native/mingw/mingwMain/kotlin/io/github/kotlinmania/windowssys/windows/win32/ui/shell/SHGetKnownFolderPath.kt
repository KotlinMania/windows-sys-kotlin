// port-lint: source Windows/Win32/UI/Shell/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

import io.github.kotlinmania.windowssys.cinterop.windows_sys_sh_get_known_folder_path
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.set
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.value

public fun SHGetKnownFolderPath(
    rfid: Long,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    memScoped {
        val outPtr = alloc<CPointerVarOf<CPointer<UShortVar>>>()
        val hr =
            windows_sys_sh_get_known_folder_path(
                rfid.toCPointer(),
                dwflags,
                htoken.toCPointer(),
                outPtr.ptr,
            )
        ppszpath[0] = outPtr.value?.toLong() ?: 0L
        hr
    }

public fun SHGetKnownFolderPath(
    rfid: GUID,
    dwflags: UInt,
    htoken: HANDLE,
    ppszpath: LongArray,
): HRESULT =
    memScoped {
        val nativeGuid = alloc<platform.posix.GUID>()
        nativeGuid.Data1 = rfid.data1
        nativeGuid.Data2 = rfid.data2
        nativeGuid.Data3 = rfid.data3
        for (i in 0 until 8) {
            nativeGuid.Data4[i] = rfid.data4[i]
        }
        val outPtr = alloc<CPointerVarOf<CPointer<UShortVar>>>()
        val hr =
            windows_sys_sh_get_known_folder_path(
                nativeGuid.ptr,
                dwflags,
                htoken.toCPointer(),
                outPtr.ptr,
            )
        ppszpath[0] = outPtr.value?.toLong() ?: 0L
        hr
    }
