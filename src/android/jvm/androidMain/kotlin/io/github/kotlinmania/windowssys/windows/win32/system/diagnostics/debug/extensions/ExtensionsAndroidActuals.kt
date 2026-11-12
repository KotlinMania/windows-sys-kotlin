@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost: Long, manager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions: Long, interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid: Long, iface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid: Long, dbgengoptions: Int, iface: Long): Int
}

public actual fun createDataModelManager(debughost: MutPtr, manager: MutPtr): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost.rawAddress, manager.rawAddress)

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr, iface: MutPtr): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions.rawAddress, interfaceid.rawAddress, iface.rawAddress)

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr, iface: MutPtr): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions.rawAddress, interfaceid.rawAddress, iface.rawAddress)

public actual fun debugCreate(interfaceid: ConstPtr, iface: MutPtr): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid.rawAddress, iface.rawAddress)

public actual fun debugCreateEx(interfaceid: ConstPtr, dbgengoptions: UInt, iface: MutPtr): Hresult =
    WindowsWin32SystemDiagnosticsDebugExtensionsJniBridge.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid.rawAddress, dbgengoptions.toInt(), iface.rawAddress)
