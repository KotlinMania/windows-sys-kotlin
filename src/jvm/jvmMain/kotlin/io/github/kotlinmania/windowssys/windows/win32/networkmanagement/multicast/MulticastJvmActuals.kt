@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32NetworkmanagementMulticastJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastApiCleanup()

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastApiStartup(version: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastEnumerateScopes(addrfamily: Short, requery: Int, pscopelist: Long, pscopelen: Long, pscopecount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastGenUID(prequestid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastReleaseAddress(addrfamily: Short, prequestid: Long, preleaserequest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastRenewAddress(addrfamily: Short, prequestid: Long, prenewrequest: Long, prenewresponse: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_multicast_McastRequestAddress(addrfamily: Short, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): Int
}

public actual fun McastApiCleanup() {
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastApiCleanup()
}

public actual fun McastApiStartup(version: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastApiStartup(version).toUInt()

public actual fun McastEnumerateScopes(addrfamily: UShort, requery: BOOL, pscopelist: Long, pscopelen: Long, pscopecount: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastEnumerateScopes(addrfamily.toShort(), requery, pscopelist, pscopelen, pscopecount).toUInt()

public actual fun McastGenUID(prequestid: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastGenUID(prequestid).toUInt()

public actual fun McastReleaseAddress(addrfamily: UShort, prequestid: Long, preleaserequest: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastReleaseAddress(addrfamily.toShort(), prequestid, preleaserequest).toUInt()

public actual fun McastRenewAddress(addrfamily: UShort, prequestid: Long, prenewrequest: Long, prenewresponse: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastRenewAddress(addrfamily.toShort(), prequestid, prenewrequest, prenewresponse).toUInt()

public actual fun McastRequestAddress(addrfamily: UShort, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssys_windows_win32_networkmanagement_multicast_McastRequestAddress(addrfamily.toShort(), prequestid, pscopectx, paddrrequest, paddrresponse).toUInt()
