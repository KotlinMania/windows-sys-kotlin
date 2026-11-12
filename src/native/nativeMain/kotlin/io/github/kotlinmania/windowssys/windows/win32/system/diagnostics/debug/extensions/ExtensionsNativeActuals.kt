@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions.cinterop.windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun createDataModelManager(debughost: MutPtr<CVoid>, manager: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDiagnosticsDebugExtensionsCreateDataModelManager(debughost.rawAddress.toCPointer<ByteVar>(), manager.rawAddress.toCPointer<ByteVar>())

public actual fun debugConnect(remoteoptions: Pcstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnect(remoteoptions.rawAddress.toCPointer<ByteVar>(), interfaceid.rawAddress.toCPointer<ByteVar>(), iface.rawAddress.toCPointer<ByteVar>())

public actual fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugConnectWide(remoteoptions.rawAddress.toCPointer<ByteVar>(), interfaceid.rawAddress.toCPointer<ByteVar>(), iface.rawAddress.toCPointer<ByteVar>())

public actual fun debugCreate(interfaceid: ConstPtr<Guid>, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreate(interfaceid.rawAddress.toCPointer<ByteVar>(), iface.rawAddress.toCPointer<ByteVar>())

public actual fun debugCreateEx(interfaceid: ConstPtr<Guid>, dbgengoptions: UInt, iface: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDiagnosticsDebugExtensionsDebugCreateEx(interfaceid.rawAddress.toCPointer<ByteVar>(), dbgengoptions, iface.rawAddress.toCPointer<ByteVar>())
