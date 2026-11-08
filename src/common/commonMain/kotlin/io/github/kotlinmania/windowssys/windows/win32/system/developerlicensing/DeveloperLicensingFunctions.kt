package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun AcquireDeveloperLicense(hwndparent: HWND, pexpiration: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "AcquireDeveloperLicense", longArrayOf(hwndparent, pexpiration)).toInt()
}

public fun CheckDeveloperLicense(pexpiration: Long): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "CheckDeveloperLicense", longArrayOf(pexpiration)).toInt()
}

public fun RemoveDeveloperLicense(hwndparent: HWND): HRESULT {
    return Win32DynamicFfi.invoke("wsclient.dll", "RemoveDeveloperLicense", longArrayOf(hwndparent)).toInt()
}
