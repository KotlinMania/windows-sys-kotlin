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

public expect fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL

public expect fun WTSCloseServer(hserver: HANDLE)

public expect fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL

public expect fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL

public expect fun WTSCreateListenerA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL

public expect fun WTSCreateListenerW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL

public expect fun WTSDisconnectSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL

public expect fun WTSEnableChildSessions(benable: BOOL): BOOL

public expect fun WTSEnumerateListenersA(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL

public expect fun WTSEnumerateListenersW(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL

public expect fun WTSEnumerateProcessesA(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateProcessesExA(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateProcessesExW(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateProcessesW(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateSessionsA(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateSessionsExA(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateSessionsExW(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL

public expect fun WTSEnumerateSessionsW(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL

public expect fun WTSFreeMemory(pmemory: Long)

public expect fun WTSFreeMemoryExA(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL

public expect fun WTSFreeMemoryExW(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL

public expect fun WTSGetActiveConsoleSessionId(): UInt

public expect fun WTSGetChildSessionId(psessionid: Long): BOOL

public expect fun WTSGetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun WTSGetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL

public expect fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL

public expect fun WTSLogoffSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL

public expect fun WTSOpenServerA(pservername: PCSTR): HANDLE

public expect fun WTSOpenServerExA(pservername: PCSTR): HANDLE

public expect fun WTSOpenServerExW(pservername: PCWSTR): HANDLE

public expect fun WTSOpenServerW(pservername: PCWSTR): HANDLE

public expect fun WTSQueryListenerConfigA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL

public expect fun WTSQueryListenerConfigW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL

public expect fun WTSQuerySessionInformationA(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL

public expect fun WTSQuerySessionInformationW(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL

public expect fun WTSQueryUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL

public expect fun WTSQueryUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL

public expect fun WTSQueryUserToken(sessionid: UInt, phtoken: Long): BOOL

public expect fun WTSRegisterSessionNotification(hwnd: HWND, dwflags: UInt): BOOL

public expect fun WTSRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND, dwflags: UInt): BOOL

public expect fun WTSSendMessageA(hserver: HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL

public expect fun WTSSendMessageW(hserver: HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL

public expect fun WTSSetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun WTSSetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL

public expect fun WTSSetRenderHint(prenderhintid: Long, hwndowner: HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT

public expect fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL

public expect fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL

public expect fun WTSShutdownSystem(hserver: HANDLE, shutdownflag: UInt): BOOL

public expect fun WTSStartRemoteControlSessionA(ptargetservername: PCSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL

public expect fun WTSStartRemoteControlSessionW(ptargetservername: PCWSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL

public expect fun WTSStopRemoteControlSession(logonid: UInt): BOOL

public expect fun WTSTerminateProcess(hserver: HANDLE, processid: UInt, exitcode: UInt): BOOL

public expect fun WTSUnRegisterSessionNotification(hwnd: HWND): BOOL

public expect fun WTSUnRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND): BOOL

public expect fun WTSVirtualChannelClose(hchannelhandle: HANDLE): BOOL

public expect fun WTSVirtualChannelOpen(hserver: HANDLE, sessionid: UInt, pvirtualname: PCSTR): HANDLE

public expect fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): HANDLE

public expect fun WTSVirtualChannelPurgeInput(hchannelhandle: HANDLE): BOOL

public expect fun WTSVirtualChannelPurgeOutput(hchannelhandle: HANDLE): BOOL

public expect fun WTSVirtualChannelQuery(hchannelhandle: HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL

public expect fun WTSVirtualChannelRead(hchannelhandle: HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL

public expect fun WTSVirtualChannelWrite(hchannelhandle: HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL

public expect fun WTSWaitSystemEvent(hserver: HANDLE, eventmask: UInt, peventflags: Long): BOOL
