@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityExtensibleauthenticationprotocolNapiAddon(): Boolean

private val windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable: Boolean = initWindowsWin32SecurityExtensibleauthenticationprotocolNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(p0)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(p0)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(p0)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize()")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()")
private external fun wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr, func: NotificationHandler, pcontextdata: MutPtr, psessionid: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle.toInt(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr, ppauthdata: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata.rawAddress.toString(), ppauthdata.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr, phcredentialimpersonationtoken: MutPtr, sessionhandle: UInt, ppeaperror: MutPtr, fsavetocredman: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress.toString(), phcredentialimpersonationtoken.rawAddress.toString(), sessionhandle.toInt(), ppeaperror.rawAddress.toString(), fsavetocredman.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword.rawAddress.toString(), ppszencpassword.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, htokenimpersonateuser: Handle, pfinvokeui: MutPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr, dwuserdatasize: UInt, pbuserdata: ConstPtr, pmethodpropertyarray: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr, ppsendpacket: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket.rawAddress.toString(), ppsendpacket.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr, ppuicontextdata: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata.rawAddress.toString(), ppuicontextdata.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInitialize(): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr, pdwsizeofconfigout: MutPtr, ppconfigout: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress.toString(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), pdwsizeofdatafrominteractiveui.rawAddress.toString(), ppdatafrominteractiveui.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapinteractiveuidata.rawAddress.toString(), ppeaperror.rawAddress.toString(), ppvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapinteractiveuidata.rawAddress.toString(), pdwsizeofdatafrominteractiveui.rawAddress.toString(), ppdatafrominteractiveui.rawAddress.toString(), ppeaperror.rawAddress.toString(), ppvreserved.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: ConstPtr, pdwuserblobsize: MutPtr, ppbuserblob: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerUninitialize() {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
