@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsQueryW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(credentialflags, credentials.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(credentialflags, credentials.rawAddress.toCPointer<ByteVar>(), pcontext.rawAddress.toCPointer<ByteVar>())

public actual fun dnsCancelQuery(pcancelhandle: ConstPtr<DnsQueryCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(pcancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsCancelQueryRaw(cancelhandle: ConstPtr<DnsQueryRawCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(cancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag)

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(pwszconnectionname.rawAddress.toCPointer<ByteVar>(), type)

public actual fun dnsConnectionFreeNameList(pnamelist: MutPtr<DnsConnectionNameList>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(pnamelist.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr<DnsConnectionProxyInfo>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(pproxyinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(pproxyinfoex.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyList(pproxylist: MutPtr<DnsConnectionProxyList>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(pproxylist.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsConnectionGetNameList(pnamelist: MutPtr<DnsConnectionNameList>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(pnamelist.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr<DnsConnectionProxyInfo>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(pwszconnectionname.rawAddress.toCPointer<ByteVar>(), type, pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(pwszhosturl.rawAddress.toCPointer<ByteVar>(), pselectioncontext.rawAddress.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pproxyinfoex.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.rawAddress.toCPointer<ByteVar>(), pselectioncontext.rawAddress.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pwszconnectionname.rawAddress.toCPointer<ByteVar>(), pproxyinfoex.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr<DnsConnectionProxyList>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(pwszconnectionname.rawAddress.toCPointer<ByteVar>(), pproxylist.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr<DnsConnectionPolicyEntryList>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr<DnsConnectionProxyInfo>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(pwszconnectionname.rawAddress.toCPointer<ByteVar>(), type, pproxyinfo.rawAddress.toCPointer<ByteVar>())

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr<DnsConnectionIfindexList>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(pconnectionifindexentries.rawAddress.toCPointer<ByteVar>())

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(pdnsbuffer.rawAddress.toCPointer<ByteVar>(), wmessagelength, pprecord.rawAddress.toCPointer<ByteVar>())

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(pdnsbuffer.rawAddress.toCPointer<ByteVar>(), wmessagelength, pprecord.rawAddress.toCPointer<ByteVar>())

public actual fun dnsFree(pdata: ConstPtr<CVoid>, freetype: DnsFreeType) {
    windowssysWindowsWin32NetworkmanagementDnsDnsFree(pdata.rawAddress.toCPointer<ByteVar>(), freetype)
}

public actual fun dnsFreeCustomServers(pcservers: MutPtr<UInt>, ppservers: MutPtr<MutPtr<DnsCustomServer>>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(pcservers.rawAddress.toCPointer<ByteVar>(), ppservers.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(proxyname.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsGetApplicationSettings(pcservers: MutPtr<UInt>, ppdefaultservers: MutPtr<MutPtr<DnsCustomServer>>, psettings: MutPtr<DnsApplicationSettings>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(pcservers.rawAddress.toCPointer<ByteVar>(), ppdefaultservers.rawAddress.toCPointer<ByteVar>(), psettings.rawAddress.toCPointer<ByteVar>())

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr<DnsProxyInformation>, defaultproxyinformation: MutPtr<DnsProxyInformation>, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr<CVoid>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(hostname.rawAddress.toCPointer<ByteVar>(), proxyinformation.rawAddress.toCPointer<ByteVar>(), defaultproxyinformation.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), completioncontext.rawAddress.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetA(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(paddrecords.rawAddress.toCPointer<ByteVar>(), pdeleterecords.rawAddress.toCPointer<ByteVar>(), options, hcredentials.rawAddress.toCPointer<ByteVar>(), pextralist.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(paddrecords.rawAddress.toCPointer<ByteVar>(), pdeleterecords.rawAddress.toCPointer<ByteVar>(), options, hcredentials.rawAddress.toCPointer<ByteVar>(), pextralist.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetW(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(paddrecords.rawAddress.toCPointer<ByteVar>(), pdeleterecords.rawAddress.toCPointer<ByteVar>(), options, hcredentials.rawAddress.toCPointer<ByteVar>(), pextralist.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(pname1.rawAddress.toCPointer<ByteVar>(), pname2.rawAddress.toCPointer<ByteVar>())

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(pname1.rawAddress.toCPointer<ByteVar>(), pname2.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr<CVoid>, pbuffer: MutPtr<CVoid>, pbuflen: MutPtr<UInt>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(config, flag, pwsadaptername.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), pbuflen.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryEx(pqueryrequest: ConstPtr<DnsQueryRequest>, pqueryresults: MutPtr<DnsQueryResult>, pcancelhandle: MutPtr<DnsQueryCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(pqueryrequest.rawAddress.toCPointer<ByteVar>(), pqueryresults.rawAddress.toCPointer<ByteVar>(), pcancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryRaw(queryrequest: ConstPtr<DnsQueryRawRequest>, cancelhandle: MutPtr<DnsQueryRawCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(queryrequest.rawAddress.toCPointer<ByteVar>(), cancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryRawResultFree(queryresults: ConstPtr<DnsQueryRawResult>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(queryresults.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(pszname.rawAddress.toCPointer<ByteVar>(), wtype, options, pextra.rawAddress.toCPointer<ByteVar>(), ppqueryresults.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(pszname.rawAddress.toCPointer<ByteVar>(), wtype, options, pextra.rawAddress.toCPointer<ByteVar>(), ppqueryresults.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(pszname.rawAddress.toCPointer<ByteVar>(), wtype, options, pextra.rawAddress.toCPointer<ByteVar>(), ppqueryresults.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsRecordCompare(precord1: ConstPtr<DnsRecorda>, precord2: ConstPtr<DnsRecorda>): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(precord1.rawAddress.toCPointer<ByteVar>(), precord2.rawAddress.toCPointer<ByteVar>())

public actual fun dnsRecordCopyEx(precord: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    MutPtr(windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(precord.rawAddress.toCPointer<ByteVar>(), charsetin, charsetout)?.toLong() ?: 0L)

public actual fun dnsRecordSetCompare(prr1: MutPtr<DnsRecorda>, prr2: MutPtr<DnsRecorda>, ppdiff1: MutPtr<MutPtr<DnsRecorda>>, ppdiff2: MutPtr<MutPtr<DnsRecorda>>): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(prr1.rawAddress.toCPointer<ByteVar>(), prr2.rawAddress.toCPointer<ByteVar>(), ppdiff1.rawAddress.toCPointer<ByteVar>(), ppdiff2.rawAddress.toCPointer<ByteVar>())

public actual fun dnsRecordSetCopyEx(precordset: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    MutPtr(windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(precordset.rawAddress.toCPointer<ByteVar>(), charsetin, charsetout)?.toLong() ?: 0L)

public actual fun dnsRecordSetDetach(precordlist: MutPtr<DnsRecorda>): MutPtr<DnsRecorda> =
    MutPtr(windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(precordlist.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(hcontext.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsReplaceRecordSetA(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(preplaceset.rawAddress.toCPointer<ByteVar>(), options, hcontext.rawAddress.toCPointer<ByteVar>(), pextrainfo.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(preplaceset.rawAddress.toCPointer<ByteVar>(), options, hcontext.rawAddress.toCPointer<ByteVar>(), pextrainfo.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsReplaceRecordSetW(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(preplaceset.rawAddress.toCPointer<ByteVar>(), options, hcontext.rawAddress.toCPointer<ByteVar>(), pextrainfo.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceBrowse(prequest: ConstPtr<DnsServiceBrowseRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(prequest.rawAddress.toCPointer<ByteVar>(), pcancel.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(pcancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr<UInt>, pip6: ConstPtr<Ip6Address>, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr<Pcwstr>, values: ConstPtr<Pcwstr>): MutPtr<DnsServiceInstance> =
    MutPtr(windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(pservicename.rawAddress.toCPointer<ByteVar>(), phostname.rawAddress.toCPointer<ByteVar>(), pip4.rawAddress.toCPointer<ByteVar>(), pip6.rawAddress.toCPointer<ByteVar>(), wport, wpriority, wweight, dwpropertiescount, keys.rawAddress.toCPointer<ByteVar>(), values.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dnsServiceCopyInstance(porig: ConstPtr<DnsServiceInstance>): MutPtr<DnsServiceInstance> =
    MutPtr(windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(porig.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dnsServiceDeRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(prequest.rawAddress.toCPointer<ByteVar>(), pcancel.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceFreeInstance(pinstance: ConstPtr<DnsServiceInstance>) {
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(pinstance.rawAddress.toCPointer<ByteVar>())
}

public actual fun dnsServiceRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(prequest.rawAddress.toCPointer<ByteVar>(), pcancel.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(pcancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceResolve(prequest: ConstPtr<DnsServiceResolveRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(prequest.rawAddress.toCPointer<ByteVar>(), pcancel.rawAddress.toCPointer<ByteVar>())

public actual fun dnsServiceResolveCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(pcancelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr<DnsCustomServer>, psettings: ConstPtr<DnsApplicationSettings>): UInt =
    windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(cservers, pservers.rawAddress.toCPointer<ByteVar>(), psettings.rawAddress.toCPointer<ByteVar>())

public actual fun dnsStartMulticastQuery(pqueryrequest: ConstPtr<MdnsQueryRequest>, phandle: MutPtr<MdnsQueryHandle>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(pqueryrequest.rawAddress.toCPointer<ByteVar>(), phandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsStopMulticastQuery(phandle: MutPtr<MdnsQueryHandle>): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(phandle.rawAddress.toCPointer<ByteVar>())

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(pszname.rawAddress.toCPointer<ByteVar>(), format)

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(pszname.rawAddress.toCPointer<ByteVar>(), format)

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(pszname.rawAddress.toCPointer<ByteVar>(), format)

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(pdnsbuffer.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(pdnsbuffer.rawAddress.toCPointer<ByteVar>(), pdwbuffersize.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)
