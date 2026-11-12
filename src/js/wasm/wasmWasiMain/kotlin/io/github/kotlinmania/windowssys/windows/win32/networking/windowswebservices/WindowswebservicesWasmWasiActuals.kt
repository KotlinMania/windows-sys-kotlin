@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr, pwebauthngetassertionoptions: ConstPtr, ppwebauthnassertion: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr, puserinformation: ConstPtr, ppubkeycredparams: ConstPtr, pwebauthnclientdata: ConstPtr, pwebauthnmakecredentialoptions: ConstPtr, ppwebauthncredentialattestation: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion")

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation")

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber")
private external fun wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber(): Int

public actual fun webAuthNGetApiVersionNumber(): UInt =
    wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber().toUInt()

public actual fun webAuthNGetCancellationId(pcancellationid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr, ppcredentialdetailslist: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError")
private external fun wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr: Int): Int

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr)

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable")

public actual fun wsAbandonCall(serviceproxy: ConstPtr, callid: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall")

public actual fun wsAbandonMessage(channel: ConstPtr, message: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage")

public actual fun wsAbortChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel")

public actual fun wsAbortListener(listener: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener")

public actual fun wsAbortServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost")

public actual fun wsAbortServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy")

public actual fun wsAcceptChannel(listener: ConstPtr, channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel")

public actual fun wsAddCustomHeader(message: ConstPtr, headerdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, headerattributes: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader")

public actual fun wsAddErrorString(error: ConstPtr, string: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString")

public actual fun wsAddMappedHeader(message: ConstPtr, headername: ConstPtr, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader")

public actual fun wsAddressMessage(message: ConstPtr, address: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage")

public actual fun wsAlloc(heap: ConstPtr, size: ULong, ptr: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc")

public actual fun wsAsyncExecute(asyncstate: ConstPtr, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute")

public actual fun wsCall(serviceproxy: ConstPtr, operation: ConstPtr, arguments: ConstPtr, heap: ConstPtr, callproperties: ConstPtr, callpropertycount: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCall")

public actual fun wsCheckMustUnderstandHeaders(message: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders")

public actual fun wsCloseChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel")

public actual fun wsCloseListener(listener: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener")

public actual fun wsCloseServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost")

public actual fun wsCloseServiceProxy(serviceproxy: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy")

public actual fun wsCombineUrl(baseurl: ConstPtr, referenceurl: ConstPtr, flags: UInt, heap: ConstPtr, resulturl: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl")

public actual fun wsCopyError(source: ConstPtr, destination: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError")

public actual fun wsCopyNode(writer: ConstPtr, reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, channel: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel")

public actual fun wsCreateChannelForListener(listener: ConstPtr, properties: ConstPtr, propertycount: UInt, channel: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener")

public actual fun wsCreateError(properties: ConstPtr, propertycount: UInt, error: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError")

public actual fun wsCreateFaultFromError(error: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr, fault: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr, propertycount: UInt, heap: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, listener: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage")

public actual fun wsCreateMessageForChannel(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel")

public actual fun wsCreateMetadata(properties: ConstPtr, propertycount: UInt, metadata: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata")

public actual fun wsCreateReader(properties: ConstPtr, propertycount: UInt, reader: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, addressurl: ConstPtr, contract: ConstPtr, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceendpoint: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate")

public actual fun wsCreateServiceHost(endpoints: ConstPtr, endpointcount: UShort, serviceproperties: ConstPtr, servicepropertycount: UInt, servicehost: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr, properties: ConstPtr, propertycount: UInt, channelproperties: ConstPtr, channelpropertycount: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate")

public actual fun wsCreateWriter(properties: ConstPtr, propertycount: UInt, writer: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter")

public actual fun wsCreateXmlBuffer(heap: ConstPtr, properties: ConstPtr, propertycount: UInt, buffer: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer")

public actual fun wsCreateXmlSecurityToken(tokenxml: ConstPtr, tokenkey: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken")

public actual fun wsDateTimeToFileTime(datetime: ConstPtr, filetime: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime")

public actual fun wsDecodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl")

public actual fun wsEncodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl")

public actual fun wsEndReaderCanonicalization(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization")

public actual fun wsEndWriterCanonicalization(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization")

public actual fun wsFileTimeToDateTime(filetime: ConstPtr, datetime: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime")

public actual fun wsFillBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody")

public actual fun wsFillReader(reader: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader")

public actual fun wsFindAttribute(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, required: Bool, attributeindex: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute")

public actual fun wsFlushBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody")

public actual fun wsFlushWriter(writer: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter")

public actual fun wsFreeChannel(channel: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel")

public actual fun wsFreeError(error: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError")

public actual fun wsFreeHeap(heap: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap")

public actual fun wsFreeListener(listener: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener")

public actual fun wsFreeMessage(message: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage")

public actual fun wsFreeMetadata(metadata: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata")

public actual fun wsFreeReader(reader: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader")

public actual fun wsFreeSecurityToken(token: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken")

public actual fun wsFreeServiceHost(servicehost: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost")

public actual fun wsFreeServiceProxy(serviceproxy: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy")

public actual fun wsFreeWriter(writer: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter")

public actual fun wsGetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty")

public actual fun wsGetCustomHeader(message: ConstPtr, customheaderdescription: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, headerattributes: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary")

public actual fun wsGetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty")

public actual fun wsGetErrorString(error: ConstPtr, index: UInt, string: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString")

public actual fun wsGetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail")

public actual fun wsGetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty")

public actual fun wsGetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader")

public actual fun wsGetHeaderAttributes(message: ConstPtr, reader: ConstPtr, headerattributes: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes")

public actual fun wsGetHeapProperty(heap: ConstPtr, id: WsHeapPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty")

public actual fun wsGetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty")

public actual fun wsGetMappedHeader(message: ConstPtr, headername: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader")

public actual fun wsGetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty")

public actual fun wsGetMetadataEndpoints(metadata: ConstPtr, endpoints: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints")

public actual fun wsGetMetadataProperty(metadata: ConstPtr, id: WsMetadataPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr, address: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress")

public actual fun wsGetNamespaceFromPrefix(reader: ConstPtr, prefix: ConstPtr, required: Bool, ns: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix")

public actual fun wsGetOperationContextProperty(context: ConstPtr, id: WsOperationContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty")

public actual fun wsGetPolicyAlternativeCount(policy: ConstPtr, count: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount")

public actual fun wsGetPolicyProperty(policy: ConstPtr, id: WsPolicyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty")

public actual fun wsGetPrefixFromNamespace(writer: ConstPtr, ns: ConstPtr, required: Bool, prefix: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace")

public actual fun wsGetReaderNode(xmlreader: ConstPtr, node: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode")

public actual fun wsGetReaderPosition(reader: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition")

public actual fun wsGetReaderProperty(reader: ConstPtr, id: WsXmlReaderPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty")

public actual fun wsGetSecurityContextProperty(securitycontext: ConstPtr, id: WsSecurityContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty")

public actual fun wsGetSecurityTokenProperty(securitytoken: ConstPtr, id: WsSecurityTokenPropertyId, value: MutPtr, valuesize: UInt, heap: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty")

public actual fun wsGetServiceHostProperty(servicehost: ConstPtr, id: WsServicePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty")

public actual fun wsGetServiceProxyProperty(serviceproxy: ConstPtr, id: WsProxyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty")

public actual fun wsGetWriterPosition(writer: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition")

public actual fun wsGetWriterProperty(writer: ConstPtr, id: WsXmlWriterPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty")

public actual fun wsGetXmlAttribute(reader: ConstPtr, localname: ConstPtr, heap: ConstPtr, valuechars: MutPtr, valuecharcount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute")

public actual fun wsInitializeMessage(message: ConstPtr, initialization: WsMessageInitialization, sourcemessage: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage")

public actual fun wsMarkHeaderAsUnderstood(message: ConstPtr, headerposition: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood")

public actual fun wsMatchPolicyAlternative(policy: ConstPtr, alternativeindex: UInt, policyconstraints: ConstPtr, matchrequired: Bool, heap: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative")

public actual fun wsMoveReader(reader: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader")

public actual fun wsMoveWriter(writer: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter")

public actual fun wsOpenChannel(channel: ConstPtr, endpointaddress: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel")

public actual fun wsOpenListener(listener: ConstPtr, url: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener")

public actual fun wsOpenServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost")

public actual fun wsOpenServiceProxy(serviceproxy: ConstPtr, address: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy")

public actual fun wsPullBytes(writer: ConstPtr, callback: WsPullBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes")

public actual fun wsPushBytes(writer: ConstPtr, callback: WsPushBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes")

public actual fun wsReadArray(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: MutPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray")

public actual fun wsReadAttribute(reader: ConstPtr, attributedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute")

public actual fun wsReadBody(message: ConstPtr, bodydescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody")

public actual fun wsReadBytes(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes")

public actual fun wsReadChars(reader: ConstPtr, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars")

public actual fun wsReadCharsUtf8(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8")

public actual fun wsReadElement(reader: ConstPtr, elementdescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement")

public actual fun wsReadEndAttribute(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute")

public actual fun wsReadEndElement(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement")

public actual fun wsReadEndpointAddressExtension(reader: ConstPtr, endpointaddress: ConstPtr, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension")

public actual fun wsReadEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd")

public actual fun wsReadEnvelopeStart(message: ConstPtr, reader: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart")

public actual fun wsReadMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd")

public actual fun wsReadMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart")

public actual fun wsReadMetadata(metadata: ConstPtr, reader: ConstPtr, url: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata")

public actual fun wsReadNode(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode")

public actual fun wsReadQualifiedName(reader: ConstPtr, heap: ConstPtr, prefix: MutPtr, localname: MutPtr, ns: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName")

public actual fun wsReadStartAttribute(reader: ConstPtr, attributeindex: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute")

public actual fun wsReadStartElement(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement")

public actual fun wsReadToStartElement(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, found: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement")

public actual fun wsReadType(reader: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadType")

public actual fun wsReadValue(reader: ConstPtr, valuetype: WsValueType, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue")

public actual fun wsReadXmlBuffer(reader: ConstPtr, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer")

public actual fun wsReadXmlBufferFromBytes(reader: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, bytes: ConstPtr, bytecount: UInt, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes")

public actual fun wsReceiveMessage(channel: ConstPtr, message: ConstPtr, messagedescriptions: ConstPtr, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, index: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage")

public actual fun wsRegisterOperationForCancel(context: ConstPtr, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel")

public actual fun wsRemoveCustomHeader(message: ConstPtr, headername: ConstPtr, headerns: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader")

public actual fun wsRemoveHeader(message: ConstPtr, headertype: WsHeaderType, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader")

public actual fun wsRemoveMappedHeader(message: ConstPtr, headername: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader")

public actual fun wsRemoveNode(nodeposition: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode")

public actual fun wsRequestReply(channel: ConstPtr, requestmessage: ConstPtr, requestmessagedescription: ConstPtr, writeoption: WsWriteOption, requestbodyvalue: ConstPtr, requestbodyvaluesize: UInt, replymessage: ConstPtr, replymessagedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply")

public actual fun wsRequestSecurityToken(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken")

public actual fun wsResetChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel")

public actual fun wsResetError(error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetError")

public actual fun wsResetHeap(heap: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap")

public actual fun wsResetListener(listener: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener")

public actual fun wsResetMessage(message: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage")

public actual fun wsResetMetadata(metadata: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata")

public actual fun wsResetServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost")

public actual fun wsResetServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy")

public actual fun wsRevokeSecurityContext(securitycontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext")

public actual fun wsSendFaultMessageForError(channel: ConstPtr, replymessage: ConstPtr, faulterror: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError")

public actual fun wsSendMessage(channel: ConstPtr, message: ConstPtr, messagedescription: ConstPtr, writeoption: WsWriteOption, bodyvalue: ConstPtr, bodyvaluesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage")

public actual fun wsSendReplyMessage(channel: ConstPtr, replymessage: ConstPtr, replymessagedescription: ConstPtr, writeoption: WsWriteOption, replybodyvalue: ConstPtr, replybodyvaluesize: UInt, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage")

public actual fun wsSetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty")

public actual fun wsSetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty")

public actual fun wsSetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail")

public actual fun wsSetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty")

public actual fun wsSetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader")

public actual fun wsSetInput(reader: ConstPtr, encoding: ConstPtr, input: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput")

public actual fun wsSetInputToBuffer(reader: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer")

public actual fun wsSetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty")

public actual fun wsSetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty")

public actual fun wsSetOutput(writer: ConstPtr, encoding: ConstPtr, output: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput")

public actual fun wsSetOutputToBuffer(writer: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer")

public actual fun wsSetReaderPosition(reader: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition")

public actual fun wsSetWriterPosition(writer: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition")

public actual fun wsShutdownSessionChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel")

public actual fun wsSkipNode(reader: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode")

public actual fun wsStartReaderCanonicalization(reader: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization")

public actual fun wsStartWriterCanonicalization(writer: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr, trimmedcount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName")

public actual fun wsWriteArray(writer: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: ConstPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray")

public actual fun wsWriteAttribute(writer: ConstPtr, attributedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute")

public actual fun wsWriteBody(message: ConstPtr, bodydescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody")

public actual fun wsWriteBytes(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes")

public actual fun wsWriteChars(writer: ConstPtr, chars: Pcwstr, charcount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars")

public actual fun wsWriteCharsUtf8(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8")

public actual fun wsWriteElement(writer: ConstPtr, elementdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement")

public actual fun wsWriteEndAttribute(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute")

public actual fun wsWriteEndCData(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData")

public actual fun wsWriteEndElement(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement")

public actual fun wsWriteEndStartElement(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement")

public actual fun wsWriteEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd")

public actual fun wsWriteEnvelopeStart(message: ConstPtr, writer: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart")

public actual fun wsWriteMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd")

public actual fun wsWriteMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart")

public actual fun wsWriteNode(writer: ConstPtr, node: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode")

public actual fun wsWriteQualifiedName(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName")

public actual fun wsWriteStartAttribute(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute")

public actual fun wsWriteStartCData(writer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData")

public actual fun wsWriteStartElement(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement")

public actual fun wsWriteText(writer: ConstPtr, text: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText")

public actual fun wsWriteType(writer: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType")

public actual fun wsWriteValue(writer: ConstPtr, valuetype: WsValueType, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue")

public actual fun wsWriteXmlBuffer(writer: ConstPtr, xmlbuffer: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer")

public actual fun wsWriteXmlBufferToBytes(writer: ConstPtr, xmlbuffer: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, heap: ConstPtr, bytes: MutPtr, bytecount: MutPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes")

public actual fun wsWriteXmlnsAttribute(writer: ConstPtr, prefix: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute")

public actual fun wsXmlStringEquals(string1: ConstPtr, string2: ConstPtr, error: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals")
