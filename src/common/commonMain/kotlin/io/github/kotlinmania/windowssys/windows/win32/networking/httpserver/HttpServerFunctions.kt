package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr<HttpDataChunk>, cachepolicy: ConstPtr<HttpCachePolicy>, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr<CVoid>): UInt

public expect fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt

public expect fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpCloseServerSession(serversessionid: ULong): UInt

public expect fun httpCloseUrlGroup(urlgroupid: ULong): UInt

public expect fun httpCreateHttpHandle(requestqueuehandle: MutPtr<Handle>, reserved: UInt): UInt

public expect fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr<SecurityAttributes>, flags: UInt, requestqueuehandle: MutPtr<Handle>): UInt

public expect fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr<ULong>, reserved: UInt): UInt

public expect fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr<ULong>, reserved: UInt): UInt

public expect fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr<HttpRequestHeaders>): UInt

public expect fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr<HttpDelegateRequestPropertyInfo>): UInt

public expect fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr<ULong>): UInt

public expect fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr<CVoid>, buffersize: UInt): UInt

public expect fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt

public expect fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool

public expect fun httpPrepareUrl(reserved: ConstPtr<CVoid>, flags: UInt, url: Pcwstr, preparedurl: MutPtr<Pwstr>): UInt

public expect fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr<UInt>, reserved2: ConstPtr<CVoid>): UInt

public expect fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt

public expect fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr<CVoid>, inputlength: UInt, poutput: MutPtr<CVoid>, outputlength: UInt, preturnlength: MutPtr<UInt>, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt

public expect fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr<HttpByteRange>, buffer: MutPtr<CVoid>, bufferlength: UInt, bytesread: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr<HttpSslClientCertInfo>, sslclientcertinfosize: UInt, bytesreceived: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr<HttpRequestV2>, requestbufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr<CVoid>, entitybufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt

public expect fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt

public expect fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr<HttpResponseV2>, cachepolicy: ConstPtr<HttpCachePolicy>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt

public expect fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr<HttpDataChunk>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt

public expect fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr<CVoid>, inputpropertysize: UInt, overlapped: ConstPtr<Overlapped>): UInt

public expect fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): UInt

public expect fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt

public expect fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt

public expect fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt

public expect fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt

public expect fun httpTerminate(flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt

public expect fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr<CVoid>, configinfolength: UInt, overlapped: ConstPtr<Overlapped>): UInt

public expect fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr<Overlapped>): UInt

public expect fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr<Overlapped>): UInt
