@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorGetAssertion(hwnd.toCPointer<ByteVar>(), pwszrpid.toCPointer<ByteVar>(), pwebauthnclientdata.toCPointer<ByteVar>(), pwebauthngetassertionoptions.toCPointer<ByteVar>(), ppwebauthnassertion.toCPointer<ByteVar>())

public actual fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorMakeCredential(hwnd.toCPointer<ByteVar>(), prpinformation.toCPointer<ByteVar>(), puserinformation.toCPointer<ByteVar>(), ppubkeycredparams.toCPointer<ByteVar>(), pwebauthnclientdata.toCPointer<ByteVar>(), pwebauthnmakecredentialoptions.toCPointer<ByteVar>(), ppwebauthncredentialattestation.toCPointer<ByteVar>())

public actual fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNCancelCurrentOperation(pcancellationid.toCPointer<ByteVar>())

public actual fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNDeletePlatformCredential(cbcredentialid, pbcredentialid.toCPointer<ByteVar>())

public actual fun WebAuthNFreeAssertion(pwebauthnassertion: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeAssertion(pwebauthnassertion.toCPointer<ByteVar>())
}

public actual fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation.toCPointer<ByteVar>())
}

public actual fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreePlatformCredentialList(pcredentialdetailslist.toCPointer<ByteVar>())
}

public actual fun WebAuthNGetApiVersionNumber(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetApiVersionNumber()

public actual fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetCancellationId(pcancellationid.toCPointer<ByteVar>())

public actual fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetErrorName(hr)?.toLong() ?: 0L

public actual fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetPlatformCredentialList(pgetcredentialsoptions.toCPointer<ByteVar>(), ppcredentialdetailslist.toCPointer<ByteVar>())

public actual fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetW3CExceptionDOMError(hr)

public actual fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable.toCPointer<ByteVar>())

public actual fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbandonCall(serviceproxy.toCPointer<ByteVar>(), callid, error.toCPointer<ByteVar>())

public actual fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbandonMessage(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAbortChannel(channel: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbortChannel(channel.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAbortListener(listener: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbortListener(listener.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceHost(servicehost.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceProxy(serviceproxy.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAcceptChannel(listener.toCPointer<ByteVar>(), channel.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAddCustomHeader(message.toCPointer<ByteVar>(), headerdescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize, headerattributes, error.toCPointer<ByteVar>())

public actual fun WsAddErrorString(error: Long, string: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAddErrorString(error.toCPointer<ByteVar>(), string.toCPointer<ByteVar>())

public actual fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAddMappedHeader(message.toCPointer<ByteVar>(), headername.toCPointer<ByteVar>(), valuetype, writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAddressMessage(message.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAlloc(heap.toCPointer<ByteVar>(), size, ptr.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsAsyncExecute(asyncstate.toCPointer<ByteVar>(), operation.toLong().toCPointer<ByteVar>(), callbackmodel, callbackstate.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCall(serviceproxy.toCPointer<ByteVar>(), operation.toCPointer<ByteVar>(), arguments.toCPointer<ByteVar>(), heap.toCPointer<ByteVar>(), callproperties.toCPointer<ByteVar>(), callpropertycount, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCheckMustUnderstandHeaders(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCloseChannel(channel.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCloseListener(listener.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceHost(servicehost.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceProxy(serviceproxy.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCombineUrl(baseurl.toCPointer<ByteVar>(), referenceurl.toCPointer<ByteVar>(), flags, heap.toCPointer<ByteVar>(), resulturl.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCopyError(source: Long, destination: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCopyError(source.toCPointer<ByteVar>(), destination.toCPointer<ByteVar>())

public actual fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCopyNode(writer.toCPointer<ByteVar>(), reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateChannel(channeltype, channelbinding, properties.toCPointer<ByteVar>(), propertycount, securitydescription.toCPointer<ByteVar>(), channel.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateChannelForListener(listener.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, channel.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateError(properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateFaultFromError(error.toCPointer<ByteVar>(), faulterrorcode, faultdisclosure, heap.toCPointer<ByteVar>(), fault.toCPointer<ByteVar>())

public actual fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateHeap(maxsize, trimsize, properties.toCPointer<ByteVar>(), propertycount, heap.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateListener(channeltype, channelbinding, properties.toCPointer<ByteVar>(), propertycount, securitydescription.toCPointer<ByteVar>(), listener.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateMessage(envelopeversion, addressingversion, properties.toCPointer<ByteVar>(), propertycount, message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateMessageForChannel(channel.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateMetadata(properties.toCPointer<ByteVar>(), propertycount, metadata.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateReader(properties.toCPointer<ByteVar>(), propertycount, reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceEndpointFromTemplate(channeltype, properties.toCPointer<ByteVar>(), propertycount, addressurl.toCPointer<ByteVar>(), contract.toCPointer<ByteVar>(), authorizationcallback.toLong().toCPointer<ByteVar>(), heap.toCPointer<ByteVar>(), templatetype, templatevalue.toCPointer<ByteVar>(), templatesize, templatedescription.toCPointer<ByteVar>(), templatedescriptionsize, serviceendpoint.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceHost(endpoints.toCPointer<ByteVar>(), endpointcount, serviceproperties.toCPointer<ByteVar>(), servicepropertycount, servicehost.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxy(channeltype, channelbinding, securitydescription.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, channelproperties.toCPointer<ByteVar>(), channelpropertycount, serviceproxy.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxyFromTemplate(channeltype, properties.toCPointer<ByteVar>(), propertycount, templatetype, templatevalue.toCPointer<ByteVar>(), templatesize, templatedescription.toCPointer<ByteVar>(), templatedescriptionsize, serviceproxy.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateWriter(properties.toCPointer<ByteVar>(), propertycount, writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlBuffer(heap.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, buffer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlSecurityToken(tokenxml.toCPointer<ByteVar>(), tokenkey.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, token.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsDateTimeToFileTime(datetime.toCPointer<ByteVar>(), filetime.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsDecodeUrl(url.toCPointer<ByteVar>(), flags, heap.toCPointer<ByteVar>(), outurl.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsEncodeUrl(url.toCPointer<ByteVar>(), flags, heap.toCPointer<ByteVar>(), outurl.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsEndReaderCanonicalization(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsEndWriterCanonicalization(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFileTimeToDateTime(filetime.toCPointer<ByteVar>(), datetime.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFillBody(message.toCPointer<ByteVar>(), minsize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFillReader(reader.toCPointer<ByteVar>(), minsize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFindAttribute(reader.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), required, attributeindex.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFlushBody(message.toCPointer<ByteVar>(), minsize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFlushWriter(writer.toCPointer<ByteVar>(), minsize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsFreeChannel(channel: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeChannel(channel.toCPointer<ByteVar>())
}

public actual fun WsFreeError(error: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeError(error.toCPointer<ByteVar>())
}

public actual fun WsFreeHeap(heap: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeHeap(heap.toCPointer<ByteVar>())
}

public actual fun WsFreeListener(listener: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeListener(listener.toCPointer<ByteVar>())
}

public actual fun WsFreeMessage(message: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeMessage(message.toCPointer<ByteVar>())
}

public actual fun WsFreeMetadata(metadata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeMetadata(metadata.toCPointer<ByteVar>())
}

public actual fun WsFreeReader(reader: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeReader(reader.toCPointer<ByteVar>())
}

public actual fun WsFreeSecurityToken(token: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeSecurityToken(token.toCPointer<ByteVar>())
}

public actual fun WsFreeServiceHost(servicehost: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceHost(servicehost.toCPointer<ByteVar>())
}

public actual fun WsFreeServiceProxy(serviceproxy: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceProxy(serviceproxy.toCPointer<ByteVar>())
}

public actual fun WsFreeWriter(writer: Long) {
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsFreeWriter(writer.toCPointer<ByteVar>())
}

public actual fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetChannelProperty(channel.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetCustomHeader(message.toCPointer<ByteVar>(), customheaderdescription.toCPointer<ByteVar>(), repeatingoption, headerindex, readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, headerattributes.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetDictionary(encoding, dictionary.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetErrorProperty(error.toCPointer<ByteVar>(), id, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetErrorString(error.toCPointer<ByteVar>(), index, string.toCPointer<ByteVar>())

public actual fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorDetail(error.toCPointer<ByteVar>(), faultdetaildescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize)

public actual fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorProperty(error.toCPointer<ByteVar>(), id, buffer.toCPointer<ByteVar>(), buffersize)

public actual fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetHeader(message.toCPointer<ByteVar>(), headertype, valuetype, readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetHeaderAttributes(message.toCPointer<ByteVar>(), reader.toCPointer<ByteVar>(), headerattributes.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetHeapProperty(heap.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetListenerProperty(listener.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetMappedHeader(message.toCPointer<ByteVar>(), headername.toCPointer<ByteVar>(), repeatingoption, headerindex, valuetype, readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetMessageProperty(message.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataEndpoints(metadata.toCPointer<ByteVar>(), endpoints.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataProperty(metadata.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetMissingMetadataDocumentAddress(metadata.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetNamespaceFromPrefix(reader.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), required, ns.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetOperationContextProperty(context.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyAlternativeCount(policy.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyProperty(policy.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetPrefixFromNamespace(writer.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), required, prefix.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetReaderNode(xmlreader.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetReaderPosition(reader.toCPointer<ByteVar>(), nodeposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetReaderProperty(reader.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityContextProperty(securitycontext.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityTokenProperty(securitytoken.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, heap.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetServiceHostProperty(servicehost.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetServiceProxyProperty(serviceproxy.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetWriterPosition(writer.toCPointer<ByteVar>(), nodeposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetWriterProperty(writer.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsGetXmlAttribute(reader.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), heap.toCPointer<ByteVar>(), valuechars.toCPointer<ByteVar>(), valuecharcount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsInitializeMessage(message.toCPointer<ByteVar>(), initialization, sourcemessage.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsMarkHeaderAsUnderstood(message.toCPointer<ByteVar>(), headerposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsMatchPolicyAlternative(policy.toCPointer<ByteVar>(), alternativeindex, policyconstraints.toCPointer<ByteVar>(), matchrequired, heap.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsMoveReader(reader.toCPointer<ByteVar>(), moveto, found.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsMoveWriter(writer.toCPointer<ByteVar>(), moveto, found.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsOpenChannel(channel.toCPointer<ByteVar>(), endpointaddress.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsOpenListener(listener.toCPointer<ByteVar>(), url.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceHost(servicehost.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceProxy(serviceproxy.toCPointer<ByteVar>(), address.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsPullBytes(writer.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callbackstate.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsPushBytes(writer.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), callbackstate.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadArray(reader.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), valuetype, array.toCPointer<ByteVar>(), arraysize, itemoffset, itemcount, actualitemcount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadAttribute(reader.toCPointer<ByteVar>(), attributedescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadBody(message.toCPointer<ByteVar>(), bodydescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadBytes(reader.toCPointer<ByteVar>(), bytes.toCPointer<ByteVar>(), maxbytecount, actualbytecount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadChars(reader.toCPointer<ByteVar>(), chars.toCPointer<ByteVar>(), maxcharcount, actualcharcount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadCharsUtf8(reader.toCPointer<ByteVar>(), bytes.toCPointer<ByteVar>(), maxbytecount, actualbytecount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadElement(reader.toCPointer<ByteVar>(), elementdescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadEndAttribute(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadEndAttribute(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadEndElement(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadEndElement(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadEndpointAddressExtension(reader.toCPointer<ByteVar>(), endpointaddress.toCPointer<ByteVar>(), extensiontype, readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeEnd(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeStart(message.toCPointer<ByteVar>(), reader.toCPointer<ByteVar>(), donecallback.toLong().toCPointer<ByteVar>(), donecallbackstate.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadMessageEnd(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadMessageStart(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadMetadata(metadata.toCPointer<ByteVar>(), reader.toCPointer<ByteVar>(), url.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadNode(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadNode(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadQualifiedName(reader.toCPointer<ByteVar>(), heap.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadStartAttribute(reader.toCPointer<ByteVar>(), attributeindex, error.toCPointer<ByteVar>())

public actual fun WsReadStartElement(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadStartElement(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadToStartElement(reader.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), found.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadType(reader.toCPointer<ByteVar>(), typemapping, type, typedescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadValue(reader.toCPointer<ByteVar>(), valuetype, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBuffer(reader.toCPointer<ByteVar>(), heap.toCPointer<ByteVar>(), xmlbuffer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBufferFromBytes(reader.toCPointer<ByteVar>(), encoding.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, bytes.toCPointer<ByteVar>(), bytecount, heap.toCPointer<ByteVar>(), xmlbuffer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsReceiveMessage(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), messagedescriptions.toCPointer<ByteVar>(), messagedescriptioncount, receiveoption, readbodyoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, index.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRegisterOperationForCancel(context.toCPointer<ByteVar>(), cancelcallback.toLong().toCPointer<ByteVar>(), freestatecallback.toLong().toCPointer<ByteVar>(), userstate.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRemoveCustomHeader(message.toCPointer<ByteVar>(), headername.toCPointer<ByteVar>(), headerns.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRemoveHeader(message.toCPointer<ByteVar>(), headertype, error.toCPointer<ByteVar>())

public actual fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRemoveMappedHeader(message.toCPointer<ByteVar>(), headername.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRemoveNode(nodeposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRequestReply(channel.toCPointer<ByteVar>(), requestmessage.toCPointer<ByteVar>(), requestmessagedescription.toCPointer<ByteVar>(), writeoption, requestbodyvalue.toCPointer<ByteVar>(), requestbodyvaluesize, replymessage.toCPointer<ByteVar>(), replymessagedescription.toCPointer<ByteVar>(), readoption, heap.toCPointer<ByteVar>(), value.toCPointer<ByteVar>(), valuesize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRequestSecurityToken(channel.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, token.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetChannel(channel: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetChannel(channel.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetError(error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetError(error.toCPointer<ByteVar>())

public actual fun WsResetHeap(heap: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetHeap(heap.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetListener(listener: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetListener(listener.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetMessage(message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetMessage(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetMetadata(metadata: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetMetadata(metadata.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetServiceHost(servicehost.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsResetServiceProxy(serviceproxy.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsRevokeSecurityContext(securitycontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSendFaultMessageForError(channel.toCPointer<ByteVar>(), replymessage.toCPointer<ByteVar>(), faulterror.toCPointer<ByteVar>(), faulterrorcode, faultdisclosure, requestmessage.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSendMessage(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), messagedescription.toCPointer<ByteVar>(), writeoption, bodyvalue.toCPointer<ByteVar>(), bodyvaluesize, asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSendReplyMessage(channel.toCPointer<ByteVar>(), replymessage.toCPointer<ByteVar>(), replymessagedescription.toCPointer<ByteVar>(), writeoption, replybodyvalue.toCPointer<ByteVar>(), replybodyvaluesize, requestmessage.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetChannelProperty(channel.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetErrorProperty(error.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize)

public actual fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorDetail(error.toCPointer<ByteVar>(), faultdetaildescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize)

public actual fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorProperty(error.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize)

public actual fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetHeader(message.toCPointer<ByteVar>(), headertype, valuetype, writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetInput(reader.toCPointer<ByteVar>(), encoding.toCPointer<ByteVar>(), input.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetInputToBuffer(reader.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetListenerProperty(listener.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetMessageProperty(message.toCPointer<ByteVar>(), id, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetOutput(writer.toCPointer<ByteVar>(), encoding.toCPointer<ByteVar>(), output.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetOutputToBuffer(writer.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetReaderPosition(reader.toCPointer<ByteVar>(), nodeposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSetWriterPosition(writer.toCPointer<ByteVar>(), nodeposition.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsShutdownSessionChannel(channel.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsSkipNode(reader: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsSkipNode(reader.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsStartReaderCanonicalization(reader.toCPointer<ByteVar>(), writecallback.toLong().toCPointer<ByteVar>(), writecallbackstate.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsStartWriterCanonicalization(writer.toCPointer<ByteVar>(), writecallback.toLong().toCPointer<ByteVar>(), writecallbackstate.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, error.toCPointer<ByteVar>())

public actual fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsTrimXmlWhitespace(chars.toCPointer<ByteVar>(), charcount, trimmedchars.toCPointer<ByteVar>(), trimmedcount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsVerifyXmlNCName(ncnamechars.toCPointer<ByteVar>(), ncnamecharcount, error.toCPointer<ByteVar>())

public actual fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteArray(writer.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), valuetype, array.toCPointer<ByteVar>(), arraysize, itemoffset, itemcount, error.toCPointer<ByteVar>())

public actual fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteAttribute(writer.toCPointer<ByteVar>(), attributedescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteBody(message.toCPointer<ByteVar>(), bodydescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteBytes(writer.toCPointer<ByteVar>(), bytes.toCPointer<ByteVar>(), bytecount, error.toCPointer<ByteVar>())

public actual fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteChars(writer.toCPointer<ByteVar>(), chars.toCPointer<ByteVar>(), charcount, error.toCPointer<ByteVar>())

public actual fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteCharsUtf8(writer.toCPointer<ByteVar>(), bytes.toCPointer<ByteVar>(), bytecount, error.toCPointer<ByteVar>())

public actual fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteElement(writer.toCPointer<ByteVar>(), elementdescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEndAttribute(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteEndCData(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEndCData(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteEndElement(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEndElement(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEndStartElement(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeEnd(message.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeStart(message.toCPointer<ByteVar>(), writer.toCPointer<ByteVar>(), donecallback.toLong().toCPointer<ByteVar>(), donecallbackstate.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageEnd(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageStart(channel.toCPointer<ByteVar>(), message.toCPointer<ByteVar>(), asynccontext.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteNode(writer.toCPointer<ByteVar>(), node.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteQualifiedName(writer.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteStartAttribute(writer.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), singlequote, error.toCPointer<ByteVar>())

public actual fun WsWriteStartCData(writer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteStartCData(writer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteStartElement(writer.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), localname.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteText(writer.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteType(writer.toCPointer<ByteVar>(), typemapping, type, typedescription.toCPointer<ByteVar>(), writeoption, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteValue(writer.toCPointer<ByteVar>(), valuetype, value.toCPointer<ByteVar>(), valuesize, error.toCPointer<ByteVar>())

public actual fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBuffer(writer.toCPointer<ByteVar>(), xmlbuffer.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBufferToBytes(writer.toCPointer<ByteVar>(), xmlbuffer.toCPointer<ByteVar>(), encoding.toCPointer<ByteVar>(), properties.toCPointer<ByteVar>(), propertycount, heap.toCPointer<ByteVar>(), bytes.toCPointer<ByteVar>(), bytecount.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())

public actual fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlnsAttribute(writer.toCPointer<ByteVar>(), prefix.toCPointer<ByteVar>(), ns.toCPointer<ByteVar>(), singlequote, error.toCPointer<ByteVar>())

public actual fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices.cinterop.windowssys_windows_win32_networking_windowswebservices_WsXmlStringEquals(string1.toCPointer<ByteVar>(), string2.toCPointer<ByteVar>(), error.toCPointer<ByteVar>())
