@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

private object WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession(sessionhandle: Int, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError(peaperror: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory(peaperror: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus(sessionhandle: Int, authparam: Int, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: Int, ppeaperror: Long, fsavetocredman: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword(dwsizeofpassword: Int, szpassword: Long, ppszencpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes(sessionhandle: Int, pattribs: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult(sessionhandle: Int, reason: Int, ppresult: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket(sessionhandle: Int, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext(sessionhandle: Int, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI(hwndparent: Long, dwsizeofuicontextdata: Int, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket(sessionhandle: Int, cbreceivepacket: Int, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes(sessionhandle: Int, pattribs: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext(sessionhandle: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize()
}

public actual fun EapHostPeerBeginSession(dwflags: UInt, eaptype: EAP_METHOD_TYPE, pattributearray: Long, htokenimpersonateuser: HANDLE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, dwmaxsendpacketsize: UInt, pconnectionid: Long, func: NotificationHandler, pcontextdata: Long, psessionid: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerClearConnection(pconnectionid, ppeaperror).toUInt()

public actual fun EapHostPeerEndSession(sessionhandle: UInt, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerEndSession(sessionhandle.toInt(), ppeaperror).toUInt()

public actual fun EapHostPeerFreeEapError(peaperror: Long) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeEapError(peaperror)
}

public actual fun EapHostPeerFreeErrorMemory(peaperror: Long) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeErrorMemory(peaperror)
}

public actual fun EapHostPeerFreeMemory(pdata: Long) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeMemory(pdata)
}

public actual fun EapHostPeerFreeRuntimeMemory(pdata: Long) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerFreeRuntimeMemory(pdata)
}

public actual fun EapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata, ppauthdata, ppeaperror).toUInt()

public actual fun EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: UInt, ppeaperror: Long, fsavetocredman: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds, phcredentialimpersonationtoken, sessionhandle.toInt(), ppeaperror, fsavetocredman).toUInt()

public actual fun EapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: PCWSTR, ppszencpassword: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword, ppszencpassword).toUInt()

public actual fun EapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, htokenimpersonateuser: HANDLE, pfinvokeui: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, huserimpersonationtoken: HANDLE, dweapconndatasize: UInt, pbeapconndata: Long, dwuserdatasize: UInt, pbuserdata: Long, pmethodpropertyarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetMethods(peapmethodinfoarray, ppeaperror).toUInt()

public actual fun EapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs, ppeaperror).toUInt()

public actual fun EapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult, ppeaperror).toUInt()

public actual fun EapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket, ppsendpacket, ppeaperror).toUInt()

public actual fun EapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata, ppuicontextdata, ppeaperror).toUInt()

public actual fun EapHostPeerInitialize(): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInitialize().toUInt()

public actual fun EapHostPeerInvokeConfigUI(hwndparent: HWND, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconfigin: UInt, pconfigin: Long, pdwsizeofconfigout: Long, ppconfigout: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, hwndparent: HWND, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    0u

public actual fun EapHostPeerInvokeInteractiveUI(hwndparent: HWND, dwsizeofuicontextdata: UInt, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerInvokeInteractiveUI(hwndparent, dwsizeofuicontextdata.toInt(), puicontextdata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror).toUInt()

public actual fun EapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket, peapoutput, ppeaperror).toUInt()

public actual fun EapHostPeerQueryCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata, peapinteractiveuidata, ppeaperror, ppvreserved).toUInt()

public actual fun EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata, peapinteractiveuidata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror, ppvreserved).toUInt()

public actual fun EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, pdwuserblobsize: Long, ppbuserblob: Long, ppeaperror: Long): UInt =
    0u

public actual fun EapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: Long, peapoutput: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs, peapoutput, ppeaperror).toUInt()

public actual fun EapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata, peapoutput, ppeaperror).toUInt()

public actual fun EapHostPeerUninitialize() {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_EapHostPeerUninitialize()
}
