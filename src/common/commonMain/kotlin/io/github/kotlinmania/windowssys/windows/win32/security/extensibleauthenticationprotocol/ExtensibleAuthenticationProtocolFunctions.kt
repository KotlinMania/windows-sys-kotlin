package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public expect fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr<EapAttributes>, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr<Guid>, func: NotificationHandler, pcontextdata: MutPtr<CVoid>, psessionid: MutPtr<UInt>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerClearConnection(pconnectionid: MutPtr<Guid>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerFreeEapError(peaperror: MutPtr<EapError>)

public expect fun eapHostPeerFreeErrorMemory(peaperror: MutPtr<EapError>)

public expect fun eapHostPeerFreeMemory(pdata: MutPtr<UByte>)

public expect fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr<UByte>)

public expect fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr<UInt>, ppauthdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr<Guid>, phcredentialimpersonationtoken: MutPtr<Long>, sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>, fsavetocredman: MutPtr<Bool>): UInt

public expect fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr<Pwstr>): UInt

public expect fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, htokenimpersonateuser: Handle, pfinvokeui: MutPtr<Bool>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<UByte>>): UInt

public expect fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, dwuserdatasize: UInt, pbuserdata: ConstPtr<UByte>, pmethodpropertyarray: MutPtr<EapMethodPropertyArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr<EapMethodInfoArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr<EapAttributes>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr<EapHostPeerMethodResult>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr<UInt>, ppsendpacket: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr<UInt>, ppuicontextdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerInitialize(): UInt

public expect fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr<UByte>, pdwsizeofconfigout: MutPtr<UInt>, ppconfigout: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt

public expect fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: MutPtr<EapConfigInputFieldArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: MutPtr<EapInteractiveUiData>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt

public expect fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: ConstPtr<EapInteractiveUiData>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt

public expect fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: ConstPtr<EapConfigInputFieldArray>, pdwuserblobsize: MutPtr<UInt>, ppbuserblob: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr<EapAttributes>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt

public expect fun eapHostPeerUninitialize()
