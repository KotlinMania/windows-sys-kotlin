@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr<EapAttributes>, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr<Guid>, func: NotificationHandler, pcontextdata: MutPtr<CVoid>, psessionid: MutPtr<UInt>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr<Guid>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle.toInt(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr<EapError>) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr<EapError>) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr<UByte>) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr<UByte>) {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr<UInt>, ppauthdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata.rawAddress.toString(), ppauthdata.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr<Guid>, phcredentialimpersonationtoken: MutPtr<Long>, sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>, fsavetocredman: MutPtr<Bool>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress.toString(), phcredentialimpersonationtoken.rawAddress.toString(), sessionhandle.toInt(), ppeaperror.rawAddress.toString(), fsavetocredman.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr<Pwstr>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword.rawAddress.toString(), ppszencpassword.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, htokenimpersonateuser: Handle, pfinvokeui: MutPtr<Bool>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, dwuserdatasize: UInt, pbuserdata: ConstPtr<UByte>, pmethodpropertyarray: MutPtr<EapMethodPropertyArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr<EapMethodInfoArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr<EapAttributes>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr<EapHostPeerMethodResult>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr<UInt>, ppsendpacket: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket.rawAddress.toString(), ppsendpacket.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr<UInt>, ppuicontextdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata.rawAddress.toString(), ppuicontextdata.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInitialize(): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr<UByte>, pdwsizeofconfigout: MutPtr<UInt>, ppconfigout: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress.toString(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), pdwsizeofdatafrominteractiveui.rawAddress.toString(), ppdatafrominteractiveui.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: MutPtr<EapConfigInputFieldArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: MutPtr<EapInteractiveUiData>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapinteractiveuidata.rawAddress.toString(), ppeaperror.rawAddress.toString(), ppvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: ConstPtr<EapInteractiveUiData>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapinteractiveuidata.rawAddress.toString(), pdwsizeofdatafrominteractiveui.rawAddress.toString(), ppdatafrominteractiveui.rawAddress.toString(), ppeaperror.rawAddress.toString(), ppvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: ConstPtr<EapConfigInputFieldArray>, pdwuserblobsize: MutPtr<UInt>, ppbuserblob: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr<EapAttributes>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress.toString(), peapoutput.rawAddress.toString(), ppeaperror.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eapHostPeerUninitialize() {
    if (windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon != null) {
        windowsWin32SecurityExtensibleauthenticationprotocolNapiAddon.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
