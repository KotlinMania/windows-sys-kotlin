@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

private object WindowsWin32SystemRemotedesktopJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_processIdToSessionId(dwprocessid: Int, psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSCloseServer(hserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId(psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled(pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSLogoffSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSOpenServerA(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSOpenServerW(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(sessionid: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx(hserver: Long, hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSendMessageA(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSendMessageW(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint(prenderhintid: Long, hwndowner: Long, renderhinttype: Int, cbhintdatalength: Int, phintdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem(hserver: Long, shutdownflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(logonid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess(hserver: Long, processid: Int, exitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx(hserver: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen(hserver: Long, sessionid: Int, pvirtualname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(sessionid: Int, pvirtualname: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery(hchannelhandle: Long, param1: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead(hchannelhandle: Long, timeout: Int, buffer: Long, buffersize: Int, pbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite(hchannelhandle: Long, buffer: Long, length: Int, pbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent(hserver: Long, eventmask: Int, peventflags: Long): Int
}

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_processIdToSessionId(dwprocessid.toInt(), (psessionid?.value ?: 0L))

public actual fun wTSCloseServer(hserver: Handle) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSCloseServer((hserver?.value ?: 0L))
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), (ppassword?.value ?: 0L), bwait)

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), (ppassword?.value ?: 0L), bwait)

public actual fun wTSCreateListenerA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), (pbuffer?.value ?: 0L), flag.toInt())

public actual fun wTSCreateListenerW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), (pbuffer?.value ?: 0L), flag.toInt())

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession((hserver?.value ?: 0L), sessionid.toInt(), bwait)

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(benable)

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plisteners?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plisteners?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA((hserver?.value ?: 0L), reserved.toInt(), version.toInt(), (ppprocessinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA((hserver?.value ?: 0L), (plevel?.value ?: 0L), sessionid.toInt(), (ppprocessinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW((hserver?.value ?: 0L), (plevel?.value ?: 0L), sessionid.toInt(), (ppprocessinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW((hserver?.value ?: 0L), reserved.toInt(), version.toInt(), (ppprocessinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA((pdomainname?.value ?: 0L), reserved.toInt(), version.toInt(), (ppserverinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW((pdomainname?.value ?: 0L), reserved.toInt(), version.toInt(), (ppserverinfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA((hserver?.value ?: 0L), reserved.toInt(), version.toInt(), (ppsessioninfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA((hserver?.value ?: 0L), (plevel?.value ?: 0L), filter.toInt(), (ppsessioninfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW((hserver?.value ?: 0L), (plevel?.value ?: 0L), filter.toInt(), (ppsessioninfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW((hserver?.value ?: 0L), reserved.toInt(), version.toInt(), (ppsessioninfo?.value ?: 0L), (pcount?.value ?: 0L))

public actual fun wTSFreeMemory(pmemory: COpaquePointer?) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSFreeMemory((pmemory?.value ?: 0L))
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(wtstypeclass, (pmemory?.value ?: 0L), numberofentries.toInt())

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(wtstypeclass, (pmemory?.value ?: 0L), numberofentries.toInt())

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId().toUInt()

public actual fun wTSGetChildSessionId(psessionid: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId((psessionid?.value ?: 0L))

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L), nlength.toInt(), (lpnlengthneeded?.value ?: 0L))

public actual fun wTSIsChildSessionsEnabled(pbenabled: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled((pbenabled?.value ?: 0L))

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSLogoffSession((hserver?.value ?: 0L), sessionid.toInt(), bwait)

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSOpenServerA((pservername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA((pservername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW((pservername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSOpenServerW((pservername?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), (pbuffer?.value ?: 0L))

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), (pbuffer?.value ?: 0L))

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA((hserver?.value ?: 0L), sessionid.toInt(), wtsinfoclass, (ppbuffer?.value ?: 0L), (pbytesreturned?.value ?: 0L))

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW((hserver?.value ?: 0L), sessionid.toInt(), wtsinfoclass, (ppbuffer?.value ?: 0L), (pbytesreturned?.value ?: 0L))

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA((pservername?.value ?: 0L), (pusername?.value ?: 0L), wtsconfigclass, (ppbuffer?.value ?: 0L), (pbytesreturned?.value ?: 0L))

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW((pservername?.value ?: 0L), (pusername?.value ?: 0L), wtsconfigclass, (ppbuffer?.value ?: 0L), (pbytesreturned?.value ?: 0L))

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(sessionid.toInt(), (phtoken?.value ?: 0L))

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification((hwnd?.value ?: 0L), dwflags.toInt())

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx((hserver?.value ?: 0L), (hwnd?.value ?: 0L), dwflags.toInt())

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSendMessageA((hserver?.value ?: 0L), sessionid.toInt(), (ptitle?.value ?: 0L), titlelength.toInt(), (pmessage?.value ?: 0L), messagelength.toInt(), style.toInt(), timeout.toInt(), (presponse?.value ?: 0L), bwait)

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSendMessageW((hserver?.value ?: 0L), sessionid.toInt(), (ptitle?.value ?: 0L), titlelength.toInt(), (pmessage?.value ?: 0L), messagelength.toInt(), style.toInt(), timeout.toInt(), (presponse?.value ?: 0L), bwait)

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW((hserver?.value ?: 0L), (preserved?.value ?: 0L), reserved.toInt(), (plistenername?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun wTSSetRenderHint(prenderhintid: COpaquePointer?, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: COpaquePointer?): Hresult =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint((prenderhintid?.value ?: 0L), (hwndowner?.value ?: 0L), renderhinttype.toInt(), cbhintdatalength.toInt(), (phintdata?.value ?: 0L))

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA((pservername?.value ?: 0L), (pusername?.value ?: 0L), wtsconfigclass, (pbuffer?.value ?: 0L), datalength.toInt())

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW((pservername?.value ?: 0L), (pusername?.value ?: 0L), wtsconfigclass, (pbuffer?.value ?: 0L), datalength.toInt())

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem((hserver?.value ?: 0L), shutdownflag.toInt())

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA((ptargetservername?.value ?: 0L), targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW((ptargetservername?.value ?: 0L), targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(logonid.toInt())

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess((hserver?.value ?: 0L), processid.toInt(), exitcode.toInt())

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification((hwnd?.value ?: 0L))

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx((hserver?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose((hchannelhandle?.value ?: 0L))

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen((hserver?.value ?: 0L), sessionid.toInt(), (pvirtualname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(sessionid.toInt(), (pvirtualname?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput((hchannelhandle?.value ?: 0L))

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput((hchannelhandle?.value ?: 0L))

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery((hchannelhandle?.value ?: 0L), param1, (ppbuffer?.value ?: 0L), (pbytesreturned?.value ?: 0L))

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead((hchannelhandle?.value ?: 0L), timeout.toInt(), (buffer?.value ?: 0L), buffersize.toInt(), (pbytesread?.value ?: 0L))

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite((hchannelhandle?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (pbyteswritten?.value ?: 0L))

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: COpaquePointer?): Bool =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent((hserver?.value ?: 0L), eventmask.toInt(), (peventflags?.value ?: 0L))
