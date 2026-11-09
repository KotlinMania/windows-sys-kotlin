@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32NetworkingWindowswebservicesNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun WebAuthNAuthenticatorGetAssertion(hwnd: HWND, pwszrpid: PCWSTR, pwebauthnclientdata: Long, pwebauthngetassertionoptions: Long, ppwebauthnassertion: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorGetAssertion(hwnd.toString(), pwszrpid.toString(), pwebauthnclientdata.toString(), pwebauthngetassertionoptions.toString(), ppwebauthnassertion.toString()) as Int) else 0

public actual fun WebAuthNAuthenticatorMakeCredential(hwnd: HWND, prpinformation: Long, puserinformation: Long, ppubkeycredparams: Long, pwebauthnclientdata: Long, pwebauthnmakecredentialoptions: Long, ppwebauthncredentialattestation: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNAuthenticatorMakeCredential(hwnd.toString(), prpinformation.toString(), puserinformation.toString(), ppubkeycredparams.toString(), pwebauthnclientdata.toString(), pwebauthnmakecredentialoptions.toString(), ppwebauthncredentialattestation.toString()) as Int) else 0

public actual fun WebAuthNCancelCurrentOperation(pcancellationid: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNCancelCurrentOperation(pcancellationid.toString()) as Int) else 0

public actual fun WebAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNDeletePlatformCredential(cbcredentialid.toInt(), pbcredentialid.toString()) as Int) else 0

public actual fun WebAuthNFreeAssertion(pwebauthnassertion: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeAssertion(pwebauthnassertion.toString())
    }
}

public actual fun WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreeCredentialAttestation(pwebauthncredentialattestation.toString())
    }
}

public actual fun WebAuthNFreePlatformCredentialList(pcredentialdetailslist: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNFreePlatformCredentialList(pcredentialdetailslist.toString())
    }
}

public actual fun WebAuthNGetApiVersionNumber(): UInt =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetApiVersionNumber() as Int).toUInt() else 0u

public actual fun WebAuthNGetCancellationId(pcancellationid: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetCancellationId(pcancellationid.toString()) as Int) else 0

public actual fun WebAuthNGetErrorName(hr: HRESULT): PCWSTR =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetErrorName(hr) as String).toLong() else 0L

public actual fun WebAuthNGetPlatformCredentialList(pgetcredentialsoptions: Long, ppcredentialdetailslist: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetPlatformCredentialList(pgetcredentialsoptions.toString(), ppcredentialdetailslist.toString()) as Int) else 0

public actual fun WebAuthNGetW3CExceptionDOMError(hr: HRESULT): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNGetW3CExceptionDOMError(hr) as Int) else 0

public actual fun WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable.toString()) as Int) else 0

public actual fun WsAbandonCall(serviceproxy: Long, callid: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbandonCall(serviceproxy.toString(), callid.toInt(), error.toString()) as Int) else 0

public actual fun WsAbandonMessage(channel: Long, message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbandonMessage(channel.toString(), message.toString(), error.toString()) as Int) else 0

public actual fun WsAbortChannel(channel: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbortChannel(channel.toString(), error.toString()) as Int) else 0

public actual fun WsAbortListener(listener: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbortListener(listener.toString(), error.toString()) as Int) else 0

public actual fun WsAbortServiceHost(servicehost: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceHost(servicehost.toString(), error.toString()) as Int) else 0

public actual fun WsAbortServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAbortServiceProxy(serviceproxy.toString(), error.toString()) as Int) else 0

public actual fun WsAcceptChannel(listener: Long, channel: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAcceptChannel(listener.toString(), channel.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsAddCustomHeader(message: Long, headerdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, headerattributes: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAddCustomHeader(message.toString(), headerdescription.toString(), writeoption, value.toString(), valuesize.toInt(), headerattributes.toInt(), error.toString()) as Int) else 0

public actual fun WsAddErrorString(error: Long, string: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAddErrorString(error.toString(), string.toString()) as Int) else 0

public actual fun WsAddMappedHeader(message: Long, headername: Long, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAddMappedHeader(message.toString(), headername.toString(), valuetype, writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsAddressMessage(message: Long, address: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAddressMessage(message.toString(), address.toString(), error.toString()) as Int) else 0

public actual fun WsAlloc(heap: Long, size: ULong, ptr: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAlloc(heap.toString(), size.toString(), ptr.toString(), error.toString()) as Int) else 0

public actual fun WsAsyncExecute(asyncstate: Long, operation: WS_ASYNC_FUNCTION, callbackmodel: WS_CALLBACK_MODEL, callbackstate: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsAsyncExecute(asyncstate.toString(), operation.toLong().toString(), callbackmodel, callbackstate.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCall(serviceproxy: Long, operation: Long, arguments: Long, heap: Long, callproperties: Long, callpropertycount: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCall(serviceproxy.toString(), operation.toString(), arguments.toString(), heap.toString(), callproperties.toString(), callpropertycount.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCheckMustUnderstandHeaders(message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCheckMustUnderstandHeaders(message.toString(), error.toString()) as Int) else 0

public actual fun WsCloseChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCloseChannel(channel.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCloseListener(listener: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCloseListener(listener.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCloseServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceHost(servicehost.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCloseServiceProxy(serviceproxy: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCloseServiceProxy(serviceproxy.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsCombineUrl(baseurl: Long, referenceurl: Long, flags: UInt, heap: Long, resulturl: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCombineUrl(baseurl.toString(), referenceurl.toString(), flags.toInt(), heap.toString(), resulturl.toString(), error.toString()) as Int) else 0

public actual fun WsCopyError(source: Long, destination: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCopyError(source.toString(), destination.toString()) as Int) else 0

public actual fun WsCopyNode(writer: Long, reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCopyNode(writer.toString(), reader.toString(), error.toString()) as Int) else 0

public actual fun WsCreateChannel(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, channel: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateChannel(channeltype, channelbinding, properties.toString(), propertycount.toInt(), securitydescription.toString(), channel.toString(), error.toString()) as Int) else 0

public actual fun WsCreateChannelForListener(listener: Long, properties: Long, propertycount: UInt, channel: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateChannelForListener(listener.toString(), properties.toString(), propertycount.toInt(), channel.toString(), error.toString()) as Int) else 0

public actual fun WsCreateError(properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateError(properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsCreateFaultFromError(error: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, heap: Long, fault: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateFaultFromError(error.toString(), faulterrorcode, faultdisclosure, heap.toString(), fault.toString()) as Int) else 0

public actual fun WsCreateHeap(maxsize: ULong, trimsize: ULong, properties: Long, propertycount: UInt, heap: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateHeap(maxsize.toString(), trimsize.toString(), properties.toString(), propertycount.toInt(), heap.toString(), error.toString()) as Int) else 0

public actual fun WsCreateListener(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, properties: Long, propertycount: UInt, securitydescription: Long, listener: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateListener(channeltype, channelbinding, properties.toString(), propertycount.toInt(), securitydescription.toString(), listener.toString(), error.toString()) as Int) else 0

public actual fun WsCreateMessage(envelopeversion: WS_ENVELOPE_VERSION, addressingversion: WS_ADDRESSING_VERSION, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateMessage(envelopeversion, addressingversion, properties.toString(), propertycount.toInt(), message.toString(), error.toString()) as Int) else 0

public actual fun WsCreateMessageForChannel(channel: Long, properties: Long, propertycount: UInt, message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateMessageForChannel(channel.toString(), properties.toString(), propertycount.toInt(), message.toString(), error.toString()) as Int) else 0

public actual fun WsCreateMetadata(properties: Long, propertycount: UInt, metadata: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateMetadata(properties.toString(), propertycount.toInt(), metadata.toString(), error.toString()) as Int) else 0

public actual fun WsCreateReader(properties: Long, propertycount: UInt, reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateReader(properties.toString(), propertycount.toInt(), reader.toString(), error.toString()) as Int) else 0

public actual fun WsCreateServiceEndpointFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, addressurl: Long, contract: Long, authorizationcallback: WS_SERVICE_SECURITY_CALLBACK, heap: Long, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceendpoint: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceEndpointFromTemplate(channeltype, properties.toString(), propertycount.toInt(), addressurl.toString(), contract.toString(), authorizationcallback.toLong().toString(), heap.toString(), templatetype, templatevalue.toString(), templatesize.toInt(), templatedescription.toString(), templatedescriptionsize.toInt(), serviceendpoint.toString(), error.toString()) as Int) else 0

public actual fun WsCreateServiceHost(endpoints: Long, endpointcount: UShort, serviceproperties: Long, servicepropertycount: UInt, servicehost: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceHost(endpoints.toString(), endpointcount.toInt(), serviceproperties.toString(), servicepropertycount.toInt(), servicehost.toString(), error.toString()) as Int) else 0

public actual fun WsCreateServiceProxy(channeltype: WS_CHANNEL_TYPE, channelbinding: WS_CHANNEL_BINDING, securitydescription: Long, properties: Long, propertycount: UInt, channelproperties: Long, channelpropertycount: UInt, serviceproxy: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxy(channeltype, channelbinding, securitydescription.toString(), properties.toString(), propertycount.toInt(), channelproperties.toString(), channelpropertycount.toInt(), serviceproxy.toString(), error.toString()) as Int) else 0

public actual fun WsCreateServiceProxyFromTemplate(channeltype: WS_CHANNEL_TYPE, properties: Long, propertycount: UInt, templatetype: WS_BINDING_TEMPLATE_TYPE, templatevalue: Long, templatesize: UInt, templatedescription: Long, templatedescriptionsize: UInt, serviceproxy: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateServiceProxyFromTemplate(channeltype, properties.toString(), propertycount.toInt(), templatetype, templatevalue.toString(), templatesize.toInt(), templatedescription.toString(), templatedescriptionsize.toInt(), serviceproxy.toString(), error.toString()) as Int) else 0

public actual fun WsCreateWriter(properties: Long, propertycount: UInt, writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateWriter(properties.toString(), propertycount.toInt(), writer.toString(), error.toString()) as Int) else 0

public actual fun WsCreateXmlBuffer(heap: Long, properties: Long, propertycount: UInt, buffer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlBuffer(heap.toString(), properties.toString(), propertycount.toInt(), buffer.toString(), error.toString()) as Int) else 0

public actual fun WsCreateXmlSecurityToken(tokenxml: Long, tokenkey: Long, properties: Long, propertycount: UInt, token: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsCreateXmlSecurityToken(tokenxml.toString(), tokenkey.toString(), properties.toString(), propertycount.toInt(), token.toString(), error.toString()) as Int) else 0

public actual fun WsDateTimeToFileTime(datetime: Long, filetime: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsDateTimeToFileTime(datetime.toString(), filetime.toString(), error.toString()) as Int) else 0

public actual fun WsDecodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsDecodeUrl(url.toString(), flags.toInt(), heap.toString(), outurl.toString(), error.toString()) as Int) else 0

public actual fun WsEncodeUrl(url: Long, flags: UInt, heap: Long, outurl: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsEncodeUrl(url.toString(), flags.toInt(), heap.toString(), outurl.toString(), error.toString()) as Int) else 0

public actual fun WsEndReaderCanonicalization(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsEndReaderCanonicalization(reader.toString(), error.toString()) as Int) else 0

public actual fun WsEndWriterCanonicalization(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsEndWriterCanonicalization(writer.toString(), error.toString()) as Int) else 0

public actual fun WsFileTimeToDateTime(filetime: Long, datetime: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFileTimeToDateTime(filetime.toString(), datetime.toString(), error.toString()) as Int) else 0

public actual fun WsFillBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFillBody(message.toString(), minsize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsFillReader(reader: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFillReader(reader.toString(), minsize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsFindAttribute(reader: Long, localname: Long, ns: Long, required: BOOL, attributeindex: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFindAttribute(reader.toString(), localname.toString(), ns.toString(), required, attributeindex.toString(), error.toString()) as Int) else 0

public actual fun WsFlushBody(message: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFlushBody(message.toString(), minsize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsFlushWriter(writer: Long, minsize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFlushWriter(writer.toString(), minsize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsFreeChannel(channel: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeChannel(channel.toString())
    }
}

public actual fun WsFreeError(error: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeError(error.toString())
    }
}

public actual fun WsFreeHeap(heap: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeHeap(heap.toString())
    }
}

public actual fun WsFreeListener(listener: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeListener(listener.toString())
    }
}

public actual fun WsFreeMessage(message: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeMessage(message.toString())
    }
}

public actual fun WsFreeMetadata(metadata: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeMetadata(metadata.toString())
    }
}

public actual fun WsFreeReader(reader: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeReader(reader.toString())
    }
}

public actual fun WsFreeSecurityToken(token: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeSecurityToken(token.toString())
    }
}

public actual fun WsFreeServiceHost(servicehost: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceHost(servicehost.toString())
    }
}

public actual fun WsFreeServiceProxy(serviceproxy: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeServiceProxy(serviceproxy.toString())
    }
}

public actual fun WsFreeWriter(writer: Long) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsFreeWriter(writer.toString())
    }
}

public actual fun WsGetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetChannelProperty(channel.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetCustomHeader(message: Long, customheaderdescription: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, headerattributes: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetCustomHeader(message.toString(), customheaderdescription.toString(), repeatingoption, headerindex.toInt(), readoption, heap.toString(), value.toString(), valuesize.toInt(), headerattributes.toString(), error.toString()) as Int) else 0

public actual fun WsGetDictionary(encoding: WS_ENCODING, dictionary: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetDictionary(encoding, dictionary.toString(), error.toString()) as Int) else 0

public actual fun WsGetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetErrorProperty(error.toString(), id, buffer.toString(), buffersize.toInt()) as Int) else 0

public actual fun WsGetErrorString(error: Long, index: UInt, string: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetErrorString(error.toString(), index.toInt(), string.toString()) as Int) else 0

public actual fun WsGetFaultErrorDetail(error: Long, faultdetaildescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorDetail(error.toString(), faultdetaildescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt()) as Int) else 0

public actual fun WsGetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, buffer: Long, buffersize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetFaultErrorProperty(error.toString(), id, buffer.toString(), buffersize.toInt()) as Int) else 0

public actual fun WsGetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetHeader(message.toString(), headertype, valuetype, readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetHeaderAttributes(message: Long, reader: Long, headerattributes: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetHeaderAttributes(message.toString(), reader.toString(), headerattributes.toString(), error.toString()) as Int) else 0

public actual fun WsGetHeapProperty(heap: Long, id: WS_HEAP_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetHeapProperty(heap.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetListenerProperty(listener.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetMappedHeader(message: Long, headername: Long, repeatingoption: WS_REPEATING_HEADER_OPTION, headerindex: UInt, valuetype: WS_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetMappedHeader(message.toString(), headername.toString(), repeatingoption, headerindex.toInt(), valuetype, readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetMessageProperty(message.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetMetadataEndpoints(metadata: Long, endpoints: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataEndpoints(metadata.toString(), endpoints.toString(), error.toString()) as Int) else 0

public actual fun WsGetMetadataProperty(metadata: Long, id: WS_METADATA_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetMetadataProperty(metadata.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetMissingMetadataDocumentAddress(metadata: Long, address: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetMissingMetadataDocumentAddress(metadata.toString(), address.toString(), error.toString()) as Int) else 0

public actual fun WsGetNamespaceFromPrefix(reader: Long, prefix: Long, required: BOOL, ns: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetNamespaceFromPrefix(reader.toString(), prefix.toString(), required, ns.toString(), error.toString()) as Int) else 0

public actual fun WsGetOperationContextProperty(context: Long, id: WS_OPERATION_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetOperationContextProperty(context.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetPolicyAlternativeCount(policy: Long, count: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyAlternativeCount(policy.toString(), count.toString(), error.toString()) as Int) else 0

public actual fun WsGetPolicyProperty(policy: Long, id: WS_POLICY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetPolicyProperty(policy.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetPrefixFromNamespace(writer: Long, ns: Long, required: BOOL, prefix: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetPrefixFromNamespace(writer.toString(), ns.toString(), required, prefix.toString(), error.toString()) as Int) else 0

public actual fun WsGetReaderNode(xmlreader: Long, node: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetReaderNode(xmlreader.toString(), node.toString(), error.toString()) as Int) else 0

public actual fun WsGetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetReaderPosition(reader.toString(), nodeposition.toString(), error.toString()) as Int) else 0

public actual fun WsGetReaderProperty(reader: Long, id: WS_XML_READER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetReaderProperty(reader.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetSecurityContextProperty(securitycontext: Long, id: WS_SECURITY_CONTEXT_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityContextProperty(securitycontext.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetSecurityTokenProperty(securitytoken: Long, id: WS_SECURITY_TOKEN_PROPERTY_ID, value: Long, valuesize: UInt, heap: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetSecurityTokenProperty(securitytoken.toString(), id, value.toString(), valuesize.toInt(), heap.toString(), error.toString()) as Int) else 0

public actual fun WsGetServiceHostProperty(servicehost: Long, id: WS_SERVICE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetServiceHostProperty(servicehost.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetServiceProxyProperty(serviceproxy: Long, id: WS_PROXY_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetServiceProxyProperty(serviceproxy.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetWriterPosition(writer.toString(), nodeposition.toString(), error.toString()) as Int) else 0

public actual fun WsGetWriterProperty(writer: Long, id: WS_XML_WRITER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetWriterProperty(writer.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsGetXmlAttribute(reader: Long, localname: Long, heap: Long, valuechars: Long, valuecharcount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsGetXmlAttribute(reader.toString(), localname.toString(), heap.toString(), valuechars.toString(), valuecharcount.toString(), error.toString()) as Int) else 0

public actual fun WsInitializeMessage(message: Long, initialization: WS_MESSAGE_INITIALIZATION, sourcemessage: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsInitializeMessage(message.toString(), initialization, sourcemessage.toString(), error.toString()) as Int) else 0

public actual fun WsMarkHeaderAsUnderstood(message: Long, headerposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsMarkHeaderAsUnderstood(message.toString(), headerposition.toString(), error.toString()) as Int) else 0

public actual fun WsMatchPolicyAlternative(policy: Long, alternativeindex: UInt, policyconstraints: Long, matchrequired: BOOL, heap: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsMatchPolicyAlternative(policy.toString(), alternativeindex.toInt(), policyconstraints.toString(), matchrequired, heap.toString(), error.toString()) as Int) else 0

public actual fun WsMoveReader(reader: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsMoveReader(reader.toString(), moveto, found.toString(), error.toString()) as Int) else 0

public actual fun WsMoveWriter(writer: Long, moveto: WS_MOVE_TO, found: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsMoveWriter(writer.toString(), moveto, found.toString(), error.toString()) as Int) else 0

public actual fun WsOpenChannel(channel: Long, endpointaddress: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsOpenChannel(channel.toString(), endpointaddress.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsOpenListener(listener: Long, url: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsOpenListener(listener.toString(), url.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsOpenServiceHost(servicehost: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceHost(servicehost.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsOpenServiceProxy(serviceproxy: Long, address: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsOpenServiceProxy(serviceproxy.toString(), address.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsPullBytes(writer: Long, callback: WS_PULL_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsPullBytes(writer.toString(), callback.toLong().toString(), callbackstate.toString(), error.toString()) as Int) else 0

public actual fun WsPushBytes(writer: Long, callback: WS_PUSH_BYTES_CALLBACK, callbackstate: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsPushBytes(writer.toString(), callback.toLong().toString(), callbackstate.toString(), error.toString()) as Int) else 0

public actual fun WsReadArray(reader: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadArray(reader.toString(), localname.toString(), ns.toString(), valuetype, array.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), actualitemcount.toString(), error.toString()) as Int) else 0

public actual fun WsReadAttribute(reader: Long, attributedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadAttribute(reader.toString(), attributedescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadBody(message: Long, bodydescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadBody(message.toString(), bodydescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadBytes(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadBytes(reader.toString(), bytes.toString(), maxbytecount.toInt(), actualbytecount.toString(), error.toString()) as Int) else 0

public actual fun WsReadChars(reader: Long, chars: PWSTR, maxcharcount: UInt, actualcharcount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadChars(reader.toString(), chars.toString(), maxcharcount.toInt(), actualcharcount.toString(), error.toString()) as Int) else 0

public actual fun WsReadCharsUtf8(reader: Long, bytes: Long, maxbytecount: UInt, actualbytecount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadCharsUtf8(reader.toString(), bytes.toString(), maxbytecount.toInt(), actualbytecount.toString(), error.toString()) as Int) else 0

public actual fun WsReadElement(reader: Long, elementdescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadElement(reader.toString(), elementdescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadEndAttribute(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadEndAttribute(reader.toString(), error.toString()) as Int) else 0

public actual fun WsReadEndElement(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadEndElement(reader.toString(), error.toString()) as Int) else 0

public actual fun WsReadEndpointAddressExtension(reader: Long, endpointaddress: Long, extensiontype: WS_ENDPOINT_ADDRESS_EXTENSION_TYPE, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadEndpointAddressExtension(reader.toString(), endpointaddress.toString(), extensiontype, readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadEnvelopeEnd(message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeEnd(message.toString(), error.toString()) as Int) else 0

public actual fun WsReadEnvelopeStart(message: Long, reader: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadEnvelopeStart(message.toString(), reader.toString(), donecallback.toLong().toString(), donecallbackstate.toString(), error.toString()) as Int) else 0

public actual fun WsReadMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadMessageEnd(channel.toString(), message.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsReadMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadMessageStart(channel.toString(), message.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsReadMetadata(metadata: Long, reader: Long, url: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadMetadata(metadata.toString(), reader.toString(), url.toString(), error.toString()) as Int) else 0

public actual fun WsReadNode(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadNode(reader.toString(), error.toString()) as Int) else 0

public actual fun WsReadQualifiedName(reader: Long, heap: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadQualifiedName(reader.toString(), heap.toString(), prefix.toString(), localname.toString(), ns.toString(), error.toString()) as Int) else 0

public actual fun WsReadStartAttribute(reader: Long, attributeindex: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadStartAttribute(reader.toString(), attributeindex.toInt(), error.toString()) as Int) else 0

public actual fun WsReadStartElement(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadStartElement(reader.toString(), error.toString()) as Int) else 0

public actual fun WsReadToStartElement(reader: Long, localname: Long, ns: Long, found: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadToStartElement(reader.toString(), localname.toString(), ns.toString(), found.toString(), error.toString()) as Int) else 0

public actual fun WsReadType(reader: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadType(reader.toString(), typemapping, type, typedescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadValue(reader: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadValue(reader.toString(), valuetype, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsReadXmlBuffer(reader: Long, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBuffer(reader.toString(), heap.toString(), xmlbuffer.toString(), error.toString()) as Int) else 0

public actual fun WsReadXmlBufferFromBytes(reader: Long, encoding: Long, properties: Long, propertycount: UInt, bytes: Long, bytecount: UInt, heap: Long, xmlbuffer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReadXmlBufferFromBytes(reader.toString(), encoding.toString(), properties.toString(), propertycount.toInt(), bytes.toString(), bytecount.toInt(), heap.toString(), xmlbuffer.toString(), error.toString()) as Int) else 0

public actual fun WsReceiveMessage(channel: Long, message: Long, messagedescriptions: Long, messagedescriptioncount: UInt, receiveoption: WS_RECEIVE_OPTION, readbodyoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, index: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsReceiveMessage(channel.toString(), message.toString(), messagedescriptions.toString(), messagedescriptioncount.toInt(), receiveoption, readbodyoption, heap.toString(), value.toString(), valuesize.toInt(), index.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsRegisterOperationForCancel(context: Long, cancelcallback: WS_OPERATION_CANCEL_CALLBACK, freestatecallback: WS_OPERATION_FREE_STATE_CALLBACK, userstate: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRegisterOperationForCancel(context.toString(), cancelcallback.toLong().toString(), freestatecallback.toLong().toString(), userstate.toString(), error.toString()) as Int) else 0

public actual fun WsRemoveCustomHeader(message: Long, headername: Long, headerns: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRemoveCustomHeader(message.toString(), headername.toString(), headerns.toString(), error.toString()) as Int) else 0

public actual fun WsRemoveHeader(message: Long, headertype: WS_HEADER_TYPE, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRemoveHeader(message.toString(), headertype, error.toString()) as Int) else 0

public actual fun WsRemoveMappedHeader(message: Long, headername: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRemoveMappedHeader(message.toString(), headername.toString(), error.toString()) as Int) else 0

public actual fun WsRemoveNode(nodeposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRemoveNode(nodeposition.toString(), error.toString()) as Int) else 0

public actual fun WsRequestReply(channel: Long, requestmessage: Long, requestmessagedescription: Long, writeoption: WS_WRITE_OPTION, requestbodyvalue: Long, requestbodyvaluesize: UInt, replymessage: Long, replymessagedescription: Long, readoption: WS_READ_OPTION, heap: Long, value: Long, valuesize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRequestReply(channel.toString(), requestmessage.toString(), requestmessagedescription.toString(), writeoption, requestbodyvalue.toString(), requestbodyvaluesize.toInt(), replymessage.toString(), replymessagedescription.toString(), readoption, heap.toString(), value.toString(), valuesize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsRequestSecurityToken(channel: Long, properties: Long, propertycount: UInt, token: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRequestSecurityToken(channel.toString(), properties.toString(), propertycount.toInt(), token.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsResetChannel(channel: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetChannel(channel.toString(), error.toString()) as Int) else 0

public actual fun WsResetError(error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetError(error.toString()) as Int) else 0

public actual fun WsResetHeap(heap: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetHeap(heap.toString(), error.toString()) as Int) else 0

public actual fun WsResetListener(listener: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetListener(listener.toString(), error.toString()) as Int) else 0

public actual fun WsResetMessage(message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetMessage(message.toString(), error.toString()) as Int) else 0

public actual fun WsResetMetadata(metadata: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetMetadata(metadata.toString(), error.toString()) as Int) else 0

public actual fun WsResetServiceHost(servicehost: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetServiceHost(servicehost.toString(), error.toString()) as Int) else 0

public actual fun WsResetServiceProxy(serviceproxy: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsResetServiceProxy(serviceproxy.toString(), error.toString()) as Int) else 0

public actual fun WsRevokeSecurityContext(securitycontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsRevokeSecurityContext(securitycontext.toString(), error.toString()) as Int) else 0

public actual fun WsSendFaultMessageForError(channel: Long, replymessage: Long, faulterror: Long, faulterrorcode: HRESULT, faultdisclosure: WS_FAULT_DISCLOSURE, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSendFaultMessageForError(channel.toString(), replymessage.toString(), faulterror.toString(), faulterrorcode, faultdisclosure, requestmessage.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsSendMessage(channel: Long, message: Long, messagedescription: Long, writeoption: WS_WRITE_OPTION, bodyvalue: Long, bodyvaluesize: UInt, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSendMessage(channel.toString(), message.toString(), messagedescription.toString(), writeoption, bodyvalue.toString(), bodyvaluesize.toInt(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsSendReplyMessage(channel: Long, replymessage: Long, replymessagedescription: Long, writeoption: WS_WRITE_OPTION, replybodyvalue: Long, replybodyvaluesize: UInt, requestmessage: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSendReplyMessage(channel.toString(), replymessage.toString(), replymessagedescription.toString(), writeoption, replybodyvalue.toString(), replybodyvaluesize.toInt(), requestmessage.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsSetChannelProperty(channel: Long, id: WS_CHANNEL_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetChannelProperty(channel.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsSetErrorProperty(error: Long, id: WS_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetErrorProperty(error.toString(), id, value.toString(), valuesize.toInt()) as Int) else 0

public actual fun WsSetFaultErrorDetail(error: Long, faultdetaildescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorDetail(error.toString(), faultdetaildescription.toString(), writeoption, value.toString(), valuesize.toInt()) as Int) else 0

public actual fun WsSetFaultErrorProperty(error: Long, id: WS_FAULT_ERROR_PROPERTY_ID, value: Long, valuesize: UInt): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetFaultErrorProperty(error.toString(), id, value.toString(), valuesize.toInt()) as Int) else 0

public actual fun WsSetHeader(message: Long, headertype: WS_HEADER_TYPE, valuetype: WS_TYPE, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetHeader(message.toString(), headertype, valuetype, writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsSetInput(reader: Long, encoding: Long, input: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetInput(reader.toString(), encoding.toString(), input.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsSetInputToBuffer(reader: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetInputToBuffer(reader.toString(), buffer.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsSetListenerProperty(listener: Long, id: WS_LISTENER_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetListenerProperty(listener.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsSetMessageProperty(message: Long, id: WS_MESSAGE_PROPERTY_ID, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetMessageProperty(message.toString(), id, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsSetOutput(writer: Long, encoding: Long, output: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetOutput(writer.toString(), encoding.toString(), output.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsSetOutputToBuffer(writer: Long, buffer: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetOutputToBuffer(writer.toString(), buffer.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsSetReaderPosition(reader: Long, nodeposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetReaderPosition(reader.toString(), nodeposition.toString(), error.toString()) as Int) else 0

public actual fun WsSetWriterPosition(writer: Long, nodeposition: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSetWriterPosition(writer.toString(), nodeposition.toString(), error.toString()) as Int) else 0

public actual fun WsShutdownSessionChannel(channel: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsShutdownSessionChannel(channel.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsSkipNode(reader: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsSkipNode(reader.toString(), error.toString()) as Int) else 0

public actual fun WsStartReaderCanonicalization(reader: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsStartReaderCanonicalization(reader.toString(), writecallback.toLong().toString(), writecallbackstate.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsStartWriterCanonicalization(writer: Long, writecallback: WS_WRITE_CALLBACK, writecallbackstate: Long, properties: Long, propertycount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsStartWriterCanonicalization(writer.toString(), writecallback.toLong().toString(), writecallbackstate.toString(), properties.toString(), propertycount.toInt(), error.toString()) as Int) else 0

public actual fun WsTrimXmlWhitespace(chars: PCWSTR, charcount: UInt, trimmedchars: Long, trimmedcount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsTrimXmlWhitespace(chars.toString(), charcount.toInt(), trimmedchars.toString(), trimmedcount.toString(), error.toString()) as Int) else 0

public actual fun WsVerifyXmlNCName(ncnamechars: PCWSTR, ncnamecharcount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsVerifyXmlNCName(ncnamechars.toString(), ncnamecharcount.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteArray(writer: Long, localname: Long, ns: Long, valuetype: WS_VALUE_TYPE, array: Long, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteArray(writer.toString(), localname.toString(), ns.toString(), valuetype, array.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteAttribute(writer: Long, attributedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteAttribute(writer.toString(), attributedescription.toString(), writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteBody(message: Long, bodydescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteBody(message.toString(), bodydescription.toString(), writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteBytes(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteBytes(writer.toString(), bytes.toString(), bytecount.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteChars(writer: Long, chars: PCWSTR, charcount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteChars(writer.toString(), chars.toString(), charcount.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteCharsUtf8(writer: Long, bytes: Long, bytecount: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteCharsUtf8(writer.toString(), bytes.toString(), bytecount.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteElement(writer: Long, elementdescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteElement(writer.toString(), elementdescription.toString(), writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteEndAttribute(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEndAttribute(writer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteEndCData(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEndCData(writer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteEndElement(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEndElement(writer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteEndStartElement(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEndStartElement(writer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteEnvelopeEnd(message: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeEnd(message.toString(), error.toString()) as Int) else 0

public actual fun WsWriteEnvelopeStart(message: Long, writer: Long, donecallback: WS_MESSAGE_DONE_CALLBACK, donecallbackstate: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteEnvelopeStart(message.toString(), writer.toString(), donecallback.toLong().toString(), donecallbackstate.toString(), error.toString()) as Int) else 0

public actual fun WsWriteMessageEnd(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageEnd(channel.toString(), message.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsWriteMessageStart(channel: Long, message: Long, asynccontext: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteMessageStart(channel.toString(), message.toString(), asynccontext.toString(), error.toString()) as Int) else 0

public actual fun WsWriteNode(writer: Long, node: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteNode(writer.toString(), node.toString(), error.toString()) as Int) else 0

public actual fun WsWriteQualifiedName(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteQualifiedName(writer.toString(), prefix.toString(), localname.toString(), ns.toString(), error.toString()) as Int) else 0

public actual fun WsWriteStartAttribute(writer: Long, prefix: Long, localname: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteStartAttribute(writer.toString(), prefix.toString(), localname.toString(), ns.toString(), singlequote, error.toString()) as Int) else 0

public actual fun WsWriteStartCData(writer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteStartCData(writer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteStartElement(writer: Long, prefix: Long, localname: Long, ns: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteStartElement(writer.toString(), prefix.toString(), localname.toString(), ns.toString(), error.toString()) as Int) else 0

public actual fun WsWriteText(writer: Long, text: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteText(writer.toString(), text.toString(), error.toString()) as Int) else 0

public actual fun WsWriteType(writer: Long, typemapping: WS_TYPE_MAPPING, type: WS_TYPE, typedescription: Long, writeoption: WS_WRITE_OPTION, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteType(writer.toString(), typemapping, type, typedescription.toString(), writeoption, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteValue(writer: Long, valuetype: WS_VALUE_TYPE, value: Long, valuesize: UInt, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteValue(writer.toString(), valuetype, value.toString(), valuesize.toInt(), error.toString()) as Int) else 0

public actual fun WsWriteXmlBuffer(writer: Long, xmlbuffer: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBuffer(writer.toString(), xmlbuffer.toString(), error.toString()) as Int) else 0

public actual fun WsWriteXmlBufferToBytes(writer: Long, xmlbuffer: Long, encoding: Long, properties: Long, propertycount: UInt, heap: Long, bytes: Long, bytecount: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlBufferToBytes(writer.toString(), xmlbuffer.toString(), encoding.toString(), properties.toString(), propertycount.toInt(), heap.toString(), bytes.toString(), bytecount.toString(), error.toString()) as Int) else 0

public actual fun WsWriteXmlnsAttribute(writer: Long, prefix: Long, ns: Long, singlequote: BOOL, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsWriteXmlnsAttribute(writer.toString(), prefix.toString(), ns.toString(), singlequote, error.toString()) as Int) else 0

public actual fun WsXmlStringEquals(string1: Long, string2: Long, error: Long): HRESULT =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_WsXmlStringEquals(string1.toString(), string2.toString(), error.toString()) as Int) else 0
