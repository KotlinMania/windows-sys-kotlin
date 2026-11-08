package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public fun interface FnCallback {
    public operator fun invoke(connectionid: GUID, pcontextdata: Long)
}

public fun EapHostPeerBeginSession(dwflags: UInt, eaptype: EAP_METHOD_TYPE, pattributearray: Long, htokenimpersonateuser: HANDLE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, dwmaxsendpacketsize: UInt, pconnectionid: Long, func: NotificationHandler, pcontextdata: Long, psessionid: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerBeginSession", longArrayOf(dwflags.toLong(), run { val buf = ByteArray(16); buf[0] = eaptype.eapType.type.toByte(); buf[4] = (eaptype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eaptype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eaptype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eaptype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eaptype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eaptype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eaptype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eaptype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eaptype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eaptype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eaptype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eaptype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, pattributearray, htokenimpersonateuser, dwsizeofconnectiondata.toLong(), pconnectiondata, dwsizeofuserdata.toLong(), puserdata, dwmaxsendpacketsize.toLong(), pconnectionid, Win32DynamicFfi.objectSlot(func), pcontextdata, psessionid, ppeaperror)).toUInt()
}

public fun EapHostPeerClearConnection(pconnectionid: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerClearConnection", longArrayOf(pconnectionid, ppeaperror)).toUInt()
}

public fun EapHostPeerEndSession(sessionhandle: UInt, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerEndSession", longArrayOf(sessionhandle.toLong(), ppeaperror)).toUInt()
}

public fun EapHostPeerFreeEapError(peaperror: Long) {
    Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerFreeEapError", longArrayOf(peaperror))
}

public fun EapHostPeerFreeErrorMemory(peaperror: Long) {
    Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerFreeErrorMemory", longArrayOf(peaperror))
}

public fun EapHostPeerFreeMemory(pdata: Long) {
    Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerFreeMemory", longArrayOf(pdata))
}

public fun EapHostPeerFreeRuntimeMemory(pdata: Long) {
    Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerFreeRuntimeMemory", longArrayOf(pdata))
}

public fun EapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: Long, ppauthdata: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetAuthStatus", longArrayOf(sessionhandle.toLong(), authparam.toLong(), pcbauthdata, ppauthdata, ppeaperror)).toUInt()
}

public fun EapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: Long, phcredentialimpersonationtoken: Long, sessionhandle: UInt, ppeaperror: Long, fsavetocredman: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetDataToUnplumbCredentials", longArrayOf(pconnectionidthatlastsavedcreds, phcredentialimpersonationtoken, sessionhandle.toLong(), ppeaperror, fsavetocredman)).toUInt()
}

public fun EapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: PCWSTR, ppszencpassword: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetEncryptedPassword", longArrayOf(dwsizeofpassword.toLong(), szpassword, ppszencpassword)).toUInt()
}

public fun EapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, htokenimpersonateuser: HANDLE, pfinvokeui: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetIdentity", longArrayOf(dwversion.toLong(), dwflags.toLong(), run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwsizeofconnectiondata.toLong(), pconnectiondata, dwsizeofuserdata.toLong(), puserdata, htokenimpersonateuser, pfinvokeui, pdwsizeofuserdataout, ppuserdataout, ppwszidentity, ppeaperror, ppvreserved)).toUInt()
}

public fun EapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, huserimpersonationtoken: HANDLE, dweapconndatasize: UInt, pbeapconndata: Long, dwuserdatasize: UInt, pbuserdata: Long, pmethodpropertyarray: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerGetMethodProperties", longArrayOf(dwversion.toLong(), dwflags.toLong(), run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, huserimpersonationtoken, dweapconndatasize.toLong(), pbeapconndata, dwuserdatasize.toLong(), pbuserdata, pmethodpropertyarray, ppeaperror)).toUInt()
}

public fun EapHostPeerGetMethods(peapmethodinfoarray: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerGetMethods", longArrayOf(peapmethodinfoarray, ppeaperror)).toUInt()
}

public fun EapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetResponseAttributes", longArrayOf(sessionhandle.toLong(), pattribs, ppeaperror)).toUInt()
}

public fun EapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetResult", longArrayOf(sessionhandle.toLong(), reason.toLong(), ppresult, ppeaperror)).toUInt()
}

public fun EapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: Long, ppsendpacket: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetSendPacket", longArrayOf(sessionhandle.toLong(), pcbsendpacket, ppsendpacket, ppeaperror)).toUInt()
}

public fun EapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: Long, ppuicontextdata: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerGetUIContext", longArrayOf(sessionhandle.toLong(), pdwsizeofuicontextdata, ppuicontextdata, ppeaperror)).toUInt()
}

public fun EapHostPeerInitialize(): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerInitialize", longArrayOf()).toUInt()
}

public fun EapHostPeerInvokeConfigUI(hwndparent: HWND, dwflags: UInt, eapmethodtype: EAP_METHOD_TYPE, dwsizeofconfigin: UInt, pconfigin: Long, pdwsizeofconfigout: Long, ppconfigout: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerInvokeConfigUI", longArrayOf(hwndparent, dwflags.toLong(), run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwsizeofconfigin.toLong(), pconfigin, pdwsizeofconfigout, ppconfigout, ppeaperror)).toUInt()
}

public fun EapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, hwndparent: HWND, dwsizeofconnectiondata: UInt, pconnectiondata: Long, dwsizeofuserdata: UInt, puserdata: Long, pdwsizeofuserdataout: Long, ppuserdataout: Long, ppwszidentity: Long, ppeaperror: Long, ppvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerInvokeIdentityUI", longArrayOf(dwversion.toLong(), run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwflags.toLong(), hwndparent, dwsizeofconnectiondata.toLong(), pconnectiondata, dwsizeofuserdata.toLong(), puserdata, pdwsizeofuserdataout, ppuserdataout, ppwszidentity, ppeaperror, ppvreserved)).toUInt()
}

public fun EapHostPeerInvokeInteractiveUI(hwndparent: HWND, dwsizeofuicontextdata: UInt, puicontextdata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerInvokeInteractiveUI", longArrayOf(hwndparent, dwsizeofuicontextdata.toLong(), puicontextdata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror)).toUInt()
}

public fun EapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: Long, peapoutput: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerProcessReceivedPacket", longArrayOf(sessionhandle.toLong(), cbreceivepacket.toLong(), preceivepacket, peapoutput, ppeaperror)).toUInt()
}

public fun EapHostPeerQueryCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerQueryCredentialInputFields", longArrayOf(huserimpersonationtoken, run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwflags.toLong(), dweapconndatasize.toLong(), pbeapconndata, peapconfiginputfieldarray, ppeaperror)).toUInt()
}

public fun EapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, ppeaperror: Long, ppvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerQueryInteractiveUIInputFields", longArrayOf(dwversion.toLong(), dwflags.toLong(), dwsizeofuicontextdata.toLong(), puicontextdata, peapinteractiveuidata, ppeaperror, ppvreserved)).toUInt()
}

public fun EapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapinteractiveuidata: Long, pdwsizeofdatafrominteractiveui: Long, ppdatafrominteractiveui: Long, ppeaperror: Long, ppvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerQueryUIBlobFromInteractiveUIInputFields", longArrayOf(dwversion.toLong(), dwflags.toLong(), dwsizeofuicontextdata.toLong(), puicontextdata, peapinteractiveuidata, pdwsizeofdatafrominteractiveui, ppdatafrominteractiveui, ppeaperror, ppvreserved)).toUInt()
}

public fun EapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: HANDLE, eapmethodtype: EAP_METHOD_TYPE, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: Long, peapconfiginputfieldarray: Long, pdwuserblobsize: Long, ppbuserblob: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappcfg.dll", "EapHostPeerQueryUserBlobFromCredentialInputFields", longArrayOf(huserimpersonationtoken, run { val buf = ByteArray(16); buf[0] = eapmethodtype.eapType.type.toByte(); buf[4] = (eapmethodtype.eapType.dwVendorId.toInt() and 0xFF).toByte(); buf[5] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 8) and 0xFF).toByte(); buf[6] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 16) and 0xFF).toByte(); buf[7] = ((eapmethodtype.eapType.dwVendorId.toInt() ushr 24) and 0xFF).toByte(); buf[8] = (eapmethodtype.eapType.dwVendorType.toInt() and 0xFF).toByte(); buf[9] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 8) and 0xFF).toByte(); buf[10] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 16) and 0xFF).toByte(); buf[11] = ((eapmethodtype.eapType.dwVendorType.toInt() ushr 24) and 0xFF).toByte(); buf[12] = (eapmethodtype.dwAuthorId.toInt() and 0xFF).toByte(); buf[13] = ((eapmethodtype.dwAuthorId.toInt() ushr 8) and 0xFF).toByte(); buf[14] = ((eapmethodtype.dwAuthorId.toInt() ushr 16) and 0xFF).toByte(); buf[15] = ((eapmethodtype.dwAuthorId.toInt() ushr 24) and 0xFF).toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, dwflags.toLong(), dweapconndatasize.toLong(), pbeapconndata, peapconfiginputfieldarray, pdwuserblobsize, ppbuserblob, ppeaperror)).toUInt()
}

public fun EapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: Long, peapoutput: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerSetResponseAttributes", longArrayOf(sessionhandle.toLong(), pattribs, peapoutput, ppeaperror)).toUInt()
}

public fun EapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: Long, peapoutput: Long, ppeaperror: Long): UInt {
    return Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerSetUIContext", longArrayOf(sessionhandle.toLong(), dwsizeofuicontextdata.toLong(), puicontextdata, peapoutput, ppeaperror)).toUInt()
}

public fun EapHostPeerUninitialize() {
    Win32DynamicFfi.invoke("eappprxy.dll", "EapHostPeerUninitialize", longArrayOf())
}
