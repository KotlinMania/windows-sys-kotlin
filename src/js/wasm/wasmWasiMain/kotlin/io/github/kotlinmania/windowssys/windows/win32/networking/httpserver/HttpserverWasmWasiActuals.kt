@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun httpAddFragmentToCache(requestqueuehandle: Handle, urlprefix: Pcwstr, datachunk: ConstPtr<HttpDataChunk>, cachepolicy: ConstPtr<HttpCachePolicy>, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpAddFragmentToCache")

public actual fun httpAddUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr, reserved: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpAddUrl")

public actual fun httpAddUrlToUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, urlcontext: ULong, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpAddUrlToUrlGroup")

public actual fun httpCancelHttpRequest(requestqueuehandle: Handle, requestid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCancelHttpRequest")

public actual fun httpCloseRequestQueue(requestqueuehandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCloseRequestQueue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession")
private external fun wasiWindowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid: Long): Int

public actual fun httpCloseServerSession(serversessionid: ULong): UInt =
    wasiWindowssysWindowsWin32NetworkingHttpserverHttpCloseServerSession(serversessionid.toLong()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup")
private external fun wasiWindowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid: Long): Int

public actual fun httpCloseUrlGroup(urlgroupid: ULong): UInt =
    wasiWindowssysWindowsWin32NetworkingHttpserverHttpCloseUrlGroup(urlgroupid.toLong()).toUInt()

public actual fun httpCreateHttpHandle(requestqueuehandle: MutPtr<Handle>, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCreateHttpHandle")

public actual fun httpCreateRequestQueue(version: HttpapiVersion, name: Pcwstr, securityattributes: ConstPtr<SecurityAttributes>, flags: UInt, requestqueuehandle: MutPtr<Handle>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCreateRequestQueue")

public actual fun httpCreateServerSession(version: HttpapiVersion, serversessionid: MutPtr<ULong>, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCreateServerSession")

public actual fun httpCreateUrlGroup(serversessionid: ULong, purlgroupid: MutPtr<ULong>, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpCreateUrlGroup")

public actual fun httpDeclarePush(requestqueuehandle: Handle, requestid: ULong, verb: HttpVerb, path: Pcwstr, query: Pcstr, headers: ConstPtr<HttpRequestHeaders>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpDeclarePush")

public actual fun httpDelegateRequestEx(requestqueuehandle: Handle, delegatequeuehandle: Handle, requestid: ULong, delegateurlgroupid: ULong, propertyinfosetsize: UInt, propertyinfoset: ConstPtr<HttpDelegateRequestPropertyInfo>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpDelegateRequestEx")

public actual fun httpDeleteServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpDeleteServiceConfiguration")

public actual fun httpFindUrlGroupId(fullyqualifiedurl: Pcwstr, requestqueuehandle: Handle, urlgroupid: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpFindUrlGroupId")

public actual fun httpFlushResponseCache(requestqueuehandle: Handle, urlprefix: Pcwstr, flags: UInt, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpFlushResponseCache")

public actual fun httpGetExtension(version: HttpapiVersion, extension: UInt, buffer: MutPtr<CVoid>, buffersize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpGetExtension")

public actual fun httpInitialize(version: HttpapiVersion, flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpInitialize")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported")
private external fun wasiWindowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid: Int): Int

public actual fun httpIsFeatureSupported(featureid: HttpFeatureId): Bool =
    wasiWindowssysWindowsWin32NetworkingHttpserverHttpIsFeatureSupported(featureid)

public actual fun httpPrepareUrl(reserved: ConstPtr<CVoid>, flags: UInt, url: Pcwstr, preparedurl: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpPrepareUrl")

public actual fun httpQueryRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, returnlength: MutPtr<UInt>, reserved2: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpQueryRequestQueueProperty")

public actual fun httpQueryServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpQueryServerSessionProperty")

public actual fun httpQueryServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pinput: ConstPtr<CVoid>, inputlength: UInt, poutput: MutPtr<CVoid>, outputlength: UInt, preturnlength: MutPtr<UInt>, poverlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpQueryServiceConfiguration")

public actual fun httpQueryUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: MutPtr<CVoid>, propertyinformationlength: UInt, returnlength: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpQueryUrlGroupProperty")

public actual fun httpReadFragmentFromCache(requestqueuehandle: Handle, urlprefix: Pcwstr, byterange: ConstPtr<HttpByteRange>, buffer: MutPtr<CVoid>, bufferlength: UInt, bytesread: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpReadFragmentFromCache")

public actual fun httpReceiveClientCertificate(requestqueuehandle: Handle, connectionid: ULong, flags: UInt, sslclientcertinfo: MutPtr<HttpSslClientCertInfo>, sslclientcertinfosize: UInt, bytesreceived: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpReceiveClientCertificate")

public actual fun httpReceiveHttpRequest(requestqueuehandle: Handle, requestid: ULong, flags: HttpReceiveHttpRequestFlags, requestbuffer: MutPtr<HttpRequestV2>, requestbufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpReceiveHttpRequest")

public actual fun httpReceiveRequestEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitybuffer: MutPtr<CVoid>, entitybufferlength: UInt, bytesreturned: MutPtr<UInt>, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpReceiveRequestEntityBody")

public actual fun httpRemoveUrl(requestqueuehandle: Handle, fullyqualifiedurl: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrl")

public actual fun httpRemoveUrlFromUrlGroup(urlgroupid: ULong, pfullyqualifiedurl: Pcwstr, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpRemoveUrlFromUrlGroup")

public actual fun httpSendHttpResponse(requestqueuehandle: Handle, requestid: ULong, flags: UInt, httpresponse: ConstPtr<HttpResponseV2>, cachepolicy: ConstPtr<HttpCachePolicy>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSendHttpResponse")

public actual fun httpSendResponseEntityBody(requestqueuehandle: Handle, requestid: ULong, flags: UInt, entitychunkcount: UShort, entitychunks: ConstPtr<HttpDataChunk>, bytessent: MutPtr<UInt>, reserved1: ConstPtr<CVoid>, reserved2: UInt, overlapped: MutPtr<Overlapped>, logdata: ConstPtr<HttpLogData>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSendResponseEntityBody")

public actual fun httpSetRequestProperty(requestqueuehandle: Handle, id: ULong, propertyid: HttpRequestProperty, input: ConstPtr<CVoid>, inputpropertysize: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSetRequestProperty")

public actual fun httpSetRequestQueueProperty(requestqueuehandle: Handle, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt, reserved1: UInt, reserved2: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSetRequestQueueProperty")

public actual fun httpSetServerSessionProperty(serversessionid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSetServerSessionProperty")

public actual fun httpSetServiceConfiguration(servicehandle: Handle, configid: HttpServiceConfigId, pconfiginformation: ConstPtr<CVoid>, configinformationlength: UInt, poverlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSetServiceConfiguration")

public actual fun httpSetUrlGroupProperty(urlgroupid: ULong, property: HttpServerProperty, propertyinformation: ConstPtr<CVoid>, propertyinformationlength: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpSetUrlGroupProperty")

public actual fun httpShutdownRequestQueue(requestqueuehandle: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpShutdownRequestQueue")

public actual fun httpTerminate(flags: HttpInitialize, preserved: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpTerminate")

public actual fun httpUpdateServiceConfiguration(handle: Handle, configid: HttpServiceConfigId, configinfo: ConstPtr<CVoid>, configinfolength: UInt, overlapped: ConstPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpUpdateServiceConfiguration")

public actual fun httpWaitForDemandStart(requestqueuehandle: Handle, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpWaitForDemandStart")

public actual fun httpWaitForDisconnect(requestqueuehandle: Handle, connectionid: ULong, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnect")

public actual fun httpWaitForDisconnectEx(requestqueuehandle: Handle, connectionid: ULong, reserved: UInt, overlapped: MutPtr<Overlapped>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingHttpserverHttpWaitForDisconnectEx")
