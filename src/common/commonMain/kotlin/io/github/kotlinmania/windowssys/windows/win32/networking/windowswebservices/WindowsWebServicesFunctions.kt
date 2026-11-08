package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun interface FnCallback {
    public operator fun invoke(hr: HRESULT, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, next: Long, asynccontext: Long, error: Long): HRESULT
}

public fun interface FnCallback1 {
    public operator fun invoke(context: Long, authorized: Long, error: Long): HRESULT
}

public fun interface FnCallback2 {
    public operator fun invoke(callbackstate: Long, bytes: Long, maxsize: UInt, actualsize: Long, asynccontext: Long, error: Long): HRESULT
}

public fun interface FnCallback3 {
    public operator fun invoke(callbackstate: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, asynccontext: Long, error: Long): HRESULT
}

public fun interface FnCallback4 {
    public operator fun invoke(donecallbackstate: Long)
}

public fun interface FnCallback5 {
    public operator fun invoke(reason: WS_SERVICE_CANCEL_REASON, state: Long)
}

public fun interface FnCallback6 {
    public operator fun invoke(callbackstate: Long, buffers: Long, count: UInt, asynccontext: Long, error: Long): HRESULT
}

public fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNAuthenticatorGetAssertion", longArrayOf(hwnd, pwszrpid, pwebauthnclientdata, pwebauthngetassertionoptions, ppwebauthnassertion)).toInt()
}

public fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNAuthenticatorMakeCredential", longArrayOf(hwnd, prpinformation, puserinformation, ppubkeycredparams, pwebauthnclientdata, pwebauthnmakecredentialoptions, ppwebauthncredentialattestation)).toInt()
}

public fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNCancelCurrentOperation", longArrayOf(pcancellationid)).toInt()
}

public fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNDeletePlatformCredential", longArrayOf(cbcredentialid.toLong(), pbcredentialid)).toInt()
}

public fun WebAuthNFreeAssertion(pwebauthnassertion: Long) {
    Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNFreeAssertion", longArrayOf(pwebauthnassertion))
}

public fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long) {
    Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNFreeCredentialAttestation", longArrayOf(pwebauthncredentialattestation))
}

public fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long) {
    Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNFreePlatformCredentialList", longArrayOf(pcredentialdetailslist))
}

public fun WebAuthNGetApiVersionNumber(): UInt {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNGetApiVersionNumber", longArrayOf()).toUInt()
}

public fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNGetCancellationId", longArrayOf(pcancellationid)).toInt()
}

public fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNGetErrorName", longArrayOf(hr.toLong()))
}

public fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNGetPlatformCredentialList", longArrayOf(pgetcredentialsoptions, ppcredentialdetailslist)).toInt()
}

public fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNGetW3CExceptionDOMError", longArrayOf(hr.toLong())).toInt()
}

public fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT {
    return Win32DynamicFfi.invoke("webauthn.dll", "WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable", longArrayOf(pbisuserverifyingplatformauthenticatoravailable)).toInt()
}

public fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbandonCall", longArrayOf(serviceproxy, callid.toLong(), error)).toInt()
}

public fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbandonMessage", longArrayOf(channel, message, error)).toInt()
}

public fun WsAbortChannel(channel: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbortChannel", longArrayOf(channel, error)).toInt()
}

public fun WsAbortListener(listener: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbortListener", longArrayOf(listener, error)).toInt()
}

public fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbortServiceHost", longArrayOf(servicehost, error)).toInt()
}

public fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAbortServiceProxy", longArrayOf(serviceproxy, error)).toInt()
}

public fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAcceptChannel", longArrayOf(listener, channel, asynccontext, error)).toInt()
}

public fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAddCustomHeader", longArrayOf(message, headerdescription, writeoption.toLong(), value, valuesize.toLong(), headerattributes.toLong(), error)).toInt()
}

public fun WsAddErrorString(error: Long, string: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAddErrorString", longArrayOf(error, string)).toInt()
}

public fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAddMappedHeader", longArrayOf(message, headername, valuetype.toLong(), writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAddressMessage", longArrayOf(message, address, error)).toInt()
}

public fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAlloc", longArrayOf(heap, size.toLong(), ptr, error)).toInt()
}

public fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsAsyncExecute", longArrayOf(asyncstate, Win32DynamicFfi.objectSlot(operation), callbackmodel.toLong(), callbackstate, asynccontext, error)).toInt()
}

public fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCall", longArrayOf(serviceproxy, operation, arguments, heap, callproperties, callpropertycount.toLong(), asynccontext, error)).toInt()
}

public fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCheckMustUnderstandHeaders", longArrayOf(message, error)).toInt()
}

public fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCloseChannel", longArrayOf(channel, asynccontext, error)).toInt()
}

public fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCloseListener", longArrayOf(listener, asynccontext, error)).toInt()
}

public fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCloseServiceHost", longArrayOf(servicehost, asynccontext, error)).toInt()
}

public fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCloseServiceProxy", longArrayOf(serviceproxy, asynccontext, error)).toInt()
}

public fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCombineUrl", longArrayOf(baseurl, referenceurl, flags.toLong(), heap, resulturl, error)).toInt()
}

public fun WsCopyError(source: Long, destination: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCopyError", longArrayOf(source, destination)).toInt()
}

public fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCopyNode", longArrayOf(writer, reader, error)).toInt()
}

public fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateChannel", longArrayOf(channeltype.toLong(), channelbinding.toLong(), properties, propertycount.toLong(), securitydescription, channel, error)).toInt()
}

public fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateChannelForListener", longArrayOf(listener, properties, propertycount.toLong(), channel, error)).toInt()
}

public fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateError", longArrayOf(properties, propertycount.toLong(), error)).toInt()
}

public fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateFaultFromError", longArrayOf(error, faulterrorcode.toLong(), faultdisclosure.toLong(), heap, fault)).toInt()
}

public fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateHeap", longArrayOf(maxsize.toLong(), trimsize.toLong(), properties, propertycount.toLong(), heap, error)).toInt()
}

public fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateListener", longArrayOf(channeltype.toLong(), channelbinding.toLong(), properties, propertycount.toLong(), securitydescription, listener, error)).toInt()
}

public fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateMessage", longArrayOf(envelopeversion.toLong(), addressingversion.toLong(), properties, propertycount.toLong(), message, error)).toInt()
}

public fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateMessageForChannel", longArrayOf(channel, properties, propertycount.toLong(), message, error)).toInt()
}

public fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateMetadata", longArrayOf(properties, propertycount.toLong(), metadata, error)).toInt()
}

public fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateReader", longArrayOf(properties, propertycount.toLong(), reader, error)).toInt()
}

public fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateServiceEndpointFromTemplate", longArrayOf(channeltype.toLong(), properties, propertycount.toLong(), addressurl, contract, Win32DynamicFfi.objectSlot(authorizationcallback), heap, templatetype.toLong(), templatevalue, templatesize.toLong(), templatedescription, templatedescriptionsize.toLong(), serviceendpoint, error)).toInt()
}

public fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateServiceHost", longArrayOf(endpoints, endpointcount.toLong(), serviceproperties, servicepropertycount.toLong(), servicehost, error)).toInt()
}

public fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateServiceProxy", longArrayOf(channeltype.toLong(), channelbinding.toLong(), securitydescription, properties, propertycount.toLong(), channelproperties, channelpropertycount.toLong(), serviceproxy, error)).toInt()
}

public fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateServiceProxyFromTemplate", longArrayOf(channeltype.toLong(), properties, propertycount.toLong(), templatetype.toLong(), templatevalue, templatesize.toLong(), templatedescription, templatedescriptionsize.toLong(), serviceproxy, error)).toInt()
}

public fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateWriter", longArrayOf(properties, propertycount.toLong(), writer, error)).toInt()
}

public fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateXmlBuffer", longArrayOf(heap, properties, propertycount.toLong(), buffer, error)).toInt()
}

public fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsCreateXmlSecurityToken", longArrayOf(tokenxml, tokenkey, properties, propertycount.toLong(), token, error)).toInt()
}

public fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsDateTimeToFileTime", longArrayOf(datetime, filetime, error)).toInt()
}

public fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsDecodeUrl", longArrayOf(url, flags.toLong(), heap, outurl, error)).toInt()
}

public fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsEncodeUrl", longArrayOf(url, flags.toLong(), heap, outurl, error)).toInt()
}

public fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsEndReaderCanonicalization", longArrayOf(reader, error)).toInt()
}

public fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsEndWriterCanonicalization", longArrayOf(writer, error)).toInt()
}

public fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFileTimeToDateTime", longArrayOf(filetime, datetime, error)).toInt()
}

public fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFillBody", longArrayOf(message, minsize.toLong(), asynccontext, error)).toInt()
}

public fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFillReader", longArrayOf(reader, minsize.toLong(), asynccontext, error)).toInt()
}

public fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFindAttribute", longArrayOf(reader, localname, ns, required.toLong(), attributeindex, error)).toInt()
}

public fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFlushBody", longArrayOf(message, minsize.toLong(), asynccontext, error)).toInt()
}

public fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsFlushWriter", longArrayOf(writer, minsize.toLong(), asynccontext, error)).toInt()
}

public fun WsFreeChannel(channel: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeChannel", longArrayOf(channel))
}

public fun WsFreeError(error: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeError", longArrayOf(error))
}

public fun WsFreeHeap(heap: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeHeap", longArrayOf(heap))
}

public fun WsFreeListener(listener: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeListener", longArrayOf(listener))
}

public fun WsFreeMessage(message: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeMessage", longArrayOf(message))
}

public fun WsFreeMetadata(metadata: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeMetadata", longArrayOf(metadata))
}

public fun WsFreeReader(reader: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeReader", longArrayOf(reader))
}

public fun WsFreeSecurityToken(token: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeSecurityToken", longArrayOf(token))
}

public fun WsFreeServiceHost(servicehost: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeServiceHost", longArrayOf(servicehost))
}

public fun WsFreeServiceProxy(serviceproxy: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeServiceProxy", longArrayOf(serviceproxy))
}

public fun WsFreeWriter(writer: Long) {
    Win32DynamicFfi.invoke("webservices.dll", "WsFreeWriter", longArrayOf(writer))
}

public fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetChannelProperty", longArrayOf(channel, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetCustomHeader", longArrayOf(message, customheaderdescription, repeatingoption.toLong(), headerindex.toLong(), readoption.toLong(), heap, value, valuesize.toLong(), headerattributes, error)).toInt()
}

public fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetDictionary", longArrayOf(encoding.toLong(), dictionary, error)).toInt()
}

public fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetErrorProperty", longArrayOf(error, id.toLong(), buffer, buffersize.toLong())).toInt()
}

public fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetErrorString", longArrayOf(error, index.toLong(), string)).toInt()
}

public fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetFaultErrorDetail", longArrayOf(error, faultdetaildescription, readoption.toLong(), heap, value, valuesize.toLong())).toInt()
}

public fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetFaultErrorProperty", longArrayOf(error, id.toLong(), buffer, buffersize.toLong())).toInt()
}

public fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetHeader", longArrayOf(message, headertype.toLong(), valuetype.toLong(), readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetHeaderAttributes", longArrayOf(message, reader, headerattributes, error)).toInt()
}

public fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetHeapProperty", longArrayOf(heap, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetListenerProperty", longArrayOf(listener, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetMappedHeader", longArrayOf(message, headername, repeatingoption.toLong(), headerindex.toLong(), valuetype.toLong(), readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetMessageProperty", longArrayOf(message, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetMetadataEndpoints", longArrayOf(metadata, endpoints, error)).toInt()
}

public fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetMetadataProperty", longArrayOf(metadata, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetMissingMetadataDocumentAddress", longArrayOf(metadata, address, error)).toInt()
}

public fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetNamespaceFromPrefix", longArrayOf(reader, prefix, required.toLong(), ns, error)).toInt()
}

public fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetOperationContextProperty", longArrayOf(context, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetPolicyAlternativeCount", longArrayOf(policy, count, error)).toInt()
}

public fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetPolicyProperty", longArrayOf(policy, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetPrefixFromNamespace", longArrayOf(writer, ns, required.toLong(), prefix, error)).toInt()
}

public fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetReaderNode", longArrayOf(xmlreader, node, error)).toInt()
}

public fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetReaderPosition", longArrayOf(reader, nodeposition, error)).toInt()
}

public fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetReaderProperty", longArrayOf(reader, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetSecurityContextProperty", longArrayOf(securitycontext, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetSecurityTokenProperty", longArrayOf(securitytoken, id.toLong(), value, valuesize.toLong(), heap, error)).toInt()
}

public fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetServiceHostProperty", longArrayOf(servicehost, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetServiceProxyProperty", longArrayOf(serviceproxy, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetWriterPosition", longArrayOf(writer, nodeposition, error)).toInt()
}

public fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetWriterProperty", longArrayOf(writer, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsGetXmlAttribute", longArrayOf(reader, localname, heap, valuechars, valuecharcount, error)).toInt()
}

public fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsInitializeMessage", longArrayOf(message, initialization.toLong(), sourcemessage, error)).toInt()
}

public fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsMarkHeaderAsUnderstood", longArrayOf(message, headerposition, error)).toInt()
}

public fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsMatchPolicyAlternative", longArrayOf(policy, alternativeindex.toLong(), policyconstraints, matchrequired.toLong(), heap, error)).toInt()
}

public fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsMoveReader", longArrayOf(reader, moveto.toLong(), found, error)).toInt()
}

public fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsMoveWriter", longArrayOf(writer, moveto.toLong(), found, error)).toInt()
}

public fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsOpenChannel", longArrayOf(channel, endpointaddress, asynccontext, error)).toInt()
}

public fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsOpenListener", longArrayOf(listener, url, asynccontext, error)).toInt()
}

public fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsOpenServiceHost", longArrayOf(servicehost, asynccontext, error)).toInt()
}

public fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsOpenServiceProxy", longArrayOf(serviceproxy, address, asynccontext, error)).toInt()
}

public fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsPullBytes", longArrayOf(writer, Win32DynamicFfi.objectSlot(callback), callbackstate, error)).toInt()
}

public fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsPushBytes", longArrayOf(writer, Win32DynamicFfi.objectSlot(callback), callbackstate, error)).toInt()
}

public fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadArray", longArrayOf(reader, localname, ns, valuetype.toLong(), array, arraysize.toLong(), itemoffset.toLong(), itemcount.toLong(), actualitemcount, error)).toInt()
}

public fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadAttribute", longArrayOf(reader, attributedescription, readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadBody", longArrayOf(message, bodydescription, readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadBytes", longArrayOf(reader, bytes, maxbytecount.toLong(), actualbytecount, error)).toInt()
}

public fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadChars", longArrayOf(reader, chars, maxcharcount.toLong(), actualcharcount, error)).toInt()
}

public fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadCharsUtf8", longArrayOf(reader, bytes, maxbytecount.toLong(), actualbytecount, error)).toInt()
}

public fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadElement", longArrayOf(reader, elementdescription, readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsReadEndAttribute(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadEndAttribute", longArrayOf(reader, error)).toInt()
}

public fun WsReadEndElement(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadEndElement", longArrayOf(reader, error)).toInt()
}

public fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadEndpointAddressExtension", longArrayOf(reader, endpointaddress, extensiontype.toLong(), readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadEnvelopeEnd", longArrayOf(message, error)).toInt()
}

public fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadEnvelopeStart", longArrayOf(message, reader, Win32DynamicFfi.objectSlot(donecallback), donecallbackstate, error)).toInt()
}

public fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadMessageEnd", longArrayOf(channel, message, asynccontext, error)).toInt()
}

public fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadMessageStart", longArrayOf(channel, message, asynccontext, error)).toInt()
}

public fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadMetadata", longArrayOf(metadata, reader, url, error)).toInt()
}

public fun WsReadNode(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadNode", longArrayOf(reader, error)).toInt()
}

public fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadQualifiedName", longArrayOf(reader, heap, prefix, localname, ns, error)).toInt()
}

public fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadStartAttribute", longArrayOf(reader, attributeindex.toLong(), error)).toInt()
}

public fun WsReadStartElement(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadStartElement", longArrayOf(reader, error)).toInt()
}

public fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadToStartElement", longArrayOf(reader, localname, ns, found, error)).toInt()
}

public fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadType", longArrayOf(reader, typemapping.toLong(), type.toLong(), typedescription, readoption.toLong(), heap, value, valuesize.toLong(), error)).toInt()
}

public fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadValue", longArrayOf(reader, valuetype.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadXmlBuffer", longArrayOf(reader, heap, xmlbuffer, error)).toInt()
}

public fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReadXmlBufferFromBytes", longArrayOf(reader, encoding, properties, propertycount.toLong(), bytes, bytecount.toLong(), heap, xmlbuffer, error)).toInt()
}

public fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsReceiveMessage", longArrayOf(channel, message, messagedescriptions, messagedescriptioncount.toLong(), receiveoption.toLong(), readbodyoption.toLong(), heap, value, valuesize.toLong(), index, asynccontext, error)).toInt()
}

public fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRegisterOperationForCancel", longArrayOf(context, Win32DynamicFfi.objectSlot(cancelcallback), Win32DynamicFfi.objectSlot(freestatecallback), userstate, error)).toInt()
}

public fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRemoveCustomHeader", longArrayOf(message, headername, headerns, error)).toInt()
}

public fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRemoveHeader", longArrayOf(message, headertype.toLong(), error)).toInt()
}

public fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRemoveMappedHeader", longArrayOf(message, headername, error)).toInt()
}

public fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRemoveNode", longArrayOf(nodeposition, error)).toInt()
}

public fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRequestReply", longArrayOf(channel, requestmessage, requestmessagedescription, writeoption.toLong(), requestbodyvalue, requestbodyvaluesize.toLong(), replymessage, replymessagedescription, readoption.toLong(), heap, value, valuesize.toLong(), asynccontext, error)).toInt()
}

public fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRequestSecurityToken", longArrayOf(channel, properties, propertycount.toLong(), token, asynccontext, error)).toInt()
}

public fun WsResetChannel(channel: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetChannel", longArrayOf(channel, error)).toInt()
}

public fun WsResetError(error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetError", longArrayOf(error)).toInt()
}

public fun WsResetHeap(heap: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetHeap", longArrayOf(heap, error)).toInt()
}

public fun WsResetListener(listener: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetListener", longArrayOf(listener, error)).toInt()
}

public fun WsResetMessage(message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetMessage", longArrayOf(message, error)).toInt()
}

public fun WsResetMetadata(metadata: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetMetadata", longArrayOf(metadata, error)).toInt()
}

public fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetServiceHost", longArrayOf(servicehost, error)).toInt()
}

public fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsResetServiceProxy", longArrayOf(serviceproxy, error)).toInt()
}

public fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsRevokeSecurityContext", longArrayOf(securitycontext, error)).toInt()
}

public fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSendFaultMessageForError", longArrayOf(channel, replymessage, faulterror, faulterrorcode.toLong(), faultdisclosure.toLong(), requestmessage, asynccontext, error)).toInt()
}

public fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSendMessage", longArrayOf(channel, message, messagedescription, writeoption.toLong(), bodyvalue, bodyvaluesize.toLong(), asynccontext, error)).toInt()
}

public fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSendReplyMessage", longArrayOf(channel, replymessage, replymessagedescription, writeoption.toLong(), replybodyvalue, replybodyvaluesize.toLong(), requestmessage, asynccontext, error)).toInt()
}

public fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetChannelProperty", longArrayOf(channel, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetErrorProperty", longArrayOf(error, id.toLong(), value, valuesize.toLong())).toInt()
}

public fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetFaultErrorDetail", longArrayOf(error, faultdetaildescription, writeoption.toLong(), value, valuesize.toLong())).toInt()
}

public fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetFaultErrorProperty", longArrayOf(error, id.toLong(), value, valuesize.toLong())).toInt()
}

public fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetHeader", longArrayOf(message, headertype.toLong(), valuetype.toLong(), writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetInput", longArrayOf(reader, encoding, input, properties, propertycount.toLong(), error)).toInt()
}

public fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetInputToBuffer", longArrayOf(reader, buffer, properties, propertycount.toLong(), error)).toInt()
}

public fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetListenerProperty", longArrayOf(listener, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetMessageProperty", longArrayOf(message, id.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetOutput", longArrayOf(writer, encoding, output, properties, propertycount.toLong(), error)).toInt()
}

public fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetOutputToBuffer", longArrayOf(writer, buffer, properties, propertycount.toLong(), error)).toInt()
}

public fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetReaderPosition", longArrayOf(reader, nodeposition, error)).toInt()
}

public fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSetWriterPosition", longArrayOf(writer, nodeposition, error)).toInt()
}

public fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsShutdownSessionChannel", longArrayOf(channel, asynccontext, error)).toInt()
}

public fun WsSkipNode(reader: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsSkipNode", longArrayOf(reader, error)).toInt()
}

public fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsStartReaderCanonicalization", longArrayOf(reader, Win32DynamicFfi.objectSlot(writecallback), writecallbackstate, properties, propertycount.toLong(), error)).toInt()
}

public fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsStartWriterCanonicalization", longArrayOf(writer, Win32DynamicFfi.objectSlot(writecallback), writecallbackstate, properties, propertycount.toLong(), error)).toInt()
}

public fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsTrimXmlWhitespace", longArrayOf(chars, charcount.toLong(), trimmedchars, trimmedcount, error)).toInt()
}

public fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsVerifyXmlNCName", longArrayOf(ncnamechars, ncnamecharcount.toLong(), error)).toInt()
}

public fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteArray", longArrayOf(writer, localname, ns, valuetype.toLong(), array, arraysize.toLong(), itemoffset.toLong(), itemcount.toLong(), error)).toInt()
}

public fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteAttribute", longArrayOf(writer, attributedescription, writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteBody", longArrayOf(message, bodydescription, writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteBytes", longArrayOf(writer, bytes, bytecount.toLong(), error)).toInt()
}

public fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteChars", longArrayOf(writer, chars, charcount.toLong(), error)).toInt()
}

public fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteCharsUtf8", longArrayOf(writer, bytes, bytecount.toLong(), error)).toInt()
}

public fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteElement", longArrayOf(writer, elementdescription, writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEndAttribute", longArrayOf(writer, error)).toInt()
}

public fun WsWriteEndCData(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEndCData", longArrayOf(writer, error)).toInt()
}

public fun WsWriteEndElement(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEndElement", longArrayOf(writer, error)).toInt()
}

public fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEndStartElement", longArrayOf(writer, error)).toInt()
}

public fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEnvelopeEnd", longArrayOf(message, error)).toInt()
}

public fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteEnvelopeStart", longArrayOf(message, writer, Win32DynamicFfi.objectSlot(donecallback), donecallbackstate, error)).toInt()
}

public fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteMessageEnd", longArrayOf(channel, message, asynccontext, error)).toInt()
}

public fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteMessageStart", longArrayOf(channel, message, asynccontext, error)).toInt()
}

public fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteNode", longArrayOf(writer, node, error)).toInt()
}

public fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteQualifiedName", longArrayOf(writer, prefix, localname, ns, error)).toInt()
}

public fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteStartAttribute", longArrayOf(writer, prefix, localname, ns, singlequote.toLong(), error)).toInt()
}

public fun WsWriteStartCData(writer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteStartCData", longArrayOf(writer, error)).toInt()
}

public fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteStartElement", longArrayOf(writer, prefix, localname, ns, error)).toInt()
}

public fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteText", longArrayOf(writer, text, error)).toInt()
}

public fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteType", longArrayOf(writer, typemapping.toLong(), type.toLong(), typedescription, writeoption.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteValue", longArrayOf(writer, valuetype.toLong(), value, valuesize.toLong(), error)).toInt()
}

public fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteXmlBuffer", longArrayOf(writer, xmlbuffer, error)).toInt()
}

public fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteXmlBufferToBytes", longArrayOf(writer, xmlbuffer, encoding, properties, propertycount.toLong(), heap, bytes, bytecount, error)).toInt()
}

public fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsWriteXmlnsAttribute", longArrayOf(writer, prefix, ns, singlequote.toLong(), error)).toInt()
}

public fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT {
    return Win32DynamicFfi.invoke("webservices.dll", "WsXmlStringEquals", longArrayOf(string1, string2, error)).toInt()
}
