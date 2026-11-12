package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpValue0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmCallout0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmCalloutEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmConnection0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmConnectionEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmEngineOption
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilter0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilterCondition0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmFilterEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmLayer0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmLayerEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent4
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEvent5
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmNetEventEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProvider0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContext3
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderContextEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmProviderEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmServiceState
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSession0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSessionEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSublayer0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FwpmSublayerEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaDetails2
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextSaEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IkeextStatistics1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospState0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospStateEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecDospStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecGetspi0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecGetspi1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaBundle0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaBundle1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContext0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContext1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaContextEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaDetails0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaDetails1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecSaEnumTemplate0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecStatistics0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecStatistics1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecTraffic0
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecTraffic1
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.IpsecVirtualIfTunnelInfo0
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.system.rpc.SecWinntAuthIdentityW

public expect fun fwpmBfeStateGet0(): FwpmServiceState

public expect fun fwpmBfeStateSubscribeChanges0(deviceobject: MutPtr<CVoid>, callback: FwpmServiceStateChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus

public expect fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): Ntstatus

public expect fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus

public expect fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus

public expect fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus

public expect fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): Ntstatus

public expect fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmEngineClose0(enginehandle: Handle): Ntstatus

public expect fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): Ntstatus

public expect fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): Ntstatus

public expect fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus

public expect fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus

public expect fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus

public expect fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>)

public expect fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus

public expect fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus

public expect fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus

public expect fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus

public expect fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus

public expect fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus

public expect fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus

public expect fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus

public expect fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus

public expect fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus

public expect fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus

public expect fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus

public expect fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus

public expect fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus

public expect fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): Ntstatus

public expect fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): Ntstatus

public expect fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus

public expect fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): Ntstatus

public expect fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus

public expect fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus

public expect fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus

public expect fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): Ntstatus

public expect fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): Ntstatus

public expect fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): Ntstatus

public expect fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): Ntstatus

public expect fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus

public expect fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus

public expect fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus

public expect fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus

public expect fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus

public expect fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus

public expect fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): Ntstatus

public expect fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): Ntstatus

public expect fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): Ntstatus

public expect fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): Ntstatus

public expect fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): Ntstatus

public expect fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): Ntstatus

public expect fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): Ntstatus

public expect fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): Ntstatus

public expect fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus

public expect fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus

public expect fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus

public expect fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus

public expect fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus

public expect fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus

public expect fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): Ntstatus

public expect fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): Ntstatus

public expect fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): Ntstatus
