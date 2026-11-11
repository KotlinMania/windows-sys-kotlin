@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsQueryW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8
import io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns.cinterop.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(credentialflags, credentials?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(credentialflags, credentials?.value?.toCPointer<ByteVar>(), pcontext?.value?.toCPointer<ByteVar>())

public actual fun dnsCancelQuery(pcancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery(pcancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsCancelQueryRaw(cancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw(cancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(policyentrytag)

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo(pwszconnectionname?.value?.toCPointer<ByteVar>(), type)

public actual fun dnsConnectionFreeNameList(pnamelist: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList(pnamelist?.value?.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo(pproxyinfo?.value?.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx(pproxyinfoex?.value?.toCPointer<ByteVar>())
}

public actual fun dnsConnectionFreeProxyList(pproxylist: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList(pproxylist?.value?.toCPointer<ByteVar>())
}

public actual fun dnsConnectionGetNameList(pnamelist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList(pnamelist?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo(pwszconnectionname?.value?.toCPointer<ByteVar>(), type, pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl(pwszhosturl?.value?.toCPointer<ByteVar>(), pselectioncontext?.value?.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pproxyinfoex?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl?.value?.toCPointer<ByteVar>(), pselectioncontext?.value?.toCPointer<ByteVar>(), dwselectioncontextlength, dwexplicitinterfaceindex, pwszconnectionname?.value?.toCPointer<ByteVar>(), pproxyinfoex?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList(pwszconnectionname?.value?.toCPointer<ByteVar>(), pproxylist?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo(pwszconnectionname?.value?.toCPointer<ByteVar>(), type, pproxyinfo?.value?.toCPointer<ByteVar>())

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable(pconnectionifindexentries?.value?.toCPointer<ByteVar>())

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8(pdnsbuffer?.value?.toCPointer<ByteVar>(), wmessagelength, pprecord?.value?.toCPointer<ByteVar>())

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW(pdnsbuffer?.value?.toCPointer<ByteVar>(), wmessagelength, pprecord?.value?.toCPointer<ByteVar>())

public actual fun dnsFree(pdata: COpaquePointer?, freetype: DnsFreeType) {
    windowssys_windows_win32_networkmanagement_dns_dnsFree(pdata?.value?.toCPointer<ByteVar>(), freetype)
}

public actual fun dnsFreeCustomServers(pcservers: COpaquePointer?, ppservers: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers(pcservers?.value?.toCPointer<ByteVar>(), ppservers?.value?.toCPointer<ByteVar>())
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName(proxyname?.value?.toCPointer<ByteVar>())
}

public actual fun dnsGetApplicationSettings(pcservers: COpaquePointer?, ppdefaultservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings(pcservers?.value?.toCPointer<ByteVar>(), ppdefaultservers?.value?.toCPointer<ByteVar>(), psettings?.value?.toCPointer<ByteVar>())

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: COpaquePointer?, defaultproxyinformation: COpaquePointer?, completionroutine: DnsProxyCompletionRoutine, completioncontext: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation(hostname?.value?.toCPointer<ByteVar>(), proxyinformation?.value?.toCPointer<ByteVar>(), defaultproxyinformation?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), completioncontext?.value?.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetA(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA(paddrecords?.value?.toCPointer<ByteVar>(), pdeleterecords?.value?.toCPointer<ByteVar>(), options, hcredentials?.value?.toCPointer<ByteVar>(), pextralist?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8(paddrecords?.value?.toCPointer<ByteVar>(), pdeleterecords?.value?.toCPointer<ByteVar>(), options, hcredentials?.value?.toCPointer<ByteVar>(), pextralist?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsModifyRecordsInSetW(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW(paddrecords?.value?.toCPointer<ByteVar>(), pdeleterecords?.value?.toCPointer<ByteVar>(), options, hcredentials?.value?.toCPointer<ByteVar>(), pextralist?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA(pname1?.value?.toCPointer<ByteVar>(), pname2?.value?.toCPointer<ByteVar>())

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW(pname1?.value?.toCPointer<ByteVar>(), pname2?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: COpaquePointer?, pbuffer: COpaquePointer?, pbuflen: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(config, flag, pwsadaptername?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), pbuflen?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryEx(pqueryrequest: COpaquePointer?, pqueryresults: COpaquePointer?, pcancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryEx(pqueryrequest?.value?.toCPointer<ByteVar>(), pqueryresults?.value?.toCPointer<ByteVar>(), pcancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryRaw(queryrequest: COpaquePointer?, cancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw(queryrequest?.value?.toCPointer<ByteVar>(), cancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryRawResultFree(queryresults: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree(queryresults?.value?.toCPointer<ByteVar>())
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryA(pszname?.value?.toCPointer<ByteVar>(), wtype, options, pextra?.value?.toCPointer<ByteVar>(), ppqueryresults?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8(pszname?.value?.toCPointer<ByteVar>(), wtype, options, pextra?.value?.toCPointer<ByteVar>(), ppqueryresults?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    windowssys_windows_win32_networkmanagement_dns_dnsQueryW(pszname?.value?.toCPointer<ByteVar>(), wtype, options, pextra?.value?.toCPointer<ByteVar>(), ppqueryresults?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsRecordCompare(precord1: COpaquePointer?, precord2: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare(precord1?.value?.toCPointer<ByteVar>(), precord2?.value?.toCPointer<ByteVar>())

public actual fun dnsRecordCopyEx(precord: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx(precord?.value?.toCPointer<ByteVar>(), charsetin, charsetout)?.let { COpaquePointer(it.toLong()) }

public actual fun dnsRecordSetCompare(prr1: COpaquePointer?, prr2: COpaquePointer?, ppdiff1: COpaquePointer?, ppdiff2: COpaquePointer?): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare(prr1?.value?.toCPointer<ByteVar>(), prr2?.value?.toCPointer<ByteVar>(), ppdiff1?.value?.toCPointer<ByteVar>(), ppdiff2?.value?.toCPointer<ByteVar>())

public actual fun dnsRecordSetCopyEx(precordset: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx(precordset?.value?.toCPointer<ByteVar>(), charsetin, charsetout)?.let { COpaquePointer(it.toLong()) }

public actual fun dnsRecordSetDetach(precordlist: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach(precordlist?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle(hcontext?.value?.toCPointer<ByteVar>())
}

public actual fun dnsReplaceRecordSetA(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA(preplaceset?.value?.toCPointer<ByteVar>(), options, hcontext?.value?.toCPointer<ByteVar>(), pextrainfo?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsReplaceRecordSetUTF8(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8(preplaceset?.value?.toCPointer<ByteVar>(), options, hcontext?.value?.toCPointer<ByteVar>(), pextrainfo?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsReplaceRecordSetW(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW(preplaceset?.value?.toCPointer<ByteVar>(), options, hcontext?.value?.toCPointer<ByteVar>(), pextrainfo?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceBrowse(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse(prequest?.value?.toCPointer<ByteVar>(), pcancel?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceBrowseCancel(pcancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel(pcancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: COpaquePointer?, pip6: COpaquePointer?, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: COpaquePointer?, values: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance(pservicename?.value?.toCPointer<ByteVar>(), phostname?.value?.toCPointer<ByteVar>(), pip4?.value?.toCPointer<ByteVar>(), pip6?.value?.toCPointer<ByteVar>(), wport, wpriority, wweight, dwpropertiescount, keys?.value?.toCPointer<ByteVar>(), values?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dnsServiceCopyInstance(porig: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance(porig?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dnsServiceDeRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister(prequest?.value?.toCPointer<ByteVar>(), pcancel?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceFreeInstance(pinstance: COpaquePointer?) {
    windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance(pinstance?.value?.toCPointer<ByteVar>())
}

public actual fun dnsServiceRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister(prequest?.value?.toCPointer<ByteVar>(), pcancel?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceRegisterCancel(pcancelhandle: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel(pcancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceResolve(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve(prequest?.value?.toCPointer<ByteVar>(), pcancel?.value?.toCPointer<ByteVar>())

public actual fun dnsServiceResolveCancel(pcancelhandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel(pcancelhandle?.value?.toCPointer<ByteVar>())

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(cservers, pservers?.value?.toCPointer<ByteVar>(), psettings?.value?.toCPointer<ByteVar>())

public actual fun dnsStartMulticastQuery(pqueryrequest: COpaquePointer?, phandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery(pqueryrequest?.value?.toCPointer<ByteVar>(), phandle?.value?.toCPointer<ByteVar>())

public actual fun dnsStopMulticastQuery(phandle: COpaquePointer?): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery(phandle?.value?.toCPointer<ByteVar>())

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA(pszname?.value?.toCPointer<ByteVar>(), format)

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8(pszname?.value?.toCPointer<ByteVar>(), format)

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW(pszname?.value?.toCPointer<ByteVar>(), format)

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8(pdnsbuffer?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW(pdnsbuffer?.value?.toCPointer<ByteVar>(), pdwbuffersize?.value?.toCPointer<ByteVar>(), pszname?.value?.toCPointer<ByteVar>(), wtype, xid, frecursiondesired)
