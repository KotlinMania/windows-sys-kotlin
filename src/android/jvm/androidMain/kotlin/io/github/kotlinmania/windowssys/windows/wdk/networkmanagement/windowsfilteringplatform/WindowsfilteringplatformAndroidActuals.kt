@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_ENGINE_OPTION
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.FWPM_SERVICE_STATE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0(changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(enginehandle: Long, callout: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(enginehandle: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(enginehandle: Long, id: Int, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(enginehandle: Long, key: Long, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(enginehandle: Long, id: Long, connection: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(enginehandle: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(servername: Long, authnservice: Int, authidentity: Long, session: Long, enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(enginehandle: Long, option: Int, newvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(enginehandle: Long, filter: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(enginehandle: Long, id: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(enginehandle: Long, key: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(p: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(enginehandle: Long, id: Short, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(enginehandle: Long, key: Long, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(enginehandle: Long, provider: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(enginehandle: Long, key: Long, provider: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(enginehandle: Long, sublayer: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(enginehandle: Long, key: Long, sublayer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(enginehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(enginehandle: Long, idpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(enginehandle: Long, outboundtraffic: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(enginehandle: Long, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(enginehandle: Long, flags: Long, newvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(enginehandle: Long, id: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int
}

public actual fun FwpmBfeStateGet0(): FWPM_SERVICE_STATE =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateGet0()

public actual fun FwpmBfeStateSubscribeChanges0(deviceobject: Long, callback: FWPM_SERVICE_STATE_CHANGE_CALLBACK0, context: Long, changehandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateSubscribeChanges0(deviceobject, callback.toLong(), context, changehandle)

public actual fun FwpmBfeStateUnsubscribeChanges0(changehandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmBfeStateUnsubscribeChanges0(changehandle)

public actual fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(enginehandle, callout, sd, id)

public actual fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(enginehandle, id.toInt())

public actual fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(enginehandle, key)

public actual fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(enginehandle, id.toInt(), callout)

public actual fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(enginehandle, key, callout)

public actual fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(enginehandle, id.toLong(), connection)

public actual fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmEngineClose0(enginehandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(enginehandle)

public actual fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(enginehandle, option, value)

public actual fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(servername, authnservice.toInt(), authidentity, session, enginehandle)

public actual fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(enginehandle, option, newvalue)

public actual fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(enginehandle, filter, sd, id)

public actual fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(enginehandle, id.toLong())

public actual fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(enginehandle, key)

public actual fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(enginehandle, id.toLong(), filter)

public actual fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(enginehandle, key, filter)

public actual fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmFreeMemory0(p: Long) {
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(p)
}

public actual fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, sd)

public actual fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd)

public actual fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd)

public actual fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd)

public actual fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(enginehandle, key)

public actual fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(enginehandle, id.toShort(), layer)

public actual fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(enginehandle, key, layer)

public actual fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(enginehandle, provider, sd)

public actual fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(enginehandle, providercontext, sd, id)

public actual fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(enginehandle, providercontext, sd, id)

public actual fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(enginehandle, providercontext, sd, id)

public actual fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(enginehandle, providercontext, sd, id)

public actual fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(enginehandle, id.toLong())

public actual fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(enginehandle, key)

public actual fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(enginehandle, id.toLong(), providercontext)

public actual fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(enginehandle, id.toLong(), providercontext)

public actual fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(enginehandle, id.toLong(), providercontext)

public actual fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(enginehandle, id.toLong(), providercontext)

public actual fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(enginehandle, key, providercontext)

public actual fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(enginehandle, key, providercontext)

public actual fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(enginehandle, key, providercontext)

public actual fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(enginehandle, key, providercontext)

public actual fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(enginehandle, key)

public actual fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(enginehandle, key, provider)

public actual fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(enginehandle, sublayer, sd)

public actual fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(enginehandle, key)

public actual fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(enginehandle, key, sublayer)

public actual fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun FwpmTransactionAbort0(enginehandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(enginehandle)

public actual fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(enginehandle, flags.toInt())

public actual fun FwpmTransactionCommit0(enginehandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(enginehandle)

public actual fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(enginehandle, idpstatistics)

public actual fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentries)

public actual fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(enginehandle, ipsecstatistics)

public actual fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(enginehandle, ipsecstatistics)

public actual fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(enginehandle, id.toLong(), inboundbundle)

public actual fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(enginehandle, id.toLong(), inboundbundle)

public actual fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(enginehandle, id.toLong(), outboundbundle)

public actual fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(enginehandle, id.toLong(), outboundbundle)

public actual fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(enginehandle, outboundtraffic, inboundfilterid, id)

public actual fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id)

public actual fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(enginehandle, id.toLong())

public actual fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(enginehandle, id.toLong())

public actual fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(enginehandle, id.toLong(), sacontext)

public actual fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(enginehandle, id.toLong(), sacontext)

public actual fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(enginehandle, id.toLong(), getspi, inboundspi)

public actual fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(enginehandle, id.toLong(), getspi, inboundspi)

public actual fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(enginehandle, id.toLong(), getspi, inboundspi.toInt())

public actual fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(enginehandle, flags.toLong(), newvalues)

public actual fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(enginehandle, ikeextstatistics)

public actual fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(enginehandle, ikeextstatistics)

public actual fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(enginehandle, enumtemplate, enumhandle)

public actual fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor)

public actual fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl)

public actual fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(enginehandle, id.toLong())

public actual fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(enginehandle, enumhandle)

public actual fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned)

public actual fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(enginehandle, id.toLong(), sa)

public actual fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(enginehandle, id.toLong(), salookupcontext, sa)

public actual fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): NTSTATUS =
    WindowsWdkNetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_wdk_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(enginehandle, id.toLong(), salookupcontext, sa)
