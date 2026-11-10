@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32NetworkingWindowswebservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorGetAssertion(hwnd: Long, pwszrpid: Long, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorMakeCredential(hwnd: Long, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNCancelCurrentOperation(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNDeletePlatformCredential(cbcredentialid: Int, pbcredentialid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNFreeAssertion(pwebauthnassertion: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNFreePlatformCredentialList(pcredentialdetailslist: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNGetApiVersionNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNGetCancellationId(pcancellationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNGetErrorName(hr: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNGetW3CExceptionDOMError(hr: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbandonCall(serviceproxy: Long, callid: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbandonMessage(channel: Long, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbortChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbortListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbortServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAbortServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAddCustomHeader(message: Long, headerdescription: Long, writeoption: Int, value: Long, valuesize: Int, headerattributes: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAddErrorString(error: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAddMappedHeader(message: Long, headername: Long, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAddressMessage(message: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAlloc(heap: Long, size: Long, ptr: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsAsyncExecute(asyncstate: Long, operation: Long, callbackmodel: Int, callbackstate: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCheckMustUnderstandHeaders(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCloseChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCloseListener(listener: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCombineUrl(baseurl: Long, referenceurl: Long, flags: Int, heap: Long, resulturl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCopyError(source: Long, destination: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCopyNode(writer: Long, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateChannel(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateChannelForListener(listener: Long, properties: Long, propertycount: Int, channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateError(properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateFaultFromError(error: Long, faulterrorcode: Int, faultdisclosure: Int, heap: Long, fault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateHeap(maxsize: Long, trimsize: Long, properties: Long, propertycount: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateListener(channeltype: Int, channelbinding: Int, properties: Long, propertycount: Int, securitydescription: Long, listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateMessage(envelopeversion: Int, addressingversion: Int, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateMessageForChannel(channel: Long, properties: Long, propertycount: Int, message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateMetadata(properties: Long, propertycount: Int, metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateReader(properties: Long, propertycount: Int, reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateServiceEndpointFromTemplate(channeltype: Int, properties: Long, propertycount: Int, addressurl: Long, contract: Long, authorizationcallback: Long, heap: Long, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceendpoint: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateServiceHost(endpoints: Long, endpointcount: Short, serviceproperties: Long, servicepropertycount: Int, servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxy(channeltype: Int, channelbinding: Int, securitydescription: Long, properties: Long, propertycount: Int, channelproperties: Long, channelpropertycount: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxyFromTemplate(channeltype: Int, properties: Long, propertycount: Int, templatetype: Int, templatevalue: Long, templatesize: Int, templatedescription: Long, templatedescriptionsize: Int, serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateWriter(properties: Long, propertycount: Int, writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateXmlBuffer(heap: Long, properties: Long, propertycount: Int, buffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: Int, token: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsDecodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsEncodeUrl(url: Long, flags: Int, heap: Long, outurl: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsEndReaderCanonicalization(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsEndWriterCanonicalization(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFillBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFillReader(reader: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFindAttribute(reader: Long, localname: Long, ns: Long, required: Int, attributeindex: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFlushBody(message: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFlushWriter(writer: Long, minsize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeChannel(channel: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeError(error: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeHeap(heap: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeListener(listener: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeMessage(message: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeMetadata(metadata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeReader(reader: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeSecurityToken(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeServiceHost(servicehost: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeServiceProxy(serviceproxy: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsFreeWriter(writer: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: Int, headerindex: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetDictionary(encoding: Int, dictionary: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetErrorString(error: Long, index: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorProperty(error: Long, id: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetHeader(message: Long, headertype: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetHeapProperty(heap: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetMappedHeader(message: Long, headername: Long, repeatingoption: Int, headerindex: Int, valuetype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetMetadataProperty(metadata: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: Int, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetOperationContextProperty(context: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetPolicyProperty(policy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetPrefixFromNamespace(writer: Long, ns: Long, required: Int, prefix: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetReaderNode(xmlreader: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetReaderProperty(reader: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetSecurityContextProperty(securitycontext: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetSecurityTokenProperty(securitytoken: Long, id: Int, value: Long, valuesize: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetServiceHostProperty(servicehost: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetServiceProxyProperty(serviceproxy: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetWriterProperty(writer: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsInitializeMessage(message: Long, initialization: Int, sourcemessage: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsMatchPolicyAlternative(policy: Long, alternativeindex: Int, policyconstraints: Long, matchrequired: Int, heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsMoveReader(reader: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsMoveWriter(writer: Long, moveto: Int, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsPullBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsPushBytes(writer: Long, callback: Long, callbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadArray(reader: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, actualitemcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadAttribute(reader: Long, attributedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadBody(message: Long, bodydescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadBytes(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadChars(reader: Long, chars: Long, maxcharcount: Int, actualcharcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: Int, actualbytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadElement(reader: Long, elementdescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadEndAttribute(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadEndElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: Int, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeStart(message: Long, reader: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadStartAttribute(reader: Long, attributeindex: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadStartElement(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadType(reader: Long, typemapping: Int, type: Int, typedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadValue(reader: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: Int, bytes: Long, bytecount: Int, heap: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: Int, receiveoption: Int, readbodyoption: Int, heap: Long, value: Long, valuesize: Int, index: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRegisterOperationForCancel(context: Long, cancelcallback: Long, freestatecallback: Long, userstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRemoveHeader(message: Long, headertype: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRemoveMappedHeader(message: Long, headername: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRemoveNode(nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: Int, requestbodyvalue: Long, requestbodyvaluesize: Int, replymessage: Long, replymessagedescription: Long, readoption: Int, heap: Long, value: Long, valuesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRequestSecurityToken(channel: Long, properties: Long, propertycount: Int, token: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetChannel(channel: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetError(error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetHeap(heap: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetListener(listener: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetMessage(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetMetadata(metadata: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetServiceHost(servicehost: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsResetServiceProxy(serviceproxy: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsRevokeSecurityContext(securitycontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: Int, faultdisclosure: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: Int, bodyvalue: Long, bodyvaluesize: Int, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: Int, replybodyvalue: Long, replybodyvaluesize: Int, requestmessage: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetChannelProperty(channel: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorProperty(error: Long, id: Int, value: Long, valuesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetHeader(message: Long, headertype: Int, valuetype: Int, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetListenerProperty(listener: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetMessageProperty(message: Long, id: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsSkipNode(reader: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsStartReaderCanonicalization(reader: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsStartWriterCanonicalization(writer: Long, writecallback: Long, writecallbackstate: Long, properties: Long, propertycount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsTrimXmlWhitespace(chars: Long, charcount: Int, trimmedchars: Long, trimmedcount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsVerifyXmlNCName(ncnamechars: Long, ncnamecharcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: Int, array: Long, arraysize: Int, itemoffset: Int, itemcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteAttribute(writer: Long, attributedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteBody(message: Long, bodydescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteBytes(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteChars(writer: Long, chars: Long, charcount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteElement(writer: Long, elementdescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEndAttribute(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEndCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEndElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEndStartElement(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeEnd(message: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeStart(message: Long, writer: Long, donecallback: Long, donecallbackstate: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteNode(writer: Long, node: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteStartCData(writer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteText(writer: Long, text: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteType(writer: Long, typemapping: Int, type: Int, typedescription: Long, writeoption: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteValue(writer: Long, valuetype: Int, value: Long, valuesize: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: Int, heap: Long, bytes: Long, bytecount: Long, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: Int, error: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_windowswebservices_wsXmlStringEquals(string1: Long, string2: Long, error: Long): Int
}

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: COpaquePointer?, pwebauthngetassertionoptions: COpaquePointer?, ppwebauthnassertion: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorGetAssertion((hwnd?.value ?: 0L), (pwszrpid?.value ?: 0L), (pwebauthnclientdata?.value ?: 0L), (pwebauthngetassertionoptions?.value ?: 0L), (ppwebauthnassertion?.value ?: 0L))

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: COpaquePointer?, puserinformation: COpaquePointer?, ppubkeycredparams: COpaquePointer?, pwebauthnclientdata: COpaquePointer?, pwebauthnmakecredentialoptions: COpaquePointer?, ppwebauthncredentialattestation: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorMakeCredential((hwnd?.value ?: 0L), (prpinformation?.value ?: 0L), (puserinformation?.value ?: 0L), (ppubkeycredparams?.value ?: 0L), (pwebauthnclientdata?.value ?: 0L), (pwebauthnmakecredentialoptions?.value ?: 0L), (ppwebauthncredentialattestation?.value ?: 0L))

public actual fun webAuthNCancelCurrentOperation(pcancellationid: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNCancelCurrentOperation((pcancellationid?.value ?: 0L))

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNDeletePlatformCredential(cbcredentialid.toInt(), (pbcredentialid?.value ?: 0L))

public actual fun webAuthNFreeAssertion(pwebauthnassertion: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNFreeAssertion((pwebauthnassertion?.value ?: 0L))
}

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNFreeCredentialAttestation((pwebauthncredentialattestation?.value ?: 0L))
}

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNFreePlatformCredentialList((pcredentialdetailslist?.value ?: 0L))
}

public actual fun webAuthNGetApiVersionNumber(): UInt =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNGetApiVersionNumber().toUInt()

public actual fun webAuthNGetCancellationId(pcancellationid: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNGetCancellationId((pcancellationid?.value ?: 0L))

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNGetErrorName(hr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: COpaquePointer?, ppcredentialdetailslist: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNGetPlatformCredentialList((pgetcredentialsoptions?.value ?: 0L), (ppcredentialdetailslist?.value ?: 0L))

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNGetW3CExceptionDOMError(hr)

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_webAuthNIsUserVerifyingPlatformAuthenticatorAvailable((pbisuserverifyingplatformauthenticatoravailable?.value ?: 0L))

public actual fun wsAbandonCall(serviceproxy: COpaquePointer?, callid: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbandonCall((serviceproxy?.value ?: 0L), callid.toInt(), (error?.value ?: 0L))

public actual fun wsAbandonMessage(channel: COpaquePointer?, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbandonMessage((channel?.value ?: 0L), (message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAbortChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbortChannel((channel?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAbortListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbortListener((listener?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAbortServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbortServiceHost((servicehost?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAbortServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAbortServiceProxy((serviceproxy?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAcceptChannel(listener: COpaquePointer?, channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAcceptChannel((listener?.value ?: 0L), (channel?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAddCustomHeader(message: COpaquePointer?, headerdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, headerattributes: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAddCustomHeader((message?.value ?: 0L), (headerdescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt(), headerattributes.toInt(), (error?.value ?: 0L))

public actual fun wsAddErrorString(error: COpaquePointer?, string: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAddErrorString((error?.value ?: 0L), (string?.value ?: 0L))

public actual fun wsAddMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAddMappedHeader((message?.value ?: 0L), (headername?.value ?: 0L), valuetype, writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsAddressMessage(message: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAddressMessage((message?.value ?: 0L), (address?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAlloc(heap: COpaquePointer?, size: ULong, ptr: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAlloc((heap?.value ?: 0L), size.toLong(), (ptr?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsAsyncExecute(asyncstate: COpaquePointer?, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsAsyncExecute((asyncstate?.value ?: 0L), 0L, callbackmodel, (callbackstate?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCall(serviceproxy: COpaquePointer?, operation: COpaquePointer?, arguments: COpaquePointer?, heap: COpaquePointer?, callproperties: COpaquePointer?, callpropertycount: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCall((serviceproxy?.value ?: 0L), (operation?.value ?: 0L), (arguments?.value ?: 0L), (heap?.value ?: 0L), (callproperties?.value ?: 0L), callpropertycount.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCheckMustUnderstandHeaders(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCheckMustUnderstandHeaders((message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCloseChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCloseChannel((channel?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCloseListener(listener: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCloseListener((listener?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCloseServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCloseServiceHost((servicehost?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCloseServiceProxy(serviceproxy: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCloseServiceProxy((serviceproxy?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCombineUrl(baseurl: COpaquePointer?, referenceurl: COpaquePointer?, flags: UInt, heap: COpaquePointer?, resulturl: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCombineUrl((baseurl?.value ?: 0L), (referenceurl?.value ?: 0L), flags.toInt(), (heap?.value ?: 0L), (resulturl?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCopyError(source: COpaquePointer?, destination: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCopyError((source?.value ?: 0L), (destination?.value ?: 0L))

public actual fun wsCopyNode(writer: COpaquePointer?, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCopyNode((writer?.value ?: 0L), (reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateChannel(channeltype, channelbinding, (properties?.value ?: 0L), propertycount.toInt(), (securitydescription?.value ?: 0L), (channel?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateChannelForListener(listener: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateChannelForListener((listener?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (channel?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateError(properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateError((properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsCreateFaultFromError(error: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: COpaquePointer?, fault: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateFaultFromError((error?.value ?: 0L), faulterrorcode, faultdisclosure, (heap?.value ?: 0L), (fault?.value ?: 0L))

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateHeap(maxsize.toLong(), trimsize.toLong(), (properties?.value ?: 0L), propertycount.toInt(), (heap?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateListener(channeltype, channelbinding, (properties?.value ?: 0L), propertycount.toInt(), (securitydescription?.value ?: 0L), (listener?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateMessage(envelopeversion, addressingversion, (properties?.value ?: 0L), propertycount.toInt(), (message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateMessageForChannel(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateMessageForChannel((channel?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateMetadata(properties: COpaquePointer?, propertycount: UInt, metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateMetadata((properties?.value ?: 0L), propertycount.toInt(), (metadata?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateReader(properties: COpaquePointer?, propertycount: UInt, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateReader((properties?.value ?: 0L), propertycount.toInt(), (reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, addressurl: COpaquePointer?, contract: COpaquePointer?, authorizationcallback: WsServiceSecurityCallback, heap: COpaquePointer?, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceendpoint: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceEndpointFromTemplate(channeltype, (properties?.value ?: 0L), propertycount.toInt(), (addressurl?.value ?: 0L), (contract?.value ?: 0L), 0L, (heap?.value ?: 0L), templatetype, (templatevalue?.value ?: 0L), templatesize.toInt(), (templatedescription?.value ?: 0L), templatedescriptionsize.toInt(), (serviceendpoint?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateServiceHost(endpoints: COpaquePointer?, endpointcount: UShort, serviceproperties: COpaquePointer?, servicepropertycount: UInt, servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceHost((endpoints?.value ?: 0L), endpointcount.toShort(), (serviceproperties?.value ?: 0L), servicepropertycount.toInt(), (servicehost?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channelproperties: COpaquePointer?, channelpropertycount: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxy(channeltype, channelbinding, (securitydescription?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (channelproperties?.value ?: 0L), channelpropertycount.toInt(), (serviceproxy?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxyFromTemplate(channeltype, (properties?.value ?: 0L), propertycount.toInt(), templatetype, (templatevalue?.value ?: 0L), templatesize.toInt(), (templatedescription?.value ?: 0L), templatedescriptionsize.toInt(), (serviceproxy?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateWriter(properties: COpaquePointer?, propertycount: UInt, writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateWriter((properties?.value ?: 0L), propertycount.toInt(), (writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateXmlBuffer(heap: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, buffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateXmlBuffer((heap?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (buffer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsCreateXmlSecurityToken(tokenxml: COpaquePointer?, tokenkey: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsCreateXmlSecurityToken((tokenxml?.value ?: 0L), (tokenkey?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (token?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsDateTimeToFileTime(datetime: COpaquePointer?, filetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsDateTimeToFileTime((datetime?.value ?: 0L), (filetime?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsDecodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsDecodeUrl((url?.value ?: 0L), flags.toInt(), (heap?.value ?: 0L), (outurl?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsEncodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsEncodeUrl((url?.value ?: 0L), flags.toInt(), (heap?.value ?: 0L), (outurl?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsEndReaderCanonicalization(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsEndReaderCanonicalization((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsEndWriterCanonicalization(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsEndWriterCanonicalization((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFileTimeToDateTime(filetime: COpaquePointer?, datetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFileTimeToDateTime((filetime?.value ?: 0L), (datetime?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFillBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFillBody((message?.value ?: 0L), minsize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFillReader(reader: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFillReader((reader?.value ?: 0L), minsize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFindAttribute(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, required: Bool, attributeindex: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFindAttribute((reader?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), required, (attributeindex?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFlushBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFlushBody((message?.value ?: 0L), minsize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFlushWriter(writer: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFlushWriter((writer?.value ?: 0L), minsize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsFreeChannel(channel: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeChannel((channel?.value ?: 0L))
}

public actual fun wsFreeError(error: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeError((error?.value ?: 0L))
}

public actual fun wsFreeHeap(heap: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeHeap((heap?.value ?: 0L))
}

public actual fun wsFreeListener(listener: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeListener((listener?.value ?: 0L))
}

public actual fun wsFreeMessage(message: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeMessage((message?.value ?: 0L))
}

public actual fun wsFreeMetadata(metadata: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeMetadata((metadata?.value ?: 0L))
}

public actual fun wsFreeReader(reader: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeReader((reader?.value ?: 0L))
}

public actual fun wsFreeSecurityToken(token: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeSecurityToken((token?.value ?: 0L))
}

public actual fun wsFreeServiceHost(servicehost: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeServiceHost((servicehost?.value ?: 0L))
}

public actual fun wsFreeServiceProxy(serviceproxy: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeServiceProxy((serviceproxy?.value ?: 0L))
}

public actual fun wsFreeWriter(writer: COpaquePointer?) {
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsFreeWriter((writer?.value ?: 0L))
}

public actual fun wsGetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetChannelProperty((channel?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetCustomHeader(message: COpaquePointer?, customheaderdescription: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetCustomHeader((message?.value ?: 0L), (customheaderdescription?.value ?: 0L), repeatingoption, headerindex.toInt(), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (headerattributes?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetDictionary(encoding, (dictionary?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetErrorProperty((error?.value ?: 0L), id, (buffer?.value ?: 0L), buffersize.toInt())

public actual fun wsGetErrorString(error: COpaquePointer?, index: UInt, string: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetErrorString((error?.value ?: 0L), index.toInt(), (string?.value ?: 0L))

public actual fun wsGetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorDetail((error?.value ?: 0L), (faultdetaildescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt())

public actual fun wsGetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorProperty((error?.value ?: 0L), id, (buffer?.value ?: 0L), buffersize.toInt())

public actual fun wsGetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetHeader((message?.value ?: 0L), headertype, valuetype, readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetHeaderAttributes(message: COpaquePointer?, reader: COpaquePointer?, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetHeaderAttributes((message?.value ?: 0L), (reader?.value ?: 0L), (headerattributes?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetHeapProperty(heap: COpaquePointer?, id: WsHeapPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetHeapProperty((heap?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetListenerProperty((listener?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetMappedHeader((message?.value ?: 0L), (headername?.value ?: 0L), repeatingoption, headerindex.toInt(), valuetype, readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetMessageProperty((message?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetMetadataEndpoints(metadata: COpaquePointer?, endpoints: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetMetadataEndpoints((metadata?.value ?: 0L), (endpoints?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetMetadataProperty(metadata: COpaquePointer?, id: WsMetadataPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetMetadataProperty((metadata?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetMissingMetadataDocumentAddress(metadata: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetMissingMetadataDocumentAddress((metadata?.value ?: 0L), (address?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetNamespaceFromPrefix(reader: COpaquePointer?, prefix: COpaquePointer?, required: Bool, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetNamespaceFromPrefix((reader?.value ?: 0L), (prefix?.value ?: 0L), required, (ns?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetOperationContextProperty(context: COpaquePointer?, id: WsOperationContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetOperationContextProperty((context?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetPolicyAlternativeCount(policy: COpaquePointer?, count: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetPolicyAlternativeCount((policy?.value ?: 0L), (count?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetPolicyProperty(policy: COpaquePointer?, id: WsPolicyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetPolicyProperty((policy?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetPrefixFromNamespace(writer: COpaquePointer?, ns: COpaquePointer?, required: Bool, prefix: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetPrefixFromNamespace((writer?.value ?: 0L), (ns?.value ?: 0L), required, (prefix?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetReaderNode(xmlreader: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetReaderNode((xmlreader?.value ?: 0L), (node?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetReaderPosition((reader?.value ?: 0L), (nodeposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetReaderProperty(reader: COpaquePointer?, id: WsXmlReaderPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetReaderProperty((reader?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetSecurityContextProperty(securitycontext: COpaquePointer?, id: WsSecurityContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetSecurityContextProperty((securitycontext?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetSecurityTokenProperty(securitytoken: COpaquePointer?, id: WsSecurityTokenPropertyId, value: COpaquePointer?, valuesize: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetSecurityTokenProperty((securitytoken?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (heap?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetServiceHostProperty(servicehost: COpaquePointer?, id: WsServicePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetServiceHostProperty((servicehost?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetServiceProxyProperty(serviceproxy: COpaquePointer?, id: WsProxyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetServiceProxyProperty((serviceproxy?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetWriterPosition((writer?.value ?: 0L), (nodeposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsGetWriterProperty(writer: COpaquePointer?, id: WsXmlWriterPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetWriterProperty((writer?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsGetXmlAttribute(reader: COpaquePointer?, localname: COpaquePointer?, heap: COpaquePointer?, valuechars: COpaquePointer?, valuecharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsGetXmlAttribute((reader?.value ?: 0L), (localname?.value ?: 0L), (heap?.value ?: 0L), (valuechars?.value ?: 0L), (valuecharcount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsInitializeMessage(message: COpaquePointer?, initialization: WsMessageInitialization, sourcemessage: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsInitializeMessage((message?.value ?: 0L), initialization, (sourcemessage?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsMarkHeaderAsUnderstood(message: COpaquePointer?, headerposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsMarkHeaderAsUnderstood((message?.value ?: 0L), (headerposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsMatchPolicyAlternative(policy: COpaquePointer?, alternativeindex: UInt, policyconstraints: COpaquePointer?, matchrequired: Bool, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsMatchPolicyAlternative((policy?.value ?: 0L), alternativeindex.toInt(), (policyconstraints?.value ?: 0L), matchrequired, (heap?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsMoveReader(reader: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsMoveReader((reader?.value ?: 0L), moveto, (found?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsMoveWriter(writer: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsMoveWriter((writer?.value ?: 0L), moveto, (found?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsOpenChannel(channel: COpaquePointer?, endpointaddress: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsOpenChannel((channel?.value ?: 0L), (endpointaddress?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsOpenListener(listener: COpaquePointer?, url: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsOpenListener((listener?.value ?: 0L), (url?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsOpenServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsOpenServiceHost((servicehost?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsOpenServiceProxy(serviceproxy: COpaquePointer?, address: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsOpenServiceProxy((serviceproxy?.value ?: 0L), (address?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsPullBytes(writer: COpaquePointer?, callback: WsPullBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsPullBytes((writer?.value ?: 0L), 0L, (callbackstate?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsPushBytes(writer: COpaquePointer?, callback: WsPushBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsPushBytes((writer?.value ?: 0L), 0L, (callbackstate?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadArray(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadArray((reader?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), valuetype, (array?.value ?: 0L), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), (actualitemcount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadAttribute(reader: COpaquePointer?, attributedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadAttribute((reader?.value ?: 0L), (attributedescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadBody(message: COpaquePointer?, bodydescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadBody((message?.value ?: 0L), (bodydescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadBytes(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadBytes((reader?.value ?: 0L), (bytes?.value ?: 0L), maxbytecount.toInt(), (actualbytecount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadChars(reader: COpaquePointer?, chars: Pwstr, maxcharcount: UInt, actualcharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadChars((reader?.value ?: 0L), (chars?.value ?: 0L), maxcharcount.toInt(), (actualcharcount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadCharsUtf8(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadCharsUtf8((reader?.value ?: 0L), (bytes?.value ?: 0L), maxbytecount.toInt(), (actualbytecount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadElement(reader: COpaquePointer?, elementdescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadElement((reader?.value ?: 0L), (elementdescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadEndAttribute(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadEndAttribute((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadEndElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadEndElement((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadEndpointAddressExtension(reader: COpaquePointer?, endpointaddress: COpaquePointer?, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadEndpointAddressExtension((reader?.value ?: 0L), (endpointaddress?.value ?: 0L), extensiontype, readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeEnd((message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadEnvelopeStart(message: COpaquePointer?, reader: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeStart((message?.value ?: 0L), (reader?.value ?: 0L), 0L, (donecallbackstate?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadMessageEnd((channel?.value ?: 0L), (message?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadMessageStart((channel?.value ?: 0L), (message?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadMetadata(metadata: COpaquePointer?, reader: COpaquePointer?, url: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadMetadata((metadata?.value ?: 0L), (reader?.value ?: 0L), (url?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadNode((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadQualifiedName(reader: COpaquePointer?, heap: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadQualifiedName((reader?.value ?: 0L), (heap?.value ?: 0L), (prefix?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadStartAttribute(reader: COpaquePointer?, attributeindex: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadStartAttribute((reader?.value ?: 0L), attributeindex.toInt(), (error?.value ?: 0L))

public actual fun wsReadStartElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadStartElement((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadToStartElement(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadToStartElement((reader?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), (found?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadType(reader: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadType((reader?.value ?: 0L), typemapping, type, (typedescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadValue(reader: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadValue((reader?.value ?: 0L), valuetype, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsReadXmlBuffer(reader: COpaquePointer?, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadXmlBuffer((reader?.value ?: 0L), (heap?.value ?: 0L), (xmlbuffer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReadXmlBufferFromBytes(reader: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, bytes: COpaquePointer?, bytecount: UInt, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReadXmlBufferFromBytes((reader?.value ?: 0L), (encoding?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (bytes?.value ?: 0L), bytecount.toInt(), (heap?.value ?: 0L), (xmlbuffer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsReceiveMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescriptions: COpaquePointer?, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, index: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsReceiveMessage((channel?.value ?: 0L), (message?.value ?: 0L), (messagedescriptions?.value ?: 0L), messagedescriptioncount.toInt(), receiveoption, readbodyoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (index?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRegisterOperationForCancel(context: COpaquePointer?, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRegisterOperationForCancel((context?.value ?: 0L), 0L, 0L, (userstate?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRemoveCustomHeader(message: COpaquePointer?, headername: COpaquePointer?, headerns: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRemoveCustomHeader((message?.value ?: 0L), (headername?.value ?: 0L), (headerns?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRemoveHeader(message: COpaquePointer?, headertype: WsHeaderType, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRemoveHeader((message?.value ?: 0L), headertype, (error?.value ?: 0L))

public actual fun wsRemoveMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRemoveMappedHeader((message?.value ?: 0L), (headername?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRemoveNode(nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRemoveNode((nodeposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRequestReply(channel: COpaquePointer?, requestmessage: COpaquePointer?, requestmessagedescription: COpaquePointer?, writeoption: WsWriteOption, requestbodyvalue: COpaquePointer?, requestbodyvaluesize: UInt, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRequestReply((channel?.value ?: 0L), (requestmessage?.value ?: 0L), (requestmessagedescription?.value ?: 0L), writeoption, (requestbodyvalue?.value ?: 0L), requestbodyvaluesize.toInt(), (replymessage?.value ?: 0L), (replymessagedescription?.value ?: 0L), readoption, (heap?.value ?: 0L), (value?.value ?: 0L), valuesize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRequestSecurityToken(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRequestSecurityToken((channel?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (token?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetChannel((channel?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetError(error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetError((error?.value ?: 0L))

public actual fun wsResetHeap(heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetHeap((heap?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetListener((listener?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetMessage(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetMessage((message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetMetadata(metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetMetadata((metadata?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetServiceHost((servicehost?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsResetServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsResetServiceProxy((serviceproxy?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsRevokeSecurityContext(securitycontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsRevokeSecurityContext((securitycontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSendFaultMessageForError(channel: COpaquePointer?, replymessage: COpaquePointer?, faulterror: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSendFaultMessageForError((channel?.value ?: 0L), (replymessage?.value ?: 0L), (faulterror?.value ?: 0L), faulterrorcode, faultdisclosure, (requestmessage?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSendMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescription: COpaquePointer?, writeoption: WsWriteOption, bodyvalue: COpaquePointer?, bodyvaluesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSendMessage((channel?.value ?: 0L), (message?.value ?: 0L), (messagedescription?.value ?: 0L), writeoption, (bodyvalue?.value ?: 0L), bodyvaluesize.toInt(), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSendReplyMessage(channel: COpaquePointer?, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, writeoption: WsWriteOption, replybodyvalue: COpaquePointer?, replybodyvaluesize: UInt, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSendReplyMessage((channel?.value ?: 0L), (replymessage?.value ?: 0L), (replymessagedescription?.value ?: 0L), writeoption, (replybodyvalue?.value ?: 0L), replybodyvaluesize.toInt(), (requestmessage?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetChannelProperty((channel?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsSetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetErrorProperty((error?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt())

public actual fun wsSetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorDetail((error?.value ?: 0L), (faultdetaildescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt())

public actual fun wsSetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorProperty((error?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt())

public actual fun wsSetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetHeader((message?.value ?: 0L), headertype, valuetype, writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsSetInput(reader: COpaquePointer?, encoding: COpaquePointer?, input: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetInput((reader?.value ?: 0L), (encoding?.value ?: 0L), (input?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsSetInputToBuffer(reader: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetInputToBuffer((reader?.value ?: 0L), (buffer?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsSetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetListenerProperty((listener?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsSetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetMessageProperty((message?.value ?: 0L), id, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsSetOutput(writer: COpaquePointer?, encoding: COpaquePointer?, output: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetOutput((writer?.value ?: 0L), (encoding?.value ?: 0L), (output?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsSetOutputToBuffer(writer: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetOutputToBuffer((writer?.value ?: 0L), (buffer?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsSetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetReaderPosition((reader?.value ?: 0L), (nodeposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSetWriterPosition((writer?.value ?: 0L), (nodeposition?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsShutdownSessionChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsShutdownSessionChannel((channel?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsSkipNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsSkipNode((reader?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsStartReaderCanonicalization(reader: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsStartReaderCanonicalization((reader?.value ?: 0L), 0L, (writecallbackstate?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsStartWriterCanonicalization(writer: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsStartWriterCanonicalization((writer?.value ?: 0L), 0L, (writecallbackstate?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (error?.value ?: 0L))

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: COpaquePointer?, trimmedcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsTrimXmlWhitespace((chars?.value ?: 0L), charcount.toInt(), (trimmedchars?.value ?: 0L), (trimmedcount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsVerifyXmlNCName((ncnamechars?.value ?: 0L), ncnamecharcount.toInt(), (error?.value ?: 0L))

public actual fun wsWriteArray(writer: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteArray((writer?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), valuetype, (array?.value ?: 0L), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), (error?.value ?: 0L))

public actual fun wsWriteAttribute(writer: COpaquePointer?, attributedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteAttribute((writer?.value ?: 0L), (attributedescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsWriteBody(message: COpaquePointer?, bodydescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteBody((message?.value ?: 0L), (bodydescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsWriteBytes(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteBytes((writer?.value ?: 0L), (bytes?.value ?: 0L), bytecount.toInt(), (error?.value ?: 0L))

public actual fun wsWriteChars(writer: COpaquePointer?, chars: Pcwstr, charcount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteChars((writer?.value ?: 0L), (chars?.value ?: 0L), charcount.toInt(), (error?.value ?: 0L))

public actual fun wsWriteCharsUtf8(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteCharsUtf8((writer?.value ?: 0L), (bytes?.value ?: 0L), bytecount.toInt(), (error?.value ?: 0L))

public actual fun wsWriteElement(writer: COpaquePointer?, elementdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteElement((writer?.value ?: 0L), (elementdescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsWriteEndAttribute(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEndAttribute((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteEndCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEndCData((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteEndElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEndElement((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteEndStartElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEndStartElement((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeEnd((message?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteEnvelopeStart(message: COpaquePointer?, writer: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeStart((message?.value ?: 0L), (writer?.value ?: 0L), 0L, (donecallbackstate?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteMessageEnd((channel?.value ?: 0L), (message?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteMessageStart((channel?.value ?: 0L), (message?.value ?: 0L), (asynccontext?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteNode(writer: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteNode((writer?.value ?: 0L), (node?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteQualifiedName(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteQualifiedName((writer?.value ?: 0L), (prefix?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteStartAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteStartAttribute((writer?.value ?: 0L), (prefix?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), singlequote, (error?.value ?: 0L))

public actual fun wsWriteStartCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteStartCData((writer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteStartElement(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteStartElement((writer?.value ?: 0L), (prefix?.value ?: 0L), (localname?.value ?: 0L), (ns?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteText(writer: COpaquePointer?, text: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteText((writer?.value ?: 0L), (text?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteType(writer: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteType((writer?.value ?: 0L), typemapping, type, (typedescription?.value ?: 0L), writeoption, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsWriteValue(writer: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteValue((writer?.value ?: 0L), valuetype, (value?.value ?: 0L), valuesize.toInt(), (error?.value ?: 0L))

public actual fun wsWriteXmlBuffer(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBuffer((writer?.value ?: 0L), (xmlbuffer?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteXmlBufferToBytes(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, bytes: COpaquePointer?, bytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBufferToBytes((writer?.value ?: 0L), (xmlbuffer?.value ?: 0L), (encoding?.value ?: 0L), (properties?.value ?: 0L), propertycount.toInt(), (heap?.value ?: 0L), (bytes?.value ?: 0L), (bytecount?.value ?: 0L), (error?.value ?: 0L))

public actual fun wsWriteXmlnsAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlnsAttribute((writer?.value ?: 0L), (prefix?.value ?: 0L), (ns?.value ?: 0L), singlequote, (error?.value ?: 0L))

public actual fun wsXmlStringEquals(string1: COpaquePointer?, string2: COpaquePointer?, error: COpaquePointer?): Hresult =
    WindowsWin32NetworkingWindowswebservicesJniBridge.windowssys_windows_win32_networking_windowswebservices_wsXmlStringEquals((string1?.value ?: 0L), (string2?.value ?: 0L), (error?.value ?: 0L))
