@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration
import io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_licenseprotection_registerLicenseKeyWithExpiration(licensekey?.value?.toCPointer<ByteVar>(), validityindays, status?.value?.toCPointer<ByteVar>())

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: COpaquePointer?, notvalidafter: COpaquePointer?, status: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_licenseprotection_validateLicenseKeyProtection(licensekey?.value?.toCPointer<ByteVar>(), notvalidbefore?.value?.toCPointer<ByteVar>(), notvalidafter?.value?.toCPointer<ByteVar>(), status?.value?.toCPointer<ByteVar>())
