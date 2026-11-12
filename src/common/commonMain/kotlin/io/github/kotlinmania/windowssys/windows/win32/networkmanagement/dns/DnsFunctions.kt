package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int

public expect fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int

public expect fun dnsCancelQuery(pcancelhandle: ConstPtr): Int

public expect fun dnsCancelQueryRaw(cancelhandle: ConstPtr): Int

public expect fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt

public expect fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt

public expect fun dnsConnectionFreeNameList(pnamelist: MutPtr)

public expect fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr)

public expect fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr)

public expect fun dnsConnectionFreeProxyList(pproxylist: MutPtr)

public expect fun dnsConnectionGetNameList(pnamelist: MutPtr): UInt

public expect fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr): UInt

public expect fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr): UInt

public expect fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr): UInt

public expect fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr): UInt

public expect fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr): UInt

public expect fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int

public expect fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int

public expect fun dnsFree(pdata: ConstPtr, freetype: DnsFreeType)

public expect fun dnsFreeCustomServers(pcservers: MutPtr, ppservers: MutPtr)

public expect fun dnsFreeProxyName(proxyname: Pcwstr)

public expect fun dnsGetApplicationSettings(pcservers: MutPtr, ppdefaultservers: MutPtr, psettings: MutPtr): UInt

public expect fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr, defaultproxyinformation: MutPtr, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr): UInt

public expect fun dnsModifyRecordsInSetA(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int

public expect fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int

public expect fun dnsModifyRecordsInSetW(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int

public expect fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool

public expect fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool

public expect fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr, pbuffer: MutPtr, pbuflen: MutPtr): Int

public expect fun dnsQueryEx(pqueryrequest: ConstPtr, pqueryresults: MutPtr, pcancelhandle: MutPtr): Int

public expect fun dnsQueryRaw(queryrequest: ConstPtr, cancelhandle: MutPtr): Int

public expect fun dnsQueryRawResultFree(queryresults: ConstPtr)

public expect fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error

public expect fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error

public expect fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error

public expect fun dnsRecordCompare(precord1: ConstPtr, precord2: ConstPtr): Bool

public expect fun dnsRecordCopyEx(precord: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr

public expect fun dnsRecordSetCompare(prr1: MutPtr, prr2: MutPtr, ppdiff1: MutPtr, ppdiff2: MutPtr): Bool

public expect fun dnsRecordSetCopyEx(precordset: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr

public expect fun dnsRecordSetDetach(precordlist: MutPtr): MutPtr

public expect fun dnsReleaseContextHandle(hcontext: Handle)

public expect fun dnsReplaceRecordSetA(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int

public expect fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int

public expect fun dnsReplaceRecordSetW(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int

public expect fun dnsServiceBrowse(prequest: ConstPtr, pcancel: MutPtr): Int

public expect fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr): Int

public expect fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr, pip6: ConstPtr, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr, values: ConstPtr): MutPtr

public expect fun dnsServiceCopyInstance(porig: ConstPtr): MutPtr

public expect fun dnsServiceDeRegister(prequest: ConstPtr, pcancel: MutPtr): UInt

public expect fun dnsServiceFreeInstance(pinstance: ConstPtr)

public expect fun dnsServiceRegister(prequest: ConstPtr, pcancel: MutPtr): UInt

public expect fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr): UInt

public expect fun dnsServiceResolve(prequest: ConstPtr, pcancel: MutPtr): Int

public expect fun dnsServiceResolveCancel(pcancelhandle: ConstPtr): Int

public expect fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr, psettings: ConstPtr): UInt

public expect fun dnsStartMulticastQuery(pqueryrequest: ConstPtr, phandle: MutPtr): Int

public expect fun dnsStopMulticastQuery(phandle: MutPtr): Int

public expect fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int

public expect fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool

public expect fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool
