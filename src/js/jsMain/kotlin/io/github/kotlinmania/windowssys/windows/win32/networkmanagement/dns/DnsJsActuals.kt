@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private val _windowsWin32NetworkmanagementDnsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(credentialflags.toInt(), credentials.toString(), pcontext.toString()) as Int) else 0

public actual fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(credentialflags.toInt(), credentials.toString(), pcontext.toString()) as Int) else 0

public actual fun DnsCancelQuery(pcancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(pcancelhandle.toString()) as Int) else 0

public actual fun DnsCancelQueryRaw(cancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(cancelhandle.toString()) as Int) else 0

public actual fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(policyentrytag) as Int).toUInt() else 0u

public actual fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(pwszconnectionname.toString(), type) as Int).toUInt() else 0u

public actual fun DnsConnectionFreeNameList(pnamelist: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(pnamelist.toString())
    }
}

public actual fun DnsConnectionFreeProxyInfo(pproxyinfo: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(pproxyinfo.toString())
    }
}

public actual fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(pproxyinfoex.toString())
    }
}

public actual fun DnsConnectionFreeProxyList(pproxylist: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(pproxylist.toString())
    }
}

public actual fun DnsConnectionGetNameList(pnamelist: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(pnamelist.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(pwszconnectionname.toString(), type, pproxyinfo.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(pwszhosturl.toString(), pselectioncontext.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pproxyinfoex.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.toString(), pselectioncontext.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pwszconnectionname.toString(), pproxyinfoex.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(pwszconnectionname.toString(), pproxylist.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(pwszconnectionname.toString(), type, pproxyinfo.toString()) as Int).toUInt() else 0u

public actual fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(pconnectionifindexentries.toString()) as Int).toUInt() else 0u

public actual fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(pdnsbuffer.toString(), wmessagelength.toInt(), pprecord.toString()) as Int) else 0

public actual fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(pdnsbuffer.toString(), wmessagelength.toInt(), pprecord.toString()) as Int) else 0

public actual fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsFree(pdata.toString(), freetype)
    }
}

public actual fun DnsFreeCustomServers(pcservers: Long, ppservers: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(pcservers.toString(), ppservers.toString())
    }
}

public actual fun DnsFreeProxyName(proxyname: PCWSTR) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(proxyname.toString())
    }
}

public actual fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(pcservers.toString(), ppdefaultservers.toString(), psettings.toString()) as Int).toUInt() else 0u

public actual fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(hostname.toString(), proxyinformation.toString(), defaultproxyinformation.toString(), completionroutine.toLong().toString(), completioncontext.toString()) as Int).toUInt() else 0u

public actual fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(paddrecords.toString(), pdeleterecords.toString(), options.toInt(), hcredentials.toString(), pextralist.toString(), preserved.toString()) as Int) else 0

public actual fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(paddrecords.toString(), pdeleterecords.toString(), options.toInt(), hcredentials.toString(), pextralist.toString(), preserved.toString()) as Int) else 0

public actual fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(paddrecords.toString(), pdeleterecords.toString(), options.toInt(), hcredentials.toString(), pextralist.toString(), preserved.toString()) as Int) else 0

public actual fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(pname1.toString(), pname2.toString()) as Int) else 0

public actual fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(pname1.toString(), pname2.toString()) as Int) else 0

public actual fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(config, flag.toInt(), pwsadaptername.toString(), preserved.toString(), pbuffer.toString(), pbuflen.toString()) as Int) else 0

public actual fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(pqueryrequest.toString(), pqueryresults.toString(), pcancelhandle.toString()) as Int) else 0

public actual fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(queryrequest.toString(), cancelhandle.toString()) as Int) else 0

public actual fun DnsQueryRawResultFree(queryresults: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(queryresults.toString())
    }
}

public actual fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(pszname.toString(), wtype.toInt(), options.toInt(), pextra.toString(), ppqueryresults.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(pszname.toString(), wtype.toInt(), options.toInt(), pextra.toString(), ppqueryresults.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(pszname.toString(), wtype.toInt(), options.toInt(), pextra.toString(), ppqueryresults.toString(), preserved.toString()) as Int).toUInt() else 0u

public actual fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(precord1.toString(), precord2.toString()) as Int) else 0

public actual fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(precord.toString(), charsetin, charsetout) as String).toLong() else 0L

public actual fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(prr1.toString(), prr2.toString(), ppdiff1.toString(), ppdiff2.toString()) as Int) else 0

public actual fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(precordset.toString(), charsetin, charsetout) as String).toLong() else 0L

public actual fun DnsRecordSetDetach(precordlist: Long): Long =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(precordlist.toString()) as String).toLong() else 0L

public actual fun DnsReleaseContextHandle(hcontext: HANDLE) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(hcontext.toString())
    }
}

public actual fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(preplaceset.toString(), options.toInt(), hcontext.toString(), pextrainfo.toString(), preserved.toString()) as Int) else 0

public actual fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(preplaceset.toString(), options.toInt(), hcontext.toString(), pextrainfo.toString(), preserved.toString()) as Int) else 0

public actual fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(preplaceset.toString(), options.toInt(), hcontext.toString(), pextrainfo.toString(), preserved.toString()) as Int) else 0

public actual fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(prequest.toString(), pcancel.toString()) as Int) else 0

public actual fun DnsServiceBrowseCancel(pcancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(pcancelhandle.toString()) as Int) else 0

public actual fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(pservicename.toString(), phostname.toString(), pip4.toString(), pip6.toString(), wport.toInt(), wpriority.toInt(), wweight.toInt(), dwpropertiescount.toInt(), keys.toString(), values.toString()) as String).toLong() else 0L

public actual fun DnsServiceCopyInstance(porig: Long): Long =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(porig.toString()) as String).toLong() else 0L

public actual fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(prequest.toString(), pcancel.toString()) as Int).toUInt() else 0u

public actual fun DnsServiceFreeInstance(pinstance: Long) {
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) {
        _windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(pinstance.toString())
    }
}

public actual fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(prequest.toString(), pcancel.toString()) as Int).toUInt() else 0u

public actual fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(pcancelhandle.toString()) as Int).toUInt() else 0u

public actual fun DnsServiceResolve(prequest: Long, pcancel: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(prequest.toString(), pcancel.toString()) as Int) else 0

public actual fun DnsServiceResolveCancel(pcancelhandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(pcancelhandle.toString()) as Int) else 0

public actual fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(cservers.toInt(), pservers.toString(), psettings.toString()) as Int).toUInt() else 0u

public actual fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(pqueryrequest.toString(), phandle.toString()) as Int) else 0

public actual fun DnsStopMulticastQuery(phandle: Long): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(phandle.toString()) as Int) else 0

public actual fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(pszname.toString(), format) as Int) else 0

public actual fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(pszname.toString(), format) as Int) else 0

public actual fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(pszname.toString(), format) as Int) else 0

public actual fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(pdnsbuffer.toString(), pdwbuffersize.toString(), pszname.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) as Int) else 0

public actual fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    if (_windowsWin32NetworkmanagementDnsNapiAddon != null) (_windowsWin32NetworkmanagementDnsNapiAddon.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(pdnsbuffer.toString(), pdwbuffersize.toString(), pszname.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) as Int) else 0
