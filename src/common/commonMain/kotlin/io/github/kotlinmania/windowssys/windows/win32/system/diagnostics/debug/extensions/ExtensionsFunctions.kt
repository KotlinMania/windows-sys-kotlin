package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.extensions

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun CreateDataModelManager(debughost: Long, manager: Long): HRESULT {
    return Win32DynamicFfi.invoke("dbgmodel.dll", "CreateDataModelManager", longArrayOf(debughost, manager)).toInt()
}

public fun DebugConnect(remoteoptions: PCSTR, interfaceid: Long, iface: Long): HRESULT {
    return Win32DynamicFfi.invoke("dbgeng.dll", "DebugConnect", longArrayOf(remoteoptions, interfaceid, iface)).toInt()
}

public fun DebugConnectWide(remoteoptions: PCWSTR, interfaceid: Long, iface: Long): HRESULT {
    return Win32DynamicFfi.invoke("dbgeng.dll", "DebugConnectWide", longArrayOf(remoteoptions, interfaceid, iface)).toInt()
}

public fun DebugCreate(interfaceid: Long, iface: Long): HRESULT {
    return Win32DynamicFfi.invoke("dbgeng.dll", "DebugCreate", longArrayOf(interfaceid, iface)).toInt()
}

public fun DebugCreateEx(interfaceid: Long, dbgengoptions: UInt, iface: Long): HRESULT {
    return Win32DynamicFfi.invoke("dbgeng.dll", "DebugCreateEx", longArrayOf(interfaceid, dbgengoptions.toLong(), iface)).toInt()
}
