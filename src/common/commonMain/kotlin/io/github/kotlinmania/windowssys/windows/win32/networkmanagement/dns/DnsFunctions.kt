package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public expect fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int

public expect fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int

public expect fun dnsCancelQuery(pcancelhandle: ConstPtr<DnsQueryCancel>): Int

public expect fun dnsCancelQueryRaw(cancelhandle: ConstPtr<DnsQueryRawCancel>): Int

public expect fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt

public expect fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt

public expect fun dnsConnectionFreeNameList(pnamelist: MutPtr<DnsConnectionNameList>)

public expect fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr<DnsConnectionProxyInfo>)

public expect fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>)

public expect fun dnsConnectionFreeProxyList(pproxylist: MutPtr<DnsConnectionProxyList>)

public expect fun dnsConnectionGetNameList(pnamelist: MutPtr<DnsConnectionNameList>): UInt

public expect fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr<DnsConnectionProxyInfo>): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt

public expect fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt

public expect fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr<DnsConnectionProxyList>): UInt

public expect fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr<DnsConnectionPolicyEntryList>): UInt

public expect fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr<DnsConnectionProxyInfo>): UInt

public expect fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr<DnsConnectionIfindexList>): UInt

public expect fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int

public expect fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int

public expect fun dnsFree(pdata: ConstPtr<CVoid>, freetype: DnsFreeType)

public expect fun dnsFreeCustomServers(pcservers: MutPtr<UInt>, ppservers: MutPtr<MutPtr<DnsCustomServer>>)

public expect fun dnsFreeProxyName(proxyname: Pcwstr)

public expect fun dnsGetApplicationSettings(pcservers: MutPtr<UInt>, ppdefaultservers: MutPtr<MutPtr<DnsCustomServer>>, psettings: MutPtr<DnsApplicationSettings>): UInt

public expect fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr<DnsProxyInformation>, defaultproxyinformation: MutPtr<DnsProxyInformation>, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr<CVoid>): UInt

public expect fun dnsModifyRecordsInSetA(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsModifyRecordsInSetW(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool

public expect fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool

public expect fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr<CVoid>, pbuffer: MutPtr<CVoid>, pbuflen: MutPtr<UInt>): Int

public expect fun dnsQueryEx(pqueryrequest: ConstPtr<DnsQueryRequest>, pqueryresults: MutPtr<DnsQueryResult>, pcancelhandle: MutPtr<DnsQueryCancel>): Int

public expect fun dnsQueryRaw(queryrequest: ConstPtr<DnsQueryRawRequest>, cancelhandle: MutPtr<DnsQueryRawCancel>): Int

public expect fun dnsQueryRawResultFree(queryresults: ConstPtr<DnsQueryRawResult>)

public expect fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error

public expect fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error

public expect fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error

public expect fun dnsRecordCompare(precord1: ConstPtr<DnsRecorda>, precord2: ConstPtr<DnsRecorda>): Bool

public expect fun dnsRecordCopyEx(precord: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda>

public expect fun dnsRecordSetCompare(prr1: MutPtr<DnsRecorda>, prr2: MutPtr<DnsRecorda>, ppdiff1: MutPtr<MutPtr<DnsRecorda>>, ppdiff2: MutPtr<MutPtr<DnsRecorda>>): Bool

public expect fun dnsRecordSetCopyEx(precordset: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda>

public expect fun dnsRecordSetDetach(precordlist: MutPtr<DnsRecorda>): MutPtr<DnsRecorda>

public expect fun dnsReleaseContextHandle(hcontext: Handle)

public expect fun dnsReplaceRecordSetA(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsReplaceRecordSetW(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int

public expect fun dnsServiceBrowse(prequest: ConstPtr<DnsServiceBrowseRequest>, pcancel: MutPtr<DnsServiceCancel>): Int

public expect fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int

public expect fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr<UInt>, pip6: ConstPtr<Ip6Address>, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr<Pcwstr>, values: ConstPtr<Pcwstr>): MutPtr<DnsServiceInstance>

public expect fun dnsServiceCopyInstance(porig: ConstPtr<DnsServiceInstance>): MutPtr<DnsServiceInstance>

public expect fun dnsServiceDeRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt

public expect fun dnsServiceFreeInstance(pinstance: ConstPtr<DnsServiceInstance>)

public expect fun dnsServiceRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt

public expect fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): UInt

public expect fun dnsServiceResolve(prequest: ConstPtr<DnsServiceResolveRequest>, pcancel: MutPtr<DnsServiceCancel>): Int

public expect fun dnsServiceResolveCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int

public expect fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr<DnsCustomServer>, psettings: ConstPtr<DnsApplicationSettings>): UInt

public expect fun dnsStartMulticastQuery(pqueryrequest: ConstPtr<MdnsQueryRequest>, phandle: MutPtr<MdnsQueryHandle>): Int

public expect fun dnsStopMulticastQuery(phandle: MutPtr<MdnsQueryHandle>): Int

public expect fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int

public expect fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int

public expect fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool

public expect fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool
