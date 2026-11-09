package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public expect fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT

public expect fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT

public expect fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT

public expect fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT

public expect fun WebAuthNFreeAssertion(pwebauthnassertion: Long)

public expect fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long)

public expect fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long)

public expect fun WebAuthNGetApiVersionNumber(): UInt

public expect fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT

public expect fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR

public expect fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT

public expect fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT

public expect fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT

public expect fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT

public expect fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT

public expect fun WsAbortChannel(channel: Long, error: Long): HRESULT

public expect fun WsAbortListener(listener: Long, error: Long): HRESULT

public expect fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT

public expect fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT

public expect fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT

public expect fun WsAddErrorString(error: Long, string: Long): HRESULT

public expect fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT

public expect fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT

public expect fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT

public expect fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT

public expect fun WsCopyError(source: Long, destination: Long): HRESULT

public expect fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT

public expect fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT

public expect fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT

public expect fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT

public expect fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT

public expect fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT

public expect fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT

public expect fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT

public expect fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT

public expect fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT

public expect fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT

public expect fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT

public expect fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT

public expect fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT

public expect fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT

public expect fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT

public expect fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT

public expect fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT

public expect fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT

public expect fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT

public expect fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT

public expect fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT

public expect fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT

public expect fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT

public expect fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsFreeChannel(channel: Long)

public expect fun WsFreeError(error: Long)

public expect fun WsFreeHeap(heap: Long)

public expect fun WsFreeListener(listener: Long)

public expect fun WsFreeMessage(message: Long)

public expect fun WsFreeMetadata(metadata: Long)

public expect fun WsFreeReader(reader: Long)

public expect fun WsFreeSecurityToken(token: Long)

public expect fun WsFreeServiceHost(servicehost: Long)

public expect fun WsFreeServiceProxy(serviceproxy: Long)

public expect fun WsFreeWriter(writer: Long)

public expect fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT

public expect fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT

public expect fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT

public expect fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT

public expect fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT

public expect fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT

public expect fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT

public expect fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT

public expect fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT

public expect fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT

public expect fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT

public expect fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT

public expect fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT

public expect fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT

public expect fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT

public expect fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT

public expect fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT

public expect fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT

public expect fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT

public expect fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT

public expect fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT

public expect fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT

public expect fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT

public expect fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT

public expect fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT

public expect fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT

public expect fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT

public expect fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT

public expect fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadEndAttribute(reader: Long, error: Long): HRESULT

public expect fun WsReadEndElement(reader: Long, error: Long): HRESULT

public expect fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT

public expect fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT

public expect fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT

public expect fun WsReadNode(reader: Long, error: Long): HRESULT

public expect fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT

public expect fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT

public expect fun WsReadStartElement(reader: Long, error: Long): HRESULT

public expect fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT

public expect fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT

public expect fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT

public expect fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT

public expect fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT

public expect fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT

public expect fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT

public expect fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT

public expect fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsResetChannel(channel: Long, error: Long): HRESULT

public expect fun WsResetError(error: Long): HRESULT

public expect fun WsResetHeap(heap: Long, error: Long): HRESULT

public expect fun WsResetListener(listener: Long, error: Long): HRESULT

public expect fun WsResetMessage(message: Long, error: Long): HRESULT

public expect fun WsResetMetadata(metadata: Long, error: Long): HRESULT

public expect fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT

public expect fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT

public expect fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT

public expect fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT

public expect fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT

public expect fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT

public expect fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT

public expect fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT

public expect fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT

public expect fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsSkipNode(reader: Long, error: Long): HRESULT

public expect fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT

public expect fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT

public expect fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT

public expect fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT

public expect fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT

public expect fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT

public expect fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT

public expect fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT

public expect fun WsWriteEndCData(writer: Long, error: Long): HRESULT

public expect fun WsWriteEndElement(writer: Long, error: Long): HRESULT

public expect fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT

public expect fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT

public expect fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT

public expect fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT

public expect fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT

public expect fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT

public expect fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT

public expect fun WsWriteStartCData(writer: Long, error: Long): HRESULT

public expect fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT

public expect fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT

public expect fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT

public expect fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT

public expect fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT

public expect fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT

public expect fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT
