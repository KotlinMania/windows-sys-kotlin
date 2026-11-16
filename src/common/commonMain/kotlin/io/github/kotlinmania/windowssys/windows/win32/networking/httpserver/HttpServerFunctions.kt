package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr, cachepolicy: ConstPtr, overlapped: MutPtr): UInt

public expect fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr): UInt

public expect fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt

public expect fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr): UInt

public expect fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpCloseServerSession(serversessionid: ULong): UInt

public expect fun httpCloseUrlGroup(urlgroupid: ULong): UInt

public expect fun httpCreateHttpHandle(requestqueuehandle: MutPtr, reserved: UInt): UInt

public expect fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr, flags: UInt, requestqueuehandle: MutPtr): UInt

public expect fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr, reserved: UInt): UInt

public expect fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr, reserved: UInt): UInt

public expect fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr): UInt

public expect fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr): UInt

public expect fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt

public expect fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr): UInt

public expect fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr): UInt

public expect fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr, buffersize: UInt): UInt

public expect fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr): UInt

public expect fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool

public expect fun httpPrepareUrl(reserved: ConstPtr, flags: UInt, url: Pcwstr, preparedurl: MutPtr): UInt

public expect fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr, reserved2: ConstPtr): UInt

public expect fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt

public expect fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr, inputlength: UInt, poutput: MutPtr, outputlength: UInt, preturnlength: MutPtr, poverlapped: ConstPtr): UInt

public expect fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr, propertyinformationlength: UInt, returnlength: MutPtr): UInt

public expect fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr, buffer: MutPtr, bufferlength: UInt, bytesread: MutPtr, overlapped: MutPtr): UInt

public expect fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr, sslclientcertinfosize: UInt, bytesreceived: MutPtr, overlapped: MutPtr): UInt

public expect fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr, requestbufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt

public expect fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr, entitybufferlength: UInt, bytesreturned: MutPtr, overlapped: MutPtr): UInt

public expect fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt

public expect fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt

public expect fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr, cachepolicy: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt

public expect fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr, bytessent: MutPtr, reserved1: ConstPtr, reserved2: UInt, overlapped: MutPtr, logdata: ConstPtr): UInt

public expect fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr, inputpropertysize: UInt, overlapped: ConstPtr): UInt

public expect fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr): UInt

public expect fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt

public expect fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr, configinformationlength: UInt, poverlapped: ConstPtr): UInt

public expect fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr, propertyinformationlength: UInt): UInt

public expect fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpTerminate(flags: HttpInitialize, preserved: MutPtr): UInt

public expect fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr, configinfolength: UInt, overlapped: ConstPtr): UInt

public expect fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr): UInt

public expect fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr): UInt

public expect fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr): UInt
