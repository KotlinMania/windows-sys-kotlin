@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SecurityLicenseprotectionJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_licenseprotection_RegisterLicenseKeyWithExpiration(licensekey: Long, validityindays: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_licenseprotection_ValidateLicenseKeyProtection(licensekey: Long, notvalidbefore: Long, notvalidafter: Long, status: Long): Int
}

public actual fun RegisterLicenseKeyWithExpiration(licensekey: PCWSTR, validityindays: UInt, status: Long): HRESULT =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssys_windows_win32_security_licenseprotection_RegisterLicenseKeyWithExpiration(licensekey, validityindays.toInt(), status)

public actual fun ValidateLicenseKeyProtection(licensekey: PCWSTR, notvalidbefore: Long, notvalidafter: Long, status: Long): HRESULT =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssys_windows_win32_security_licenseprotection_ValidateLicenseKeyProtection(licensekey, notvalidbefore, notvalidafter, status)
