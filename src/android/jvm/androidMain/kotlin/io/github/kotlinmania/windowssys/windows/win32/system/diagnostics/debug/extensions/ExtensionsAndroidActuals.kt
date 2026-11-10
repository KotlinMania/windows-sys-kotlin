@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_createDataModelManager(debughost: Long, manager: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnect(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnectWide(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreate(interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreateEx(interfaceid: Long, dbgengoptions: Int, iface: Long): Int
}

public actual fun createDataModelManager(debughost: COpaquePointer?, manager: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_createDataModelManager((debughost?.value ?: 0L), (manager?.value ?: 0L))

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnect((remoteoptions?.value ?: 0L), (interfaceid?.value ?: 0L), (iface?.value ?: 0L))

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_debugConnectWide((remoteoptions?.value ?: 0L), (interfaceid?.value ?: 0L), (iface?.value ?: 0L))

public actual fun debugCreate(interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreate((interfaceid?.value ?: 0L), (iface?.value ?: 0L))

public actual fun debugCreateEx(interfaceid: COpaquePointer?, dbgengoptions: UInt, iface: COpaquePointer?): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssys_windows_win32_system_diagnostics_debug_extensions_debugCreateEx((interfaceid?.value ?: 0L), dbgengoptions.toInt(), (iface?.value ?: 0L))
