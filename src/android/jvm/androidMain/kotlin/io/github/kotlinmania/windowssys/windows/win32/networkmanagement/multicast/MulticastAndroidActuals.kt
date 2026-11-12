@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.multicast

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32NetworkmanagementMulticastJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(version: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(addrfamily: Short, requery: Int, pscopelist: Long, pscopelen: Long, pscopecount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(prequestid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(addrfamily: Short, prequestid: Long, preleaserequest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(addrfamily: Short, prequestid: Long, prenewrequest: Long, prenewresponse: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(addrfamily: Short, prequestid: Long, pscopectx: Long, paddrrequest: Long, paddrresponse: Long): Int
}

public actual fun mcastApiCleanup() {
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastApiCleanup()
}

public actual fun mcastApiStartup(version: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastApiStartup(version.rawAddress).toUInt()

public actual fun mcastEnumerateScopes(addrfamily: UShort, requery: Bool, pscopelist: MutPtr, pscopelen: MutPtr, pscopecount: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastEnumerateScopes(addrfamily.toShort(), requery, pscopelist.rawAddress, pscopelen.rawAddress, pscopecount.rawAddress).toUInt()

public actual fun mcastGenUID(prequestid: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastGenUID(prequestid.rawAddress).toUInt()

public actual fun mcastReleaseAddress(addrfamily: UShort, prequestid: MutPtr, preleaserequest: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastReleaseAddress(addrfamily.toShort(), prequestid.rawAddress, preleaserequest.rawAddress).toUInt()

public actual fun mcastRenewAddress(addrfamily: UShort, prequestid: MutPtr, prenewrequest: MutPtr, prenewresponse: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastRenewAddress(addrfamily.toShort(), prequestid.rawAddress, prenewrequest.rawAddress, prenewresponse.rawAddress).toUInt()

public actual fun mcastRequestAddress(addrfamily: UShort, prequestid: MutPtr, pscopectx: MutPtr, paddrrequest: MutPtr, paddrresponse: MutPtr): UInt =
    WindowsWin32NetworkmanagementMulticastJniBridge.windowssysWindowsWin32NetworkmanagementMulticastMcastRequestAddress(addrfamily.toShort(), prequestid.rawAddress, pscopectx.rawAddress, paddrrequest.rawAddress, paddrresponse.rawAddress).toUInt()
