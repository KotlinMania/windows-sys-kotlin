@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun EapHostPeerBeginSession(dwflags: UInt, eaptype: EAP_METHOD_TYPE, pattributearray: Long, htokenimpersonateuser: HANDLE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, dwmaxsendpacketsize: UInt, pconnectionid: Long, func: NotificationHandler, pcontextdata: Long, psessionid: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection(pconnectionid.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerEndSession(sessionhandle: UInt, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession(sessionhandle, ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerFreeEapError(peaperror: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError(peaperror.toCPointer<ByteVar>())
}

public actual fun EapHostPeerFreeErrorMemory(peaperror: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory(peaperror.toCPointer<ByteVar>())
}

public actual fun EapHostPeerFreeMemory(pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory(pdata.toCPointer<ByteVar>())
}

public actual fun EapHostPeerFreeRuntimeMemory(pdata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory(pdata.toCPointer<ByteVar>())
}

public actual fun EapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus(sessionhandle, authparam, pcbauthdata.toCPointer<ByteVar>(), ppauthdata.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: UInt, ppeaperror: Long, fsavetocredman: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.toCPointer<ByteVar>(), phcredentialimpersonationtoken.toCPointer<ByteVar>(), sessionhandle, ppeaperror.toCPointer<ByteVar>(), fsavetocredman.toCPointer<ByteVar>())

public actual fun EapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: PCWSTR, ppszencpassword: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword(dwsizeofpassword, szpassword.toCPointer<ByteVar>(), ppszencpassword.toCPointer<ByteVar>())

public actual fun EapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, htokenimpersonateuser: HANDLE, pfinvokeui: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, huserimpersonationtoken: HANDLE, dweapconndatasize: UInt, pbeapconndata: Long, dwuserdatasize: UInt, pbuserdata: Long, pmethodpropertyarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods(peapmethodinfoarray.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes(sessionhandle, pattribs.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult(sessionhandle, reason, ppresult.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket(sessionhandle, pcbsendpacket.toCPointer<ByteVar>(), ppsendpacket.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext(sessionhandle, pdwsizeofuicontextdata.toCPointer<ByteVar>(), ppuicontextdata.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerInitialize(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize()

public actual fun EapHostPeerInvokeConfigUI(hwndparent: HWND, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconfigin: UInt, pconfigin: Long, pdwsizeofconfigout: Long, ppconfigout: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, hwndparent: HWND, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerInvokeInteractiveUI(hwndparent: HWND, dwsizeofuicontextdata: UInt, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI(hwndparent.toCPointer<ByteVar>(), dwsizeofuicontextdata, puicontextdata.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.toCPointer<ByteVar>(), ppdatafrominteractiveui.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket(sessionhandle, cbreceivepacket, preceivepacket.toCPointer<ByteVar>(), peapoutput.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerQueryCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.toCPointer<ByteVar>(), peapinteractiveuidata.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>(), ppvreserved.toCPointer<ByteVar>())

public actual fun EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.toCPointer<ByteVar>(), peapinteractiveuidata.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.toCPointer<ByteVar>(), ppdatafrominteractiveui.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>(), ppvreserved.toCPointer<ByteVar>())

public actual fun EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, pdwuserblobsize: Long, ppbuserblob: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: Long, peapoutput: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes(sessionhandle, pattribs.toCPointer<ByteVar>(), peapoutput.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext(sessionhandle, dwsizeofuicontextdata, puicontextdata.toCPointer<ByteVar>(), peapoutput.toCPointer<ByteVar>(), ppeaperror.toCPointer<ByteVar>())

public actual fun EapHostPeerUninitialize() {
    io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize()
}
