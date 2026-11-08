package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun interface FnCallback {
    public operator fun invoke(context: Long, change: Long)
}

public fun interface FnCallback1 {
    public operator fun invoke(context: Long, eventtype: FWPM_CONNECTION_EVENT_TYPE, connection: Long)
}

public fun interface FnCallback2 {
    public operator fun invoke(context: Long, vswitchevent: Long): UInt
}

public fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutAdd0", longArrayOf(enginehandle, callout, sd, id)).toUInt()
}

public fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteById0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetById0", longArrayOf(enginehandle, id.toLong(), callout)).toUInt()
}

public fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetByKey0", longArrayOf(enginehandle, key, callout)).toUInt()
}

public fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmCalloutSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CALLOUT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutSubscribeChanges0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toUInt()
}

public fun FwpmCalloutSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmCalloutUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmCalloutUnsubscribeChanges0", longArrayOf(enginehandle, changehandle)).toUInt()
}

public fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetById0", longArrayOf(enginehandle, id.toLong(), connection)).toUInt()
}

public fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmConnectionSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CONNECTION_CALLBACK0, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionSubscribe0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmConnectionUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmConnectionUnsubscribe0", longArrayOf(enginehandle, eventshandle)).toUInt()
}

public fun FwpmDynamicKeywordSubscribe0(flags: UInt, callback: FWPM_DYNAMIC_KEYWORD_CALLBACK0, context: Long, subscriptionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmDynamicKeywordSubscribe0", longArrayOf(flags.toLong(), Win32DynamicFfi.objectSlot(callback), context, subscriptionhandle)).toUInt()
}

public fun FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmDynamicKeywordUnsubscribe0", longArrayOf(subscriptionhandle)).toUInt()
}

public fun FwpmEngineClose0(enginehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineClose0", longArrayOf(enginehandle)).toUInt()
}

public fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetOption0", longArrayOf(enginehandle, option.toLong(), value)).toUInt()
}

public fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineOpen0", longArrayOf(servername, authnservice.toLong(), authidentity, session, enginehandle)).toUInt()
}

public fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetOption0", longArrayOf(enginehandle, option.toLong(), newvalue)).toUInt()
}

public fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmEngineSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterAdd0", longArrayOf(enginehandle, filter, sd, id)).toUInt()
}

public fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteById0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetById0", longArrayOf(enginehandle, id.toLong(), filter)).toUInt()
}

public fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetByKey0", longArrayOf(enginehandle, key, filter)).toUInt()
}

public fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmFilterSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_FILTER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterSubscribeChanges0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toUInt()
}

public fun FwpmFilterSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmFilterUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFilterUnsubscribeChanges0", longArrayOf(enginehandle, changehandle)).toUInt()
}

public fun FwpmFreeMemory0(p: Long) {
    Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmFreeMemory0", longArrayOf(p))
}

public fun FwpmGetAppIdFromFileName0(filename: PCWSTR, appid: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmGetAppIdFromFileName0", longArrayOf(filename, appid)).toUInt()
}

public fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd0", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, sd)).toUInt()
}

public fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd1", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toUInt()
}

public fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd2", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toUInt()
}

public fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelAdd3", longArrayOf(enginehandle, flags.toLong(), mainmodepolicy, tunnelpolicy, numfilterconditions.toLong(), filterconditions, keymodkey, sd)).toUInt()
}

public fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmIPsecTunnelDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetById0", longArrayOf(enginehandle, id.toLong(), layer)).toUInt()
}

public fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetByKey0", longArrayOf(enginehandle, key, layer)).toUInt()
}

public fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmLayerSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum3", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum4", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventEnum5", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmNetEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK0, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscribe0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmNetEventSubscribe1(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK1, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscribe1", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmNetEventSubscribe2(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK2, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscribe2", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmNetEventSubscribe3(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK3, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscribe3", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmNetEventSubscribe4(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK4, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscribe4", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun FwpmNetEventSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmNetEventUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventUnsubscribe0", longArrayOf(enginehandle, eventshandle)).toUInt()
}

public fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmNetEventsSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderAdd0", longArrayOf(enginehandle, provider, sd)).toUInt()
}

public fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd0", longArrayOf(enginehandle, providercontext, sd, id)).toUInt()
}

public fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd1", longArrayOf(enginehandle, providercontext, sd, id)).toUInt()
}

public fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd2", longArrayOf(enginehandle, providercontext, sd, id)).toUInt()
}

public fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextAdd3", longArrayOf(enginehandle, providercontext, sd, id)).toUInt()
}

public fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteById0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextEnum3", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById0", longArrayOf(enginehandle, id.toLong(), providercontext)).toUInt()
}

public fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById1", longArrayOf(enginehandle, id.toLong(), providercontext)).toUInt()
}

public fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById2", longArrayOf(enginehandle, id.toLong(), providercontext)).toUInt()
}

public fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetById3", longArrayOf(enginehandle, id.toLong(), providercontext)).toUInt()
}

public fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey0", longArrayOf(enginehandle, key, providercontext)).toUInt()
}

public fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey1", longArrayOf(enginehandle, key, providercontext)).toUInt()
}

public fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey2", longArrayOf(enginehandle, key, providercontext)).toUInt()
}

public fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetByKey3", longArrayOf(enginehandle, key, providercontext)).toUInt()
}

public fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmProviderContextSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextSubscribeChanges0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toUInt()
}

public fun FwpmProviderContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmProviderContextUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderContextUnsubscribeChanges0", longArrayOf(enginehandle, changehandle)).toUInt()
}

public fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetByKey0", longArrayOf(enginehandle, key, provider)).toUInt()
}

public fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmProviderSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderSubscribeChanges0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toUInt()
}

public fun FwpmProviderSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmProviderUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmProviderUnsubscribeChanges0", longArrayOf(enginehandle, changehandle)).toUInt()
}

public fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSessionEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerAdd0", longArrayOf(enginehandle, sublayer, sd)).toUInt()
}

public fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDeleteByKey0", longArrayOf(enginehandle, key)).toUInt()
}

public fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetByKey0", longArrayOf(enginehandle, key, sublayer)).toUInt()
}

public fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerGetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerSetSecurityInfoByKey0", longArrayOf(enginehandle, key, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun FwpmSubLayerSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_SUBLAYER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerSubscribeChanges0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, changehandle)).toUInt()
}

public fun FwpmSubLayerSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun FwpmSubLayerUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSubLayerUnsubscribeChanges0", longArrayOf(enginehandle, changehandle)).toUInt()
}

public fun FwpmSystemPortsGet0(enginehandle: HANDLE, sysports: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSystemPortsGet0", longArrayOf(enginehandle, sysports)).toUInt()
}

public fun FwpmSystemPortsSubscribe0(enginehandle: HANDLE, reserved: Long, callback: FWPM_SYSTEM_PORTS_CALLBACK0, context: Long, sysportshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSystemPortsSubscribe0", longArrayOf(enginehandle, reserved, Win32DynamicFfi.objectSlot(callback), context, sysportshandle)).toUInt()
}

public fun FwpmSystemPortsUnsubscribe0(enginehandle: HANDLE, sysportshandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmSystemPortsUnsubscribe0", longArrayOf(enginehandle, sysportshandle)).toUInt()
}

public fun FwpmTransactionAbort0(enginehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionAbort0", longArrayOf(enginehandle)).toUInt()
}

public fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionBegin0", longArrayOf(enginehandle, flags.toLong())).toUInt()
}

public fun FwpmTransactionCommit0(enginehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmTransactionCommit0", longArrayOf(enginehandle)).toUInt()
}

public fun FwpmvSwitchEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_VSWITCH_EVENT_CALLBACK0, context: Long, subscriptionhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventSubscribe0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, subscriptionhandle)).toUInt()
}

public fun FwpmvSwitchEventUnsubscribe0(enginehandle: HANDLE, subscriptionhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventUnsubscribe0", longArrayOf(enginehandle, subscriptionhandle)).toUInt()
}

public fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "FwpmvSwitchEventsSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospGetStatistics0", longArrayOf(enginehandle, idpstatistics)).toUInt()
}

public fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecDospStateEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentries)).toUInt()
}

public fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics0", longArrayOf(enginehandle, ipsecstatistics)).toUInt()
}

public fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecGetStatistics1", longArrayOf(enginehandle, ipsecstatistics)).toUInt()
}

public fun IPsecKeyManagerAddAndRegister0(enginehandle: HANDLE, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecKeyManagerAddAndRegister0", longArrayOf(enginehandle, keymanager, keymanagercallbacks, keymgmthandle)).toUInt()
}

public fun IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecKeyManagerGetSecurityInfoByKey0", longArrayOf(enginehandle, reserved, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecKeyManagerSetSecurityInfoByKey0", longArrayOf(enginehandle, reserved, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun IPsecKeyManagerUnregisterAndDelete0(enginehandle: HANDLE, keymgmthandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecKeyManagerUnregisterAndDelete0", longArrayOf(enginehandle, keymgmthandle)).toUInt()
}

public fun IPsecKeyManagersGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecKeyManagersGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound0", longArrayOf(enginehandle, id.toLong(), inboundbundle)).toUInt()
}

public fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddInbound1", longArrayOf(enginehandle, id.toLong(), inboundbundle)).toUInt()
}

public fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound0", longArrayOf(enginehandle, id.toLong(), outboundbundle)).toUInt()
}

public fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextAddOutbound1", longArrayOf(enginehandle, id.toLong(), outboundbundle)).toUInt()
}

public fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate0", longArrayOf(enginehandle, outboundtraffic, inboundfilterid, id)).toUInt()
}

public fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreate1", longArrayOf(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id)).toUInt()
}

public fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDeleteById0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextExpire0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById0", longArrayOf(enginehandle, id.toLong(), sacontext)).toUInt()
}

public fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetById1", longArrayOf(enginehandle, id.toLong(), sacontext)).toUInt()
}

public fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi0", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi)).toUInt()
}

public fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextGetSpi1", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi)).toUInt()
}

public fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextSetSpi0", longArrayOf(enginehandle, id.toLong(), getspi, inboundspi.toLong())).toUInt()
}

public fun IPsecSaContextSubscribe0(enginehandle: HANDLE, subscription: Long, callback: IPSEC_SA_CONTEXT_CALLBACK0, context: Long, eventshandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextSubscribe0", longArrayOf(enginehandle, subscription, Win32DynamicFfi.objectSlot(callback), context, eventshandle)).toUInt()
}

public fun IPsecSaContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextSubscriptionsGet0", longArrayOf(enginehandle, entries, numentries)).toUInt()
}

public fun IPsecSaContextUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextUnsubscribe0", longArrayOf(enginehandle, eventshandle)).toUInt()
}

public fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaContextUpdate0", longArrayOf(enginehandle, flags.toLong(), newvalues)).toUInt()
}

public fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDbSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IPsecSaEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics0", longArrayOf(enginehandle, ikeextstatistics)).toUInt()
}

public fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextGetStatistics1", longArrayOf(enginehandle, ikeextstatistics)).toUInt()
}

public fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaCreateEnumHandle0", longArrayOf(enginehandle, enumtemplate, enumhandle)).toUInt()
}

public fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbGetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl, securitydescriptor)).toUInt()
}

public fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDbSetSecurityInfo0", longArrayOf(enginehandle, securityinfo.toLong(), sidowner, sidgroup, dacl, sacl)).toUInt()
}

public fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDeleteById0", longArrayOf(enginehandle, id.toLong())).toUInt()
}

public fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaDestroyEnumHandle0", longArrayOf(enginehandle, enumhandle)).toUInt()
}

public fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum0", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum1", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaEnum2", longArrayOf(enginehandle, enumhandle, numentriesrequested.toLong(), entries, numentriesreturned)).toUInt()
}

public fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById0", longArrayOf(enginehandle, id.toLong(), sa)).toUInt()
}

public fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById1", longArrayOf(enginehandle, id.toLong(), salookupcontext, sa)).toUInt()
}

public fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt {
    return Win32DynamicFfi.invoke("fwpuclnt.dll", "IkeextSaGetById2", longArrayOf(enginehandle, id.toLong(), salookupcontext, sa)).toUInt()
}
