@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: MutPtr): Hresult =
    windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent.rawAddress.toCPointer<ByteVar>(), pexpiration.rawAddress.toCPointer<ByteVar>())

public actual fun checkDeveloperLicense(pexpiration: MutPtr): Hresult =
    windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration.rawAddress.toCPointer<ByteVar>())

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent.rawAddress.toCPointer<ByteVar>())
