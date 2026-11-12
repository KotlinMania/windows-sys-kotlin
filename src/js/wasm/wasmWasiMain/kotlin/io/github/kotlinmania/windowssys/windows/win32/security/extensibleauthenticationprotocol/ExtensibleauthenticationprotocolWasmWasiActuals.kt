@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr, func: NotificationHandler, pcontextdata: MutPtr, psessionid: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerBeginSession")

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession")

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError")

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory")

public actual fun eapHostPeerFreeMemory(pdata: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory")

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory")

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr, ppauthdata: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr, phcredentialimpersonationtoken: MutPtr, sessionhandle: UInt, ppeaperror: MutPtr, fsavetocredman: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, htokenimpersonateuser: Handle, pfinvokeui: MutPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetIdentity")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr, dwuserdatasize: UInt, pbuserdata: ConstPtr, pmethodpropertyarray: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethodProperties")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr, ppsendpacket: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr, ppuicontextdata: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize")
private external fun wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize(): Int

public actual fun eapHostPeerInitialize(): UInt =
    wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize().toUInt()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr, pdwsizeofconfigout: MutPtr, ppconfigout: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeConfigUI")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeIdentityUI")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryCredentialInputFields")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: ConstPtr, pdwuserblobsize: MutPtr, ppbuserblob: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUserBlobFromCredentialInputFields")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize")
private external fun wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize(): Unit

public actual fun eapHostPeerUninitialize(): Unit =
    wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
