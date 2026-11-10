package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun createDataModelManager(debughost: COpaquePointer?, manager: COpaquePointer?): Hresult

public expect fun debugConnect(remoteoptions: Pcstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult

public expect fun debugConnectWide(remoteoptions: Pcwstr, interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult

public expect fun debugCreate(interfaceid: COpaquePointer?, iface: COpaquePointer?): Hresult

public expect fun debugCreateEx(interfaceid: COpaquePointer?, dbgengoptions: UInt, iface: COpaquePointer?): Hresult
