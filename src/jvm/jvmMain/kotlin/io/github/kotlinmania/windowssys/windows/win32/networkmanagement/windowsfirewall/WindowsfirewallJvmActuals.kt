@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private object WindowsWin32NetworkmanagementWindowsfirewallJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties(pprops: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName(pszwname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Long, netisoerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(flags: Int, pdwnumpublicappcs: Long, pppublicappcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules(newenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers(ppublicappcs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync(wszservername: Long, dwflags: Int, context: Long, callback: Long, hoperation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose(hoperation: Long, bwaitforoperation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(flags: Int, callback: Long, context: Long, registrationobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(dwnumpublicappcs: Int, appcontainersids: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries(applicationcontainersid: Long, packagefullname: Long, packagefolder: Long, displayname: Long, bbinariesfullycomputed: Int, binaries: Long, binariescount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges(registrationobject: Long): Int
}

public actual fun ncFreeNetconProperties(pprops: COpaquePointer?) {
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties((pprops?.value ?: 0L))
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName((pszwname?.value ?: 0L))

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo((wszservername?.value ?: 0L), (netisoerror?.value ?: 0L)).toUInt()

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(flags.toInt(), (pdwnumpublicappcs?.value ?: 0L), (pppublicappcs?.value ?: 0L)).toUInt()

public actual fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules((newenum?.value ?: 0L))

public actual fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers((ppublicappcs?.value ?: 0L)).toUInt()

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig((pdwnumpublicappcs?.value ?: 0L), (appcontainersids?.value ?: 0L)).toUInt()

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync((wszservername?.value ?: 0L), dwflags.toInt(), (context?.value ?: 0L), 0L, (hoperation?.value ?: 0L)).toUInt()

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose((hoperation?.value ?: 0L), bwaitforoperation).toUInt()

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(flags.toInt(), 0L, (context?.value ?: 0L), (registrationobject?.value ?: 0L)).toUInt()

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(dwnumpublicappcs.toInt(), (appcontainersids?.value ?: 0L)).toUInt()

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries((applicationcontainersid?.value ?: 0L), (packagefullname?.value ?: 0L), (packagefolder?.value ?: 0L), (displayname?.value ?: 0L), bbinariesfullycomputed, (binaries?.value ?: 0L), binariescount.toInt())

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfirewallJniBridge.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges((registrationobject?.value ?: 0L)).toUInt()
