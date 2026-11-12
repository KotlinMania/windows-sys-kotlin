@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementDnsNapiAddon(): Boolean

private val windowsWin32NetworkmanagementDnsNapiAvailable: Boolean = initWindowsWin32NetworkmanagementDnsNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFree(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsQueryW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: String, p9: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleA(credentialflags.toInt(), credentials.rawAddress.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: ConstPtr<CVoid>, pcontext: MutPtr<Handle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsAcquireContextHandleW(credentialflags.toInt(), credentials.rawAddress.toString(), pcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQuery(pcancelhandle: ConstPtr<DnsQueryCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsCancelQuery(pcancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQueryRaw(cancelhandle: ConstPtr<DnsQueryRawCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsCancelQueryRaw(cancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeletePolicyEntries(policyentrytag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionDeleteProxyInfo(pwszconnectionname.rawAddress.toString(), type).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionFreeNameList(pnamelist: MutPtr<DnsConnectionNameList>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeNameList(pnamelist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: MutPtr<DnsConnectionProxyInfo>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfo(pproxyinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyInfoEx(pproxyinfoex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyList(pproxylist: MutPtr<DnsConnectionProxyList>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionFreeProxyList(pproxylist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionGetNameList(pnamelist: MutPtr<DnsConnectionNameList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetNameList(pnamelist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: MutPtr<DnsConnectionProxyInfo>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfo(pwszconnectionname.rawAddress.toString(), type, pproxyinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrl(pwszhosturl.rawAddress.toString(), pselectioncontext.rawAddress.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pproxyinfoex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: ConstPtr<UByte>, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: MutPtr<DnsConnectionProxyInfoEx>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl.rawAddress.toString(), pselectioncontext.rawAddress.toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), pwszconnectionname.rawAddress.toString(), pproxyinfoex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: MutPtr<DnsConnectionProxyList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionGetProxyList(pwszconnectionname.rawAddress.toString(), pproxylist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: ConstPtr<DnsConnectionPolicyEntryList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetPolicyEntries(policyentrytag, ppolicyentrylist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: ConstPtr<DnsConnectionProxyInfo>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionSetProxyInfo(pwszconnectionname.rawAddress.toString(), type, pproxyinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: ConstPtr<DnsConnectionIfindexList>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsConnectionUpdateIfIndexTable(pconnectionifindexentries.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageUtf8(pdnsbuffer.rawAddress.toString(), wmessagelength.toInt(), pprecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: ConstPtr<DnsMessageBuffer>, wmessagelength: UShort, pprecord: MutPtr<MutPtr<DnsRecorda>>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsExtractRecordsFromMessageW(pdnsbuffer.rawAddress.toString(), wmessagelength.toInt(), pprecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsFree(pdata: ConstPtr<CVoid>, freetype: DnsFreeType) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFree(pdata.rawAddress.toString(), freetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeCustomServers(pcservers: MutPtr<UInt>, ppservers: MutPtr<MutPtr<DnsCustomServer>>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFreeCustomServers(pcservers.rawAddress.toString(), ppservers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsFreeProxyName(proxyname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsGetApplicationSettings(pcservers: MutPtr<UInt>, ppdefaultservers: MutPtr<MutPtr<DnsCustomServer>>, psettings: MutPtr<DnsApplicationSettings>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsGetApplicationSettings(pcservers.rawAddress.toString(), ppdefaultservers.rawAddress.toString(), psettings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: MutPtr<DnsProxyInformation>, defaultproxyinformation: MutPtr<DnsProxyInformation>, completionroutine: DnsProxyCompletionRoutine, completioncontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsGetProxyInformation(hostname.rawAddress.toString(), proxyinformation.rawAddress.toString(), defaultproxyinformation.rawAddress.toString(), 0L.toString(), completioncontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetA(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetA(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetUtf8(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetW(paddrecords: ConstPtr<DnsRecorda>, pdeleterecords: ConstPtr<DnsRecorda>, options: UInt, hcredentials: Handle, pextralist: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsModifyRecordsInSetW(paddrecords.rawAddress.toString(), pdeleterecords.rawAddress.toString(), options.toInt(), hcredentials.rawAddress.toString(), pextralist.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsNameCompareA(pname1.rawAddress.toString(), pname2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsNameCompareW(pname1.rawAddress.toString(), pname2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: ConstPtr<CVoid>, pbuffer: MutPtr<CVoid>, pbuflen: MutPtr<UInt>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryConfig(config, flag.toInt(), pwsadaptername.rawAddress.toString(), preserved.rawAddress.toString(), pbuffer.rawAddress.toString(), pbuflen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryEx(pqueryrequest: ConstPtr<DnsQueryRequest>, pqueryresults: MutPtr<DnsQueryResult>, pcancelhandle: MutPtr<DnsQueryCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryEx(pqueryrequest.rawAddress.toString(), pqueryresults.rawAddress.toString(), pcancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRaw(queryrequest: ConstPtr<DnsQueryRawRequest>, cancelhandle: MutPtr<DnsQueryRawCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryRaw(queryrequest.rawAddress.toString(), cancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRawResultFree(queryresults: ConstPtr<DnsQueryRawResult>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryRawResultFree(queryresults.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryA(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryUtf8(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: MutPtr<CVoid>, ppqueryresults: MutPtr<MutPtr<DnsRecorda>>, preserved: MutPtr<MutPtr<CVoid>>): Win32Error =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsQueryW(pszname.rawAddress.toString(), wtype.toInt(), options.toInt(), pextra.rawAddress.toString(), ppqueryresults.rawAddress.toString(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCompare(precord1: ConstPtr<DnsRecorda>, precord2: ConstPtr<DnsRecorda>): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordCompare(precord1.rawAddress.toString(), precord2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCopyEx(precord: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordCopyEx(precord.rawAddress.toString(), charsetin, charsetout).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCompare(prr1: MutPtr<DnsRecorda>, prr2: MutPtr<DnsRecorda>, ppdiff1: MutPtr<MutPtr<DnsRecorda>>, ppdiff2: MutPtr<MutPtr<DnsRecorda>>): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCompare(prr1.rawAddress.toString(), prr2.rawAddress.toString(), ppdiff1.rawAddress.toString(), ppdiff2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCopyEx(precordset: ConstPtr<DnsRecorda>, charsetin: DnsCharset, charsetout: DnsCharset): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetCopyEx(precordset.rawAddress.toString(), charsetin, charsetout).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetDetach(precordlist: MutPtr<DnsRecorda>): MutPtr<DnsRecorda> =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDnsDnsRecordSetDetach(precordlist.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReleaseContextHandle(hcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsReplaceRecordSetA(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetA(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetUTF8(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetUTF8(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetW(preplaceset: ConstPtr<DnsRecorda>, options: UInt, hcontext: Handle, pextrainfo: MutPtr<CVoid>, preserved: MutPtr<CVoid>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsReplaceRecordSetW(preplaceset.rawAddress.toString(), options.toInt(), hcontext.rawAddress.toString(), pextrainfo.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowse(prequest: ConstPtr<DnsServiceBrowseRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowse(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowseCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceBrowseCancel(pcancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: ConstPtr<UInt>, pip6: ConstPtr<Ip6Address>, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: ConstPtr<Pcwstr>, values: ConstPtr<Pcwstr>): MutPtr<DnsServiceInstance> =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceConstructInstance(pservicename.rawAddress.toString(), phostname.rawAddress.toString(), pip4.rawAddress.toString(), pip6.rawAddress.toString(), wport.toInt(), wpriority.toInt(), wweight.toInt(), dwpropertiescount.toInt(), keys.rawAddress.toString(), values.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceCopyInstance(porig: ConstPtr<DnsServiceInstance>): MutPtr<DnsServiceInstance> =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceCopyInstance(porig.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceDeRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceDeRegister(prequest.rawAddress.toString(), pcancel.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceFreeInstance(pinstance: ConstPtr<DnsServiceInstance>) {
    if (windowsWin32NetworkmanagementDnsNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceFreeInstance(pinstance.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsServiceRegister(prequest: ConstPtr<DnsServiceRegisterRequest>, pcancel: MutPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceRegister(prequest.rawAddress.toString(), pcancel.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceRegisterCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceRegisterCancel(pcancelhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolve(prequest: ConstPtr<DnsServiceResolveRequest>, pcancel: MutPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceResolve(prequest.rawAddress.toString(), pcancel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolveCancel(pcancelhandle: ConstPtr<DnsServiceCancel>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsServiceResolveCancel(pcancelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: ConstPtr<DnsCustomServer>, psettings: ConstPtr<DnsApplicationSettings>): UInt =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsSetApplicationSettings(cservers.toInt(), pservers.rawAddress.toString(), psettings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStartMulticastQuery(pqueryrequest: ConstPtr<MdnsQueryRequest>, phandle: MutPtr<MdnsQueryHandle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsStartMulticastQuery(pqueryrequest.rawAddress.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStopMulticastQuery(phandle: MutPtr<MdnsQueryHandle>): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsStopMulticastQuery(phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameA(pszname.rawAddress.toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameUtf8(pszname.rawAddress.toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsValidateNameW(pszname.rawAddress.toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferUtf8(pdnsbuffer.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pszname.rawAddress.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: MutPtr<DnsMessageBuffer>, pdwbuffersize: MutPtr<UInt>, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (windowsWin32NetworkmanagementDnsNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementDnsDnsWriteQuestionToBufferW(pdnsbuffer.rawAddress.toString(), pdwbuffersize.rawAddress.toString(), pszname.rawAddress.toString(), wtype.toInt(), xid.toInt(), frecursiondesired) else throw UnsupportedOperationException("Native FFI addon is not available")
