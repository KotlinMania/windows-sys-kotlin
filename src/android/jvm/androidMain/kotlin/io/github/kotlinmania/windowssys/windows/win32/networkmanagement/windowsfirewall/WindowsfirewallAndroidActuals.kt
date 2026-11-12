@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

private object WindowsWin32NetworkmanagementWindowsfirewallJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(pprops: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(pszwname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Long, netisoerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(flags: Int, pdwnumpublicappcs: Long, pppublicappcs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(newenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(ppublicappcs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(wszservername: Long, dwflags: Int, context: Long, callback: Long, hoperation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(hoperation: Long, bwaitforoperation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(flags: Int, callback: Long, context: Long, registrationobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(dwnumpublicappcs: Int, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(applicationcontainersid: Long, packagefullname: Long, packagefolder: Long, displayname: Long, bbinariesfullycomputed: Int, binaries: Long, binariescount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(registrationobject: Long): Int
}

public actual fun ncFreeNetconProperties(pprops: MutPtr<NetconProperties>) {
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcFreeNetconProperties(pprops.rawAddress)
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNcIsValidConnectionName(pszwname.rawAddress)

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr<NetisoErrorType>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.rawAddress, netisoerror.rawAddress).toUInt()

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr<UInt>, pppublicappcs: MutPtr<MutPtr<InetFirewallAppContainer>>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumAppContainers(flags.toInt(), pdwnumpublicappcs.rawAddress, pppublicappcs.rawAddress).toUInt()

public actual fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationEnumerateAppContainerRules(newenum.rawAddress)

public actual fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr<InetFirewallAppContainer>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationFreeAppContainers(ppublicappcs.rawAddress).toUInt()

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr<UInt>, appcontainersids: MutPtr<MutPtr<SidAndAttributes>>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.rawAddress, appcontainersids.rawAddress).toUInt()

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr<CVoid>, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdAsync(wszservername.rawAddress, dwflags.toInt(), context.rawAddress, 0L, hoperation.rawAddress).toUInt()

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationGetEnterpriseIdClose(hoperation.rawAddress, bwaitforoperation).toUInt()

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr<CVoid>, registrationobject: MutPtr<Handle>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L, context.rawAddress, registrationobject.rawAddress).toUInt()

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr<SidAndAttributes>): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), appcontainersids.rawAddress).toUInt()

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr<Pcwstr>, binariescount: UInt): Hresult =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationSetupAppContainerBinaries(applicationcontainersid.rawAddress, packagefullname.rawAddress, packagefolder.rawAddress, displayname.rawAddress, bbinariesfullycomputed, binaries.rawAddress, binariescount.toInt())

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssysWindowsWin32NetworkmanagementWindowsfirewallNetworkIsolationUnregisterForAppContainerChanges(registrationobject.rawAddress).toUInt()
