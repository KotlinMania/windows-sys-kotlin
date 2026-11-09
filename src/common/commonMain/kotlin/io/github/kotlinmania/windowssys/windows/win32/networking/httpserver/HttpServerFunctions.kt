package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt

public expect fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt

public expect fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt

public expect fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt

public expect fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt

public expect fun HttpCloseServerSession(serversessionid: ULong): UInt

public expect fun HttpCloseUrlGroup(urlgroupid: ULong): UInt

public expect fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt

public expect fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt

public expect fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt

public expect fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt

public expect fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt

public expect fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt

public expect fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt

public expect fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt

public expect fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt

public expect fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt

public expect fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt

public expect fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL

public expect fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt

public expect fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt

public expect fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt

public expect fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt

public expect fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt

public expect fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt

public expect fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt

public expect fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt

public expect fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt

public expect fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt

public expect fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt

public expect fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt

public expect fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt

public expect fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt

public expect fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt

public expect fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt

public expect fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt

public expect fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt

public expect fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt

public expect fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt

public expect fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt

public expect fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt

public expect fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt

public expect fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt
