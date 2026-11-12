@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mcastApiCleanup() {
    windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()
}

public actual fun mcastApiStartup(version: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(version.rawAddress.toCPointer<ByteVar>())

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr<McastScopeEntry>, pscopelen: MutPtr<UInt>, pscopecount: MutPtr<UInt>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(addrfamily, requery, pscopelist.rawAddress.toCPointer<ByteVar>(), pscopelen.rawAddress.toCPointer<ByteVar>(), pscopecount.rawAddress.toCPointer<ByteVar>())

public actual fun mcastGenUID(prequestid: MutPtr<McastClientUid>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(prequestid.rawAddress.toCPointer<ByteVar>())

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, preleaserequest: MutPtr<McastLeaseRequest>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(addrfamily, prequestid.rawAddress.toCPointer<ByteVar>(), preleaserequest.rawAddress.toCPointer<ByteVar>())

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, prenewrequest: MutPtr<McastLeaseRequest>, prenewresponse: MutPtr<McastLeaseResponse>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(addrfamily, prequestid.rawAddress.toCPointer<ByteVar>(), prenewrequest.rawAddress.toCPointer<ByteVar>(), prenewresponse.rawAddress.toCPointer<ByteVar>())

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr<McastClientUid>, pscopectx: MutPtr<McastScopeCtx>, paddrrequest: MutPtr<McastLeaseRequest>, paddrresponse: MutPtr<McastLeaseResponse>): UInt =
    windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(addrfamily, prequestid.rawAddress.toCPointer<ByteVar>(), pscopectx.rawAddress.toCPointer<ByteVar>(), paddrrequest.rawAddress.toCPointer<ByteVar>(), paddrresponse.rawAddress.toCPointer<ByteVar>())
