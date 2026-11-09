@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun FwpmCalloutAdd0(enginehandle: HANDLE, callout: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutAdd0(enginehandle.toCPointer<ByteVar>(), callout.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmCalloutCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmCalloutDeleteById0(enginehandle: HANDLE, id: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteById0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun FwpmCalloutDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmCalloutDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmCalloutEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmCalloutGetById0(enginehandle: HANDLE, id: UInt, callout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetById0(enginehandle.toCPointer<ByteVar>(), id, callout.toCPointer<ByteVar>())

public actual fun FwpmCalloutGetByKey0(enginehandle: HANDLE, key: Long, callout: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), callout.toCPointer<ByteVar>())

public actual fun FwpmCalloutGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmCalloutSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmCalloutSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CALLOUT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscribeChanges0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmCalloutSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmCalloutUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmCalloutUnsubscribeChanges0(enginehandle.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmConnectionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmConnectionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmConnectionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmConnectionGetById0(enginehandle: HANDLE, id: ULong, connection: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetById0(enginehandle.toCPointer<ByteVar>(), id, connection.toCPointer<ByteVar>())

public actual fun FwpmConnectionGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmConnectionSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmConnectionSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_CONNECTION_CALLBACK0, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionSubscribe0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmConnectionUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmConnectionUnsubscribe0(enginehandle.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmDynamicKeywordSubscribe0(flags: UInt, callback: FWPM_DYNAMIC_KEYWORD_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordSubscribe0(flags, callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), subscriptionhandle.toCPointer<ByteVar>())

public actual fun FwpmDynamicKeywordUnsubscribe0(subscriptionhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmDynamicKeywordUnsubscribe0(subscriptionhandle.toCPointer<ByteVar>())

public actual fun FwpmEngineClose0(enginehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineClose0(enginehandle.toCPointer<ByteVar>())

public actual fun FwpmEngineGetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, value: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetOption0(enginehandle.toCPointer<ByteVar>(), option, value.toCPointer<ByteVar>())

public actual fun FwpmEngineGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmEngineOpen0(servername: PCWSTR, authnservice: UInt, authidentity: Long, session: Long, enginehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineOpen0(servername.toCPointer<ByteVar>(), authnservice, authidentity.toCPointer<ByteVar>(), session.toCPointer<ByteVar>(), enginehandle.toCPointer<ByteVar>())

public actual fun FwpmEngineSetOption0(enginehandle: HANDLE, option: FWPM_ENGINE_OPTION, newvalue: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetOption0(enginehandle.toCPointer<ByteVar>(), option, newvalue.toCPointer<ByteVar>())

public actual fun FwpmEngineSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmEngineSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmFilterAdd0(enginehandle: HANDLE, filter: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterAdd0(enginehandle.toCPointer<ByteVar>(), filter.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmFilterCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmFilterDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteById0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun FwpmFilterDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmFilterDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmFilterEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmFilterGetById0(enginehandle: HANDLE, id: ULong, filter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetById0(enginehandle.toCPointer<ByteVar>(), id, filter.toCPointer<ByteVar>())

public actual fun FwpmFilterGetByKey0(enginehandle: HANDLE, key: Long, filter: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), filter.toCPointer<ByteVar>())

public actual fun FwpmFilterGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmFilterSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmFilterSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_FILTER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscribeChanges0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmFilterSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmFilterUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFilterUnsubscribeChanges0(enginehandle.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmFreeMemory0(p: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmFreeMemory0(p.toCPointer<ByteVar>())
}

public actual fun FwpmGetAppIdFromFileName0(filename: PCWSTR, appid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmGetAppIdFromFileName0(filename.toCPointer<ByteVar>(), appid.toCPointer<ByteVar>())

public actual fun FwpmIPsecTunnelAdd0(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd0(enginehandle.toCPointer<ByteVar>(), flags, mainmodepolicy.toCPointer<ByteVar>(), tunnelpolicy.toCPointer<ByteVar>(), numfilterconditions, filterconditions.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmIPsecTunnelAdd1(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd1(enginehandle.toCPointer<ByteVar>(), flags, mainmodepolicy.toCPointer<ByteVar>(), tunnelpolicy.toCPointer<ByteVar>(), numfilterconditions, filterconditions.toCPointer<ByteVar>(), keymodkey.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmIPsecTunnelAdd2(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd2(enginehandle.toCPointer<ByteVar>(), flags, mainmodepolicy.toCPointer<ByteVar>(), tunnelpolicy.toCPointer<ByteVar>(), numfilterconditions, filterconditions.toCPointer<ByteVar>(), keymodkey.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmIPsecTunnelAdd3(enginehandle: HANDLE, flags: UInt, mainmodepolicy: Long, tunnelpolicy: Long, numfilterconditions: UInt, filterconditions: Long, keymodkey: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelAdd3(enginehandle.toCPointer<ByteVar>(), flags, mainmodepolicy.toCPointer<ByteVar>(), tunnelpolicy.toCPointer<ByteVar>(), numfilterconditions, filterconditions.toCPointer<ByteVar>(), keymodkey.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmIPsecTunnelDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmIPsecTunnelDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmLayerGetById0(enginehandle: HANDLE, id: UShort, layer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetById0(enginehandle.toCPointer<ByteVar>(), id, layer.toCPointer<ByteVar>())

public actual fun FwpmLayerGetByKey0(enginehandle: HANDLE, key: Long, layer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), layer.toCPointer<ByteVar>())

public actual fun FwpmLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmLayerSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmNetEventCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum1(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum2(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum3(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum4(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum4(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventEnum5(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventEnum5(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscribe1(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK1, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe1(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscribe2(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK2, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe2(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscribe3(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK3, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe3(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscribe4(enginehandle: HANDLE, subscription: Long, callback: FWPM_NET_EVENT_CALLBACK4, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscribe4(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmNetEventUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventUnsubscribe0(enginehandle.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun FwpmNetEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmNetEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmNetEventsSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmProviderAdd0(enginehandle: HANDLE, provider: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderAdd0(enginehandle.toCPointer<ByteVar>(), provider.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmProviderContextAdd0(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd0(enginehandle.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmProviderContextAdd1(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd1(enginehandle.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmProviderContextAdd2(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd2(enginehandle.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmProviderContextAdd3(enginehandle: HANDLE, providercontext: Long, sd: PSECURITY_DESCRIPTOR, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextAdd3(enginehandle.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun FwpmProviderContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmProviderContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteById0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun FwpmProviderContextDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmProviderContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmProviderContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmProviderContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum1(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmProviderContextEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum2(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmProviderContextEnum3(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextEnum3(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetById0(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById0(enginehandle.toCPointer<ByteVar>(), id, providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetById1(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById1(enginehandle.toCPointer<ByteVar>(), id, providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetById2(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById2(enginehandle.toCPointer<ByteVar>(), id, providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetById3(enginehandle: HANDLE, id: ULong, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetById3(enginehandle.toCPointer<ByteVar>(), id, providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetByKey0(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetByKey1(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey1(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetByKey2(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey2(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetByKey3(enginehandle: HANDLE, key: Long, providercontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetByKey3(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), providercontext.toCPointer<ByteVar>())

public actual fun FwpmProviderContextGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmProviderContextSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmProviderContextSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CONTEXT_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscribeChanges0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmProviderContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmProviderContextUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderContextUnsubscribeChanges0(enginehandle.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmProviderCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmProviderDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmProviderDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmProviderEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmProviderGetByKey0(enginehandle: HANDLE, key: Long, provider: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), provider.toCPointer<ByteVar>())

public actual fun FwpmProviderGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmProviderSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmProviderSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_PROVIDER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscribeChanges0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmProviderSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmProviderUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmProviderUnsubscribeChanges0(enginehandle.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmSessionCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmSessionDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmSessionEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSessionEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmSubLayerAdd0(enginehandle: HANDLE, sublayer: Long, sd: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerAdd0(enginehandle.toCPointer<ByteVar>(), sublayer.toCPointer<ByteVar>(), sd.toCPointer<ByteVar>())

public actual fun FwpmSubLayerCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmSubLayerDeleteByKey0(enginehandle: HANDLE, key: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDeleteByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>())

public actual fun FwpmSubLayerDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun FwpmSubLayerEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun FwpmSubLayerGetByKey0(enginehandle: HANDLE, key: Long, sublayer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), sublayer.toCPointer<ByteVar>())

public actual fun FwpmSubLayerGetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmSubLayerSetSecurityInfoByKey0(enginehandle: HANDLE, key: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), key.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun FwpmSubLayerSubscribeChanges0(enginehandle: HANDLE, subscription: Long, callback: FWPM_SUBLAYER_CHANGE_CALLBACK0, context: Long, changehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscribeChanges0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmSubLayerSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun FwpmSubLayerUnsubscribeChanges0(enginehandle: HANDLE, changehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSubLayerUnsubscribeChanges0(enginehandle.toCPointer<ByteVar>(), changehandle.toCPointer<ByteVar>())

public actual fun FwpmSystemPortsGet0(enginehandle: HANDLE, sysports: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsGet0(enginehandle.toCPointer<ByteVar>(), sysports.toCPointer<ByteVar>())

public actual fun FwpmSystemPortsSubscribe0(enginehandle: HANDLE, reserved: Long, callback: FWPM_SYSTEM_PORTS_CALLBACK0, context: Long, sysportshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsSubscribe0(enginehandle.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), sysportshandle.toCPointer<ByteVar>())

public actual fun FwpmSystemPortsUnsubscribe0(enginehandle: HANDLE, sysportshandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmSystemPortsUnsubscribe0(enginehandle.toCPointer<ByteVar>(), sysportshandle.toCPointer<ByteVar>())

public actual fun FwpmTransactionAbort0(enginehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionAbort0(enginehandle.toCPointer<ByteVar>())

public actual fun FwpmTransactionBegin0(enginehandle: HANDLE, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionBegin0(enginehandle.toCPointer<ByteVar>(), flags)

public actual fun FwpmTransactionCommit0(enginehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmTransactionCommit0(enginehandle.toCPointer<ByteVar>())

public actual fun FwpmvSwitchEventSubscribe0(enginehandle: HANDLE, subscription: Long, callback: FWPM_VSWITCH_EVENT_CALLBACK0, context: Long, subscriptionhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventSubscribe0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), subscriptionhandle.toCPointer<ByteVar>())

public actual fun FwpmvSwitchEventUnsubscribe0(enginehandle: HANDLE, subscriptionhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventUnsubscribe0(enginehandle.toCPointer<ByteVar>(), subscriptionhandle.toCPointer<ByteVar>())

public actual fun FwpmvSwitchEventsGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun FwpmvSwitchEventsSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_FwpmvSwitchEventsSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun IPsecDospGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun IPsecDospGetStatistics0(enginehandle: HANDLE, idpstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospGetStatistics0(enginehandle.toCPointer<ByteVar>(), idpstatistics.toCPointer<ByteVar>())

public actual fun IPsecDospSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun IPsecDospStateCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecDospStateDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecDospStateEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecDospStateEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun IPsecGetStatistics0(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics0(enginehandle.toCPointer<ByteVar>(), ipsecstatistics.toCPointer<ByteVar>())

public actual fun IPsecGetStatistics1(enginehandle: HANDLE, ipsecstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecGetStatistics1(enginehandle.toCPointer<ByteVar>(), ipsecstatistics.toCPointer<ByteVar>())

public actual fun IPsecKeyManagerAddAndRegister0(enginehandle: HANDLE, keymanager: Long, keymanagercallbacks: Long, keymgmthandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerAddAndRegister0(enginehandle.toCPointer<ByteVar>(), keymanager.toCPointer<ByteVar>(), keymanagercallbacks.toCPointer<ByteVar>(), keymgmthandle.toCPointer<ByteVar>())

public actual fun IPsecKeyManagerGetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerGetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun IPsecKeyManagerSetSecurityInfoByKey0(enginehandle: HANDLE, reserved: Long, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerSetSecurityInfoByKey0(enginehandle.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun IPsecKeyManagerUnregisterAndDelete0(enginehandle: HANDLE, keymgmthandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagerUnregisterAndDelete0(enginehandle.toCPointer<ByteVar>(), keymgmthandle.toCPointer<ByteVar>())

public actual fun IPsecKeyManagersGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecKeyManagersGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun IPsecSaContextAddInbound0(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound0(enginehandle.toCPointer<ByteVar>(), id, inboundbundle.toCPointer<ByteVar>())

public actual fun IPsecSaContextAddInbound1(enginehandle: HANDLE, id: ULong, inboundbundle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddInbound1(enginehandle.toCPointer<ByteVar>(), id, inboundbundle.toCPointer<ByteVar>())

public actual fun IPsecSaContextAddOutbound0(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound0(enginehandle.toCPointer<ByteVar>(), id, outboundbundle.toCPointer<ByteVar>())

public actual fun IPsecSaContextAddOutbound1(enginehandle: HANDLE, id: ULong, outboundbundle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextAddOutbound1(enginehandle.toCPointer<ByteVar>(), id, outboundbundle.toCPointer<ByteVar>())

public actual fun IPsecSaContextCreate0(enginehandle: HANDLE, outboundtraffic: Long, inboundfilterid: Long, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate0(enginehandle.toCPointer<ByteVar>(), outboundtraffic.toCPointer<ByteVar>(), inboundfilterid.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun IPsecSaContextCreate1(enginehandle: HANDLE, outboundtraffic: Long, virtualiftunnelinfo: Long, inboundfilterid: Long, id: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreate1(enginehandle.toCPointer<ByteVar>(), outboundtraffic.toCPointer<ByteVar>(), virtualiftunnelinfo.toCPointer<ByteVar>(), inboundfilterid.toCPointer<ByteVar>(), id.toCPointer<ByteVar>())

public actual fun IPsecSaContextCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecSaContextDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDeleteById0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun IPsecSaContextDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecSaContextEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IPsecSaContextEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextEnum1(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IPsecSaContextExpire0(enginehandle: HANDLE, id: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextExpire0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun IPsecSaContextGetById0(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById0(enginehandle.toCPointer<ByteVar>(), id, sacontext.toCPointer<ByteVar>())

public actual fun IPsecSaContextGetById1(enginehandle: HANDLE, id: ULong, sacontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetById1(enginehandle.toCPointer<ByteVar>(), id, sacontext.toCPointer<ByteVar>())

public actual fun IPsecSaContextGetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi0(enginehandle.toCPointer<ByteVar>(), id, getspi.toCPointer<ByteVar>(), inboundspi.toCPointer<ByteVar>())

public actual fun IPsecSaContextGetSpi1(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextGetSpi1(enginehandle.toCPointer<ByteVar>(), id, getspi.toCPointer<ByteVar>(), inboundspi.toCPointer<ByteVar>())

public actual fun IPsecSaContextSetSpi0(enginehandle: HANDLE, id: ULong, getspi: Long, inboundspi: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSetSpi0(enginehandle.toCPointer<ByteVar>(), id, getspi.toCPointer<ByteVar>(), inboundspi)

public actual fun IPsecSaContextSubscribe0(enginehandle: HANDLE, subscription: Long, callback: IPSEC_SA_CONTEXT_CALLBACK0, context: Long, eventshandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscribe0(enginehandle.toCPointer<ByteVar>(), subscription.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), context.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun IPsecSaContextSubscriptionsGet0(enginehandle: HANDLE, entries: Long, numentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextSubscriptionsGet0(enginehandle.toCPointer<ByteVar>(), entries.toCPointer<ByteVar>(), numentries.toCPointer<ByteVar>())

public actual fun IPsecSaContextUnsubscribe0(enginehandle: HANDLE, eventshandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUnsubscribe0(enginehandle.toCPointer<ByteVar>(), eventshandle.toCPointer<ByteVar>())

public actual fun IPsecSaContextUpdate0(enginehandle: HANDLE, flags: ULong, newvalues: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaContextUpdate0(enginehandle.toCPointer<ByteVar>(), flags, newvalues.toCPointer<ByteVar>())

public actual fun IPsecSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun IPsecSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDbSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun IPsecSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IPsecSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IPsecSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IPsecSaEnum1(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IkeextGetStatistics0(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics0(enginehandle.toCPointer<ByteVar>(), ikeextstatistics.toCPointer<ByteVar>())

public actual fun IkeextGetStatistics1(enginehandle: HANDLE, ikeextstatistics: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextGetStatistics1(enginehandle.toCPointer<ByteVar>(), ikeextstatistics.toCPointer<ByteVar>())

public actual fun IkeextSaCreateEnumHandle0(enginehandle: HANDLE, enumtemplate: Long, enumhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaCreateEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumtemplate.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IkeextSaDbGetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long, securitydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbGetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>())

public actual fun IkeextSaDbSetSecurityInfo0(enginehandle: HANDLE, securityinfo: UInt, sidowner: Long, sidgroup: Long, dacl: Long, sacl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDbSetSecurityInfo0(enginehandle.toCPointer<ByteVar>(), securityinfo, sidowner.toCPointer<ByteVar>(), sidgroup.toCPointer<ByteVar>(), dacl.toCPointer<ByteVar>(), sacl.toCPointer<ByteVar>())

public actual fun IkeextSaDeleteById0(enginehandle: HANDLE, id: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDeleteById0(enginehandle.toCPointer<ByteVar>(), id)

public actual fun IkeextSaDestroyEnumHandle0(enginehandle: HANDLE, enumhandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaDestroyEnumHandle0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>())

public actual fun IkeextSaEnum0(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum0(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IkeextSaEnum1(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum1(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IkeextSaEnum2(enginehandle: HANDLE, enumhandle: HANDLE, numentriesrequested: UInt, entries: Long, numentriesreturned: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaEnum2(enginehandle.toCPointer<ByteVar>(), enumhandle.toCPointer<ByteVar>(), numentriesrequested, entries.toCPointer<ByteVar>(), numentriesreturned.toCPointer<ByteVar>())

public actual fun IkeextSaGetById0(enginehandle: HANDLE, id: ULong, sa: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById0(enginehandle.toCPointer<ByteVar>(), id, sa.toCPointer<ByteVar>())

public actual fun IkeextSaGetById1(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById1(enginehandle.toCPointer<ByteVar>(), id, salookupcontext.toCPointer<ByteVar>(), sa.toCPointer<ByteVar>())

public actual fun IkeextSaGetById2(enginehandle: HANDLE, id: ULong, salookupcontext: Long, sa: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform.cinterop.windowssys_windows_win32_networkmanagement_windowsfilteringplatform_IkeextSaGetById2(enginehandle.toCPointer<ByteVar>(), id, salookupcontext.toCPointer<ByteVar>(), sa.toCPointer<ByteVar>())
