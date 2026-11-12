@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.winhttp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingWinhttpNapiAddon(): Boolean

private val windowsWin32NetworkingWinhttpNapiAvailable: Boolean = initWindowsWin32NetworkingWinhttpNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform()")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpConnect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpConnect(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpOpen(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpOpen(p0: String, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpReadData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadData(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetStatusCallback(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(p0: String, p1: Int, p2: String): Int

public actual fun winHttpAddRequestHeaders(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeaders(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpAddRequestHeadersEx(hrequest: MutPtr<CVoid>, dwmodifiers: UInt, ullflags: ULong, ullextra: ULong, cheaders: UInt, pheaders: ConstPtr<WinhttpExtendedHeader>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpAddRequestHeadersEx(hrequest.rawAddress.toString(), dwmodifiers.toInt(), ullflags.toString(), ullextra.toString(), cheaders.toInt(), pheaders.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCheckPlatform(): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCheckPlatform() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCloseHandle(hinternet: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCloseHandle(hinternet.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpConnect(hsession: MutPtr<CVoid>, pswzservername: Pcwstr, nserverport: UShort, dwreserved: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpConnect(hsession.rawAddress.toString(), pswzservername.rawAddress.toString(), nserverport.toInt(), dwreserved.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCrackUrl(pwszurl: Pcwstr, dwurllength: UInt, dwflags: UInt, lpurlcomponents: MutPtr<UrlComponents>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCrackUrl(pwszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateProxyResolver(hsession: ConstPtr<CVoid>, phresolver: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCreateProxyResolver(hsession.rawAddress.toString(), phresolver.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpCreateUrl(lpurlcomponents: ConstPtr<UrlComponents>, dwflags: WinHttpCreateUrlFlags, pwszurl: Pwstr, pdwurllength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpCreateUrl(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), pwszurl.rawAddress.toString(), pdwurllength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpDetectAutoProxyConfigUrl(dwautodetectflags: UInt, ppwstrautoconfigurl: MutPtr<Pwstr>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpDetectAutoProxyConfigUrl(dwautodetectflags.toInt(), ppwstrautoconfigurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeProxyResult(pproxyresult: MutPtr<WinhttpProxyResult>) {
    if (windowsWin32NetworkingWinhttpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResult(pproxyresult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxyResultEx(pproxyresultex: MutPtr<WinhttpProxyResultEx>) {
    if (windowsWin32NetworkingWinhttpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxyResultEx(pproxyresultex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettings(pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>) {
    if (windowsWin32NetworkingWinhttpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettings(pwinhttpproxysettings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpFreeProxySettingsEx(proxysettingstype: WinhttpProxySettingsType, pproxysettingsex: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeProxySettingsEx(proxysettingstype, pproxysettingsex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpFreeQueryConnectionGroupResult(presult: MutPtr<WinhttpQueryConnectionGroupResult>) {
    if (windowsWin32NetworkingWinhttpNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpFreeQueryConnectionGroupResult(presult.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun winHttpGetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetIEProxyConfigForCurrentUser(pproxyconfig: MutPtr<WinhttpCurrentUserIeProxyConfig>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetIEProxyConfigForCurrentUser(pproxyconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrl(hsession: MutPtr<CVoid>, lpcwszurl: Pcwstr, pautoproxyoptions: MutPtr<WinhttpAutoproxyOptions>, pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrl(hsession.rawAddress.toString(), lpcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pproxyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), pcontext.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyForUrlEx2(hresolver: ConstPtr<CVoid>, pcwszurl: Pcwstr, pautoproxyoptions: ConstPtr<WinhttpAutoproxyOptions>, cbinterfaceselectioncontext: UInt, pinterfaceselectioncontext: ConstPtr<UByte>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyForUrlEx2(hresolver.rawAddress.toString(), pcwszurl.rawAddress.toString(), pautoproxyoptions.rawAddress.toString(), cbinterfaceselectioncontext.toInt(), pinterfaceselectioncontext.rawAddress.toString(), pcontext.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResult(hresolver: ConstPtr<CVoid>, pproxyresult: MutPtr<WinhttpProxyResult>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResult(hresolver.rawAddress.toString(), pproxyresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxyResultEx(hresolver: ConstPtr<CVoid>, pproxyresultex: MutPtr<WinhttpProxyResultEx>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxyResultEx(hresolver.rawAddress.toString(), pproxyresultex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsEx(hresolver: ConstPtr<CVoid>, proxysettingstype: WinhttpProxySettingsType, pproxysettingsparam: ConstPtr<WinhttpProxySettingsParam>, pcontext: ULong): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsEx(hresolver.rawAddress.toString(), proxysettingstype, pproxysettingsparam.rawAddress.toString(), pcontext.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsResultEx(hresolver: ConstPtr<CVoid>, pproxysettingsex: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsResultEx(hresolver.rawAddress.toString(), pproxysettingsex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpGetProxySettingsVersion(hsession: ConstPtr<CVoid>, pdwproxysettingsversion: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpGetProxySettingsVersion(hsession.rawAddress.toString(), pdwproxysettingsversion.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpen(pszagentw: Pcwstr, dwaccesstype: WinhttpAccessType, pszproxyw: Pcwstr, pszproxybypassw: Pcwstr, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpOpen(pszagentw.rawAddress.toString(), dwaccesstype.toInt(), pszproxyw.rawAddress.toString(), pszproxybypassw.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpOpenRequest(hconnect: MutPtr<CVoid>, pwszverb: Pcwstr, pwszobjectname: Pcwstr, pwszversion: Pcwstr, pwszreferrer: Pcwstr, ppwszaccepttypes: ConstPtr<Pcwstr>, dwflags: WinhttpOpenRequestFlags): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpOpenRequest(hconnect.rawAddress.toString(), pwszverb.rawAddress.toString(), pwszobjectname.rawAddress.toString(), pwszversion.rawAddress.toString(), pwszreferrer.rawAddress.toString(), ppwszaccepttypes.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryAuthSchemes(hrequest: MutPtr<CVoid>, lpdwsupportedschemes: MutPtr<UInt>, lpdwfirstscheme: MutPtr<UInt>, pdwauthtarget: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryAuthSchemes(hrequest.rawAddress.toString(), lpdwsupportedschemes.rawAddress.toString(), lpdwfirstscheme.rawAddress.toString(), pdwauthtarget.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryConnectionGroup(hinternet: ConstPtr<CVoid>, pguidconnection: ConstPtr<Guid>, ullflags: ULong, ppresult: MutPtr<MutPtr<WinhttpQueryConnectionGroupResult>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryConnectionGroup(hinternet.rawAddress.toString(), pguidconnection.rawAddress.toString(), ullflags.toString(), ppresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryDataAvailable(hrequest: MutPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryDataAvailable(hrequest.rawAddress.toString(), lpdwnumberofbytesavailable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeaders(hrequest: MutPtr<CVoid>, dwinfolevel: UInt, pwszname: Pcwstr, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeaders(hrequest.rawAddress.toString(), dwinfolevel.toInt(), pwszname.rawAddress.toString(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryHeadersEx(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, ullflags: ULong, uicodepage: UInt, pdwindex: MutPtr<UInt>, pheadername: ConstPtr<WinhttpHeaderName>, pbuffer: MutPtr<CVoid>, pdwbufferlength: MutPtr<UInt>, ppheaders: MutPtr<MutPtr<WinhttpExtendedHeader>>, pdwheaderscount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryHeadersEx(hrequest.rawAddress.toString(), dwinfolevel.toInt(), ullflags.toString(), uicodepage.toInt(), pdwindex.rawAddress.toString(), pheadername.rawAddress.toString(), pbuffer.rawAddress.toString(), pdwbufferlength.rawAddress.toString(), ppheaders.rawAddress.toString(), pdwheaderscount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpQueryOption(hinternet: MutPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpQueryOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadData(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadDataEx(hrequest: MutPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>, ullflags: ULong, cbproperty: UInt, pvproperty: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadDataEx(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString(), ullflags.toString(), cbproperty.toInt(), pvproperty.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReadProxySettings(hsession: ConstPtr<CVoid>, pcwszconnectionname: Pcwstr, ffallbacktodefaultsettings: Bool, fsetautodiscoverfordefaultsettings: Bool, pdwsettingsversion: MutPtr<UInt>, pfdefaultsettingsarereturned: MutPtr<Bool>, pwinhttpproxysettings: MutPtr<WinhttpProxySettings>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReadProxySettings(hsession.rawAddress.toString(), pcwszconnectionname.rawAddress.toString(), ffallbacktodefaultsettings, fsetautodiscoverfordefaultsettings, pdwsettingsversion.rawAddress.toString(), pfdefaultsettingsarereturned.rawAddress.toString(), pwinhttpproxysettings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpReceiveResponse(hrequest: MutPtr<CVoid>, lpreserved: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpReceiveResponse(hrequest.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpRegisterProxyChangeNotification(ullflags: ULong, pfncallback: WinhttpProxyChangeCallback, pvcontext: ConstPtr<CVoid>, hregistration: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpRegisterProxyChangeNotification(ullflags.toString(), 0L.toString(), pvcontext.rawAddress.toString(), hregistration.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpResetAutoProxy(hsession: ConstPtr<CVoid>, dwflags: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpResetAutoProxy(hsession.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSendRequest(hrequest: MutPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt, dwtotallength: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSendRequest(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt(), dwtotallength.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetCredentials(hrequest: MutPtr<CVoid>, authtargets: UInt, authscheme: UInt, pwszusername: Pcwstr, pwszpassword: Pcwstr, pauthparams: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetCredentials(hrequest.rawAddress.toString(), authtargets.toInt(), authscheme.toInt(), pwszusername.rawAddress.toString(), pwszpassword.rawAddress.toString(), pauthparams.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetDefaultProxyConfiguration(pproxyinfo: MutPtr<WinhttpProxyInfo>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetDefaultProxyConfiguration(pproxyinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetOption(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetOption(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetProxySettingsPerUser(fproxysettingsperuser: Bool): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetProxySettingsPerUser(fproxysettingsperuser).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetStatusCallback(hinternet: MutPtr<CVoid>, lpfninternetcallback: WinhttpStatusCallback, dwnotificationflags: UInt, dwreserved: ULong): WinhttpStatusCallback =
    if (windowsWin32NetworkingWinhttpNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpSetTimeouts(hinternet: MutPtr<CVoid>, nresolvetimeout: Int, nconnecttimeout: Int, nsendtimeout: Int, nreceivetimeout: Int): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpSetTimeouts(hinternet.rawAddress.toString(), nresolvetimeout, nconnecttimeout, nsendtimeout, nreceivetimeout) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeFromSystemTime(pst: ConstPtr<Systemtime>, pwsztime: Pwstr): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpTimeFromSystemTime(pst.rawAddress.toString(), pwsztime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpTimeToSystemTime(pwsztime: Pcwstr, pst: MutPtr<Systemtime>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpTimeToSystemTime(pwsztime.rawAddress.toString(), pst.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpUnregisterProxyChangeNotification(hregistration: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpUnregisterProxyChangeNotification(hregistration.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketClose(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, pcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWinhttpNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toString(), pcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toString(), pusstatus.rawAddress.toString(), pvreason.rawAddress.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pebuffertype: MutPtr<WinhttpWebSocketBufferType>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketReceive(hwebsocket.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbytesread.rawAddress.toString(), pebuffertype.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketSend(hwebsocket: ConstPtr<CVoid>, ebuffertype: WinhttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketSend(hwebsocket.rawAddress.toString(), ebuffertype, pvbuffer.rawAddress.toString(), dwbufferlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWebSocketShutdown(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteData(hrequest: MutPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWriteData(hrequest.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHttpWriteProxySettings(hsession: ConstPtr<CVoid>, fforceupdate: Bool, pwinhttpproxysettings: ConstPtr<WinhttpProxySettings>): UInt =
    if (windowsWin32NetworkingWinhttpNapiAvailable) wasmWindowssysWindowsWin32NetworkingWinhttpWinHttpWriteProxySettings(hsession.rawAddress.toString(), fforceupdate, pwinhttpproxysettings.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
