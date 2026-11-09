@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.core.BOOL

public actual fun McastApiCleanup() {
}

public actual fun McastApiStartup(version: Long): UInt =
    0u

public actual fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt =
    0u

public actual fun McastGenUID(prequestid: Long): UInt =
    0u

public actual fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt =
    0u

public actual fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt =
    0u

public actual fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt =
    0u
