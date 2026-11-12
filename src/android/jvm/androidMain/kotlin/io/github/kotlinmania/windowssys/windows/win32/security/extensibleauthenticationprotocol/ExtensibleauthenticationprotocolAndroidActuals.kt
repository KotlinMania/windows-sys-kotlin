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

private object WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle: Int, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle: Int, authparam: Int, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: Int, ppeaperror: Long, fsavetocredman: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword: Int, szpassword: Long, ppszencpassword: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle: Int, pattribs: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle: Int, reason: Int, ppresult: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle: Int, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle: Int, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent: Long, dwsizeofuicontextdata: Int, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle: Int, cbreceivepacket: Int, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: Int, dwflags: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle: Int, pattribs: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle: Int, dwsizeofuicontextdata: Int, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
}

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr<EapAttributes>, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr<Guid>, func: NotificationHandler, pcontextdata: MutPtr<CVoid>, psessionid: MutPtr<UInt>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr<Guid>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle.toInt(), ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr<EapError>) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress)
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr<EapError>) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress)
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr<UByte>) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress)
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr<UByte>) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress)
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr<UInt>, ppauthdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata.rawAddress, ppauthdata.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr<Guid>, phcredentialimpersonationtoken: MutPtr<Long>, sessionhandle: UInt, ppeaperror: MutPtr<MutPtr<EapError>>, fsavetocredman: MutPtr<Bool>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress, phcredentialimpersonationtoken.rawAddress, sessionhandle.toInt(), ppeaperror.rawAddress, fsavetocredman.rawAddress).toUInt()

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr<Pwstr>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword.rawAddress, ppszencpassword.rawAddress).toUInt()

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, htokenimpersonateuser: Handle, pfinvokeui: MutPtr<Bool>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<UByte>>): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, dwuserdatasize: UInt, pbuserdata: ConstPtr<UByte>, pmethodpropertyarray: MutPtr<EapMethodPropertyArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr<EapMethodInfoArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr<EapAttributes>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr<EapHostPeerMethodResult>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr<UInt>, ppsendpacket: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket.rawAddress, ppsendpacket.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr<UInt>, ppuicontextdata: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata.rawAddress, ppuicontextdata.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerInitialize(): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize().toUInt()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr<UByte>, pdwsizeofconfigout: MutPtr<UInt>, ppconfigout: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr<UByte>, dwsizeofuserdata: UInt, puserdata: ConstPtr<UByte>, pdwsizeofuserdataout: MutPtr<UInt>, ppuserdataout: MutPtr<MutPtr<UByte>>, ppwszidentity: MutPtr<Pwstr>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress, dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, pdwsizeofdatafrominteractiveui.rawAddress, ppdatafrominteractiveui.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: MutPtr<EapConfigInputFieldArray>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: MutPtr<EapInteractiveUiData>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapinteractiveuidata.rawAddress, ppeaperror.rawAddress, ppvreserved.rawAddress).toUInt()

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapinteractiveuidata: ConstPtr<EapInteractiveUiData>, pdwsizeofdatafrominteractiveui: MutPtr<UInt>, ppdatafrominteractiveui: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>, ppvreserved: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapinteractiveuidata.rawAddress, pdwsizeofdatafrominteractiveui.rawAddress, ppdatafrominteractiveui.rawAddress, ppeaperror.rawAddress, ppvreserved.rawAddress).toUInt()

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr<UByte>, peapconfiginputfieldarray: ConstPtr<EapConfigInputFieldArray>, pdwuserblobsize: MutPtr<UInt>, ppbuserblob: MutPtr<MutPtr<UByte>>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr<EapAttributes>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr<UByte>, peapoutput: MutPtr<EapHostPeerResponseAction>, ppeaperror: MutPtr<MutPtr<EapError>>): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerUninitialize() {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
}
