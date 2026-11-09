@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun RegisterLicenseKeyWithExpiration(licensekey: PCWSTR, validityindays: UInt, status: Long): HRESULT =
    0

public actual fun ValidateLicenseKeyProtection(licensekey: PCWSTR, notvalidbefore: Long, notvalidafter: Long, status: Long): HRESULT =
    0
