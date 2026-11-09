@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

private object WindowsWin32NetworkmanagementDnsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(credentialflags: Int, credentials: Long, pcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(cancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(policyentrytag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(pwszconnectionname: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(pnamelist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(pproxyinfo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(pproxylist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(pnamelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Long, pselectioncontext: Long, dwselectioncontextlength: Int, dwexplicitinterfaceindex: Int, pwszconnectionname: Long, pproxyinfoex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(pwszconnectionname: Long, pproxylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(policyentrytag: Int, ppolicyentrylist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(pwszconnectionname: Long, type: Int, pproxyinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: Short, pprecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsFree(pdata: Long, freetype: Int)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(pcservers: Long, ppservers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(proxyname: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(hostname: Long, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: Long, completioncontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: Int, hcredentials: Long, pextralist: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(pname1: Long, pname2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(config: Int, flag: Int, pwsadaptername: Long, preserved: Long, pbuffer: Long, pbuflen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(queryresults: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(pszname: Long, wtype: Short, options: Int, pextra: Long, ppqueryresults: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(precord1: Long, precord2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(precord: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(precordset: Long, charsetin: Int, charsetout: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(precordlist: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(hcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(preplaceset: Long, options: Int, hcontext: Long, pextrainfo: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(pservicename: Long, phostname: Long, pip4: Long, pip6: Long, wport: Short, wpriority: Short, wweight: Short, dwpropertiescount: Int, keys: Long, values: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(porig: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(pinstance: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(prequest: Long, pcancel: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(pcancelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(cservers: Int, pservers: Long, psettings: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(phandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(pszname: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: Long, wtype: Short, xid: Short, frecursiondesired: Int): Int
}

public actual fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_A(credentialflags.toInt(), credentials, pcontext)

public actual fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsAcquireContextHandle_W(credentialflags.toInt(), credentials, pcontext)

public actual fun DnsCancelQuery(pcancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsCancelQuery(pcancelhandle)

public actual fun DnsCancelQueryRaw(cancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsCancelQueryRaw(cancelhandle)

public actual fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeletePolicyEntries(policyentrytag).toUInt()

public actual fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionDeleteProxyInfo(pwszconnectionname, type).toUInt()

public actual fun DnsConnectionFreeNameList(pnamelist: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeNameList(pnamelist)
}

public actual fun DnsConnectionFreeProxyInfo(pproxyinfo: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfo(pproxyinfo)
}

public actual fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyInfoEx(pproxyinfoex)
}

public actual fun DnsConnectionFreeProxyList(pproxylist: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionFreeProxyList(pproxylist)
}

public actual fun DnsConnectionGetNameList(pnamelist: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetNameList(pnamelist).toUInt()

public actual fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfo(pwszconnectionname, type, pproxyinfo).toUInt()

public actual fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrl(pwszhosturl, pselectioncontext, dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pproxyinfoex).toUInt()

public actual fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl, pselectioncontext, dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pwszconnectionname, pproxyinfoex).toUInt()

public actual fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionGetProxyList(pwszconnectionname, pproxylist).toUInt()

public actual fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist).toUInt()

public actual fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionSetProxyInfo(pwszconnectionname, type, pproxyinfo).toUInt()

public actual fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsConnectionUpdateIfIndexTable(pconnectionifindexentries).toUInt()

public actual fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_UTF8(pdnsbuffer, wmessagelength.toShort(), pprecord)

public actual fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsExtractRecordsFromMessage_W(pdnsbuffer, wmessagelength.toShort(), pprecord)

public actual fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsFree(pdata, freetype)
}

public actual fun DnsFreeCustomServers(pcservers: Long, ppservers: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsFreeCustomServers(pcservers, ppservers)
}

public actual fun DnsFreeProxyName(proxyname: PCWSTR) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsFreeProxyName(proxyname)
}

public actual fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsGetApplicationSettings(pcservers, ppdefaultservers, psettings).toUInt()

public actual fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsGetProxyInformation(hostname, proxyinformation, defaultproxyinformation, completionroutine.toLong(), completioncontext).toUInt()

public actual fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_A(paddrecords, pdeleterecords, options.toInt(), hcredentials, pextralist, preserved)

public actual fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_UTF8(paddrecords, pdeleterecords, options.toInt(), hcredentials, pextralist, preserved)

public actual fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsModifyRecordsInSet_W(paddrecords, pdeleterecords, options.toInt(), hcredentials, pextralist, preserved)

public actual fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_A(pname1, pname2)

public actual fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsNameCompare_W(pname1, pname2)

public actual fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQueryConfig(config, flag.toInt(), pwsadaptername, preserved, pbuffer, pbuflen)

public actual fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQueryEx(pqueryrequest, pqueryresults, pcancelhandle)

public actual fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQueryRaw(queryrequest, cancelhandle)

public actual fun DnsQueryRawResultFree(queryresults: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQueryRawResultFree(queryresults)
}

public actual fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQuery_A(pszname, wtype.toShort(), options.toInt(), pextra, ppqueryresults, preserved).toUInt()

public actual fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQuery_UTF8(pszname, wtype.toShort(), options.toInt(), pextra, ppqueryresults, preserved).toUInt()

public actual fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsQuery_W(pszname, wtype.toShort(), options.toInt(), pextra, ppqueryresults, preserved).toUInt()

public actual fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsRecordCompare(precord1, precord2)

public actual fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsRecordCopyEx(precord, charsetin, charsetout)

public actual fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCompare(prr1, prr2, ppdiff1, ppdiff2)

public actual fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetCopyEx(precordset, charsetin, charsetout)

public actual fun DnsRecordSetDetach(precordlist: Long): Long =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsRecordSetDetach(precordlist)

public actual fun DnsReleaseContextHandle(hcontext: HANDLE) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsReleaseContextHandle(hcontext)
}

public actual fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetA(preplaceset, options.toInt(), hcontext, pextrainfo, preserved)

public actual fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetUTF8(preplaceset, options.toInt(), hcontext, pextrainfo, preserved)

public actual fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsReplaceRecordSetW(preplaceset, options.toInt(), hcontext, pextrainfo, preserved)

public actual fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowse(prequest, pcancel)

public actual fun DnsServiceBrowseCancel(pcancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceBrowseCancel(pcancelhandle)

public actual fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceConstructInstance(pservicename, phostname, pip4, pip6, wport.toShort(), wpriority.toShort(), wweight.toShort(), dwpropertiescount.toInt(), keys, values)

public actual fun DnsServiceCopyInstance(porig: Long): Long =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceCopyInstance(porig)

public actual fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceDeRegister(prequest, pcancel).toUInt()

public actual fun DnsServiceFreeInstance(pinstance: Long) {
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceFreeInstance(pinstance)
}

public actual fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegister(prequest, pcancel).toUInt()

public actual fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceRegisterCancel(pcancelhandle).toUInt()

public actual fun DnsServiceResolve(prequest: Long, pcancel: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolve(prequest, pcancel)

public actual fun DnsServiceResolveCancel(pcancelhandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsServiceResolveCancel(pcancelhandle)

public actual fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsSetApplicationSettings(cservers.toInt(), pservers, psettings).toUInt()

public actual fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsStartMulticastQuery(pqueryrequest, phandle)

public actual fun DnsStopMulticastQuery(phandle: Long): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsStopMulticastQuery(phandle)

public actual fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_A(pszname, format)

public actual fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_UTF8(pszname, format)

public actual fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsValidateName_W(pszname, format)

public actual fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_UTF8(pdnsbuffer, pdwbuffersize, pszname, wtype.toShort(), xid.toShort(), frecursiondesired)

public actual fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL =
    WindowsWin32NetworkmanagementDnsJniBridge.windowssys_windows_win32_networkmanagement_dns_DnsWriteQuestionToBuffer_W(pdnsbuffer, pdwbuffersize, pszname, wtype.toShort(), xid.toShort(), frecursiondesired)
