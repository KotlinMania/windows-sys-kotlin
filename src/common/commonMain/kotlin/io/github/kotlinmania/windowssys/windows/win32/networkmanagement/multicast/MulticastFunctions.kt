package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

public expect fun mcastApiCleanup()

public expect fun mcastApiStartup(version: COpaquePointer?): UInt

public expect fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: COpaquePointer?, pscopelen: COpaquePointer?, pscopecount: COpaquePointer?): UInt

public expect fun mcastGenUID(prequestid: COpaquePointer?): UInt

public expect fun mcastReleaseAddress(addrfamily: UShort, prequestid: COpaquePointer?, preleaserequest: COpaquePointer?): UInt

public expect fun mcastRenewAddress(addrfamily: UShort, prequestid: COpaquePointer?, prenewrequest: COpaquePointer?, prenewresponse: COpaquePointer?): UInt

public expect fun mcastRequestAddress(addrfamily: UShort, prequestid: COpaquePointer?, pscopectx: COpaquePointer?, paddrrequest: COpaquePointer?, paddrresponse: COpaquePointer?): UInt
