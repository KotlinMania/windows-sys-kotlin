@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32NetworkmanagementMulticastJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup(version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(addrfamily: Short, requery: Int, pscopelist: Long, pscopelen: Long, pscopecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastGenUID(prequestid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(addrfamily: Short, prequestid: Long, preleaserequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(addrfamily: Short, prequestid: Long, prenewrequest: Long, prenewresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(addrfamily: Short, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): Int
}

public actual fun mcastApiCleanup() {
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastApiCleanup()
}

public actual fun mcastApiStartup(version: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastApiStartup((version?.value ?: 0L)).toUInt()

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: COpaquePointer?, pscopelen: COpaquePointer?, pscopecount: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastEnumerateScopes(addrfamily.toShort(), requery, (pscopelist?.value ?: 0L), (pscopelen?.value ?: 0L), (pscopecount?.value ?: 0L)).toUInt()

public actual fun mcastGenUID(prequestid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastGenUID((prequestid?.value ?: 0L)).toUInt()

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: COpaquePointer?, preleaserequest: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastReleaseAddress(addrfamily.toShort(), (prequestid?.value ?: 0L), (preleaserequest?.value ?: 0L)).toUInt()

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: COpaquePointer?, prenewrequest: COpaquePointer?, prenewresponse: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastRenewAddress(addrfamily.toShort(), (prequestid?.value ?: 0L), (prenewrequest?.value ?: 0L), (prenewresponse?.value ?: 0L)).toUInt()

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: COpaquePointer?, pscopectx: COpaquePointer?, paddrrequest: COpaquePointer?, paddrresponse: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_mcastRequestAddress(addrfamily.toShort(), (prequestid?.value ?: 0L), (pscopectx?.value ?: 0L), (paddrrequest?.value ?: 0L), (paddrresponse?.value ?: 0L)).toUInt()
