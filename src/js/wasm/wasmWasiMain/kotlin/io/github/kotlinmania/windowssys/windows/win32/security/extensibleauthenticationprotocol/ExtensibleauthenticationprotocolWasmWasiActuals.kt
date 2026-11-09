@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public actual fun EapHostPeerBeginSession(dwflags: UInt, eaptype: EAP_METHOD_TYPE, pattributearray: Long, htokenimpersonateuser: HANDLE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, dwmaxsendpacketsize: UInt, pconnectionid: Long, func: NotificationHandler, pcontextdata: Long, psessionid: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerEndSession(sessionhandle: UInt, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerFreeEapError(peaperror: Long) {
}

public actual fun EapHostPeerFreeErrorMemory(peaperror: Long) {
}

public actual fun EapHostPeerFreeMemory(pdata: Long) {
}

public actual fun EapHostPeerFreeRuntimeMemory(pdata: Long) {
}

public actual fun EapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: UInt, ppeaperror: Long, fsavetocredman: Long): UInt =
    0u

public actual fun EapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: PCWSTR, ppszencpassword: Long): UInt =
    0u

public actual fun EapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, htokenimpersonateuser: HANDLE, pfinvokeui: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, huserimpersonationtoken: HANDLE, dweapconndatasize: UInt, pbeapconndata: Long, dwuserdatasize: UInt, pbuserdata: Long, pmethodpropertyarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerInitialize(): UInt =
    0u

public actual fun EapHostPeerInvokeConfigUI(hwndparent: HWND, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconfigin: UInt, pconfigin: Long, pdwsizeofconfigout: Long, ppconfigout: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, hwndparent: HWND, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerInvokeInteractiveUI(hwndparent: HWND, dwsizeofuicontextdata: UInt, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerQueryCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, pdwuserblobsize: Long, ppbuserblob: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: Long, peapoutput: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerUninitialize() {
}
