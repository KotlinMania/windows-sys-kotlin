@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA")

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr, pcontext: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW")

public actual fun dnsCancelQuery(pcancelhandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery")

public actual fun dnsCancelQueryRaw(cancelhandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries")
private external fun wasiWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag: Int): Int

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    wasiWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag).toUInt()

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo")

public actual fun dnsConnectionFreeNameList(pnamelist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList")

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo")

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx")

public actual fun dnsConnectionFreeProxyList(pproxylist: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList")

public actual fun dnsConnectionGetNameList(pnamelist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList")

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo")

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl")

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx")

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList")

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries")

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo")

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable")

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8")

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr, wmessagelength: UShort, pprecord: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW")

public actual fun dnsFree(pdata: ConstPtr, freetype: DnsFreeType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsFree")

public actual fun dnsFreeCustomServers(pcservers: MutPtr, ppservers: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers")

public actual fun dnsFreeProxyName(proxyname: Pcwstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName")

public actual fun dnsGetApplicationSettings(pcservers: MutPtr, ppdefaultservers: MutPtr, psettings: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings")

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr, defaultproxyinformation: MutPtr, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation")

public actual fun dnsModifyRecordsInSetA(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA")

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8")

public actual fun dnsModifyRecordsInSetW(paddrecords: ConstPtr, pdeleterecords: ConstPtr, options: UInt, hcredentials: Handle, pextralist: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW")

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA")

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW")

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr, pbuffer: MutPtr, pbuflen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig")

public actual fun dnsQueryEx(pqueryrequest: ConstPtr, pqueryresults: MutPtr, pcancelhandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx")

public actual fun dnsQueryRaw(queryrequest: ConstPtr, cancelhandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw")

public actual fun dnsQueryRawResultFree(queryresults: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree")

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryA")

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8")

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr, ppqueryresults: MutPtr, preserved: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsQueryW")

public actual fun dnsRecordCompare(precord1: ConstPtr, precord2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare")

public actual fun dnsRecordCopyEx(precord: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx")

public actual fun dnsRecordSetCompare(prr1: MutPtr, prr2: MutPtr, ppdiff1: MutPtr, ppdiff2: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare")

public actual fun dnsRecordSetCopyEx(precordset: ConstPtr, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx")

public actual fun dnsRecordSetDetach(precordlist: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach")

public actual fun dnsReleaseContextHandle(hcontext: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle")

public actual fun dnsReplaceRecordSetA(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA")

public actual fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8")

public actual fun dnsReplaceRecordSetW(preplaceset: ConstPtr, options: UInt, hcontext: Handle, pextrainfo: MutPtr, preserved: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW")

public actual fun dnsServiceBrowse(prequest: ConstPtr, pcancel: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse")

public actual fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel")

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr, pip6: ConstPtr, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr, values: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance")

public actual fun dnsServiceCopyInstance(porig: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance")

public actual fun dnsServiceDeRegister(prequest: ConstPtr, pcancel: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister")

public actual fun dnsServiceFreeInstance(pinstance: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance")

public actual fun dnsServiceRegister(prequest: ConstPtr, pcancel: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister")

public actual fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel")

public actual fun dnsServiceResolve(prequest: ConstPtr, pcancel: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve")

public actual fun dnsServiceResolveCancel(pcancelhandle: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel")

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr, psettings: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings")

public actual fun dnsStartMulticastQuery(pqueryrequest: ConstPtr, phandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery")

public actual fun dnsStopMulticastQuery(phandle: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery")

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA")

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8")

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW")

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8")

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr, pdwbuffersize: MutPtr, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW")
