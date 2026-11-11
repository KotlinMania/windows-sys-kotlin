@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_acquireDeveloperLicense
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_checkDeveloperLicense
import io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_removeDeveloperLicense
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_developerlicensing_acquireDeveloperLicense(hwndparent?.value?.toCPointer<ByteVar>(), pexpiration?.value?.toCPointer<ByteVar>())

public actual fun checkDeveloperLicense(pexpiration: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_developerlicensing_checkDeveloperLicense(pexpiration?.value?.toCPointer<ByteVar>())

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    windowssys_windows_win32_system_developerlicensing_removeDeveloperLicense(hwndparent?.value?.toCPointer<ByteVar>())
