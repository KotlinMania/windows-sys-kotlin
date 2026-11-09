@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT =
    0

public actual fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT =
    0

public actual fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT =
    0

public actual fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT =
    0

public actual fun WebAuthNFreeAssertion(pwebauthnassertion: Long) {
}

public actual fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long) {
}

public actual fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long) {
}

public actual fun WebAuthNGetApiVersionNumber(): UInt =
    0u

public actual fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT =
    0

public actual fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR =
    0L

public actual fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT =
    0

public actual fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT =
    0

public actual fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT =
    0

public actual fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT =
    0

public actual fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT =
    0

public actual fun WsAbortChannel(channel: Long, error: Long): HRESULT =
    0

public actual fun WsAbortListener(listener: Long, error: Long): HRESULT =
    0

public actual fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT =
    0

public actual fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    0

public actual fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT =
    0

public actual fun WsAddErrorString(error: Long, string: Long): HRESULT =
    0

public actual fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT =
    0

public actual fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT =
    0

public actual fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT =
    0

public actual fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT =
    0

public actual fun WsCopyError(source: Long, destination: Long): HRESULT =
    0

public actual fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT =
    0

public actual fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT =
    0

public actual fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT =
    0

public actual fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT =
    0

public actual fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT =
    0

public actual fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT =
    0

public actual fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    0

public actual fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    0

public actual fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT =
    0

public actual fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT =
    0

public actual fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT =
    0

public actual fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT =
    0

public actual fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT =
    0

public actual fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT =
    0

public actual fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT =
    0

public actual fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT =
    0

public actual fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT =
    0

public actual fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT =
    0

public actual fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    0

public actual fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    0

public actual fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT =
    0

public actual fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT =
    0

public actual fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT =
    0

public actual fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT =
    0

public actual fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsFreeChannel(channel: Long) {
}

public actual fun WsFreeError(error: Long) {
}

public actual fun WsFreeHeap(heap: Long) {
}

public actual fun WsFreeListener(listener: Long) {
}

public actual fun WsFreeMessage(message: Long) {
}

public actual fun WsFreeMetadata(metadata: Long) {
}

public actual fun WsFreeReader(reader: Long) {
}

public actual fun WsFreeSecurityToken(token: Long) {
}

public actual fun WsFreeServiceHost(servicehost: Long) {
}

public actual fun WsFreeServiceProxy(serviceproxy: Long) {
}

public actual fun WsFreeWriter(writer: Long) {
}

public actual fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT =
    0

public actual fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT =
    0

public actual fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    0

public actual fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT =
    0

public actual fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT =
    0

public actual fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    0

public actual fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT =
    0

public actual fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT =
    0

public actual fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT =
    0

public actual fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT =
    0

public actual fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT =
    0

public actual fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT =
    0

public actual fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT =
    0

public actual fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    0

public actual fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT =
    0

public actual fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    0

public actual fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT =
    0

public actual fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT =
    0

public actual fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT =
    0

public actual fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT =
    0

public actual fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    0

public actual fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    0

public actual fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    0

public actual fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    0

public actual fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT =
    0

public actual fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    0

public actual fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT =
    0

public actual fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    0

public actual fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadEndAttribute(reader: Long, error: Long): HRESULT =
    0

public actual fun WsReadEndElement(reader: Long, error: Long): HRESULT =
    0

public actual fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT =
    0

public actual fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    0

public actual fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT =
    0

public actual fun WsReadNode(reader: Long, error: Long): HRESULT =
    0

public actual fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    0

public actual fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT =
    0

public actual fun WsReadStartElement(reader: Long, error: Long): HRESULT =
    0

public actual fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT =
    0

public actual fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    0

public actual fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    0

public actual fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT =
    0

public actual fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT =
    0

public actual fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT =
    0

public actual fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT =
    0

public actual fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT =
    0

public actual fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsResetChannel(channel: Long, error: Long): HRESULT =
    0

public actual fun WsResetError(error: Long): HRESULT =
    0

public actual fun WsResetHeap(heap: Long, error: Long): HRESULT =
    0

public actual fun WsResetListener(listener: Long, error: Long): HRESULT =
    0

public actual fun WsResetMessage(message: Long, error: Long): HRESULT =
    0

public actual fun WsResetMetadata(metadata: Long, error: Long): HRESULT =
    0

public actual fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT =
    0

public actual fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    0

public actual fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT =
    0

public actual fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    0

public actual fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT =
    0

public actual fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    0

public actual fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    0

public actual fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    0

public actual fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsSkipNode(reader: Long, error: Long): HRESULT =
    0

public actual fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    0

public actual fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT =
    0

public actual fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteEndCData(writer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteEndElement(writer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT =
    0

public actual fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    0

public actual fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    0

public actual fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT =
    0

public actual fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    0

public actual fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    0

public actual fun WsWriteStartCData(writer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    0

public actual fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT =
    0

public actual fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    0

public actual fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT =
    0

public actual fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT =
    0

public actual fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    0

public actual fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT =
    0
