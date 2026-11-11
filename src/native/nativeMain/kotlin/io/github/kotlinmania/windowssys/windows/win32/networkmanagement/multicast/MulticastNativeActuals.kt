@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastGenUID
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast.cinterop.windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun mcastApiCleanup() {
    windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup()
}

public actual fun mcastApiStartup(version: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup(version?.value?.toCPointer<ByteVar>())

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: COpaquePointer?, pscopelen: COpaquePointer?, pscopecount: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(addrfamily, requery, pscopelist?.value?.toCPointer<ByteVar>(), pscopelen?.value?.toCPointer<ByteVar>(), pscopecount?.value?.toCPointer<ByteVar>())

public actual fun mcastGenUID(prequestid: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastGenUID(prequestid?.value?.toCPointer<ByteVar>())

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: COpaquePointer?, preleaserequest: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(addrfamily, prequestid?.value?.toCPointer<ByteVar>(), preleaserequest?.value?.toCPointer<ByteVar>())

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: COpaquePointer?, prenewrequest: COpaquePointer?, prenewresponse: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(addrfamily, prequestid?.value?.toCPointer<ByteVar>(), prenewrequest?.value?.toCPointer<ByteVar>(), prenewresponse?.value?.toCPointer<ByteVar>())

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: COpaquePointer?, pscopectx: COpaquePointer?, paddrrequest: COpaquePointer?, paddrresponse: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(addrfamily, prequestid?.value?.toCPointer<ByteVar>(), pscopectx?.value?.toCPointer<ByteVar>(), paddrrequest?.value?.toCPointer<ByteVar>(), paddrresponse?.value?.toCPointer<ByteVar>())
