@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32NetworkingHttpserverJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(requestqueuehandle: Long, urlprefix: Long, datachunk: Long, cachepolicy: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpAddUrl(requestqueuehandle: Long, fullyqualifiedurl: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, urlcontext: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(requestqueuehandle: Long, requestid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(serversessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(urlgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(requestqueuehandle: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(serversessionid: Long, purlgroupid: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpDeclarePush(requestqueuehandle: Long, requestid: Long, verb: Int, path: Long, query: Long, headers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(requestqueuehandle: Long, delegatequeuehandle: Long, requestid: Long, delegateurlgroupid: Long, propertyinfosetsize: Int, propertyinfoset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(fullyqualifiedurl: Long, requestqueuehandle: Long, urlgroupid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(requestqueuehandle: Long, urlprefix: Long, flags: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(featureid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(reserved: Long, flags: Int, url: Long, preparedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, returnlength: Long, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(servicehandle: Long, configid: Int, pinput: Long, inputlength: Int, poutput: Long, outputlength: Int, preturnlength: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(requestqueuehandle: Long, urlprefix: Long, byterange: Long, buffer: Long, bufferlength: Int, bytesread: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(requestqueuehandle: Long, connectionid: Long, flags: Int, sslclientcertinfo: Long, sslclientcertinfosize: Int, bytesreceived: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(requestqueuehandle: Long, requestid: Long, flags: Int, requestbuffer: Long, requestbufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitybuffer: Long, entitybufferlength: Int, bytesreturned: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(requestqueuehandle: Long, fullyqualifiedurl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(urlgroupid: Long, pfullyqualifiedurl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(requestqueuehandle: Long, requestid: Long, flags: Int, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(requestqueuehandle: Long, requestid: Long, flags: Int, entitychunkcount: Short, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: Int, overlapped: Long, logdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(requestqueuehandle: Long, id: Long, propertyid: Int, input: Long, inputpropertysize: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(requestqueuehandle: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int, reserved1: Int, reserved2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(serversessionid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(servicehandle: Long, configid: Int, pconfiginformation: Long, configinformationlength: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(urlgroupid: Long, property: Int, propertyinformation: Long, propertyinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(requestqueuehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpTerminate(flags: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(handle: Long, configid: Int, configinfo: Long, configinfolength: Int, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(requestqueuehandle: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(requestqueuehandle: Long, connectionid: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(requestqueuehandle: Long, connectionid: Long, reserved: Int, overlapped: Long): Int
}

public actual fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpAddFragmentToCache(requestqueuehandle, urlprefix, datachunk, cachepolicy, overlapped).toUInt()

public actual fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpAddUrl(requestqueuehandle, fullyqualifiedurl, reserved).toUInt()

public actual fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpAddUrlToUrlGroup(urlgroupid.toLong(), pfullyqualifiedurl, urlcontext.toLong(), reserved.toInt()).toUInt()

public actual fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCancelHttpRequest(requestqueuehandle, requestid.toLong(), overlapped).toUInt()

public actual fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCloseRequestQueue(requestqueuehandle).toUInt()

public actual fun HttpCloseServerSession(serversessionid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCloseServerSession(serversessionid.toLong()).toUInt()

public actual fun HttpCloseUrlGroup(urlgroupid: ULong): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCloseUrlGroup(urlgroupid.toLong()).toUInt()

public actual fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCreateHttpHandle(requestqueuehandle, reserved.toInt()).toUInt()

public actual fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt =
    0u

public actual fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt =
    0u

public actual fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpCreateUrlGroup(serversessionid.toLong(), purlgroupid, reserved.toInt()).toUInt()

public actual fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpDeclarePush(requestqueuehandle, requestid.toLong(), verb, path, query, headers).toUInt()

public actual fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpDelegateRequestEx(requestqueuehandle, delegatequeuehandle, requestid.toLong(), delegateurlgroupid.toLong(), propertyinfosetsize.toInt(), propertyinfoset).toUInt()

public actual fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpDeleteServiceConfiguration(servicehandle, configid, pconfiginformation, configinformationlength.toInt(), poverlapped).toUInt()

public actual fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpFindUrlGroupId(fullyqualifiedurl, requestqueuehandle, urlgroupid).toUInt()

public actual fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpFlushResponseCache(requestqueuehandle, urlprefix, flags.toInt(), overlapped).toUInt()

public actual fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt =
    0u

public actual fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpIsFeatureSupported(featureid)

public actual fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpPrepareUrl(reserved, flags.toInt(), url, preparedurl).toUInt()

public actual fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpQueryRequestQueueProperty(requestqueuehandle, property, propertyinformation, propertyinformationlength.toInt(), reserved1.toInt(), returnlength, reserved2).toUInt()

public actual fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpQueryServerSessionProperty(serversessionid.toLong(), property, propertyinformation, propertyinformationlength.toInt(), returnlength).toUInt()

public actual fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpQueryServiceConfiguration(servicehandle, configid, pinput, inputlength.toInt(), poutput, outputlength.toInt(), preturnlength, poverlapped).toUInt()

public actual fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpQueryUrlGroupProperty(urlgroupid.toLong(), property, propertyinformation, propertyinformationlength.toInt(), returnlength).toUInt()

public actual fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpReadFragmentFromCache(requestqueuehandle, urlprefix, byterange, buffer, bufferlength.toInt(), bytesread, overlapped).toUInt()

public actual fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpReceiveClientCertificate(requestqueuehandle, connectionid.toLong(), flags.toInt(), sslclientcertinfo, sslclientcertinfosize.toInt(), bytesreceived, overlapped).toUInt()

public actual fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpReceiveHttpRequest(requestqueuehandle, requestid.toLong(), flags.toInt(), requestbuffer, requestbufferlength.toInt(), bytesreturned, overlapped).toUInt()

public actual fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpReceiveRequestEntityBody(requestqueuehandle, requestid.toLong(), flags.toInt(), entitybuffer, entitybufferlength.toInt(), bytesreturned, overlapped).toUInt()

public actual fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpRemoveUrl(requestqueuehandle, fullyqualifiedurl).toUInt()

public actual fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpRemoveUrlFromUrlGroup(urlgroupid.toLong(), pfullyqualifiedurl, flags.toInt()).toUInt()

public actual fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSendHttpResponse(requestqueuehandle, requestid.toLong(), flags.toInt(), httpresponse, cachepolicy, bytessent, reserved1, reserved2.toInt(), overlapped, logdata).toUInt()

public actual fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSendResponseEntityBody(requestqueuehandle, requestid.toLong(), flags.toInt(), entitychunkcount.toShort(), entitychunks, bytessent, reserved1, reserved2.toInt(), overlapped, logdata).toUInt()

public actual fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSetRequestProperty(requestqueuehandle, id.toLong(), propertyid, input, inputpropertysize.toInt(), overlapped).toUInt()

public actual fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSetRequestQueueProperty(requestqueuehandle, property, propertyinformation, propertyinformationlength.toInt(), reserved1.toInt(), reserved2).toUInt()

public actual fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSetServerSessionProperty(serversessionid.toLong(), property, propertyinformation, propertyinformationlength.toInt()).toUInt()

public actual fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSetServiceConfiguration(servicehandle, configid, pconfiginformation, configinformationlength.toInt(), poverlapped).toUInt()

public actual fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpSetUrlGroupProperty(urlgroupid.toLong(), property, propertyinformation, propertyinformationlength.toInt()).toUInt()

public actual fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpShutdownRequestQueue(requestqueuehandle).toUInt()

public actual fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpTerminate(flags.toInt(), preserved).toUInt()

public actual fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpUpdateServiceConfiguration(handle, configid, configinfo, configinfolength.toInt(), overlapped).toUInt()

public actual fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpWaitForDemandStart(requestqueuehandle, overlapped).toUInt()

public actual fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnect(requestqueuehandle, connectionid.toLong(), overlapped).toUInt()

public actual fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt =
    WindowsWin32NetworkingHttpserverJniBridge.windowssys_windows_win32_networking_httpserver_HttpWaitForDisconnectEx(requestqueuehandle, connectionid.toLong(), reserved.toInt(), overlapped).toUInt()
