@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT =
    0

public actual fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT =
    0

public actual fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT =
    0

public actual fun DebugCreate(interfaceid: Long, iface: Long): HRESULT =
    0

public actual fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT =
    0
