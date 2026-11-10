package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: COpaquePointer?, cachepolicy: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: COpaquePointer?): UInt

public expect fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt

public expect fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: COpaquePointer?): UInt

public expect fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpCloseServerSession(serversessionid: ULong): UInt

public expect fun httpCloseUrlGroup(urlgroupid: ULong): UInt

public expect fun httpCreateHttpHandle(requestqueuehandle: COpaquePointer?, reserved: UInt): UInt

public expect fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: COpaquePointer?, flags: UInt, requestqueuehandle: COpaquePointer?): UInt

public expect fun httpCreateServerSession(version: HttpapiVersion, serversessionid: COpaquePointer?, reserved: UInt): UInt

public expect fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: COpaquePointer?, reserved: UInt): UInt

public expect fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: COpaquePointer?): UInt

public expect fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: COpaquePointer?): UInt

public expect fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt

public expect fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: COpaquePointer?): UInt

public expect fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: COpaquePointer?): UInt

public expect fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt

public expect fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: COpaquePointer?): UInt

public expect fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool

public expect fun httpPrepareUrl(reserved: COpaquePointer?, flags: UInt, url: Pcwstr, preparedurl: COpaquePointer?): UInt

public expect fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, returnlength: COpaquePointer?, reserved2: COpaquePointer?): UInt

public expect fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt

public expect fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: COpaquePointer?, inputlength: UInt, poutput: COpaquePointer?, outputlength: UInt, preturnlength: COpaquePointer?, poverlapped: COpaquePointer?): UInt

public expect fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt

public expect fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, bytesread: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: COpaquePointer?, sslclientcertinfosize: UInt, bytesreceived: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: COpaquePointer?, requestbufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: COpaquePointer?, entitybufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt

public expect fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt

public expect fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt

public expect fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: COpaquePointer?, cachepolicy: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt

public expect fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt

public expect fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: COpaquePointer?, inputpropertysize: UInt, overlapped: COpaquePointer?): UInt

public expect fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, reserved2: COpaquePointer?): UInt

public expect fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt

public expect fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt

public expect fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt

public expect fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpTerminate(flags: HttpInitialize, preserved: COpaquePointer?): UInt

public expect fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: COpaquePointer?, configinfolength: UInt, overlapped: COpaquePointer?): UInt

public expect fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: COpaquePointer?): UInt

public expect fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: COpaquePointer?): UInt

public expect fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: COpaquePointer?): UInt
