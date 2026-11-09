@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32NetworkingHttpserverNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(requestqueuehandle.toString(), urlprefix.toString(), datachunk.toString(), cachepolicy.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpAddUrl(requestqueuehandle.toString(), fullyqualifiedurl.toString(), reserved.toString()) as Int).toUInt() else 0u

public actual fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.toString(), urlcontext.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(requestqueuehandle.toString(), requestid.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(requestqueuehandle.toString()) as Int).toUInt() else 0u

public actual fun HttpCloseServerSession(serversessionid: ULong): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(serversessionid.toString()) as Int).toUInt() else 0u

public actual fun HttpCloseUrlGroup(urlgroupid: ULong): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(urlgroupid.toString()) as Int).toUInt() else 0u

public actual fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(requestqueuehandle.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt =
    0u

public actual fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt =
    0u

public actual fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(serversessionid.toString(), purlgroupid.toString(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpDeclarePush(requestqueuehandle.toString(), requestid.toString(), verb, path.toString(), query.toString(), headers.toString()) as Int).toUInt() else 0u

public actual fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(requestqueuehandle.toString(), delegatequeuehandle.toString(), requestid.toString(), delegateurlgroupid.toString(), propertyinfosetsize.toInt(), propertyinfoset.toString()) as Int).toUInt() else 0u

public actual fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(servicehandle.toString(), configid, pconfiginformation.toString(), configinformationlength.toInt(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(fullyqualifiedurl.toString(), requestqueuehandle.toString(), urlgroupid.toString()) as Int).toUInt() else 0u

public actual fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(requestqueuehandle.toString(), urlprefix.toString(), flags.toInt(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt =
    0u

public actual fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(featureid) as Int) else 0

public actual fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(reserved.toString(), flags.toInt(), url.toString(), preparedurl.toString()) as Int).toUInt() else 0u

public actual fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(requestqueuehandle.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt(), reserved1.toInt(), returnlength.toString(), reserved2.toString()) as Int).toUInt() else 0u

public actual fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(serversessionid.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt(), returnlength.toString()) as Int).toUInt() else 0u

public actual fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(servicehandle.toString(), configid, pinput.toString(), inputlength.toInt(), poutput.toString(), outputlength.toInt(), preturnlength.toString(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt(), returnlength.toString()) as Int).toUInt() else 0u

public actual fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(requestqueuehandle.toString(), urlprefix.toString(), byterange.toString(), buffer.toString(), bufferlength.toInt(), bytesread.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(requestqueuehandle.toString(), connectionid.toString(), flags.toInt(), sslclientcertinfo.toString(), sslclientcertinfosize.toInt(), bytesreceived.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(requestqueuehandle.toString(), requestid.toString(), flags.toInt(), requestbuffer.toString(), requestbufferlength.toInt(), bytesreturned.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(requestqueuehandle.toString(), requestid.toString(), flags.toInt(), entitybuffer.toString(), entitybufferlength.toInt(), bytesreturned.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(requestqueuehandle.toString(), fullyqualifiedurl.toString()) as Int).toUInt() else 0u

public actual fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(urlgroupid.toString(), pfullyqualifiedurl.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(requestqueuehandle.toString(), requestid.toString(), flags.toInt(), httpresponse.toString(), cachepolicy.toString(), bytessent.toString(), reserved1.toString(), reserved2.toInt(), overlapped.toString(), logdata.toString()) as Int).toUInt() else 0u

public actual fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(requestqueuehandle.toString(), requestid.toString(), flags.toInt(), entitychunkcount.toInt(), entitychunks.toString(), bytessent.toString(), reserved1.toString(), reserved2.toInt(), overlapped.toString(), logdata.toString()) as Int).toUInt() else 0u

public actual fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(requestqueuehandle.toString(), id.toString(), propertyid, input.toString(), inputpropertysize.toInt(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(requestqueuehandle.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt(), reserved1.toInt(), reserved2.toString()) as Int).toUInt() else 0u

public actual fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(serversessionid.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt()) as Int).toUInt() else 0u

public actual fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(servicehandle.toString(), configid, pconfiginformation.toString(), configinformationlength.toInt(), poverlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(urlgroupid.toString(), property, propertyinformation.toString(), propertyinformationlength.toInt()) as Int).toUInt() else 0u

public actual fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(requestqueuehandle.toString()) as Int).toUInt() else 0u

public actual fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpTerminate(flags.toInt(), preserved.toString()) as Int).toUInt() else 0u

public actual fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(handle.toString(), configid, configinfo.toString(), configinfolength.toInt(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(requestqueuehandle.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(requestqueuehandle.toString(), connectionid.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt =
    if (_windowsWin32NetworkingHttpserverNapiAddon != null) (_windowsWin32NetworkingHttpserverNapiAddon.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(requestqueuehandle.toString(), connectionid.toString(), reserved.toInt(), overlapped.toString()) as Int).toUInt() else 0u
