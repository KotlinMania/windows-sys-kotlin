@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr<EapAttributes>, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr<Guid>, func: NotificationHandler, pcontextdata: MutPtr<CVoid>, psessionid: MutPtr<UInt>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerBeginSession")

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr<Guid>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession")

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr<EapError>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError")

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr<EapError>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory")

public actual fun eapHostPeerFreeMemory(pdata: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory")

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory")

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr<UInt>, ppauthdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr<Guid>, phcredentialimpersonationtoken: MutPtr<Long>, sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>, fsavetocredman: MutPtr<Bool>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, htokenimpersonateuser: Handle, pfinvokeui: MutPtr<Bool>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetIdentity")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, dwuserdatasize: UInt, pbuserdata: ConstPtr<UByte>, pmethodpropertyarray: MutPtr<EapMethodPropertyArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethodProperties")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr<EapMethodInfoArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr<EapAttributes>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr<EapHostPeerMethodResult>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr<UInt>, ppsendpacket: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr<UInt>, ppuicontextdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize")
private external fun wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize(): Int

public actual fun eapHostPeerInitialize(): UInt =
    wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize().toUInt()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr<UByte>, pdwsizeofconfigout: MutPtr<UInt>, ppconfigout: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeConfigUI")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeIdentityUI")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: MutPtr<EapConfigInputFieldArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryCredentialInputFields")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: MutPtr<EapInteractiveUiData>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: ConstPtr<EapInteractiveUiData>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: ConstPtr<EapConfigInputFieldArray>, pdwuserblobsize: MutPtr<UInt>, ppbuserblob: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUserBlobFromCredentialInputFields")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr<EapAttributes>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize")
private external fun wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize(): Unit

public actual fun eapHostPeerUninitialize(): Unit =
    wasiWindowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
