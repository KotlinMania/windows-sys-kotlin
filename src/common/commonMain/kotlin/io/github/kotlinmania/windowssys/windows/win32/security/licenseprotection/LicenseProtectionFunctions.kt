package io.github.kotlinmania.windowssys.windows.win32.security.licenseprotection

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun RegisterLicenseKeyWithExpiration(licensekey: PCWSTR, validityindays: UInt, status: Long): HRESULT {
    return Win32DynamicFfi.invoke("licenseprotection.dll", "RegisterLicenseKeyWithExpiration", longArrayOf(licensekey, validityindays.toLong(), status)).toInt()
}

public fun ValidateLicenseKeyProtection(licensekey: PCWSTR, notvalidbefore: Long, notvalidafter: Long, status: Long): HRESULT {
    return Win32DynamicFfi.invoke("licenseprotection.dll", "ValidateLicenseKeyProtection", longArrayOf(licensekey, notvalidbefore, notvalidafter, status)).toInt()
}
