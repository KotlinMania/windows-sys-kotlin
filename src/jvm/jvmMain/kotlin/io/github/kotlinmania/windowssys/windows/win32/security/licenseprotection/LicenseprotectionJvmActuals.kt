@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SecurityLicenseprotectionJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration(licensekey: Long, validityindays: Int, status: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection(licensekey: Long, notvalidbefore: Long, notvalidafter: Long, status: Long): Int
}

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: COpaquePointer?): Hresult =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration((licensekey?.value ?: 0L), validityindays.toInt(), (status?.value ?: 0L))

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: COpaquePointer?, notvalidafter: COpaquePointer?, status: COpaquePointer?): Hresult =
    WindowsWin32SecurityLicenseprotectionJniBridge.windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection((licensekey?.value ?: 0L), (notvalidbefore?.value ?: 0L), (notvalidafter?.value ?: 0L), (status?.value ?: 0L))
