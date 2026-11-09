@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt =
    0u

public actual fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt =
    0u

public actual fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt =
    0u

public actual fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt =
    0u

public actual fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt =
    0u

public actual fun HttpCloseServerSession(serversessionid: ULong): UInt =
    0u

public actual fun HttpCloseUrlGroup(urlgroupid: ULong): UInt =
    0u

public actual fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt =
    0u

public actual fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt =
    0u

public actual fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt =
    0u

public actual fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt =
    0u

public actual fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt =
    0u

public actual fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt =
    0u

public actual fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    0u

public actual fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt =
    0u

public actual fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt =
    0u

public actual fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt =
    0u

public actual fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt =
    0u

public actual fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL =
    0

public actual fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt =
    0u

public actual fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt =
    0u

public actual fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    0u

public actual fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt =
    0u

public actual fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt =
    0u

public actual fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt =
    0u

public actual fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt =
    0u

public actual fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    0u

public actual fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt =
    0u

public actual fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt =
    0u

public actual fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt =
    0u

public actual fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    0u

public actual fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt =
    0u

public actual fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt =
    0u

public actual fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt =
    0u

public actual fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    0u

public actual fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt =
    0u

public actual fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt =
    0u

public actual fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt =
    0u

public actual fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt =
    0u

public actual fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt =
    0u

public actual fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt =
    0u

public actual fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt =
    0u

public actual fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt =
    0u
