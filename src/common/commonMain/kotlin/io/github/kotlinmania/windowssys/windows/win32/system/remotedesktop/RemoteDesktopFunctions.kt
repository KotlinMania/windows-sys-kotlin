package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ProcessIdToSessionId", longArrayOf(dwprocessid.toLong(), psessionid)).toInt()
}

public fun WTSCloseServer(hserver: HANDLE) {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCloseServer", longArrayOf(hserver))
}

public fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSConnectSessionA", longArrayOf(logonid.toLong(), targetlogonid.toLong(), ppassword, bwait.toLong())).toInt()
}

public fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSConnectSessionW", longArrayOf(logonid.toLong(), targetlogonid.toLong(), ppassword, bwait.toLong())).toInt()
}

public fun WTSCreateListenerA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCreateListenerA", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, pbuffer, flag.toLong())).toInt()
}

public fun WTSCreateListenerW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCreateListenerW", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, pbuffer, flag.toLong())).toInt()
}

public fun WTSDisconnectSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSDisconnectSession", longArrayOf(hserver, sessionid.toLong(), bwait.toLong())).toInt()
}

public fun WTSEnableChildSessions(benable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnableChildSessions", longArrayOf(benable.toLong())).toInt()
}

public fun WTSEnumerateListenersA(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateListenersA", longArrayOf(hserver, preserved, reserved.toLong(), plisteners, pcount)).toInt()
}

public fun WTSEnumerateListenersW(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateListenersW", longArrayOf(hserver, preserved, reserved.toLong(), plisteners, pcount)).toInt()
}

public fun WTSEnumerateProcessesA(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesA", longArrayOf(hserver, reserved.toLong(), version.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesExA(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesExA", longArrayOf(hserver, plevel, sessionid.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesExW(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesExW", longArrayOf(hserver, plevel, sessionid.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesW(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesW", longArrayOf(hserver, reserved.toLong(), version.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateServersA", longArrayOf(pdomainname, reserved.toLong(), version.toLong(), ppserverinfo, pcount)).toInt()
}

public fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateServersW", longArrayOf(pdomainname, reserved.toLong(), version.toLong(), ppserverinfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsA(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsA", longArrayOf(hserver, reserved.toLong(), version.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsExA(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsExA", longArrayOf(hserver, plevel, filter.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsExW(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsExW", longArrayOf(hserver, plevel, filter.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsW(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsW", longArrayOf(hserver, reserved.toLong(), version.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSFreeMemory(pmemory: Long) {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSFreeMemory", longArrayOf(pmemory))
}

public fun WTSFreeMemoryExA(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSFreeMemoryExA", longArrayOf(wtstypeclass.toLong(), pmemory, numberofentries.toLong())).toInt()
}

public fun WTSFreeMemoryExW(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSFreeMemoryExW", longArrayOf(wtstypeclass.toLong(), pmemory, numberofentries.toLong())).toInt()
}

public fun WTSGetActiveConsoleSessionId(): UInt {
    return Win32DynamicFfi.invoke("kernel32.dll", "WTSGetActiveConsoleSessionId", longArrayOf()).toUInt()
}

public fun WTSGetChildSessionId(psessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSGetChildSessionId", longArrayOf(psessionid)).toInt()
}

public fun WTSGetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSGetListenerSecurityA", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, securityinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun WTSGetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSGetListenerSecurityW", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, securityinformation.toLong(), psecuritydescriptor, nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSIsChildSessionsEnabled", longArrayOf(pbenabled)).toInt()
}

public fun WTSLogoffSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSLogoffSession", longArrayOf(hserver, sessionid.toLong(), bwait.toLong())).toInt()
}

public fun WTSOpenServerA(pservername: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerA", longArrayOf(pservername))
}

public fun WTSOpenServerExA(pservername: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerExA", longArrayOf(pservername))
}

public fun WTSOpenServerExW(pservername: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerExW", longArrayOf(pservername))
}

public fun WTSOpenServerW(pservername: PCWSTR): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerW", longArrayOf(pservername))
}

public fun WTSQueryListenerConfigA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryListenerConfigA", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, pbuffer)).toInt()
}

public fun WTSQueryListenerConfigW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryListenerConfigW", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, pbuffer)).toInt()
}

public fun WTSQuerySessionInformationA(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQuerySessionInformationA", longArrayOf(hserver, sessionid.toLong(), wtsinfoclass.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSQuerySessionInformationW(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQuerySessionInformationW", longArrayOf(hserver, sessionid.toLong(), wtsinfoclass.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSQueryUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryUserConfigA", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSQueryUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryUserConfigW", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSQueryUserToken(sessionid: UInt, phtoken: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryUserToken", longArrayOf(sessionid.toLong(), phtoken)).toInt()
}

public fun WTSRegisterSessionNotification(hwnd: HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSRegisterSessionNotification", longArrayOf(hwnd, dwflags.toLong())).toInt()
}

public fun WTSRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSRegisterSessionNotificationEx", longArrayOf(hserver, hwnd, dwflags.toLong())).toInt()
}

public fun WTSSendMessageA(hserver: HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSendMessageA", longArrayOf(hserver, sessionid.toLong(), ptitle, titlelength.toLong(), pmessage, messagelength.toLong(), style.toLong(), timeout.toLong(), presponse, bwait.toLong())).toInt()
}

public fun WTSSendMessageW(hserver: HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSendMessageW", longArrayOf(hserver, sessionid.toLong(), ptitle, titlelength.toLong(), pmessage, messagelength.toLong(), style.toLong(), timeout.toLong(), presponse, bwait.toLong())).toInt()
}

public fun WTSSetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetListenerSecurityA", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, securityinformation.toLong(), psecuritydescriptor)).toInt()
}

public fun WTSSetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetListenerSecurityW", longArrayOf(hserver, preserved, reserved.toLong(), plistenername, securityinformation.toLong(), psecuritydescriptor)).toInt()
}

public fun WTSSetRenderHint(prenderhintid: Long, hwndowner: HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetRenderHint", longArrayOf(prenderhintid, hwndowner, renderhinttype.toLong(), cbhintdatalength.toLong(), phintdata)).toInt()
}

public fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetUserConfigA", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), pbuffer, datalength.toLong())).toInt()
}

public fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetUserConfigW", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), pbuffer, datalength.toLong())).toInt()
}

public fun WTSShutdownSystem(hserver: HANDLE, shutdownflag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSShutdownSystem", longArrayOf(hserver, shutdownflag.toLong())).toInt()
}

public fun WTSStartRemoteControlSessionA(ptargetservername: PCSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSStartRemoteControlSessionA", longArrayOf(ptargetservername, targetlogonid.toLong(), hotkeyvk.toLong(), hotkeymodifiers.toLong())).toInt()
}

public fun WTSStartRemoteControlSessionW(ptargetservername: PCWSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSStartRemoteControlSessionW", longArrayOf(ptargetservername, targetlogonid.toLong(), hotkeyvk.toLong(), hotkeymodifiers.toLong())).toInt()
}

public fun WTSStopRemoteControlSession(logonid: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSStopRemoteControlSession", longArrayOf(logonid.toLong())).toInt()
}

public fun WTSTerminateProcess(hserver: HANDLE, processid: UInt, exitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSTerminateProcess", longArrayOf(hserver, processid.toLong(), exitcode.toLong())).toInt()
}

public fun WTSUnRegisterSessionNotification(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSUnRegisterSessionNotification", longArrayOf(hwnd)).toInt()
}

public fun WTSUnRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSUnRegisterSessionNotificationEx", longArrayOf(hserver, hwnd)).toInt()
}

public fun WTSVirtualChannelClose(hchannelhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelClose", longArrayOf(hchannelhandle)).toInt()
}

public fun WTSVirtualChannelOpen(hserver: HANDLE, sessionid: UInt, pvirtualname: PCSTR): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelOpen", longArrayOf(hserver, sessionid.toLong(), pvirtualname))
}

public fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): HANDLE {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelOpenEx", longArrayOf(sessionid.toLong(), pvirtualname, flags.toLong()))
}

public fun WTSVirtualChannelPurgeInput(hchannelhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelPurgeInput", longArrayOf(hchannelhandle)).toInt()
}

public fun WTSVirtualChannelPurgeOutput(hchannelhandle: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelPurgeOutput", longArrayOf(hchannelhandle)).toInt()
}

public fun WTSVirtualChannelQuery(hchannelhandle: HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelQuery", longArrayOf(hchannelhandle, param1.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSVirtualChannelRead(hchannelhandle: HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelRead", longArrayOf(hchannelhandle, timeout.toLong(), buffer, buffersize.toLong(), pbytesread)).toInt()
}

public fun WTSVirtualChannelWrite(hchannelhandle: HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelWrite", longArrayOf(hchannelhandle, buffer, length.toLong(), pbyteswritten)).toInt()
}

public fun WTSWaitSystemEvent(hserver: HANDLE, eventmask: UInt, peventflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSWaitSystemEvent", longArrayOf(hserver, eventmask.toLong(), peventflags)).toInt()
}
