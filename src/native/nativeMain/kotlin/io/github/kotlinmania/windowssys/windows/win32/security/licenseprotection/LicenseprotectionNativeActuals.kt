@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun RegisterLicenseKeyWithExpiration(licensekey: PCWSTR, validityindays: UInt, status: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssys_windows_win32_security_licenseprotection_RegisterLicenseKeyWithExpiration(licensekey.toCPointer<ByteVar>(), validityindays, status.toCPointer<ByteVar>())

public actual fun ValidateLicenseKeyProtection(licensekey: PCWSTR, notvalidbefore: Long, notvalidafter: Long, status: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssys_windows_win32_security_licenseprotection_ValidateLicenseKeyProtection(licensekey.toCPointer<ByteVar>(), notvalidbefore.toCPointer<ByteVar>(), notvalidafter.toCPointer<ByteVar>(), status.toCPointer<ByteVar>())
