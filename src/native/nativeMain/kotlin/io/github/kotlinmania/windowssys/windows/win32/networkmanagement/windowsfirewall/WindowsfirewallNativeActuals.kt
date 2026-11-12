@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ncFreeNetconProperties(pprops: MutPtr<NetconProperties>) {
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(pprops.rawAddress.toCPointer<ByteVar>())
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(pszwname.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr<NetisoErrorType>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.rawAddress.toCPointer<ByteVar>(), netisoerror.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr<UInt>, pppublicappcs: MutPtr<MutPtr<InetFirewallAppContainer>>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(flags, pdwnumpublicappcs.rawAddress.toCPointer<ByteVar>(), pppublicappcs.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(newenum.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr<InetFirewallAppContainer>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(ppublicappcs.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr<UInt>, appcontainersids: MutPtr<MutPtr<SidAndAttributes>>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.rawAddress.toCPointer<ByteVar>(), appcontainersids.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr<CVoid>, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(wszservername.rawAddress.toCPointer<ByteVar>(), dwflags, context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hoperation.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(hoperation.rawAddress.toCPointer<ByteVar>(), bwaitforoperation)

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr<CVoid>, registrationobject: MutPtr<Handle>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(flags, 0L.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), registrationobject.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr<SidAndAttributes>): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(dwnumpublicappcs, appcontainersids.rawAddress.toCPointer<ByteVar>())

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr<Pcwstr>, binariescount: UInt): Hresult =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(applicationcontainersid.rawAddress.toCPointer<ByteVar>(), packagefullname.rawAddress.toCPointer<ByteVar>(), packagefolder.rawAddress.toCPointer<ByteVar>(), displayname.rawAddress.toCPointer<ByteVar>(), bbinariesfullycomputed, binaries.rawAddress.toCPointer<ByteVar>(), binariescount)

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(registrationobject.rawAddress.toCPointer<ByteVar>())
