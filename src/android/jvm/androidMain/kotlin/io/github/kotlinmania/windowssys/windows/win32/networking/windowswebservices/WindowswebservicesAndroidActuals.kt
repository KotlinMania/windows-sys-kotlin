@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32NetworkingWindowswebservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorGetAssertion(hwnd: Long, pwszrpid: Long, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorMakeCredential(hwnd: Long, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNCancelCurrentOperation(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNDeletePlatformCredential(cbcredentialid: Int, pbcredentialid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeAssertion(pwebauthnassertion: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNGetApiVersionNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNGetCancellationId(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNGetErrorName(hr: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNGetW3CExceptionDOMError(hr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbandonCall(serviceproxy: Long, callid: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbandonMessage(channel: Long, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbortChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbortListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbortServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAbortServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: Int, value: Long, valuesize: Int, headerattributes: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAddErrorString(error: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAddMappedHeader(message: Long, headername: Long, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAddressMessage(message: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAlloc(heap: Long, size: Long, ptr: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsAsyncExecute(asyncstate: Long, operation: Long, callbackmodel: Int, callbackstate: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCheckMustUnderstandHeaders(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCloseChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCloseListener(listener: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCombineUrl(baseurl: Long, referenceurl: Long, flags: Int, heap: Long, resulturl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCopyError(source: Long, destination: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCopyNode(writer: Long, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateChannel(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateChannelForListener(listener: Long, properties: Long, propertycount: Int, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateError(properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateFaultFromError(error: Long, faulterrorcode: Int, faultdisclosure: Int, heap: Long, fault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateHeap(maxsize: Long, trimsize: Long, properties: Long, propertycount: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateListener(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateMessage(envelopeversion: Int, addressingversion: Int, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateMetadata(properties: Long, propertycount: Int, metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateReader(properties: Long, propertycount: Int, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateServiceEndpointFromTemplate(channeltype: Int, properties: Long, propertycount: Int, addressurl: Long, contract: Long, authorizationcallback: Long, heap: Long, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceendpoint: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateServiceHost(endpoints: Long, endpointcount: Short, serviceproperties: Long, servicepropertycount: Int, servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxy(channeltype: Int, channelbinding: Int, securitydescription: Long, properties: Long, propertycount: Int, channelproperties: Long, channelpropertycount: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxyFromTemplate(channeltype: Int, properties: Long, propertycount: Int, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateWriter(properties: Long, propertycount: Int, writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: Int, buffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: Int, token: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsDecodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsEncodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsEndReaderCanonicalization(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsEndWriterCanonicalization(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFillBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFillReader(reader: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFindAttribute(reader: Long, localname: Long, ns: Long, required: Int, attributeindex: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFlushBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFlushWriter(writer: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeChannel(channel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeError(error: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeHeap(heap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeListener(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeMessage(message: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeMetadata(metadata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeReader(reader: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeSecurityToken(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeServiceHost(servicehost: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeServiceProxy(serviceproxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsFreeWriter(writer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: Int, headerindex: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetDictionary(encoding: Int, dictionary: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetErrorString(error: Long, index: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetHeader(message: Long, headertype: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetHeapProperty(heap: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetMappedHeader(message: Long, headername: Long, repeatingoption: Int, headerindex: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetMetadataProperty(metadata: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: Int, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetOperationContextProperty(context: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetPolicyProperty(policy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetPrefixFromNamespace(writer: Long, ns: Long, required: Int, prefix: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetReaderNode(xmlreader: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetReaderProperty(reader: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetSecurityContextProperty(securitycontext: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetSecurityTokenProperty(securitytoken: Long, id: Int, value: Long, valuesize: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetServiceHostProperty(servicehost: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetServiceProxyProperty(serviceproxy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetWriterProperty(writer: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsInitializeMessage(message: Long, initialization: Int, sourcemessage: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsMatchPolicyAlternative(policy: Long, alternativeindex: Int, policyconstraints: Long, matchrequired: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsMoveReader(reader: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsMoveWriter(writer: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsPullBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsPushBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, actualitemcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadAttribute(reader: Long, attributedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadBody(message: Long, bodydescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadBytes(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadChars(reader: Long, chars: Long, maxcharcount: Int, actualcharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadElement(reader: Long, elementdescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadEndAttribute(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadEndElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeStart(message: Long, reader: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadStartAttribute(reader: Long, attributeindex: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadStartElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadType(reader: Long, typemapping: Int, type: Int, typedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadValue(reader: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: Int, bytes: Long, bytecount: Int, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: Int, receiveoption: Int, readbodyoption: Int, heap: Long, value: Long, valuesize: Int, index: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRegisterOperationForCancel(context: Long, cancelcallback: Long, freestatecallback: Long, userstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRemoveHeader(message: Long, headertype: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRemoveMappedHeader(message: Long, headername: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRemoveNode(nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: Int, requestbodyvalue: Long, requestbodyvaluesize: Int, replymessage: Long, replymessagedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRequestSecurityToken(channel: Long, properties: Long, propertycount: Int, token: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetError(error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetHeap(heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetMessage(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetMetadata(metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsResetServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsRevokeSecurityContext(securitycontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: Int, faultdisclosure: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: Int, bodyvalue: Long, bodyvaluesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: Int, replybodyvalue: Long, replybodyvaluesize: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetHeader(message: Long, headertype: Int, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsSkipNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsStartReaderCanonicalization(reader: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsStartWriterCanonicalization(writer: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsTrimXmlWhitespace(chars: Long, charcount: Int, trimmedchars: Long, trimmedcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsVerifyXmlNCName(ncnamechars: Long, ncnamecharcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteBody(message: Long, bodydescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteBytes(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteChars(writer: Long, chars: Long, charcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteElement(writer: Long, elementdescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEndAttribute(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEndCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEndElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEndStartElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteNode(writer: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteStartCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteText(writer: Long, text: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteType(writer: Long, typemapping: Int, type: Int, typedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteValue(writer: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: Int, heap: Long, bytes: Long, bytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_WsXmlStringEquals(string1: Long, string2: Long, error: Long): Int
}

public actual fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorGetAssertion(hwnd, pwszrpid, pwebauthnclientdata, pwebauthngetassertionoptions, ppwebauthnassertion)

public actual fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorMakeCredential(hwnd, prpinformation, puserinformation, ppubkeycredparams, pwebauthnclientdata, pwebauthnmakecredentialoptions, ppwebauthncredentialattestation)

public actual fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNCancelCurrentOperation(pcancellationid)

public actual fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNDeletePlatformCredential(cbcredentialid.toInt(), pbcredentialid)

public actual fun WebAuthNFreeAssertion(pwebauthnassertion: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeAssertion(pwebauthnassertion)
}

public actual fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation)
}

public actual fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreePlatformCredentialList(pcredentialdetailslist)
}

public actual fun WebAuthNGetApiVersionNumber(): UInt =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetApiVersionNumber().toUInt()

public actual fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetCancellationId(pcancellationid)

public actual fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetErrorName(hr)

public actual fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetPlatformCredentialList(pgetcredentialsoptions, ppcredentialdetailslist)

public actual fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetW3CExceptionDOMError(hr)

public actual fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable)

public actual fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbandonCall(serviceproxy, callid.toInt(), error)

public actual fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbandonMessage(channel, message, error)

public actual fun WsAbortChannel(channel: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbortChannel(channel, error)

public actual fun WsAbortListener(listener: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbortListener(listener, error)

public actual fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceHost(servicehost, error)

public actual fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceProxy(serviceproxy, error)

public actual fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAcceptChannel(listener, channel, asynccontext, error)

public actual fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAddCustomHeader(message, headerdescription, writeoption, value, valuesize.toInt(), headerattributes.toInt(), error)

public actual fun WsAddErrorString(error: Long, string: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAddErrorString(error, string)

public actual fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAddMappedHeader(message, headername, valuetype, writeoption, value, valuesize.toInt(), error)

public actual fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAddressMessage(message, address, error)

public actual fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAlloc(heap, size.toLong(), ptr, error)

public actual fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsAsyncExecute(asyncstate, operation.toLong(), callbackmodel, callbackstate, asynccontext, error)

public actual fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCall(serviceproxy, operation, arguments, heap, callproperties, callpropertycount.toInt(), asynccontext, error)

public actual fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCheckMustUnderstandHeaders(message, error)

public actual fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCloseChannel(channel, asynccontext, error)

public actual fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCloseListener(listener, asynccontext, error)

public actual fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceHost(servicehost, asynccontext, error)

public actual fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceProxy(serviceproxy, asynccontext, error)

public actual fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCombineUrl(baseurl, referenceurl, flags.toInt(), heap, resulturl, error)

public actual fun WsCopyError(source: Long, destination: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCopyError(source, destination)

public actual fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCopyNode(writer, reader, error)

public actual fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateChannel(channeltype, channelbinding, properties, propertycount.toInt(), securitydescription, channel, error)

public actual fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateChannelForListener(listener, properties, propertycount.toInt(), channel, error)

public actual fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateError(properties, propertycount.toInt(), error)

public actual fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateFaultFromError(error, faulterrorcode, faultdisclosure, heap, fault)

public actual fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateHeap(maxsize.toLong(), trimsize.toLong(), properties, propertycount.toInt(), heap, error)

public actual fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateListener(channeltype, channelbinding, properties, propertycount.toInt(), securitydescription, listener, error)

public actual fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateMessage(envelopeversion, addressingversion, properties, propertycount.toInt(), message, error)

public actual fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateMessageForChannel(channel, properties, propertycount.toInt(), message, error)

public actual fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateMetadata(properties, propertycount.toInt(), metadata, error)

public actual fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateReader(properties, propertycount.toInt(), reader, error)

public actual fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceEndpointFromTemplate(channeltype, properties, propertycount.toInt(), addressurl, contract, authorizationcallback.toLong(), heap, templatetype, templatevalue, templatesize.toInt(), templatedescription, templatedescriptionsize.toInt(), serviceendpoint, error)

public actual fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceHost(endpoints, endpointcount.toShort(), serviceproperties, servicepropertycount.toInt(), servicehost, error)

public actual fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxy(channeltype, channelbinding, securitydescription, properties, propertycount.toInt(), channelproperties, channelpropertycount.toInt(), serviceproxy, error)

public actual fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxyFromTemplate(channeltype, properties, propertycount.toInt(), templatetype, templatevalue, templatesize.toInt(), templatedescription, templatedescriptionsize.toInt(), serviceproxy, error)

public actual fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateWriter(properties, propertycount.toInt(), writer, error)

public actual fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlBuffer(heap, properties, propertycount.toInt(), buffer, error)

public actual fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlSecurityToken(tokenxml, tokenkey, properties, propertycount.toInt(), token, error)

public actual fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsDateTimeToFileTime(datetime, filetime, error)

public actual fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsDecodeUrl(url, flags.toInt(), heap, outurl, error)

public actual fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsEncodeUrl(url, flags.toInt(), heap, outurl, error)

public actual fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsEndReaderCanonicalization(reader, error)

public actual fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsEndWriterCanonicalization(writer, error)

public actual fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFileTimeToDateTime(filetime, datetime, error)

public actual fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFillBody(message, minsize.toInt(), asynccontext, error)

public actual fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFillReader(reader, minsize.toInt(), asynccontext, error)

public actual fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFindAttribute(reader, localname, ns, required, attributeindex, error)

public actual fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFlushBody(message, minsize.toInt(), asynccontext, error)

public actual fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFlushWriter(writer, minsize.toInt(), asynccontext, error)

public actual fun WsFreeChannel(channel: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeChannel(channel)
}

public actual fun WsFreeError(error: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeError(error)
}

public actual fun WsFreeHeap(heap: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeHeap(heap)
}

public actual fun WsFreeListener(listener: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeListener(listener)
}

public actual fun WsFreeMessage(message: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeMessage(message)
}

public actual fun WsFreeMetadata(metadata: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeMetadata(metadata)
}

public actual fun WsFreeReader(reader: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeReader(reader)
}

public actual fun WsFreeSecurityToken(token: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeSecurityToken(token)
}

public actual fun WsFreeServiceHost(servicehost: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceHost(servicehost)
}

public actual fun WsFreeServiceProxy(serviceproxy: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceProxy(serviceproxy)
}

public actual fun WsFreeWriter(writer: Long) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsFreeWriter(writer)
}

public actual fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetChannelProperty(channel, id, value, valuesize.toInt(), error)

public actual fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetCustomHeader(message, customheaderdescription, repeatingoption, headerindex.toInt(), readoption, heap, value, valuesize.toInt(), headerattributes, error)

public actual fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetDictionary(encoding, dictionary, error)

public actual fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetErrorProperty(error, id, buffer, buffersize.toInt())

public actual fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetErrorString(error, index.toInt(), string)

public actual fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorDetail(error, faultdetaildescription, readoption, heap, value, valuesize.toInt())

public actual fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorProperty(error, id, buffer, buffersize.toInt())

public actual fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetHeader(message, headertype, valuetype, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetHeaderAttributes(message, reader, headerattributes, error)

public actual fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetHeapProperty(heap, id, value, valuesize.toInt(), error)

public actual fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetListenerProperty(listener, id, value, valuesize.toInt(), error)

public actual fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetMappedHeader(message, headername, repeatingoption, headerindex.toInt(), valuetype, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetMessageProperty(message, id, value, valuesize.toInt(), error)

public actual fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataEndpoints(metadata, endpoints, error)

public actual fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataProperty(metadata, id, value, valuesize.toInt(), error)

public actual fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetMissingMetadataDocumentAddress(metadata, address, error)

public actual fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetNamespaceFromPrefix(reader, prefix, required, ns, error)

public actual fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetOperationContextProperty(context, id, value, valuesize.toInt(), error)

public actual fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyAlternativeCount(policy, count, error)

public actual fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyProperty(policy, id, value, valuesize.toInt(), error)

public actual fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetPrefixFromNamespace(writer, ns, required, prefix, error)

public actual fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetReaderNode(xmlreader, node, error)

public actual fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetReaderPosition(reader, nodeposition, error)

public actual fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetReaderProperty(reader, id, value, valuesize.toInt(), error)

public actual fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityContextProperty(securitycontext, id, value, valuesize.toInt(), error)

public actual fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityTokenProperty(securitytoken, id, value, valuesize.toInt(), heap, error)

public actual fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetServiceHostProperty(servicehost, id, value, valuesize.toInt(), error)

public actual fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetServiceProxyProperty(serviceproxy, id, value, valuesize.toInt(), error)

public actual fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetWriterPosition(writer, nodeposition, error)

public actual fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetWriterProperty(writer, id, value, valuesize.toInt(), error)

public actual fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsGetXmlAttribute(reader, localname, heap, valuechars, valuecharcount, error)

public actual fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsInitializeMessage(message, initialization, sourcemessage, error)

public actual fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsMarkHeaderAsUnderstood(message, headerposition, error)

public actual fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsMatchPolicyAlternative(policy, alternativeindex.toInt(), policyconstraints, matchrequired, heap, error)

public actual fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsMoveReader(reader, moveto, found, error)

public actual fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsMoveWriter(writer, moveto, found, error)

public actual fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsOpenChannel(channel, endpointaddress, asynccontext, error)

public actual fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsOpenListener(listener, url, asynccontext, error)

public actual fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceHost(servicehost, asynccontext, error)

public actual fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceProxy(serviceproxy, address, asynccontext, error)

public actual fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsPullBytes(writer, callback.toLong(), callbackstate, error)

public actual fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsPushBytes(writer, callback.toLong(), callbackstate, error)

public actual fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadArray(reader, localname, ns, valuetype, array, arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), actualitemcount, error)

public actual fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadAttribute(reader, attributedescription, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadBody(message, bodydescription, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadBytes(reader, bytes, maxbytecount.toInt(), actualbytecount, error)

public actual fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadChars(reader, chars, maxcharcount.toInt(), actualcharcount, error)

public actual fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadCharsUtf8(reader, bytes, maxbytecount.toInt(), actualbytecount, error)

public actual fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadElement(reader, elementdescription, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsReadEndAttribute(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadEndAttribute(reader, error)

public actual fun WsReadEndElement(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadEndElement(reader, error)

public actual fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadEndpointAddressExtension(reader, endpointaddress, extensiontype, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeEnd(message, error)

public actual fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeStart(message, reader, donecallback.toLong(), donecallbackstate, error)

public actual fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadMessageEnd(channel, message, asynccontext, error)

public actual fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadMessageStart(channel, message, asynccontext, error)

public actual fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadMetadata(metadata, reader, url, error)

public actual fun WsReadNode(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadNode(reader, error)

public actual fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadQualifiedName(reader, heap, prefix, localname, ns, error)

public actual fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadStartAttribute(reader, attributeindex.toInt(), error)

public actual fun WsReadStartElement(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadStartElement(reader, error)

public actual fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadToStartElement(reader, localname, ns, found, error)

public actual fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadType(reader, typemapping, type, typedescription, readoption, heap, value, valuesize.toInt(), error)

public actual fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadValue(reader, valuetype, value, valuesize.toInt(), error)

public actual fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBuffer(reader, heap, xmlbuffer, error)

public actual fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBufferFromBytes(reader, encoding, properties, propertycount.toInt(), bytes, bytecount.toInt(), heap, xmlbuffer, error)

public actual fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsReceiveMessage(channel, message, messagedescriptions, messagedescriptioncount.toInt(), receiveoption, readbodyoption, heap, value, valuesize.toInt(), index, asynccontext, error)

public actual fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRegisterOperationForCancel(context, cancelcallback.toLong(), freestatecallback.toLong(), userstate, error)

public actual fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRemoveCustomHeader(message, headername, headerns, error)

public actual fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRemoveHeader(message, headertype, error)

public actual fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRemoveMappedHeader(message, headername, error)

public actual fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRemoveNode(nodeposition, error)

public actual fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRequestReply(channel, requestmessage, requestmessagedescription, writeoption, requestbodyvalue, requestbodyvaluesize.toInt(), replymessage, replymessagedescription, readoption, heap, value, valuesize.toInt(), asynccontext, error)

public actual fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRequestSecurityToken(channel, properties, propertycount.toInt(), token, asynccontext, error)

public actual fun WsResetChannel(channel: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetChannel(channel, error)

public actual fun WsResetError(error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetError(error)

public actual fun WsResetHeap(heap: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetHeap(heap, error)

public actual fun WsResetListener(listener: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetListener(listener, error)

public actual fun WsResetMessage(message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetMessage(message, error)

public actual fun WsResetMetadata(metadata: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetMetadata(metadata, error)

public actual fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetServiceHost(servicehost, error)

public actual fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsResetServiceProxy(serviceproxy, error)

public actual fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsRevokeSecurityContext(securitycontext, error)

public actual fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSendFaultMessageForError(channel, replymessage, faulterror, faulterrorcode, faultdisclosure, requestmessage, asynccontext, error)

public actual fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSendMessage(channel, message, messagedescription, writeoption, bodyvalue, bodyvaluesize.toInt(), asynccontext, error)

public actual fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSendReplyMessage(channel, replymessage, replymessagedescription, writeoption, replybodyvalue, replybodyvaluesize.toInt(), requestmessage, asynccontext, error)

public actual fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetChannelProperty(channel, id, value, valuesize.toInt(), error)

public actual fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetErrorProperty(error, id, value, valuesize.toInt())

public actual fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorDetail(error, faultdetaildescription, writeoption, value, valuesize.toInt())

public actual fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorProperty(error, id, value, valuesize.toInt())

public actual fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetHeader(message, headertype, valuetype, writeoption, value, valuesize.toInt(), error)

public actual fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetInput(reader, encoding, input, properties, propertycount.toInt(), error)

public actual fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetInputToBuffer(reader, buffer, properties, propertycount.toInt(), error)

public actual fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetListenerProperty(listener, id, value, valuesize.toInt(), error)

public actual fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetMessageProperty(message, id, value, valuesize.toInt(), error)

public actual fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetOutput(writer, encoding, output, properties, propertycount.toInt(), error)

public actual fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetOutputToBuffer(writer, buffer, properties, propertycount.toInt(), error)

public actual fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetReaderPosition(reader, nodeposition, error)

public actual fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSetWriterPosition(writer, nodeposition, error)

public actual fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsShutdownSessionChannel(channel, asynccontext, error)

public actual fun WsSkipNode(reader: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsSkipNode(reader, error)

public actual fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsStartReaderCanonicalization(reader, writecallback.toLong(), writecallbackstate, properties, propertycount.toInt(), error)

public actual fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsStartWriterCanonicalization(writer, writecallback.toLong(), writecallbackstate, properties, propertycount.toInt(), error)

public actual fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsTrimXmlWhitespace(chars, charcount.toInt(), trimmedchars, trimmedcount, error)

public actual fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsVerifyXmlNCName(ncnamechars, ncnamecharcount.toInt(), error)

public actual fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteArray(writer, localname, ns, valuetype, array, arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), error)

public actual fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteAttribute(writer, attributedescription, writeoption, value, valuesize.toInt(), error)

public actual fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteBody(message, bodydescription, writeoption, value, valuesize.toInt(), error)

public actual fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteBytes(writer, bytes, bytecount.toInt(), error)

public actual fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteChars(writer, chars, charcount.toInt(), error)

public actual fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteCharsUtf8(writer, bytes, bytecount.toInt(), error)

public actual fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteElement(writer, elementdescription, writeoption, value, valuesize.toInt(), error)

public actual fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEndAttribute(writer, error)

public actual fun WsWriteEndCData(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEndCData(writer, error)

public actual fun WsWriteEndElement(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEndElement(writer, error)

public actual fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEndStartElement(writer, error)

public actual fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeEnd(message, error)

public actual fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeStart(message, writer, donecallback.toLong(), donecallbackstate, error)

public actual fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageEnd(channel, message, asynccontext, error)

public actual fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageStart(channel, message, asynccontext, error)

public actual fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteNode(writer, node, error)

public actual fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteQualifiedName(writer, prefix, localname, ns, error)

public actual fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteStartAttribute(writer, prefix, localname, ns, singlequote, error)

public actual fun WsWriteStartCData(writer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteStartCData(writer, error)

public actual fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteStartElement(writer, prefix, localname, ns, error)

public actual fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteText(writer, text, error)

public actual fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteType(writer, typemapping, type, typedescription, writeoption, value, valuesize.toInt(), error)

public actual fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteValue(writer, valuetype, value, valuesize.toInt(), error)

public actual fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBuffer(writer, xmlbuffer, error)

public actual fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBufferToBytes(writer, xmlbuffer, encoding, properties, propertycount.toInt(), heap, bytes, bytecount, error)

public actual fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlnsAttribute(writer, prefix, ns, singlequote, error)

public actual fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_WsXmlStringEquals(string1, string2, error)
