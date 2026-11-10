@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: COpaquePointer?, cachepolicy: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpAddFragmentToCache(requestqueuehandle?.value?.toCPointer<ByteVar>(), urlprefix?.value?.toCPointer<ByteVar>(), datachunk?.value?.toCPointer<ByteVar>(), cachepolicy?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpAddUrl(requestqueuehandle?.value?.toCPointer<ByteVar>(), fullyqualifiedurl?.value?.toCPointer<ByteVar>(), reserved?.value?.toCPointer<ByteVar>())

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpAddUrlToUrlGroup(urlgroupid, pfullyqualifiedurl?.value?.toCPointer<ByteVar>(), urlcontext, reserved)

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCancelHttpRequest(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCloseRequestQueue(requestqueuehandle?.value?.toCPointer<ByteVar>())

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCloseServerSession(serversessionid)

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCloseUrlGroup(urlgroupid)

public actual fun httpCreateHttpHandle(requestqueuehandle: COpaquePointer?, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCreateHttpHandle(requestqueuehandle?.value?.toCPointer<ByteVar>(), reserved)

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: COpaquePointer?, flags: UInt, requestqueuehandle: COpaquePointer?): UInt =
    0u

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: COpaquePointer?, reserved: UInt): UInt =
    0u

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: COpaquePointer?, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpCreateUrlGroup(serversessionid, purlgroupid?.value?.toCPointer<ByteVar>(), reserved)

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpDeclarePush(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, verb, path?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), headers?.value?.toCPointer<ByteVar>())

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpDelegateRequestEx(requestqueuehandle?.value?.toCPointer<ByteVar>(), delegatequeuehandle?.value?.toCPointer<ByteVar>(), requestid, delegateurlgroupid, propertyinfosetsize, propertyinfoset?.value?.toCPointer<ByteVar>())

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpDeleteServiceConfiguration(servicehandle?.value?.toCPointer<ByteVar>(), configid, pconfiginformation?.value?.toCPointer<ByteVar>(), configinformationlength, poverlapped?.value?.toCPointer<ByteVar>())

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpFindUrlGroupId(fullyqualifiedurl?.value?.toCPointer<ByteVar>(), requestqueuehandle?.value?.toCPointer<ByteVar>(), urlgroupid?.value?.toCPointer<ByteVar>())

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpFlushResponseCache(requestqueuehandle?.value?.toCPointer<ByteVar>(), urlprefix?.value?.toCPointer<ByteVar>(), flags, overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt =
    0u

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    0u

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpIsFeatureSupported(featureid)

public actual fun httpPrepareUrl(reserved: COpaquePointer?, flags: UInt, url: Pcwstr, preparedurl: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpPrepareUrl(reserved?.value?.toCPointer<ByteVar>(), flags, url?.value?.toCPointer<ByteVar>(), preparedurl?.value?.toCPointer<ByteVar>())

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, returnlength: COpaquePointer?, reserved2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpQueryRequestQueueProperty(requestqueuehandle?.value?.toCPointer<ByteVar>(), property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength, reserved1, returnlength?.value?.toCPointer<ByteVar>(), reserved2?.value?.toCPointer<ByteVar>())

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpQueryServerSessionProperty(serversessionid, property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: COpaquePointer?, inputlength: UInt, poutput: COpaquePointer?, outputlength: UInt, preturnlength: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpQueryServiceConfiguration(servicehandle?.value?.toCPointer<ByteVar>(), configid, pinput?.value?.toCPointer<ByteVar>(), inputlength, poutput?.value?.toCPointer<ByteVar>(), outputlength, preturnlength?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpQueryUrlGroupProperty(urlgroupid, property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength, returnlength?.value?.toCPointer<ByteVar>())

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, bytesread: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpReadFragmentFromCache(requestqueuehandle?.value?.toCPointer<ByteVar>(), urlprefix?.value?.toCPointer<ByteVar>(), byterange?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferlength, bytesread?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: COpaquePointer?, sslclientcertinfosize: UInt, bytesreceived: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpReceiveClientCertificate(requestqueuehandle?.value?.toCPointer<ByteVar>(), connectionid, flags, sslclientcertinfo?.value?.toCPointer<ByteVar>(), sslclientcertinfosize, bytesreceived?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: COpaquePointer?, requestbufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpReceiveHttpRequest(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, flags, requestbuffer?.value?.toCPointer<ByteVar>(), requestbufferlength, bytesreturned?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: COpaquePointer?, entitybufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpReceiveRequestEntityBody(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, flags, entitybuffer?.value?.toCPointer<ByteVar>(), entitybufferlength, bytesreturned?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpRemoveUrl(requestqueuehandle?.value?.toCPointer<ByteVar>(), fullyqualifiedurl?.value?.toCPointer<ByteVar>())

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpRemoveUrlFromUrlGroup(urlgroupid, pfullyqualifiedurl?.value?.toCPointer<ByteVar>(), flags)

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: COpaquePointer?, cachepolicy: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSendHttpResponse(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, flags, httpresponse?.value?.toCPointer<ByteVar>(), cachepolicy?.value?.toCPointer<ByteVar>(), bytessent?.value?.toCPointer<ByteVar>(), reserved1?.value?.toCPointer<ByteVar>(), reserved2, overlapped?.value?.toCPointer<ByteVar>(), logdata?.value?.toCPointer<ByteVar>())

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSendResponseEntityBody(requestqueuehandle?.value?.toCPointer<ByteVar>(), requestid, flags, entitychunkcount, entitychunks?.value?.toCPointer<ByteVar>(), bytessent?.value?.toCPointer<ByteVar>(), reserved1?.value?.toCPointer<ByteVar>(), reserved2, overlapped?.value?.toCPointer<ByteVar>(), logdata?.value?.toCPointer<ByteVar>())

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: COpaquePointer?, inputpropertysize: UInt, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSetRequestProperty(requestqueuehandle?.value?.toCPointer<ByteVar>(), id, propertyid, input?.value?.toCPointer<ByteVar>(), inputpropertysize, overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, reserved2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSetRequestQueueProperty(requestqueuehandle?.value?.toCPointer<ByteVar>(), property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength, reserved1, reserved2?.value?.toCPointer<ByteVar>())

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSetServerSessionProperty(serversessionid, property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSetServiceConfiguration(servicehandle?.value?.toCPointer<ByteVar>(), configid, pconfiginformation?.value?.toCPointer<ByteVar>(), configinformationlength, poverlapped?.value?.toCPointer<ByteVar>())

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpSetUrlGroupProperty(urlgroupid, property, propertyinformation?.value?.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpShutdownRequestQueue(requestqueuehandle?.value?.toCPointer<ByteVar>())

public actual fun httpTerminate(flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpTerminate(flags, preserved?.value?.toCPointer<ByteVar>())

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: COpaquePointer?, configinfolength: UInt, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpUpdateServiceConfiguration(handle?.value?.toCPointer<ByteVar>(), configid, configinfo?.value?.toCPointer<ByteVar>(), configinfolength, overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpWaitForDemandStart(requestqueuehandle?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnect(requestqueuehandle?.value?.toCPointer<ByteVar>(), connectionid, overlapped?.value?.toCPointer<ByteVar>())

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnectEx(requestqueuehandle?.value?.toCPointer<ByteVar>(), connectionid, reserved, overlapped?.value?.toCPointer<ByteVar>())
