@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: COpaquePointer?, pwebauthngetassertionoptions: COpaquePointer?, ppwebauthnassertion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: COpaquePointer?, puserinformation: COpaquePointer?, ppubkeycredparams: COpaquePointer?, pwebauthnclientdata: COpaquePointer?, pwebauthnmakecredentialoptions: COpaquePointer?, ppwebauthncredentialattestation: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNGetApiVersionNumber(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNGetCancellationId(pcancellationid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: COpaquePointer?, ppcredentialdetailslist: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbandonCall(serviceproxy: COpaquePointer?, callid: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbandonMessage(channel: COpaquePointer?, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbortChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbortListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbortServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAbortServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAcceptChannel(listener: COpaquePointer?, channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAddCustomHeader(message: COpaquePointer?, headerdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, headerattributes: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAddErrorString(error: COpaquePointer?, string: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAddMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAddressMessage(message: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAlloc(heap: COpaquePointer?, size: ULong, ptr: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsAsyncExecute(asyncstate: COpaquePointer?, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCall(serviceproxy: COpaquePointer?, operation: COpaquePointer?, arguments: COpaquePointer?, heap: COpaquePointer?, callproperties: COpaquePointer?, callpropertycount: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCheckMustUnderstandHeaders(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCloseChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCloseListener(listener: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCloseServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCloseServiceProxy(serviceproxy: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCombineUrl(baseurl: COpaquePointer?, referenceurl: COpaquePointer?, flags: UInt, heap: COpaquePointer?, resulturl: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCopyError(source: COpaquePointer?, destination: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCopyNode(writer: COpaquePointer?, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateChannelForListener(listener: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateError(properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateFaultFromError(error: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: COpaquePointer?, fault: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateMessageForChannel(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateMetadata(properties: COpaquePointer?, propertycount: UInt, metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateReader(properties: COpaquePointer?, propertycount: UInt, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, addressurl: COpaquePointer?, contract: COpaquePointer?, authorizationcallback: WsServiceSecurityCallback, heap: COpaquePointer?, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceendpoint: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateServiceHost(endpoints: COpaquePointer?, endpointcount: UShort, serviceproperties: COpaquePointer?, servicepropertycount: UInt, servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channelproperties: COpaquePointer?, channelpropertycount: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateWriter(properties: COpaquePointer?, propertycount: UInt, writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateXmlBuffer(heap: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, buffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsCreateXmlSecurityToken(tokenxml: COpaquePointer?, tokenkey: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsDateTimeToFileTime(datetime: COpaquePointer?, filetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsDecodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsEncodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsEndReaderCanonicalization(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsEndWriterCanonicalization(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFileTimeToDateTime(filetime: COpaquePointer?, datetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFillBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFillReader(reader: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFindAttribute(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, required: Bool, attributeindex: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFlushBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFlushWriter(writer: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeChannel(channel: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeError(error: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeHeap(heap: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeListener(listener: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeMessage(message: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeMetadata(metadata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeReader(reader: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeSecurityToken(token: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeServiceHost(servicehost: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeServiceProxy(serviceproxy: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsFreeWriter(writer: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetCustomHeader(message: COpaquePointer?, customheaderdescription: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetErrorString(error: COpaquePointer?, index: UInt, string: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetHeaderAttributes(message: COpaquePointer?, reader: COpaquePointer?, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetHeapProperty(heap: COpaquePointer?, id: WsHeapPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetMetadataEndpoints(metadata: COpaquePointer?, endpoints: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetMetadataProperty(metadata: COpaquePointer?, id: WsMetadataPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetNamespaceFromPrefix(reader: COpaquePointer?, prefix: COpaquePointer?, required: Bool, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetOperationContextProperty(context: COpaquePointer?, id: WsOperationContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetPolicyAlternativeCount(policy: COpaquePointer?, count: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetPolicyProperty(policy: COpaquePointer?, id: WsPolicyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetPrefixFromNamespace(writer: COpaquePointer?, ns: COpaquePointer?, required: Bool, prefix: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetReaderNode(xmlreader: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetReaderProperty(reader: COpaquePointer?, id: WsXmlReaderPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetSecurityContextProperty(securitycontext: COpaquePointer?, id: WsSecurityContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetSecurityTokenProperty(securitytoken: COpaquePointer?, id: WsSecurityTokenPropertyId, value: COpaquePointer?, valuesize: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetServiceHostProperty(servicehost: COpaquePointer?, id: WsServicePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetServiceProxyProperty(serviceproxy: COpaquePointer?, id: WsProxyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetWriterProperty(writer: COpaquePointer?, id: WsXmlWriterPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsGetXmlAttribute(reader: COpaquePointer?, localname: COpaquePointer?, heap: COpaquePointer?, valuechars: COpaquePointer?, valuecharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsInitializeMessage(message: COpaquePointer?, initialization: WsMessageInitialization, sourcemessage: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsMarkHeaderAsUnderstood(message: COpaquePointer?, headerposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsMatchPolicyAlternative(policy: COpaquePointer?, alternativeindex: UInt, policyconstraints: COpaquePointer?, matchrequired: Bool, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsMoveReader(reader: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsMoveWriter(writer: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsOpenChannel(channel: COpaquePointer?, endpointaddress: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsOpenListener(listener: COpaquePointer?, url: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsOpenServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsOpenServiceProxy(serviceproxy: COpaquePointer?, address: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsPullBytes(writer: COpaquePointer?, callback: WsPullBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsPushBytes(writer: COpaquePointer?, callback: WsPushBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadArray(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadAttribute(reader: COpaquePointer?, attributedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadBody(message: COpaquePointer?, bodydescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadBytes(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadChars(reader: COpaquePointer?, chars: Pwstr, maxcharcount: UInt, actualcharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadCharsUtf8(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadElement(reader: COpaquePointer?, elementdescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadEndAttribute(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadEndElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadEndpointAddressExtension(reader: COpaquePointer?, endpointaddress: COpaquePointer?, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadEnvelopeStart(message: COpaquePointer?, reader: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadMetadata(metadata: COpaquePointer?, reader: COpaquePointer?, url: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadQualifiedName(reader: COpaquePointer?, heap: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadStartAttribute(reader: COpaquePointer?, attributeindex: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadStartElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadToStartElement(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadType(reader: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadValue(reader: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadXmlBuffer(reader: COpaquePointer?, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReadXmlBufferFromBytes(reader: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, bytes: COpaquePointer?, bytecount: UInt, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsReceiveMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescriptions: COpaquePointer?, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, index: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRegisterOperationForCancel(context: COpaquePointer?, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRemoveCustomHeader(message: COpaquePointer?, headername: COpaquePointer?, headerns: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRemoveHeader(message: COpaquePointer?, headertype: WsHeaderType, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRemoveMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRemoveNode(nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRequestReply(channel: COpaquePointer?, requestmessage: COpaquePointer?, requestmessagedescription: COpaquePointer?, writeoption: WsWriteOption, requestbodyvalue: COpaquePointer?, requestbodyvaluesize: UInt, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRequestSecurityToken(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetError(error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetHeap(heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetMessage(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetMetadata(metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsResetServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsRevokeSecurityContext(securitycontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSendFaultMessageForError(channel: COpaquePointer?, replymessage: COpaquePointer?, faulterror: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSendMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescription: COpaquePointer?, writeoption: WsWriteOption, bodyvalue: COpaquePointer?, bodyvaluesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSendReplyMessage(channel: COpaquePointer?, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, writeoption: WsWriteOption, replybodyvalue: COpaquePointer?, replybodyvaluesize: UInt, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetInput(reader: COpaquePointer?, encoding: COpaquePointer?, input: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetInputToBuffer(reader: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetOutput(writer: COpaquePointer?, encoding: COpaquePointer?, output: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetOutputToBuffer(writer: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsShutdownSessionChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsSkipNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsStartReaderCanonicalization(reader: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsStartWriterCanonicalization(writer: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: COpaquePointer?, trimmedcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteArray(writer: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteAttribute(writer: COpaquePointer?, attributedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteBody(message: COpaquePointer?, bodydescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteBytes(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteChars(writer: COpaquePointer?, chars: Pcwstr, charcount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteCharsUtf8(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteElement(writer: COpaquePointer?, elementdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEndAttribute(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEndCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEndElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEndStartElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteEnvelopeStart(message: COpaquePointer?, writer: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteNode(writer: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteQualifiedName(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteStartAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteStartCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteStartElement(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteText(writer: COpaquePointer?, text: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteType(writer: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteValue(writer: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteXmlBuffer(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteXmlBufferToBytes(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, bytes: COpaquePointer?, bytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsWriteXmlnsAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wsXmlStringEquals(string1: COpaquePointer?, string2: COpaquePointer?, error: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
