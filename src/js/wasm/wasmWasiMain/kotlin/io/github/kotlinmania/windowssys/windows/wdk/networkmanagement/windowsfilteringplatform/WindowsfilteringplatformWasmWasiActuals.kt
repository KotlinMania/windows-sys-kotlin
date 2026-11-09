@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_ENGINE_OPTION
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_SERVICE_STATE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun FwpmBfeStateGet0(): FWPM_SERVICE_STATE =
    0

public actual fun FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context: Long, changehandle: Long): NTSTATUS =
    0

public actual fun FwpmBfeStateUnsubscribeChanges0(changehandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): NTSTATUS =
    0

public actual fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): NTSTATUS =
    0

public actual fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): NTSTATUS =
    0

public actual fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): NTSTATUS =
    0

public actual fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmEngineClose0(enginehandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): NTSTATUS =
    0

public actual fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): NTSTATUS =
    0

public actual fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): NTSTATUS =
    0

public actual fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    0

public actual fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): NTSTATUS =
    0

public actual fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): NTSTATUS =
    0

public actual fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmFreeMemory0(p: Long) {
}

public actual fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): NTSTATUS =
    0

public actual fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): NTSTATUS =
    0

public actual fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    0

public actual fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): NTSTATUS =
    0

public actual fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    0

public actual fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun FwpmTransactionAbort0(enginehandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): NTSTATUS =
    0

public actual fun FwpmTransactionCommit0(enginehandle: HANDLE): NTSTATUS =
    0

public actual fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): NTSTATUS =
    0

public actual fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): NTSTATUS =
    0

public actual fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS =
    0

public actual fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS =
    0

public actual fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS =
    0

public actual fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS =
    0

public actual fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS =
    0

public actual fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS =
    0

public actual fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): NTSTATUS =
    0

public actual fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): NTSTATUS =
    0

public actual fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    0

public actual fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    0

public actual fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS =
    0

public actual fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS =
    0

public actual fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS =
    0

public actual fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS =
    0

public actual fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): NTSTATUS =
    0

public actual fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): NTSTATUS =
    0

public actual fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS =
    0

public actual fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS =
    0

public actual fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    0

public actual fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    0

public actual fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    0

public actual fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    0

public actual fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    0

public actual fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    0

public actual fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): NTSTATUS =
    0

public actual fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS =
    0

public actual fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS =
    0
