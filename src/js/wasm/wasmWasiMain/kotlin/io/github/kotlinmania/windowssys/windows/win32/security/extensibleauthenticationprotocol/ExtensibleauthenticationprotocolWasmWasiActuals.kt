@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: COpaquePointer?, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, dwmaxsendpacketsize: UInt, pconnectionid: COpaquePointer?, func: NotificationHandler, pcontextdata: COpaquePointer?, psessionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerClearConnection(pconnectionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerFreeEapError(peaperror: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerFreeErrorMemory(peaperror: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerFreeMemory(pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerFreeRuntimeMemory(pdata: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: COpaquePointer?, ppauthdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: COpaquePointer?, phcredentialimpersonationtoken: COpaquePointer?, sessionhandle: UInt, ppeaperror: COpaquePointer?, fsavetocredman: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, htokenimpersonateuser: Handle, pfinvokeui: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, dwuserdatasize: UInt, pbuserdata: COpaquePointer?, pmethodpropertyarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: COpaquePointer?, ppsendpacket: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: COpaquePointer?, ppuicontextdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerInitialize(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: COpaquePointer?, pdwsizeofconfigout: COpaquePointer?, ppconfigout: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, pdwuserblobsize: COpaquePointer?, ppbuserblob: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun eapHostPeerUninitialize(): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
