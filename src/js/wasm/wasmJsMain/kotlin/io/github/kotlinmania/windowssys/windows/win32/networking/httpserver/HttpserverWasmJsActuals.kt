@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingHttpserverNapiAddon(): Boolean

private val windowsWin32NetworkingHttpserverNapiAvailable: Boolean = initWindowsWin32NetworkingHttpserverNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddUrl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpTerminate(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpTerminate(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr<HttpDataChunk>, cachepolicy: ConstPtr<HttpCachePolicy>, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), datachunk.rawAddress.toString(), cachepolicy.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddUrl(requestqueuehandle.rawAddress.toString(), fullyqualifiedurl.rawAddress.toString(), reserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.rawAddress.toString(), urlcontext.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(requestqueuehandle.rawAddress.toString(), requestid.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(requestqueuehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateHttpHandle(requestqueuehandle: MutPtr<Handle>, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(requestqueuehandle.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr<SecurityAttributes>, flags: UInt, requestqueuehandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr<ULong>, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr<ULong>, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(serversessionid.toString(), purlgroupid.rawAddress.toString(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr<HttpRequestHeaders>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(requestqueuehandle.rawAddress.toString(), requestid.toString(), verb, path.rawAddress.toString(), query.rawAddress.toString(), headers.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr<HttpDelegateRequestPropertyInfo>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(requestqueuehandle.rawAddress.toString(), delegatequeuehandle.rawAddress.toString(), requestid.toString(), delegateurlgroupid.toString(), propertyinfosetsize.toInt(), propertyinfoset.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(servicehandle.rawAddress.toString(), configid, pconfiginformation.rawAddress.toString(), configinformationlength.toInt(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(fullyqualifiedurl.rawAddress.toString(), requestqueuehandle.rawAddress.toString(), urlgroupid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr<CVoid>, buffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPrepareUrl(reserved: ConstPtr<CVoid>, flags: UInt, url: Pcwstr, preparedurl: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(reserved.rawAddress.toString(), flags.toInt(), url.rawAddress.toString(), preparedurl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr<UInt>, reserved2: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(requestqueuehandle.rawAddress.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), reserved1.toInt(), returnlength.rawAddress.toString(), reserved2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(serversessionid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), returnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr<CVoid>, inputlength: UInt, poutput: MutPtr<CVoid>, outputlength: UInt, preturnlength: MutPtr<UInt>, poverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(servicehandle.rawAddress.toString(), configid, pinput.rawAddress.toString(), inputlength.toInt(), poutput.rawAddress.toString(), outputlength.toInt(), preturnlength.rawAddress.toString(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), returnlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr<HttpByteRange>, buffer: MutPtr<CVoid>, bufferlength: UInt, bytesread: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), byterange.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt(), bytesread.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr<HttpSslClientCertInfo>, sslclientcertinfosize: UInt, bytesreceived: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(requestqueuehandle.rawAddress.toString(), connectionid.toString(), flags.toInt(), sslclientcertinfo.rawAddress.toString(), sslclientcertinfosize.toInt(), bytesreceived.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr<HttpRequestV2>, requestbufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), requestbuffer.rawAddress.toString(), requestbufferlength.toInt(), bytesreturned.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr<CVoid>, entitybufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), entitybuffer.rawAddress.toString(), entitybufferlength.toInt(), bytesreturned.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(requestqueuehandle.rawAddress.toString(), fullyqualifiedurl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr<HttpResponseV2>, cachepolicy: ConstPtr<HttpCachePolicy>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), httpresponse.rawAddress.toString(), cachepolicy.rawAddress.toString(), bytessent.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), overlapped.rawAddress.toString(), logdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr<HttpDataChunk>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), entitychunkcount.toInt(), entitychunks.rawAddress.toString(), bytessent.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), overlapped.rawAddress.toString(), logdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr<CVoid>, inputpropertysize: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(requestqueuehandle.rawAddress.toString(), id.toString(), propertyid, input.rawAddress.toString(), inputpropertysize.toInt(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(requestqueuehandle.rawAddress.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(serversessionid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(servicehandle.rawAddress.toString(), configid, pconfiginformation.rawAddress.toString(), configinformationlength.toInt(), poverlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(requestqueuehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpTerminate(flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpTerminate(flags.toInt(), preserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr<CVoid>, configinfolength: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(handle.rawAddress.toString(), configid, configinfo.rawAddress.toString(), configinfolength.toInt(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(requestqueuehandle.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(requestqueuehandle.rawAddress.toString(), connectionid.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr<Overlapped>): UInt =
    if (windowsWin32NetworkingHttpserverNapiAvailable) wasmWindowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(requestqueuehandle.rawAddress.toString(), connectionid.toString(), reserved.toInt(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
