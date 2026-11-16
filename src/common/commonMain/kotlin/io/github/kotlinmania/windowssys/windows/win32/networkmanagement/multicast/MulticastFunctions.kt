package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun mcastApiCleanup()

public expect fun mcastApiStartup(version: MutPtr): UInt

public expect fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr, pscopelen: MutPtr, pscopecount: MutPtr): UInt

public expect fun mcastGenUID(prequestid: MutPtr): UInt

public expect fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr, preleaserequest: MutPtr): UInt

public expect fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr, prenewrequest: MutPtr, prenewresponse: MutPtr): UInt

public expect fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr, pscopectx: MutPtr, paddrrequest: MutPtr, paddrresponse: MutPtr): UInt
