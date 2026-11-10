@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32NetworkingHttpserverJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpAddFragmentToCache(requestqueuehandle: Long, urlprefix: Long, datachunk: Long, cachepolicy: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpAddUrl(requestqueuehandle: Long, fullyqualifiedurl: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpAddUrlToUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, urlcontext: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCancelHttpRequest(requestqueuehandle: Long, requestid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCloseRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCloseServerSession(serversessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCloseUrlGroup(urlgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCreateHttpHandle(requestqueuehandle: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpCreateUrlGroup(serversessionid: Long, purlgroupid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpDeclarePush(requestqueuehandle: Long, requestid: Long, verb: Int, path: Long, query: Long, headers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpDelegateRequestEx(requestqueuehandle: Long, delegatequeuehandle: Long, requestid: Long, delegateurlgroupid: Long, propertyinfosetsize: Int, propertyinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpDeleteServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpFindUrlGroupId(fullyqualifiedurl: Long, requestqueuehandle: Long, urlgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpFlushResponseCache(requestqueuehandle: Long, urlprefix: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpIsFeatureSupported(featureid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpPrepareUrl(reserved: Long, flags: Int, url: Long, preparedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpQueryRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, returnlength: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpQueryServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpQueryServiceConfiguration(servicehandle: Long, configid: Int, pinput: Long, inputlength: Int, poutput: Long, outputlength: Int, preturnlength: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpQueryUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpReadFragmentFromCache(requestqueuehandle: Long, urlprefix: Long, byterange: Long, buffer: Long, bufferlength: Int, bytesread: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpReceiveClientCertificate(requestqueuehandle: Long, connectionid: Long, flags: Int, sslclientcertinfo: Long, sslclientcertinfosize: Int, bytesreceived: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpReceiveHttpRequest(requestqueuehandle: Long, requestid: Long, flags: Int, requestbuffer: Long, requestbufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpReceiveRequestEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitybuffer: Long, entitybufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpRemoveUrl(requestqueuehandle: Long, fullyqualifiedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpRemoveUrlFromUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSendHttpResponse(requestqueuehandle: Long, requestid: Long, flags: Int, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSendResponseEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitychunkcount: Short, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSetRequestProperty(requestqueuehandle: Long, id: Long, propertyid: Int, input: Long, inputpropertysize: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSetRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSetServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSetServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpSetUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpShutdownRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpTerminate(flags: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpUpdateServiceConfiguration(handle: Long, configid: Int, configinfo: Long, configinfolength: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpWaitForDemandStart(requestqueuehandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpWaitForDisconnect(requestqueuehandle: Long, connectionid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_httpWaitForDisconnectEx(requestqueuehandle: Long, connectionid: Long, reserved: Int, overlapped: Long): Int
}

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: COpaquePointer?, cachepolicy: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpAddFragmentToCache((requestqueuehandle?.value ?: 0L), (urlprefix?.value ?: 0L), (datachunk?.value ?: 0L), (cachepolicy?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpAddUrl((requestqueuehandle?.value ?: 0L), (fullyqualifiedurl?.value ?: 0L), (reserved?.value ?: 0L)).toUInt()

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpAddUrlToUrlGroup(urlgroupid.toLong(), (pfullyqualifiedurl?.value ?: 0L), urlcontext.toLong(), reserved.toInt()).toUInt()

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCancelHttpRequest((requestqueuehandle?.value ?: 0L), requestid.toLong(), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCloseRequestQueue((requestqueuehandle?.value ?: 0L)).toUInt()

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCloseServerSession(serversessionid.toLong()).toUInt()

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCloseUrlGroup(urlgroupid.toLong()).toUInt()

public actual fun httpCreateHttpHandle(requestqueuehandle: COpaquePointer?, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCreateHttpHandle((requestqueuehandle?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: COpaquePointer?, flags: UInt, requestqueuehandle: COpaquePointer?): UInt =
    0u

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: COpaquePointer?, reserved: UInt): UInt =
    0u

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: COpaquePointer?, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpCreateUrlGroup(serversessionid.toLong(), (purlgroupid?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpDeclarePush((requestqueuehandle?.value ?: 0L), requestid.toLong(), verb, (path?.value ?: 0L), (query?.value ?: 0L), (headers?.value ?: 0L)).toUInt()

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpDelegateRequestEx((requestqueuehandle?.value ?: 0L), (delegatequeuehandle?.value ?: 0L), requestid.toLong(), delegateurlgroupid.toLong(), propertyinfosetsize.toInt(), (propertyinfoset?.value ?: 0L)).toUInt()

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpDeleteServiceConfiguration((servicehandle?.value ?: 0L), configid, (pconfiginformation?.value ?: 0L), configinformationlength.toInt(), (poverlapped?.value ?: 0L)).toUInt()

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpFindUrlGroupId((fullyqualifiedurl?.value ?: 0L), (requestqueuehandle?.value ?: 0L), (urlgroupid?.value ?: 0L)).toUInt()

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpFlushResponseCache((requestqueuehandle?.value ?: 0L), (urlprefix?.value ?: 0L), flags.toInt(), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt =
    0u

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    0u

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpIsFeatureSupported(featureid)

public actual fun httpPrepareUrl(reserved: COpaquePointer?, flags: UInt, url: Pcwstr, preparedurl: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpPrepareUrl((reserved?.value ?: 0L), flags.toInt(), (url?.value ?: 0L), (preparedurl?.value ?: 0L)).toUInt()

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, returnlength: COpaquePointer?, reserved2: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpQueryRequestQueueProperty((requestqueuehandle?.value ?: 0L), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt(), reserved1.toInt(), (returnlength?.value ?: 0L), (reserved2?.value ?: 0L)).toUInt()

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpQueryServerSessionProperty(serversessionid.toLong(), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt(), (returnlength?.value ?: 0L)).toUInt()

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: COpaquePointer?, inputlength: UInt, poutput: COpaquePointer?, outputlength: UInt, preturnlength: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpQueryServiceConfiguration((servicehandle?.value ?: 0L), configid, (pinput?.value ?: 0L), inputlength.toInt(), (poutput?.value ?: 0L), outputlength.toInt(), (preturnlength?.value ?: 0L), (poverlapped?.value ?: 0L)).toUInt()

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpQueryUrlGroupProperty(urlgroupid.toLong(), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt(), (returnlength?.value ?: 0L)).toUInt()

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, bytesread: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpReadFragmentFromCache((requestqueuehandle?.value ?: 0L), (urlprefix?.value ?: 0L), (byterange?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt(), (bytesread?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: COpaquePointer?, sslclientcertinfosize: UInt, bytesreceived: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpReceiveClientCertificate((requestqueuehandle?.value ?: 0L), connectionid.toLong(), flags.toInt(), (sslclientcertinfo?.value ?: 0L), sslclientcertinfosize.toInt(), (bytesreceived?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: COpaquePointer?, requestbufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpReceiveHttpRequest((requestqueuehandle?.value ?: 0L), requestid.toLong(), flags.toInt(), (requestbuffer?.value ?: 0L), requestbufferlength.toInt(), (bytesreturned?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: COpaquePointer?, entitybufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpReceiveRequestEntityBody((requestqueuehandle?.value ?: 0L), requestid.toLong(), flags.toInt(), (entitybuffer?.value ?: 0L), entitybufferlength.toInt(), (bytesreturned?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpRemoveUrl((requestqueuehandle?.value ?: 0L), (fullyqualifiedurl?.value ?: 0L)).toUInt()

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpRemoveUrlFromUrlGroup(urlgroupid.toLong(), (pfullyqualifiedurl?.value ?: 0L), flags.toInt()).toUInt()

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: COpaquePointer?, cachepolicy: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSendHttpResponse((requestqueuehandle?.value ?: 0L), requestid.toLong(), flags.toInt(), (httpresponse?.value ?: 0L), (cachepolicy?.value ?: 0L), (bytessent?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt(), (overlapped?.value ?: 0L), (logdata?.value ?: 0L)).toUInt()

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSendResponseEntityBody((requestqueuehandle?.value ?: 0L), requestid.toLong(), flags.toInt(), entitychunkcount.toShort(), (entitychunks?.value ?: 0L), (bytessent?.value ?: 0L), (reserved1?.value ?: 0L), reserved2.toInt(), (overlapped?.value ?: 0L), (logdata?.value ?: 0L)).toUInt()

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: COpaquePointer?, inputpropertysize: UInt, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSetRequestProperty((requestqueuehandle?.value ?: 0L), id.toLong(), propertyid, (input?.value ?: 0L), inputpropertysize.toInt(), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, reserved2: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSetRequestQueueProperty((requestqueuehandle?.value ?: 0L), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt(), reserved1.toInt(), (reserved2?.value ?: 0L)).toUInt()

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSetServerSessionProperty(serversessionid.toLong(), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt()).toUInt()

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSetServiceConfiguration((servicehandle?.value ?: 0L), configid, (pconfiginformation?.value ?: 0L), configinformationlength.toInt(), (poverlapped?.value ?: 0L)).toUInt()

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpSetUrlGroupProperty(urlgroupid.toLong(), property, (propertyinformation?.value ?: 0L), propertyinformationlength.toInt()).toUInt()

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpShutdownRequestQueue((requestqueuehandle?.value ?: 0L)).toUInt()

public actual fun httpTerminate(flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpTerminate(flags.toInt(), (preserved?.value ?: 0L)).toUInt()

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: COpaquePointer?, configinfolength: UInt, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpUpdateServiceConfiguration((handle?.value ?: 0L), configid, (configinfo?.value ?: 0L), configinfolength.toInt(), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpWaitForDemandStart((requestqueuehandle?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnect((requestqueuehandle?.value ?: 0L), connectionid.toLong(), (overlapped?.value ?: 0L)).toUInt()

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: COpaquePointer?): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_httpWaitForDisconnectEx((requestqueuehandle?.value ?: 0L), connectionid.toLong(), reserved.toInt(), (overlapped?.value ?: 0L)).toUInt()
