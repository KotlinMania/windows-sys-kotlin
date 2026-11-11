@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ncFreeNetconProperties(pprops: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_windowsfirewall_ncFreeNetconProperties(pprops?.value?.toCPointer<ByteVar>())
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    windowssys_windows_win32_networkmanagement_windowsfirewall_ncIsValidConnectionName(pszwname?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername?.value?.toCPointer<ByteVar>(), netisoerror?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumAppContainers(flags, pdwnumpublicappcs?.value?.toCPointer<ByteVar>(), pppublicappcs?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationEnumerateAppContainerRules(newenum?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationFreeAppContainers(ppublicappcs?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetAppContainerConfig(pdwnumpublicappcs?.value?.toCPointer<ByteVar>(), appcontainersids?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdAsync(wszservername?.value?.toCPointer<ByteVar>(), dwflags, context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), hoperation?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationGetEnterpriseIdClose(hoperation?.value?.toCPointer<ByteVar>(), bwaitforoperation)

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationRegisterForAppContainerChanges(flags, 0L.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), registrationobject?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetAppContainerConfig(dwnumpublicappcs, appcontainersids?.value?.toCPointer<ByteVar>())

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationSetupAppContainerBinaries(applicationcontainersid?.value?.toCPointer<ByteVar>(), packagefullname?.value?.toCPointer<ByteVar>(), packagefolder?.value?.toCPointer<ByteVar>(), displayname?.value?.toCPointer<ByteVar>(), bbinariesfullycomputed, binaries?.value?.toCPointer<ByteVar>(), binariescount)

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    windowssys_windows_win32_networkmanagement_windowsfirewall_networkIsolationUnregisterForAppContainerChanges(registrationobject?.value?.toCPointer<ByteVar>())
