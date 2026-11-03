// port-lint: source Windows/Win32/Globalization/mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.cinterop.windows_sys_get_user_preferred_ui_languages
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.value

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: PWSTR,
    pcchlanguagesbuffer: UIntArray,
): BOOL =
    memScoped {
        val numLangs = alloc<UIntVar>()
        numLangs.value = pulnumlanguages[0]
        val cchBuf = alloc<UIntVar>()
        cchBuf.value = pcchlanguagesbuffer[0]
        val res =
            windows_sys_get_user_preferred_ui_languages(
                dwflags,
                numLangs.ptr,
                pwszlanguagesbuffer.toCPointer<UShortVar>(),
                cchBuf.ptr,
            )
        pulnumlanguages[0] = numLangs.value
        pcchlanguagesbuffer[0] = cchBuf.value
        res
    }

public fun GetUserPreferredUILanguages(
    dwflags: UInt,
    pulnumlanguages: UIntArray,
    pwszlanguagesbuffer: UShortArray?,
    pcchlanguagesbuffer: UIntArray,
): BOOL =
    memScoped {
        val numLangs = alloc<UIntVar>()
        numLangs.value = pulnumlanguages[0]
        val cchBuf = alloc<UIntVar>()
        cchBuf.value = pcchlanguagesbuffer[0]
        val res =
            if (pwszlanguagesbuffer == null || pwszlanguagesbuffer.isEmpty()) {
                windows_sys_get_user_preferred_ui_languages(
                    dwflags,
                    numLangs.ptr,
                    null,
                    cchBuf.ptr,
                )
            } else {
                pwszlanguagesbuffer.usePinned { pinned ->
                    windows_sys_get_user_preferred_ui_languages(
                        dwflags,
                        numLangs.ptr,
                        pinned.addressOf(0),
                        cchBuf.ptr,
                    )
                }
            }
        pulnumlanguages[0] = numLangs.value
        pcchlanguagesbuffer[0] = cchBuf.value
        res
    }
