@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(sessionhandle: Int, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError(peaperror: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory(peaperror: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory(pdata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(sessionhandle: Int, authparam: Int, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: Int, ppeaperror: Long, fsavetocredman: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(dwsizeofpassword: Int, szpassword: Long, ppszencpassword: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(sessionhandle: Int, pattribs: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(sessionhandle: Int, reason: Int, ppresult: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(sessionhandle: Int, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(sessionhandle: Int, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI(hwndparent: Long, dwsizeofuicontextdata: Int, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(sessionhandle: Int, cbreceivepacket: Int, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(sessionhandle: Int, pattribs: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(sessionhandle: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()
}

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: COpaquePointer?, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, dwmaxsendpacketsize: UInt, pconnectionid: COpaquePointer?, func: NotificationHandler, pcontextdata: COpaquePointer?, psessionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerClearConnection((pconnectionid?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerEndSession(sessionhandle.toInt(), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerFreeEapError(peaperror: COpaquePointer?) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeEapError((peaperror?.value ?: 0L))
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: COpaquePointer?) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeErrorMemory((peaperror?.value ?: 0L))
}

public actual fun eapHostPeerFreeMemory(pdata: COpaquePointer?) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeMemory((pdata?.value ?: 0L))
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: COpaquePointer?) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerFreeRuntimeMemory((pdata?.value ?: 0L))
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: COpaquePointer?, ppauthdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, (pcbauthdata?.value ?: 0L), (ppauthdata?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: COpaquePointer?, phcredentialimpersonationtoken: COpaquePointer?, sessionhandle: UInt, ppeaperror: COpaquePointer?, fsavetocredman: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetDataToUnplumbCredentials((pconnectionidthatlastsavedcreds?.value ?: 0L), (phcredentialimpersonationtoken?.value ?: 0L), sessionhandle.toInt(), (ppeaperror?.value ?: 0L), (fsavetocredman?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), (szpassword?.value ?: 0L), (ppszencpassword?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, htokenimpersonateuser: Handle, pfinvokeui: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, dwuserdatasize: UInt, pbuserdata: COpaquePointer?, pmethodpropertyarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetMethods((peapmethodinfoarray?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetResult(sessionhandle.toInt(), reason, (ppresult?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: COpaquePointer?, ppsendpacket: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetSendPacket(sessionhandle.toInt(), (pcbsendpacket?.value ?: 0L), (ppsendpacket?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: COpaquePointer?, ppuicontextdata: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerGetUIContext(sessionhandle.toInt(), (pdwsizeofuicontextdata?.value ?: 0L), (ppuicontextdata?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerInitialize(): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInitialize().toUInt()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: COpaquePointer?, pdwsizeofconfigout: COpaquePointer?, ppconfigout: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: COpaquePointer?, dwsizeofuserdata: UInt, puserdata: COpaquePointer?, pdwsizeofuserdataout: COpaquePointer?, ppuserdataout: COpaquePointer?, ppwszidentity: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerInvokeInteractiveUI((hwndparent?.value ?: 0L), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L), (pdwsizeofdatafrominteractiveui?.value ?: 0L), (ppdatafrominteractiveui?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), (preceivepacket?.value ?: 0L), (peapoutput?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L), (peapinteractiveuidata?.value ?: 0L), (ppeaperror?.value ?: 0L), (ppvreserved?.value ?: 0L)).toUInt()

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapinteractiveuidata: COpaquePointer?, pdwsizeofdatafrominteractiveui: COpaquePointer?, ppdatafrominteractiveui: COpaquePointer?, ppeaperror: COpaquePointer?, ppvreserved: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L), (peapinteractiveuidata?.value ?: 0L), (pdwsizeofdatafrominteractiveui?.value ?: 0L), (ppdatafrominteractiveui?.value ?: 0L), (ppeaperror?.value ?: 0L), (ppvreserved?.value ?: 0L)).toUInt()

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: COpaquePointer?, peapconfiginputfieldarray: COpaquePointer?, pdwuserblobsize: COpaquePointer?, ppbuserblob: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetResponseAttributes(sessionhandle.toInt(), (pattribs?.value ?: 0L), (peapoutput?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: COpaquePointer?, peapoutput: COpaquePointer?, ppeaperror: COpaquePointer?): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), (puicontextdata?.value ?: 0L), (peapoutput?.value ?: 0L), (ppeaperror?.value ?: 0L)).toUInt()

public actual fun eapHostPeerUninitialize() {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssys_windows_win32_security_extensibleauthenticationprotocol_eapHostPeerUninitialize()
}
