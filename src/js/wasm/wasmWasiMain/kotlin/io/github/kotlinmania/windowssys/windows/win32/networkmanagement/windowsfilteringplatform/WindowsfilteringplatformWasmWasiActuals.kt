@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): UInt =
    0u

public actual fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): UInt =
    0u

public actual fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): UInt =
    0u

public actual fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmCalloutSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CALLOUT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    0u

public actual fun FwpmCalloutSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmCalloutUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    0u

public actual fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): UInt =
    0u

public actual fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmConnectionSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CONNECTION_CALLBACK0, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmConnectionUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    0u

public actual fun FwpmDynamicKeywordSubscribe0(flags: UInt, callback: FWPM_DYNAMIC_KEYWORD_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    0u

public actual fun FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: HANDLE): UInt =
    0u

public actual fun FwpmEngineClose0(enginehandle: HANDLE): UInt =
    0u

public actual fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): UInt =
    0u

public actual fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): UInt =
    0u

public actual fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): UInt =
    0u

public actual fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    0u

public actual fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): UInt =
    0u

public actual fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): UInt =
    0u

public actual fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmFilterSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_FILTER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    0u

public actual fun FwpmFilterSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmFilterUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    0u

public actual fun FwpmFreeMemory0(p: Long) {
}

public actual fun FwpmGetAppIdFromFileName0(filename: PCWSTR, appid: Long): UInt =
    0u

public actual fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): UInt =
    0u

public actual fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): UInt =
    0u

public actual fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmNetEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmNetEventSubscribe1(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK1, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmNetEventSubscribe2(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK2, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmNetEventSubscribe3(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK3, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmNetEventSubscribe4(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK4, context: Long, eventshandle: Long): UInt =
    0u

public actual fun FwpmNetEventSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmNetEventUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    0u

public actual fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    0u

public actual fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    0u

public actual fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    0u

public actual fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmProviderContextSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    0u

public actual fun FwpmProviderContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmProviderContextUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    0u

public actual fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): UInt =
    0u

public actual fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmProviderSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    0u

public actual fun FwpmProviderSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmProviderUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    0u

public actual fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    0u

public actual fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): UInt =
    0u

public actual fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun FwpmSubLayerSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_SUBLAYER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    0u

public actual fun FwpmSubLayerSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun FwpmSubLayerUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    0u

public actual fun FwpmSystemPortsGet0(enginehandle: HANDLE, sysports: Long): UInt =
    0u

public actual fun FwpmSystemPortsSubscribe0(enginehandle: HANDLE, reserved: Long, callback: FWPM_SYSTEM_PORTS_CALLBACK0, context: Long, sysportshandle: Long): UInt =
    0u

public actual fun FwpmSystemPortsUnsubscribe0(enginehandle: HANDLE, sysportshandle: HANDLE): UInt =
    0u

public actual fun FwpmTransactionAbort0(enginehandle: HANDLE): UInt =
    0u

public actual fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): UInt =
    0u

public actual fun FwpmTransactionCommit0(enginehandle: HANDLE): UInt =
    0u

public actual fun FwpmvSwitchEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_VSWITCH_EVENT_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    0u

public actual fun FwpmvSwitchEventUnsubscribe0(enginehandle: HANDLE, subscriptionhandle: HANDLE): UInt =
    0u

public actual fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): UInt =
    0u

public actual fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): UInt =
    0u

public actual fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    0u

public actual fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    0u

public actual fun IPsecKeyManagerAddAndRegister0(enginehandle: HANDLE, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): UInt =
    0u

public actual fun IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun IPsecKeyManagerUnregisterAndDelete0(enginehandle: HANDLE, keymgmthandle: HANDLE): UInt =
    0u

public actual fun IPsecKeyManagersGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    0u

public actual fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    0u

public actual fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    0u

public actual fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    0u

public actual fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): UInt =
    0u

public actual fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): UInt =
    0u

public actual fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    0u

public actual fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): UInt =
    0u

public actual fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    0u

public actual fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    0u

public actual fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    0u

public actual fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    0u

public actual fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): UInt =
    0u

public actual fun IPsecSaContextSubscribe0(enginehandle: HANDLE, subscription: Long, callback: IPSEC_SA_CONTEXT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    0u

public actual fun IPsecSaContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    0u

public actual fun IPsecSaContextUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    0u

public actual fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): UInt =
    0u

public actual fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    0u

public actual fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    0u

public actual fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    0u

public actual fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    0u

public actual fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    0u

public actual fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    0u

public actual fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    0u

public actual fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    0u

public actual fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): UInt =
    0u

public actual fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    0u

public actual fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    0u
