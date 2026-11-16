@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
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

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr, func: NotificationHandler, pcontextdata: MutPtr, psessionid: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle, ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr) {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr, ppauthdata: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle, authparam, pcbauthdata.rawAddress.toCPointer<ByteVar>(), ppauthdata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr, phcredentialimpersonationtoken: MutPtr, sessionhandle: UInt, ppeaperror: MutPtr, fsavetocredman: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress.toCPointer<ByteVar>(), phcredentialimpersonationtoken.rawAddress.toCPointer<ByteVar>(), sessionhandle, ppeaperror.rawAddress.toCPointer<ByteVar>(), fsavetocredman.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword, szpassword.rawAddress.toCPointer<ByteVar>(), ppszencpassword.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, htokenimpersonateuser: Handle, pfinvokeui: MutPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr, dwuserdatasize: UInt, pbuserdata: ConstPtr, pmethodpropertyarray: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle, pattribs.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle, reason, ppresult.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr, ppsendpacket: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle, pcbsendpacket.rawAddress.toCPointer<ByteVar>(), ppsendpacket.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr, ppuicontextdata: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle, pdwsizeofuicontextdata.rawAddress.toCPointer<ByteVar>(), ppuicontextdata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerInitialize(): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr, pdwsizeofconfigout: MutPtr, ppconfigout: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress.toCPointer<ByteVar>(), dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle, cbreceivepacket, preceivepacket.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapinteractiveuidata.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>(), ppvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapinteractiveuidata.rawAddress.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppdatafrominteractiveui.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>(), ppvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: ConstPtr, pdwuserblobsize: MutPtr, ppbuserblob: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle, pattribs.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle, dwsizeofuicontextdata, puicontextdata.rawAddress.toCPointer<ByteVar>(), peapoutput.rawAddress.toCPointer<ByteVar>(), ppeaperror.rawAddress.toCPointer<ByteVar>())

public actual fun eapHostPeerUninitialize() {
    windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
}
