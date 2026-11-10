package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: COpaquePointer?, pwebauthngetassertionoptions: COpaquePointer?, ppwebauthnassertion: COpaquePointer?): Hresult

public expect fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: COpaquePointer?, puserinformation: COpaquePointer?, ppubkeycredparams: COpaquePointer?, pwebauthnclientdata: COpaquePointer?, pwebauthnmakecredentialoptions: COpaquePointer?, ppwebauthncredentialattestation: COpaquePointer?): Hresult

public expect fun webAuthNCancelCurrentOperation(pcancellationid: COpaquePointer?): Hresult

public expect fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: COpaquePointer?): Hresult

public expect fun webAuthNFreeAssertion(pwebauthnassertion: COpaquePointer?)

public expect fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: COpaquePointer?)

public expect fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: COpaquePointer?)

public expect fun webAuthNGetApiVersionNumber(): UInt

public expect fun webAuthNGetCancellationId(pcancellationid: COpaquePointer?): Hresult

public expect fun webAuthNGetErrorName(hr: Hresult): Pcwstr

public expect fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: COpaquePointer?, ppcredentialdetailslist: COpaquePointer?): Hresult

public expect fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult

public expect fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: COpaquePointer?): Hresult

public expect fun wsAbandonCall(serviceproxy: COpaquePointer?, callid: UInt, error: COpaquePointer?): Hresult

public expect fun wsAbandonMessage(channel: COpaquePointer?, message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAbortChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAbortListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAbortServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAbortServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAcceptChannel(listener: COpaquePointer?, channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAddCustomHeader(message: COpaquePointer?, headerdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, headerattributes: UInt, error: COpaquePointer?): Hresult

public expect fun wsAddErrorString(error: COpaquePointer?, string: COpaquePointer?): Hresult

public expect fun wsAddMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsAddressMessage(message: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAlloc(heap: COpaquePointer?, size: ULong, ptr: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsAsyncExecute(asyncstate: COpaquePointer?, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCall(serviceproxy: COpaquePointer?, operation: COpaquePointer?, arguments: COpaquePointer?, heap: COpaquePointer?, callproperties: COpaquePointer?, callpropertycount: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCheckMustUnderstandHeaders(message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCloseChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCloseListener(listener: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCloseServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCloseServiceProxy(serviceproxy: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCombineUrl(baseurl: COpaquePointer?, referenceurl: COpaquePointer?, flags: UInt, heap: COpaquePointer?, resulturl: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCopyError(source: COpaquePointer?, destination: COpaquePointer?): Hresult

public expect fun wsCopyNode(writer: COpaquePointer?, reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, channel: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateChannelForListener(listener: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channel: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateError(properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsCreateFaultFromError(error: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: COpaquePointer?, fault: COpaquePointer?): Hresult

public expect fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, listener: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateMessageForChannel(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateMetadata(properties: COpaquePointer?, propertycount: UInt, metadata: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateReader(properties: COpaquePointer?, propertycount: UInt, reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, addressurl: COpaquePointer?, contract: COpaquePointer?, authorizationcallback: WsServiceSecurityCallback, heap: COpaquePointer?, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceendpoint: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateServiceHost(endpoints: COpaquePointer?, endpointcount: UShort, serviceproperties: COpaquePointer?, servicepropertycount: UInt, servicehost: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channelproperties: COpaquePointer?, channelpropertycount: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateWriter(properties: COpaquePointer?, propertycount: UInt, writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateXmlBuffer(heap: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, buffer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsCreateXmlSecurityToken(tokenxml: COpaquePointer?, tokenkey: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsDateTimeToFileTime(datetime: COpaquePointer?, filetime: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsDecodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsEncodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsEndReaderCanonicalization(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsEndWriterCanonicalization(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFileTimeToDateTime(filetime: COpaquePointer?, datetime: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFillBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFillReader(reader: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFindAttribute(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, required: Bool, attributeindex: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFlushBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFlushWriter(writer: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsFreeChannel(channel: COpaquePointer?)

public expect fun wsFreeError(error: COpaquePointer?)

public expect fun wsFreeHeap(heap: COpaquePointer?)

public expect fun wsFreeListener(listener: COpaquePointer?)

public expect fun wsFreeMessage(message: COpaquePointer?)

public expect fun wsFreeMetadata(metadata: COpaquePointer?)

public expect fun wsFreeReader(reader: COpaquePointer?)

public expect fun wsFreeSecurityToken(token: COpaquePointer?)

public expect fun wsFreeServiceHost(servicehost: COpaquePointer?)

public expect fun wsFreeServiceProxy(serviceproxy: COpaquePointer?)

public expect fun wsFreeWriter(writer: COpaquePointer?)

public expect fun wsGetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetCustomHeader(message: COpaquePointer?, customheaderdescription: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetDictionary(encoding: WsEncoding, dictionary: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult

public expect fun wsGetErrorString(error: COpaquePointer?, index: UInt, string: COpaquePointer?): Hresult

public expect fun wsGetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt): Hresult

public expect fun wsGetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult

public expect fun wsGetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetHeaderAttributes(message: COpaquePointer?, reader: COpaquePointer?, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetHeapProperty(heap: COpaquePointer?, id: WsHeapPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetMetadataEndpoints(metadata: COpaquePointer?, endpoints: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetMetadataProperty(metadata: COpaquePointer?, id: WsMetadataPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetMissingMetadataDocumentAddress(metadata: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetNamespaceFromPrefix(reader: COpaquePointer?, prefix: COpaquePointer?, required: Bool, ns: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetOperationContextProperty(context: COpaquePointer?, id: WsOperationContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetPolicyAlternativeCount(policy: COpaquePointer?, count: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetPolicyProperty(policy: COpaquePointer?, id: WsPolicyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetPrefixFromNamespace(writer: COpaquePointer?, ns: COpaquePointer?, required: Bool, prefix: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetReaderNode(xmlreader: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetReaderProperty(reader: COpaquePointer?, id: WsXmlReaderPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetSecurityContextProperty(securitycontext: COpaquePointer?, id: WsSecurityContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetSecurityTokenProperty(securitytoken: COpaquePointer?, id: WsSecurityTokenPropertyId, value: COpaquePointer?, valuesize: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetServiceHostProperty(servicehost: COpaquePointer?, id: WsServicePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetServiceProxyProperty(serviceproxy: COpaquePointer?, id: WsProxyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsGetWriterProperty(writer: COpaquePointer?, id: WsXmlWriterPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsGetXmlAttribute(reader: COpaquePointer?, localname: COpaquePointer?, heap: COpaquePointer?, valuechars: COpaquePointer?, valuecharcount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsInitializeMessage(message: COpaquePointer?, initialization: WsMessageInitialization, sourcemessage: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsMarkHeaderAsUnderstood(message: COpaquePointer?, headerposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsMatchPolicyAlternative(policy: COpaquePointer?, alternativeindex: UInt, policyconstraints: COpaquePointer?, matchrequired: Bool, heap: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsMoveReader(reader: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsMoveWriter(writer: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsOpenChannel(channel: COpaquePointer?, endpointaddress: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsOpenListener(listener: COpaquePointer?, url: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsOpenServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsOpenServiceProxy(serviceproxy: COpaquePointer?, address: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsPullBytes(writer: COpaquePointer?, callback: WsPullBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsPushBytes(writer: COpaquePointer?, callback: WsPushBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadArray(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadAttribute(reader: COpaquePointer?, attributedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadBody(message: COpaquePointer?, bodydescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadBytes(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadChars(reader: COpaquePointer?, chars: Pwstr, maxcharcount: UInt, actualcharcount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadCharsUtf8(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadElement(reader: COpaquePointer?, elementdescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadEndAttribute(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadEndElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadEndpointAddressExtension(reader: COpaquePointer?, endpointaddress: COpaquePointer?, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadEnvelopeStart(message: COpaquePointer?, reader: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadMetadata(metadata: COpaquePointer?, reader: COpaquePointer?, url: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadQualifiedName(reader: COpaquePointer?, heap: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadStartAttribute(reader: COpaquePointer?, attributeindex: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadStartElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadToStartElement(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, found: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadType(reader: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadValue(reader: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsReadXmlBuffer(reader: COpaquePointer?, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReadXmlBufferFromBytes(reader: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, bytes: COpaquePointer?, bytecount: UInt, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsReceiveMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescriptions: COpaquePointer?, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, index: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRegisterOperationForCancel(context: COpaquePointer?, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRemoveCustomHeader(message: COpaquePointer?, headername: COpaquePointer?, headerns: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRemoveHeader(message: COpaquePointer?, headertype: WsHeaderType, error: COpaquePointer?): Hresult

public expect fun wsRemoveMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRemoveNode(nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRequestReply(channel: COpaquePointer?, requestmessage: COpaquePointer?, requestmessagedescription: COpaquePointer?, writeoption: WsWriteOption, requestbodyvalue: COpaquePointer?, requestbodyvaluesize: UInt, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRequestSecurityToken(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetError(error: COpaquePointer?): Hresult

public expect fun wsResetHeap(heap: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetMessage(message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetMetadata(metadata: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsResetServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsRevokeSecurityContext(securitycontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSendFaultMessageForError(channel: COpaquePointer?, replymessage: COpaquePointer?, faulterror: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSendMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescription: COpaquePointer?, writeoption: WsWriteOption, bodyvalue: COpaquePointer?, bodyvaluesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSendReplyMessage(channel: COpaquePointer?, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, writeoption: WsWriteOption, replybodyvalue: COpaquePointer?, replybodyvaluesize: UInt, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult

public expect fun wsSetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetInput(reader: COpaquePointer?, encoding: COpaquePointer?, input: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetInputToBuffer(reader: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetOutput(writer: COpaquePointer?, encoding: COpaquePointer?, output: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetOutputToBuffer(writer: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsSetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsShutdownSessionChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsSkipNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsStartReaderCanonicalization(reader: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsStartWriterCanonicalization(writer: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult

public expect fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: COpaquePointer?, trimmedcount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteArray(writer: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteAttribute(writer: COpaquePointer?, attributedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteBody(message: COpaquePointer?, bodydescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteBytes(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteChars(writer: COpaquePointer?, chars: Pcwstr, charcount: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteCharsUtf8(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteElement(writer: COpaquePointer?, elementdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteEndAttribute(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteEndCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteEndElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteEndStartElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteEnvelopeStart(message: COpaquePointer?, writer: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteNode(writer: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteQualifiedName(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteStartAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult

public expect fun wsWriteStartCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteStartElement(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteText(writer: COpaquePointer?, text: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteType(writer: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteValue(writer: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult

public expect fun wsWriteXmlBuffer(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteXmlBufferToBytes(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, bytes: COpaquePointer?, bytecount: COpaquePointer?, error: COpaquePointer?): Hresult

public expect fun wsWriteXmlnsAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult

public expect fun wsXmlStringEquals(string1: COpaquePointer?, string2: COpaquePointer?, error: COpaquePointer?): Hresult
