@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32NetworkingHttpserverNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr, cachepolicy: ConstPtr, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), datachunk.rawAddress.toString(), cachepolicy.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(requestqueuehandle.rawAddress.toString(), fullyqualifiedurl.rawAddress.toString(), reserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.rawAddress.toString(), urlcontext.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(requestqueuehandle.rawAddress.toString(), requestid.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(requestqueuehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateHttpHandle(requestqueuehandle: MutPtr, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(requestqueuehandle.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr, flags: UInt, requestqueuehandle: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr, reserved: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(serversessionid.toString(), purlgroupid.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(requestqueuehandle.rawAddress.toString(), requestid.toString(), verb, path.rawAddress.toString(), query.rawAddress.toString(), headers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(requestqueuehandle.rawAddress.toString(), delegatequeuehandle.rawAddress.toString(), requestid.toString(), delegateurlgroupid.toString(), propertyinfosetsize.toInt(), propertyinfoset.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(servicehandle.rawAddress.toString(), configid, pconfiginformation.rawAddress.toString(), configinformationlength.toInt(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(fullyqualifiedurl.rawAddress.toString(), requestqueuehandle.rawAddress.toString(), urlgroupid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), flags.toInt(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr, buffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPrepareUrl(reserved: ConstPtr, flags: UInt, url: Pcwstr, preparedurl: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(reserved.rawAddress.toString(), flags.toInt(), url.rawAddress.toString(), preparedurl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr, reserved2: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(requestqueuehandle.rawAddress.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), reserved1.toInt(), returnlength.rawAddress.toString(), reserved2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(serversessionid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), returnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr, inputlength: UInt, poutput: MutPtr, outputlength: UInt, preturnlength: MutPtr, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(servicehandle.rawAddress.toString(), configid, pinput.rawAddress.toString(), inputlength.toInt(), poutput.rawAddress.toString(), outputlength.toInt(), preturnlength.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), returnlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr, buffer: MutPtr, bufferlength: UInt, bytesread: MutPtr, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(requestqueuehandle.rawAddress.toString(), urlprefix.rawAddress.toString(), byterange.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt(), bytesread.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr, sslclientcertinfosize: UInt, bytesreceived: MutPtr, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(requestqueuehandle.rawAddress.toString(), connectionid.toString(), flags.toInt(), sslclientcertinfo.rawAddress.toString(), sslclientcertinfosize.toInt(), bytesreceived.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr, requestbufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), requestbuffer.rawAddress.toString(), requestbufferlength.toInt(), bytesreturned.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr, entitybufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), entitybuffer.rawAddress.toString(), entitybufferlength.toInt(), bytesreturned.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(requestqueuehandle.rawAddress.toString(), fullyqualifiedurl.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr, cachepolicy: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), httpresponse.rawAddress.toString(), cachepolicy.rawAddress.toString(), bytessent.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), overlapped.rawAddress.toString(), logdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(requestqueuehandle.rawAddress.toString(), requestid.toString(), flags.toInt(), entitychunkcount.toInt(), entitychunks.rawAddress.toString(), bytessent.rawAddress.toString(), reserved1.rawAddress.toString(), reserved2.toInt(), overlapped.rawAddress.toString(), logdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr, inputpropertysize: UInt, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(requestqueuehandle.rawAddress.toString(), id.toString(), propertyid, input.rawAddress.toString(), inputpropertysize.toInt(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(requestqueuehandle.rawAddress.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt(), reserved1.toInt(), reserved2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(serversessionid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(servicehandle.rawAddress.toString(), configid, pconfiginformation.rawAddress.toString(), configinformationlength.toInt(), poverlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.rawAddress.toString(), propertyinformationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(requestqueuehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpTerminate(flags: HttpInitialize, preserved: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpTerminate(flags.toInt(), preserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr, configinfolength: UInt, overlapped: ConstPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(handle.rawAddress.toString(), configid, configinfo.rawAddress.toString(), configinfolength.toInt(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(requestqueuehandle.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(requestqueuehandle.rawAddress.toString(), connectionid.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr): UInt =
    if (windowsWin32NetworkingHttpserverNapiAddon != null) (windowsWin32NetworkingHttpserverNapiAddon.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(requestqueuehandle.rawAddress.toString(), connectionid.toString(), reserved.toInt(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
