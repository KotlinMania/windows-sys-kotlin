@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AcquireDeveloperLicense(hwndparent: HWND, pexpiration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_AcquireDeveloperLicense(hwndparent.toCPointer<ByteVar>(), pexpiration.toCPointer<ByteVar>())

public actual fun CheckDeveloperLicense(pexpiration: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_CheckDeveloperLicense(pexpiration.toCPointer<ByteVar>())

public actual fun RemoveDeveloperLicense(hwndparent: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing.cinterop.windowssys_windows_win32_system_developerlicensing_RemoveDeveloperLicense(hwndparent.toCPointer<ByteVar>())
