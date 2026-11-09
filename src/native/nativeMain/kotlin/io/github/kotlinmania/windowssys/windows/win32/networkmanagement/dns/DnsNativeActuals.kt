@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(credentialflags, credentials.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(credentialflags, credentials.toCPointer<ByteVar>(), pcontext.toCPointer<ByteVar>())

public actual fun DnsCancelQuery(pcancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(pcancelhandle.toCPointer<ByteVar>())

public actual fun DnsCancelQueryRaw(cancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(cancelhandle.toCPointer<ByteVar>())

public actual fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(policyentrytag)

public actual fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(pwszconnectionname.toCPointer<ByteVar>(), type)

public actual fun DnsConnectionFreeNameList(pnamelist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(pnamelist.toCPointer<ByteVar>())
}

public actual fun DnsConnectionFreeProxyInfo(pproxyinfo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(pproxyinfo.toCPointer<ByteVar>())
}

public actual fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(pproxyinfoex.toCPointer<ByteVar>())
}

public actual fun DnsConnectionFreeProxyList(pproxylist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(pproxylist.toCPointer<ByteVar>())
}

public actual fun DnsConnectionGetNameList(pnamelist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(pnamelist.toCPointer<ByteVar>())

public actual fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(pwszconnectionname.toCPointer<ByteVar>(), type, pproxyinfo.toCPointer<ByteVar>())

public actual fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(pwszhosturl.toCPointer<ByteVar>(), pselectioncontext.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pproxyinfoex.toCPointer<ByteVar>())

public actual fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.toCPointer<ByteVar>(), pselectioncontext.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pwszconnectionname.toCPointer<ByteVar>(), pproxyinfoex.toCPointer<ByteVar>())

public actual fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(pwszconnectionname.toCPointer<ByteVar>(), pproxylist.toCPointer<ByteVar>())

public actual fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.toCPointer<ByteVar>())

public actual fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(pwszconnectionname.toCPointer<ByteVar>(), type, pproxyinfo.toCPointer<ByteVar>())

public actual fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(pconnectionifindexentries.toCPointer<ByteVar>())

public actual fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(pdnsbuffer.toCPointer<ByteVar>(), wmessagelength, pprecord.toCPointer<ByteVar>())

public actual fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(pdnsbuffer.toCPointer<ByteVar>(), wmessagelength, pprecord.toCPointer<ByteVar>())

public actual fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsFree(pdata.toCPointer<ByteVar>(), freetype)
}

public actual fun DnsFreeCustomServers(pcservers: Long, ppservers: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(pcservers.toCPointer<ByteVar>(), ppservers.toCPointer<ByteVar>())
}

public actual fun DnsFreeProxyName(proxyname: PCWSTR) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(proxyname.toCPointer<ByteVar>())
}

public actual fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(pcservers.toCPointer<ByteVar>(), ppdefaultservers.toCPointer<ByteVar>(), psettings.toCPointer<ByteVar>())

public actual fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(hostname.toCPointer<ByteVar>(), proxyinformation.toCPointer<ByteVar>(), defaultproxyinformation.toCPointer<ByteVar>(), completionroutine.toLong().toCPointer<ByteVar>(), completioncontext.toCPointer<ByteVar>())

public actual fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(paddrecords.toCPointer<ByteVar>(), pdeleterecords.toCPointer<ByteVar>(), options, hcredentials.toCPointer<ByteVar>(), pextralist.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(paddrecords.toCPointer<ByteVar>(), pdeleterecords.toCPointer<ByteVar>(), options, hcredentials.toCPointer<ByteVar>(), pextralist.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(paddrecords.toCPointer<ByteVar>(), pdeleterecords.toCPointer<ByteVar>(), options, hcredentials.toCPointer<ByteVar>(), pextralist.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(pname1.toCPointer<ByteVar>(), pname2.toCPointer<ByteVar>())

public actual fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(pname1.toCPointer<ByteVar>(), pname2.toCPointer<ByteVar>())

public actual fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(config, flag, pwsadaptername.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), pbuflen.toCPointer<ByteVar>())

public actual fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(pqueryrequest.toCPointer<ByteVar>(), pqueryresults.toCPointer<ByteVar>(), pcancelhandle.toCPointer<ByteVar>())

public actual fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(queryrequest.toCPointer<ByteVar>(), cancelhandle.toCPointer<ByteVar>())

public actual fun DnsQueryRawResultFree(queryresults: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(queryresults.toCPointer<ByteVar>())
}

public actual fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(pszname.toCPointer<ByteVar>(), wtype, options, pextra.toCPointer<ByteVar>(), ppqueryresults.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(pszname.toCPointer<ByteVar>(), wtype, options, pextra.toCPointer<ByteVar>(), ppqueryresults.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(pszname.toCPointer<ByteVar>(), wtype, options, pextra.toCPointer<ByteVar>(), ppqueryresults.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(precord1.toCPointer<ByteVar>(), precord2.toCPointer<ByteVar>())

public actual fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(precord.toCPointer<ByteVar>(), charsetin, charsetout)?.toLong() ?: 0L

public actual fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(prr1.toCPointer<ByteVar>(), prr2.toCPointer<ByteVar>(), ppdiff1.toCPointer<ByteVar>(), ppdiff2.toCPointer<ByteVar>())

public actual fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(precordset.toCPointer<ByteVar>(), charsetin, charsetout)?.toLong() ?: 0L

public actual fun DnsRecordSetDetach(precordlist: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(precordlist.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DnsReleaseContextHandle(hcontext: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(hcontext.toCPointer<ByteVar>())
}

public actual fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(preplaceset.toCPointer<ByteVar>(), options, hcontext.toCPointer<ByteVar>(), pextrainfo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(preplaceset.toCPointer<ByteVar>(), options, hcontext.toCPointer<ByteVar>(), pextrainfo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(preplaceset.toCPointer<ByteVar>(), options, hcontext.toCPointer<ByteVar>(), pextrainfo.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(prequest.toCPointer<ByteVar>(), pcancel.toCPointer<ByteVar>())

public actual fun DnsServiceBrowseCancel(pcancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(pcancelhandle.toCPointer<ByteVar>())

public actual fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(pservicename.toCPointer<ByteVar>(), phostname.toCPointer<ByteVar>(), pip4.toCPointer<ByteVar>(), pip6.toCPointer<ByteVar>(), wport, wpriority, wweight, dwpropertiescount, keys.toCPointer<ByteVar>(), values.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DnsServiceCopyInstance(porig: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(porig.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(prequest.toCPointer<ByteVar>(), pcancel.toCPointer<ByteVar>())

public actual fun DnsServiceFreeInstance(pinstance: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(pinstance.toCPointer<ByteVar>())
}

public actual fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(prequest.toCPointer<ByteVar>(), pcancel.toCPointer<ByteVar>())

public actual fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(pcancelhandle.toCPointer<ByteVar>())

public actual fun DnsServiceResolve(prequest: Long, pcancel: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(prequest.toCPointer<ByteVar>(), pcancel.toCPointer<ByteVar>())

public actual fun DnsServiceResolveCancel(pcancelhandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(pcancelhandle.toCPointer<ByteVar>())

public actual fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(cservers, pservers.toCPointer<ByteVar>(), psettings.toCPointer<ByteVar>())

public actual fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(pqueryrequest.toCPointer<ByteVar>(), phandle.toCPointer<ByteVar>())

public actual fun DnsStopMulticastQuery(phandle: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(phandle.toCPointer<ByteVar>())

public actual fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(pszname.toCPointer<ByteVar>(), format)

public actual fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(pszname.toCPointer<ByteVar>(), format)

public actual fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(pszname.toCPointer<ByteVar>(), format)

public actual fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(pdnsbuffer.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)

public actual fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(pdnsbuffer.toCPointer<ByteVar>(), pdwbuffersize.toCPointer<ByteVar>(), pszname.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)
