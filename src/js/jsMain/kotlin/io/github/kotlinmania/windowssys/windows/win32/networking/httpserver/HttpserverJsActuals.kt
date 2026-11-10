@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32NetworkingHttpserverNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: COpaquePointer?, cachepolicy: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpAddFragmentToCache((requestqueuehandle?.value ?: 0L).toString(), (urlprefix?.value ?: 0L).toString(), (datachunk?.value ?: 0L).toString(), (cachepolicy?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpAddUrl((requestqueuehandle?.value ?: 0L).toString(), (fullyqualifiedurl?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpAddUrlToUrlGroup(urlgroupid.toString(), (pfullyqualifiedurl?.value ?: 0L).toString(), urlcontext.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCancelHttpRequest((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCloseRequestQueue((requestqueuehandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCloseServerSession(serversessionid.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCloseUrlGroup(urlgroupid.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateHttpHandle(requestqueuehandle: COpaquePointer?, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCreateHttpHandle((requestqueuehandle?.value ?: 0L).toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: COpaquePointer?, flags: UInt, requestqueuehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: COpaquePointer?, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: COpaquePointer?, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpCreateUrlGroup(serversessionid.toString(), (purlgroupid?.value ?: 0L).toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpDeclarePush((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), verb, (path?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (headers?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpDelegateRequestEx((requestqueuehandle?.value ?: 0L).toString(), (delegatequeuehandle?.value ?: 0L).toString(), requestid.toString(), delegateurlgroupid.toString(), propertyinfosetsize.toInt(), (propertyinfoset?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpDeleteServiceConfiguration((servicehandle?.value ?: 0L).toString(), configid, (pconfiginformation?.value ?: 0L).toString(), configinformationlength.toInt(), (poverlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpFindUrlGroupId((fullyqualifiedurl?.value ?: 0L).toString(), (requestqueuehandle?.value ?: 0L).toString(), (urlgroupid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpFlushResponseCache((requestqueuehandle?.value ?: 0L).toString(), (urlprefix?.value ?: 0L).toString(), flags.toInt(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpIsFeatureSupported(featureid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPrepareUrl(reserved: COpaquePointer?, flags: UInt, url: Pcwstr, preparedurl: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpPrepareUrl((reserved?.value ?: 0L).toString(), flags.toInt(), (url?.value ?: 0L).toString(), (preparedurl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, returnlength: COpaquePointer?, reserved2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpQueryRequestQueueProperty((requestqueuehandle?.value ?: 0L).toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt(), reserved1.toInt(), (returnlength?.value ?: 0L).toString(), (reserved2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpQueryServerSessionProperty(serversessionid.toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: COpaquePointer?, inputlength: UInt, poutput: COpaquePointer?, outputlength: UInt, preturnlength: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpQueryServiceConfiguration((servicehandle?.value ?: 0L).toString(), configid, (pinput?.value ?: 0L).toString(), inputlength.toInt(), (poutput?.value ?: 0L).toString(), outputlength.toInt(), (preturnlength?.value ?: 0L).toString(), (poverlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpQueryUrlGroupProperty(urlgroupid.toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, bytesread: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpReadFragmentFromCache((requestqueuehandle?.value ?: 0L).toString(), (urlprefix?.value ?: 0L).toString(), (byterange?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt(), (bytesread?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: COpaquePointer?, sslclientcertinfosize: UInt, bytesreceived: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpReceiveClientCertificate((requestqueuehandle?.value ?: 0L).toString(), connectionid.toString(), flags.toInt(), (sslclientcertinfo?.value ?: 0L).toString(), sslclientcertinfosize.toInt(), (bytesreceived?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: COpaquePointer?, requestbufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpReceiveHttpRequest((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), flags.toInt(), (requestbuffer?.value ?: 0L).toString(), requestbufferlength.toInt(), (bytesreturned?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: COpaquePointer?, entitybufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpReceiveRequestEntityBody((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), flags.toInt(), (entitybuffer?.value ?: 0L).toString(), entitybufferlength.toInt(), (bytesreturned?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpRemoveUrl((requestqueuehandle?.value ?: 0L).toString(), (fullyqualifiedurl?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpRemoveUrlFromUrlGroup(urlgroupid.toString(), (pfullyqualifiedurl?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: COpaquePointer?, cachepolicy: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSendHttpResponse((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), flags.toInt(), (httpresponse?.value ?: 0L).toString(), (cachepolicy?.value ?: 0L).toString(), (bytessent?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt(), (overlapped?.value ?: 0L).toString(), (logdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSendResponseEntityBody((requestqueuehandle?.value ?: 0L).toString(), requestid.toString(), flags.toInt(), entitychunkcount.toInt(), (entitychunks?.value ?: 0L).toString(), (bytessent?.value ?: 0L).toString(), (reserved1?.value ?: 0L).toString(), reserved2.toInt(), (overlapped?.value ?: 0L).toString(), (logdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: COpaquePointer?, inputpropertysize: UInt, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSetRequestProperty((requestqueuehandle?.value ?: 0L).toString(), id.toString(), propertyid, (input?.value ?: 0L).toString(), inputpropertysize.toInt(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, reserved2: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSetRequestQueueProperty((requestqueuehandle?.value ?: 0L).toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSetServerSessionProperty(serversessionid.toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSetServiceConfiguration((servicehandle?.value ?: 0L).toString(), configid, (pconfiginformation?.value ?: 0L).toString(), configinformationlength.toInt(), (poverlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpSetUrlGroupProperty(urlgroupid.toString(), property, (propertyinformation?.value ?: 0L).toString(), propertyinformationlength.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpShutdownRequestQueue((requestqueuehandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpTerminate(flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpTerminate(flags.toInt(), (preserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: COpaquePointer?, configinfolength: UInt, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpUpdateServiceConfiguration((handle?.value ?: 0L).toString(), configid, (configinfo?.value ?: 0L).toString(), configinfolength.toInt(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpWaitForDemandStart((requestqueuehandle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnect((requestqueuehandle?.value ?: 0L).toString(), connectionid.toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: COpaquePointer?): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnectEx((requestqueuehandle?.value ?: 0L).toString(), connectionid.toString(), reserved.toInt(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
