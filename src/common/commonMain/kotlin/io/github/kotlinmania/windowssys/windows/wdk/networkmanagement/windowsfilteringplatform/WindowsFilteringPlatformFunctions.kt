package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(context: Long, newstate: Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_SERVICE_STATE)
}

public fun FwpmBfeStateGet0(): Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_SERVICE_STATE {
    Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateGet0", longArrayOf())
    return Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_SERVICE_STATE()
}

public fun FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context: Long, changehandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateSubscribeChanges0", longArrayOf(deviceobject, Win32DynamicFfi.objectSlot(callback), context, changehandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmBfeStateUnsubscribeChanges0(changehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpkclnt.sys", "FwpmBfeStateUnsubscribeChanges0", longArrayOf(Win32DynamicFfi.objectSlot(changehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutAdd0(enginehandle: Win32.Foundation.HANDLE, callout: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), callout, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutDeleteById0(enginehandle: Win32.Foundation.HANDLE, id: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutGetById0(enginehandle: Win32.Foundation.HANDLE, id: UInt, callout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), callout))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, callout: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, callout))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionGetById0(enginehandle: Win32.Foundation.HANDLE, id: ULong, connection: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), connection))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmConnectionSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineClose0(enginehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineClose0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineGetOption0(enginehandle: Win32.Foundation.HANDLE, option: Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_ENGINE_OPTION, value: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetOption0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(option), value))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineOpen0", longArrayOf(servername, authnservice.toLong(), authidentity, session, enginehandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineSetOption0(enginehandle: Win32.Foundation.HANDLE, option: Win32.NetworkManagement.WindowsFilteringPlatform.FWPM_ENGINE_OPTION, newvalue: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetOption0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(option), newvalue))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmEngineSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterAdd0(enginehandle: Win32.Foundation.HANDLE, filter: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), filter, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterDeleteById0(enginehandle: Win32.Foundation.HANDLE, id: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterGetById0(enginehandle: Win32.Foundation.HANDLE, id: ULong, filter: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), filter))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, filter: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, filter))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFilterSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmFreeMemory0(p: Long) {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFreeMemory0", longArrayOf(p))
}

public fun FwpmIPsecTunnelAdd0(enginehandle: Win32.Foundation.HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmIPsecTunnelAdd1(enginehandle: Win32.Foundation.HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmIPsecTunnelAdd2(enginehandle: Win32.Foundation.HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmIPsecTunnelAdd3(enginehandle: Win32.Foundation.HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmIPsecTunnelDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerGetById0(enginehandle: Win32.Foundation.HANDLE, id: UShort, layer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), layer))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, layer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, layer))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmLayerSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum1(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum2(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum3(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum4(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum4", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventEnum5(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum5", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventsGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmNetEventsSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderAdd0(enginehandle: Win32.Foundation.HANDLE, provider: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), provider, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextAdd0(enginehandle: Win32.Foundation.HANDLE, providercontext: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), providercontext, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextAdd1(enginehandle: Win32.Foundation.HANDLE, providercontext: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), providercontext, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextAdd2(enginehandle: Win32.Foundation.HANDLE, providercontext: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), providercontext, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextAdd3(enginehandle: Win32.Foundation.HANDLE, providercontext: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), providercontext, Win32DynamicFfi.objectSlot(sd), id))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextDeleteById0(enginehandle: Win32.Foundation.HANDLE, id: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextEnum1(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextEnum2(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextEnum3(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetById0(enginehandle: Win32.Foundation.HANDLE, id: ULong, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetById1(enginehandle: Win32.Foundation.HANDLE, id: ULong, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetById2(enginehandle: Win32.Foundation.HANDLE, id: ULong, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetById3(enginehandle: Win32.Foundation.HANDLE, id: ULong, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetByKey1(enginehandle: Win32.Foundation.HANDLE, key: Long, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetByKey2(enginehandle: Win32.Foundation.HANDLE, key: Long, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetByKey3(enginehandle: Win32.Foundation.HANDLE, key: Long, providercontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey3", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, providercontext))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, provider: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, provider))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmProviderSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSessionCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSessionDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSessionEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerAdd0(enginehandle: Win32.Foundation.HANDLE, sublayer: Long, sd: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerAdd0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), sublayer, Win32DynamicFfi.objectSlot(sd)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerDeleteByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDeleteByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerGetByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, sublayer: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, sublayer))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: Win32.Foundation.HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerSetSecurityInfoByKey0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmTransactionAbort0(enginehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionAbort0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmTransactionBegin0(enginehandle: Win32.Foundation.HANDLE, flags: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionBegin0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmTransactionCommit0(enginehandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionCommit0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospGetStatistics0(enginehandle: Win32.Foundation.HANDLE, idpstatistics: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetStatistics0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), idpstatistics))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospStateCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospStateDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecDospStateEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentries))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecGetStatistics0(enginehandle: Win32.Foundation.HANDLE, ipsecstatistics: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), ipsecstatistics))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecGetStatistics1(enginehandle: Win32.Foundation.HANDLE, ipsecstatistics: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), ipsecstatistics))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextAddInbound0(enginehandle: Win32.Foundation.HANDLE, id: ULong, inboundbundle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), inboundbundle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextAddInbound1(enginehandle: Win32.Foundation.HANDLE, id: ULong, inboundbundle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), inboundbundle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextAddOutbound0(enginehandle: Win32.Foundation.HANDLE, id: ULong, outboundbundle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), outboundbundle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextAddOutbound1(enginehandle: Win32.Foundation.HANDLE, id: ULong, outboundbundle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), outboundbundle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextCreate0(enginehandle: Win32.Foundation.HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), outboundtraffic, inboundfilterid, id))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextCreate1(enginehandle: Win32.Foundation.HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), outboundtraffic, virtualiftunnelinfo, inboundfilterid, id))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextDeleteById0(enginehandle: Win32.Foundation.HANDLE, id: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDeleteById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextEnum1(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextExpire0(enginehandle: Win32.Foundation.HANDLE, id: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextExpire0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextGetById0(enginehandle: Win32.Foundation.HANDLE, id: ULong, sacontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), sacontext))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextGetById1(enginehandle: Win32.Foundation.HANDLE, id: ULong, sacontext: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), sacontext))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextGetSpi0(enginehandle: Win32.Foundation.HANDLE, id: ULong, getspi: Long, inboundspi: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), getspi, inboundspi))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextGetSpi1(enginehandle: Win32.Foundation.HANDLE, id: ULong, getspi: Long, inboundspi: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), getspi, inboundspi))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextSetSpi0(enginehandle: Win32.Foundation.HANDLE, id: ULong, getspi: Long, inboundspi: UInt): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextSetSpi0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), getspi, inboundspi.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaContextUpdate0(enginehandle: Win32.Foundation.HANDLE, flags: ULong, newvalues: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextUpdate0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), flags.toLong(), newvalues))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaDbGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaDbSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IPsecSaEnum1(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextGetStatistics0(enginehandle: Win32.Foundation.HANDLE, ikeextstatistics: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), ikeextstatistics))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextGetStatistics1(enginehandle: Win32.Foundation.HANDLE, ikeextstatistics: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), ikeextstatistics))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaCreateEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumtemplate: Long, enumhandle: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaCreateEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), enumtemplate, enumhandle))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaDbGetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbGetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaDbSetSecurityInfo0(enginehandle: Win32.Foundation.HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbSetSecurityInfo0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), securityinfo.toLong(), sidowner, sidgroup, dacl, sacl))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaDeleteById0(enginehandle: Win32.Foundation.HANDLE, id: ULong): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDeleteById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong()))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaDestroyEnumHandle0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDestroyEnumHandle0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle)))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaEnum0(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaEnum1(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaEnum2(enginehandle: Win32.Foundation.HANDLE, enumhandle: Win32.Foundation.HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), Win32DynamicFfi.objectSlot(enumhandle), numentriesrequested.toLong(), entries, numentriesreturned))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaGetById0(enginehandle: Win32.Foundation.HANDLE, id: ULong, sa: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById0", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), sa))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaGetById1(enginehandle: Win32.Foundation.HANDLE, id: ULong, salookupcontext: Long, sa: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById1", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), salookupcontext, sa))
    return Win32.Foundation.NTSTATUS()
}

public fun IkeextSaGetById2(enginehandle: Win32.Foundation.HANDLE, id: ULong, salookupcontext: Long, sa: Long): Win32.Foundation.NTSTATUS {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById2", longArrayOf(Win32DynamicFfi.objectSlot(enginehandle), id.toLong(), salookupcontext, sa))
    return Win32.Foundation.NTSTATUS()
}
