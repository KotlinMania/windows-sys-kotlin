@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthngetassertionoptions: ConstPtr<WebauthnAuthenticatorGetAssertionOptions>, ppwebauthnassertion: MutPtr<MutPtr<WebauthnAssertion>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr<WebauthnRpEntityInformation>, puserinformation: ConstPtr<WebauthnUserEntityInformation>, ppubkeycredparams: ConstPtr<WebauthnCoseCredentialParameters>, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthnmakecredentialoptions: ConstPtr<WebauthnAuthenticatorMakeCredentialOptions>, ppwebauthncredentialattestation: MutPtr<MutPtr<WebauthnCredentialAttestation>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr<WebauthnAssertion>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion")

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr<WebauthnCredentialAttestation>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation")

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr<WebauthnCredentialDetailsList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber")
private external fun wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber(): Int

public actual fun webAuthNGetApiVersionNumber(): UInt =
    wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber().toUInt()

public actual fun webAuthNGetCancellationId(pcancellationid: MutPtr<Guid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr<WebauthnGetCredentialsOptions>, ppcredentialdetailslist: MutPtr<MutPtr<WebauthnCredentialDetailsList>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError")
private external fun wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr: Int): Int

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    wasiWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr).toInt()

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable")

public actual fun wsAbandonCall(serviceproxy: ConstPtr<WsServiceProxy>, callid: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall")

public actual fun wsAbandonMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage")

public actual fun wsAbortChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel")

public actual fun wsAbortListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener")

public actual fun wsAbortServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost")

public actual fun wsAbortServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy")

public actual fun wsAcceptChannel(listener: ConstPtr<WsListener>, channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel")

public actual fun wsAddCustomHeader(message: ConstPtr<WsMessage>, headerdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, headerattributes: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader")

public actual fun wsAddErrorString(error: ConstPtr<WsError>, string: ConstPtr<WsString>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString")

public actual fun wsAddMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader")

public actual fun wsAddressMessage(message: ConstPtr<WsMessage>, address: ConstPtr<WsEndpointAddress>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage")

public actual fun wsAlloc(heap: ConstPtr<WsHeap>, size: ULong, ptr: MutPtr<MutPtr<CVoid>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc")

public actual fun wsAsyncExecute(asyncstate: ConstPtr<WsAsyncState>, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr<CVoid>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute")

public actual fun wsCall(serviceproxy: ConstPtr<WsServiceProxy>, operation: ConstPtr<WsOperationDescription>, arguments: ConstPtr<ConstPtr<CVoid>>, heap: ConstPtr<WsHeap>, callproperties: ConstPtr<WsCallProperty>, callpropertycount: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCall")

public actual fun wsCheckMustUnderstandHeaders(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders")

public actual fun wsCloseChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel")

public actual fun wsCloseListener(listener: ConstPtr<WsListener>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener")

public actual fun wsCloseServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost")

public actual fun wsCloseServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy")

public actual fun wsCombineUrl(baseurl: ConstPtr<WsString>, referenceurl: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, resulturl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl")

public actual fun wsCopyError(source: ConstPtr<WsError>, destination: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError")

public actual fun wsCopyNode(writer: ConstPtr<WsXmlWriter>, reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel")

public actual fun wsCreateChannelForListener(listener: ConstPtr<WsListener>, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener")

public actual fun wsCreateError(properties: ConstPtr<WsErrorProperty>, propertycount: UInt, error: MutPtr<MutPtr<WsError>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError")

public actual fun wsCreateFaultFromError(error: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr<WsHeap>, fault: MutPtr<WsFault>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr<WsHeapProperty>, propertycount: UInt, heap: MutPtr<MutPtr<WsHeap>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsListenerProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, listener: MutPtr<MutPtr<WsListener>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage")

public actual fun wsCreateMessageForChannel(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel")

public actual fun wsCreateMetadata(properties: ConstPtr<WsMetadataProperty>, propertycount: UInt, metadata: MutPtr<MutPtr<WsMetadata>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata")

public actual fun wsCreateReader(properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, reader: MutPtr<MutPtr<WsXmlReader>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsServiceEndpointProperty>, propertycount: UInt, addressurl: ConstPtr<WsString>, contract: ConstPtr<WsServiceContract>, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr<WsHeap>, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceendpoint: MutPtr<MutPtr<WsServiceEndpoint>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate")

public actual fun wsCreateServiceHost(endpoints: ConstPtr<ConstPtr<WsServiceEndpoint>>, endpointcount: UShort, serviceproperties: ConstPtr<WsServiceProperty>, servicepropertycount: UInt, servicehost: MutPtr<MutPtr<WsServiceHost>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr<WsSecurityDescription>, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, channelproperties: ConstPtr<WsChannelProperty>, channelpropertycount: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate")

public actual fun wsCreateWriter(properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, writer: MutPtr<MutPtr<WsXmlWriter>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter")

public actual fun wsCreateXmlBuffer(heap: ConstPtr<WsHeap>, properties: ConstPtr<WsXmlBufferProperty>, propertycount: UInt, buffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer")

public actual fun wsCreateXmlSecurityToken(tokenxml: ConstPtr<WsXmlBuffer>, tokenkey: ConstPtr<WsSecurityKeyHandle>, properties: ConstPtr<WsXmlSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken")

public actual fun wsDateTimeToFileTime(datetime: ConstPtr<WsDatetime>, filetime: MutPtr<Filetime>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime")

public actual fun wsDecodeUrl(url: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<MutPtr<WsUrl>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl")

public actual fun wsEncodeUrl(url: ConstPtr<WsUrl>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl")

public actual fun wsEndReaderCanonicalization(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization")

public actual fun wsEndWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization")

public actual fun wsFileTimeToDateTime(filetime: ConstPtr<Filetime>, datetime: MutPtr<WsDatetime>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime")

public actual fun wsFillBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody")

public actual fun wsFillReader(reader: ConstPtr<WsXmlReader>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader")

public actual fun wsFindAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, required: Bool, attributeindex: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute")

public actual fun wsFlushBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody")

public actual fun wsFlushWriter(writer: ConstPtr<WsXmlWriter>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter")

public actual fun wsFreeChannel(channel: ConstPtr<WsChannel>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel")

public actual fun wsFreeError(error: ConstPtr<WsError>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError")

public actual fun wsFreeHeap(heap: ConstPtr<WsHeap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap")

public actual fun wsFreeListener(listener: ConstPtr<WsListener>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener")

public actual fun wsFreeMessage(message: ConstPtr<WsMessage>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage")

public actual fun wsFreeMetadata(metadata: ConstPtr<WsMetadata>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata")

public actual fun wsFreeReader(reader: ConstPtr<WsXmlReader>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader")

public actual fun wsFreeSecurityToken(token: ConstPtr<WsSecurityToken>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken")

public actual fun wsFreeServiceHost(servicehost: ConstPtr<WsServiceHost>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost")

public actual fun wsFreeServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy")

public actual fun wsFreeWriter(writer: ConstPtr<WsXmlWriter>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter")

public actual fun wsGetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty")

public actual fun wsGetCustomHeader(message: ConstPtr<WsMessage>, customheaderdescription: ConstPtr<WsElementDescription>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr<MutPtr<WsXmlDictionary>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary")

public actual fun wsGetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty")

public actual fun wsGetErrorString(error: ConstPtr<WsError>, index: UInt, string: MutPtr<WsString>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString")

public actual fun wsGetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail")

public actual fun wsGetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty")

public actual fun wsGetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader")

public actual fun wsGetHeaderAttributes(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes")

public actual fun wsGetHeapProperty(heap: ConstPtr<WsHeap>, id: WsHeapPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty")

public actual fun wsGetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty")

public actual fun wsGetMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader")

public actual fun wsGetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty")

public actual fun wsGetMetadataEndpoints(metadata: ConstPtr<WsMetadata>, endpoints: MutPtr<WsMetadataEndpoints>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints")

public actual fun wsGetMetadataProperty(metadata: ConstPtr<WsMetadata>, id: WsMetadataPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr<WsMetadata>, address: MutPtr<MutPtr<WsEndpointAddress>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress")

public actual fun wsGetNamespaceFromPrefix(reader: ConstPtr<WsXmlReader>, prefix: ConstPtr<WsXmlString>, required: Bool, ns: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix")

public actual fun wsGetOperationContextProperty(context: ConstPtr<WsOperationContext>, id: WsOperationContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty")

public actual fun wsGetPolicyAlternativeCount(policy: ConstPtr<WsPolicy>, count: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount")

public actual fun wsGetPolicyProperty(policy: ConstPtr<WsPolicy>, id: WsPolicyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty")

public actual fun wsGetPrefixFromNamespace(writer: ConstPtr<WsXmlWriter>, ns: ConstPtr<WsXmlString>, required: Bool, prefix: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace")

public actual fun wsGetReaderNode(xmlreader: ConstPtr<WsXmlReader>, node: MutPtr<MutPtr<WsXmlNode>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode")

public actual fun wsGetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition")

public actual fun wsGetReaderProperty(reader: ConstPtr<WsXmlReader>, id: WsXmlReaderPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty")

public actual fun wsGetSecurityContextProperty(securitycontext: ConstPtr<WsSecurityContext>, id: WsSecurityContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty")

public actual fun wsGetSecurityTokenProperty(securitytoken: ConstPtr<WsSecurityToken>, id: WsSecurityTokenPropertyId, value: MutPtr<CVoid>, valuesize: UInt, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty")

public actual fun wsGetServiceHostProperty(servicehost: ConstPtr<WsServiceHost>, id: WsServicePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty")

public actual fun wsGetServiceProxyProperty(serviceproxy: ConstPtr<WsServiceProxy>, id: WsProxyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty")

public actual fun wsGetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition")

public actual fun wsGetWriterProperty(writer: ConstPtr<WsXmlWriter>, id: WsXmlWriterPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty")

public actual fun wsGetXmlAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, heap: ConstPtr<WsHeap>, valuechars: MutPtr<MutPtr<UShort>>, valuecharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute")

public actual fun wsInitializeMessage(message: ConstPtr<WsMessage>, initialization: WsMessageInitialization, sourcemessage: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage")

public actual fun wsMarkHeaderAsUnderstood(message: ConstPtr<WsMessage>, headerposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood")

public actual fun wsMatchPolicyAlternative(policy: ConstPtr<WsPolicy>, alternativeindex: UInt, policyconstraints: ConstPtr<WsPolicyConstraints>, matchrequired: Bool, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative")

public actual fun wsMoveReader(reader: ConstPtr<WsXmlReader>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader")

public actual fun wsMoveWriter(writer: ConstPtr<WsXmlWriter>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter")

public actual fun wsOpenChannel(channel: ConstPtr<WsChannel>, endpointaddress: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel")

public actual fun wsOpenListener(listener: ConstPtr<WsListener>, url: ConstPtr<WsString>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener")

public actual fun wsOpenServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost")

public actual fun wsOpenServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, address: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy")

public actual fun wsPullBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPullBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes")

public actual fun wsPushBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPushBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes")

public actual fun wsReadArray(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: MutPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray")

public actual fun wsReadAttribute(reader: ConstPtr<WsXmlReader>, attributedescription: ConstPtr<WsAttributeDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute")

public actual fun wsReadBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody")

public actual fun wsReadBytes(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<CVoid>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes")

public actual fun wsReadChars(reader: ConstPtr<WsXmlReader>, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars")

public actual fun wsReadCharsUtf8(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<UByte>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8")

public actual fun wsReadElement(reader: ConstPtr<WsXmlReader>, elementdescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement")

public actual fun wsReadEndAttribute(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute")

public actual fun wsReadEndElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement")

public actual fun wsReadEndpointAddressExtension(reader: ConstPtr<WsXmlReader>, endpointaddress: ConstPtr<WsEndpointAddress>, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension")

public actual fun wsReadEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd")

public actual fun wsReadEnvelopeStart(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart")

public actual fun wsReadMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd")

public actual fun wsReadMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart")

public actual fun wsReadMetadata(metadata: ConstPtr<WsMetadata>, reader: ConstPtr<WsXmlReader>, url: ConstPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata")

public actual fun wsReadNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode")

public actual fun wsReadQualifiedName(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, prefix: MutPtr<WsXmlString>, localname: MutPtr<WsXmlString>, ns: MutPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName")

public actual fun wsReadStartAttribute(reader: ConstPtr<WsXmlReader>, attributeindex: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute")

public actual fun wsReadStartElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement")

public actual fun wsReadToStartElement(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement")

public actual fun wsReadType(reader: ConstPtr<WsXmlReader>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadType")

public actual fun wsReadValue(reader: ConstPtr<WsXmlReader>, valuetype: WsValueType, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue")

public actual fun wsReadXmlBuffer(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer")

public actual fun wsReadXmlBufferFromBytes(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, bytes: ConstPtr<CVoid>, bytecount: UInt, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes")

public actual fun wsReceiveMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescriptions: ConstPtr<ConstPtr<WsMessageDescription>>, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, index: MutPtr<UInt>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage")

public actual fun wsRegisterOperationForCancel(context: ConstPtr<WsOperationContext>, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel")

public actual fun wsRemoveCustomHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, headerns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader")

public actual fun wsRemoveHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader")

public actual fun wsRemoveMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader")

public actual fun wsRemoveNode(nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode")

public actual fun wsRequestReply(channel: ConstPtr<WsChannel>, requestmessage: ConstPtr<WsMessage>, requestmessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, requestbodyvalue: ConstPtr<CVoid>, requestbodyvaluesize: UInt, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply")

public actual fun wsRequestSecurityToken(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsRequestSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken")

public actual fun wsResetChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel")

public actual fun wsResetError(error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetError")

public actual fun wsResetHeap(heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap")

public actual fun wsResetListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener")

public actual fun wsResetMessage(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage")

public actual fun wsResetMetadata(metadata: ConstPtr<WsMetadata>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata")

public actual fun wsResetServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost")

public actual fun wsResetServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy")

public actual fun wsRevokeSecurityContext(securitycontext: ConstPtr<WsSecurityContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext")

public actual fun wsSendFaultMessageForError(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, faulterror: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError")

public actual fun wsSendMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, bodyvalue: ConstPtr<CVoid>, bodyvaluesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage")

public actual fun wsSendReplyMessage(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, replybodyvalue: ConstPtr<CVoid>, replybodyvaluesize: UInt, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage")

public actual fun wsSetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty")

public actual fun wsSetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty")

public actual fun wsSetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail")

public actual fun wsSetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty")

public actual fun wsSetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader")

public actual fun wsSetInput(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, input: ConstPtr<WsXmlReaderInput>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput")

public actual fun wsSetInputToBuffer(reader: ConstPtr<WsXmlReader>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer")

public actual fun wsSetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty")

public actual fun wsSetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty")

public actual fun wsSetOutput(writer: ConstPtr<WsXmlWriter>, encoding: ConstPtr<WsXmlWriterEncoding>, output: ConstPtr<WsXmlWriterOutput>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput")

public actual fun wsSetOutputToBuffer(writer: ConstPtr<WsXmlWriter>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer")

public actual fun wsSetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition")

public actual fun wsSetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition")

public actual fun wsShutdownSessionChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel")

public actual fun wsSkipNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode")

public actual fun wsStartReaderCanonicalization(reader: ConstPtr<WsXmlReader>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization")

public actual fun wsStartWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr<MutPtr<UShort>>, trimmedcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName")

public actual fun wsWriteArray(writer: ConstPtr<WsXmlWriter>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: ConstPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray")

public actual fun wsWriteAttribute(writer: ConstPtr<WsXmlWriter>, attributedescription: ConstPtr<WsAttributeDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute")

public actual fun wsWriteBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody")

public actual fun wsWriteBytes(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<CVoid>, bytecount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes")

public actual fun wsWriteChars(writer: ConstPtr<WsXmlWriter>, chars: Pcwstr, charcount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars")

public actual fun wsWriteCharsUtf8(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<UByte>, bytecount: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8")

public actual fun wsWriteElement(writer: ConstPtr<WsXmlWriter>, elementdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement")

public actual fun wsWriteEndAttribute(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute")

public actual fun wsWriteEndCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData")

public actual fun wsWriteEndElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement")

public actual fun wsWriteEndStartElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement")

public actual fun wsWriteEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd")

public actual fun wsWriteEnvelopeStart(message: ConstPtr<WsMessage>, writer: ConstPtr<WsXmlWriter>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart")

public actual fun wsWriteMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd")

public actual fun wsWriteMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart")

public actual fun wsWriteNode(writer: ConstPtr<WsXmlWriter>, node: ConstPtr<WsXmlNode>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode")

public actual fun wsWriteQualifiedName(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName")

public actual fun wsWriteStartAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute")

public actual fun wsWriteStartCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData")

public actual fun wsWriteStartElement(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement")

public actual fun wsWriteText(writer: ConstPtr<WsXmlWriter>, text: ConstPtr<WsXmlText>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText")

public actual fun wsWriteType(writer: ConstPtr<WsXmlWriter>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType")

public actual fun wsWriteValue(writer: ConstPtr<WsXmlWriter>, valuetype: WsValueType, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue")

public actual fun wsWriteXmlBuffer(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer")

public actual fun wsWriteXmlBufferToBytes(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, encoding: ConstPtr<WsXmlWriterEncoding>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, heap: ConstPtr<WsHeap>, bytes: MutPtr<MutPtr<CVoid>>, bytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes")

public actual fun wsWriteXmlnsAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute")

public actual fun wsXmlStringEquals(string1: ConstPtr<WsXmlString>, string2: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals")
