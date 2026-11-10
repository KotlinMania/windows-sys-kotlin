@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.httpserver

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: COpaquePointer?, cachepolicy: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCreateHttpHandle(requestqueuehandle: COpaquePointer?, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: COpaquePointer?, flags: UInt, requestqueuehandle: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: COpaquePointer?, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: COpaquePointer?, reserved: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: COpaquePointer?, buffersize: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpPrepareUrl(reserved: COpaquePointer?, flags: UInt, url: Pcwstr, preparedurl: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, returnlength: COpaquePointer?, reserved2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: COpaquePointer?, inputlength: UInt, poutput: COpaquePointer?, outputlength: UInt, preturnlength: COpaquePointer?, poverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, returnlength: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt, bytesread: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: COpaquePointer?, sslclientcertinfosize: UInt, bytesreceived: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: COpaquePointer?, requestbufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: COpaquePointer?, entitybufferlength: UInt, bytesreturned: COpaquePointer?, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: COpaquePointer?, cachepolicy: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: COpaquePointer?, bytessent: COpaquePointer?, reserved1: COpaquePointer?, reserved2: UInt, overlapped: COpaquePointer?, logdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: COpaquePointer?, inputpropertysize: UInt, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt, reserved1: UInt, reserved2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: COpaquePointer?, configinformationlength: UInt, poverlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: COpaquePointer?, propertyinformationlength: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpTerminate(flags: HttpInitialize, preserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: COpaquePointer?, configinfolength: UInt, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
