@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MESSAGEBOX_STYLE

private object WindowsWin32SystemRemotedesktopJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_ProcessIdToSessionId(dwprocessid: Int, psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSCloseServer(hserver: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSConnectSessionA(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSConnectSessionW(logonid: Int, targetlogonid: Int, ppassword: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSCreateListenerA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSCreateListenerW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long, flag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSDisconnectSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnableChildSessions(benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersA(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersW(hserver: Long, preserved: Long, reserved: Int, plisteners: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesA(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExA(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExW(hserver: Long, plevel: Long, sessionid: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesW(hserver: Long, reserved: Int, version: Int, ppprocessinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersA(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersW(pdomainname: Long, reserved: Int, version: Int, ppserverinfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsA(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExA(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExW(hserver: Long, plevel: Long, filter: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsW(hserver: Long, reserved: Int, version: Int, ppsessioninfo: Long, pcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSFreeMemory(pmemory: Long)

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExA(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExW(wtstypeclass: Int, pmemory: Long, numberofentries: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSGetActiveConsoleSessionId(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSGetChildSessionId(psessionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long, nlength: Int, lpnlengthneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSIsChildSessionsEnabled(pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSLogoffSession(hserver: Long, sessionid: Int, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSOpenServerA(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSOpenServerExA(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSOpenServerExW(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSOpenServerW(pservername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, pbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationA(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationW(hserver: Long, sessionid: Int, wtsinfoclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSQueryUserToken(sessionid: Int, phtoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotification(hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotificationEx(hserver: Long, hwnd: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSendMessageA(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSendMessageW(hserver: Long, sessionid: Int, ptitle: Long, titlelength: Int, pmessage: Long, messagelength: Int, style: Int, timeout: Int, presponse: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityA(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityW(hserver: Long, preserved: Long, reserved: Int, plistenername: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSetRenderHint(prenderhintid: Long, hwndowner: Long, renderhinttype: Int, cbhintdatalength: Int, phintdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigA(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigW(pservername: Long, pusername: Long, wtsconfigclass: Int, pbuffer: Long, datalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSShutdownSystem(hserver: Long, shutdownflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionA(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionW(ptargetservername: Long, targetlogonid: Int, hotkeyvk: Byte, hotkeymodifiers: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSStopRemoteControlSession(logonid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSTerminateProcess(hserver: Long, processid: Int, exitcode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotification(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotificationEx(hserver: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelClose(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpen(hserver: Long, sessionid: Int, pvirtualname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpenEx(sessionid: Int, pvirtualname: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeInput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeOutput(hchannelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelQuery(hchannelhandle: Long, param1: Int, ppbuffer: Long, pbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelRead(hchannelhandle: Long, timeout: Int, buffer: Long, buffersize: Int, pbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelWrite(hchannelhandle: Long, buffer: Long, length: Int, pbyteswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_remotedesktop_WTSWaitSystemEvent(hserver: Long, eventmask: Int, peventflags: Long): Int
}

public actual fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_ProcessIdToSessionId(dwprocessid.toInt(), psessionid)

public actual fun WTSCloseServer(hserver: HANDLE) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSCloseServer(hserver)
}

public actual fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), ppassword, bwait)

public actual fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), ppassword, bwait)

public actual fun WTSCreateListenerA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerA(hserver, preserved, reserved.toInt(), plistenername, pbuffer, flag.toInt())

public actual fun WTSCreateListenerW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerW(hserver, preserved, reserved.toInt(), plistenername, pbuffer, flag.toInt())

public actual fun WTSDisconnectSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSDisconnectSession(hserver, sessionid.toInt(), bwait)

public actual fun WTSEnableChildSessions(benable: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnableChildSessions(benable)

public actual fun WTSEnumerateListenersA(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersA(hserver, preserved, reserved.toInt(), plisteners, pcount)

public actual fun WTSEnumerateListenersW(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersW(hserver, preserved, reserved.toInt(), plisteners, pcount)

public actual fun WTSEnumerateProcessesA(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesA(hserver, reserved.toInt(), version.toInt(), ppprocessinfo, pcount)

public actual fun WTSEnumerateProcessesExA(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExA(hserver, plevel, sessionid.toInt(), ppprocessinfo, pcount)

public actual fun WTSEnumerateProcessesExW(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExW(hserver, plevel, sessionid.toInt(), ppprocessinfo, pcount)

public actual fun WTSEnumerateProcessesW(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesW(hserver, reserved.toInt(), version.toInt(), ppprocessinfo, pcount)

public actual fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersA(pdomainname, reserved.toInt(), version.toInt(), ppserverinfo, pcount)

public actual fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersW(pdomainname, reserved.toInt(), version.toInt(), ppserverinfo, pcount)

public actual fun WTSEnumerateSessionsA(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsA(hserver, reserved.toInt(), version.toInt(), ppsessioninfo, pcount)

public actual fun WTSEnumerateSessionsExA(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExA(hserver, plevel, filter.toInt(), ppsessioninfo, pcount)

public actual fun WTSEnumerateSessionsExW(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExW(hserver, plevel, filter.toInt(), ppsessioninfo, pcount)

public actual fun WTSEnumerateSessionsW(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsW(hserver, reserved.toInt(), version.toInt(), ppsessioninfo, pcount)

public actual fun WTSFreeMemory(pmemory: Long) {
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSFreeMemory(pmemory)
}

public actual fun WTSFreeMemoryExA(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExA(wtstypeclass, pmemory, numberofentries.toInt())

public actual fun WTSFreeMemoryExW(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExW(wtstypeclass, pmemory, numberofentries.toInt())

public actual fun WTSGetActiveConsoleSessionId(): UInt =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSGetActiveConsoleSessionId().toUInt()

public actual fun WTSGetChildSessionId(psessionid: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSGetChildSessionId(psessionid)

public actual fun WTSGetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityA(hserver, preserved, reserved.toInt(), plistenername, securityinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun WTSGetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityW(hserver, preserved, reserved.toInt(), plistenername, securityinformation.toInt(), psecuritydescriptor, nlength.toInt(), lpnlengthneeded)

public actual fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSIsChildSessionsEnabled(pbenabled)

public actual fun WTSLogoffSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSLogoffSession(hserver, sessionid.toInt(), bwait)

public actual fun WTSOpenServerA(pservername: PCSTR): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSOpenServerA(pservername)

public actual fun WTSOpenServerExA(pservername: PCSTR): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExA(pservername)

public actual fun WTSOpenServerExW(pservername: PCWSTR): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExW(pservername)

public actual fun WTSOpenServerW(pservername: PCWSTR): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSOpenServerW(pservername)

public actual fun WTSQueryListenerConfigA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigA(hserver, preserved, reserved.toInt(), plistenername, pbuffer)

public actual fun WTSQueryListenerConfigW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigW(hserver, preserved, reserved.toInt(), plistenername, pbuffer)

public actual fun WTSQuerySessionInformationA(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationA(hserver, sessionid.toInt(), wtsinfoclass, ppbuffer, pbytesreturned)

public actual fun WTSQuerySessionInformationW(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationW(hserver, sessionid.toInt(), wtsinfoclass, ppbuffer, pbytesreturned)

public actual fun WTSQueryUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigA(pservername, pusername, wtsconfigclass, ppbuffer, pbytesreturned)

public actual fun WTSQueryUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigW(pservername, pusername, wtsconfigclass, ppbuffer, pbytesreturned)

public actual fun WTSQueryUserToken(sessionid: UInt, phtoken: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSQueryUserToken(sessionid.toInt(), phtoken)

public actual fun WTSRegisterSessionNotification(hwnd: HWND, dwflags: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotification(hwnd, dwflags.toInt())

public actual fun WTSRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND, dwflags: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotificationEx(hserver, hwnd, dwflags.toInt())

public actual fun WTSSendMessageA(hserver: HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSendMessageA(hserver, sessionid.toInt(), ptitle, titlelength.toInt(), pmessage, messagelength.toInt(), style.toInt(), timeout.toInt(), presponse, bwait)

public actual fun WTSSendMessageW(hserver: HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSendMessageW(hserver, sessionid.toInt(), ptitle, titlelength.toInt(), pmessage, messagelength.toInt(), style.toInt(), timeout.toInt(), presponse, bwait)

public actual fun WTSSetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityA(hserver, preserved, reserved.toInt(), plistenername, securityinformation.toInt(), psecuritydescriptor)

public actual fun WTSSetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityW(hserver, preserved, reserved.toInt(), plistenername, securityinformation.toInt(), psecuritydescriptor)

public actual fun WTSSetRenderHint(prenderhintid: Long, hwndowner: HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSetRenderHint(prenderhintid, hwndowner, renderhinttype.toInt(), cbhintdatalength.toInt(), phintdata)

public actual fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigA(pservername, pusername, wtsconfigclass, pbuffer, datalength.toInt())

public actual fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigW(pservername, pusername, wtsconfigclass, pbuffer, datalength.toInt())

public actual fun WTSShutdownSystem(hserver: HANDLE, shutdownflag: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSShutdownSystem(hserver, shutdownflag.toInt())

public actual fun WTSStartRemoteControlSessionA(ptargetservername: PCSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionA(ptargetservername, targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun WTSStartRemoteControlSessionW(ptargetservername: PCWSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionW(ptargetservername, targetlogonid.toInt(), hotkeyvk.toByte(), hotkeymodifiers.toShort())

public actual fun WTSStopRemoteControlSession(logonid: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSStopRemoteControlSession(logonid.toInt())

public actual fun WTSTerminateProcess(hserver: HANDLE, processid: UInt, exitcode: UInt): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSTerminateProcess(hserver, processid.toInt(), exitcode.toInt())

public actual fun WTSUnRegisterSessionNotification(hwnd: HWND): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotification(hwnd)

public actual fun WTSUnRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotificationEx(hserver, hwnd)

public actual fun WTSVirtualChannelClose(hchannelhandle: HANDLE): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelClose(hchannelhandle)

public actual fun WTSVirtualChannelOpen(hserver: HANDLE, sessionid: UInt, pvirtualname: PCSTR): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpen(hserver, sessionid.toInt(), pvirtualname)

public actual fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): HANDLE =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpenEx(sessionid.toInt(), pvirtualname, flags.toInt())

public actual fun WTSVirtualChannelPurgeInput(hchannelhandle: HANDLE): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeInput(hchannelhandle)

public actual fun WTSVirtualChannelPurgeOutput(hchannelhandle: HANDLE): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeOutput(hchannelhandle)

public actual fun WTSVirtualChannelQuery(hchannelhandle: HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelQuery(hchannelhandle, param1, ppbuffer, pbytesreturned)

public actual fun WTSVirtualChannelRead(hchannelhandle: HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelRead(hchannelhandle, timeout.toInt(), buffer, buffersize.toInt(), pbytesread)

public actual fun WTSVirtualChannelWrite(hchannelhandle: HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelWrite(hchannelhandle, buffer, length.toInt(), pbyteswritten)

public actual fun WTSWaitSystemEvent(hserver: HANDLE, eventmask: UInt, peventflags: Long): BOOL =
    WindowsWin32SystemRemotedesktopJniBridge.windowssys_windows_win32_system_remotedesktop_WTSWaitSystemEvent(hserver, eventmask.toInt(), peventflags)
