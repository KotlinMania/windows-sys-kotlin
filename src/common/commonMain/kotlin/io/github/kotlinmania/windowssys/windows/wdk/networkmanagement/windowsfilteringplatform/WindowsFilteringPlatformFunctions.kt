package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmEngineOption
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun fwpmBfeStateGet0(): FwpmServiceState

public expect fun fwpmBfeStateSubscribeChanges0(deviceobject: COpaquePointer?, callback: FwpmServiceStateChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): Ntstatus

public expect fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus

public expect fun fwpmCalloutAdd0(enginehandle: Handle, callout: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus

public expect fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutGetByKey0(enginehandle: Handle, key: COpaquePointer?, callout: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: COpaquePointer?): Ntstatus

public expect fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmEngineClose0(enginehandle: Handle): Ntstatus

public expect fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: COpaquePointer?): Ntstatus

public expect fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: COpaquePointer?, session: COpaquePointer?, enginehandle: COpaquePointer?): Ntstatus

public expect fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: COpaquePointer?): Ntstatus

public expect fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmFilterAdd0(enginehandle: Handle, filter: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: COpaquePointer?): Ntstatus

public expect fun fwpmFilterGetByKey0(enginehandle: Handle, key: COpaquePointer?, filter: COpaquePointer?): Ntstatus

public expect fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmFreeMemory0(p: COpaquePointer?)

public expect fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: COpaquePointer?): Ntstatus

public expect fun fwpmLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, layer: COpaquePointer?): Ntstatus

public expect fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmProviderAdd0(enginehandle: Handle, provider: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmProviderGetByKey0(enginehandle: Handle, key: COpaquePointer?, provider: COpaquePointer?): Ntstatus

public expect fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: COpaquePointer?, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, sublayer: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus

public expect fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus

public expect fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus

public expect fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: COpaquePointer?): Ntstatus

public expect fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentries: COpaquePointer?): Ntstatus

public expect fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: COpaquePointer?): Ntstatus

public expect fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: COpaquePointer?, virtualiftunnelinfo: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): Ntstatus

public expect fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: UInt): Ntstatus

public expect fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: COpaquePointer?): Ntstatus

public expect fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: COpaquePointer?): Ntstatus

public expect fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: COpaquePointer?): Ntstatus

public expect fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): Ntstatus

public expect fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): Ntstatus

public expect fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): Ntstatus

public expect fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): Ntstatus

public expect fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: COpaquePointer?): Ntstatus

public expect fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): Ntstatus

public expect fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): Ntstatus
