@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SystemDeveloperlicensingJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_AcquireDeveloperLicense(hwndparent: Long, pexpiration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_CheckDeveloperLicense(pexpiration: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_developerlicensing_RemoveDeveloperLicense(hwndparent: Long): Int
}

public actual fun AcquireDeveloperLicense(hwndparent: HWND, pexpiration: Long): HRESULT =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_AcquireDeveloperLicense(hwndparent, pexpiration)

public actual fun CheckDeveloperLicense(pexpiration: Long): HRESULT =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_CheckDeveloperLicense(pexpiration)

public actual fun RemoveDeveloperLicense(hwndparent: HWND): HRESULT =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssys_windows_win32_system_developerlicensing_RemoveDeveloperLicense(hwndparent)
