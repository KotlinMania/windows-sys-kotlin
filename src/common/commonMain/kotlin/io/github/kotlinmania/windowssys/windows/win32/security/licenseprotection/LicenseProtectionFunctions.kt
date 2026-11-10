package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: COpaquePointer?): Hresult

public expect fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: COpaquePointer?, notvalidafter: COpaquePointer?, status: COpaquePointer?): Hresult
