@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(enginehandle: Long, callout: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(enginehandle: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(enginehandle: Long, id: Int, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(enginehandle: Long, key: Long, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(enginehandle: Long, id: Long, connection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0(flags: Int, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(enginehandle: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(servername: Long, authnservice: Int, authidentity: Long, session: Long, enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(enginehandle: Long, option: Int, newvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(enginehandle: Long, filter: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(enginehandle: Long, id: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(enginehandle: Long, key: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(p: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0(filename: Long, appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(enginehandle: Long, id: Short, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(enginehandle: Long, key: Long, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(enginehandle: Long, provider: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(enginehandle: Long, key: Long, provider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(enginehandle: Long, sublayer: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(enginehandle: Long, key: Long, sublayer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0(enginehandle: Long, sysports: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0(enginehandle: Long, reserved: Long, callback: Long, context: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0(enginehandle: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(enginehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0(enginehandle: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(enginehandle: Long, idpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0(enginehandle: Long, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0(enginehandle: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(enginehandle: Long, outboundtraffic: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(enginehandle: Long, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(enginehandle: Long, flags: Long, newvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(enginehandle: Long, id: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int
}

public actual fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(enginehandle, callout, sd, id).toUInt()

public actual fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(enginehandle, id.toInt()).toUInt()

public actual fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(enginehandle, id.toInt(), callout).toUInt()

public actual fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(enginehandle, key, callout).toUInt()

public actual fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmCalloutSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CALLOUT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0(enginehandle, subscription, callback.toLong(), context, changehandle).toUInt()

public actual fun FwpmCalloutSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmCalloutUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0(enginehandle, changehandle).toUInt()

public actual fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(enginehandle, id.toLong(), connection).toUInt()

public actual fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmConnectionSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CONNECTION_CALLBACK0, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmConnectionUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0(enginehandle, eventshandle).toUInt()

public actual fun FwpmDynamicKeywordSubscribe0(flags: UInt, callback: FWPM_DYNAMIC_KEYWORD_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0(flags.toInt(), callback.toLong(), context, subscriptionhandle).toUInt()

public actual fun FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0(subscriptionhandle).toUInt()

public actual fun FwpmEngineClose0(enginehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(enginehandle).toUInt()

public actual fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(enginehandle, option, value).toUInt()

public actual fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(servername, authnservice.toInt(), authidentity, session, enginehandle).toUInt()

public actual fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(enginehandle, option, newvalue).toUInt()

public actual fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(enginehandle, filter, sd, id).toUInt()

public actual fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(enginehandle, id.toLong()).toUInt()

public actual fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(enginehandle, id.toLong(), filter).toUInt()

public actual fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(enginehandle, key, filter).toUInt()

public actual fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmFilterSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_FILTER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0(enginehandle, subscription, callback.toLong(), context, changehandle).toUInt()

public actual fun FwpmFilterSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmFilterUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0(enginehandle, changehandle).toUInt()

public actual fun FwpmFreeMemory0(p: Long) {
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(p)
}

public actual fun FwpmGetAppIdFromFileName0(filename: PCWSTR, appid: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0(filename, appid).toUInt()

public actual fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, sd).toUInt()

public actual fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd).toUInt()

public actual fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd).toUInt()

public actual fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(enginehandle, flags.toInt(), mainmodepolicy, tunnelpolicy, numfilterconditions.toInt(), filterconditions, keymodkey, sd).toUInt()

public actual fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(enginehandle, id.toShort(), layer).toUInt()

public actual fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(enginehandle, key, layer).toUInt()

public actual fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmNetEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmNetEventSubscribe1(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK1, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmNetEventSubscribe2(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK2, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmNetEventSubscribe3(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK3, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmNetEventSubscribe4(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK4, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun FwpmNetEventSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmNetEventUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0(enginehandle, eventshandle).toUInt()

public actual fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(enginehandle, provider, sd).toUInt()

public actual fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(enginehandle, providercontext, sd, id).toUInt()

public actual fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(enginehandle, providercontext, sd, id).toUInt()

public actual fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(enginehandle, providercontext, sd, id).toUInt()

public actual fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(enginehandle, providercontext, sd, id).toUInt()

public actual fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(enginehandle, id.toLong()).toUInt()

public actual fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(enginehandle, id.toLong(), providercontext).toUInt()

public actual fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(enginehandle, id.toLong(), providercontext).toUInt()

public actual fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(enginehandle, id.toLong(), providercontext).toUInt()

public actual fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(enginehandle, id.toLong(), providercontext).toUInt()

public actual fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(enginehandle, key, providercontext).toUInt()

public actual fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(enginehandle, key, providercontext).toUInt()

public actual fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(enginehandle, key, providercontext).toUInt()

public actual fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(enginehandle, key, providercontext).toUInt()

public actual fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmProviderContextSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0(enginehandle, subscription, callback.toLong(), context, changehandle).toUInt()

public actual fun FwpmProviderContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmProviderContextUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0(enginehandle, changehandle).toUInt()

public actual fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(enginehandle, key, provider).toUInt()

public actual fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmProviderSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0(enginehandle, subscription, callback.toLong(), context, changehandle).toUInt()

public actual fun FwpmProviderSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmProviderUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0(enginehandle, changehandle).toUInt()

public actual fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(enginehandle, sublayer, sd).toUInt()

public actual fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(enginehandle, key).toUInt()

public actual fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(enginehandle, key, sublayer).toUInt()

public actual fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(enginehandle, key, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun FwpmSubLayerSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_SUBLAYER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0(enginehandle, subscription, callback.toLong(), context, changehandle).toUInt()

public actual fun FwpmSubLayerSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun FwpmSubLayerUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0(enginehandle, changehandle).toUInt()

public actual fun FwpmSystemPortsGet0(enginehandle: HANDLE, sysports: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0(enginehandle, sysports).toUInt()

public actual fun FwpmSystemPortsSubscribe0(enginehandle: HANDLE, reserved: Long, callback: FWPM_SYSTEM_PORTS_CALLBACK0, context: Long, sysportshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0(enginehandle, reserved, callback.toLong(), context, sysportshandle).toUInt()

public actual fun FwpmSystemPortsUnsubscribe0(enginehandle: HANDLE, sysportshandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0(enginehandle, sysportshandle).toUInt()

public actual fun FwpmTransactionAbort0(enginehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(enginehandle).toUInt()

public actual fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(enginehandle, flags.toInt()).toUInt()

public actual fun FwpmTransactionCommit0(enginehandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(enginehandle).toUInt()

public actual fun FwpmvSwitchEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_VSWITCH_EVENT_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0(enginehandle, subscription, callback.toLong(), context, subscriptionhandle).toUInt()

public actual fun FwpmvSwitchEventUnsubscribe0(enginehandle: HANDLE, subscriptionhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0(enginehandle, subscriptionhandle).toUInt()

public actual fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(enginehandle, idpstatistics).toUInt()

public actual fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentries).toUInt()

public actual fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(enginehandle, ipsecstatistics).toUInt()

public actual fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(enginehandle, ipsecstatistics).toUInt()

public actual fun IPsecKeyManagerAddAndRegister0(enginehandle: HANDLE, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0(enginehandle, keymanager, keymanagercallbacks, keymgmthandle).toUInt()

public actual fun IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0(enginehandle, reserved, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0(enginehandle, reserved, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun IPsecKeyManagerUnregisterAndDelete0(enginehandle: HANDLE, keymgmthandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0(enginehandle, keymgmthandle).toUInt()

public actual fun IPsecKeyManagersGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0(enginehandle, entries, numentries).toUInt()

public actual fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(enginehandle, id.toLong(), inboundbundle).toUInt()

public actual fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(enginehandle, id.toLong(), inboundbundle).toUInt()

public actual fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(enginehandle, id.toLong(), outboundbundle).toUInt()

public actual fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(enginehandle, id.toLong(), outboundbundle).toUInt()

public actual fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(enginehandle, outboundtraffic, inboundfilterid, id).toUInt()

public actual fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(enginehandle, outboundtraffic, virtualiftunnelinfo, inboundfilterid, id).toUInt()

public actual fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(enginehandle, id.toLong()).toUInt()

public actual fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(enginehandle, id.toLong()).toUInt()

public actual fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(enginehandle, id.toLong(), sacontext).toUInt()

public actual fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(enginehandle, id.toLong(), sacontext).toUInt()

public actual fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(enginehandle, id.toLong(), getspi, inboundspi).toUInt()

public actual fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(enginehandle, id.toLong(), getspi, inboundspi).toUInt()

public actual fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(enginehandle, id.toLong(), getspi, inboundspi.toInt()).toUInt()

public actual fun IPsecSaContextSubscribe0(enginehandle: HANDLE, subscription: Long, callback: IPSEC_SA_CONTEXT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0(enginehandle, subscription, callback.toLong(), context, eventshandle).toUInt()

public actual fun IPsecSaContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0(enginehandle, entries, numentries).toUInt()

public actual fun IPsecSaContextUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0(enginehandle, eventshandle).toUInt()

public actual fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(enginehandle, flags.toLong(), newvalues).toUInt()

public actual fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(enginehandle, ikeextstatistics).toUInt()

public actual fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(enginehandle, ikeextstatistics).toUInt()

public actual fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(enginehandle, enumtemplate, enumhandle).toUInt()

public actual fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl, securitydescriptor).toUInt()

public actual fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(enginehandle, securityinfo.toInt(), sidowner, sidgroup, dacl, sacl).toUInt()

public actual fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(enginehandle, id.toLong()).toUInt()

public actual fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(enginehandle, enumhandle).toUInt()

public actual fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(enginehandle, enumhandle, numentriesrequested.toInt(), entries, numentriesreturned).toUInt()

public actual fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(enginehandle, id.toLong(), sa).toUInt()

public actual fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(enginehandle, id.toLong(), salookupcontext, sa).toUInt()

public actual fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(enginehandle, id.toLong(), salookupcontext, sa).toUInt()
