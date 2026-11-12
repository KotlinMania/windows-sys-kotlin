@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemDeveloperlicensingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent: Long, pexpiration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent: Long): Int
}

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: MutPtr<Filetime>): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent.rawAddress, pexpiration.rawAddress)

public actual fun checkDeveloperLicense(pexpiration: MutPtr<Filetime>): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration.rawAddress)

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent.rawAddress)
