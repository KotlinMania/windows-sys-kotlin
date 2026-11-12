@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

private val windowsWin32NetworkmanagementDnsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(credentialflags.toInt(), credentials.rawAddress.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(credentialflags.toInt(), credentials.rawAddress.toString(), pcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQuery(pcancelhandle: ConstPtr<DnsQueryCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(pcancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQueryRaw(cancelhandle: ConstPtr<DnsQueryRawCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(cancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(pwszconnectionname.rawAddress.toString(), type) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionFreeNameList(pnamelist: MutPtr<DnsConnectionNameList>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(pnamelist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr<DnsConnectionProxyInfo>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(pproxyinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(pproxyinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyList(pproxylist: MutPtr<DnsConnectionProxyList>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(pproxylist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionGetNameList(pnamelist: MutPtr<DnsConnectionNameList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(pnamelist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr<DnsConnectionProxyInfo>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(pwszconnectionname.rawAddress.toString(), type, pproxyinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(pwszhosturl.rawAddress.toString(), pselectioncontext.rawAddress.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pproxyinfoex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.rawAddress.toString(), pselectioncontext.rawAddress.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pwszconnectionname.rawAddress.toString(), pproxyinfoex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr<DnsConnectionProxyList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(pwszconnectionname.rawAddress.toString(), pproxylist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr<DnsConnectionPolicyEntryList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr<DnsConnectionProxyInfo>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(pwszconnectionname.rawAddress.toString(), type, pproxyinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr<DnsConnectionIfindexList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(pconnectionifindexentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(pdnsbuffer.rawAddress.toString(), wmessagelength.toInt(), pprecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(pdnsbuffer.rawAddress.toString(), wmessagelength.toInt(), pprecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsFree(pdata: ConstPtr<CVoid>, freetype: DnsFreeType) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsFree(pdata.rawAddress.toString(), freetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeCustomServers(pcservers: MutPtr<UInt>, ppservers: MutPtr<MutPtr<DnsCustomServer>>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(pcservers.rawAddress.toString(), ppservers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(proxyname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsGetApplicationSettings(pcservers: MutPtr<UInt>, ppdefaultservers: MutPtr<MutPtr<DnsCustomServer>>, psettings: MutPtr<DnsApplicationSettings>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(pcservers.rawAddress.toString(), ppdefaultservers.rawAddress.toString(), psettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr<DnsProxyInformation>, defaultproxyinformation: MutPtr<DnsProxyInformation>, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(hostname.rawAddress.toString(), proxyinformation.rawAddress.toString(), defaultproxyinformation.rawAddress.toString(), 0L.toString(), completioncontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetA(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetW(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(pname1.rawAddress.toString(), pname2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(pname1.rawAddress.toString(), pname2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr<CVoid>, pbuffer: MutPtr<CVoid>, pbuflen: MutPtr<UInt>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(config, flag.toInt(), pwsadaptername.rawAddress.toString(), preserved.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuflen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryEx(pqueryrequest: ConstPtr<DnsQueryRequest>, pqueryresults: MutPtr<DnsQueryResult>, pcancelhandle: MutPtr<DnsQueryCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(pqueryrequest.rawAddress.toString(), pqueryresults.rawAddress.toString(), pcancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRaw(queryrequest: ConstPtr<DnsQueryRawRequest>, cancelhandle: MutPtr<DnsQueryRawCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(queryrequest.rawAddress.toString(), cancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRawResultFree(queryresults: ConstPtr<DnsQueryRawResult>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(queryresults.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCompare(precord1: ConstPtr<DnsRecorda>, precord2: ConstPtr<DnsRecorda>): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(precord1.rawAddress.toString(), precord2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCopyEx(precord: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(precord.rawAddress.toString(), charsetin, charsetout) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCompare(prr1: MutPtr<DnsRecorda>, prr2: MutPtr<DnsRecorda>, ppdiff1: MutPtr<MutPtr<DnsRecorda>>, ppdiff2: MutPtr<MutPtr<DnsRecorda>>): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(prr1.rawAddress.toString(), prr2.rawAddress.toString(), ppdiff1.rawAddress.toString(), ppdiff2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCopyEx(precordset: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(precordset.rawAddress.toString(), charsetin, charsetout) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetDetach(precordlist: MutPtr<DnsRecorda>): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(precordlist.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(hcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsReplaceRecordSetA(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetW(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowse(prequest: ConstPtr<DnsServiceBrowseRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(pcancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr<UInt>, pip6: ConstPtr<Ip6Address>, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr<Pcwstr>, values: ConstPtr<Pcwstr>): MutPtr<DnsServiceInstance> =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(pservicename.rawAddress.toString(), phostname.rawAddress.toString(), pip4.rawAddress.toString(), pip6.rawAddress.toString(), wport.toInt(), wpriority.toInt(), wweight.toInt(), dwpropertiescount.toInt(), keys.rawAddress.toString(), values.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceCopyInstance(porig: ConstPtr<DnsServiceInstance>): MutPtr<DnsServiceInstance> =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) MutPtr((windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(porig.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceDeRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceFreeInstance(pinstance: ConstPtr<DnsServiceInstance>) {
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) {
        windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(pinstance.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsServiceRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(pcancelhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolve(prequest: ConstPtr<DnsServiceResolveRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolveCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(pcancelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr<DnsCustomServer>, psettings: ConstPtr<DnsApplicationSettings>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(cservers.toInt(), pservers.rawAddress.toString(), psettings.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStartMulticastQuery(pqueryrequest: ConstPtr<MdnsQueryRequest>, phandle: MutPtr<MdnsQueryHandle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(pqueryrequest.rawAddress.toString(), phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStopMulticastQuery(phandle: MutPtr<MdnsQueryHandle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(phandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(pszname.rawAddress.toString(), format) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(pszname.rawAddress.toString(), format) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(pszname.rawAddress.toString(), format) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(pdnsbuffer.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pszname.rawAddress.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAddon != null) (windowsWin32NetworkmanagementDnsNapiAddon.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(pdnsbuffer.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pszname.rawAddress.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
