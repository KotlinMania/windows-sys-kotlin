@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private val _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: COpaquePointer?, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, dwmaxsendpacketsize: UInt, pconnectionid: COpaquePointer?, func: NotificationHandler, pcontextdata: COpaquePointer?, psessionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerClearConnection(pconnectionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection((pconnectionid?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(sessionhandle.toInt(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerFreeEapError(peaperror: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError((peaperror?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory((peaperror?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeMemory(pdata: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory((pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: COpaquePointer?) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory((pdata?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: COpaquePointer?, ppauthdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, (pcbauthdata?.value ?: 0L).toString(), (ppauthdata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: COpaquePointer?, phcredentialimpersonationtoken: COpaquePointer?, sessionhandle: UInt, ppeaperror: COpaquePointer?, fsavetocredman: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials((pconnectionidthatlastsavedcreds?.value ?: 0L).toString(), (phcredentialimpersonationtoken?.value ?: 0L).toString(), sessionhandle.toInt(), (ppeaperror?.value ?: 0L).toString(), (fsavetocredman?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), (szpassword?.value ?: 0L).toString(), (ppszencpassword?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, htokenimpersonateuser: Handle, pfinvokeui: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, dwuserdatasize: UInt, pbuserdata: COpaquePointer?, pmethodpropertyarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods((peapmethodinfoarray?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(sessionhandle.toInt(), reason, (ppresult?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: COpaquePointer?, ppsendpacket: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(sessionhandle.toInt(), (pcbsendpacket?.value ?: 0L).toString(), (ppsendpacket?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: COpaquePointer?, ppuicontextdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(sessionhandle.toInt(), (pdwsizeofuicontextdata?.value ?: 0L).toString(), (ppuicontextdata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInitialize(): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: COpaquePointer?, pdwsizeofconfigout: COpaquePointer?, ppconfigout: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI((hwndparent?.value ?: 0L).toString(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (pdwsizeofdatafrominteractiveui?.value ?: 0L).toString(), (ppdatafrominteractiveui?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), (preceivepacket?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapinteractiveuidata?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString(), (ppvreserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapinteractiveuidata?.value ?: 0L).toString(), (pdwsizeofdatafrominteractiveui?.value ?: 0L).toString(), (ppdatafrominteractiveui?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString(), (ppvreserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, pdwuserblobsize: COpaquePointer?, ppbuserblob: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L).toString(), (peapoutput?.value ?: 0L).toString(), (ppeaperror?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerUninitialize() {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
