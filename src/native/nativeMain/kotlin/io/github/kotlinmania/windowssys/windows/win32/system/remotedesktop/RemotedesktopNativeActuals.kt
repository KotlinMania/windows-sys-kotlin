@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_ProcessIdToSessionId(dwprocessid, psessionid.toCPointer<ByteVar>())

public actual fun WTSCloseServer(hserver: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSCloseServer(hserver.toCPointer<ByteVar>())
}

public actual fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionA(logonid, targetlogonid, ppassword.toCPointer<ByteVar>(), bwait)

public actual fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionW(logonid, targetlogonid, ppassword.toCPointer<ByteVar>(), bwait)

public actual fun WTSCreateListenerA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerA(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), flag)

public actual fun WTSCreateListenerW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerW(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>(), flag)

public actual fun WTSDisconnectSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSDisconnectSession(hserver.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun WTSEnableChildSessions(benable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnableChildSessions(benable)

public actual fun WTSEnumerateListenersA(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersA(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plisteners.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateListenersW(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersW(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plisteners.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateProcessesA(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesA(hserver.toCPointer<ByteVar>(), reserved, version, ppprocessinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateProcessesExA(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExA(hserver.toCPointer<ByteVar>(), plevel.toCPointer<ByteVar>(), sessionid, ppprocessinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateProcessesExW(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExW(hserver.toCPointer<ByteVar>(), plevel.toCPointer<ByteVar>(), sessionid, ppprocessinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateProcessesW(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesW(hserver.toCPointer<ByteVar>(), reserved, version, ppprocessinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersA(pdomainname.toCPointer<ByteVar>(), reserved, version, ppserverinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersW(pdomainname.toCPointer<ByteVar>(), reserved, version, ppserverinfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateSessionsA(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsA(hserver.toCPointer<ByteVar>(), reserved, version, ppsessioninfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateSessionsExA(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExA(hserver.toCPointer<ByteVar>(), plevel.toCPointer<ByteVar>(), filter, ppsessioninfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateSessionsExW(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExW(hserver.toCPointer<ByteVar>(), plevel.toCPointer<ByteVar>(), filter, ppsessioninfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSEnumerateSessionsW(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsW(hserver.toCPointer<ByteVar>(), reserved, version, ppsessioninfo.toCPointer<ByteVar>(), pcount.toCPointer<ByteVar>())

public actual fun WTSFreeMemory(pmemory: Long) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSFreeMemory(pmemory.toCPointer<ByteVar>())
}

public actual fun WTSFreeMemoryExA(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExA(wtstypeclass, pmemory.toCPointer<ByteVar>(), numberofentries)

public actual fun WTSFreeMemoryExW(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExW(wtstypeclass, pmemory.toCPointer<ByteVar>(), numberofentries)

public actual fun WTSGetActiveConsoleSessionId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSGetActiveConsoleSessionId()

public actual fun WTSGetChildSessionId(psessionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSGetChildSessionId(psessionid.toCPointer<ByteVar>())

public actual fun WTSGetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityA(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun WTSGetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityW(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>(), nlength, lpnlengthneeded.toCPointer<ByteVar>())

public actual fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSIsChildSessionsEnabled(pbenabled.toCPointer<ByteVar>())

public actual fun WTSLogoffSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSLogoffSession(hserver.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun WTSOpenServerA(pservername: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSOpenServerA(pservername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTSOpenServerExA(pservername: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExA(pservername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTSOpenServerExW(pservername: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExW(pservername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTSOpenServerW(pservername: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSOpenServerW(pservername.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTSQueryListenerConfigA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigA(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>())

public actual fun WTSQueryListenerConfigW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigW(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), pbuffer.toCPointer<ByteVar>())

public actual fun WTSQuerySessionInformationA(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationA(hserver.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer.toCPointer<ByteVar>(), pbytesreturned.toCPointer<ByteVar>())

public actual fun WTSQuerySessionInformationW(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationW(hserver.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer.toCPointer<ByteVar>(), pbytesreturned.toCPointer<ByteVar>())

public actual fun WTSQueryUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigA(pservername.toCPointer<ByteVar>(), pusername.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer.toCPointer<ByteVar>(), pbytesreturned.toCPointer<ByteVar>())

public actual fun WTSQueryUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigW(pservername.toCPointer<ByteVar>(), pusername.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer.toCPointer<ByteVar>(), pbytesreturned.toCPointer<ByteVar>())

public actual fun WTSQueryUserToken(sessionid: UInt, phtoken: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSQueryUserToken(sessionid, phtoken.toCPointer<ByteVar>())

public actual fun WTSRegisterSessionNotification(hwnd: HWND, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotification(hwnd.toCPointer<ByteVar>(), dwflags)

public actual fun WTSRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotificationEx(hserver.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), dwflags)

public actual fun WTSSendMessageA(hserver: HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSendMessageA(hserver.toCPointer<ByteVar>(), sessionid, ptitle.toCPointer<ByteVar>(), titlelength, pmessage.toCPointer<ByteVar>(), messagelength, style, timeout, presponse.toCPointer<ByteVar>(), bwait)

public actual fun WTSSendMessageW(hserver: HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSendMessageW(hserver.toCPointer<ByteVar>(), sessionid, ptitle.toCPointer<ByteVar>(), titlelength, pmessage.toCPointer<ByteVar>(), messagelength, style, timeout, presponse.toCPointer<ByteVar>(), bwait)

public actual fun WTSSetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityA(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun WTSSetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityW(hserver.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>(), reserved, plistenername.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun WTSSetRenderHint(prenderhintid: Long, hwndowner: HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSetRenderHint(prenderhintid.toCPointer<ByteVar>(), hwndowner.toCPointer<ByteVar>(), renderhinttype, cbhintdatalength, phintdata.toCPointer<ByteVar>())

public actual fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigA(pservername.toCPointer<ByteVar>(), pusername.toCPointer<ByteVar>(), wtsconfigclass, pbuffer.toCPointer<ByteVar>(), datalength)

public actual fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigW(pservername.toCPointer<ByteVar>(), pusername.toCPointer<ByteVar>(), wtsconfigclass, pbuffer.toCPointer<ByteVar>(), datalength)

public actual fun WTSShutdownSystem(hserver: HANDLE, shutdownflag: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSShutdownSystem(hserver.toCPointer<ByteVar>(), shutdownflag)

public actual fun WTSStartRemoteControlSessionA(ptargetservername: PCSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionA(ptargetservername.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun WTSStartRemoteControlSessionW(ptargetservername: PCWSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionW(ptargetservername.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun WTSStopRemoteControlSession(logonid: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSStopRemoteControlSession(logonid)

public actual fun WTSTerminateProcess(hserver: HANDLE, processid: UInt, exitcode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSTerminateProcess(hserver.toCPointer<ByteVar>(), processid, exitcode)

public actual fun WTSUnRegisterSessionNotification(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotification(hwnd.toCPointer<ByteVar>())

public actual fun WTSUnRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotificationEx(hserver.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelClose(hchannelhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelClose(hchannelhandle.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelOpen(hserver: HANDLE, sessionid: UInt, pvirtualname: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpen(hserver.toCPointer<ByteVar>(), sessionid, pvirtualname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpenEx(sessionid, pvirtualname.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun WTSVirtualChannelPurgeInput(hchannelhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeInput(hchannelhandle.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelPurgeOutput(hchannelhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeOutput(hchannelhandle.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelQuery(hchannelhandle: HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelQuery(hchannelhandle.toCPointer<ByteVar>(), param1, ppbuffer.toCPointer<ByteVar>(), pbytesreturned.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelRead(hchannelhandle: HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelRead(hchannelhandle.toCPointer<ByteVar>(), timeout, buffer.toCPointer<ByteVar>(), buffersize, pbytesread.toCPointer<ByteVar>())

public actual fun WTSVirtualChannelWrite(hchannelhandle: HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelWrite(hchannelhandle.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), length, pbyteswritten.toCPointer<ByteVar>())

public actual fun WTSWaitSystemEvent(hserver: HANDLE, eventmask: UInt, peventflags: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_WTSWaitSystemEvent(hserver.toCPointer<ByteVar>(), eventmask, peventflags.toCPointer<ByteVar>())
