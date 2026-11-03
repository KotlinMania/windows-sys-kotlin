package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun GetExtensionVersion(pver: Long): BOOL {
    return Win32DynamicFfi.invoke("rpcproxy.dll", "GetExtensionVersion", longArrayOf(pver)).toInt()
}

public fun GetFilterVersion(pver: Long): BOOL {
    return Win32DynamicFfi.invoke("rpcproxy.dll", "GetFilterVersion", longArrayOf(pver)).toInt()
}

public fun HttpExtensionProc(pecb: Long): UInt {
    return Win32DynamicFfi.invoke("rpcproxy.dll", "HttpExtensionProc", longArrayOf(pecb)).toUInt()
}

public fun HttpFilterProc(pfc: Long, notificationtype: UInt, pvnotification: Long): UInt {
    return Win32DynamicFfi.invoke("rpcproxy.dll", "HttpFilterProc", longArrayOf(pfc, notificationtype.toLong(), pvnotification)).toUInt()
}
