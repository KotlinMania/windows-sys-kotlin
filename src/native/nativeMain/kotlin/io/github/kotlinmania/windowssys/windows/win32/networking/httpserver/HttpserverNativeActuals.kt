@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(requestqueuehandle.toCPointer<ByteVar>(), urlprefix.toCPointer<ByteVar>(), datachunk.toCPointer<ByteVar>(), cachepolicy.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpAddUrl(requestqueuehandle.toCPointer<ByteVar>(), fullyqualifiedurl.toCPointer<ByteVar>(), reserved.toCPointer<ByteVar>())

public actual fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(urlgroupid, pfullyqualifiedurl.toCPointer<ByteVar>(), urlcontext, reserved)

public actual fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(requestqueuehandle.toCPointer<ByteVar>(), requestid, overlapped.toCPointer<ByteVar>())

public actual fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(requestqueuehandle.toCPointer<ByteVar>())

public actual fun HttpCloseServerSession(serversessionid: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(serversessionid)

public actual fun HttpCloseUrlGroup(urlgroupid: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(urlgroupid)

public actual fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(requestqueuehandle.toCPointer<ByteVar>(), reserved)

public actual fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt =
    0u

public actual fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt =
    0u

public actual fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(serversessionid, purlgroupid.toCPointer<ByteVar>(), reserved)

public actual fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpDeclarePush(requestqueuehandle.toCPointer<ByteVar>(), requestid, verb, path.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), headers.toCPointer<ByteVar>())

public actual fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(requestqueuehandle.toCPointer<ByteVar>(), delegatequeuehandle.toCPointer<ByteVar>(), requestid, delegateurlgroupid, propertyinfosetsize, propertyinfoset.toCPointer<ByteVar>())

public actual fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(servicehandle.toCPointer<ByteVar>(), configid, pconfiginformation.toCPointer<ByteVar>(), configinformationlength, poverlapped.toCPointer<ByteVar>())

public actual fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(fullyqualifiedurl.toCPointer<ByteVar>(), requestqueuehandle.toCPointer<ByteVar>(), urlgroupid.toCPointer<ByteVar>())

public actual fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(requestqueuehandle.toCPointer<ByteVar>(), urlprefix.toCPointer<ByteVar>(), flags, overlapped.toCPointer<ByteVar>())

public actual fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt =
    0u

public actual fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(featureid)

public actual fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(reserved.toCPointer<ByteVar>(), flags, url.toCPointer<ByteVar>(), preparedurl.toCPointer<ByteVar>())

public actual fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(requestqueuehandle.toCPointer<ByteVar>(), property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength, reserved1, returnlength.toCPointer<ByteVar>(), reserved2.toCPointer<ByteVar>())

public actual fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(serversessionid, property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(servicehandle.toCPointer<ByteVar>(), configid, pinput.toCPointer<ByteVar>(), inputlength, poutput.toCPointer<ByteVar>(), outputlength, preturnlength.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(urlgroupid, property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength, returnlength.toCPointer<ByteVar>())

public actual fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(requestqueuehandle.toCPointer<ByteVar>(), urlprefix.toCPointer<ByteVar>(), byterange.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), bufferlength, bytesread.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(requestqueuehandle.toCPointer<ByteVar>(), connectionid, flags, sslclientcertinfo.toCPointer<ByteVar>(), sslclientcertinfosize, bytesreceived.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(requestqueuehandle.toCPointer<ByteVar>(), requestid, flags, requestbuffer.toCPointer<ByteVar>(), requestbufferlength, bytesreturned.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(requestqueuehandle.toCPointer<ByteVar>(), requestid, flags, entitybuffer.toCPointer<ByteVar>(), entitybufferlength, bytesreturned.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(requestqueuehandle.toCPointer<ByteVar>(), fullyqualifiedurl.toCPointer<ByteVar>())

public actual fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(urlgroupid, pfullyqualifiedurl.toCPointer<ByteVar>(), flags)

public actual fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(requestqueuehandle.toCPointer<ByteVar>(), requestid, flags, httpresponse.toCPointer<ByteVar>(), cachepolicy.toCPointer<ByteVar>(), bytessent.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2, overlapped.toCPointer<ByteVar>(), logdata.toCPointer<ByteVar>())

public actual fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(requestqueuehandle.toCPointer<ByteVar>(), requestid, flags, entitychunkcount, entitychunks.toCPointer<ByteVar>(), bytessent.toCPointer<ByteVar>(), reserved1.toCPointer<ByteVar>(), reserved2, overlapped.toCPointer<ByteVar>(), logdata.toCPointer<ByteVar>())

public actual fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(requestqueuehandle.toCPointer<ByteVar>(), id, propertyid, input.toCPointer<ByteVar>(), inputpropertysize, overlapped.toCPointer<ByteVar>())

public actual fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(requestqueuehandle.toCPointer<ByteVar>(), property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength, reserved1, reserved2.toCPointer<ByteVar>())

public actual fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(serversessionid, property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(servicehandle.toCPointer<ByteVar>(), configid, pconfiginformation.toCPointer<ByteVar>(), configinformationlength, poverlapped.toCPointer<ByteVar>())

public actual fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(urlgroupid, property, propertyinformation.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(requestqueuehandle.toCPointer<ByteVar>())

public actual fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpTerminate(flags, preserved.toCPointer<ByteVar>())

public actual fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(handle.toCPointer<ByteVar>(), configid, configinfo.toCPointer<ByteVar>(), configinfolength, overlapped.toCPointer<ByteVar>())

public actual fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(requestqueuehandle.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(requestqueuehandle.toCPointer<ByteVar>(), connectionid, overlapped.toCPointer<ByteVar>())

public actual fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(requestqueuehandle.toCPointer<ByteVar>(), connectionid, reserved, overlapped.toCPointer<ByteVar>())
