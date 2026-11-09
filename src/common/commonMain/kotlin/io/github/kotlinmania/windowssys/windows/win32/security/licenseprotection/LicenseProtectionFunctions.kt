package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun RegisterLicenseKeyWithExpiration(licensekey: PCWSTR, validityindays: UInt, status: Long): HRESULT

public expect fun ValidateLicenseKeyProtection(licensekey: PCWSTR, notvalidbefore: Long, notvalidafter: Long, status: Long): HRESULT
