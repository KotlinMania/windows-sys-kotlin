@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32NetworkmanagementDnsNapiAddon(): Boolean

private val _windowsWin32NetworkmanagementDnsNapiAvailable: Boolean = _initWindowsWin32NetworkmanagementDnsNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsFree(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFree(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryEx(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryA(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsQueryW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: String, p9: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery(p0)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW(p0, p1)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int): Int

public actual fun dnsAcquireContextHandleA(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleA(credentialflags.toInt(), (credentials?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsAcquireContextHandleW(credentialflags: UInt, credentials: COpaquePointer?, pcontext: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsAcquireContextHandleW(credentialflags.toInt(), (credentials?.value ?: 0L).toString(), (pcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQuery(pcancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsCancelQuery((pcancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsCancelQueryRaw(cancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsCancelQueryRaw((cancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeletePolicyEntries(policyentrytag: DnsConnectionPolicyTag): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeletePolicyEntries(policyentrytag).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionDeleteProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionDeleteProxyInfo((pwszconnectionname?.value ?: 0L).toString(), type).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionFreeNameList(pnamelist: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeNameList((pnamelist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfo(pproxyinfo: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfo((pproxyinfo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyInfoEx(pproxyinfoex: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyInfoEx((pproxyinfoex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionFreeProxyList(pproxylist: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionFreeProxyList((pproxylist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsConnectionGetNameList(pnamelist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetNameList((pnamelist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfo((pwszconnectionname?.value ?: 0L).toString(), type, (pproxyinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrl(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pproxyinfoex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrl((pwszhosturl?.value ?: 0L).toString(), (pselectioncontext?.value ?: 0L).toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), (pproxyinfoex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyInfoForHostUrlEx(pwszhosturl: Pcwstr, pselectioncontext: COpaquePointer?, dwselectioncontextlength: UInt, dwexplicitinterfaceindex: UInt, pwszconnectionname: Pcwstr, pproxyinfoex: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyInfoForHostUrlEx((pwszhosturl?.value ?: 0L).toString(), (pselectioncontext?.value ?: 0L).toString(), dwselectioncontextlength.toInt(), dwexplicitinterfaceindex.toInt(), (pwszconnectionname?.value ?: 0L).toString(), (pproxyinfoex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionGetProxyList(pwszconnectionname: Pcwstr, pproxylist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionGetProxyList((pwszconnectionname?.value ?: 0L).toString(), (pproxylist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetPolicyEntries(policyentrytag: DnsConnectionPolicyTag, ppolicyentrylist: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetPolicyEntries(policyentrytag, (ppolicyentrylist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionSetProxyInfo(pwszconnectionname: Pcwstr, type: DnsConnectionProxyType, pproxyinfo: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionSetProxyInfo((pwszconnectionname?.value ?: 0L).toString(), type, (pproxyinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsConnectionUpdateIfIndexTable(pconnectionifindexentries: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsConnectionUpdateIfIndexTable((pconnectionifindexentries?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageUtf8(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageUtf8((pdnsbuffer?.value ?: 0L).toString(), wmessagelength.toInt(), (pprecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsExtractRecordsFromMessageW(pdnsbuffer: COpaquePointer?, wmessagelength: UShort, pprecord: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsExtractRecordsFromMessageW((pdnsbuffer?.value ?: 0L).toString(), wmessagelength.toInt(), (pprecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsFree(pdata: COpaquePointer?, freetype: DnsFreeType) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFree((pdata?.value ?: 0L).toString(), freetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeCustomServers(pcservers: COpaquePointer?, ppservers: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFreeCustomServers((pcservers?.value ?: 0L).toString(), (ppservers?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsFreeProxyName(proxyname: Pcwstr) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsFreeProxyName((proxyname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsGetApplicationSettings(pcservers: COpaquePointer?, ppdefaultservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsGetApplicationSettings((pcservers?.value ?: 0L).toString(), (ppdefaultservers?.value ?: 0L).toString(), (psettings?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsGetProxyInformation(hostname: Pcwstr, proxyinformation: COpaquePointer?, defaultproxyinformation: COpaquePointer?, completionroutine: DnsProxyCompletionRoutine, completioncontext: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsGetProxyInformation((hostname?.value ?: 0L).toString(), (proxyinformation?.value ?: 0L).toString(), (defaultproxyinformation?.value ?: 0L).toString(), 0L.toString(), (completioncontext?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetA(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetA((paddrecords?.value ?: 0L).toString(), (pdeleterecords?.value ?: 0L).toString(), options.toInt(), (hcredentials?.value ?: 0L).toString(), (pextralist?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetUtf8(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetUtf8((paddrecords?.value ?: 0L).toString(), (pdeleterecords?.value ?: 0L).toString(), options.toInt(), (hcredentials?.value ?: 0L).toString(), (pextralist?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsModifyRecordsInSetW(paddrecords: COpaquePointer?, pdeleterecords: COpaquePointer?, options: UInt, hcredentials: Handle, pextralist: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsModifyRecordsInSetW((paddrecords?.value ?: 0L).toString(), (pdeleterecords?.value ?: 0L).toString(), options.toInt(), (hcredentials?.value ?: 0L).toString(), (pextralist?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareA(pname1: Pcstr, pname2: Pcstr): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsNameCompareA((pname1?.value ?: 0L).toString(), (pname2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsNameCompareW(pname1: Pcwstr, pname2: Pcwstr): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsNameCompareW((pname1?.value ?: 0L).toString(), (pname2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryConfig(config: DnsConfigType, flag: UInt, pwsadaptername: Pcwstr, preserved: COpaquePointer?, pbuffer: COpaquePointer?, pbuflen: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryConfig(config, flag.toInt(), (pwsadaptername?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), (pbuflen?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryEx(pqueryrequest: COpaquePointer?, pqueryresults: COpaquePointer?, pcancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryEx((pqueryrequest?.value ?: 0L).toString(), (pqueryresults?.value ?: 0L).toString(), (pcancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRaw(queryrequest: COpaquePointer?, cancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryRaw((queryrequest?.value ?: 0L).toString(), (cancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryRawResultFree(queryresults: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryRawResultFree((queryresults?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsQueryA(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryA((pszname?.value ?: 0L).toString(), wtype.toInt(), options.toInt(), (pextra?.value ?: 0L).toString(), (ppqueryresults?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryUtf8(pszname: Pcstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryUtf8((pszname?.value ?: 0L).toString(), wtype.toInt(), options.toInt(), (pextra?.value ?: 0L).toString(), (ppqueryresults?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsQueryW(pszname: Pcwstr, wtype: DnsType, options: DnsQueryOptions, pextra: COpaquePointer?, ppqueryresults: COpaquePointer?, preserved: COpaquePointer?): Win32Error =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsQueryW((pszname?.value ?: 0L).toString(), wtype.toInt(), options.toInt(), (pextra?.value ?: 0L).toString(), (ppqueryresults?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCompare(precord1: COpaquePointer?, precord2: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordCompare((precord1?.value ?: 0L).toString(), (precord2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordCopyEx(precord: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordCopyEx((precord?.value ?: 0L).toString(), charsetin, charsetout).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCompare(prr1: COpaquePointer?, prr2: COpaquePointer?, ppdiff1: COpaquePointer?, ppdiff2: COpaquePointer?): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCompare((prr1?.value ?: 0L).toString(), (prr2?.value ?: 0L).toString(), (ppdiff1?.value ?: 0L).toString(), (ppdiff2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetCopyEx(precordset: COpaquePointer?, charsetin: DnsCharset, charsetout: DnsCharset): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetCopyEx((precordset?.value ?: 0L).toString(), charsetin, charsetout).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsRecordSetDetach(precordlist: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsRecordSetDetach((precordlist?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReleaseContextHandle(hcontext: Handle) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReleaseContextHandle((hcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsReplaceRecordSetA(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetA((preplaceset?.value ?: 0L).toString(), options.toInt(), (hcontext?.value ?: 0L).toString(), (pextrainfo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetUTF8(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetUTF8((preplaceset?.value ?: 0L).toString(), options.toInt(), (hcontext?.value ?: 0L).toString(), (pextrainfo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsReplaceRecordSetW(preplaceset: COpaquePointer?, options: UInt, hcontext: Handle, pextrainfo: COpaquePointer?, preserved: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsReplaceRecordSetW((preplaceset?.value ?: 0L).toString(), options.toInt(), (hcontext?.value ?: 0L).toString(), (pextrainfo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowse(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowse((prequest?.value ?: 0L).toString(), (pcancel?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceBrowseCancel(pcancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceBrowseCancel((pcancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceConstructInstance(pservicename: Pcwstr, phostname: Pcwstr, pip4: COpaquePointer?, pip6: COpaquePointer?, wport: UShort, wpriority: UShort, wweight: UShort, dwpropertiescount: UInt, keys: COpaquePointer?, values: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceConstructInstance((pservicename?.value ?: 0L).toString(), (phostname?.value ?: 0L).toString(), (pip4?.value ?: 0L).toString(), (pip6?.value ?: 0L).toString(), wport.toInt(), wpriority.toInt(), wweight.toInt(), dwpropertiescount.toInt(), (keys?.value ?: 0L).toString(), (values?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceCopyInstance(porig: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceCopyInstance((porig?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceDeRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceDeRegister((prequest?.value ?: 0L).toString(), (pcancel?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceFreeInstance(pinstance: COpaquePointer?) {
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) {
        _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceFreeInstance((pinstance?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dnsServiceRegister(prequest: COpaquePointer?, pcancel: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceRegister((prequest?.value ?: 0L).toString(), (pcancel?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceRegisterCancel(pcancelhandle: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceRegisterCancel((pcancelhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolve(prequest: COpaquePointer?, pcancel: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceResolve((prequest?.value ?: 0L).toString(), (pcancel?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsServiceResolveCancel(pcancelhandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsServiceResolveCancel((pcancelhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsSetApplicationSettings(cservers: UInt, pservers: COpaquePointer?, psettings: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsSetApplicationSettings(cservers.toInt(), (pservers?.value ?: 0L).toString(), (psettings?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStartMulticastQuery(pqueryrequest: COpaquePointer?, phandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsStartMulticastQuery((pqueryrequest?.value ?: 0L).toString(), (phandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsStopMulticastQuery(phandle: COpaquePointer?): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsStopMulticastQuery((phandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameA(pszname: Pcstr, format: DnsNameFormat): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameA((pszname?.value ?: 0L).toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameUtf8(pszname: Pcstr, format: DnsNameFormat): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameUtf8((pszname?.value ?: 0L).toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsValidateNameW(pszname: Pcwstr, format: DnsNameFormat): Int =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsValidateNameW((pszname?.value ?: 0L).toString(), format) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferUtf8(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferUtf8((pdnsbuffer?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), wtype.toInt(), xid.toInt(), frecursiondesired) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dnsWriteQuestionToBufferW(pdnsbuffer: COpaquePointer?, pdwbuffersize: COpaquePointer?, pszname: Pcwstr, wtype: UShort, xid: UShort, frecursiondesired: Bool): Bool =
    if (_windowsWin32NetworkmanagementDnsNapiAvailable) _wasm_windowssys_windows_win32_networkmanagement_dns_dnsWriteQuestionToBufferW((pdnsbuffer?.value ?: 0L).toString(), (pdwbuffersize?.value ?: 0L).toString(), (pszname?.value ?: 0L).toString(), wtype.toInt(), xid.toInt(), frecursiondesired) else throw UnsupportedOperationException("Native FFI addon is not available")
