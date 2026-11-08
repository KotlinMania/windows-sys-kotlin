package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun HttpAddFragmentToCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, datachunk: Long, cachepolicy: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddFragmentToCache", longArrayOf(requestqueuehandle, urlprefix, datachunk, cachepolicy, overlapped)).toUInt()
}

public fun HttpAddUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR, reserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddUrl", longArrayOf(requestqueuehandle, fullyqualifiedurl, reserved)).toUInt()
}

public fun HttpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, urlcontext: ULong, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpAddUrlToUrlGroup", longArrayOf(urlgroupid.toLong(), pfullyqualifiedurl, urlcontext.toLong(), reserved.toLong())).toUInt()
}

public fun HttpCancelHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCancelHttpRequest", longArrayOf(requestqueuehandle, requestid.toLong(), overlapped)).toUInt()
}

public fun HttpCloseRequestQueue(requestqueuehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCloseRequestQueue", longArrayOf(requestqueuehandle)).toUInt()
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
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateRequestQueue", longArrayOf(((version.HttpApiMajorVersion.toLong() and 0xFFFFL) or ((version.HttpApiMinorVersion.toLong() and 0xFFFFL) shl 16)), name, securityattributes, flags.toLong(), requestqueuehandle)).toUInt()
}

public fun HttpCreateServerSession(version: HTTPAPI_VERSION, serversessionid: Long, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateServerSession", longArrayOf(((version.HttpApiMajorVersion.toLong() and 0xFFFFL) or ((version.HttpApiMinorVersion.toLong() and 0xFFFFL) shl 16)), serversessionid, reserved.toLong())).toUInt()
}

public fun HttpCreateUrlGroup(serversessionid: ULong, purlgroupid: Long, reserved: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpCreateUrlGroup", longArrayOf(serversessionid.toLong(), purlgroupid, reserved.toLong())).toUInt()
}

public fun HttpDeclarePush(requestqueuehandle: HANDLE, requestid: ULong, verb: HTTP_VERB, path: PCWSTR, query: PCSTR, headers: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDeclarePush", longArrayOf(requestqueuehandle, requestid.toLong(), verb.toLong(), path, query, headers)).toUInt()
}

public fun HttpDelegateRequestEx(requestqueuehandle: HANDLE, delegatequeuehandle: HANDLE, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDelegateRequestEx", longArrayOf(requestqueuehandle, delegatequeuehandle, requestid.toLong(), delegateurlgroupid.toLong(), propertyinfosetsize.toLong(), propertyinfoset)).toUInt()
}

public fun HttpDeleteServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpDeleteServiceConfiguration", longArrayOf(servicehandle, configid.toLong(), pconfiginformation, configinformationlength.toLong(), poverlapped)).toUInt()
}

public fun HttpFindUrlGroupId(fullyqualifiedurl: PCWSTR, requestqueuehandle: HANDLE, urlgroupid: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpFindUrlGroupId", longArrayOf(fullyqualifiedurl, requestqueuehandle, urlgroupid)).toUInt()
}

public fun HttpFlushResponseCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, flags: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpFlushResponseCache", longArrayOf(requestqueuehandle, urlprefix, flags.toLong(), overlapped)).toUInt()
}

public fun HttpGetExtension(version: HTTPAPI_VERSION, extension: UInt, buffer: Long, buffersize: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpGetExtension", longArrayOf(((version.HttpApiMajorVersion.toLong() and 0xFFFFL) or ((version.HttpApiMinorVersion.toLong() and 0xFFFFL) shl 16)), extension.toLong(), buffer, buffersize.toLong())).toUInt()
}

public fun HttpInitialize(version: HTTPAPI_VERSION, flags: HTTP_INITIALIZE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpInitialize", longArrayOf(((version.HttpApiMajorVersion.toLong() and 0xFFFFL) or ((version.HttpApiMinorVersion.toLong() and 0xFFFFL) shl 16)), flags.toLong(), preserved)).toUInt()
}

public fun HttpIsFeatureSupported(featureid: HTTP_FEATURE_ID): BOOL {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpIsFeatureSupported", longArrayOf(featureid.toLong())).toInt()
}

public fun HttpPrepareUrl(reserved: Long, flags: UInt, url: PCWSTR, preparedurl: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpPrepareUrl", longArrayOf(reserved, flags.toLong(), url, preparedurl)).toUInt()
}

public fun HttpQueryRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, returnlength: Long, reserved2: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryRequestQueueProperty", longArrayOf(requestqueuehandle, property.toLong(), propertyinformation, propertyinformationlength.toLong(), reserved1.toLong(), returnlength, reserved2)).toUInt()
}

public fun HttpQueryServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryServerSessionProperty", longArrayOf(serversessionid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong(), returnlength)).toUInt()
}

public fun HttpQueryServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pinput: Long, inputlength: UInt, poutput: Long, outputlength: UInt, preturnlength: Long, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryServiceConfiguration", longArrayOf(servicehandle, configid.toLong(), pinput, inputlength.toLong(), poutput, outputlength.toLong(), preturnlength, poverlapped)).toUInt()
}

public fun HttpQueryUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, returnlength: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpQueryUrlGroupProperty", longArrayOf(urlgroupid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong(), returnlength)).toUInt()
}

public fun HttpReadFragmentFromCache(requestqueuehandle: HANDLE, urlprefix: PCWSTR, byterange: Long, buffer: Long, bufferlength: UInt, bytesread: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReadFragmentFromCache", longArrayOf(requestqueuehandle, urlprefix, byterange, buffer, bufferlength.toLong(), bytesread, overlapped)).toUInt()
}

public fun HttpReceiveClientCertificate(requestqueuehandle: HANDLE, connectionid: ULong, flags: UInt, sslclientcertinfo: Long, sslclientcertinfosize: UInt, bytesreceived: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveClientCertificate", longArrayOf(requestqueuehandle, connectionid.toLong(), flags.toLong(), sslclientcertinfo, sslclientcertinfosize.toLong(), bytesreceived, overlapped)).toUInt()
}

public fun HttpReceiveHttpRequest(requestqueuehandle: HANDLE, requestid: ULong, flags: HTTP_RECEIVE_HTTP_REQUEST_FLAGS, requestbuffer: Long, requestbufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveHttpRequest", longArrayOf(requestqueuehandle, requestid.toLong(), flags.toLong(), requestbuffer, requestbufferlength.toLong(), bytesreturned, overlapped)).toUInt()
}

public fun HttpReceiveRequestEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitybuffer: Long, entitybufferlength: UInt, bytesreturned: Long, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpReceiveRequestEntityBody", longArrayOf(requestqueuehandle, requestid.toLong(), flags.toLong(), entitybuffer, entitybufferlength.toLong(), bytesreturned, overlapped)).toUInt()
}

public fun HttpRemoveUrl(requestqueuehandle: HANDLE, fullyqualifiedurl: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpRemoveUrl", longArrayOf(requestqueuehandle, fullyqualifiedurl)).toUInt()
}

public fun HttpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpRemoveUrlFromUrlGroup", longArrayOf(urlgroupid.toLong(), pfullyqualifiedurl, flags.toLong())).toUInt()
}

public fun HttpSendHttpResponse(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, httpresponse: Long, cachepolicy: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSendHttpResponse", longArrayOf(requestqueuehandle, requestid.toLong(), flags.toLong(), httpresponse, cachepolicy, bytessent, reserved1, reserved2.toLong(), overlapped, logdata)).toUInt()
}

public fun HttpSendResponseEntityBody(requestqueuehandle: HANDLE, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: Long, bytessent: Long, reserved1: Long, reserved2: UInt, overlapped: Long, logdata: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSendResponseEntityBody", longArrayOf(requestqueuehandle, requestid.toLong(), flags.toLong(), entitychunkcount.toLong(), entitychunks, bytessent, reserved1, reserved2.toLong(), overlapped, logdata)).toUInt()
}

public fun HttpSetRequestProperty(requestqueuehandle: HANDLE, id: ULong, propertyid: HTTP_REQUEST_PROPERTY, input: Long, inputpropertysize: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetRequestProperty", longArrayOf(requestqueuehandle, id.toLong(), propertyid.toLong(), input, inputpropertysize.toLong(), overlapped)).toUInt()
}

public fun HttpSetRequestQueueProperty(requestqueuehandle: HANDLE, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt, reserved1: UInt, reserved2: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetRequestQueueProperty", longArrayOf(requestqueuehandle, property.toLong(), propertyinformation, propertyinformationlength.toLong(), reserved1.toLong(), reserved2)).toUInt()
}

public fun HttpSetServerSessionProperty(serversessionid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetServerSessionProperty", longArrayOf(serversessionid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong())).toUInt()
}

public fun HttpSetServiceConfiguration(servicehandle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, pconfiginformation: Long, configinformationlength: UInt, poverlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetServiceConfiguration", longArrayOf(servicehandle, configid.toLong(), pconfiginformation, configinformationlength.toLong(), poverlapped)).toUInt()
}

public fun HttpSetUrlGroupProperty(urlgroupid: ULong, property: HTTP_SERVER_PROPERTY, propertyinformation: Long, propertyinformationlength: UInt): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpSetUrlGroupProperty", longArrayOf(urlgroupid.toLong(), property.toLong(), propertyinformation, propertyinformationlength.toLong())).toUInt()
}

public fun HttpShutdownRequestQueue(requestqueuehandle: HANDLE): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpShutdownRequestQueue", longArrayOf(requestqueuehandle)).toUInt()
}

public fun HttpTerminate(flags: HTTP_INITIALIZE, preserved: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpTerminate", longArrayOf(flags.toLong(), preserved)).toUInt()
}

public fun HttpUpdateServiceConfiguration(handle: HANDLE, configid: HTTP_SERVICE_CONFIG_ID, configinfo: Long, configinfolength: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpUpdateServiceConfiguration", longArrayOf(handle, configid.toLong(), configinfo, configinfolength.toLong(), overlapped)).toUInt()
}

public fun HttpWaitForDemandStart(requestqueuehandle: HANDLE, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDemandStart", longArrayOf(requestqueuehandle, overlapped)).toUInt()
}

public fun HttpWaitForDisconnect(requestqueuehandle: HANDLE, connectionid: ULong, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDisconnect", longArrayOf(requestqueuehandle, connectionid.toLong(), overlapped)).toUInt()
}

public fun HttpWaitForDisconnectEx(requestqueuehandle: HANDLE, connectionid: ULong, reserved: UInt, overlapped: Long): UInt {
    return Win32DynamicFfi.invoke("httpapi.dll", "HttpWaitForDisconnectEx", longArrayOf(requestqueuehandle, connectionid.toLong(), reserved.toLong(), overlapped)).toUInt()
}
