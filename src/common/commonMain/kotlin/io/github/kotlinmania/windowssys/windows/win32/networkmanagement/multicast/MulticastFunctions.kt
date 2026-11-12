package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

public expect fun mcastApiCleanup()

public expect fun mcastApiStartup(version: MutPtr<UInt>): UInt

public expect fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr<McastScopeEntry>, pscopelen: MutPtr<UInt>, pscopecount: MutPtr<UInt>): UInt

public expect fun mcastGenUID(prequestid: MutPtr<McastClientUid>): UInt

public expect fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, preleaserequest: MutPtr<McastLeaseRequest>): UInt

public expect fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, prenewrequest: MutPtr<McastLeaseRequest>, prenewresponse: MutPtr<McastLeaseResponse>): UInt

public expect fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, pscopectx: MutPtr<McastScopeCtx>, paddrrequest: MutPtr<McastLeaseRequest>, paddrresponse: MutPtr<McastLeaseResponse>): UInt
