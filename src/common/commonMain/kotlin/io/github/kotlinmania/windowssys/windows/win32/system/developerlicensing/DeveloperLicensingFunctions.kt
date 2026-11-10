package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: COpaquePointer?): Hresult

public expect fun checkDeveloperLicense(pexpiration: COpaquePointer?): Hresult

public expect fun removeDeveloperLicense(hwndparent: Hwnd): Hresult
