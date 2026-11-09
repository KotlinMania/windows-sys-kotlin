@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public actual fun NcFreeNetconProperties(pprops: Long) {
}

public actual fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL =
    0

public actual fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt =
    0u

public actual fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt =
    0u

public actual fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT =
    0

public actual fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt =
    0u

public actual fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt =
    0u

public actual fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt =
    0u

public actual fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt =
    0u

public actual fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt =
    0u

public actual fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt =
    0u

public actual fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT =
    0

public actual fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt =
    0u
