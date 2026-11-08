package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_ENGINE_OPTION
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_SERVICE_STATE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface FnCallback {
    public operator fun invoke(context: Long, newstate: FWPM_SERVICE_STATE)
}

public fun FwpmBfeStateGet0(): FWPM_SERVICE_STATE {
    return Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateGet0", longArrayOf()).toInt()
}

public fun FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context: Long, changehandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateSubscribeChanges0", longArrayOf(deviceobject, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toInt()
}

public fun FwpmBfeStateUnsubscribeChanges0(changehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateUnsubscribeChanges0", longArrayOf(changehandle)).toInt()
}

public fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutAdd0", longArrayOf(enginehandle, callout, sd, id)).toInt()
}

public fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteById0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetById0", longArrayOf(enginehandle, id.toLong(), callout)).toInt()
}

public fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetByKey0", longArrayOf(enginehandle, key, callout)).toInt()
}

public fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetById0", longArrayOf(enginehandle, id.toLong(), connection)).toInt()
}

public fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmEngineClose0(enginehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineClose0", longArrayOf(enginehandle)).toInt()
}

public fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetOption0", longArrayOf(enginehandle, option.toLong(), value)).toInt()
}

public fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineOpen0", longArrayOf(servername, authnservice.toLong(), authidentity, session, enginehandle)).toInt()
}

public fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetOption0", longArrayOf(enginehandle, option.toLong(), newvalue)).toInt()
}

public fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterAdd0", longArrayOf(enginehandle, filter, sd, id)).toInt()
}

public fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteById0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetById0", longArrayOf(enginehandle, id.toLong(), filter)).toInt()
}

public fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetByKey0", longArrayOf(enginehandle, key, filter)).toInt()
}

public fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmFreeMemory0(p: Long) {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFreeMemory0", longArrayOf(p))
}

public fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd0", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, sd)).toInt()
}

public fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd1", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toInt()
}

public fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd2", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toInt()
}

public fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd3", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toInt()
}

public fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetById0", longArrayOf(enginehandle, id.toLong(), layer)).toInt()
}

public fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetByKey0", longArrayOf(enginehandle, key, layer)).toInt()
}

public fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum3", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum4", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum5", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderAdd0", longArrayOf(enginehandle, provider, sd)).toInt()
}

public fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd0", longArrayOf(enginehandle, providercontext, sd, id)).toInt()
}

public fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd1", longArrayOf(enginehandle, providercontext, sd, id)).toInt()
}

public fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd2", longArrayOf(enginehandle, providercontext, sd, id)).toInt()
}

public fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd3", longArrayOf(enginehandle, providercontext, sd, id)).toInt()
}

public fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteById0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum3", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById0", longArrayOf(enginehandle, id.toLong(), providercontext)).toInt()
}

public fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById1", longArrayOf(enginehandle, id.toLong(), providercontext)).toInt()
}

public fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById2", longArrayOf(enginehandle, id.toLong(), providercontext)).toInt()
}

public fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById3", longArrayOf(enginehandle, id.toLong(), providercontext)).toInt()
}

public fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey0", longArrayOf(enginehandle, key, providercontext)).toInt()
}

public fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey1", longArrayOf(enginehandle, key, providercontext)).toInt()
}

public fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey2", longArrayOf(enginehandle, key, providercontext)).toInt()
}

public fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey3", longArrayOf(enginehandle, key, providercontext)).toInt()
}

public fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetByKey0", longArrayOf(enginehandle, key, provider)).toInt()
}

public fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerAdd0", longArrayOf(enginehandle, sublayer, sd)).toInt()
}

public fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDeleteByKey0", longArrayOf(enginehandle, key)).toInt()
}

public fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetByKey0", longArrayOf(enginehandle, key, sublayer)).toInt()
}

public fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun FwpmTransactionAbort0(enginehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionAbort0", longArrayOf(enginehandle)).toInt()
}

public fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionBegin0", longArrayOf(enginehandle, flags.toLong())).toInt()
}

public fun FwpmTransactionCommit0(enginehandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionCommit0", longArrayOf(enginehandle)).toInt()
}

public fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetStatistics0", longArrayOf(enginehandle, idpstatistics)).toInt()
}

public fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentries)).toInt()
}

public fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics0", longArrayOf(enginehandle, ipsecstatistics)).toInt()
}

public fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics1", longArrayOf(enginehandle, ipsecstatistics)).toInt()
}

public fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound0", longArrayOf(enginehandle, id.toLong(), inboundbundle)).toInt()
}

public fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound1", longArrayOf(enginehandle, id.toLong(), inboundbundle)).toInt()
}

public fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound0", longArrayOf(enginehandle, id.toLong(), outboundbundle)).toInt()
}

public fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound1", longArrayOf(enginehandle, id.toLong(), outboundbundle)).toInt()
}

public fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate0", longArrayOf(enginehandle, outboundtraffic, inboundfilterid, id)).toInt()
}

public fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate1", longArrayOf(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id)).toInt()
}

public fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDeleteById0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextExpire0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById0", longArrayOf(enginehandle, id.toLong(), sacontext)).toInt()
}

public fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById1", longArrayOf(enginehandle, id.toLong(), sacontext)).toInt()
}

public fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi0", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi)).toInt()
}

public fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi1", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi)).toInt()
}

public fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextSetSpi0", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi.toLong())).toInt()
}

public fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextUpdate0", longArrayOf(enginehandle, flags.toLong(), newvalues)).toInt()
}

public fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics0", longArrayOf(enginehandle, ikeextstatistics)).toInt()
}

public fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics1", longArrayOf(enginehandle, ikeextstatistics)).toInt()
}

public fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toInt()
}

public fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toInt()
}

public fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toInt()
}

public fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDeleteById0", longArrayOf(enginehandle, id.toLong())).toInt()
}

public fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toInt()
}

public fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toInt()
}

public fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById0", longArrayOf(enginehandle, id.toLong(), sa)).toInt()
}

public fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById1", longArrayOf(enginehandle, id.toLong(), salookupcontext, sa)).toInt()
}

public fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById2", longArrayOf(enginehandle, id.toLong(), salookupcontext, sa)).toInt()
}
