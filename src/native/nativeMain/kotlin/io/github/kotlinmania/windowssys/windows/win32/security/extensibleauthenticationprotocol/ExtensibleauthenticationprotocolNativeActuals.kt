@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext
import io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol.cinterop.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: COpaquePointer?, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, dwmaxsendpacketsize: UInt, pconnectionid: COpaquePointer?, func: NotificationHandler, pcontextdata: COpaquePointer?, psessionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection(pconnectionid?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(sessionhandle, ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerFreeEapError(peaperror: COpaquePointer?) {
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError(peaperror?.value?.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: COpaquePointer?) {
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory(peaperror?.value?.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeMemory(pdata: COpaquePointer?) {
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory(pdata?.value?.toCPointer<ByteVar>())
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: COpaquePointer?) {
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory(pdata?.value?.toCPointer<ByteVar>())
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: COpaquePointer?, ppauthdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(sessionhandle, authparam, pcbauthdata?.value?.toCPointer<ByteVar>(), ppauthdata?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: COpaquePointer?, phcredentialimpersonationtoken: COpaquePointer?, sessionhandle: UInt, ppeaperror: COpaquePointer?, fsavetocredman: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds?.value?.toCPointer<ByteVar>(), phcredentialimpersonationtoken?.value?.toCPointer<ByteVar>(), sessionhandle, ppeaperror?.value?.toCPointer<ByteVar>(), fsavetocredman?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(dwsizeofpassword, szpassword?.value?.toCPointer<ByteVar>(), ppszencpassword?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, htokenimpersonateuser: Handle, pfinvokeui: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, dwuserdatasize: UInt, pbuserdata: COpaquePointer?, pmethodpropertyarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods(peapmethodinfoarray?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(sessionhandle, pattribs?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(sessionhandle, reason, ppresult?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: COpaquePointer?, ppsendpacket: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(sessionhandle, pcbsendpacket?.value?.toCPointer<ByteVar>(), ppsendpacket?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: COpaquePointer?, ppuicontextdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(sessionhandle, pdwsizeofuicontextdata?.value?.toCPointer<ByteVar>(), ppuicontextdata?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerInitialize(): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: COpaquePointer?, pdwsizeofconfigout: COpaquePointer?, ppconfigout: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI(hwndparent?.value?.toCPointer<ByteVar>(), dwsizeofuicontextdata, puicontextdata?.value?.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui?.value?.toCPointer<ByteVar>(), ppdatafrominteractiveui?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(sessionhandle, cbreceivepacket, preceivepacket?.value?.toCPointer<ByteVar>(), peapoutput?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata?.value?.toCPointer<ByteVar>(), peapinteractiveuidata?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>(), ppvreserved?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion, dwflags, dwsizeofuicontextdata, puicontextdata?.value?.toCPointer<ByteVar>(), peapinteractiveuidata?.value?.toCPointer<ByteVar>(), pdwsizeofdatafrominteractiveui?.value?.toCPointer<ByteVar>(), ppdatafrominteractiveui?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>(), ppvreserved?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, pdwuserblobsize: COpaquePointer?, ppbuserblob: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(sessionhandle, pattribs?.value?.toCPointer<ByteVar>(), peapoutput?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(sessionhandle, dwsizeofuicontextdata, puicontextdata?.value?.toCPointer<ByteVar>(), peapoutput?.value?.toCPointer<ByteVar>(), ppeaperror?.value?.toCPointer<ByteVar>())

public actual fun eapHostPeerUninitialize() {
    windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()
}
