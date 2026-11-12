@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration
import io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection.cinterop.windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: MutPtr<LicenseProtectionStatus>): Hresult =
    windowssysWindowsWin32SecurityLicenseprotectionRegisterLicenseKeyWithExpiration(licensekey.rawAddress.toCPointer<ByteVar>(), validityindays, status.rawAddress.toCPointer<ByteVar>())

public actual fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: MutPtr<Filetime>, notvalidafter: MutPtr<Filetime>, status: MutPtr<LicenseProtectionStatus>): Hresult =
    windowssysWindowsWin32SecurityLicenseprotectionValidateLicenseKeyProtection(licensekey.rawAddress.toCPointer<ByteVar>(), notvalidbefore.rawAddress.toCPointer<ByteVar>(), notvalidafter.rawAddress.toCPointer<ByteVar>(), status.rawAddress.toCPointer<ByteVar>())
