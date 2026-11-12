@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0(): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(changehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle: Long, callout: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle: Long, id: Int, callout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle: Long, key: Long, callout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle: Long, id: Long, connection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername: Long, authnservice: Int, authidentity: Long, session: Long, enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle: Long, option: Int, newvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle: Long, filter: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle: Long, id: Long, filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle: Long, key: Long, filter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p: Long)

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle: Long, id: Short, layer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle: Long, key: Long, layer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle: Long, provider: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle: Long, key: Long, provider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle: Long, sublayer: Long, sd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle: Long, key: Long, sublayer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle: Long, idpstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle: Long, outboundtraffic: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle: Long, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle: Long, flags: Long, newvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle: Long, id: Long, sa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int
}

public actual fun fwpmBfeStateGet0(): FwpmServiceState =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateGet0()

public actual fun fwpmBfeStateSubscribeChanges0(deviceobject: MutPtr<CVoid>, callback: FwpmServiceStateChangeCallback0, context: ConstPtr<CVoid>, changehandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateSubscribeChanges0(deviceobject.rawAddress, 0L, context.rawAddress, changehandle.rawAddress)

public actual fun fwpmBfeStateUnsubscribeChanges0(changehandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmBfeStateUnsubscribeChanges0(changehandle.rawAddress)

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: ConstPtr<FwpmCallout0>, sd: PsecurityDescriptor, id: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutAdd0(enginehandle.rawAddress, callout.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmCalloutEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteById0(enginehandle.rawAddress, id.toInt())

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmCallout0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetById0(enginehandle.rawAddress, id.toInt(), callout.rawAddress)

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, callout: MutPtr<MutPtr<FwpmCallout0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetByKey0(enginehandle.rawAddress, key.rawAddress, callout.rawAddress)

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmCalloutSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmConnectionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmConnection0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: MutPtr<MutPtr<FwpmConnection0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetById0(enginehandle.rawAddress, id.toLong(), connection.rawAddress)

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmConnectionSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmEngineClose0(enginehandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineClose0(enginehandle.rawAddress)

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: MutPtr<MutPtr<FwpValue0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetOption0(enginehandle.rawAddress, option, value.rawAddress)

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: ConstPtr<SecWinntAuthIdentityW>, session: ConstPtr<FwpmSession0>, enginehandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineOpen0(servername.rawAddress, authnservice.toInt(), authidentity.rawAddress, session.rawAddress, enginehandle.rawAddress)

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: ConstPtr<FwpValue0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetOption0(enginehandle.rawAddress, option, newvalue.rawAddress)

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmEngineSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: ConstPtr<FwpmFilter0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterAdd0(enginehandle.rawAddress, filter.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmFilterEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteById0(enginehandle.rawAddress, id.toLong())

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmFilter0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetById0(enginehandle.rawAddress, id.toLong(), filter.rawAddress)

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, filter: MutPtr<MutPtr<FwpmFilter0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetByKey0(enginehandle.rawAddress, key.rawAddress, filter.rawAddress)

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFilterSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmFreeMemory0(p: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmFreeMemory0(p.rawAddress)
}

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext0>, tunnelpolicy: ConstPtr<FwpmProviderContext0>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd0(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, sd.rawAddress)

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext1>, tunnelpolicy: ConstPtr<FwpmProviderContext1>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd1(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress)

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext2>, tunnelpolicy: ConstPtr<FwpmProviderContext2>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd2(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress)

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: ConstPtr<FwpmProviderContext3>, tunnelpolicy: ConstPtr<FwpmProviderContext3>, numfilterconditions: UInt, filterconditions: ConstPtr<FwpmFilterCondition0>, keymodkey: ConstPtr<Guid>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelAdd3(enginehandle.rawAddress, flags.toInt(), mainmodepolicy.rawAddress, tunnelpolicy.rawAddress, numfilterconditions.toInt(), filterconditions.rawAddress, keymodkey.rawAddress, sd.rawAddress)

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmIPsecTunnelDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmLayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmLayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetById0(enginehandle.rawAddress, id.toShort(), layer.rawAddress)

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, layer: MutPtr<MutPtr<FwpmLayer0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetByKey0(enginehandle.rawAddress, key.rawAddress, layer.rawAddress)

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmLayerSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmNetEventEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum3(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent4>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum4(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmNetEvent5>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventEnum5(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmNetEventsSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: ConstPtr<FwpmProvider0>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderAdd0(enginehandle.rawAddress, provider.rawAddress, sd.rawAddress)

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext0>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd0(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext1>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd1(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext2>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd2(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: ConstPtr<FwpmProviderContext3>, sd: PsecurityDescriptor, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextAdd3(enginehandle.rawAddress, providercontext.rawAddress, sd.rawAddress, id.rawAddress)

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteById0(enginehandle.rawAddress, id.toLong())

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProviderContext3>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextEnum3(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById0(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress)

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById1(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress)

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById2(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress)

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetById3(enginehandle.rawAddress, id.toLong(), providercontext.rawAddress)

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey0(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress)

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext1>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey1(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress)

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext2>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey2(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress)

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: ConstPtr<Guid>, providercontext: MutPtr<MutPtr<FwpmProviderContext3>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetByKey3(enginehandle.rawAddress, key.rawAddress, providercontext.rawAddress)

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderContextSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmProviderEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmProvider0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, provider: MutPtr<MutPtr<FwpmProvider0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetByKey0(enginehandle.rawAddress, key.rawAddress, provider.rawAddress)

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmProviderSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSessionEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSession0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSessionEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: ConstPtr<FwpmSublayer0>, sd: PsecurityDescriptor): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerAdd0(enginehandle.rawAddress, sublayer.rawAddress, sd.rawAddress)

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<FwpmSublayerEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: ConstPtr<Guid>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDeleteByKey0(enginehandle.rawAddress, key.rawAddress)

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<FwpmSublayer0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: ConstPtr<Guid>, sublayer: MutPtr<MutPtr<FwpmSublayer0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetByKey0(enginehandle.rawAddress, key.rawAddress, sublayer.rawAddress)

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerGetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: ConstPtr<Guid>, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmSubLayerSetSecurityInfoByKey0(enginehandle.rawAddress, key.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun fwpmTransactionAbort0(enginehandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionAbort0(enginehandle.rawAddress)

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionBegin0(enginehandle.rawAddress, flags.toInt())

public actual fun fwpmTransactionCommit0(enginehandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmTransactionCommit0(enginehandle.rawAddress)

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformFwpmvSwitchEventsSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: MutPtr<IpsecDospStatistics0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospGetStatistics0(enginehandle.rawAddress, idpstatistics.rawAddress)

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecDospStateEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecDospState0>>>, numentries: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecDospStateEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentries.rawAddress)

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics0(enginehandle.rawAddress, ipsecstatistics.rawAddress)

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: MutPtr<IpsecStatistics1>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecGetStatistics1(enginehandle.rawAddress, ipsecstatistics.rawAddress)

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound0(enginehandle.rawAddress, id.toLong(), inboundbundle.rawAddress)

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddInbound1(enginehandle.rawAddress, id.toLong(), inboundbundle.rawAddress)

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound0(enginehandle.rawAddress, id.toLong(), outboundbundle.rawAddress)

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: ConstPtr<IpsecSaBundle1>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextAddOutbound1(enginehandle.rawAddress, id.toLong(), outboundbundle.rawAddress)

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate0(enginehandle.rawAddress, outboundtraffic.rawAddress, inboundfilterid.rawAddress, id.rawAddress)

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: ConstPtr<IpsecTraffic1>, virtualiftunnelinfo: ConstPtr<IpsecVirtualIfTunnelInfo0>, inboundfilterid: MutPtr<ULong>, id: MutPtr<ULong>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreate1(enginehandle.rawAddress, outboundtraffic.rawAddress, virtualiftunnelinfo.rawAddress, inboundfilterid.rawAddress, id.rawAddress)

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaContextEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDeleteById0(enginehandle.rawAddress, id.toLong())

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaContext1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextExpire0(enginehandle.rawAddress, id.toLong())

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById0(enginehandle.rawAddress, id.toLong(), sacontext.rawAddress)

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: MutPtr<MutPtr<IpsecSaContext1>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetById1(enginehandle.rawAddress, id.toLong(), sacontext.rawAddress)

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi0>, inboundspi: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi0(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.rawAddress)

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextGetSpi1(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.rawAddress)

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: ConstPtr<IpsecGetspi1>, inboundspi: UInt): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextSetSpi0(enginehandle.rawAddress, id.toLong(), getspi.rawAddress, inboundspi.toInt())

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: ConstPtr<IpsecSaContext1>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaContextUpdate0(enginehandle.rawAddress, flags.toLong(), newvalues.rawAddress)

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IpsecSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDbSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IpsecSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIPsecSaEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics0>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics0(enginehandle.rawAddress, ikeextstatistics.rawAddress)

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: MutPtr<IkeextStatistics1>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextGetStatistics1(enginehandle.rawAddress, ikeextstatistics.rawAddress)

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: ConstPtr<IkeextSaEnumTemplate0>, enumhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaCreateEnumHandle0(enginehandle.rawAddress, enumtemplate.rawAddress, enumhandle.rawAddress)

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: MutPtr<Psid>, sidgroup: MutPtr<Psid>, dacl: MutPtr<MutPtr<Acl>>, sacl: MutPtr<MutPtr<Acl>>, securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbGetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress, securitydescriptor.rawAddress)

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: ConstPtr<Sid>, sidgroup: ConstPtr<Sid>, dacl: ConstPtr<Acl>, sacl: ConstPtr<Acl>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDbSetSecurityInfo0(enginehandle.rawAddress, securityinfo.toInt(), sidowner.rawAddress, sidgroup.rawAddress, dacl.rawAddress, sacl.rawAddress)

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDeleteById0(enginehandle.rawAddress, id.toLong())

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaDestroyEnumHandle0(enginehandle.rawAddress, enumhandle.rawAddress)

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails0>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum0(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails1>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum1(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: MutPtr<MutPtr<MutPtr<IkeextSaDetails2>>>, numentriesreturned: MutPtr<UInt>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaEnum2(enginehandle.rawAddress, enumhandle.rawAddress, numentriesrequested.toInt(), entries.rawAddress, numentriesreturned.rawAddress)

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: MutPtr<MutPtr<IkeextSaDetails0>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById0(enginehandle.rawAddress, id.toLong(), sa.rawAddress)

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails1>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById1(enginehandle.rawAddress, id.toLong(), salookupcontext.rawAddress, sa.rawAddress)

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: ConstPtr<Guid>, sa: MutPtr<MutPtr<IkeextSaDetails2>>): Ntstatus =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssysWindowsWdkNetworkmanagementWindowsfilteringplatformIkeextSaGetById2(enginehandle.rawAddress, id.toLong(), salookupcontext.rawAddress, sa.rawAddress)
