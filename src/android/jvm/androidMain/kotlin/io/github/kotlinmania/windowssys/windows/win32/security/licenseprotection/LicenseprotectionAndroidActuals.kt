@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SecurityLicenseprotectionJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(licensekey: Long, validityindays: Int, status: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(licensekey: Long, notvalidbefore: Long, notvalidafter: Long, status: Long): Int
}

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: MutPtr): Hresult =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(licensekey.rawAddress, validityindays.toInt(), status.rawAddress)

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: MutPtr, notvalidafter: MutPtr, status: MutPtr): Hresult =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(licensekey.rawAddress, notvalidbefore.rawAddress, notvalidafter.rawAddress, status.rawAddress)
