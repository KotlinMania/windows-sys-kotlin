@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32NetworkingWindowswebservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: COpaquePointer?, pwebauthngetassertionoptions: COpaquePointer?, ppwebauthnassertion: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorGetAssertion((hwnd?.value ?: 0L).toString(), (pwszrpid?.value ?: 0L).toString(), (pwebauthnclientdata?.value ?: 0L).toString(), (pwebauthngetassertionoptions?.value ?: 0L).toString(), (ppwebauthnassertion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: COpaquePointer?, puserinformation: COpaquePointer?, ppubkeycredparams: COpaquePointer?, pwebauthnclientdata: COpaquePointer?, pwebauthnmakecredentialoptions: COpaquePointer?, ppwebauthncredentialattestation: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNAuthenticatorMakeCredential((hwnd?.value ?: 0L).toString(), (prpinformation?.value ?: 0L).toString(), (puserinformation?.value ?: 0L).toString(), (ppubkeycredparams?.value ?: 0L).toString(), (pwebauthnclientdata?.value ?: 0L).toString(), (pwebauthnmakecredentialoptions?.value ?: 0L).toString(), (ppwebauthncredentialattestation?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNCancelCurrentOperation((pcancellationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNDeletePlatformCredential(cbcredentialid.toInt(), (pbcredentialid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNFreeAssertion((pwebauthnassertion?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNFreeCredentialAttestation((pwebauthncredentialattestation?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNFreePlatformCredentialList((pcredentialdetailslist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNGetApiVersionNumber(): UInt =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNGetApiVersionNumber() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetCancellationId(pcancellationid: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNGetCancellationId((pcancellationid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNGetErrorName(hr) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: COpaquePointer?, ppcredentialdetailslist: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNGetPlatformCredentialList((pgetcredentialsoptions?.value ?: 0L).toString(), (ppcredentialdetailslist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNGetW3CExceptionDOMError(hr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_webAuthNIsUserVerifyingPlatformAuthenticatorAvailable((pbisuserverifyingplatformauthenticatoravailable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonCall(serviceproxy: COpaquePointer?, callid: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbandonCall((serviceproxy?.value ?: 0L).toString(), callid.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonMessage(channel: COpaquePointer?, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbandonMessage((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbortChannel((channel?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbortListener((listener?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbortServiceHost((servicehost?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAbortServiceProxy((serviceproxy?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAcceptChannel(listener: COpaquePointer?, channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAcceptChannel((listener?.value ?: 0L).toString(), (channel?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddCustomHeader(message: COpaquePointer?, headerdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, headerattributes: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAddCustomHeader((message?.value ?: 0L).toString(), (headerdescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), headerattributes.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddErrorString(error: COpaquePointer?, string: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAddErrorString((error?.value ?: 0L).toString(), (string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAddMappedHeader((message?.value ?: 0L).toString(), (headername?.value ?: 0L).toString(), valuetype, writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddressMessage(message: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAddressMessage((message?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAlloc(heap: COpaquePointer?, size: ULong, ptr: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAlloc((heap?.value ?: 0L).toString(), size.toString(), (ptr?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAsyncExecute(asyncstate: COpaquePointer?, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsAsyncExecute((asyncstate?.value ?: 0L).toString(), 0L.toString(), callbackmodel, (callbackstate?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCall(serviceproxy: COpaquePointer?, operation: COpaquePointer?, arguments: COpaquePointer?, heap: COpaquePointer?, callproperties: COpaquePointer?, callpropertycount: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCall((serviceproxy?.value ?: 0L).toString(), (operation?.value ?: 0L).toString(), (arguments?.value ?: 0L).toString(), (heap?.value ?: 0L).toString(), (callproperties?.value ?: 0L).toString(), callpropertycount.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCheckMustUnderstandHeaders(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCheckMustUnderstandHeaders((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCloseChannel((channel?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseListener(listener: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCloseListener((listener?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCloseServiceHost((servicehost?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceProxy(serviceproxy: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCloseServiceProxy((serviceproxy?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCombineUrl(baseurl: COpaquePointer?, referenceurl: COpaquePointer?, flags: UInt, heap: COpaquePointer?, resulturl: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCombineUrl((baseurl?.value ?: 0L).toString(), (referenceurl?.value ?: 0L).toString(), flags.toInt(), (heap?.value ?: 0L).toString(), (resulturl?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyError(source: COpaquePointer?, destination: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCopyError((source?.value ?: 0L).toString(), (destination?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyNode(writer: COpaquePointer?, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCopyNode((writer?.value ?: 0L).toString(), (reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateChannel(channeltype, channelbinding, (properties?.value ?: 0L).toString(), propertycount.toInt(), (securitydescription?.value ?: 0L).toString(), (channel?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannelForListener(listener: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateChannelForListener((listener?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (channel?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateError(properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateError((properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateFaultFromError(error: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: COpaquePointer?, fault: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateFaultFromError((error?.value ?: 0L).toString(), faulterrorcode, faultdisclosure, (heap?.value ?: 0L).toString(), (fault?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateHeap(maxsize.toString(), trimsize.toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (heap?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: COpaquePointer?, propertycount: UInt, securitydescription: COpaquePointer?, listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateListener(channeltype, channelbinding, (properties?.value ?: 0L).toString(), propertycount.toInt(), (securitydescription?.value ?: 0L).toString(), (listener?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateMessage(envelopeversion, addressingversion, (properties?.value ?: 0L).toString(), propertycount.toInt(), (message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessageForChannel(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateMessageForChannel((channel?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMetadata(properties: COpaquePointer?, propertycount: UInt, metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateMetadata((properties?.value ?: 0L).toString(), propertycount.toInt(), (metadata?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateReader(properties: COpaquePointer?, propertycount: UInt, reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateReader((properties?.value ?: 0L).toString(), propertycount.toInt(), (reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, addressurl: COpaquePointer?, contract: COpaquePointer?, authorizationcallback: WsServiceSecurityCallback, heap: COpaquePointer?, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceendpoint: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceEndpointFromTemplate(channeltype, (properties?.value ?: 0L).toString(), propertycount.toInt(), (addressurl?.value ?: 0L).toString(), (contract?.value ?: 0L).toString(), 0L.toString(), (heap?.value ?: 0L).toString(), templatetype, (templatevalue?.value ?: 0L).toString(), templatesize.toInt(), (templatedescription?.value ?: 0L).toString(), templatedescriptionsize.toInt(), (serviceendpoint?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceHost(endpoints: COpaquePointer?, endpointcount: UShort, serviceproperties: COpaquePointer?, servicepropertycount: UInt, servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceHost((endpoints?.value ?: 0L).toString(), endpointcount.toInt(), (serviceproperties?.value ?: 0L).toString(), servicepropertycount.toInt(), (servicehost?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, channelproperties: COpaquePointer?, channelpropertycount: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxy(channeltype, channelbinding, (securitydescription?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (channelproperties?.value ?: 0L).toString(), channelpropertycount.toInt(), (serviceproxy?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: COpaquePointer?, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: COpaquePointer?, templatesize: UInt, templatedescription: COpaquePointer?, templatedescriptionsize: UInt, serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateServiceProxyFromTemplate(channeltype, (properties?.value ?: 0L).toString(), propertycount.toInt(), templatetype, (templatevalue?.value ?: 0L).toString(), templatesize.toInt(), (templatedescription?.value ?: 0L).toString(), templatedescriptionsize.toInt(), (serviceproxy?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateWriter(properties: COpaquePointer?, propertycount: UInt, writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateWriter((properties?.value ?: 0L).toString(), propertycount.toInt(), (writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlBuffer(heap: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, buffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateXmlBuffer((heap?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (buffer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlSecurityToken(tokenxml: COpaquePointer?, tokenkey: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsCreateXmlSecurityToken((tokenxml?.value ?: 0L).toString(), (tokenkey?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (token?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDateTimeToFileTime(datetime: COpaquePointer?, filetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsDateTimeToFileTime((datetime?.value ?: 0L).toString(), (filetime?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDecodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsDecodeUrl((url?.value ?: 0L).toString(), flags.toInt(), (heap?.value ?: 0L).toString(), (outurl?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEncodeUrl(url: COpaquePointer?, flags: UInt, heap: COpaquePointer?, outurl: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsEncodeUrl((url?.value ?: 0L).toString(), flags.toInt(), (heap?.value ?: 0L).toString(), (outurl?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndReaderCanonicalization(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsEndReaderCanonicalization((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndWriterCanonicalization(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsEndWriterCanonicalization((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFileTimeToDateTime(filetime: COpaquePointer?, datetime: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFileTimeToDateTime((filetime?.value ?: 0L).toString(), (datetime?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFillBody((message?.value ?: 0L).toString(), minsize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillReader(reader: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFillReader((reader?.value ?: 0L).toString(), minsize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFindAttribute(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, required: Bool, attributeindex: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFindAttribute((reader?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), required, (attributeindex?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushBody(message: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFlushBody((message?.value ?: 0L).toString(), minsize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushWriter(writer: COpaquePointer?, minsize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFlushWriter((writer?.value ?: 0L).toString(), minsize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFreeChannel(channel: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeChannel((channel?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeError(error: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeError((error?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeHeap(heap: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeHeap((heap?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeListener(listener: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeListener((listener?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMessage(message: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeMessage((message?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMetadata(metadata: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeMetadata((metadata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeReader(reader: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeReader((reader?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeSecurityToken(token: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeSecurityToken((token?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceHost(servicehost: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeServiceHost((servicehost?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceProxy(serviceproxy: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeServiceProxy((serviceproxy?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeWriter(writer: COpaquePointer?) {
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        _windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsFreeWriter((writer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsGetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetChannelProperty((channel?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetCustomHeader(message: COpaquePointer?, customheaderdescription: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetCustomHeader((message?.value ?: 0L).toString(), (customheaderdescription?.value ?: 0L).toString(), repeatingoption, headerindex.toInt(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (headerattributes?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetDictionary(encoding, (dictionary?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetErrorProperty((error?.value ?: 0L).toString(), id, (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorString(error: COpaquePointer?, index: UInt, string: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetErrorString((error?.value ?: 0L).toString(), index.toInt(), (string?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorDetail((error?.value ?: 0L).toString(), (faultdetaildescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetFaultErrorProperty((error?.value ?: 0L).toString(), id, (buffer?.value ?: 0L).toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetHeader((message?.value ?: 0L).toString(), headertype, valuetype, readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeaderAttributes(message: COpaquePointer?, reader: COpaquePointer?, headerattributes: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetHeaderAttributes((message?.value ?: 0L).toString(), (reader?.value ?: 0L).toString(), (headerattributes?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeapProperty(heap: COpaquePointer?, id: WsHeapPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetHeapProperty((heap?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetListenerProperty((listener?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetMappedHeader((message?.value ?: 0L).toString(), (headername?.value ?: 0L).toString(), repeatingoption, headerindex.toInt(), valuetype, readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetMessageProperty((message?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataEndpoints(metadata: COpaquePointer?, endpoints: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetMetadataEndpoints((metadata?.value ?: 0L).toString(), (endpoints?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataProperty(metadata: COpaquePointer?, id: WsMetadataPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetMetadataProperty((metadata?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: COpaquePointer?, address: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetMissingMetadataDocumentAddress((metadata?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetNamespaceFromPrefix(reader: COpaquePointer?, prefix: COpaquePointer?, required: Bool, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetNamespaceFromPrefix((reader?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), required, (ns?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetOperationContextProperty(context: COpaquePointer?, id: WsOperationContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetOperationContextProperty((context?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyAlternativeCount(policy: COpaquePointer?, count: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetPolicyAlternativeCount((policy?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyProperty(policy: COpaquePointer?, id: WsPolicyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetPolicyProperty((policy?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPrefixFromNamespace(writer: COpaquePointer?, ns: COpaquePointer?, required: Bool, prefix: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetPrefixFromNamespace((writer?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), required, (prefix?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderNode(xmlreader: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetReaderNode((xmlreader?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetReaderPosition((reader?.value ?: 0L).toString(), (nodeposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderProperty(reader: COpaquePointer?, id: WsXmlReaderPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetReaderProperty((reader?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityContextProperty(securitycontext: COpaquePointer?, id: WsSecurityContextPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetSecurityContextProperty((securitycontext?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityTokenProperty(securitytoken: COpaquePointer?, id: WsSecurityTokenPropertyId, value: COpaquePointer?, valuesize: UInt, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetSecurityTokenProperty((securitytoken?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (heap?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceHostProperty(servicehost: COpaquePointer?, id: WsServicePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetServiceHostProperty((servicehost?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceProxyProperty(serviceproxy: COpaquePointer?, id: WsProxyPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetServiceProxyProperty((serviceproxy?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetWriterPosition((writer?.value ?: 0L).toString(), (nodeposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterProperty(writer: COpaquePointer?, id: WsXmlWriterPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetWriterProperty((writer?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetXmlAttribute(reader: COpaquePointer?, localname: COpaquePointer?, heap: COpaquePointer?, valuechars: COpaquePointer?, valuecharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsGetXmlAttribute((reader?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (heap?.value ?: 0L).toString(), (valuechars?.value ?: 0L).toString(), (valuecharcount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsInitializeMessage(message: COpaquePointer?, initialization: WsMessageInitialization, sourcemessage: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsInitializeMessage((message?.value ?: 0L).toString(), initialization, (sourcemessage?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMarkHeaderAsUnderstood(message: COpaquePointer?, headerposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsMarkHeaderAsUnderstood((message?.value ?: 0L).toString(), (headerposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMatchPolicyAlternative(policy: COpaquePointer?, alternativeindex: UInt, policyconstraints: COpaquePointer?, matchrequired: Bool, heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsMatchPolicyAlternative((policy?.value ?: 0L).toString(), alternativeindex.toInt(), (policyconstraints?.value ?: 0L).toString(), matchrequired, (heap?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveReader(reader: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsMoveReader((reader?.value ?: 0L).toString(), moveto, (found?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveWriter(writer: COpaquePointer?, moveto: WsMoveTo, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsMoveWriter((writer?.value ?: 0L).toString(), moveto, (found?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenChannel(channel: COpaquePointer?, endpointaddress: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsOpenChannel((channel?.value ?: 0L).toString(), (endpointaddress?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenListener(listener: COpaquePointer?, url: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsOpenListener((listener?.value ?: 0L).toString(), (url?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceHost(servicehost: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsOpenServiceHost((servicehost?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceProxy(serviceproxy: COpaquePointer?, address: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsOpenServiceProxy((serviceproxy?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPullBytes(writer: COpaquePointer?, callback: WsPullBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsPullBytes((writer?.value ?: 0L).toString(), 0L.toString(), (callbackstate?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPushBytes(writer: COpaquePointer?, callback: WsPushBytesCallback, callbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsPushBytes((writer?.value ?: 0L).toString(), 0L.toString(), (callbackstate?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadArray(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadArray((reader?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), valuetype, (array?.value ?: 0L).toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), (actualitemcount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadAttribute(reader: COpaquePointer?, attributedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadAttribute((reader?.value ?: 0L).toString(), (attributedescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBody(message: COpaquePointer?, bodydescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadBody((message?.value ?: 0L).toString(), (bodydescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBytes(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadBytes((reader?.value ?: 0L).toString(), (bytes?.value ?: 0L).toString(), maxbytecount.toInt(), (actualbytecount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadChars(reader: COpaquePointer?, chars: Pwstr, maxcharcount: UInt, actualcharcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadChars((reader?.value ?: 0L).toString(), (chars?.value ?: 0L).toString(), maxcharcount.toInt(), (actualcharcount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadCharsUtf8(reader: COpaquePointer?, bytes: COpaquePointer?, maxbytecount: UInt, actualbytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadCharsUtf8((reader?.value ?: 0L).toString(), (bytes?.value ?: 0L).toString(), maxbytecount.toInt(), (actualbytecount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadElement(reader: COpaquePointer?, elementdescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadElement((reader?.value ?: 0L).toString(), (elementdescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndAttribute(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadEndAttribute((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadEndElement((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndpointAddressExtension(reader: COpaquePointer?, endpointaddress: COpaquePointer?, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadEndpointAddressExtension((reader?.value ?: 0L).toString(), (endpointaddress?.value ?: 0L).toString(), extensiontype, readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeEnd((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeStart(message: COpaquePointer?, reader: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadEnvelopeStart((message?.value ?: 0L).toString(), (reader?.value ?: 0L).toString(), 0L.toString(), (donecallbackstate?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadMessageEnd((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadMessageStart((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMetadata(metadata: COpaquePointer?, reader: COpaquePointer?, url: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadMetadata((metadata?.value ?: 0L).toString(), (reader?.value ?: 0L).toString(), (url?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadNode((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadQualifiedName(reader: COpaquePointer?, heap: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadQualifiedName((reader?.value ?: 0L).toString(), (heap?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartAttribute(reader: COpaquePointer?, attributeindex: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadStartAttribute((reader?.value ?: 0L).toString(), attributeindex.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartElement(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadStartElement((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadToStartElement(reader: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, found: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadToStartElement((reader?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), (found?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadType(reader: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadType((reader?.value ?: 0L).toString(), typemapping, type, (typedescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadValue(reader: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadValue((reader?.value ?: 0L).toString(), valuetype, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBuffer(reader: COpaquePointer?, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadXmlBuffer((reader?.value ?: 0L).toString(), (heap?.value ?: 0L).toString(), (xmlbuffer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBufferFromBytes(reader: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, bytes: COpaquePointer?, bytecount: UInt, heap: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReadXmlBufferFromBytes((reader?.value ?: 0L).toString(), (encoding?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (bytes?.value ?: 0L).toString(), bytecount.toInt(), (heap?.value ?: 0L).toString(), (xmlbuffer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReceiveMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescriptions: COpaquePointer?, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, index: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsReceiveMessage((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (messagedescriptions?.value ?: 0L).toString(), messagedescriptioncount.toInt(), receiveoption, readbodyoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (index?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRegisterOperationForCancel(context: COpaquePointer?, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRegisterOperationForCancel((context?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), (userstate?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveCustomHeader(message: COpaquePointer?, headername: COpaquePointer?, headerns: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRemoveCustomHeader((message?.value ?: 0L).toString(), (headername?.value ?: 0L).toString(), (headerns?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveHeader(message: COpaquePointer?, headertype: WsHeaderType, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRemoveHeader((message?.value ?: 0L).toString(), headertype, (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveMappedHeader(message: COpaquePointer?, headername: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRemoveMappedHeader((message?.value ?: 0L).toString(), (headername?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveNode(nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRemoveNode((nodeposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestReply(channel: COpaquePointer?, requestmessage: COpaquePointer?, requestmessagedescription: COpaquePointer?, writeoption: WsWriteOption, requestbodyvalue: COpaquePointer?, requestbodyvaluesize: UInt, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, readoption: WsReadOption, heap: COpaquePointer?, value: COpaquePointer?, valuesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRequestReply((channel?.value ?: 0L).toString(), (requestmessage?.value ?: 0L).toString(), (requestmessagedescription?.value ?: 0L).toString(), writeoption, (requestbodyvalue?.value ?: 0L).toString(), requestbodyvaluesize.toInt(), (replymessage?.value ?: 0L).toString(), (replymessagedescription?.value ?: 0L).toString(), readoption, (heap?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuesize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestSecurityToken(channel: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, token: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRequestSecurityToken((channel?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (token?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetChannel(channel: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetChannel((channel?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetError(error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetError((error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetHeap(heap: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetHeap((heap?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetListener(listener: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetListener((listener?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMessage(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetMessage((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMetadata(metadata: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetMetadata((metadata?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceHost(servicehost: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetServiceHost((servicehost?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceProxy(serviceproxy: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsResetServiceProxy((serviceproxy?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRevokeSecurityContext(securitycontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsRevokeSecurityContext((securitycontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendFaultMessageForError(channel: COpaquePointer?, replymessage: COpaquePointer?, faulterror: COpaquePointer?, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSendFaultMessageForError((channel?.value ?: 0L).toString(), (replymessage?.value ?: 0L).toString(), (faulterror?.value ?: 0L).toString(), faulterrorcode, faultdisclosure, (requestmessage?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendMessage(channel: COpaquePointer?, message: COpaquePointer?, messagedescription: COpaquePointer?, writeoption: WsWriteOption, bodyvalue: COpaquePointer?, bodyvaluesize: UInt, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSendMessage((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (messagedescription?.value ?: 0L).toString(), writeoption, (bodyvalue?.value ?: 0L).toString(), bodyvaluesize.toInt(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendReplyMessage(channel: COpaquePointer?, replymessage: COpaquePointer?, replymessagedescription: COpaquePointer?, writeoption: WsWriteOption, replybodyvalue: COpaquePointer?, replybodyvaluesize: UInt, requestmessage: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSendReplyMessage((channel?.value ?: 0L).toString(), (replymessage?.value ?: 0L).toString(), (replymessagedescription?.value ?: 0L).toString(), writeoption, (replybodyvalue?.value ?: 0L).toString(), replybodyvaluesize.toInt(), (requestmessage?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetChannelProperty(channel: COpaquePointer?, id: WsChannelPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetChannelProperty((channel?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetErrorProperty(error: COpaquePointer?, id: WsErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetErrorProperty((error?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorDetail(error: COpaquePointer?, faultdetaildescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorDetail((error?.value ?: 0L).toString(), (faultdetaildescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorProperty(error: COpaquePointer?, id: WsFaultErrorPropertyId, value: COpaquePointer?, valuesize: UInt): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetFaultErrorProperty((error?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetHeader(message: COpaquePointer?, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetHeader((message?.value ?: 0L).toString(), headertype, valuetype, writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInput(reader: COpaquePointer?, encoding: COpaquePointer?, input: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetInput((reader?.value ?: 0L).toString(), (encoding?.value ?: 0L).toString(), (input?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInputToBuffer(reader: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetInputToBuffer((reader?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetListenerProperty(listener: COpaquePointer?, id: WsListenerPropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetListenerProperty((listener?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetMessageProperty(message: COpaquePointer?, id: WsMessagePropertyId, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetMessageProperty((message?.value ?: 0L).toString(), id, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutput(writer: COpaquePointer?, encoding: COpaquePointer?, output: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetOutput((writer?.value ?: 0L).toString(), (encoding?.value ?: 0L).toString(), (output?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutputToBuffer(writer: COpaquePointer?, buffer: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetOutputToBuffer((writer?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetReaderPosition(reader: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetReaderPosition((reader?.value ?: 0L).toString(), (nodeposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetWriterPosition(writer: COpaquePointer?, nodeposition: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSetWriterPosition((writer?.value ?: 0L).toString(), (nodeposition?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsShutdownSessionChannel(channel: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsShutdownSessionChannel((channel?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSkipNode(reader: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsSkipNode((reader?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartReaderCanonicalization(reader: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsStartReaderCanonicalization((reader?.value ?: 0L).toString(), 0L.toString(), (writecallbackstate?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartWriterCanonicalization(writer: COpaquePointer?, writecallback: WsWriteCallback, writecallbackstate: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsStartWriterCanonicalization((writer?.value ?: 0L).toString(), 0L.toString(), (writecallbackstate?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: COpaquePointer?, trimmedcount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsTrimXmlWhitespace((chars?.value ?: 0L).toString(), charcount.toInt(), (trimmedchars?.value ?: 0L).toString(), (trimmedcount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsVerifyXmlNCName((ncnamechars?.value ?: 0L).toString(), ncnamecharcount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteArray(writer: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, valuetype: WsValueType, array: COpaquePointer?, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteArray((writer?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), valuetype, (array?.value ?: 0L).toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteAttribute(writer: COpaquePointer?, attributedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteAttribute((writer?.value ?: 0L).toString(), (attributedescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBody(message: COpaquePointer?, bodydescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteBody((message?.value ?: 0L).toString(), (bodydescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBytes(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteBytes((writer?.value ?: 0L).toString(), (bytes?.value ?: 0L).toString(), bytecount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteChars(writer: COpaquePointer?, chars: Pcwstr, charcount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteChars((writer?.value ?: 0L).toString(), (chars?.value ?: 0L).toString(), charcount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteCharsUtf8(writer: COpaquePointer?, bytes: COpaquePointer?, bytecount: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteCharsUtf8((writer?.value ?: 0L).toString(), (bytes?.value ?: 0L).toString(), bytecount.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteElement(writer: COpaquePointer?, elementdescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteElement((writer?.value ?: 0L).toString(), (elementdescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndAttribute(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEndAttribute((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEndCData((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEndElement((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndStartElement(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEndStartElement((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeEnd(message: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeEnd((message?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeStart(message: COpaquePointer?, writer: COpaquePointer?, donecallback: WsMessageDoneCallback, donecallbackstate: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteEnvelopeStart((message?.value ?: 0L).toString(), (writer?.value ?: 0L).toString(), 0L.toString(), (donecallbackstate?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageEnd(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteMessageEnd((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageStart(channel: COpaquePointer?, message: COpaquePointer?, asynccontext: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteMessageStart((channel?.value ?: 0L).toString(), (message?.value ?: 0L).toString(), (asynccontext?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteNode(writer: COpaquePointer?, node: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteNode((writer?.value ?: 0L).toString(), (node?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteQualifiedName(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteQualifiedName((writer?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteStartAttribute((writer?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), singlequote, (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartCData(writer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteStartCData((writer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartElement(writer: COpaquePointer?, prefix: COpaquePointer?, localname: COpaquePointer?, ns: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteStartElement((writer?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (localname?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteText(writer: COpaquePointer?, text: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteText((writer?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteType(writer: COpaquePointer?, typemapping: WsTypeMapping, type: WsType, typedescription: COpaquePointer?, writeoption: WsWriteOption, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteType((writer?.value ?: 0L).toString(), typemapping, type, (typedescription?.value ?: 0L).toString(), writeoption, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteValue(writer: COpaquePointer?, valuetype: WsValueType, value: COpaquePointer?, valuesize: UInt, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteValue((writer?.value ?: 0L).toString(), valuetype, (value?.value ?: 0L).toString(), valuesize.toInt(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBuffer(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBuffer((writer?.value ?: 0L).toString(), (xmlbuffer?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBufferToBytes(writer: COpaquePointer?, xmlbuffer: COpaquePointer?, encoding: COpaquePointer?, properties: COpaquePointer?, propertycount: UInt, heap: COpaquePointer?, bytes: COpaquePointer?, bytecount: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlBufferToBytes((writer?.value ?: 0L).toString(), (xmlbuffer?.value ?: 0L).toString(), (encoding?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), propertycount.toInt(), (heap?.value ?: 0L).toString(), (bytes?.value ?: 0L).toString(), (bytecount?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlnsAttribute(writer: COpaquePointer?, prefix: COpaquePointer?, ns: COpaquePointer?, singlequote: Bool, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsWriteXmlnsAttribute((writer?.value ?: 0L).toString(), (prefix?.value ?: 0L).toString(), (ns?.value ?: 0L).toString(), singlequote, (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsXmlStringEquals(string1: COpaquePointer?, string2: COpaquePointer?, error: COpaquePointer?): Hresult =
    if (_windowsWin32NetworkingWindowswebservicesNapiAddon != null) (_windowsWin32NetworkingWindowswebservicesNapiAddon.windowssys_windows_win32_networking_windowswebservices_wsXmlStringEquals((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), (error?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
