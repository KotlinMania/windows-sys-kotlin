@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val windowsWin32NetworkingWindowswebservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr, pwebauthngetassertionoptions: ConstPtr, ppwebauthnassertion: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(hwnd.rawAddress.toString(), pwszrpid.rawAddress.toString(), pwebauthnclientdata.rawAddress.toString(), pwebauthngetassertionoptions.rawAddress.toString(), ppwebauthnassertion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr, puserinformation: ConstPtr, ppubkeycredparams: ConstPtr, pwebauthnclientdata: ConstPtr, pwebauthnmakecredentialoptions: ConstPtr, ppwebauthncredentialattestation: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(hwnd.rawAddress.toString(), prpinformation.rawAddress.toString(), puserinformation.rawAddress.toString(), ppubkeycredparams.rawAddress.toString(), pwebauthnclientdata.rawAddress.toString(), pwebauthnmakecredentialoptions.rawAddress.toString(), ppwebauthncredentialattestation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(pcancellationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(cbcredentialid.toInt(), pbcredentialid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(pwebauthnassertion.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(pwebauthncredentialattestation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(pcredentialdetailslist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNGetApiVersionNumber(): UInt =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetCancellationId(pcancellationid: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(pcancellationid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) ConstPtr((windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(hr) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr, ppcredentialdetailslist: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(pgetcredentialsoptions.rawAddress.toString(), ppcredentialdetailslist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonCall(serviceproxy: ConstPtr, callid: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(serviceproxy.rawAddress.toString(), callid.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonMessage(channel: ConstPtr, message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(channel.rawAddress.toString(), message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(channel.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortListener(listener: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(listener.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(servicehost.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(serviceproxy.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAcceptChannel(listener: ConstPtr, channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(listener.rawAddress.toString(), channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddCustomHeader(message: ConstPtr, headerdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, headerattributes: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(message.rawAddress.toString(), headerdescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), headerattributes.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddErrorString(error: ConstPtr, string: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(error.rawAddress.toString(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddMappedHeader(message: ConstPtr, headername: ConstPtr, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), valuetype, writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddressMessage(message: ConstPtr, address: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(message.rawAddress.toString(), address.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAlloc(heap: ConstPtr, size: ULong, ptr: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(heap.rawAddress.toString(), size.toString(), ptr.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAsyncExecute(asyncstate: ConstPtr, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(asyncstate.rawAddress.toString(), 0L.toString(), callbackmodel, callbackstate.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCall(serviceproxy: ConstPtr, operation: ConstPtr, arguments: ConstPtr, heap: ConstPtr, callproperties: ConstPtr, callpropertycount: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCall(serviceproxy.rawAddress.toString(), operation.rawAddress.toString(), arguments.rawAddress.toString(), heap.rawAddress.toString(), callproperties.rawAddress.toString(), callpropertycount.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCheckMustUnderstandHeaders(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseListener(listener: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(listener.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(servicehost.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceProxy(serviceproxy: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(serviceproxy.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCombineUrl(baseurl: ConstPtr, referenceurl: ConstPtr, flags: UInt, heap: ConstPtr, resulturl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(baseurl.rawAddress.toString(), referenceurl.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), resulturl.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyError(source: ConstPtr, destination: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(source.rawAddress.toString(), destination.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyNode(writer: ConstPtr, reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(writer.rawAddress.toString(), reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, channel: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(channeltype, channelbinding, properties.rawAddress.toString(), propertycount.toInt(), securitydescription.rawAddress.toString(), channel.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannelForListener(listener: ConstPtr, properties: ConstPtr, propertycount: UInt, channel: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(listener.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), channel.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateError(properties: ConstPtr, propertycount: UInt, error: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateFaultFromError(error: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr, fault: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(error.rawAddress.toString(), faulterrorcode, faultdisclosure, heap.rawAddress.toString(), fault.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr, propertycount: UInt, heap: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(maxsize.toString(), trimsize.toString(), properties.rawAddress.toString(), propertycount.toInt(), heap.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, listener: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(channeltype, channelbinding, properties.rawAddress.toString(), propertycount.toInt(), securitydescription.rawAddress.toString(), listener.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(envelopeversion, addressingversion, properties.rawAddress.toString(), propertycount.toInt(), message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessageForChannel(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(channel.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMetadata(properties: ConstPtr, propertycount: UInt, metadata: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(properties.rawAddress.toString(), propertycount.toInt(), metadata.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateReader(properties: ConstPtr, propertycount: UInt, reader: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(properties.rawAddress.toString(), propertycount.toInt(), reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, addressurl: ConstPtr, contract: ConstPtr, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceendpoint: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(channeltype, properties.rawAddress.toString(), propertycount.toInt(), addressurl.rawAddress.toString(), contract.rawAddress.toString(), 0L.toString(), heap.rawAddress.toString(), templatetype, templatevalue.rawAddress.toString(), templatesize.toInt(), templatedescription.rawAddress.toString(), templatedescriptionsize.toInt(), serviceendpoint.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceHost(endpoints: ConstPtr, endpointcount: UShort, serviceproperties: ConstPtr, servicepropertycount: UInt, servicehost: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(endpoints.rawAddress.toString(), endpointcount.toInt(), serviceproperties.rawAddress.toString(), servicepropertycount.toInt(), servicehost.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr, properties: ConstPtr, propertycount: UInt, channelproperties: ConstPtr, channelpropertycount: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(channeltype, channelbinding, securitydescription.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), channelproperties.rawAddress.toString(), channelpropertycount.toInt(), serviceproxy.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(channeltype, properties.rawAddress.toString(), propertycount.toInt(), templatetype, templatevalue.rawAddress.toString(), templatesize.toInt(), templatedescription.rawAddress.toString(), templatedescriptionsize.toInt(), serviceproxy.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateWriter(properties: ConstPtr, propertycount: UInt, writer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(properties.rawAddress.toString(), propertycount.toInt(), writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlBuffer(heap: ConstPtr, properties: ConstPtr, propertycount: UInt, buffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(heap.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), buffer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlSecurityToken(tokenxml: ConstPtr, tokenkey: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(tokenxml.rawAddress.toString(), tokenkey.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), token.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDateTimeToFileTime(datetime: ConstPtr, filetime: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(datetime.rawAddress.toString(), filetime.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDecodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(url.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), outurl.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEncodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(url.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), outurl.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndReaderCanonicalization(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndWriterCanonicalization(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFileTimeToDateTime(filetime: ConstPtr, datetime: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(filetime.rawAddress.toString(), datetime.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(message.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillReader(reader: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(reader.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFindAttribute(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, required: Bool, attributeindex: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), required, attributeindex.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(message.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushWriter(writer: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(writer.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFreeChannel(channel: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(channel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeError(error: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(error.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeHeap(heap: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(heap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeListener(listener: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(listener.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMessage(message: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(message.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMetadata(metadata: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(metadata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeReader(reader: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(reader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeSecurityToken(token: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(token.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceHost(servicehost: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(servicehost.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceProxy(serviceproxy: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(serviceproxy.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeWriter(writer: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) {
        windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(writer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsGetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(channel.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetCustomHeader(message: ConstPtr, customheaderdescription: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, headerattributes: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(message.rawAddress.toString(), customheaderdescription.rawAddress.toString(), repeatingoption, headerindex.toInt(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), headerattributes.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(encoding, dictionary.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(error.rawAddress.toString(), id, buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorString(error: ConstPtr, index: UInt, string: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(error.rawAddress.toString(), index.toInt(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(error.rawAddress.toString(), faultdetaildescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(error.rawAddress.toString(), id, buffer.rawAddress.toString(), buffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(message.rawAddress.toString(), headertype, valuetype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeaderAttributes(message: ConstPtr, reader: ConstPtr, headerattributes: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(message.rawAddress.toString(), reader.rawAddress.toString(), headerattributes.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeapProperty(heap: ConstPtr, id: WsHeapPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(heap.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(listener.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMappedHeader(message: ConstPtr, headername: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), repeatingoption, headerindex.toInt(), valuetype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(message.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataEndpoints(metadata: ConstPtr, endpoints: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(metadata.rawAddress.toString(), endpoints.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataProperty(metadata: ConstPtr, id: WsMetadataPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(metadata.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr, address: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(metadata.rawAddress.toString(), address.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetNamespaceFromPrefix(reader: ConstPtr, prefix: ConstPtr, required: Bool, ns: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(reader.rawAddress.toString(), prefix.rawAddress.toString(), required, ns.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetOperationContextProperty(context: ConstPtr, id: WsOperationContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(context.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyAlternativeCount(policy: ConstPtr, count: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(policy.rawAddress.toString(), count.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyProperty(policy: ConstPtr, id: WsPolicyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(policy.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPrefixFromNamespace(writer: ConstPtr, ns: ConstPtr, required: Bool, prefix: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(writer.rawAddress.toString(), ns.rawAddress.toString(), required, prefix.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderNode(xmlreader: ConstPtr, node: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(xmlreader.rawAddress.toString(), node.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderPosition(reader: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(reader.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderProperty(reader: ConstPtr, id: WsXmlReaderPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(reader.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityContextProperty(securitycontext: ConstPtr, id: WsSecurityContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(securitycontext.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityTokenProperty(securitytoken: ConstPtr, id: WsSecurityTokenPropertyId, value: MutPtr, valuesize: UInt, heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(securitytoken.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), heap.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceHostProperty(servicehost: ConstPtr, id: WsServicePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(servicehost.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceProxyProperty(serviceproxy: ConstPtr, id: WsProxyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(serviceproxy.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterPosition(writer: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(writer.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterProperty(writer: ConstPtr, id: WsXmlWriterPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(writer.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetXmlAttribute(reader: ConstPtr, localname: ConstPtr, heap: ConstPtr, valuechars: MutPtr, valuecharcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(reader.rawAddress.toString(), localname.rawAddress.toString(), heap.rawAddress.toString(), valuechars.rawAddress.toString(), valuecharcount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsInitializeMessage(message: ConstPtr, initialization: WsMessageInitialization, sourcemessage: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(message.rawAddress.toString(), initialization, sourcemessage.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMarkHeaderAsUnderstood(message: ConstPtr, headerposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(message.rawAddress.toString(), headerposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMatchPolicyAlternative(policy: ConstPtr, alternativeindex: UInt, policyconstraints: ConstPtr, matchrequired: Bool, heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(policy.rawAddress.toString(), alternativeindex.toInt(), policyconstraints.rawAddress.toString(), matchrequired, heap.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveReader(reader: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(reader.rawAddress.toString(), moveto, found.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveWriter(writer: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(writer.rawAddress.toString(), moveto, found.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenChannel(channel: ConstPtr, endpointaddress: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(channel.rawAddress.toString(), endpointaddress.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenListener(listener: ConstPtr, url: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(listener.rawAddress.toString(), url.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(servicehost.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceProxy(serviceproxy: ConstPtr, address: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(serviceproxy.rawAddress.toString(), address.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPullBytes(writer: ConstPtr, callback: WsPullBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(writer.rawAddress.toString(), 0L.toString(), callbackstate.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPushBytes(writer: ConstPtr, callback: WsPushBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(writer.rawAddress.toString(), 0L.toString(), callbackstate.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadArray(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: MutPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), valuetype, array.rawAddress.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), actualitemcount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadAttribute(reader: ConstPtr, attributedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(reader.rawAddress.toString(), attributedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBody(message: ConstPtr, bodydescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(message.rawAddress.toString(), bodydescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBytes(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(reader.rawAddress.toString(), bytes.rawAddress.toString(), maxbytecount.toInt(), actualbytecount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadChars(reader: ConstPtr, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(reader.rawAddress.toString(), chars.rawAddress.toString(), maxcharcount.toInt(), actualcharcount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadCharsUtf8(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(reader.rawAddress.toString(), bytes.rawAddress.toString(), maxbytecount.toInt(), actualbytecount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadElement(reader: ConstPtr, elementdescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(reader.rawAddress.toString(), elementdescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndAttribute(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndElement(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndpointAddressExtension(reader: ConstPtr, endpointaddress: ConstPtr, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(reader.rawAddress.toString(), endpointaddress.rawAddress.toString(), extensiontype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeStart(message: ConstPtr, reader: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(message.rawAddress.toString(), reader.rawAddress.toString(), 0L.toString(), donecallbackstate.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMetadata(metadata: ConstPtr, reader: ConstPtr, url: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(metadata.rawAddress.toString(), reader.rawAddress.toString(), url.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadNode(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadQualifiedName(reader: ConstPtr, heap: ConstPtr, prefix: MutPtr, localname: MutPtr, ns: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(reader.rawAddress.toString(), heap.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartAttribute(reader: ConstPtr, attributeindex: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(reader.rawAddress.toString(), attributeindex.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartElement(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadToStartElement(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), found.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadType(reader: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadType(reader.rawAddress.toString(), typemapping, type, typedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadValue(reader: ConstPtr, valuetype: WsValueType, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(reader.rawAddress.toString(), valuetype, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBuffer(reader: ConstPtr, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(reader.rawAddress.toString(), heap.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBufferFromBytes(reader: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, bytes: ConstPtr, bytecount: UInt, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(reader.rawAddress.toString(), encoding.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), bytes.rawAddress.toString(), bytecount.toInt(), heap.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReceiveMessage(channel: ConstPtr, message: ConstPtr, messagedescriptions: ConstPtr, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, index: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(channel.rawAddress.toString(), message.rawAddress.toString(), messagedescriptions.rawAddress.toString(), messagedescriptioncount.toInt(), receiveoption, readbodyoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), index.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRegisterOperationForCancel(context: ConstPtr, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(context.rawAddress.toString(), 0L.toString(), 0L.toString(), userstate.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveCustomHeader(message: ConstPtr, headername: ConstPtr, headerns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(message.rawAddress.toString(), headername.rawAddress.toString(), headerns.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveHeader(message: ConstPtr, headertype: WsHeaderType, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(message.rawAddress.toString(), headertype, error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveMappedHeader(message: ConstPtr, headername: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveNode(nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(nodeposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestReply(channel: ConstPtr, requestmessage: ConstPtr, requestmessagedescription: ConstPtr, writeoption: WsWriteOption, requestbodyvalue: ConstPtr, requestbodyvaluesize: UInt, replymessage: ConstPtr, replymessagedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(channel.rawAddress.toString(), requestmessage.rawAddress.toString(), requestmessagedescription.rawAddress.toString(), writeoption, requestbodyvalue.rawAddress.toString(), requestbodyvaluesize.toInt(), replymessage.rawAddress.toString(), replymessagedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestSecurityToken(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(channel.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), token.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(channel.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetError(error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetError(error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetHeap(heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(heap.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetListener(listener: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(listener.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMessage(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMetadata(metadata: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(metadata.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(servicehost.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(serviceproxy.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRevokeSecurityContext(securitycontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(securitycontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendFaultMessageForError(channel: ConstPtr, replymessage: ConstPtr, faulterror: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(channel.rawAddress.toString(), replymessage.rawAddress.toString(), faulterror.rawAddress.toString(), faulterrorcode, faultdisclosure, requestmessage.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendMessage(channel: ConstPtr, message: ConstPtr, messagedescription: ConstPtr, writeoption: WsWriteOption, bodyvalue: ConstPtr, bodyvaluesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(channel.rawAddress.toString(), message.rawAddress.toString(), messagedescription.rawAddress.toString(), writeoption, bodyvalue.rawAddress.toString(), bodyvaluesize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendReplyMessage(channel: ConstPtr, replymessage: ConstPtr, replymessagedescription: ConstPtr, writeoption: WsWriteOption, replybodyvalue: ConstPtr, replybodyvaluesize: UInt, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(channel.rawAddress.toString(), replymessage.rawAddress.toString(), replymessagedescription.rawAddress.toString(), writeoption, replybodyvalue.rawAddress.toString(), replybodyvaluesize.toInt(), requestmessage.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(channel.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(error.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(error.rawAddress.toString(), faultdetaildescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(error.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(message.rawAddress.toString(), headertype, valuetype, writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInput(reader: ConstPtr, encoding: ConstPtr, input: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(reader.rawAddress.toString(), encoding.rawAddress.toString(), input.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInputToBuffer(reader: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(reader.rawAddress.toString(), buffer.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(listener.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(message.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutput(writer: ConstPtr, encoding: ConstPtr, output: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(writer.rawAddress.toString(), encoding.rawAddress.toString(), output.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutputToBuffer(writer: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(writer.rawAddress.toString(), buffer.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetReaderPosition(reader: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(reader.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetWriterPosition(writer: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(writer.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsShutdownSessionChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSkipNode(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(reader.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartReaderCanonicalization(reader: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(reader.rawAddress.toString(), 0L.toString(), writecallbackstate.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartWriterCanonicalization(writer: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(writer.rawAddress.toString(), 0L.toString(), writecallbackstate.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr, trimmedcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(chars.rawAddress.toString(), charcount.toInt(), trimmedchars.rawAddress.toString(), trimmedcount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(ncnamechars.rawAddress.toString(), ncnamecharcount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteArray(writer: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: ConstPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(writer.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), valuetype, array.rawAddress.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteAttribute(writer: ConstPtr, attributedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(writer.rawAddress.toString(), attributedescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBody(message: ConstPtr, bodydescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(message.rawAddress.toString(), bodydescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBytes(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(writer.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteChars(writer: ConstPtr, chars: Pcwstr, charcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(writer.rawAddress.toString(), chars.rawAddress.toString(), charcount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteCharsUtf8(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(writer.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteElement(writer: ConstPtr, elementdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(writer.rawAddress.toString(), elementdescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndAttribute(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndCData(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndElement(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndStartElement(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(message.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeStart(message: ConstPtr, writer: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(message.rawAddress.toString(), writer.rawAddress.toString(), 0L.toString(), donecallbackstate.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteNode(writer: ConstPtr, node: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(writer.rawAddress.toString(), node.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteQualifiedName(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartAttribute(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), singlequote, error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartCData(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(writer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartElement(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteText(writer: ConstPtr, text: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(writer.rawAddress.toString(), text.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteType(writer: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(writer.rawAddress.toString(), typemapping, type, typedescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteValue(writer: ConstPtr, valuetype: WsValueType, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(writer.rawAddress.toString(), valuetype, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBuffer(writer: ConstPtr, xmlbuffer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(writer.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBufferToBytes(writer: ConstPtr, xmlbuffer: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, heap: ConstPtr, bytes: MutPtr, bytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(writer.rawAddress.toString(), xmlbuffer.rawAddress.toString(), encoding.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), heap.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlnsAttribute(writer: ConstPtr, prefix: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(writer.rawAddress.toString(), prefix.rawAddress.toString(), ns.rawAddress.toString(), singlequote, error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsXmlStringEquals(string1: ConstPtr, string2: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAddon != null) (windowsWin32NetworkingWindowswebservicesNapiAddon.windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(string1.rawAddress.toString(), string2.rawAddress.toString(), error.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
