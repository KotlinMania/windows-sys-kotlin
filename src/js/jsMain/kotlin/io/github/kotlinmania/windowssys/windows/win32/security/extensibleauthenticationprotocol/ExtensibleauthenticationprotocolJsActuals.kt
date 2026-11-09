@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private val _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun EapHostPeerBeginSession(dwflags: UInt, eaptype: EAP_METHOD_TYPE, pattributearray: Long, htokenimpersonateuser: HANDLE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, dwmaxsendpacketsize: UInt, pconnectionid: Long, func: NotificationHandler, pcontextdata: Long, psessionid: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection(pconnectionid.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerEndSession(sessionhandle: UInt, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession(sessionhandle.toInt(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerFreeEapError(peaperror: Long) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError(peaperror.toString())
    }
}

public actual fun EapHostPeerFreeErrorMemory(peaperror: Long) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory(peaperror.toString())
    }
}

public actual fun EapHostPeerFreeMemory(pdata: Long) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory(pdata.toString())
    }
}

public actual fun EapHostPeerFreeRuntimeMemory(pdata: Long) {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory(pdata.toString())
    }
}

public actual fun EapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata.toString(), ppauthdata.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: UInt, ppeaperror: Long, fsavetocredman: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.toString(), phcredentialimpersonationtoken.toString(), sessionhandle.toInt(), ppeaperror.toString(), fsavetocredman.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: PCWSTR, ppszencpassword: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword.toString(), ppszencpassword.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, htokenimpersonateuser: HANDLE, pfinvokeui: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, huserimpersonationtoken: HANDLE, dweapconndatasize: UInt, pbeapconndata: Long, dwuserdatasize: UInt, pbuserdata: Long, pmethodpropertyarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods(peapmethodinfoarray.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket.toString(), ppsendpacket.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata.toString(), ppuicontextdata.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerInitialize(): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize() as Int).toUInt() else 0u

public actual fun EapHostPeerInvokeConfigUI(hwndparent: HWND, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconfigin: UInt, pconfigin: Long, pdwsizeofconfigout: Long, ppconfigout: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, hwndparent: HWND, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerInvokeInteractiveUI(hwndparent: HWND, dwsizeofuicontextdata: UInt, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI(hwndparent.toString(), dwsizeofuicontextdata.toInt(), puicontextdata.toString(), pdwsizeofdatafrominteractiveui.toString(), ppdatafrominteractiveui.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket.toString(), peapoutput.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerQueryCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.toString(), peapinteractiveuidata.toString(), ppeaperror.toString(), ppvreserved.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.toString(), peapinteractiveuidata.toString(), pdwsizeofdatafrominteractiveui.toString(), ppdatafrominteractiveui.toString(), ppeaperror.toString(), ppvreserved.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, pdwuserblobsize: Long, ppbuserblob: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: Long, peapoutput: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs.toString(), peapoutput.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): UInt =
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.toString(), peapoutput.toString(), ppeaperror.toString()) as Int).toUInt() else 0u

public actual fun EapHostPeerUninitialize() {
    if (_windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        _windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize()
    }
}
