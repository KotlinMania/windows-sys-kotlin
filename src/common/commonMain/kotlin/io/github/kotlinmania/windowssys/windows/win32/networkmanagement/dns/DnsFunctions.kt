package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int

public expect fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int

public expect fun dnsCancelQuery(pcancelhandle: COpaquePointer?): Int

public expect fun dnsCancelQueryRaw(cancelhandle: COpaquePointer?): Int

public expect fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt

public expect fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt

public expect fun dnsConnectionFreeNameList(pnamelist: COpaquePointer?)

public expect fun dnsConnectionFreeProxyInfo(pproxyinfo: COpaquePointer?)

public expect fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: COpaquePointer?)

public expect fun dnsConnectionFreeProxyList(pproxylist: COpaquePointer?)

public expect fun dnsConnectionGetNameList(pnamelist: COpaquePointer?): UInt

public expect fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: COpaquePointer?): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: COpaquePointer?): UInt

public expect fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: COpaquePointer?): UInt

public expect fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: COpaquePointer?): UInt

public expect fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt

public expect fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: COpaquePointer?): UInt

public expect fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int

public expect fun dnsExtractRecordsFromMessageW(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int

public expect fun dnsFree(pdata: COpaquePointer?, freetype: DnsFreeType)

public expect fun dnsFreeCustomServers(pcservers: COpaquePointer?, ppservers: COpaquePointer?)

public expect fun dnsFreeProxyName(proxyname: Pcwstr)

public expect fun dnsGetApplicationSettings(pcservers: COpaquePointer?, ppdefaultservers: COpaquePointer?, psettings: COpaquePointer?): UInt

public expect fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: COpaquePointer?, defaultproxyinformation: COpaquePointer?, completionroutine: DnsProxyCompletionRoutine, completioncontext: COpaquePointer?): UInt

public expect fun dnsModifyRecordsInSetA(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsModifyRecordsInSetUtf8(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsModifyRecordsInSetW(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool

public expect fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool

public expect fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: COpaquePointer?, pbuffer: COpaquePointer?, pbuflen: COpaquePointer?): Int

public expect fun dnsQueryEx(pqueryrequest: COpaquePointer?, pqueryresults: COpaquePointer?, pcancelhandle: COpaquePointer?): Int

public expect fun dnsQueryRaw(queryrequest: COpaquePointer?, cancelhandle: COpaquePointer?): Int

public expect fun dnsQueryRawResultFree(queryresults: COpaquePointer?)

public expect fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error

public expect fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error

public expect fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error

public expect fun dnsRecordCompare(precord1: COpaquePointer?, precord2: COpaquePointer?): Bool

public expect fun dnsRecordCopyEx(precord: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer?

public expect fun dnsRecordSetCompare(prr1: COpaquePointer?, prr2: COpaquePointer?, ppdiff1: COpaquePointer?, ppdiff2: COpaquePointer?): Bool

public expect fun dnsRecordSetCopyEx(precordset: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer?

public expect fun dnsRecordSetDetach(precordlist: COpaquePointer?): COpaquePointer?

public expect fun dnsReleaseContextHandle(hcontext: Handle)

public expect fun dnsReplaceRecordSetA(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsReplaceRecordSetUTF8(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsReplaceRecordSetW(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int

public expect fun dnsServiceBrowse(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int

public expect fun dnsServiceBrowseCancel(pcancelhandle: COpaquePointer?): Int

public expect fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: COpaquePointer?, pip6: COpaquePointer?, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: COpaquePointer?, values: COpaquePointer?): COpaquePointer?

public expect fun dnsServiceCopyInstance(porig: COpaquePointer?): COpaquePointer?

public expect fun dnsServiceDeRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt

public expect fun dnsServiceFreeInstance(pinstance: COpaquePointer?)

public expect fun dnsServiceRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt

public expect fun dnsServiceRegisterCancel(pcancelhandle: COpaquePointer?): UInt

public expect fun dnsServiceResolve(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int

public expect fun dnsServiceResolveCancel(pcancelhandle: COpaquePointer?): Int

public expect fun dnsSetApplicationSettings(cservers: UInt, pservers: COpaquePointer?, psettings: COpaquePointer?): UInt

public expect fun dnsStartMulticastQuery(pqueryrequest: COpaquePointer?, phandle: COpaquePointer?): Int

public expect fun dnsStopMulticastQuery(phandle: COpaquePointer?): Int

public expect fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int

public expect fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool

public expect fun dnsWriteQuestionToBufferW(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool
