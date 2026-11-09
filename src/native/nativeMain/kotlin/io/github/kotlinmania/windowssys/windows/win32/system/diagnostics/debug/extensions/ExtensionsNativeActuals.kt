@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_CreateDataModelManager(debughost.toCPointer<ByteVar>(), manager.toCPointer<ByteVar>())

public actual fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnect(remoteoptions.toCPointer<ByteVar>(), interfaceid.toCPointer<ByteVar>(), iface.toCPointer<ByteVar>())

public actual fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnectWide(remoteoptions.toCPointer<ByteVar>(), interfaceid.toCPointer<ByteVar>(), iface.toCPointer<ByteVar>())

public actual fun DebugCreate(interfaceid: Long, iface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreate(interfaceid.toCPointer<ByteVar>(), iface.toCPointer<ByteVar>())

public actual fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreateEx(interfaceid.toCPointer<ByteVar>(), dbgengoptions, iface.toCPointer<ByteVar>())
