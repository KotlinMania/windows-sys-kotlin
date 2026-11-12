@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxResult
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

private object WindowsWin32SystemRemotedesktopJniBridge {
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
        val stream = WindowsWin32SystemRemotedesktopJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(dwprocessid: Int, psessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(hserver: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(psessionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(pbenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(pservername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(pservername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(pservername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(pservername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(sessionid: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(hserver: Long, hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(prenderhintid: Long, hwndowner: Long, renderhinttype: Int, cbhintdatalength: Int, phintdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(hserver: Long, shutdownflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(hserver: Long, processid: Int, exitcode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(hserver: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(hserver: Long, sessionid: Int, pvirtualname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(sessionid: Int, pvirtualname: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(hchannelhandle: Long, param1: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(hchannelhandle: Long, timeout: Int, buffer: Long, buffersize: Int, pbytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(hchannelhandle: Long, buffer: Long, length: Int, pbyteswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(hserver: Long, eventmask: Int, peventflags: Long): Int
}

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(dwprocessid.toInt(), psessionid.rawAddress)

public actual fun wTSCloseServer(hserver: Handle) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(hserver.rawAddress)
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress, bwait)

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress, bwait)

public actual fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr<Wtslistenerconfiga>, flag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, pbuffer.rawAddress, flag.toInt())

public actual fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr<Wtslistenerconfigw>, flag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, pbuffer.rawAddress, flag.toInt())

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(hserver.rawAddress, sessionid.toInt(), bwait)

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable)

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<Byte>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plisteners.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<UShort>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plisteners.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfoa>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(hserver.rawAddress, reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pstr>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(hserver.rawAddress, plevel.rawAddress, sessionid.toInt(), ppprocessinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pwstr>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(hserver.rawAddress, plevel.rawAddress, sessionid.toInt(), ppprocessinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfow>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(hserver.rawAddress, reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfoa>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(pdomainname.rawAddress, reserved.toInt(), version.toInt(), ppserverinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfow>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(pdomainname.rawAddress, reserved.toInt(), version.toInt(), ppserverinfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfoa>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(hserver.rawAddress, reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1a>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(hserver.rawAddress, plevel.rawAddress, filter.toInt(), ppsessioninfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1w>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(hserver.rawAddress, plevel.rawAddress, filter.toInt(), ppsessioninfo.rawAddress, pcount.rawAddress)

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfow>>, pcount: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(hserver.rawAddress, reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress, pcount.rawAddress)

public actual fun wTSFreeMemory(pmemory: MutPtr<CVoid>) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(pmemory.rawAddress)
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(wtstypeclass, pmemory.rawAddress, numberofentries.toInt())

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(wtstypeclass, pmemory.rawAddress, numberofentries.toInt())

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId().toUInt()

public actual fun wTSGetChildSessionId(psessionid: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(psessionid.rawAddress)

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress, nlength.toInt(), lpnlengthneeded.rawAddress)

public actual fun wTSIsChildSessionsEnabled(pbenabled: MutPtr<Bool>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(pbenabled.rawAddress)

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(hserver.rawAddress, sessionid.toInt(), bwait)

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(pservername.rawAddress))

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(pservername.rawAddress))

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(pservername.rawAddress))

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(pservername.rawAddress))

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr<Wtslistenerconfiga>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, pbuffer.rawAddress)

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr<Wtslistenerconfigw>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, pbuffer.rawAddress)

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(hserver.rawAddress, sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress, pbytesreturned.rawAddress)

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(hserver.rawAddress, sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress, pbytesreturned.rawAddress)

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(pservername.rawAddress, pusername.rawAddress, wtsconfigclass, ppbuffer.rawAddress, pbytesreturned.rawAddress)

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(pservername.rawAddress, pusername.rawAddress, wtsconfigclass, ppbuffer.rawAddress, pbytesreturned.rawAddress)

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr<Handle>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(sessionid.toInt(), phtoken.rawAddress)

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(hwnd.rawAddress, dwflags.toInt())

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(hserver.rawAddress, hwnd.rawAddress, dwflags.toInt())

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(hserver.rawAddress, sessionid.toInt(), ptitle.rawAddress, titlelength.toInt(), pmessage.rawAddress, messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress, bwait)

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(hserver.rawAddress, sessionid.toInt(), ptitle.rawAddress, titlelength.toInt(), pmessage.rawAddress, messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress, bwait)

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(hserver.rawAddress, preserved.rawAddress, reserved.toInt(), plistenername.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun wTSSetRenderHint(prenderhintid: MutPtr<ULong>, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr<UByte>): Hresult =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(prenderhintid.rawAddress, hwndowner.rawAddress, renderhinttype.toInt(), cbhintdatalength.toInt(), phintdata.rawAddress)

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(pservername.rawAddress, pusername.rawAddress, wtsconfigclass, pbuffer.rawAddress, datalength.toInt())

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(pservername.rawAddress, pusername.rawAddress, wtsconfigclass, pbuffer.rawAddress, datalength.toInt())

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(hserver.rawAddress, shutdownflag.toInt())

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(ptargetservername.rawAddress, targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(ptargetservername.rawAddress, targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid.toInt())

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(hserver.rawAddress, processid.toInt(), exitcode.toInt())

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(hwnd.rawAddress)

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(hserver.rawAddress, hwnd.rawAddress)

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(hchannelhandle.rawAddress)

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(hserver.rawAddress, sessionid.toInt(), pvirtualname.rawAddress))

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    MutPtr(WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(sessionid.toInt(), pvirtualname.rawAddress, flags.toInt()))

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(hchannelhandle.rawAddress)

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(hchannelhandle.rawAddress)

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr<MutPtr<CVoid>>, pbytesreturned: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(hchannelhandle.rawAddress, param1, ppbuffer.rawAddress, pbytesreturned.rawAddress)

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(hchannelhandle.rawAddress, timeout.toInt(), buffer.rawAddress, buffersize.toInt(), pbytesread.rawAddress)

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(hchannelhandle.rawAddress, buffer.rawAddress, length.toInt(), pbyteswritten.rawAddress)

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr<UInt>): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(hserver.rawAddress, eventmask.toInt(), peventflags.rawAddress)
