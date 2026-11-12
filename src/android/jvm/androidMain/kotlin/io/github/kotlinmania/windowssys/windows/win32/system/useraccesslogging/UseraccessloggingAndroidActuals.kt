@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemUseraccessloggingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalInstrument(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct(wszproductname: Long, wszrolename: Long, wszguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalStart(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalStop(data: Long): Int
}

public actual fun ualInstrument(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalInstrument(data.rawAddress)

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct(wszproductname.rawAddress, wszrolename.rawAddress, wszguid.rawAddress)

public actual fun ualStart(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalStart(data.rawAddress)

public actual fun ualStop(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalStop(data.rawAddress)
