@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun McastApiCleanup() {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastApiCleanup()
}

public actual fun McastApiStartup(version: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastApiStartup(version.toCPointer<ByteVar>())

public actual fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastEnumerateScopes(addrfamily, requery, pscopelist.toCPointer<ByteVar>(), pscopelen.toCPointer<ByteVar>(), pscopecount.toCPointer<ByteVar>())

public actual fun McastGenUID(prequestid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastGenUID(prequestid.toCPointer<ByteVar>())

public actual fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastReleaseAddress(addrfamily, prequestid.toCPointer<ByteVar>(), preleaserequest.toCPointer<ByteVar>())

public actual fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastRenewAddress(addrfamily, prequestid.toCPointer<ByteVar>(), prenewrequest.toCPointer<ByteVar>(), prenewresponse.toCPointer<ByteVar>())

public actual fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_McastRequestAddress(addrfamily, prequestid.toCPointer<ByteVar>(), pscopectx.toCPointer<ByteVar>(), paddrrequest.toCPointer<ByteVar>(), paddrresponse.toCPointer<ByteVar>())
