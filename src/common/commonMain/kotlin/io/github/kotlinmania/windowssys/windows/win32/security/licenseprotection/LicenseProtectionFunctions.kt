package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun registerLicenseKeyWithExpiration(licensekey: Pcwstr, validityindays: UInt, status: MutPtr): Hresult

public expect fun validateLicenseKeyProtection(licensekey: Pcwstr, notvalidbefore: MutPtr, notvalidafter: MutPtr, status: MutPtr): Hresult
