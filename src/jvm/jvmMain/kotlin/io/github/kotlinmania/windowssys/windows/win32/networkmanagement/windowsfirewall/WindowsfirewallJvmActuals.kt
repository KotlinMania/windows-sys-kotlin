@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private object WindowsWin32NetworkmanagementWindowsfirewallJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NcFreeNetconProperties(pprops: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NcIsValidConnectionName(pszwname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Long, netisoerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumAppContainers(flags: Int, pdwnumpublicappcs: Long, pppublicappcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumerateAppContainerRules(newenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationFreeAppContainers(ppublicappcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdAsync(wszservername: Long, dwflags: Int, context: Long, callback: Long, hoperation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdClose(hoperation: Long, bwaitforoperation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationRegisterForAppContainerChanges(flags: Int, callback: Long, context: Long, registrationobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: Int, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: Long, packagefullname: Long, packagefolder: Long, displayname: Long, bbinariesfullycomputed: Int, binaries: Long, binariescount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationUnregisterForAppContainerChanges(registrationobject: Long): Int
}

public actual fun NcFreeNetconProperties(pprops: Long) {
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NcFreeNetconProperties(pprops)
}

public actual fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NcIsValidConnectionName(pszwname)

public actual fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername, netisoerror).toUInt()

public actual fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumAppContainers(flags.toInt(), pdwnumpublicappcs, pppublicappcs).toUInt()

public actual fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumerateAppContainerRules(newenum)

public actual fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationFreeAppContainers(ppublicappcs).toUInt()

public actual fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs, appcontainersids).toUInt()

public actual fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdAsync(wszservername, dwflags.toInt(), context, callback.toLong(), hoperation).toUInt()

public actual fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdClose(hoperation, bwaitforoperation).toUInt()

public actual fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationRegisterForAppContainerChanges(flags.toInt(), callback.toLong(), context, registrationobject).toUInt()

public actual fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), appcontainersids).toUInt()

public actual fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetupAppContainerBinaries(applicationcontainersid, packagefullname, packagefolder, displayname, bbinariesfullycomputed, binaries, binariescount.toInt())

public actual fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationUnregisterForAppContainerChanges(registrationobject).toUInt()
