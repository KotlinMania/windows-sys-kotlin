package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR

public expect fun DnsAcquireContextHandle_A(credentialflags: UInt, credentials: Long, pcontext: Long): Int

public expect fun DnsAcquireContextHandle_W(credentialflags: UInt, credentials: Long, pcontext: Long): Int

public expect fun DnsCancelQuery(pcancelhandle: Long): Int

public expect fun DnsCancelQueryRaw(cancelhandle: Long): Int

public expect fun DnsConnectionDeletePolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG): UInt

public expect fun DnsConnectionDeleteProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE): UInt

public expect fun DnsConnectionFreeNameList(pnamelist: Long)

public expect fun DnsConnectionFreeProxyInfo(pproxyinfo: Long)

public expect fun DnsConnectionFreeProxyInfoEx(pproxyinfoex: Long)

public expect fun DnsConnectionFreeProxyList(pproxylist: Long)

public expect fun DnsConnectionGetNameList(pnamelist: Long): UInt

public expect fun DnsConnectionGetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt

public expect fun DnsConnectionGetProxyInfoForHostUrl(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: Long): UInt

public expect fun DnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: PCWSTR, pselectioncontext: Long, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: PCWSTR, pproxyinfoex: Long): UInt

public expect fun DnsConnectionGetProxyList(pwszconnectionname: PCWSTR, pproxylist: Long): UInt

public expect fun DnsConnectionSetPolicyEntries(policyentrytag: DNS_CONNECTION_POLICY_TAG, ppolicyentrylist: Long): UInt

public expect fun DnsConnectionSetProxyInfo(pwszconnectionname: PCWSTR, type: DNS_CONNECTION_PROXY_TYPE, pproxyinfo: Long): UInt

public expect fun DnsConnectionUpdateIfIndexTable(pconnectionifindexentries: Long): UInt

public expect fun DnsExtractRecordsFromMessage_UTF8(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int

public expect fun DnsExtractRecordsFromMessage_W(pdnsbuffer: Long, wmessagelength: UShort, pprecord: Long): Int

public expect fun DnsFree(pdata: Long, freetype: DNS_FREE_TYPE)

public expect fun DnsFreeCustomServers(pcservers: Long, ppservers: Long)

public expect fun DnsFreeProxyName(proxyname: PCWSTR)

public expect fun DnsGetApplicationSettings(pcservers: Long, ppdefaultservers: Long, psettings: Long): UInt

public expect fun DnsGetProxyInformation(hostname: PCWSTR, proxyinformation: Long, defaultproxyinformation: Long, completionroutine: DNS_PROXY_COMPLETION_ROUTINE, completioncontext: Long): UInt

public expect fun DnsModifyRecordsInSet_A(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int

public expect fun DnsModifyRecordsInSet_UTF8(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int

public expect fun DnsModifyRecordsInSet_W(paddrecords: Long, pdeleterecords: Long, options: UInt, hcredentials: HANDLE, pextralist: Long, preserved: Long): Int

public expect fun DnsNameCompare_A(pname1: PCSTR, pname2: PCSTR): BOOL

public expect fun DnsNameCompare_W(pname1: PCWSTR, pname2: PCWSTR): BOOL

public expect fun DnsQueryConfig(config: DNS_CONFIG_TYPE, flag: UInt, pwsadaptername: PCWSTR, preserved: Long, pbuffer: Long, pbuflen: Long): Int

public expect fun DnsQueryEx(pqueryrequest: Long, pqueryresults: Long, pcancelhandle: Long): Int

public expect fun DnsQueryRaw(queryrequest: Long, cancelhandle: Long): Int

public expect fun DnsQueryRawResultFree(queryresults: Long)

public expect fun DnsQuery_A(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR

public expect fun DnsQuery_UTF8(pszname: PCSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR

public expect fun DnsQuery_W(pszname: PCWSTR, wtype: DNS_TYPE, options: DNS_QUERY_OPTIONS, pextra: Long, ppqueryresults: Long, preserved: Long): WIN32_ERROR

public expect fun DnsRecordCompare(precord1: Long, precord2: Long): BOOL

public expect fun DnsRecordCopyEx(precord: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long

public expect fun DnsRecordSetCompare(prr1: Long, prr2: Long, ppdiff1: Long, ppdiff2: Long): BOOL

public expect fun DnsRecordSetCopyEx(precordset: Long, charsetin: DNS_CHARSET, charsetout: DNS_CHARSET): Long

public expect fun DnsRecordSetDetach(precordlist: Long): Long

public expect fun DnsReleaseContextHandle(hcontext: HANDLE)

public expect fun DnsReplaceRecordSetA(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int

public expect fun DnsReplaceRecordSetUTF8(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int

public expect fun DnsReplaceRecordSetW(preplaceset: Long, options: UInt, hcontext: HANDLE, pextrainfo: Long, preserved: Long): Int

public expect fun DnsServiceBrowse(prequest: Long, pcancel: Long): Int

public expect fun DnsServiceBrowseCancel(pcancelhandle: Long): Int

public expect fun DnsServiceConstructInstance(pservicename: PCWSTR, phostname: PCWSTR, pip4: Long, pip6: Long, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: Long, values: Long): Long

public expect fun DnsServiceCopyInstance(porig: Long): Long

public expect fun DnsServiceDeRegister(prequest: Long, pcancel: Long): UInt

public expect fun DnsServiceFreeInstance(pinstance: Long)

public expect fun DnsServiceRegister(prequest: Long, pcancel: Long): UInt

public expect fun DnsServiceRegisterCancel(pcancelhandle: Long): UInt

public expect fun DnsServiceResolve(prequest: Long, pcancel: Long): Int

public expect fun DnsServiceResolveCancel(pcancelhandle: Long): Int

public expect fun DnsSetApplicationSettings(cservers: UInt, pservers: Long, psettings: Long): UInt

public expect fun DnsStartMulticastQuery(pqueryrequest: Long, phandle: Long): Int

public expect fun DnsStopMulticastQuery(phandle: Long): Int

public expect fun DnsValidateName_A(pszname: PCSTR, format: DNS_NAME_FORMAT): Int

public expect fun DnsValidateName_UTF8(pszname: PCSTR, format: DNS_NAME_FORMAT): Int

public expect fun DnsValidateName_W(pszname: PCWSTR, format: DNS_NAME_FORMAT): Int

public expect fun DnsWriteQuestionToBuffer_UTF8(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL

public expect fun DnsWriteQuestionToBuffer_W(pdnsbuffer: Long, pdwbuffersize: Long, pszname: PCWSTR, wtype: UShort, xid: UShort, frecursiondesired: BOOL): BOOL
