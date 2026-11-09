package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun AcquireDeveloperLicense(hwndparent: HWND, pexpiration: Long): HRESULT

public expect fun CheckDeveloperLicense(pexpiration: Long): HRESULT

public expect fun RemoveDeveloperLicense(hwndparent: HWND): HRESULT
