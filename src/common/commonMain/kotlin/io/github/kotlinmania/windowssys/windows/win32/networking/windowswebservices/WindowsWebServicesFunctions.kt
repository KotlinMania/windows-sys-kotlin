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

public expect fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthngetassertionoptions: ConstPtr<WebauthnAuthenticatorGetAssertionOptions>, ppwebauthnassertion: MutPtr<MutPtr<WebauthnAssertion>>): Hresult

public expect fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr<WebauthnRpEntityInformation>, puserinformation: ConstPtr<WebauthnUserEntityInformation>, ppubkeycredparams: ConstPtr<WebauthnCoseCredentialParameters>, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthnmakecredentialoptions: ConstPtr<WebauthnAuthenticatorMakeCredentialOptions>, ppwebauthncredentialattestation: MutPtr<MutPtr<WebauthnCredentialAttestation>>): Hresult

public expect fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr<Guid>): Hresult

public expect fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr<UByte>): Hresult

public expect fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr<WebauthnAssertion>)

public expect fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr<WebauthnCredentialAttestation>)

public expect fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr<WebauthnCredentialDetailsList>)

public expect fun webAuthNGetApiVersionNumber(): UInt

public expect fun webAuthNGetCancellationId(pcancellationid: MutPtr<Guid>): Hresult

public expect fun webAuthNGetErrorName(hr: Hresult): Pcwstr

public expect fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr<WebauthnGetCredentialsOptions>, ppcredentialdetailslist: MutPtr<MutPtr<WebauthnCredentialDetailsList>>): Hresult

public expect fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult

public expect fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr<Bool>): Hresult

public expect fun wsAbandonCall(serviceproxy: ConstPtr<WsServiceProxy>, callid: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsAbandonMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsAbortChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult

public expect fun wsAbortListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult

public expect fun wsAbortServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult

public expect fun wsAbortServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult

public expect fun wsAcceptChannel(listener: ConstPtr<WsListener>, channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsAddCustomHeader(message: ConstPtr<WsMessage>, headerdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, headerattributes: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsAddErrorString(error: ConstPtr<WsError>, string: ConstPtr<WsString>): Hresult

public expect fun wsAddMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsAddressMessage(message: ConstPtr<WsMessage>, address: ConstPtr<WsEndpointAddress>, error: ConstPtr<WsError>): Hresult

public expect fun wsAlloc(heap: ConstPtr<WsHeap>, size: ULong, ptr: MutPtr<MutPtr<CVoid>>, error: ConstPtr<WsError>): Hresult

public expect fun wsAsyncExecute(asyncstate: ConstPtr<WsAsyncState>, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr<CVoid>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCall(serviceproxy: ConstPtr<WsServiceProxy>, operation: ConstPtr<WsOperationDescription>, arguments: ConstPtr<ConstPtr<CVoid>>, heap: ConstPtr<WsHeap>, callproperties: ConstPtr<WsCallProperty>, callpropertycount: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCheckMustUnderstandHeaders(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsCloseChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCloseListener(listener: ConstPtr<WsListener>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCloseServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCloseServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsCombineUrl(baseurl: ConstPtr<WsString>, referenceurl: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, resulturl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult

public expect fun wsCopyError(source: ConstPtr<WsError>, destination: ConstPtr<WsError>): Hresult

public expect fun wsCopyNode(writer: ConstPtr<WsXmlWriter>, reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateChannelForListener(listener: ConstPtr<WsListener>, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateError(properties: ConstPtr<WsErrorProperty>, propertycount: UInt, error: MutPtr<MutPtr<WsError>>): Hresult

public expect fun wsCreateFaultFromError(error: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr<WsHeap>, fault: MutPtr<WsFault>): Hresult

public expect fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr<WsHeapProperty>, propertycount: UInt, heap: MutPtr<MutPtr<WsHeap>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsListenerProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, listener: MutPtr<MutPtr<WsListener>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateMessageForChannel(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateMetadata(properties: ConstPtr<WsMetadataProperty>, propertycount: UInt, metadata: MutPtr<MutPtr<WsMetadata>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateReader(properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, reader: MutPtr<MutPtr<WsXmlReader>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsServiceEndpointProperty>, propertycount: UInt, addressurl: ConstPtr<WsString>, contract: ConstPtr<WsServiceContract>, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr<WsHeap>, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceendpoint: MutPtr<MutPtr<WsServiceEndpoint>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateServiceHost(endpoints: ConstPtr<ConstPtr<WsServiceEndpoint>>, endpointcount: UShort, serviceproperties: ConstPtr<WsServiceProperty>, servicepropertycount: UInt, servicehost: MutPtr<MutPtr<WsServiceHost>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr<WsSecurityDescription>, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, channelproperties: ConstPtr<WsChannelProperty>, channelpropertycount: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateWriter(properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, writer: MutPtr<MutPtr<WsXmlWriter>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateXmlBuffer(heap: ConstPtr<WsHeap>, properties: ConstPtr<WsXmlBufferProperty>, propertycount: UInt, buffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult

public expect fun wsCreateXmlSecurityToken(tokenxml: ConstPtr<WsXmlBuffer>, tokenkey: ConstPtr<WsSecurityKeyHandle>, properties: ConstPtr<WsXmlSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, error: ConstPtr<WsError>): Hresult

public expect fun wsDateTimeToFileTime(datetime: ConstPtr<WsDatetime>, filetime: MutPtr<Filetime>, error: ConstPtr<WsError>): Hresult

public expect fun wsDecodeUrl(url: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<MutPtr<WsUrl>>, error: ConstPtr<WsError>): Hresult

public expect fun wsEncodeUrl(url: ConstPtr<WsUrl>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult

public expect fun wsEndReaderCanonicalization(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsEndWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsFileTimeToDateTime(filetime: ConstPtr<Filetime>, datetime: MutPtr<WsDatetime>, error: ConstPtr<WsError>): Hresult

public expect fun wsFillBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsFillReader(reader: ConstPtr<WsXmlReader>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsFindAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, required: Bool, attributeindex: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsFlushBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsFlushWriter(writer: ConstPtr<WsXmlWriter>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsFreeChannel(channel: ConstPtr<WsChannel>)

public expect fun wsFreeError(error: ConstPtr<WsError>)

public expect fun wsFreeHeap(heap: ConstPtr<WsHeap>)

public expect fun wsFreeListener(listener: ConstPtr<WsListener>)

public expect fun wsFreeMessage(message: ConstPtr<WsMessage>)

public expect fun wsFreeMetadata(metadata: ConstPtr<WsMetadata>)

public expect fun wsFreeReader(reader: ConstPtr<WsXmlReader>)

public expect fun wsFreeSecurityToken(token: ConstPtr<WsSecurityToken>)

public expect fun wsFreeServiceHost(servicehost: ConstPtr<WsServiceHost>)

public expect fun wsFreeServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>)

public expect fun wsFreeWriter(writer: ConstPtr<WsXmlWriter>)

public expect fun wsGetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetCustomHeader(message: ConstPtr<WsMessage>, customheaderdescription: ConstPtr<WsElementDescription>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr<MutPtr<WsXmlDictionary>>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult

public expect fun wsGetErrorString(error: ConstPtr<WsError>, index: UInt, string: MutPtr<WsString>): Hresult

public expect fun wsGetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt): Hresult

public expect fun wsGetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult

public expect fun wsGetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetHeaderAttributes(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetHeapProperty(heap: ConstPtr<WsHeap>, id: WsHeapPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetMetadataEndpoints(metadata: ConstPtr<WsMetadata>, endpoints: MutPtr<WsMetadataEndpoints>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetMetadataProperty(metadata: ConstPtr<WsMetadata>, id: WsMetadataPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr<WsMetadata>, address: MutPtr<MutPtr<WsEndpointAddress>>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetNamespaceFromPrefix(reader: ConstPtr<WsXmlReader>, prefix: ConstPtr<WsXmlString>, required: Bool, ns: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetOperationContextProperty(context: ConstPtr<WsOperationContext>, id: WsOperationContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetPolicyAlternativeCount(policy: ConstPtr<WsPolicy>, count: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetPolicyProperty(policy: ConstPtr<WsPolicy>, id: WsPolicyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetPrefixFromNamespace(writer: ConstPtr<WsXmlWriter>, ns: ConstPtr<WsXmlString>, required: Bool, prefix: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetReaderNode(xmlreader: ConstPtr<WsXmlReader>, node: MutPtr<MutPtr<WsXmlNode>>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetReaderProperty(reader: ConstPtr<WsXmlReader>, id: WsXmlReaderPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetSecurityContextProperty(securitycontext: ConstPtr<WsSecurityContext>, id: WsSecurityContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetSecurityTokenProperty(securitytoken: ConstPtr<WsSecurityToken>, id: WsSecurityTokenPropertyId, value: MutPtr<CVoid>, valuesize: UInt, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetServiceHostProperty(servicehost: ConstPtr<WsServiceHost>, id: WsServicePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetServiceProxyProperty(serviceproxy: ConstPtr<WsServiceProxy>, id: WsProxyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsGetWriterProperty(writer: ConstPtr<WsXmlWriter>, id: WsXmlWriterPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsGetXmlAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, heap: ConstPtr<WsHeap>, valuechars: MutPtr<MutPtr<UShort>>, valuecharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsInitializeMessage(message: ConstPtr<WsMessage>, initialization: WsMessageInitialization, sourcemessage: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsMarkHeaderAsUnderstood(message: ConstPtr<WsMessage>, headerposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsMatchPolicyAlternative(policy: ConstPtr<WsPolicy>, alternativeindex: UInt, policyconstraints: ConstPtr<WsPolicyConstraints>, matchrequired: Bool, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult

public expect fun wsMoveReader(reader: ConstPtr<WsXmlReader>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult

public expect fun wsMoveWriter(writer: ConstPtr<WsXmlWriter>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult

public expect fun wsOpenChannel(channel: ConstPtr<WsChannel>, endpointaddress: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsOpenListener(listener: ConstPtr<WsListener>, url: ConstPtr<WsString>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsOpenServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsOpenServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, address: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsPullBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPullBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult

public expect fun wsPushBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPushBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadArray(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: MutPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadAttribute(reader: ConstPtr<WsXmlReader>, attributedescription: ConstPtr<WsAttributeDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadBytes(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<CVoid>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadChars(reader: ConstPtr<WsXmlReader>, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadCharsUtf8(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<UByte>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadElement(reader: ConstPtr<WsXmlReader>, elementdescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadEndAttribute(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadEndElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadEndpointAddressExtension(reader: ConstPtr<WsXmlReader>, endpointaddress: ConstPtr<WsEndpointAddress>, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadEnvelopeStart(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadMetadata(metadata: ConstPtr<WsMetadata>, reader: ConstPtr<WsXmlReader>, url: ConstPtr<WsString>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadQualifiedName(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, prefix: MutPtr<WsXmlString>, localname: MutPtr<WsXmlString>, ns: MutPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadStartAttribute(reader: ConstPtr<WsXmlReader>, attributeindex: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadStartElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadToStartElement(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadType(reader: ConstPtr<WsXmlReader>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadValue(reader: ConstPtr<WsXmlReader>, valuetype: WsValueType, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsReadXmlBuffer(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult

public expect fun wsReadXmlBufferFromBytes(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, bytes: ConstPtr<CVoid>, bytecount: UInt, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult

public expect fun wsReceiveMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescriptions: ConstPtr<ConstPtr<WsMessageDescription>>, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, index: MutPtr<UInt>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsRegisterOperationForCancel(context: ConstPtr<WsOperationContext>, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult

public expect fun wsRemoveCustomHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, headerns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult

public expect fun wsRemoveHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, error: ConstPtr<WsError>): Hresult

public expect fun wsRemoveMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult

public expect fun wsRemoveNode(nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsRequestReply(channel: ConstPtr<WsChannel>, requestmessage: ConstPtr<WsMessage>, requestmessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, requestbodyvalue: ConstPtr<CVoid>, requestbodyvaluesize: UInt, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsRequestSecurityToken(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsRequestSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetError(error: ConstPtr<WsError>): Hresult

public expect fun wsResetHeap(heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetMessage(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetMetadata(metadata: ConstPtr<WsMetadata>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult

public expect fun wsResetServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult

public expect fun wsRevokeSecurityContext(securitycontext: ConstPtr<WsSecurityContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsSendFaultMessageForError(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, faulterror: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsSendMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, bodyvalue: ConstPtr<CVoid>, bodyvaluesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsSendReplyMessage(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, replybodyvalue: ConstPtr<CVoid>, replybodyvaluesize: UInt, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsSetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt): Hresult

public expect fun wsSetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult

public expect fun wsSetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetInput(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, input: ConstPtr<WsXmlReaderInput>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetInputToBuffer(reader: ConstPtr<WsXmlReader>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetOutput(writer: ConstPtr<WsXmlWriter>, encoding: ConstPtr<WsXmlWriterEncoding>, output: ConstPtr<WsXmlWriterOutput>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetOutputToBuffer(writer: ConstPtr<WsXmlWriter>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsSetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsSetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult

public expect fun wsShutdownSessionChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsSkipNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult

public expect fun wsStartReaderCanonicalization(reader: ConstPtr<WsXmlReader>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsStartWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr<MutPtr<UShort>>, trimmedcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteArray(writer: ConstPtr<WsXmlWriter>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: ConstPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteAttribute(writer: ConstPtr<WsXmlWriter>, attributedescription: ConstPtr<WsAttributeDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteBytes(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<CVoid>, bytecount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteChars(writer: ConstPtr<WsXmlWriter>, chars: Pcwstr, charcount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteCharsUtf8(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<UByte>, bytecount: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteElement(writer: ConstPtr<WsXmlWriter>, elementdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEndAttribute(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEndCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEndElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEndStartElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteEnvelopeStart(message: ConstPtr<WsMessage>, writer: ConstPtr<WsXmlWriter>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteNode(writer: ConstPtr<WsXmlWriter>, node: ConstPtr<WsXmlNode>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteQualifiedName(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteStartAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteStartCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteStartElement(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteText(writer: ConstPtr<WsXmlWriter>, text: ConstPtr<WsXmlText>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteType(writer: ConstPtr<WsXmlWriter>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteValue(writer: ConstPtr<WsXmlWriter>, valuetype: WsValueType, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteXmlBuffer(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteXmlBufferToBytes(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, encoding: ConstPtr<WsXmlWriterEncoding>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, heap: ConstPtr<WsHeap>, bytes: MutPtr<MutPtr<CVoid>>, bytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult

public expect fun wsWriteXmlnsAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult

public expect fun wsXmlStringEquals(string1: ConstPtr<WsXmlString>, string2: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult
