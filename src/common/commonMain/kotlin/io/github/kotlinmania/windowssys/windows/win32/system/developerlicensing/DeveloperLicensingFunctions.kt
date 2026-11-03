package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT

public fun AcquireDeveloperLicense(hwndparent: Foundation.HWND, pexpiration: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "AcquireDeveloperLicense", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent), pexpiration)).toInt()
}

public fun CheckDeveloperLicense(pexpiration: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "CheckDeveloperLicense", longArrayOf(pexpiration)).toInt()
}

public fun RemoveDeveloperLicense(hwndparent: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "RemoveDeveloperLicense", longArrayOf(Win32DynamicFfi.objectSlot(hwndparent))).toInt()
}
