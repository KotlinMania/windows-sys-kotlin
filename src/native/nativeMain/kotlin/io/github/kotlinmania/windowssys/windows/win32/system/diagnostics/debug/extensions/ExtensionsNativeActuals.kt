@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_createDataModelManager
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnect
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnectWide
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreate
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreateEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun createDataModelManager(debughost: COpaquePointer?, manager: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_diagnostics_debug_extensions_createDataModelManager(debughost?.value?.toCPointer<ByteVar>(), manager?.value?.toCPointer<ByteVar>())

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnect(remoteoptions?.value?.toCPointer<ByteVar>(), interfaceid?.value?.toCPointer<ByteVar>(), iface?.value?.toCPointer<ByteVar>())

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnectWide(remoteoptions?.value?.toCPointer<ByteVar>(), interfaceid?.value?.toCPointer<ByteVar>(), iface?.value?.toCPointer<ByteVar>())

public actual fun debugCreate(interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreate(interfaceid?.value?.toCPointer<ByteVar>(), iface?.value?.toCPointer<ByteVar>())

public actual fun debugCreateEx(interfaceid: COpaquePointer?, dbgengoptions: UInt, iface: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreateEx(interfaceid?.value?.toCPointer<ByteVar>(), dbgengoptions, iface?.value?.toCPointer<ByteVar>())
