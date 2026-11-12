package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr, pwebauthngetassertionoptions: ConstPtr, ppwebauthnassertion: MutPtr): Hresult

public expect fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr, puserinformation: ConstPtr, ppubkeycredparams: ConstPtr, pwebauthnclientdata: ConstPtr, pwebauthnmakecredentialoptions: ConstPtr, ppwebauthncredentialattestation: MutPtr): Hresult

public expect fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr): Hresult

public expect fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr): Hresult

public expect fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr)

public expect fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr)

public expect fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr)

public expect fun webAuthNGetApiVersionNumber(): UInt

public expect fun webAuthNGetCancellationId(pcancellationid: MutPtr): Hresult

public expect fun webAuthNGetErrorName(hr: Hresult): Pcwstr

public expect fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr, ppcredentialdetailslist: MutPtr): Hresult

public expect fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult

public expect fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr): Hresult

public expect fun wsAbandonCall(serviceproxy: ConstPtr, callid: UInt, error: ConstPtr): Hresult

public expect fun wsAbandonMessage(channel: ConstPtr, message: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAbortChannel(channel: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAbortListener(listener: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAbortServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAbortServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAcceptChannel(listener: ConstPtr, channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAddCustomHeader(message: ConstPtr, headerdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, headerattributes: UInt, error: ConstPtr): Hresult

public expect fun wsAddErrorString(error: ConstPtr, string: ConstPtr): Hresult

public expect fun wsAddMappedHeader(message: ConstPtr, headername: ConstPtr, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsAddressMessage(message: ConstPtr, address: ConstPtr, error: ConstPtr): Hresult

public expect fun wsAlloc(heap: ConstPtr, size: ULong, ptr: MutPtr, error: ConstPtr): Hresult

public expect fun wsAsyncExecute(asyncstate: ConstPtr, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCall(serviceproxy: ConstPtr, operation: ConstPtr, arguments: ConstPtr, heap: ConstPtr, callproperties: ConstPtr, callpropertycount: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCheckMustUnderstandHeaders(message: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCloseChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCloseListener(listener: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCloseServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCloseServiceProxy(serviceproxy: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCombineUrl(baseurl: ConstPtr, referenceurl: ConstPtr, flags: UInt, heap: ConstPtr, resulturl: MutPtr, error: ConstPtr): Hresult

public expect fun wsCopyError(source: ConstPtr, destination: ConstPtr): Hresult

public expect fun wsCopyNode(writer: ConstPtr, reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, channel: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateChannelForListener(listener: ConstPtr, properties: ConstPtr, propertycount: UInt, channel: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateError(properties: ConstPtr, propertycount: UInt, error: MutPtr): Hresult

public expect fun wsCreateFaultFromError(error: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr, fault: MutPtr): Hresult

public expect fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr, propertycount: UInt, heap: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, listener: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateMessageForChannel(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateMetadata(properties: ConstPtr, propertycount: UInt, metadata: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateReader(properties: ConstPtr, propertycount: UInt, reader: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, addressurl: ConstPtr, contract: ConstPtr, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceendpoint: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateServiceHost(endpoints: ConstPtr, endpointcount: UShort, serviceproperties: ConstPtr, servicepropertycount: UInt, servicehost: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr, properties: ConstPtr, propertycount: UInt, channelproperties: ConstPtr, channelpropertycount: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateWriter(properties: ConstPtr, propertycount: UInt, writer: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateXmlBuffer(heap: ConstPtr, properties: ConstPtr, propertycount: UInt, buffer: MutPtr, error: ConstPtr): Hresult

public expect fun wsCreateXmlSecurityToken(tokenxml: ConstPtr, tokenkey: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, error: ConstPtr): Hresult

public expect fun wsDateTimeToFileTime(datetime: ConstPtr, filetime: MutPtr, error: ConstPtr): Hresult

public expect fun wsDecodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult

public expect fun wsEncodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult

public expect fun wsEndReaderCanonicalization(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsEndWriterCanonicalization(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsFileTimeToDateTime(filetime: ConstPtr, datetime: MutPtr, error: ConstPtr): Hresult

public expect fun wsFillBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsFillReader(reader: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsFindAttribute(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, required: Bool, attributeindex: MutPtr, error: ConstPtr): Hresult

public expect fun wsFlushBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsFlushWriter(writer: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsFreeChannel(channel: ConstPtr)

public expect fun wsFreeError(error: ConstPtr)

public expect fun wsFreeHeap(heap: ConstPtr)

public expect fun wsFreeListener(listener: ConstPtr)

public expect fun wsFreeMessage(message: ConstPtr)

public expect fun wsFreeMetadata(metadata: ConstPtr)

public expect fun wsFreeReader(reader: ConstPtr)

public expect fun wsFreeSecurityToken(token: ConstPtr)

public expect fun wsFreeServiceHost(servicehost: ConstPtr)

public expect fun wsFreeServiceProxy(serviceproxy: ConstPtr)

public expect fun wsFreeWriter(writer: ConstPtr)

public expect fun wsGetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetCustomHeader(message: ConstPtr, customheaderdescription: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, headerattributes: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult

public expect fun wsGetErrorString(error: ConstPtr, index: UInt, string: MutPtr): Hresult

public expect fun wsGetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt): Hresult

public expect fun wsGetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult

public expect fun wsGetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetHeaderAttributes(message: ConstPtr, reader: ConstPtr, headerattributes: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetHeapProperty(heap: ConstPtr, id: WsHeapPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetMappedHeader(message: ConstPtr, headername: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetMetadataEndpoints(metadata: ConstPtr, endpoints: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetMetadataProperty(metadata: ConstPtr, id: WsMetadataPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr, address: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetNamespaceFromPrefix(reader: ConstPtr, prefix: ConstPtr, required: Bool, ns: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetOperationContextProperty(context: ConstPtr, id: WsOperationContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetPolicyAlternativeCount(policy: ConstPtr, count: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetPolicyProperty(policy: ConstPtr, id: WsPolicyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetPrefixFromNamespace(writer: ConstPtr, ns: ConstPtr, required: Bool, prefix: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetReaderNode(xmlreader: ConstPtr, node: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetReaderPosition(reader: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetReaderProperty(reader: ConstPtr, id: WsXmlReaderPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetSecurityContextProperty(securitycontext: ConstPtr, id: WsSecurityContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetSecurityTokenProperty(securitytoken: ConstPtr, id: WsSecurityTokenPropertyId, value: MutPtr, valuesize: UInt, heap: ConstPtr, error: ConstPtr): Hresult

public expect fun wsGetServiceHostProperty(servicehost: ConstPtr, id: WsServicePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetServiceProxyProperty(serviceproxy: ConstPtr, id: WsProxyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetWriterPosition(writer: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult

public expect fun wsGetWriterProperty(writer: ConstPtr, id: WsXmlWriterPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsGetXmlAttribute(reader: ConstPtr, localname: ConstPtr, heap: ConstPtr, valuechars: MutPtr, valuecharcount: MutPtr, error: ConstPtr): Hresult

public expect fun wsInitializeMessage(message: ConstPtr, initialization: WsMessageInitialization, sourcemessage: ConstPtr, error: ConstPtr): Hresult

public expect fun wsMarkHeaderAsUnderstood(message: ConstPtr, headerposition: ConstPtr, error: ConstPtr): Hresult

public expect fun wsMatchPolicyAlternative(policy: ConstPtr, alternativeindex: UInt, policyconstraints: ConstPtr, matchrequired: Bool, heap: ConstPtr, error: ConstPtr): Hresult

public expect fun wsMoveReader(reader: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult

public expect fun wsMoveWriter(writer: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult

public expect fun wsOpenChannel(channel: ConstPtr, endpointaddress: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsOpenListener(listener: ConstPtr, url: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsOpenServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsOpenServiceProxy(serviceproxy: ConstPtr, address: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsPullBytes(writer: ConstPtr, callback: WsPullBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult

public expect fun wsPushBytes(writer: ConstPtr, callback: WsPushBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadArray(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: MutPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadAttribute(reader: ConstPtr, attributedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadBody(message: ConstPtr, bodydescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadBytes(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadChars(reader: ConstPtr, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadCharsUtf8(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadElement(reader: ConstPtr, elementdescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadEndAttribute(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadEndElement(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadEndpointAddressExtension(reader: ConstPtr, endpointaddress: ConstPtr, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadEnvelopeStart(message: ConstPtr, reader: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadMetadata(metadata: ConstPtr, reader: ConstPtr, url: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadNode(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadQualifiedName(reader: ConstPtr, heap: ConstPtr, prefix: MutPtr, localname: MutPtr, ns: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadStartAttribute(reader: ConstPtr, attributeindex: UInt, error: ConstPtr): Hresult

public expect fun wsReadStartElement(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsReadToStartElement(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, found: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadType(reader: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadValue(reader: ConstPtr, valuetype: WsValueType, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsReadXmlBuffer(reader: ConstPtr, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult

public expect fun wsReadXmlBufferFromBytes(reader: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, bytes: ConstPtr, bytecount: UInt, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult

public expect fun wsReceiveMessage(channel: ConstPtr, message: ConstPtr, messagedescriptions: ConstPtr, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, index: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRegisterOperationForCancel(context: ConstPtr, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRemoveCustomHeader(message: ConstPtr, headername: ConstPtr, headerns: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRemoveHeader(message: ConstPtr, headertype: WsHeaderType, error: ConstPtr): Hresult

public expect fun wsRemoveMappedHeader(message: ConstPtr, headername: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRemoveNode(nodeposition: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRequestReply(channel: ConstPtr, requestmessage: ConstPtr, requestmessagedescription: ConstPtr, writeoption: WsWriteOption, requestbodyvalue: ConstPtr, requestbodyvaluesize: UInt, replymessage: ConstPtr, replymessagedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRequestSecurityToken(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetChannel(channel: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetError(error: ConstPtr): Hresult

public expect fun wsResetHeap(heap: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetListener(listener: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetMessage(message: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetMetadata(metadata: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult

public expect fun wsResetServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult

public expect fun wsRevokeSecurityContext(securitycontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSendFaultMessageForError(channel: ConstPtr, replymessage: ConstPtr, faulterror: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSendMessage(channel: ConstPtr, message: ConstPtr, messagedescription: ConstPtr, writeoption: WsWriteOption, bodyvalue: ConstPtr, bodyvaluesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSendReplyMessage(channel: ConstPtr, replymessage: ConstPtr, replymessagedescription: ConstPtr, writeoption: WsWriteOption, replybodyvalue: ConstPtr, replybodyvaluesize: UInt, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsSetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult

public expect fun wsSetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsSetInput(reader: ConstPtr, encoding: ConstPtr, input: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsSetInputToBuffer(reader: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsSetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsSetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsSetOutput(writer: ConstPtr, encoding: ConstPtr, output: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsSetOutputToBuffer(writer: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsSetReaderPosition(reader: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSetWriterPosition(writer: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult

public expect fun wsShutdownSessionChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsSkipNode(reader: ConstPtr, error: ConstPtr): Hresult

public expect fun wsStartReaderCanonicalization(reader: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsStartWriterCanonicalization(writer: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult

public expect fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr, trimmedcount: MutPtr, error: ConstPtr): Hresult

public expect fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr): Hresult

public expect fun wsWriteArray(writer: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: ConstPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr): Hresult

public expect fun wsWriteAttribute(writer: ConstPtr, attributedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsWriteBody(message: ConstPtr, bodydescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsWriteBytes(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult

public expect fun wsWriteChars(writer: ConstPtr, chars: Pcwstr, charcount: UInt, error: ConstPtr): Hresult

public expect fun wsWriteCharsUtf8(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult

public expect fun wsWriteElement(writer: ConstPtr, elementdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsWriteEndAttribute(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteEndCData(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteEndElement(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteEndStartElement(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteEnvelopeStart(message: ConstPtr, writer: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteNode(writer: ConstPtr, node: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteQualifiedName(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteStartAttribute(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult

public expect fun wsWriteStartCData(writer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteStartElement(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteText(writer: ConstPtr, text: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteType(writer: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsWriteValue(writer: ConstPtr, valuetype: WsValueType, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult

public expect fun wsWriteXmlBuffer(writer: ConstPtr, xmlbuffer: ConstPtr, error: ConstPtr): Hresult

public expect fun wsWriteXmlBufferToBytes(writer: ConstPtr, xmlbuffer: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, heap: ConstPtr, bytes: MutPtr, bytecount: MutPtr, error: ConstPtr): Hresult

public expect fun wsWriteXmlnsAttribute(writer: ConstPtr, prefix: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult

public expect fun wsXmlStringEquals(string1: ConstPtr, string2: ConstPtr, error: ConstPtr): Hresult
