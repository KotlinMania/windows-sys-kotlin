package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public expect fun NcFreeNetconProperties(pprops: Long)

public expect fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL

public expect fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt

public expect fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt

public expect fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT

public expect fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt

public expect fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt

public expect fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt

public expect fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt

public expect fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt

public expect fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt

public expect fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT

public expect fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt
