@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr<EapAttributes>, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr<Guid>, func: NotificationHandler, pcontextdata: MutPtr<CVoid>, psessionid: MutPtr<UInt>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr<Guid>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle, ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr<EapError>) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr<EapError>) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr<UByte>) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr<UByte>) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr<UInt>, ppauthdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle, authparam, pcbauthdata.rawAddress.toCPointer<ByteVar>(), ppauthdata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr<Guid>, phcredentialimpersonationtoken: MutPtr<Long>, sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>, fsavetocredman: MutPtr<Bool>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress.toCPointer<ByteVar>(), phcredentialimpersonationtoken.rawAddress.toCPointer<ByteVar>(), sessionhandle, ppeaperror.rawAddress.toCPointer<ByteVar>(), fsavetocredman.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr<Pwstr>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword, szpassword.rawAddress.toCPointer<ByteVar>(), ppszencpassword.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, htokenimpersonateuser: Handle, pfinvokeui: MutPtr<Bool>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<UByte>>): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, dwuserdatasize: UInt, pbuserdata: ConstPtr<UByte>, pmethodpropertyarray: MutPtr<EapMethodPropertyArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr<EapMethodInfoArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr<EapAttributes>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle, pattribs.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr<EapHostPeerMethodResult>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle, reason, ppresult.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr<UInt>, ppsendpacket: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle, pcbsendpacket.rawAddress.toCPointer<ByteVar>(), ppsendpacket.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr<UInt>, ppuicontextdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle, pdwsizeofuicontextdata.rawAddress.toCPointer<ByteVar>(), ppuicontextdata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerInitialize(): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr<UByte>, pdwsizeofconfigout: MutPtr<UInt>, ppconfigout: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress.toCPointer<ByteVar>(), dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle, cbreceivepacket, preceivepacket.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: MutPtr<EapConfigInputFieldArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: MutPtr<EapInteractiveUiData>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapinteractiveuidata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>(), ppvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: ConstPtr<EapInteractiveUiData>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapinteractiveuidata.rawAddress.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>(), ppvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: ConstPtr<EapConfigInputFieldArray>, pdwuserblobsize: MutPtr<UInt>, ppbuserblob: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr<EapAttributes>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle, pattribs.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerUninitialize() {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
}
