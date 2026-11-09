package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public expect fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): UInt

public expect fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): UInt

public expect fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): UInt

public expect fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmCalloutSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CALLOUT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt

public expect fun FwpmCalloutSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmCalloutUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt

public expect fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): UInt

public expect fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmConnectionSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CONNECTION_CALLBACK0, context: Long, eventshandle: Long): UInt

public expect fun FwpmConnectionUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt

public expect fun FwpmDynamicKeywordSubscribe0(flags: UInt, callback: FWPM_DYNAMIC_KEYWORD_CALLBACK0, context: Long, subscriptionhandle: Long): UInt

public expect fun FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: HANDLE): UInt

public expect fun FwpmEngineClose0(enginehandle: HANDLE): UInt

public expect fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): UInt

public expect fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): UInt

public expect fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): UInt

public expect fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): UInt

public expect fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): UInt

public expect fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): UInt

public expect fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmFilterSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_FILTER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt

public expect fun FwpmFilterSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmFilterUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt

public expect fun FwpmFreeMemory0(p: Long)

public expect fun FwpmGetAppIdFromFileName0(filename: PCWSTR, appid: Long): UInt

public expect fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): UInt

public expect fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): UInt

public expect fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmNetEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK0, context: Long, eventshandle: Long): UInt

public expect fun FwpmNetEventSubscribe1(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK1, context: Long, eventshandle: Long): UInt

public expect fun FwpmNetEventSubscribe2(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK2, context: Long, eventshandle: Long): UInt

public expect fun FwpmNetEventSubscribe3(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK3, context: Long, eventshandle: Long): UInt

public expect fun FwpmNetEventSubscribe4(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK4, context: Long, eventshandle: Long): UInt

public expect fun FwpmNetEventSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmNetEventUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt

public expect fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt

public expect fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt

public expect fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt

public expect fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt

public expect fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt

public expect fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt

public expect fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): UInt

public expect fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): UInt

public expect fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): UInt

public expect fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): UInt

public expect fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmProviderContextSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt

public expect fun FwpmProviderContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmProviderContextUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt

public expect fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): UInt

public expect fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmProviderSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt

public expect fun FwpmProviderSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmProviderUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt

public expect fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): UInt

public expect fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): UInt

public expect fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): UInt

public expect fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun FwpmSubLayerSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_SUBLAYER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt

public expect fun FwpmSubLayerSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun FwpmSubLayerUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt

public expect fun FwpmSystemPortsGet0(enginehandle: HANDLE, sysports: Long): UInt

public expect fun FwpmSystemPortsSubscribe0(enginehandle: HANDLE, reserved: Long, callback: FWPM_SYSTEM_PORTS_CALLBACK0, context: Long, sysportshandle: Long): UInt

public expect fun FwpmSystemPortsUnsubscribe0(enginehandle: HANDLE, sysportshandle: HANDLE): UInt

public expect fun FwpmTransactionAbort0(enginehandle: HANDLE): UInt

public expect fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): UInt

public expect fun FwpmTransactionCommit0(enginehandle: HANDLE): UInt

public expect fun FwpmvSwitchEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_VSWITCH_EVENT_CALLBACK0, context: Long, subscriptionhandle: Long): UInt

public expect fun FwpmvSwitchEventUnsubscribe0(enginehandle: HANDLE, subscriptionhandle: HANDLE): UInt

public expect fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): UInt

public expect fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): UInt

public expect fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): UInt

public expect fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): UInt

public expect fun IPsecKeyManagerAddAndRegister0(enginehandle: HANDLE, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): UInt

public expect fun IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun IPsecKeyManagerUnregisterAndDelete0(enginehandle: HANDLE, keymgmthandle: HANDLE): UInt

public expect fun IPsecKeyManagersGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt

public expect fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt

public expect fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt

public expect fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt

public expect fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): UInt

public expect fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): UInt

public expect fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt

public expect fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): UInt

public expect fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt

public expect fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt

public expect fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt

public expect fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt

public expect fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): UInt

public expect fun IPsecSaContextSubscribe0(enginehandle: HANDLE, subscription: Long, callback: IPSEC_SA_CONTEXT_CALLBACK0, context: Long, eventshandle: Long): UInt

public expect fun IPsecSaContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt

public expect fun IPsecSaContextUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt

public expect fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): UInt

public expect fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): UInt

public expect fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): UInt

public expect fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt

public expect fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt

public expect fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt

public expect fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): UInt

public expect fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt

public expect fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt

public expect fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): UInt

public expect fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt

public expect fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt
