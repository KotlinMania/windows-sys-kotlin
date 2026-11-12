@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32NetworkingWindowswebservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(hwnd: Long, pwszrpid: Long, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(hwnd: Long, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(cbcredentialid: Int, pbcredentialid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(pwebauthnassertion: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(hr: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(serviceproxy: Long, callid: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(channel: Long, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(message: Long, headerdescription: Long, writeoption: Int, value: Long, valuesize: Int, headerattributes: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(error: Long, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(message: Long, headername: Long, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(message: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(heap: Long, size: Long, ptr: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(asyncstate: Long, operation: Long, callbackmodel: Int, callbackstate: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(listener: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(baseurl: Long, referenceurl: Long, flags: Int, heap: Long, resulturl: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(source: Long, destination: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(writer: Long, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(listener: Long, properties: Long, propertycount: Int, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(error: Long, faulterrorcode: Int, faultdisclosure: Int, heap: Long, fault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(maxsize: Long, trimsize: Long, properties: Long, propertycount: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(envelopeversion: Int, addressingversion: Int, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(channel: Long, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(properties: Long, propertycount: Int, metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(properties: Long, propertycount: Int, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(channeltype: Int, properties: Long, propertycount: Int, addressurl: Long, contract: Long, authorizationcallback: Long, heap: Long, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceendpoint: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(endpoints: Long, endpointcount: Short, serviceproperties: Long, servicepropertycount: Int, servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(channeltype: Int, channelbinding: Int, securitydescription: Long, properties: Long, propertycount: Int, channelproperties: Long, channelpropertycount: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(channeltype: Int, properties: Long, propertycount: Int, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(properties: Long, propertycount: Int, writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(heap: Long, properties: Long, propertycount: Int, buffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: Int, token: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(reader: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(reader: Long, localname: Long, ns: Long, required: Int, attributeindex: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(writer: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(channel: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(error: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(heap: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(listener: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(message: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(metadata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(reader: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(token: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(servicehost: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(serviceproxy: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(writer: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: Int, headerindex: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(encoding: Int, dictionary: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(error: Long, index: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(message: Long, headertype: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(heap: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(message: Long, headername: Long, repeatingoption: Int, headerindex: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(metadata: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: Int, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(context: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(policy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(writer: Long, ns: Long, required: Int, prefix: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(xmlreader: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(reader: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(securitycontext: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(securitytoken: Long, id: Int, value: Long, valuesize: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(servicehost: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(serviceproxy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(writer: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(message: Long, initialization: Int, sourcemessage: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(policy: Long, alternativeindex: Int, policyconstraints: Long, matchrequired: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(reader: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(writer: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(reader: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, actualitemcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(reader: Long, attributedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(message: Long, bodydescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(reader: Long, chars: Long, maxcharcount: Int, actualcharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(reader: Long, elementdescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(message: Long, reader: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(reader: Long, attributeindex: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadType(reader: Long, typemapping: Int, type: Int, typedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(reader: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: Int, bytes: Long, bytecount: Int, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: Int, receiveoption: Int, readbodyoption: Int, heap: Long, value: Long, valuesize: Int, index: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(context: Long, cancelcallback: Long, freestatecallback: Long, userstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(message: Long, headertype: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(message: Long, headername: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: Int, requestbodyvalue: Long, requestbodyvaluesize: Int, replymessage: Long, replymessagedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(channel: Long, properties: Long, propertycount: Int, token: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetError(error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(securitycontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: Int, faultdisclosure: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: Int, bodyvalue: Long, bodyvaluesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: Int, replybodyvalue: Long, replybodyvaluesize: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(message: Long, headertype: Int, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(reader: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(writer: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(chars: Long, charcount: Int, trimmedchars: Long, trimmedcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(ncnamechars: Long, ncnamecharcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(writer: Long, attributedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(message: Long, bodydescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(writer: Long, chars: Long, charcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(writer: Long, elementdescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(message: Long, writer: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(writer: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(writer: Long, text: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(writer: Long, typemapping: Int, type: Int, typedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(writer: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: Int, heap: Long, bytes: Long, bytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(string1: Long, string2: Long, error: Long): Int
}

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthngetassertionoptions: ConstPtr<WebauthnAuthenticatorGetAssertionOptions>, ppwebauthnassertion: MutPtr<MutPtr<WebauthnAssertion>>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(hwnd.rawAddress, pwszrpid.rawAddress, pwebauthnclientdata.rawAddress, pwebauthngetassertionoptions.rawAddress, ppwebauthnassertion.rawAddress)

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr<WebauthnRpEntityInformation>, puserinformation: ConstPtr<WebauthnUserEntityInformation>, ppubkeycredparams: ConstPtr<WebauthnCoseCredentialParameters>, pwebauthnclientdata: ConstPtr<WebauthnClientData>, pwebauthnmakecredentialoptions: ConstPtr<WebauthnAuthenticatorMakeCredentialOptions>, ppwebauthncredentialattestation: MutPtr<MutPtr<WebauthnCredentialAttestation>>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(hwnd.rawAddress, prpinformation.rawAddress, puserinformation.rawAddress, ppubkeycredparams.rawAddress, pwebauthnclientdata.rawAddress, pwebauthnmakecredentialoptions.rawAddress, ppwebauthncredentialattestation.rawAddress)

public actual fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr<Guid>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(pcancellationid.rawAddress)

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr<UByte>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(cbcredentialid.toInt(), pbcredentialid.rawAddress)

public actual fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr<WebauthnAssertion>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(pwebauthnassertion.rawAddress)
}

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr<WebauthnCredentialAttestation>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(pwebauthncredentialattestation.rawAddress)
}

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr<WebauthnCredentialDetailsList>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(pcredentialdetailslist.rawAddress)
}

public actual fun webAuthNGetApiVersionNumber(): UInt =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber().toUInt()

public actual fun webAuthNGetCancellationId(pcancellationid: MutPtr<Guid>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(pcancellationid.rawAddress)

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    ConstPtr(WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(hr))

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr<WebauthnGetCredentialsOptions>, ppcredentialdetailslist: MutPtr<MutPtr<WebauthnCredentialDetailsList>>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(pgetcredentialsoptions.rawAddress, ppcredentialdetailslist.rawAddress)

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr)

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr<Bool>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable.rawAddress)

public actual fun wsAbandonCall(serviceproxy: ConstPtr<WsServiceProxy>, callid: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(serviceproxy.rawAddress, callid.toInt(), error.rawAddress)

public actual fun wsAbandonMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(channel.rawAddress, message.rawAddress, error.rawAddress)

public actual fun wsAbortChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(channel.rawAddress, error.rawAddress)

public actual fun wsAbortListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(listener.rawAddress, error.rawAddress)

public actual fun wsAbortServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(servicehost.rawAddress, error.rawAddress)

public actual fun wsAbortServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(serviceproxy.rawAddress, error.rawAddress)

public actual fun wsAcceptChannel(listener: ConstPtr<WsListener>, channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(listener.rawAddress, channel.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsAddCustomHeader(message: ConstPtr<WsMessage>, headerdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, headerattributes: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(message.rawAddress, headerdescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt(), headerattributes.toInt(), error.rawAddress)

public actual fun wsAddErrorString(error: ConstPtr<WsError>, string: ConstPtr<WsString>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(error.rawAddress, string.rawAddress)

public actual fun wsAddMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(message.rawAddress, headername.rawAddress, valuetype, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsAddressMessage(message: ConstPtr<WsMessage>, address: ConstPtr<WsEndpointAddress>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(message.rawAddress, address.rawAddress, error.rawAddress)

public actual fun wsAlloc(heap: ConstPtr<WsHeap>, size: ULong, ptr: MutPtr<MutPtr<CVoid>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(heap.rawAddress, size.toLong(), ptr.rawAddress, error.rawAddress)

public actual fun wsAsyncExecute(asyncstate: ConstPtr<WsAsyncState>, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr<CVoid>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(asyncstate.rawAddress, 0L, callbackmodel, callbackstate.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsCall(serviceproxy: ConstPtr<WsServiceProxy>, operation: ConstPtr<WsOperationDescription>, arguments: ConstPtr<ConstPtr<CVoid>>, heap: ConstPtr<WsHeap>, callproperties: ConstPtr<WsCallProperty>, callpropertycount: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCall(serviceproxy.rawAddress, operation.rawAddress, arguments.rawAddress, heap.rawAddress, callproperties.rawAddress, callpropertycount.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsCheckMustUnderstandHeaders(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(message.rawAddress, error.rawAddress)

public actual fun wsCloseChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(channel.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsCloseListener(listener: ConstPtr<WsListener>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(listener.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsCloseServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(servicehost.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsCloseServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(serviceproxy.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsCombineUrl(baseurl: ConstPtr<WsString>, referenceurl: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, resulturl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(baseurl.rawAddress, referenceurl.rawAddress, flags.toInt(), heap.rawAddress, resulturl.rawAddress, error.rawAddress)

public actual fun wsCopyError(source: ConstPtr<WsError>, destination: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(source.rawAddress, destination.rawAddress)

public actual fun wsCopyNode(writer: ConstPtr<WsXmlWriter>, reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(writer.rawAddress, reader.rawAddress, error.rawAddress)

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(channeltype, channelbinding, properties.rawAddress, propertycount.toInt(), securitydescription.rawAddress, channel.rawAddress, error.rawAddress)

public actual fun wsCreateChannelForListener(listener: ConstPtr<WsListener>, properties: ConstPtr<WsChannelProperty>, propertycount: UInt, channel: MutPtr<MutPtr<WsChannel>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(listener.rawAddress, properties.rawAddress, propertycount.toInt(), channel.rawAddress, error.rawAddress)

public actual fun wsCreateError(properties: ConstPtr<WsErrorProperty>, propertycount: UInt, error: MutPtr<MutPtr<WsError>>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsCreateFaultFromError(error: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr<WsHeap>, fault: MutPtr<WsFault>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(error.rawAddress, faulterrorcode, faultdisclosure, heap.rawAddress, fault.rawAddress)

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr<WsHeapProperty>, propertycount: UInt, heap: MutPtr<MutPtr<WsHeap>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(maxsize.toLong(), trimsize.toLong(), properties.rawAddress, propertycount.toInt(), heap.rawAddress, error.rawAddress)

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr<WsListenerProperty>, propertycount: UInt, securitydescription: ConstPtr<WsSecurityDescription>, listener: MutPtr<MutPtr<WsListener>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(channeltype, channelbinding, properties.rawAddress, propertycount.toInt(), securitydescription.rawAddress, listener.rawAddress, error.rawAddress)

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(envelopeversion, addressingversion, properties.rawAddress, propertycount.toInt(), message.rawAddress, error.rawAddress)

public actual fun wsCreateMessageForChannel(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsMessageProperty>, propertycount: UInt, message: MutPtr<MutPtr<WsMessage>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(channel.rawAddress, properties.rawAddress, propertycount.toInt(), message.rawAddress, error.rawAddress)

public actual fun wsCreateMetadata(properties: ConstPtr<WsMetadataProperty>, propertycount: UInt, metadata: MutPtr<MutPtr<WsMetadata>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(properties.rawAddress, propertycount.toInt(), metadata.rawAddress, error.rawAddress)

public actual fun wsCreateReader(properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, reader: MutPtr<MutPtr<WsXmlReader>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(properties.rawAddress, propertycount.toInt(), reader.rawAddress, error.rawAddress)

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsServiceEndpointProperty>, propertycount: UInt, addressurl: ConstPtr<WsString>, contract: ConstPtr<WsServiceContract>, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr<WsHeap>, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceendpoint: MutPtr<MutPtr<WsServiceEndpoint>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(channeltype, properties.rawAddress, propertycount.toInt(), addressurl.rawAddress, contract.rawAddress, 0L, heap.rawAddress, templatetype, templatevalue.rawAddress, templatesize.toInt(), templatedescription.rawAddress, templatedescriptionsize.toInt(), serviceendpoint.rawAddress, error.rawAddress)

public actual fun wsCreateServiceHost(endpoints: ConstPtr<ConstPtr<WsServiceEndpoint>>, endpointcount: UShort, serviceproperties: ConstPtr<WsServiceProperty>, servicepropertycount: UInt, servicehost: MutPtr<MutPtr<WsServiceHost>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(endpoints.rawAddress, endpointcount.toShort(), serviceproperties.rawAddress, servicepropertycount.toInt(), servicehost.rawAddress, error.rawAddress)

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr<WsSecurityDescription>, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, channelproperties: ConstPtr<WsChannelProperty>, channelpropertycount: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(channeltype, channelbinding, securitydescription.rawAddress, properties.rawAddress, propertycount.toInt(), channelproperties.rawAddress, channelpropertycount.toInt(), serviceproxy.rawAddress, error.rawAddress)

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr<WsProxyProperty>, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr<CVoid>, templatesize: UInt, templatedescription: ConstPtr<CVoid>, templatedescriptionsize: UInt, serviceproxy: MutPtr<MutPtr<WsServiceProxy>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(channeltype, properties.rawAddress, propertycount.toInt(), templatetype, templatevalue.rawAddress, templatesize.toInt(), templatedescription.rawAddress, templatedescriptionsize.toInt(), serviceproxy.rawAddress, error.rawAddress)

public actual fun wsCreateWriter(properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, writer: MutPtr<MutPtr<WsXmlWriter>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(properties.rawAddress, propertycount.toInt(), writer.rawAddress, error.rawAddress)

public actual fun wsCreateXmlBuffer(heap: ConstPtr<WsHeap>, properties: ConstPtr<WsXmlBufferProperty>, propertycount: UInt, buffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(heap.rawAddress, properties.rawAddress, propertycount.toInt(), buffer.rawAddress, error.rawAddress)

public actual fun wsCreateXmlSecurityToken(tokenxml: ConstPtr<WsXmlBuffer>, tokenkey: ConstPtr<WsSecurityKeyHandle>, properties: ConstPtr<WsXmlSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(tokenxml.rawAddress, tokenkey.rawAddress, properties.rawAddress, propertycount.toInt(), token.rawAddress, error.rawAddress)

public actual fun wsDateTimeToFileTime(datetime: ConstPtr<WsDatetime>, filetime: MutPtr<Filetime>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(datetime.rawAddress, filetime.rawAddress, error.rawAddress)

public actual fun wsDecodeUrl(url: ConstPtr<WsString>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<MutPtr<WsUrl>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(url.rawAddress, flags.toInt(), heap.rawAddress, outurl.rawAddress, error.rawAddress)

public actual fun wsEncodeUrl(url: ConstPtr<WsUrl>, flags: UInt, heap: ConstPtr<WsHeap>, outurl: MutPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(url.rawAddress, flags.toInt(), heap.rawAddress, outurl.rawAddress, error.rawAddress)

public actual fun wsEndReaderCanonicalization(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(reader.rawAddress, error.rawAddress)

public actual fun wsEndWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(writer.rawAddress, error.rawAddress)

public actual fun wsFileTimeToDateTime(filetime: ConstPtr<Filetime>, datetime: MutPtr<WsDatetime>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(filetime.rawAddress, datetime.rawAddress, error.rawAddress)

public actual fun wsFillBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(message.rawAddress, minsize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsFillReader(reader: ConstPtr<WsXmlReader>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(reader.rawAddress, minsize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsFindAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, required: Bool, attributeindex: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(reader.rawAddress, localname.rawAddress, ns.rawAddress, required, attributeindex.rawAddress, error.rawAddress)

public actual fun wsFlushBody(message: ConstPtr<WsMessage>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(message.rawAddress, minsize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsFlushWriter(writer: ConstPtr<WsXmlWriter>, minsize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(writer.rawAddress, minsize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsFreeChannel(channel: ConstPtr<WsChannel>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(channel.rawAddress)
}

public actual fun wsFreeError(error: ConstPtr<WsError>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(error.rawAddress)
}

public actual fun wsFreeHeap(heap: ConstPtr<WsHeap>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(heap.rawAddress)
}

public actual fun wsFreeListener(listener: ConstPtr<WsListener>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(listener.rawAddress)
}

public actual fun wsFreeMessage(message: ConstPtr<WsMessage>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(message.rawAddress)
}

public actual fun wsFreeMetadata(metadata: ConstPtr<WsMetadata>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(metadata.rawAddress)
}

public actual fun wsFreeReader(reader: ConstPtr<WsXmlReader>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(reader.rawAddress)
}

public actual fun wsFreeSecurityToken(token: ConstPtr<WsSecurityToken>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(token.rawAddress)
}

public actual fun wsFreeServiceHost(servicehost: ConstPtr<WsServiceHost>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(servicehost.rawAddress)
}

public actual fun wsFreeServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(serviceproxy.rawAddress)
}

public actual fun wsFreeWriter(writer: ConstPtr<WsXmlWriter>) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(writer.rawAddress)
}

public actual fun wsGetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(channel.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetCustomHeader(message: ConstPtr<WsMessage>, customheaderdescription: ConstPtr<WsElementDescription>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(message.rawAddress, customheaderdescription.rawAddress, repeatingoption, headerindex.toInt(), readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), headerattributes.rawAddress, error.rawAddress)

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr<MutPtr<WsXmlDictionary>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(encoding, dictionary.rawAddress, error.rawAddress)

public actual fun wsGetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(error.rawAddress, id, buffer.rawAddress, buffersize.toInt())

public actual fun wsGetErrorString(error: ConstPtr<WsError>, index: UInt, string: MutPtr<WsString>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(error.rawAddress, index.toInt(), string.rawAddress)

public actual fun wsGetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(error.rawAddress, faultdetaildescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt())

public actual fun wsGetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, buffer: MutPtr<CVoid>, buffersize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(error.rawAddress, id, buffer.rawAddress, buffersize.toInt())

public actual fun wsGetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(message.rawAddress, headertype, valuetype, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetHeaderAttributes(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, headerattributes: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(message.rawAddress, reader.rawAddress, headerattributes.rawAddress, error.rawAddress)

public actual fun wsGetHeapProperty(heap: ConstPtr<WsHeap>, id: WsHeapPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(heap.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(listener.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(message.rawAddress, headername.rawAddress, repeatingoption, headerindex.toInt(), valuetype, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(message.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetMetadataEndpoints(metadata: ConstPtr<WsMetadata>, endpoints: MutPtr<WsMetadataEndpoints>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(metadata.rawAddress, endpoints.rawAddress, error.rawAddress)

public actual fun wsGetMetadataProperty(metadata: ConstPtr<WsMetadata>, id: WsMetadataPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(metadata.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr<WsMetadata>, address: MutPtr<MutPtr<WsEndpointAddress>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(metadata.rawAddress, address.rawAddress, error.rawAddress)

public actual fun wsGetNamespaceFromPrefix(reader: ConstPtr<WsXmlReader>, prefix: ConstPtr<WsXmlString>, required: Bool, ns: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(reader.rawAddress, prefix.rawAddress, required, ns.rawAddress, error.rawAddress)

public actual fun wsGetOperationContextProperty(context: ConstPtr<WsOperationContext>, id: WsOperationContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(context.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetPolicyAlternativeCount(policy: ConstPtr<WsPolicy>, count: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(policy.rawAddress, count.rawAddress, error.rawAddress)

public actual fun wsGetPolicyProperty(policy: ConstPtr<WsPolicy>, id: WsPolicyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(policy.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetPrefixFromNamespace(writer: ConstPtr<WsXmlWriter>, ns: ConstPtr<WsXmlString>, required: Bool, prefix: MutPtr<MutPtr<WsXmlString>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(writer.rawAddress, ns.rawAddress, required, prefix.rawAddress, error.rawAddress)

public actual fun wsGetReaderNode(xmlreader: ConstPtr<WsXmlReader>, node: MutPtr<MutPtr<WsXmlNode>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(xmlreader.rawAddress, node.rawAddress, error.rawAddress)

public actual fun wsGetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(reader.rawAddress, nodeposition.rawAddress, error.rawAddress)

public actual fun wsGetReaderProperty(reader: ConstPtr<WsXmlReader>, id: WsXmlReaderPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(reader.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetSecurityContextProperty(securitycontext: ConstPtr<WsSecurityContext>, id: WsSecurityContextPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(securitycontext.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetSecurityTokenProperty(securitytoken: ConstPtr<WsSecurityToken>, id: WsSecurityTokenPropertyId, value: MutPtr<CVoid>, valuesize: UInt, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(securitytoken.rawAddress, id, value.rawAddress, valuesize.toInt(), heap.rawAddress, error.rawAddress)

public actual fun wsGetServiceHostProperty(servicehost: ConstPtr<WsServiceHost>, id: WsServicePropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(servicehost.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetServiceProxyProperty(serviceproxy: ConstPtr<WsServiceProxy>, id: WsProxyPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(serviceproxy.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: MutPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(writer.rawAddress, nodeposition.rawAddress, error.rawAddress)

public actual fun wsGetWriterProperty(writer: ConstPtr<WsXmlWriter>, id: WsXmlWriterPropertyId, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(writer.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsGetXmlAttribute(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, heap: ConstPtr<WsHeap>, valuechars: MutPtr<MutPtr<UShort>>, valuecharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(reader.rawAddress, localname.rawAddress, heap.rawAddress, valuechars.rawAddress, valuecharcount.rawAddress, error.rawAddress)

public actual fun wsInitializeMessage(message: ConstPtr<WsMessage>, initialization: WsMessageInitialization, sourcemessage: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(message.rawAddress, initialization, sourcemessage.rawAddress, error.rawAddress)

public actual fun wsMarkHeaderAsUnderstood(message: ConstPtr<WsMessage>, headerposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(message.rawAddress, headerposition.rawAddress, error.rawAddress)

public actual fun wsMatchPolicyAlternative(policy: ConstPtr<WsPolicy>, alternativeindex: UInt, policyconstraints: ConstPtr<WsPolicyConstraints>, matchrequired: Bool, heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(policy.rawAddress, alternativeindex.toInt(), policyconstraints.rawAddress, matchrequired, heap.rawAddress, error.rawAddress)

public actual fun wsMoveReader(reader: ConstPtr<WsXmlReader>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(reader.rawAddress, moveto, found.rawAddress, error.rawAddress)

public actual fun wsMoveWriter(writer: ConstPtr<WsXmlWriter>, moveto: WsMoveTo, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(writer.rawAddress, moveto, found.rawAddress, error.rawAddress)

public actual fun wsOpenChannel(channel: ConstPtr<WsChannel>, endpointaddress: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(channel.rawAddress, endpointaddress.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsOpenListener(listener: ConstPtr<WsListener>, url: ConstPtr<WsString>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(listener.rawAddress, url.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsOpenServiceHost(servicehost: ConstPtr<WsServiceHost>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(servicehost.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsOpenServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, address: ConstPtr<WsEndpointAddress>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(serviceproxy.rawAddress, address.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsPullBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPullBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(writer.rawAddress, 0L, callbackstate.rawAddress, error.rawAddress)

public actual fun wsPushBytes(writer: ConstPtr<WsXmlWriter>, callback: WsPushBytesCallback, callbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(writer.rawAddress, 0L, callbackstate.rawAddress, error.rawAddress)

public actual fun wsReadArray(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: MutPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(reader.rawAddress, localname.rawAddress, ns.rawAddress, valuetype, array.rawAddress, arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), actualitemcount.rawAddress, error.rawAddress)

public actual fun wsReadAttribute(reader: ConstPtr<WsXmlReader>, attributedescription: ConstPtr<WsAttributeDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(reader.rawAddress, attributedescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(message.rawAddress, bodydescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadBytes(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<CVoid>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(reader.rawAddress, bytes.rawAddress, maxbytecount.toInt(), actualbytecount.rawAddress, error.rawAddress)

public actual fun wsReadChars(reader: ConstPtr<WsXmlReader>, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(reader.rawAddress, chars.rawAddress, maxcharcount.toInt(), actualcharcount.rawAddress, error.rawAddress)

public actual fun wsReadCharsUtf8(reader: ConstPtr<WsXmlReader>, bytes: MutPtr<UByte>, maxbytecount: UInt, actualbytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(reader.rawAddress, bytes.rawAddress, maxbytecount.toInt(), actualbytecount.rawAddress, error.rawAddress)

public actual fun wsReadElement(reader: ConstPtr<WsXmlReader>, elementdescription: ConstPtr<WsElementDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(reader.rawAddress, elementdescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadEndAttribute(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(reader.rawAddress, error.rawAddress)

public actual fun wsReadEndElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(reader.rawAddress, error.rawAddress)

public actual fun wsReadEndpointAddressExtension(reader: ConstPtr<WsXmlReader>, endpointaddress: ConstPtr<WsEndpointAddress>, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(reader.rawAddress, endpointaddress.rawAddress, extensiontype, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(message.rawAddress, error.rawAddress)

public actual fun wsReadEnvelopeStart(message: ConstPtr<WsMessage>, reader: ConstPtr<WsXmlReader>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(message.rawAddress, reader.rawAddress, 0L, donecallbackstate.rawAddress, error.rawAddress)

public actual fun wsReadMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(channel.rawAddress, message.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsReadMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(channel.rawAddress, message.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsReadMetadata(metadata: ConstPtr<WsMetadata>, reader: ConstPtr<WsXmlReader>, url: ConstPtr<WsString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(metadata.rawAddress, reader.rawAddress, url.rawAddress, error.rawAddress)

public actual fun wsReadNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(reader.rawAddress, error.rawAddress)

public actual fun wsReadQualifiedName(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, prefix: MutPtr<WsXmlString>, localname: MutPtr<WsXmlString>, ns: MutPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(reader.rawAddress, heap.rawAddress, prefix.rawAddress, localname.rawAddress, ns.rawAddress, error.rawAddress)

public actual fun wsReadStartAttribute(reader: ConstPtr<WsXmlReader>, attributeindex: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(reader.rawAddress, attributeindex.toInt(), error.rawAddress)

public actual fun wsReadStartElement(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(reader.rawAddress, error.rawAddress)

public actual fun wsReadToStartElement(reader: ConstPtr<WsXmlReader>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, found: MutPtr<Bool>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(reader.rawAddress, localname.rawAddress, ns.rawAddress, found.rawAddress, error.rawAddress)

public actual fun wsReadType(reader: ConstPtr<WsXmlReader>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadType(reader.rawAddress, typemapping, type, typedescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadValue(reader: ConstPtr<WsXmlReader>, valuetype: WsValueType, value: MutPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(reader.rawAddress, valuetype, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsReadXmlBuffer(reader: ConstPtr<WsXmlReader>, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(reader.rawAddress, heap.rawAddress, xmlbuffer.rawAddress, error.rawAddress)

public actual fun wsReadXmlBufferFromBytes(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, bytes: ConstPtr<CVoid>, bytecount: UInt, heap: ConstPtr<WsHeap>, xmlbuffer: MutPtr<MutPtr<WsXmlBuffer>>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(reader.rawAddress, encoding.rawAddress, properties.rawAddress, propertycount.toInt(), bytes.rawAddress, bytecount.toInt(), heap.rawAddress, xmlbuffer.rawAddress, error.rawAddress)

public actual fun wsReceiveMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescriptions: ConstPtr<ConstPtr<WsMessageDescription>>, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, index: MutPtr<UInt>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(channel.rawAddress, message.rawAddress, messagedescriptions.rawAddress, messagedescriptioncount.toInt(), receiveoption, readbodyoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), index.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsRegisterOperationForCancel(context: ConstPtr<WsOperationContext>, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(context.rawAddress, 0L, 0L, userstate.rawAddress, error.rawAddress)

public actual fun wsRemoveCustomHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, headerns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(message.rawAddress, headername.rawAddress, headerns.rawAddress, error.rawAddress)

public actual fun wsRemoveHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(message.rawAddress, headertype, error.rawAddress)

public actual fun wsRemoveMappedHeader(message: ConstPtr<WsMessage>, headername: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(message.rawAddress, headername.rawAddress, error.rawAddress)

public actual fun wsRemoveNode(nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(nodeposition.rawAddress, error.rawAddress)

public actual fun wsRequestReply(channel: ConstPtr<WsChannel>, requestmessage: ConstPtr<WsMessage>, requestmessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, requestbodyvalue: ConstPtr<CVoid>, requestbodyvaluesize: UInt, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, readoption: WsReadOption, heap: ConstPtr<WsHeap>, value: MutPtr<CVoid>, valuesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(channel.rawAddress, requestmessage.rawAddress, requestmessagedescription.rawAddress, writeoption, requestbodyvalue.rawAddress, requestbodyvaluesize.toInt(), replymessage.rawAddress, replymessagedescription.rawAddress, readoption, heap.rawAddress, value.rawAddress, valuesize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsRequestSecurityToken(channel: ConstPtr<WsChannel>, properties: ConstPtr<WsRequestSecurityTokenProperty>, propertycount: UInt, token: MutPtr<MutPtr<WsSecurityToken>>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(channel.rawAddress, properties.rawAddress, propertycount.toInt(), token.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsResetChannel(channel: ConstPtr<WsChannel>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(channel.rawAddress, error.rawAddress)

public actual fun wsResetError(error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetError(error.rawAddress)

public actual fun wsResetHeap(heap: ConstPtr<WsHeap>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(heap.rawAddress, error.rawAddress)

public actual fun wsResetListener(listener: ConstPtr<WsListener>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(listener.rawAddress, error.rawAddress)

public actual fun wsResetMessage(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(message.rawAddress, error.rawAddress)

public actual fun wsResetMetadata(metadata: ConstPtr<WsMetadata>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(metadata.rawAddress, error.rawAddress)

public actual fun wsResetServiceHost(servicehost: ConstPtr<WsServiceHost>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(servicehost.rawAddress, error.rawAddress)

public actual fun wsResetServiceProxy(serviceproxy: ConstPtr<WsServiceProxy>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(serviceproxy.rawAddress, error.rawAddress)

public actual fun wsRevokeSecurityContext(securitycontext: ConstPtr<WsSecurityContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(securitycontext.rawAddress, error.rawAddress)

public actual fun wsSendFaultMessageForError(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, faulterror: ConstPtr<WsError>, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(channel.rawAddress, replymessage.rawAddress, faulterror.rawAddress, faulterrorcode, faultdisclosure, requestmessage.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsSendMessage(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, messagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, bodyvalue: ConstPtr<CVoid>, bodyvaluesize: UInt, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(channel.rawAddress, message.rawAddress, messagedescription.rawAddress, writeoption, bodyvalue.rawAddress, bodyvaluesize.toInt(), asynccontext.rawAddress, error.rawAddress)

public actual fun wsSendReplyMessage(channel: ConstPtr<WsChannel>, replymessage: ConstPtr<WsMessage>, replymessagedescription: ConstPtr<WsMessageDescription>, writeoption: WsWriteOption, replybodyvalue: ConstPtr<CVoid>, replybodyvaluesize: UInt, requestmessage: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(channel.rawAddress, replymessage.rawAddress, replymessagedescription.rawAddress, writeoption, replybodyvalue.rawAddress, replybodyvaluesize.toInt(), requestmessage.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsSetChannelProperty(channel: ConstPtr<WsChannel>, id: WsChannelPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(channel.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsSetErrorProperty(error: ConstPtr<WsError>, id: WsErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(error.rawAddress, id, value.rawAddress, valuesize.toInt())

public actual fun wsSetFaultErrorDetail(error: ConstPtr<WsError>, faultdetaildescription: ConstPtr<WsFaultDetailDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(error.rawAddress, faultdetaildescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt())

public actual fun wsSetFaultErrorProperty(error: ConstPtr<WsError>, id: WsFaultErrorPropertyId, value: ConstPtr<CVoid>, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(error.rawAddress, id, value.rawAddress, valuesize.toInt())

public actual fun wsSetHeader(message: ConstPtr<WsMessage>, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(message.rawAddress, headertype, valuetype, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsSetInput(reader: ConstPtr<WsXmlReader>, encoding: ConstPtr<WsXmlReaderEncoding>, input: ConstPtr<WsXmlReaderInput>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(reader.rawAddress, encoding.rawAddress, input.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsSetInputToBuffer(reader: ConstPtr<WsXmlReader>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlReaderProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(reader.rawAddress, buffer.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsSetListenerProperty(listener: ConstPtr<WsListener>, id: WsListenerPropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(listener.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsSetMessageProperty(message: ConstPtr<WsMessage>, id: WsMessagePropertyId, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(message.rawAddress, id, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsSetOutput(writer: ConstPtr<WsXmlWriter>, encoding: ConstPtr<WsXmlWriterEncoding>, output: ConstPtr<WsXmlWriterOutput>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(writer.rawAddress, encoding.rawAddress, output.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsSetOutputToBuffer(writer: ConstPtr<WsXmlWriter>, buffer: ConstPtr<WsXmlBuffer>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(writer.rawAddress, buffer.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsSetReaderPosition(reader: ConstPtr<WsXmlReader>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(reader.rawAddress, nodeposition.rawAddress, error.rawAddress)

public actual fun wsSetWriterPosition(writer: ConstPtr<WsXmlWriter>, nodeposition: ConstPtr<WsXmlNodePosition>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(writer.rawAddress, nodeposition.rawAddress, error.rawAddress)

public actual fun wsShutdownSessionChannel(channel: ConstPtr<WsChannel>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(channel.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsSkipNode(reader: ConstPtr<WsXmlReader>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(reader.rawAddress, error.rawAddress)

public actual fun wsStartReaderCanonicalization(reader: ConstPtr<WsXmlReader>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(reader.rawAddress, 0L, writecallbackstate.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsStartWriterCanonicalization(writer: ConstPtr<WsXmlWriter>, writecallback: WsWriteCallback, writecallbackstate: ConstPtr<CVoid>, properties: ConstPtr<WsXmlCanonicalizationProperty>, propertycount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(writer.rawAddress, 0L, writecallbackstate.rawAddress, properties.rawAddress, propertycount.toInt(), error.rawAddress)

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr<MutPtr<UShort>>, trimmedcount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(chars.rawAddress, charcount.toInt(), trimmedchars.rawAddress, trimmedcount.rawAddress, error.rawAddress)

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(ncnamechars.rawAddress, ncnamecharcount.toInt(), error.rawAddress)

public actual fun wsWriteArray(writer: ConstPtr<WsXmlWriter>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, valuetype: WsValueType, array: ConstPtr<CVoid>, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(writer.rawAddress, localname.rawAddress, ns.rawAddress, valuetype, array.rawAddress, arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), error.rawAddress)

public actual fun wsWriteAttribute(writer: ConstPtr<WsXmlWriter>, attributedescription: ConstPtr<WsAttributeDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(writer.rawAddress, attributedescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsWriteBody(message: ConstPtr<WsMessage>, bodydescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(message.rawAddress, bodydescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsWriteBytes(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<CVoid>, bytecount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(writer.rawAddress, bytes.rawAddress, bytecount.toInt(), error.rawAddress)

public actual fun wsWriteChars(writer: ConstPtr<WsXmlWriter>, chars: Pcwstr, charcount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(writer.rawAddress, chars.rawAddress, charcount.toInt(), error.rawAddress)

public actual fun wsWriteCharsUtf8(writer: ConstPtr<WsXmlWriter>, bytes: ConstPtr<UByte>, bytecount: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(writer.rawAddress, bytes.rawAddress, bytecount.toInt(), error.rawAddress)

public actual fun wsWriteElement(writer: ConstPtr<WsXmlWriter>, elementdescription: ConstPtr<WsElementDescription>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(writer.rawAddress, elementdescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsWriteEndAttribute(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(writer.rawAddress, error.rawAddress)

public actual fun wsWriteEndCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(writer.rawAddress, error.rawAddress)

public actual fun wsWriteEndElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(writer.rawAddress, error.rawAddress)

public actual fun wsWriteEndStartElement(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(writer.rawAddress, error.rawAddress)

public actual fun wsWriteEnvelopeEnd(message: ConstPtr<WsMessage>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(message.rawAddress, error.rawAddress)

public actual fun wsWriteEnvelopeStart(message: ConstPtr<WsMessage>, writer: ConstPtr<WsXmlWriter>, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr<CVoid>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(message.rawAddress, writer.rawAddress, 0L, donecallbackstate.rawAddress, error.rawAddress)

public actual fun wsWriteMessageEnd(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(channel.rawAddress, message.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsWriteMessageStart(channel: ConstPtr<WsChannel>, message: ConstPtr<WsMessage>, asynccontext: ConstPtr<WsAsyncContext>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(channel.rawAddress, message.rawAddress, asynccontext.rawAddress, error.rawAddress)

public actual fun wsWriteNode(writer: ConstPtr<WsXmlWriter>, node: ConstPtr<WsXmlNode>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(writer.rawAddress, node.rawAddress, error.rawAddress)

public actual fun wsWriteQualifiedName(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(writer.rawAddress, prefix.rawAddress, localname.rawAddress, ns.rawAddress, error.rawAddress)

public actual fun wsWriteStartAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(writer.rawAddress, prefix.rawAddress, localname.rawAddress, ns.rawAddress, singlequote, error.rawAddress)

public actual fun wsWriteStartCData(writer: ConstPtr<WsXmlWriter>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(writer.rawAddress, error.rawAddress)

public actual fun wsWriteStartElement(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, localname: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(writer.rawAddress, prefix.rawAddress, localname.rawAddress, ns.rawAddress, error.rawAddress)

public actual fun wsWriteText(writer: ConstPtr<WsXmlWriter>, text: ConstPtr<WsXmlText>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(writer.rawAddress, text.rawAddress, error.rawAddress)

public actual fun wsWriteType(writer: ConstPtr<WsXmlWriter>, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr<CVoid>, writeoption: WsWriteOption, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(writer.rawAddress, typemapping, type, typedescription.rawAddress, writeoption, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsWriteValue(writer: ConstPtr<WsXmlWriter>, valuetype: WsValueType, value: ConstPtr<CVoid>, valuesize: UInt, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(writer.rawAddress, valuetype, value.rawAddress, valuesize.toInt(), error.rawAddress)

public actual fun wsWriteXmlBuffer(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(writer.rawAddress, xmlbuffer.rawAddress, error.rawAddress)

public actual fun wsWriteXmlBufferToBytes(writer: ConstPtr<WsXmlWriter>, xmlbuffer: ConstPtr<WsXmlBuffer>, encoding: ConstPtr<WsXmlWriterEncoding>, properties: ConstPtr<WsXmlWriterProperty>, propertycount: UInt, heap: ConstPtr<WsHeap>, bytes: MutPtr<MutPtr<CVoid>>, bytecount: MutPtr<UInt>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(writer.rawAddress, xmlbuffer.rawAddress, encoding.rawAddress, properties.rawAddress, propertycount.toInt(), heap.rawAddress, bytes.rawAddress, bytecount.rawAddress, error.rawAddress)

public actual fun wsWriteXmlnsAttribute(writer: ConstPtr<WsXmlWriter>, prefix: ConstPtr<WsXmlString>, ns: ConstPtr<WsXmlString>, singlequote: Bool, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(writer.rawAddress, prefix.rawAddress, ns.rawAddress, singlequote, error.rawAddress)

public actual fun wsXmlStringEquals(string1: ConstPtr<WsXmlString>, string2: ConstPtr<WsXmlString>, error: ConstPtr<WsError>): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(string1.rawAddress, string2.rawAddress, error.rawAddress)
