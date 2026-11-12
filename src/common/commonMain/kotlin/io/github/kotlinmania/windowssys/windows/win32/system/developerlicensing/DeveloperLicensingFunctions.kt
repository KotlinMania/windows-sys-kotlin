package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: MutPtr<Filetime>): Hresult

public expect fun checkDeveloperLicense(pexpiration: MutPtr<Filetime>): Hresult

public expect fun removeDeveloperLicense(hwndparent: Hwnd): Hresult
