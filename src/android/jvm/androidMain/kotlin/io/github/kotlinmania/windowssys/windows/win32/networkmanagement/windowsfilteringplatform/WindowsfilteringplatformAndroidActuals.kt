@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutAdd0(enginehandle: Long, callout: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteById0(enginehandle: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetById0(enginehandle: Long, id: Int, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetByKey0(enginehandle: Long, key: Long, callout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionGetById0(enginehandle: Long, id: Long, connection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmDynamicKeywordSubscribe0(flags: Int, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineClose0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineGetOption0(enginehandle: Long, option: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineOpen0(servername: Long, authnservice: Int, authidentity: Long, session: Long, enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineSetOption0(enginehandle: Long, option: Int, newvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterAdd0(enginehandle: Long, filter: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetById0(enginehandle: Long, id: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetByKey0(enginehandle: Long, key: Long, filter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFreeMemory0(p: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmGetAppIdFromFileName0(filename: Long, appid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd0(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd1(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd2(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd3(enginehandle: Long, flags: Int, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: Int, filterconditions: Long, keymodkey: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetById0(enginehandle: Long, id: Short, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetByKey0(enginehandle: Long, key: Long, layer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum4(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum5(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe1(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe2(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe3(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe4(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderAdd0(enginehandle: Long, provider: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd0(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd1(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd2(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd3(enginehandle: Long, providercontext: Long, sd: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum3(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById0(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById1(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById2(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById3(enginehandle: Long, id: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey0(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey1(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey2(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey3(enginehandle: Long, key: Long, providercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderGetByKey0(enginehandle: Long, key: Long, provider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerAdd0(enginehandle: Long, sublayer: Long, sd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerDeleteByKey0(enginehandle: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetByKey0(enginehandle: Long, key: Long, sublayer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Long, key: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSubscribeChanges0(enginehandle: Long, subscription: Long, callback: Long, context: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerUnsubscribeChanges0(enginehandle: Long, changehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsGet0(enginehandle: Long, sysports: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsSubscribe0(enginehandle: Long, reserved: Long, callback: Long, context: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsUnsubscribe0(enginehandle: Long, sysportshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionAbort0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionBegin0(enginehandle: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionCommit0(enginehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventUnsubscribe0(enginehandle: Long, subscriptionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospGetStatistics0(enginehandle: Long, idpstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecGetStatistics0(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecGetStatistics1(enginehandle: Long, ipsecstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerAddAndRegister0(enginehandle: Long, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Long, reserved: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerUnregisterAndDelete0(enginehandle: Long, keymgmthandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagersGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound0(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound1(enginehandle: Long, id: Long, inboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound0(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound1(enginehandle: Long, id: Long, outboundbundle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate0(enginehandle: Long, outboundtraffic: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate1(enginehandle: Long, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextExpire0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById0(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById1(enginehandle: Long, id: Long, sacontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi1(enginehandle: Long, id: Long, getspi: Long, inboundspi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSetSpi0(enginehandle: Long, id: Long, getspi: Long, inboundspi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSubscribe0(enginehandle: Long, subscription: Long, callback: Long, context: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSubscriptionsGet0(enginehandle: Long, entries: Long, numentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextUnsubscribe0(enginehandle: Long, eventshandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextUpdate0(enginehandle: Long, flags: Long, newvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextGetStatistics0(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextGetStatistics1(enginehandle: Long, ikeextstatistics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaCreateEnumHandle0(enginehandle: Long, enumtemplate: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDbGetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDbSetSecurityInfo0(enginehandle: Long, securityinfo: Int, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDeleteById0(enginehandle: Long, id: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDestroyEnumHandle0(enginehandle: Long, enumhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum0(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum1(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum2(enginehandle: Long, enumhandle: Long, numentriesrequested: Int, entries: Long, numentriesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById0(enginehandle: Long, id: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById1(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById2(enginehandle: Long, id: Long, salookupcontext: Long, sa: Long): Int
}

public actual fun fwpmCalloutAdd0(enginehandle: Handle, callout: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutAdd0((enginehandle?.value ?: 0L), (callout?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutDeleteById0(enginehandle: Handle, id: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteById0((enginehandle?.value ?: 0L), id.toInt()).toUInt()

public actual fun fwpmCalloutDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutGetById0(enginehandle: Handle, id: UInt, callout: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetById0((enginehandle?.value ?: 0L), id.toInt(), (callout?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutGetByKey0(enginehandle: Handle, key: COpaquePointer?, callout: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (callout?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmCalloutChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSubscribeChanges0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmCalloutUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmCalloutUnsubscribeChanges0((enginehandle?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionGetById0(enginehandle: Handle, id: ULong, connection: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionGetById0((enginehandle?.value ?: 0L), id.toLong(), (connection?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmConnectionCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionSubscribe0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmConnectionUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmConnectionUnsubscribe0((enginehandle?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmDynamicKeywordSubscribe0(flags: UInt, callback: FwpmDynamicKeywordCallback0, context: COpaquePointer?, subscriptionhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmDynamicKeywordSubscribe0(flags.toInt(), 0L, (context?.value ?: 0L), (subscriptionhandle?.value ?: 0L)).toUInt()

public actual fun fwpmDynamicKeywordUnsubscribe0(subscriptionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmDynamicKeywordUnsubscribe0((subscriptionhandle?.value ?: 0L)).toUInt()

public actual fun fwpmEngineClose0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineClose0((enginehandle?.value ?: 0L)).toUInt()

public actual fun fwpmEngineGetOption0(enginehandle: Handle, option: FwpmEngineOption, value: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineGetOption0((enginehandle?.value ?: 0L), option, (value?.value ?: 0L)).toUInt()

public actual fun fwpmEngineGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmEngineOpen0(servername: Pcwstr, authnservice: UInt, authidentity: COpaquePointer?, session: COpaquePointer?, enginehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineOpen0((servername?.value ?: 0L), authnservice.toInt(), (authidentity?.value ?: 0L), (session?.value ?: 0L), (enginehandle?.value ?: 0L)).toUInt()

public actual fun fwpmEngineSetOption0(enginehandle: Handle, option: FwpmEngineOption, newvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineSetOption0((enginehandle?.value ?: 0L), option, (newvalue?.value ?: 0L)).toUInt()

public actual fun fwpmEngineSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmEngineSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmFilterAdd0(enginehandle: Handle, filter: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterAdd0((enginehandle?.value ?: 0L), (filter?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmFilterCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmFilterDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteById0((enginehandle?.value ?: 0L), id.toLong()).toUInt()

public actual fun fwpmFilterDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmFilterDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmFilterEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmFilterGetById0(enginehandle: Handle, id: ULong, filter: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetById0((enginehandle?.value ?: 0L), id.toLong(), (filter?.value ?: 0L)).toUInt()

public actual fun fwpmFilterGetByKey0(enginehandle: Handle, key: COpaquePointer?, filter: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (filter?.value ?: 0L)).toUInt()

public actual fun fwpmFilterGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmFilterSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmFilterSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmFilterChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSubscribeChanges0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmFilterSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmFilterUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFilterUnsubscribeChanges0((enginehandle?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmFreeMemory0(p: COpaquePointer?) {
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmFreeMemory0((p?.value ?: 0L))
}

public actual fun fwpmGetAppIdFromFileName0(filename: Pcwstr, appid: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmGetAppIdFromFileName0((filename?.value ?: 0L), (appid?.value ?: 0L)).toUInt()

public actual fun fwpmIPsecTunnelAdd0(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd0((enginehandle?.value ?: 0L), flags.toInt(), (mainmodepolicy?.value ?: 0L), (tunnelpolicy?.value ?: 0L), numfilterconditions.toInt(), (filterconditions?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmIPsecTunnelAdd1(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd1((enginehandle?.value ?: 0L), flags.toInt(), (mainmodepolicy?.value ?: 0L), (tunnelpolicy?.value ?: 0L), numfilterconditions.toInt(), (filterconditions?.value ?: 0L), (keymodkey?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmIPsecTunnelAdd2(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd2((enginehandle?.value ?: 0L), flags.toInt(), (mainmodepolicy?.value ?: 0L), (tunnelpolicy?.value ?: 0L), numfilterconditions.toInt(), (filterconditions?.value ?: 0L), (keymodkey?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmIPsecTunnelAdd3(enginehandle: Handle, flags: UInt, mainmodepolicy: COpaquePointer?, tunnelpolicy: COpaquePointer?, numfilterconditions: UInt, filterconditions: COpaquePointer?, keymodkey: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelAdd3((enginehandle?.value ?: 0L), flags.toInt(), (mainmodepolicy?.value ?: 0L), (tunnelpolicy?.value ?: 0L), numfilterconditions.toInt(), (filterconditions?.value ?: 0L), (keymodkey?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmIPsecTunnelDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmIPsecTunnelDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmLayerGetById0(enginehandle: Handle, id: UShort, layer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetById0((enginehandle?.value ?: 0L), id.toShort(), (layer?.value ?: 0L)).toUInt()

public actual fun fwpmLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, layer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (layer?.value ?: 0L)).toUInt()

public actual fun fwpmLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmLayerSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum1((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum2((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum3((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum4(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum4((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventEnum5(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventEnum5((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscribe1(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback1, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe1((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscribe2(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback2, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe2((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscribe3(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback3, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe3((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscribe4(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmNetEventCallback4, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscribe4((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventUnsubscribe0((enginehandle?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventsGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmNetEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmNetEventsSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmProviderAdd0(enginehandle: Handle, provider: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderAdd0((enginehandle?.value ?: 0L), (provider?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextAdd0(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd0((enginehandle?.value ?: 0L), (providercontext?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextAdd1(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd1((enginehandle?.value ?: 0L), (providercontext?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextAdd2(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd2((enginehandle?.value ?: 0L), (providercontext?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextAdd3(enginehandle: Handle, providercontext: COpaquePointer?, sd: PsecurityDescriptor, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextAdd3((enginehandle?.value ?: 0L), (providercontext?.value ?: 0L), (sd?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteById0((enginehandle?.value ?: 0L), id.toLong()).toUInt()

public actual fun fwpmProviderContextDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum1((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum2((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextEnum3(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextEnum3((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetById0(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById0((enginehandle?.value ?: 0L), id.toLong(), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetById1(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById1((enginehandle?.value ?: 0L), id.toLong(), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetById2(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById2((enginehandle?.value ?: 0L), id.toLong(), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetById3(enginehandle: Handle, id: ULong, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetById3((enginehandle?.value ?: 0L), id.toLong(), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetByKey0(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetByKey1(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey1((enginehandle?.value ?: 0L), (key?.value ?: 0L), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetByKey2(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey2((enginehandle?.value ?: 0L), (key?.value ?: 0L), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetByKey3(enginehandle: Handle, key: COpaquePointer?, providercontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetByKey3((enginehandle?.value ?: 0L), (key?.value ?: 0L), (providercontext?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmProviderContextChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSubscribeChanges0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmProviderContextUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderContextUnsubscribeChanges0((enginehandle?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmProviderDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmProviderGetByKey0(enginehandle: Handle, key: COpaquePointer?, provider: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (provider?.value ?: 0L)).toUInt()

public actual fun fwpmProviderGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmProviderSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmProviderSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmProviderChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSubscribeChanges0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmProviderSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmProviderUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmProviderUnsubscribeChanges0((enginehandle?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmSessionCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmSessionDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmSessionEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSessionEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerAdd0(enginehandle: Handle, sublayer: COpaquePointer?, sd: PsecurityDescriptor): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerAdd0((enginehandle?.value ?: 0L), (sublayer?.value ?: 0L), (sd?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerDeleteByKey0(enginehandle: Handle, key: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerDeleteByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerGetByKey0(enginehandle: Handle, key: COpaquePointer?, sublayer: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), (sublayer?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerGetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerSetSecurityInfoByKey0(enginehandle: Handle, key: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (key?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerSubscribeChanges0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmSublayerChangeCallback0, context: COpaquePointer?, changehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSubscribeChanges0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun fwpmSubLayerUnsubscribeChanges0(enginehandle: Handle, changehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSubLayerUnsubscribeChanges0((enginehandle?.value ?: 0L), (changehandle?.value ?: 0L)).toUInt()

public actual fun fwpmSystemPortsGet0(enginehandle: Handle, sysports: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsGet0((enginehandle?.value ?: 0L), (sysports?.value ?: 0L)).toUInt()

public actual fun fwpmSystemPortsSubscribe0(enginehandle: Handle, reserved: COpaquePointer?, callback: FwpmSystemPortsCallback0, context: COpaquePointer?, sysportshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsSubscribe0((enginehandle?.value ?: 0L), (reserved?.value ?: 0L), 0L, (context?.value ?: 0L), (sysportshandle?.value ?: 0L)).toUInt()

public actual fun fwpmSystemPortsUnsubscribe0(enginehandle: Handle, sysportshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmSystemPortsUnsubscribe0((enginehandle?.value ?: 0L), (sysportshandle?.value ?: 0L)).toUInt()

public actual fun fwpmTransactionAbort0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionAbort0((enginehandle?.value ?: 0L)).toUInt()

public actual fun fwpmTransactionBegin0(enginehandle: Handle, flags: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionBegin0((enginehandle?.value ?: 0L), flags.toInt()).toUInt()

public actual fun fwpmTransactionCommit0(enginehandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmTransactionCommit0((enginehandle?.value ?: 0L)).toUInt()

public actual fun fwpmvSwitchEventSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: FwpmVswitchEventCallback0, context: COpaquePointer?, subscriptionhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventSubscribe0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (subscriptionhandle?.value ?: 0L)).toUInt()

public actual fun fwpmvSwitchEventUnsubscribe0(enginehandle: Handle, subscriptionhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventUnsubscribe0((enginehandle?.value ?: 0L), (subscriptionhandle?.value ?: 0L)).toUInt()

public actual fun fwpmvSwitchEventsGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun fwpmvSwitchEventsSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_fwpmvSwitchEventsSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun iPsecDospGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun iPsecDospGetStatistics0(enginehandle: Handle, idpstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospGetStatistics0((enginehandle?.value ?: 0L), (idpstatistics?.value ?: 0L)).toUInt()

public actual fun iPsecDospSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun iPsecDospStateCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecDospStateDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecDospStateEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecDospStateEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun iPsecGetStatistics0(enginehandle: Handle, ipsecstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecGetStatistics0((enginehandle?.value ?: 0L), (ipsecstatistics?.value ?: 0L)).toUInt()

public actual fun iPsecGetStatistics1(enginehandle: Handle, ipsecstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecGetStatistics1((enginehandle?.value ?: 0L), (ipsecstatistics?.value ?: 0L)).toUInt()

public actual fun iPsecKeyManagerAddAndRegister0(enginehandle: Handle, keymanager: COpaquePointer?, keymanagercallbacks: COpaquePointer?, keymgmthandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerAddAndRegister0((enginehandle?.value ?: 0L), (keymanager?.value ?: 0L), (keymanagercallbacks?.value ?: 0L), (keymgmthandle?.value ?: 0L)).toUInt()

public actual fun iPsecKeyManagerGetSecurityInfoByKey0(enginehandle: Handle, reserved: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerGetSecurityInfoByKey0((enginehandle?.value ?: 0L), (reserved?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun iPsecKeyManagerSetSecurityInfoByKey0(enginehandle: Handle, reserved: COpaquePointer?, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerSetSecurityInfoByKey0((enginehandle?.value ?: 0L), (reserved?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun iPsecKeyManagerUnregisterAndDelete0(enginehandle: Handle, keymgmthandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagerUnregisterAndDelete0((enginehandle?.value ?: 0L), (keymgmthandle?.value ?: 0L)).toUInt()

public actual fun iPsecKeyManagersGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecKeyManagersGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextAddInbound0(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound0((enginehandle?.value ?: 0L), id.toLong(), (inboundbundle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextAddInbound1(enginehandle: Handle, id: ULong, inboundbundle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddInbound1((enginehandle?.value ?: 0L), id.toLong(), (inboundbundle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextAddOutbound0(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound0((enginehandle?.value ?: 0L), id.toLong(), (outboundbundle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextAddOutbound1(enginehandle: Handle, id: ULong, outboundbundle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextAddOutbound1((enginehandle?.value ?: 0L), id.toLong(), (outboundbundle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextCreate0(enginehandle: Handle, outboundtraffic: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate0((enginehandle?.value ?: 0L), (outboundtraffic?.value ?: 0L), (inboundfilterid?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextCreate1(enginehandle: Handle, outboundtraffic: COpaquePointer?, virtualiftunnelinfo: COpaquePointer?, inboundfilterid: COpaquePointer?, id: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreate1((enginehandle?.value ?: 0L), (outboundtraffic?.value ?: 0L), (virtualiftunnelinfo?.value ?: 0L), (inboundfilterid?.value ?: 0L), (id?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextDeleteById0((enginehandle?.value ?: 0L), id.toLong()).toUInt()

public actual fun iPsecSaContextDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextEnum1((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextExpire0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextExpire0((enginehandle?.value ?: 0L), id.toLong()).toUInt()

public actual fun iPsecSaContextGetById0(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById0((enginehandle?.value ?: 0L), id.toLong(), (sacontext?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextGetById1(enginehandle: Handle, id: ULong, sacontext: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetById1((enginehandle?.value ?: 0L), id.toLong(), (sacontext?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextGetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi0((enginehandle?.value ?: 0L), id.toLong(), (getspi?.value ?: 0L), (inboundspi?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextGetSpi1(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextGetSpi1((enginehandle?.value ?: 0L), id.toLong(), (getspi?.value ?: 0L), (inboundspi?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextSetSpi0(enginehandle: Handle, id: ULong, getspi: COpaquePointer?, inboundspi: UInt): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSetSpi0((enginehandle?.value ?: 0L), id.toLong(), (getspi?.value ?: 0L), inboundspi.toInt()).toUInt()

public actual fun iPsecSaContextSubscribe0(enginehandle: Handle, subscription: COpaquePointer?, callback: IpsecSaContextCallback0, context: COpaquePointer?, eventshandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSubscribe0((enginehandle?.value ?: 0L), (subscription?.value ?: 0L), 0L, (context?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextSubscriptionsGet0(enginehandle: Handle, entries: COpaquePointer?, numentries: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextSubscriptionsGet0((enginehandle?.value ?: 0L), (entries?.value ?: 0L), (numentries?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextUnsubscribe0(enginehandle: Handle, eventshandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextUnsubscribe0((enginehandle?.value ?: 0L), (eventshandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaContextUpdate0(enginehandle: Handle, flags: ULong, newvalues: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaContextUpdate0((enginehandle?.value ?: 0L), flags.toLong(), (newvalues?.value ?: 0L)).toUInt()

public actual fun iPsecSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDbGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun iPsecSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDbSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun iPsecSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun iPsecSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun iPsecSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_iPsecSaEnum1((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun ikeextGetStatistics0(enginehandle: Handle, ikeextstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextGetStatistics0((enginehandle?.value ?: 0L), (ikeextstatistics?.value ?: 0L)).toUInt()

public actual fun ikeextGetStatistics1(enginehandle: Handle, ikeextstatistics: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextGetStatistics1((enginehandle?.value ?: 0L), (ikeextstatistics?.value ?: 0L)).toUInt()

public actual fun ikeextSaCreateEnumHandle0(enginehandle: Handle, enumtemplate: COpaquePointer?, enumhandle: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaCreateEnumHandle0((enginehandle?.value ?: 0L), (enumtemplate?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun ikeextSaDbGetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?, securitydescriptor: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDbGetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L), (securitydescriptor?.value ?: 0L)).toUInt()

public actual fun ikeextSaDbSetSecurityInfo0(enginehandle: Handle, securityinfo: UInt, sidowner: COpaquePointer?, sidgroup: COpaquePointer?, dacl: COpaquePointer?, sacl: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDbSetSecurityInfo0((enginehandle?.value ?: 0L), securityinfo.toInt(), (sidowner?.value ?: 0L), (sidgroup?.value ?: 0L), (dacl?.value ?: 0L), (sacl?.value ?: 0L)).toUInt()

public actual fun ikeextSaDeleteById0(enginehandle: Handle, id: ULong): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDeleteById0((enginehandle?.value ?: 0L), id.toLong()).toUInt()

public actual fun ikeextSaDestroyEnumHandle0(enginehandle: Handle, enumhandle: Handle): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaDestroyEnumHandle0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L)).toUInt()

public actual fun ikeextSaEnum0(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum0((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun ikeextSaEnum1(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum1((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun ikeextSaEnum2(enginehandle: Handle, enumhandle: Handle, numentriesrequested: UInt, entries: COpaquePointer?, numentriesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaEnum2((enginehandle?.value ?: 0L), (enumhandle?.value ?: 0L), numentriesrequested.toInt(), (entries?.value ?: 0L), (numentriesreturned?.value ?: 0L)).toUInt()

public actual fun ikeextSaGetById0(enginehandle: Handle, id: ULong, sa: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById0((enginehandle?.value ?: 0L), id.toLong(), (sa?.value ?: 0L)).toUInt()

public actual fun ikeextSaGetById1(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById1((enginehandle?.value ?: 0L), id.toLong(), (salookupcontext?.value ?: 0L), (sa?.value ?: 0L)).toUInt()

public actual fun ikeextSaGetById2(enginehandle: Handle, id: ULong, salookupcontext: COpaquePointer?, sa: COpaquePointer?): UInt =
    WindowsWin32NetworkmanagementWindowsfilteringplatformJniBridge.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_ikeextSaGetById2((enginehandle?.value ?: 0L), id.toLong(), (salookupcontext?.value ?: 0L), (sa?.value ?: 0L)).toUInt()
