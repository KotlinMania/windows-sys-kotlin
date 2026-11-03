package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL

public fun McastApiCleanup() {
    Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastApiCleanup", longArrayOf())
}

public fun McastApiStartup(version: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastApiStartup", longArrayOf(version)).toUInt()
}

public fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastEnumerateScopes", longArrayOf(addrfamily.toLong(), requery.toLong(), pscopelist, pscopelen, pscopecount)).toUInt()
}

public fun McastGenUID(prequestid: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastGenUID", longArrayOf(prequestid)).toUInt()
}

public fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastReleaseAddress", longArrayOf(addrfamily.toLong(), prequestid, preleaserequest)).toUInt()
}

public fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastRenewAddress", longArrayOf(addrfamily.toLong(), prequestid, prenewrequest, prenewresponse)).toUInt()
}

public fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt {
    return Win32DynamicFfi.invoke("dhcpcsvc.dll", "McastRequestAddress", longArrayOf(addrfamily.toLong(), prequestid, pscopectx, paddrrequest, paddrresponse)).toUInt()
}
