package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun ncFreeNetconProperties(pprops: MutPtr)

public expect fun ncIsValidConnectionName(pszwname: Pcwstr): Bool

public expect fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr): UInt

public expect fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr, pppublicappcs: MutPtr): UInt

public expect fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr): Hresult

public expect fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr): UInt

public expect fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr, appcontainersids: MutPtr): UInt

public expect fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr): UInt

public expect fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt

public expect fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr, registrationobject: MutPtr): UInt

public expect fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr): UInt

public expect fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr, binariescount: UInt): Hresult

public expect fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt
