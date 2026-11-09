@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public actual fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    0

public actual fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    0

public actual fun DnsCancelQuery(pcancelhandle: Long): Int =
    0

public actual fun DnsCancelQueryRaw(cancelhandle: Long): Int =
    0

public actual fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt =
    0u

public actual fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt =
    0u

public actual fun DnsConnectionFreeNameList(pnamelist: Long) {
}

public actual fun DnsConnectionFreeProxyInfo(pproxyinfo: Long) {
}

public actual fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long) {
}

public actual fun DnsConnectionFreeProxyList(pproxylist: Long) {
}

public actual fun DnsConnectionGetNameList(pnamelist: Long): UInt =
    0u

public actual fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    0u

public actual fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt =
    0u

public actual fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt =
    0u

public actual fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt =
    0u

public actual fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt =
    0u

public actual fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    0u

public actual fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt =
    0u

public actual fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    0

public actual fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    0

public actual fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE) {
}

public actual fun DnsFreeCustomServers(pcservers: Long, ppservers: Long) {
}

public actual fun DnsFreeProxyName(proxyname: PCWSTR) {
}

public actual fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt =
    0u

public actual fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt =
    0u

public actual fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    0

public actual fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    0

public actual fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    0

public actual fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL =
    0

public actual fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL =
    0

public actual fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int =
    0

public actual fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int =
    0

public actual fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int =
    0

public actual fun DnsQueryRawResultFree(queryresults: Long) {
}

public actual fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    0u

public actual fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    0u

public actual fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    0u

public actual fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL =
    0

public actual fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    0L

public actual fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL =
    0

public actual fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    0L

public actual fun DnsRecordSetDetach(precordlist: Long): Long =
    0L

public actual fun DnsReleaseContextHandle(hcontext: HANDLE) {
}

public actual fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    0

public actual fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    0

public actual fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    0

public actual fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int =
    0

public actual fun DnsServiceBrowseCancel(pcancelhandle: Long): Int =
    0

public actual fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long =
    0L

public actual fun DnsServiceCopyInstance(porig: Long): Long =
    0L

public actual fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt =
    0u

public actual fun DnsServiceFreeInstance(pinstance: Long) {
}

public actual fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt =
    0u

public actual fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt =
    0u

public actual fun DnsServiceResolve(prequest: Long, pcancel: Long): Int =
    0

public actual fun DnsServiceResolveCancel(pcancelhandle: Long): Int =
    0

public actual fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt =
    0u

public actual fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int =
    0

public actual fun DnsStopMulticastQuery(phandle: Long): Int =
    0

public actual fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    0

public actual fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    0

public actual fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int =
    0

public actual fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    0

public actual fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    0
