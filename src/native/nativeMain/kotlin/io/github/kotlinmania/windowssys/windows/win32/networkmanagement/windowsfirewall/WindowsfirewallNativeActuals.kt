@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NcFreeNetconProperties(pprops: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NcFreeNetconProperties(pprops.toCPointer<ByteVar>())
}

public actual fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NcIsValidConnectionName(pszwname.toCPointer<ByteVar>())

public actual fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername.toCPointer<ByteVar>(), netisoerror.toCPointer<ByteVar>())

public actual fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumAppContainers(flags, pdwnumpublicappcs.toCPointer<ByteVar>(), pppublicappcs.toCPointer<ByteVar>())

public actual fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationEnumerateAppContainerRules(newenum.toCPointer<ByteVar>())

public actual fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationFreeAppContainers(ppublicappcs.toCPointer<ByteVar>())

public actual fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs.toCPointer<ByteVar>(), appcontainersids.toCPointer<ByteVar>())

public actual fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdAsync(wszservername.toCPointer<ByteVar>(), dwflags, context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), hoperation.toCPointer<ByteVar>())

public actual fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationGetEnterpriseIdClose(hoperation.toCPointer<ByteVar>(), bwaitforoperation)

public actual fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationRegisterForAppContainerChanges(flags, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), registrationobject.toCPointer<ByteVar>())

public actual fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetAppContainerConfig(dwnumpublicappcs, appcontainersids.toCPointer<ByteVar>())

public actual fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationSetupAppContainerBinaries(applicationcontainersid.toCPointer<ByteVar>(), packagefullname.toCPointer<ByteVar>(), packagefolder.toCPointer<ByteVar>(), displayname.toCPointer<ByteVar>(), bbinariesfullycomputed, binaries.toCPointer<ByteVar>(), binariescount)

public actual fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall.cinterop.windowssys_windows_win32_networkmanagement_windowsfirewall_NetworkIsolationUnregisterForAppContainerChanges(registrationobject.toCPointer<ByteVar>())
