@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsCancelQuery(pcancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsCancelQueryRaw(cancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionFreeNameList(pnamelist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsConnectionFreeProxyList(pproxylist: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsConnectionGetNameList(pnamelist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsFree(pdata: COpaquePointer?, freetype: DnsFreeType) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsFreeCustomServers(pcservers: COpaquePointer?, ppservers: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsGetApplicationSettings(pcservers: COpaquePointer?, ppdefaultservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: COpaquePointer?, defaultproxyinformation: COpaquePointer?, completionroutine: DnsProxyCompletionRoutine, completioncontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsModifyRecordsInSetA(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsModifyRecordsInSetW(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: COpaquePointer?, pbuffer: COpaquePointer?, pbuflen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryEx(pqueryrequest: COpaquePointer?, pqueryresults: COpaquePointer?, pcancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryRaw(queryrequest: COpaquePointer?, cancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryRawResultFree(queryresults: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsRecordCompare(precord1: COpaquePointer?, precord2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsRecordCopyEx(precord: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsRecordSetCompare(prr1: COpaquePointer?, prr2: COpaquePointer?, ppdiff1: COpaquePointer?, ppdiff2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsRecordSetCopyEx(precordset: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsRecordSetDetach(precordlist: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsReplaceRecordSetA(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsReplaceRecordSetUTF8(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsReplaceRecordSetW(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceBrowse(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceBrowseCancel(pcancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: COpaquePointer?, pip6: COpaquePointer?, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: COpaquePointer?, values: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceCopyInstance(porig: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceDeRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceFreeInstance(pinstance: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun dnsServiceRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceRegisterCancel(pcancelhandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceResolve(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsServiceResolveCancel(pcancelhandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsStartMulticastQuery(pqueryrequest: COpaquePointer?, phandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsStopMulticastQuery(phandle: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
