@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SecurityExtensibleauthenticationprotocolNapiAddon(): Boolean

private val _windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable: Boolean = _initWindowsWin32SecurityExtensibleauthenticationprotocolNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError(p0)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory(p0)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory(p0)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory(p0)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods(p0, p1)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize()")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()")
private external fun _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: COpaquePointer?, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, dwmaxsendpacketsize: UInt, pconnectionid: COpaquePointer?, func: NotificationHandler, pcontextdata: COpaquePointer?, psessionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerClearConnection(pconnectionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection((pconnectionid?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(sessionhandle.toInt(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerFreeEapError(peaperror: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError((peaperror?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory((peaperror?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeMemory(pdata: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory((pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory((pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: COpaquePointer?, ppauthdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, (pcbauthdata?.value ?: 0L).toString(), (ppauthdata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: COpaquePointer?, phcredentialimpersonationtoken: COpaquePointer?, sessionhandle: UInt, ppeaperror: COpaquePointer?, fsavetocredman: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials((pconnectionidthatlastsavedcreds?.value ?: 0L).toString(), (phcredentialimpersonationtoken?.value ?: 0L).toString(), sessionhandle.toInt(), (ppeaperror?.value ?: 0L).toString(), (fsavetocredman?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), (szpassword?.value ?: 0L).toString(), (ppszencpassword?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, htokenimpersonateuser: Handle, pfinvokeui: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, dwuserdatasize: UInt, pbuserdata: COpaquePointer?, pmethodpropertyarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods((peapmethodinfoarray?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(sessionhandle.toInt(), reason, (ppresult?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: COpaquePointer?, ppsendpacket: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(sessionhandle.toInt(), (pcbsendpacket?.value ?: 0L).toString(), (ppsendpacket?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: COpaquePointer?, ppuicontextdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(sessionhandle.toInt(), (pdwsizeofuicontextdata?.value ?: 0L).toString(), (ppuicontextdata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInitialize(): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: COpaquePointer?, pdwsizeofconfigout: COpaquePointer?, ppconfigout: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI((hwndparent?.value ?: 0L).toString(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (pdwsizeofdatafrominteractiveui?.value ?: 0L).toString(), (ppdatafrominteractiveui?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), (preceivepacket?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapinteractiveuidata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString(), (ppvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapinteractiveuidata?.value ?: 0L).toString(), (pdwsizeofdatafrominteractiveui?.value ?: 0L).toString(), (ppdatafrominteractiveui?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString(), (ppvreserved?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, pdwuserblobsize: COpaquePointer?, ppbuserblob: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerUninitialize() {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAvailable) {
        _wasm_windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
