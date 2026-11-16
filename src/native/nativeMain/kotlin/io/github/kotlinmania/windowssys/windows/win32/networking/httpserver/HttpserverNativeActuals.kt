@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpAddUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpTerminate
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect
import io.github.kotlinmania.windowssys.windows.win32.networking.httpserver.cinterop.windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr, cachepolicy: ConstPtr, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), urlprefix.rawAddress.toCPointer<ByteVar>(), datachunk.rawAddress.toCPointer<ByteVar>(), cachepolicy.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpAddUrl(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), fullyqualifiedurl.rawAddress.toCPointer<ByteVar>(), reserved.rawAddress.toCPointer<ByteVar>())

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup(urlgroupid, pfullyqualifiedurl.rawAddress.toCPointer<ByteVar>(), urlcontext, reserved)

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue(requestqueuehandle.rawAddress.toCPointer<ByteVar>())

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid)

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid)

public actual fun httpCreateHttpHandle(requestqueuehandle: MutPtr, reserved: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr, flags: UInt, requestqueuehandle: MutPtr): UInt =
    0u

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr, reserved: UInt): UInt =
    0u

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr, reserved: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup(serversessionid, purlgroupid.rawAddress.toCPointer<ByteVar>(), reserved)

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, verb, path.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), headers.rawAddress.toCPointer<ByteVar>())

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), delegatequeuehandle.rawAddress.toCPointer<ByteVar>(), requestid, delegateurlgroupid, propertyinfosetsize, propertyinfoset.rawAddress.toCPointer<ByteVar>())

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration(servicehandle.rawAddress.toCPointer<ByteVar>(), configid, pconfiginformation.rawAddress.toCPointer<ByteVar>(), configinformationlength, poverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId(fullyqualifiedurl.rawAddress.toCPointer<ByteVar>(), requestqueuehandle.rawAddress.toCPointer<ByteVar>(), urlgroupid.rawAddress.toCPointer<ByteVar>())

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), urlprefix.rawAddress.toCPointer<ByteVar>(), flags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr, buffersize: UInt): UInt =
    0u

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr): UInt =
    0u

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid)

public actual fun httpPrepareUrl(reserved: ConstPtr, flags: UInt, url: Pcwstr, preparedurl: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl(reserved.rawAddress.toCPointer<ByteVar>(), flags, url.rawAddress.toCPointer<ByteVar>(), preparedurl.rawAddress.toCPointer<ByteVar>())

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr, reserved2: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength, reserved1, returnlength.rawAddress.toCPointer<ByteVar>(), reserved2.rawAddress.toCPointer<ByteVar>())

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty(serversessionid, property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr, inputlength: UInt, poutput: MutPtr, outputlength: UInt, preturnlength: MutPtr, poverlapped: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration(servicehandle.rawAddress.toCPointer<ByteVar>(), configid, pinput.rawAddress.toCPointer<ByteVar>(), inputlength, poutput.rawAddress.toCPointer<ByteVar>(), outputlength, preturnlength.rawAddress.toCPointer<ByteVar>(), poverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty(urlgroupid, property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength, returnlength.rawAddress.toCPointer<ByteVar>())

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr, buffer: MutPtr, bufferlength: UInt, bytesread: MutPtr, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), urlprefix.rawAddress.toCPointer<ByteVar>(), byterange.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), bufferlength, bytesread.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr, sslclientcertinfosize: UInt, bytesreceived: MutPtr, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), connectionid, flags, sslclientcertinfo.rawAddress.toCPointer<ByteVar>(), sslclientcertinfosize, bytesreceived.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr, requestbufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, flags, requestbuffer.rawAddress.toCPointer<ByteVar>(), requestbufferlength, bytesreturned.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr, entitybufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, flags, entitybuffer.rawAddress.toCPointer<ByteVar>(), entitybufferlength, bytesreturned.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), fullyqualifiedurl.rawAddress.toCPointer<ByteVar>())

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup(urlgroupid, pfullyqualifiedurl.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr, cachepolicy: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, flags, httpresponse.rawAddress.toCPointer<ByteVar>(), cachepolicy.rawAddress.toCPointer<ByteVar>(), bytessent.rawAddress.toCPointer<ByteVar>(), reserved1.rawAddress.toCPointer<ByteVar>(), reserved2, overlapped.rawAddress.toCPointer<ByteVar>(), logdata.rawAddress.toCPointer<ByteVar>())

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), requestid, flags, entitychunkcount, entitychunks.rawAddress.toCPointer<ByteVar>(), bytessent.rawAddress.toCPointer<ByteVar>(), reserved1.rawAddress.toCPointer<ByteVar>(), reserved2, overlapped.rawAddress.toCPointer<ByteVar>(), logdata.rawAddress.toCPointer<ByteVar>())

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr, inputpropertysize: UInt, overlapped: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), id, propertyid, input.rawAddress.toCPointer<ByteVar>(), inputpropertysize, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength, reserved1, reserved2.rawAddress.toCPointer<ByteVar>())

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty(serversessionid, property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration(servicehandle.rawAddress.toCPointer<ByteVar>(), configid, pconfiginformation.rawAddress.toCPointer<ByteVar>(), configinformationlength, poverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty(urlgroupid, property, propertyinformation.rawAddress.toCPointer<ByteVar>(), propertyinformationlength)

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue(requestqueuehandle.rawAddress.toCPointer<ByteVar>())

public actual fun httpTerminate(flags: HttpInitialize, preserved: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpTerminate(flags, preserved.rawAddress.toCPointer<ByteVar>())

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr, configinfolength: UInt, overlapped: ConstPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration(handle.rawAddress.toCPointer<ByteVar>(), configid, configinfo.rawAddress.toCPointer<ByteVar>(), configinfolength, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), connectionid, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr): UInt =
    windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx(requestqueuehandle.rawAddress.toCPointer<ByteVar>(), connectionid, reserved, overlapped.rawAddress.toCPointer<ByteVar>())
