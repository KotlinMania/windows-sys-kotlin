package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun ncFreeNetconProperties(pprops: COpaquePointer?)

public expect fun ncIsValidConnectionName(pszwname: Pcwstr): Bool

public expect fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt

public expect fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt

public expect fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult

public expect fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt

public expect fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt

public expect fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt

public expect fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt

public expect fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt

public expect fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt

public expect fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult

public expect fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt
