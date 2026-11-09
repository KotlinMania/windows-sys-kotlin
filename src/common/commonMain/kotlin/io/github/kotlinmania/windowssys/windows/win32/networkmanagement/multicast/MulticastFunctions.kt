package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.core.BOOL

public expect fun McastApiCleanup()

public expect fun McastApiStartup(version: Long): UInt

public expect fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt

public expect fun McastGenUID(prequestid: Long): UInt

public expect fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt

public expect fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt

public expect fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt
