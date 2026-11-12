@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.extensibleauthenticationprotocol

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
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

public actual fun eapHostPeerBeginSession(dwflags: UInt, eaptype: EapMethodType, pattributearray: ConstPtr, htokenimpersonateuser: Handle, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, dwmaxsendpacketsize: UInt, pconnectionid: ConstPtr, func: NotificationHandler, pcontextdata: MutPtr, psessionid: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerClearConnection(pconnectionid: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerClearConnection(pconnectionid.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerEndSession(sessionhandle: UInt, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerEndSession(sessionhandle.toInt(), ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerFreeEapError(peaperror: MutPtr) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeEapError(peaperror.rawAddress)
}

public actual fun eapHostPeerFreeErrorMemory(peaperror: MutPtr) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeErrorMemory(peaperror.rawAddress)
}

public actual fun eapHostPeerFreeMemory(pdata: MutPtr) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeMemory(pdata.rawAddress)
}

public actual fun eapHostPeerFreeRuntimeMemory(pdata: MutPtr) {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerFreeRuntimeMemory(pdata.rawAddress)
}

public actual fun eapHostPeerGetAuthStatus(sessionhandle: UInt, authparam: EapHostPeerAuthParams, pcbauthdata: MutPtr, ppauthdata: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetAuthStatus(sessionhandle.toInt(), authparam, pcbauthdata.rawAddress, ppauthdata.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds: MutPtr, phcredentialimpersonationtoken: MutPtr, sessionhandle: UInt, ppeaperror: MutPtr, fsavetocredman: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetDataToUnplumbCredentials(pconnectionidthatlastsavedcreds.rawAddress, phcredentialimpersonationtoken.rawAddress, sessionhandle.toInt(), ppeaperror.rawAddress, fsavetocredman.rawAddress).toUInt()

public actual fun eapHostPeerGetEncryptedPassword(dwsizeofpassword: UInt, szpassword: Pcwstr, ppszencpassword: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetEncryptedPassword(dwsizeofpassword.toInt(), szpassword.rawAddress, ppszencpassword.rawAddress).toUInt()

public actual fun eapHostPeerGetIdentity(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, htokenimpersonateuser: Handle, pfinvokeui: MutPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    0u

public actual fun eapHostPeerGetMethodProperties(dwversion: UInt, dwflags: UInt, eapmethodtype: EapMethodType, huserimpersonationtoken: Handle, dweapconndatasize: UInt, pbeapconndata: ConstPtr, dwuserdatasize: UInt, pbuserdata: ConstPtr, pmethodpropertyarray: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerGetMethods(peapmethodinfoarray: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetMethods(peapmethodinfoarray.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetResponseAttributes(sessionhandle: UInt, pattribs: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetResult(sessionhandle: UInt, reason: EapHostPeerMethodResultReason, ppresult: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetResult(sessionhandle.toInt(), reason, ppresult.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetSendPacket(sessionhandle: UInt, pcbsendpacket: MutPtr, ppsendpacket: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetSendPacket(sessionhandle.toInt(), pcbsendpacket.rawAddress, ppsendpacket.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerGetUIContext(sessionhandle: UInt, pdwsizeofuicontextdata: MutPtr, ppuicontextdata: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerGetUIContext(sessionhandle.toInt(), pdwsizeofuicontextdata.rawAddress, ppuicontextdata.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerInitialize(): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInitialize().toUInt()

public actual fun eapHostPeerInvokeConfigUI(hwndparent: Hwnd, dwflags: UInt, eapmethodtype: EapMethodType, dwsizeofconfigin: UInt, pconfigin: ConstPtr, pdwsizeofconfigout: MutPtr, ppconfigout: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerInvokeIdentityUI(dwversion: UInt, eapmethodtype: EapMethodType, dwflags: UInt, hwndparent: Hwnd, dwsizeofconnectiondata: UInt, pconnectiondata: ConstPtr, dwsizeofuserdata: UInt, puserdata: ConstPtr, pdwsizeofuserdataout: MutPtr, ppuserdataout: MutPtr, ppwszidentity: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    0u

public actual fun eapHostPeerInvokeInteractiveUI(hwndparent: Hwnd, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerInvokeInteractiveUI(hwndparent.rawAddress, dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, pdwsizeofdatafrominteractiveui.rawAddress, ppdatafrominteractiveui.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerProcessReceivedPacket(sessionhandle: UInt, cbreceivepacket: UInt, preceivepacket: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerProcessReceivedPacket(sessionhandle.toInt(), cbreceivepacket.toInt(), preceivepacket.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerQueryCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerQueryInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapinteractiveuidata.rawAddress, ppeaperror.rawAddress, ppvreserved.rawAddress).toUInt()

public actual fun eapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion: UInt, dwflags: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapinteractiveuidata: ConstPtr, pdwsizeofdatafrominteractiveui: MutPtr, ppdatafrominteractiveui: MutPtr, ppeaperror: MutPtr, ppvreserved: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerQueryUIBlobFromInteractiveUIInputFields(dwversion.toInt(), dwflags.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapinteractiveuidata.rawAddress, pdwsizeofdatafrominteractiveui.rawAddress, ppdatafrominteractiveui.rawAddress, ppeaperror.rawAddress, ppvreserved.rawAddress).toUInt()

public actual fun eapHostPeerQueryUserBlobFromCredentialInputFields(huserimpersonationtoken: Handle, eapmethodtype: EapMethodType, dwflags: UInt, dweapconndatasize: UInt, pbeapconndata: ConstPtr, peapconfiginputfieldarray: ConstPtr, pdwuserblobsize: MutPtr, ppbuserblob: MutPtr, ppeaperror: MutPtr): UInt =
    0u

public actual fun eapHostPeerSetResponseAttributes(sessionhandle: UInt, pattribs: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetResponseAttributes(sessionhandle.toInt(), pattribs.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerSetUIContext(sessionhandle: UInt, dwsizeofuicontextdata: UInt, puicontextdata: ConstPtr, peapoutput: MutPtr, ppeaperror: MutPtr): UInt =
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerSetUIContext(sessionhandle.toInt(), dwsizeofuicontextdata.toInt(), puicontextdata.rawAddress, peapoutput.rawAddress, ppeaperror.rawAddress).toUInt()

public actual fun eapHostPeerUninitialize() {
    WindowsWin32SecurityExtensibleauthenticationprotocolJniBridge.windowssysWindowsWin32SecurityExtensibleauthenticationprotocolEapHostPeerUninitialize()
}
