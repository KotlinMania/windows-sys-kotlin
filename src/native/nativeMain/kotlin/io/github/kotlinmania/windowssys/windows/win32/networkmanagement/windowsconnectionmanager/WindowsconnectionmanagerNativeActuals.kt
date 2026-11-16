@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsconnectionmanager.cinterop.windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun freeInterfaceContextTable(interfacecontexttable: ConstPtr) {
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerFreeInterfaceContextTable(interfacecontexttable.rawAddress.toCPointer<ByteVar>())
}

public actual fun getInterfaceContextTableForHostName(hostname: Pcwstr, proxyname: Pcwstr, flags: UInt, connectionprofilefilterrawdata: ConstPtr, connectionprofilefilterrawdatasize: UInt, interfacecontexttable: MutPtr): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerGetInterfaceContextTableForHostName(hostname.rawAddress.toCPointer<ByteVar>(), proxyname.rawAddress.toCPointer<ByteVar>(), flags, connectionprofilefilterrawdata.rawAddress.toCPointer<ByteVar>(), connectionprofilefilterrawdatasize, interfacecontexttable.rawAddress.toCPointer<ByteVar>())

public actual fun onDemandGetRoutingHint(destinationhostname: Pcwstr, interfaceindex: MutPtr): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandGetRoutingHint(destinationhostname.rawAddress.toCPointer<ByteVar>(), interfaceindex.rawAddress.toCPointer<ByteVar>())

public actual fun onDemandRegisterNotification(callback: OndemandNotificationCallback, callbackcontext: ConstPtr, registrationhandle: MutPtr): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandRegisterNotification(0L.toCPointer<ByteVar>(), callbackcontext.rawAddress.toCPointer<ByteVar>(), registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun onDemandUnRegisterNotification(registrationhandle: Handle): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerOnDemandUnRegisterNotification(registrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wcmFreeMemory(pmemory: MutPtr) {
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmFreeMemory(pmemory.rawAddress.toCPointer<ByteVar>())
}

public actual fun wcmGetProfileList(preserved: ConstPtr, ppprofilelist: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmGetProfileList(preserved.rawAddress.toCPointer<ByteVar>(), ppprofilelist.rawAddress.toCPointer<ByteVar>())

public actual fun wcmQueryProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, pdwdatasize: MutPtr, ppdata: MutPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmQueryProperty(pinterface.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), property, preserved.rawAddress.toCPointer<ByteVar>(), pdwdatasize.rawAddress.toCPointer<ByteVar>(), ppdata.rawAddress.toCPointer<ByteVar>())

public actual fun wcmSetProfileList(pprofilelist: ConstPtr, dwposition: UInt, fignoreunknownprofiles: Bool, preserved: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProfileList(pprofilelist.rawAddress.toCPointer<ByteVar>(), dwposition, fignoreunknownprofiles, preserved.rawAddress.toCPointer<ByteVar>())

public actual fun wcmSetProperty(pinterface: ConstPtr, strprofilename: Pcwstr, property: WcmProperty, preserved: ConstPtr, dwdatasize: UInt, pbdata: ConstPtr): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsconnectionmanagerWcmSetProperty(pinterface.rawAddress.toCPointer<ByteVar>(), strprofilename.rawAddress.toCPointer<ByteVar>(), property, preserved.rawAddress.toCPointer<ByteVar>(), dwdatasize, pbdata.rawAddress.toCPointer<ByteVar>())
