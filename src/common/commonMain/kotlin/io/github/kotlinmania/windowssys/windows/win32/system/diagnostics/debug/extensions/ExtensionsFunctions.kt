package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT

public expect fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT

public expect fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT

public expect fun DebugCreate(interfaceid: Long, iface: Long): HRESULT

public expect fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT
