package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(completioncontext: Long, status: Int)
}

public fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsAcquireContextHandle_A", longArrayOf(credentialflags.toLong(), credentials, pcontext)).toInt()
}

public fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsAcquireContextHandle_W", longArrayOf(credentialflags.toLong(), credentials, pcontext)).toInt()
}

public fun DnsCancelQuery(pcancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsCancelQuery", longArrayOf(pcancelhandle)).toInt()
}

public fun DnsCancelQueryRaw(cancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsCancelQueryRaw", longArrayOf(cancelhandle)).toInt()
}

public fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionDeletePolicyEntries", longArrayOf(policyentrytag.toLong())).toUInt()
}

public fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionDeleteProxyInfo", longArrayOf(pwszconnectionname, type.toLong())).toUInt()
}

public fun DnsConnectionFreeNameList(pnamelist: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionFreeNameList", longArrayOf(pnamelist))
}

public fun DnsConnectionFreeProxyInfo(pproxyinfo: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionFreeProxyInfo", longArrayOf(pproxyinfo))
}

public fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionFreeProxyInfoEx", longArrayOf(pproxyinfoex))
}

public fun DnsConnectionFreeProxyList(pproxylist: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionFreeProxyList", longArrayOf(pproxylist))
}

public fun DnsConnectionGetNameList(pnamelist: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionGetNameList", longArrayOf(pnamelist)).toUInt()
}

public fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionGetProxyInfo", longArrayOf(pwszconnectionname, type.toLong(), pproxyinfo)).toUInt()
}

public fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionGetProxyInfoForHostUrl", longArrayOf(pwszhosturl, pselectioncontext, dwselectioncontextlength.toLong(), dwexplicitinterfaceindex.toLong(), pproxyinfoex)).toUInt()
}

public fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionGetProxyInfoForHostUrlEx", longArrayOf(pwszhosturl, pselectioncontext, dwselectioncontextlength.toLong(), dwexplicitinterfaceindex.toLong(), pwszconnectionname, pproxyinfoex)).toUInt()
}

public fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionGetProxyList", longArrayOf(pwszconnectionname, pproxylist)).toUInt()
}

public fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionSetPolicyEntries", longArrayOf(policyentrytag.toLong(), ppolicyentrylist)).toUInt()
}

public fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionSetProxyInfo", longArrayOf(pwszconnectionname, type.toLong(), pproxyinfo)).toUInt()
}

public fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsConnectionUpdateIfIndexTable", longArrayOf(pconnectionifindexentries)).toUInt()
}

public fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsExtractRecordsFromMessage_UTF8", longArrayOf(pdnsbuffer, wmessagelength.toLong(), pprecord)).toInt()
}

public fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsExtractRecordsFromMessage_W", longArrayOf(pdnsbuffer, wmessagelength.toLong(), pprecord)).toInt()
}

public fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsFree", longArrayOf(pdata, freetype.toLong()))
}

public fun DnsFreeCustomServers(pcservers: Long, ppservers: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsFreeCustomServers", longArrayOf(pcservers, ppservers))
}

public fun DnsFreeProxyName(proxyname: PCWSTR) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsFreeProxyName", longArrayOf(proxyname))
}

public fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsGetApplicationSettings", longArrayOf(pcservers, ppdefaultservers, psettings)).toUInt()
}

public fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsGetProxyInformation", longArrayOf(hostname, proxyinformation, defaultproxyinformation, Win32DynamicFfi.objectSlot(completionroutine), completioncontext)).toUInt()
}

public fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: Foundation.HANDLE, pextralist: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsModifyRecordsInSet_A", longArrayOf(paddrecords, pdeleterecords, options.toLong(), Win32DynamicFfi.objectSlot(hcredentials), pextralist, preserved)).toInt()
}

public fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: Foundation.HANDLE, pextralist: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsModifyRecordsInSet_UTF8", longArrayOf(paddrecords, pdeleterecords, options.toLong(), Win32DynamicFfi.objectSlot(hcredentials), pextralist, preserved)).toInt()
}

public fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: Foundation.HANDLE, pextralist: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsModifyRecordsInSet_W", longArrayOf(paddrecords, pdeleterecords, options.toLong(), Win32DynamicFfi.objectSlot(hcredentials), pextralist, preserved)).toInt()
}

public fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsNameCompare_A", longArrayOf(pname1, pname2)).toInt()
}

public fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsNameCompare_W", longArrayOf(pname1, pname2)).toInt()
}

public fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsQueryConfig", longArrayOf(config.toLong(), flag.toLong(), pwsadaptername, preserved, pbuffer, pbuflen)).toInt()
}

public fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsQueryEx", longArrayOf(pqueryrequest, pqueryresults, pcancelhandle)).toInt()
}

public fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsQueryRaw", longArrayOf(queryrequest, cancelhandle)).toInt()
}

public fun DnsQueryRawResultFree(queryresults: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsQueryRawResultFree", longArrayOf(queryresults))
}

public fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsQuery_A", longArrayOf(pszname, wtype.toLong(), options.toLong(), pextra, ppqueryresults, preserved))
    return Foundation.WIN32_ERROR()
}

public fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsQuery_UTF8", longArrayOf(pszname, wtype.toLong(), options.toLong(), pextra, ppqueryresults, preserved))
    return Foundation.WIN32_ERROR()
}

public fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsQuery_W", longArrayOf(pszname, wtype.toLong(), options.toLong(), pextra, ppqueryresults, preserved))
    return Foundation.WIN32_ERROR()
}

public fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsRecordCompare", longArrayOf(precord1, precord2)).toInt()
}

public fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsRecordCopyEx", longArrayOf(precord, charsetin.toLong(), charsetout.toLong()))
}

public fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsRecordSetCompare", longArrayOf(prr1, prr2, ppdiff1, ppdiff2)).toInt()
}

public fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsRecordSetCopyEx", longArrayOf(precordset, charsetin.toLong(), charsetout.toLong()))
}

public fun DnsRecordSetDetach(precordlist: Long): Long {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsRecordSetDetach", longArrayOf(precordlist))
}

public fun DnsReleaseContextHandle(hcontext: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsReleaseContextHandle", longArrayOf(Win32DynamicFfi.objectSlot(hcontext)))
}

public fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: Foundation.HANDLE, pextrainfo: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsReplaceRecordSetA", longArrayOf(preplaceset, options.toLong(), Win32DynamicFfi.objectSlot(hcontext), pextrainfo, preserved)).toInt()
}

public fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: Foundation.HANDLE, pextrainfo: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsReplaceRecordSetUTF8", longArrayOf(preplaceset, options.toLong(), Win32DynamicFfi.objectSlot(hcontext), pextrainfo, preserved)).toInt()
}

public fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: Foundation.HANDLE, pextrainfo: Long, preserved: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsReplaceRecordSetW", longArrayOf(preplaceset, options.toLong(), Win32DynamicFfi.objectSlot(hcontext), pextrainfo, preserved)).toInt()
}

public fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceBrowse", longArrayOf(prequest, pcancel)).toInt()
}

public fun DnsServiceBrowseCancel(pcancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceBrowseCancel", longArrayOf(pcancelhandle)).toInt()
}

public fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceConstructInstance", longArrayOf(pservicename, phostname, pip4, pip6, wport.toLong(), wpriority.toLong(), wweight.toLong(), dwpropertiescount.toLong(), keys, values))
}

public fun DnsServiceCopyInstance(porig: Long): Long {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceCopyInstance", longArrayOf(porig))
}

public fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceDeRegister", longArrayOf(prequest, pcancel)).toUInt()
}

public fun DnsServiceFreeInstance(pinstance: Long) {
    Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceFreeInstance", longArrayOf(pinstance))
}

public fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceRegister", longArrayOf(prequest, pcancel)).toUInt()
}

public fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceRegisterCancel", longArrayOf(pcancelhandle)).toUInt()
}

public fun DnsServiceResolve(prequest: Long, pcancel: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceResolve", longArrayOf(prequest, pcancel)).toInt()
}

public fun DnsServiceResolveCancel(pcancelhandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsServiceResolveCancel", longArrayOf(pcancelhandle)).toInt()
}

public fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsSetApplicationSettings", longArrayOf(cservers.toLong(), pservers, psettings)).toUInt()
}

public fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsStartMulticastQuery", longArrayOf(pqueryrequest, phandle)).toInt()
}

public fun DnsStopMulticastQuery(phandle: Long): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsStopMulticastQuery", longArrayOf(phandle)).toInt()
}

public fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsValidateName_A", longArrayOf(pszname, format.toLong())).toInt()
}

public fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsValidateName_UTF8", longArrayOf(pszname, format.toLong())).toInt()
}

public fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsValidateName_W", longArrayOf(pszname, format.toLong())).toInt()
}

public fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsWriteQuestionToBuffer_UTF8", longArrayOf(pdnsbuffer, pdwbuffersize, pszname, wtype.toLong(), xid.toLong(), frecursiondesired.toLong())).toInt()
}

public fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL {
    return Win32DynamicFfi.invoke("dnsapi.dll", "DnsWriteQuestionToBuffer_W", longArrayOf(pdnsbuffer, pdwbuffersize, pszname, wtype.toLong(), xid.toLong(), frecursiondesired.toLong())).toInt()
}
