package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr, func: NotificationHandler, pcontextdata: MutPtr, psessionid: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerClearConnection(pconnectionid: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerFreeEapError(peaperror: MutPtr)

public expect fun eapHostPeerFreeErrorMemory(peaperror: MutPtr)

public expect fun eapHostPeerFreeMemory(pdata: MutPtr)

public expect fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr)

public expect fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr, ppauthdata: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr, phcredentialimpersonationtoken: MutPtr, sessionhandle: UInt, ppeaperror: MutPtr, fsavetocredman: MutPtr): UInt

public expect fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr): UInt

public expect fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, htokenimpersonateuser: Handle, pfinvokeui: MutPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt

public expect fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr, dwuserdatasize: UInt, pbuserdata: ConstPtr, pmethodpropertyarray: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr, ppsendpacket: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr, ppuicontextdata: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerInitialize(): UInt

public expect fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr, pdwsizeofconfigout: MutPtr, ppconfigout: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt

public expect fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt

public expect fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt

public expect fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: ConstPtr, pdwuserblobsize: MutPtr, ppbuserblob: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt

public expect fun eapHostPeerUninitialize()
