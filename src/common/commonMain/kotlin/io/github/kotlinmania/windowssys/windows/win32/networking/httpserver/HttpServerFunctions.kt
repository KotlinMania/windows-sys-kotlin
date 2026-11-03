package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun HttpAddFragmentToCache(requestqueuehandle: Foundation.HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddFragmentToCache", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), urlprefix, datachunk, cachepolicy, overlapped)).toUInt()
}

public fun HttpAddUrl(requestqueuehandle: Foundation.HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddUrl", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), fullyqualifiedurl, reserved)).toUInt()
}

public fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddUrlToUrlGroup", longArrayOf(urlgroupid.toLong(), pfullyqualifiedurl, urlcontext.toLong(), reserved.toLong())).toUInt()
}

public fun HttpCancelHttpRequest(requestqueuehandle: Foundation.HANDLE, requestid: ULong, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCancelHttpRequest", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), overlapped)).toUInt()
}

public fun HttpCloseRequestQueue(requestqueuehandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCloseRequestQueue", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle))).toUInt()
}

public fun HttpCloseServerSession(serversessionid: ULong): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCloseServerSession", longArrayOf(serversessionid.toLong())).toUInt()
}

public fun HttpCloseUrlGroup(urlgroupid: ULong): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCloseUrlGroup", longArrayOf(urlgroupid.toLong())).toUInt()
}

public fun HttpCreateHttpHandle(requestqueuehandle: Long, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateHttpHandle", longArrayOf(requestqueuehandle, reserved.toLong())).toUInt()
}

public fun HttpCreateRequestQueue(version: HTTPAPI_VERSION, name: PCWSTR, securityattributes: Long, flags: UInt, requestqueuehandle: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateRequestQueue", longArrayOf(Win32DynamicFfi.objectSlot(version), name, securityattributes, flags.toLong(), requestqueuehandle)).toUInt()
}

public fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateServerSession", longArrayOf(Win32DynamicFfi.objectSlot(version), serversessionid, reserved.toLong())).toUInt()
}

public fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateUrlGroup", longArrayOf(serversessionid.toLong(), purlgroupid, reserved.toLong())).toUInt()
}

public fun HttpDeclarePush(requestqueuehandle: Foundation.HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDeclarePush", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), verb.toLong(), path, query, headers)).toUInt()
}

public fun HttpDelegateRequestEx(requestqueuehandle: Foundation.HANDLE, delegatequeuehandle: Foundation.HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDelegateRequestEx", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), Win32DynamicFfi.objectSlot(delegatequeuehandle), requestid.toLong(), delegateurlgroupid.toLong(), propertyinfosetsize.toLong(), propertyinfoset)).toUInt()
}

public fun HttpDeleteServiceConfiguration(servicehandle: Foundation.HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDeleteServiceConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(servicehandle), configid.toLong(), pconfiginformation, configinformationlength.toLong(), poverlapped)).toUInt()
}

public fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: Foundation.HANDLE, urlgroupid: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpFindUrlGroupId", longArrayOf(fullyqualifiedurl, Win32DynamicFfi.objectSlot(requestqueuehandle), urlgroupid)).toUInt()
}

public fun HttpFlushResponseCache(requestqueuehandle: Foundation.HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpFlushResponseCache", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), urlprefix, flags.toLong(), overlapped)).toUInt()
}

public fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpGetExtension", longArrayOf(Win32DynamicFfi.objectSlot(version), extension.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpInitialize", longArrayOf(Win32DynamicFfi.objectSlot(version), flags.toLong(), preserved)).toUInt()
}

public fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpIsFeatureSupported", longArrayOf(featureid.toLong())).toInt()
}

public fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpPrepareUrl", longArrayOf(reserved, flags.toLong(), url, preparedurl)).toUInt()
}

public fun HttpQueryRequestQueueProperty(requestqueuehandle: Foundation.HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryRequestQueueProperty", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), property.toLong(), propertyinformation, propertyinformationlength.toLong(), reserved1.toLong(), returnlength, reserved2)).toUInt()
}

public fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryServerSessionProperty", longArrayOf(serversessionid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong(), returnlength)).toUInt()
}

public fun HttpQueryServiceConfiguration(servicehandle: Foundation.HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryServiceConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(servicehandle), configid.toLong(), pinput, inputlength.toLong(), poutput, outputlength.toLong(), preturnlength, poverlapped)).toUInt()
}

public fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryUrlGroupProperty", longArrayOf(urlgroupid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong(), returnlength)).toUInt()
}

public fun HttpReadFragmentFromCache(requestqueuehandle: Foundation.HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReadFragmentFromCache", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), urlprefix, byterange, buffer, bufferlength.toLong(), bytesread, overlapped)).toUInt()
}

public fun HttpReceiveClientCertificate(requestqueuehandle: Foundation.HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveClientCertificate", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), connectionid.toLong(), flags.toLong(), sslclientcertinfo, sslclientcertinfosize.toLong(), bytesreceived, overlapped)).toUInt()
}

public fun HttpReceiveHttpRequest(requestqueuehandle: Foundation.HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveHttpRequest", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), flags.toLong(), requestbuffer, requestbufferlength.toLong(), bytesreturned, overlapped)).toUInt()
}

public fun HttpReceiveRequestEntityBody(requestqueuehandle: Foundation.HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveRequestEntityBody", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), flags.toLong(), entitybuffer, entitybufferlength.toLong(), bytesreturned, overlapped)).toUInt()
}

public fun HttpRemoveUrl(requestqueuehandle: Foundation.HANDLE, fullyqualifiedurl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpRemoveUrl", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), fullyqualifiedurl)).toUInt()
}

public fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpRemoveUrlFromUrlGroup", longArrayOf(urlgroupid.toLong(), pfullyqualifiedurl, flags.toLong())).toUInt()
}

public fun HttpSendHttpResponse(requestqueuehandle: Foundation.HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSendHttpResponse", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), flags.toLong(), httpresponse, cachepolicy, bytessent, reserved1, reserved2.toLong(), overlapped, logdata)).toUInt()
}

public fun HttpSendResponseEntityBody(requestqueuehandle: Foundation.HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSendResponseEntityBody", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), requestid.toLong(), flags.toLong(), entitychunkcount.toLong(), entitychunks, bytessent, reserved1, reserved2.toLong(), overlapped, logdata)).toUInt()
}

public fun HttpSetRequestProperty(requestqueuehandle: Foundation.HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetRequestProperty", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), id.toLong(), propertyid.toLong(), input, inputpropertysize.toLong(), overlapped)).toUInt()
}

public fun HttpSetRequestQueueProperty(requestqueuehandle: Foundation.HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetRequestQueueProperty", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), property.toLong(), propertyinformation, propertyinformationlength.toLong(), reserved1.toLong(), reserved2)).toUInt()
}

public fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetServerSessionProperty", longArrayOf(serversessionid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong())).toUInt()
}

public fun HttpSetServiceConfiguration(servicehandle: Foundation.HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetServiceConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(servicehandle), configid.toLong(), pconfiginformation, configinformationlength.toLong(), poverlapped)).toUInt()
}

public fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetUrlGroupProperty", longArrayOf(urlgroupid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong())).toUInt()
}

public fun HttpShutdownRequestQueue(requestqueuehandle: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpShutdownRequestQueue", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle))).toUInt()
}

public fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpTerminate", longArrayOf(flags.toLong(), preserved)).toUInt()
}

public fun HttpUpdateServiceConfiguration(handle: Foundation.HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpUpdateServiceConfiguration", longArrayOf(Win32DynamicFfi.objectSlot(handle), configid.toLong(), configinfo, configinfolength.toLong(), overlapped)).toUInt()
}

public fun HttpWaitForDemandStart(requestqueuehandle: Foundation.HANDLE, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDemandStart", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), overlapped)).toUInt()
}

public fun HttpWaitForDisconnect(requestqueuehandle: Foundation.HANDLE, connectionid: ULong, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDisconnect", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), connectionid.toLong(), overlapped)).toUInt()
}

public fun HttpWaitForDisconnectEx(requestqueuehandle: Foundation.HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDisconnectEx", longArrayOf(Win32DynamicFfi.objectSlot(requestqueuehandle), connectionid.toLong(), reserved.toLong(), overlapped)).toUInt()
}
