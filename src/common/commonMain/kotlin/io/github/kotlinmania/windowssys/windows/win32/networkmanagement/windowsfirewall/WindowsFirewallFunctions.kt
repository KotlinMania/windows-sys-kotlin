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

public expect fun ncFreeNetconProperties(pprops: MutPtr<NetconProperties>)

public expect fun ncIsValidConnectionName(pszwname: Pcwstr): Bool

public expect fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: MutPtr<NetisoErrorType>): UInt

public expect fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: MutPtr<UInt>, pppublicappcs: MutPtr<MutPtr<InetFirewallAppContainer>>): UInt

public expect fun networkIsolationEnumerateAppContainerRules(newenum: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun networkIsolationFreeAppContainers(ppublicappcs: ConstPtr<InetFirewallAppContainer>): UInt

public expect fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: MutPtr<UInt>, appcontainersids: MutPtr<MutPtr<SidAndAttributes>>): UInt

public expect fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: ConstPtr<CVoid>, callback: PnetisoEdpIdCallbackFn, hoperation: MutPtr<Handle>): UInt

public expect fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt

public expect fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: ConstPtr<CVoid>, registrationobject: MutPtr<Handle>): UInt

public expect fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: ConstPtr<SidAndAttributes>): UInt

public expect fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: ConstPtr<Pcwstr>, binariescount: UInt): Hresult

public expect fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt
