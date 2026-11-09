@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun AcquireDeveloperLicense(hwndparent: HWND, pexpiration: Long): HRESULT =
    0

public actual fun CheckDeveloperLicense(pexpiration: Long): HRESULT =
    0

public actual fun RemoveDeveloperLicense(hwndparent: HWND): HRESULT =
    0
