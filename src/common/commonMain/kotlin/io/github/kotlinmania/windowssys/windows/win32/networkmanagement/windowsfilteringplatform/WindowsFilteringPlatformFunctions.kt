package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun fwpmCalloutAdd0(enginehandle: Handle, callout: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): UInt

public expect fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: COpaquePointer?): UInt

public expect fun fwpmCalloutGetByKey0(enginehandle: Handle, key: COpaquePointer?, callout: COpaquePointer?): UInt

public expect fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmCalloutSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmCalloutChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt

public expect fun fwpmCalloutSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmCalloutUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt

public expect fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: COpaquePointer?): UInt

public expect fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmConnectionSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmConnectionCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmConnectionUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt

public expect fun fwpmDynamicKeywordSubscribe0(flags: UInt, callback: FwpmDynamicKeywordCallback0, context: COpaquePointer?, subscriptionhandle: COpaquePointer?): UInt

public expect fun fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Handle): UInt

public expect fun fwpmEngineClose0(enginehandle: Handle): UInt

public expect fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: COpaquePointer?): UInt

public expect fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: COpaquePointer?, session: COpaquePointer?, enginehandle: COpaquePointer?): UInt

public expect fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: COpaquePointer?): UInt

public expect fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmFilterAdd0(enginehandle: Handle, filter: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): UInt

public expect fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: COpaquePointer?): UInt

public expect fun fwpmFilterGetByKey0(enginehandle: Handle, key: COpaquePointer?, filter: COpaquePointer?): UInt

public expect fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmFilterSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmFilterChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt

public expect fun fwpmFilterSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmFilterUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt

public expect fun fwpmFreeMemory0(p: COpaquePointer?)

public expect fun fwpmGetAppIdFromFileName0(filename: Pcwstr, appid: COpaquePointer?): UInt

public expect fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: COpaquePointer?): UInt

public expect fun fwpmLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, layer: COpaquePointer?): UInt

public expect fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscribe1(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback1, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscribe2(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback2, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscribe3(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback3, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscribe4(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback4, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun fwpmNetEventSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmNetEventUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt

public expect fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmProviderAdd0(enginehandle: Handle, provider: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt

public expect fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): UInt

public expect fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt

public expect fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmProviderContextSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmProviderContextChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt

public expect fun fwpmProviderContextSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmProviderContextUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt

public expect fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmProviderGetByKey0(enginehandle: Handle, key: COpaquePointer?, provider: COpaquePointer?): UInt

public expect fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmProviderSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmProviderChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt

public expect fun fwpmProviderSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmProviderUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt

public expect fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: COpaquePointer?, sd: PsecurityDescriptor): UInt

public expect fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt

public expect fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, sublayer: COpaquePointer?): UInt

public expect fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun fwpmSubLayerSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmSublayerChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt

public expect fun fwpmSubLayerSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun fwpmSubLayerUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt

public expect fun fwpmSystemPortsGet0(enginehandle: Handle, sysports: COpaquePointer?): UInt

public expect fun fwpmSystemPortsSubscribe0(enginehandle: Handle, reserved: COpaquePointer?, callback: FwpmSystemPortsCallback0, context: COpaquePointer?, sysportshandle: COpaquePointer?): UInt

public expect fun fwpmSystemPortsUnsubscribe0(enginehandle: Handle, sysportshandle: Handle): UInt

public expect fun fwpmTransactionAbort0(enginehandle: Handle): UInt

public expect fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): UInt

public expect fun fwpmTransactionCommit0(enginehandle: Handle): UInt

public expect fun fwpmvSwitchEventSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmVswitchEventCallback0, context: COpaquePointer?, subscriptionhandle: COpaquePointer?): UInt

public expect fun fwpmvSwitchEventUnsubscribe0(enginehandle: Handle, subscriptionhandle: Handle): UInt

public expect fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: COpaquePointer?): UInt

public expect fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: COpaquePointer?): UInt

public expect fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: COpaquePointer?): UInt

public expect fun iPsecKeyManagerAddAndRegister0(enginehandle: Handle, keymanager: COpaquePointer?, keymanagercallbacks: COpaquePointer?, keymgmthandle: COpaquePointer?): UInt

public expect fun iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Handle, reserved: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Handle, reserved: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun iPsecKeyManagerUnregisterAndDelete0(enginehandle: Handle, keymgmthandle: Handle): UInt

public expect fun iPsecKeyManagersGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): UInt

public expect fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): UInt

public expect fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): UInt

public expect fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): UInt

public expect fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): UInt

public expect fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: COpaquePointer?, virtualiftunnelinfo: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): UInt

public expect fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): UInt

public expect fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): UInt

public expect fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): UInt

public expect fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): UInt

public expect fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): UInt

public expect fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): UInt

public expect fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: UInt): UInt

public expect fun iPsecSaContextSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: IpsecSaContextCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt

public expect fun iPsecSaContextSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt

public expect fun iPsecSaContextUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt

public expect fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: COpaquePointer?): UInt

public expect fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: COpaquePointer?): UInt

public expect fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: COpaquePointer?): UInt

public expect fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt

public expect fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt

public expect fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt

public expect fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): UInt

public expect fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt

public expect fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt

public expect fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: COpaquePointer?): UInt

public expect fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): UInt

public expect fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): UInt
