@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

private object WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_CreateDataModelManager(debughost: Long, manager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnect(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnectWide(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreate(interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreateEx(interfaceid: Long, dbgengoptions: Int, iface: Long): Int
}

public actual fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_CreateDataModelManager(debughost, manager)

public actual fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnect(remoteoptions, interfaceid, iface)

public actual fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugConnectWide(remoteoptions, interfaceid, iface)

public actual fun DebugCreate(interfaceid: Long, iface: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreate(interfaceid, iface)

public actual fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_DebugCreateEx(interfaceid, dbgengoptions.toInt(), iface)
