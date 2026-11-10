@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemDeveloperlicensingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_acquireDeveloperLicense(hwndparent: Long, pexpiration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_checkDeveloperLicense(pexpiration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_removeDeveloperLicense(hwndparent: Long): Int
}

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: COpaquePointer?): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_acquireDeveloperLicense((hwndparent?.value ?: 0L), (pexpiration?.value ?: 0L))

public actual fun checkDeveloperLicense(pexpiration: COpaquePointer?): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_checkDeveloperLicense((pexpiration?.value ?: 0L))

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_removeDeveloperLicense((hwndparent?.value ?: 0L))
