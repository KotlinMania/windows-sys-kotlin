// port-lint: source Windows/Win32/Storage/FileSystem/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_full_path_name_w
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.CPointerVar
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: Long = 0L,
): UInt =
    windows_sys_get_full_path_name_w(
        lpfilename.toCPointer<UShortVar>(),
        nbufferlength,
        lpbuffer.toCPointer<UShortVar>(),
        lpfilepart.toCPointer(),
    )

public fun GetFullPathNameW(
    lpfilename: PCWSTR,
    nbufferlength: UInt,
    lpbuffer: PWSTR,
    lpfilepart: LongArray?,
): UInt =
    memScoped {
        if (lpfilepart == null || lpfilepart.isEmpty()) {
            windows_sys_get_full_path_name_w(
                lpfilename.toCPointer<UShortVar>(),
                nbufferlength,
                lpbuffer.toCPointer<UShortVar>(),
                null,
            )
        } else {
            val partVar = alloc<CPointerVar<UShortVar>>()
            val res =
                windows_sys_get_full_path_name_w(
                    lpfilename.toCPointer<UShortVar>(),
                    nbufferlength,
                    lpbuffer.toCPointer<UShortVar>(),
                    partVar.ptr,
                )
            lpfilepart[0] = partVar.value?.toLong() ?: 0L
            res
        }
    }

public fun GetFullPathNameW(
    lpfilename: UShortArray,
    nbufferlength: UInt,
    lpbuffer: UShortArray?,
    lpfilepart: LongArray? = null,
): UInt =
    memScoped {
        if (lpfilename.isEmpty()) return 0u
        val partVar = if (lpfilepart != null && lpfilepart.isNotEmpty()) alloc<CPointerVar<UShortVar>>() else null
        val res =
            lpfilename.usePinned { pinnedName ->
                if (lpbuffer == null || lpbuffer.isEmpty()) {
                    windows_sys_get_full_path_name_w(
                        pinnedName.addressOf(0),
                        nbufferlength,
                        null,
                        partVar?.ptr,
                    )
                } else {
                    lpbuffer.usePinned { pinnedBuf ->
                        windows_sys_get_full_path_name_w(
                            pinnedName.addressOf(0),
                            nbufferlength,
                            pinnedBuf.addressOf(0),
                            partVar?.ptr,
                        )
                    }
                }
            }
        if (partVar != null && lpfilepart != null && lpfilepart.isNotEmpty()) {
            lpfilepart[0] = partVar.value?.toLong() ?: 0L
        }
        res
    }
