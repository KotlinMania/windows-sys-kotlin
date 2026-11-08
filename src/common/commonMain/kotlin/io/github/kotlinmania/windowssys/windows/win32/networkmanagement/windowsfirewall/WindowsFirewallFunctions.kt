package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun interface FnCallback {
    public operator fun invoke(context: Long, wszenterpriseid: PCWSTR, dwerr: UInt)
}

public fun interface FnCallback1 {
    public operator fun invoke(context: Long, pchange: Long)
}

public fun NcFreeNetconProperties(pprops: Long) {
    Win32DynamicFfi.invoke("netshell.dll", "NcFreeNetconProperties", longArrayOf(pprops))
}

public fun NcIsValidConnectionName(pszwname: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("netshell.dll", "NcIsValidConnectionName", longArrayOf(pszwname)).toInt()
}

public fun NetworkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: PCWSTR, netisoerror: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationDiagnoseConnectFailureAndGetInfo", longArrayOf(wszservername, netisoerror)).toUInt()
}

public fun NetworkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: Long, pppublicappcs: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationEnumAppContainers", longArrayOf(flags.toLong(), pdwnumpublicappcs, pppublicappcs)).toUInt()
}

public fun NetworkIsolationEnumerateAppContainerRules(newenum: Long): HRESULT {
    return Win32DynamicFfi.invoke("firewallapi.dll", "NetworkIsolationEnumerateAppContainerRules", longArrayOf(newenum)).toInt()
}

public fun NetworkIsolationFreeAppContainers(ppublicappcs: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationFreeAppContainers", longArrayOf(ppublicappcs)).toUInt()
}

public fun NetworkIsolationGetAppContainerConfig(pdwnumpublicappcs: Long, appcontainersids: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationGetAppContainerConfig", longArrayOf(pdwnumpublicappcs, appcontainersids)).toUInt()
}

public fun NetworkIsolationGetEnterpriseIdAsync(wszservername: PCWSTR, dwflags: UInt, context: Long, callback: PNETISO_EDP_ID_CALLBACK_FN, hoperation: Long): UInt {
    return Win32DynamicFfi.invoke("firewallapi.dll", "NetworkIsolationGetEnterpriseIdAsync", longArrayOf(wszservername, dwflags.toLong(), context, Win32DynamicFfi.objectSlot(callback), hoperation)).toUInt()
}

public fun NetworkIsolationGetEnterpriseIdClose(hoperation: HANDLE, bwaitforoperation: BOOL): UInt {
    return Win32DynamicFfi.invoke("firewallapi.dll", "NetworkIsolationGetEnterpriseIdClose", longArrayOf(hoperation, bwaitforoperation.toLong())).toUInt()
}

public fun NetworkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PAC_CHANGES_CALLBACK_FN, context: Long, registrationobject: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationRegisterForAppContainerChanges", longArrayOf(flags.toLong(), Win32DynamicFfi.objectSlot(callback), context, registrationobject)).toUInt()
}

public fun NetworkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: Long): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationSetAppContainerConfig", longArrayOf(dwnumpublicappcs.toLong(), appcontainersids)).toUInt()
}

public fun NetworkIsolationSetupAppContainerBinaries(applicationcontainersid: PSID, packagefullname: PCWSTR, packagefolder: PCWSTR, displayname: PCWSTR, bbinariesfullycomputed: BOOL, binaries: Long, binariescount: UInt): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationSetupAppContainerBinaries", longArrayOf(applicationcontainersid, packagefullname, packagefolder, displayname, bbinariesfullycomputed.toLong(), binaries, binariescount.toLong())).toInt()
}

public fun NetworkIsolationUnregisterForAppContainerChanges(registrationobject: HANDLE): UInt {
    return Win32DynamicFfi.invoke("api-ms-win-net-isolation-l1-1-0.dll", "NetworkIsolationUnregisterForAppContainerChanges", longArrayOf(registrationobject)).toUInt()
}
