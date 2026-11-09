package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_ENGINE_OPTION
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_SERVICE_STATE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public expect fun FwpmBfeStateGet0(): FWPM_SERVICE_STATE

public expect fun FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context: Long, changehandle: Long): NTSTATUS

public expect fun FwpmBfeStateUnsubscribeChanges0(changehandle: HANDLE): NTSTATUS

public expect fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): NTSTATUS

public expect fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): NTSTATUS

public expect fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): NTSTATUS

public expect fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): NTSTATUS

public expect fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmEngineClose0(enginehandle: HANDLE): NTSTATUS

public expect fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): NTSTATUS

public expect fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): NTSTATUS

public expect fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): NTSTATUS

public expect fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS

public expect fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): NTSTATUS

public expect fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): NTSTATUS

public expect fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmFreeMemory0(p: Long)

public expect fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): NTSTATUS

public expect fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): NTSTATUS

public expect fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS

public expect fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS

public expect fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS

public expect fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): NTSTATUS

public expect fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS

public expect fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS

public expect fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): NTSTATUS

public expect fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun FwpmTransactionAbort0(enginehandle: HANDLE): NTSTATUS

public expect fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): NTSTATUS

public expect fun FwpmTransactionCommit0(enginehandle: HANDLE): NTSTATUS

public expect fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): NTSTATUS

public expect fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): NTSTATUS

public expect fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS

public expect fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS

public expect fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS

public expect fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS

public expect fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS

public expect fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS

public expect fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): NTSTATUS

public expect fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): NTSTATUS

public expect fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS

public expect fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): NTSTATUS

public expect fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS

public expect fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS

public expect fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS

public expect fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS

public expect fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): NTSTATUS

public expect fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): NTSTATUS

public expect fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS

public expect fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS

public expect fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS

public expect fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS

public expect fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS

public expect fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS

public expect fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS

public expect fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS

public expect fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): NTSTATUS

public expect fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS

public expect fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS
