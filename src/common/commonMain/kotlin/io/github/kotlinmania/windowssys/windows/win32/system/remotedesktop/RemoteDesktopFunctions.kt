package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR

public fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "ProcessIdToSessionId", longArrayOf(dwprocessid.toLong(), psessionid)).toInt()
}

public fun WTSCloseServer(hserver: Foundation.HANDLE) {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCloseServer", longArrayOf(Win32DynamicFfi.objectSlot(hserver)))
}

public fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSConnectSessionA", longArrayOf(logonid.toLong(), targetlogonid.toLong(), ppassword, bwait.toLong())).toInt()
}

public fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSConnectSessionW", longArrayOf(logonid.toLong(), targetlogonid.toLong(), ppassword, bwait.toLong())).toInt()
}

public fun WTSCreateListenerA(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCreateListenerA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, pbuffer, flag.toLong())).toInt()
}

public fun WTSCreateListenerW(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSCreateListenerW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, pbuffer, flag.toLong())).toInt()
}

public fun WTSDisconnectSession(hserver: Foundation.HANDLE, sessionid: UInt, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSDisconnectSession", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), bwait.toLong())).toInt()
}

public fun WTSEnableChildSessions(benable: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnableChildSessions", longArrayOf(benable.toLong())).toInt()
}

public fun WTSEnumerateListenersA(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateListenersA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plisteners, pcount)).toInt()
}

public fun WTSEnumerateListenersW(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateListenersW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plisteners, pcount)).toInt()
}

public fun WTSEnumerateProcessesA(hserver: Foundation.HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), reserved.toLong(), version.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesExA(hserver: Foundation.HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesExA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), plevel, sessionid.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesExW(hserver: Foundation.HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesExW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), plevel, sessionid.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateProcessesW(hserver: Foundation.HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateProcessesW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), reserved.toLong(), version.toLong(), ppprocessinfo, pcount)).toInt()
}

public fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateServersA", longArrayOf(pdomainname, reserved.toLong(), version.toLong(), ppserverinfo, pcount)).toInt()
}

public fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateServersW", longArrayOf(pdomainname, reserved.toLong(), version.toLong(), ppserverinfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsA(hserver: Foundation.HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), reserved.toLong(), version.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsExA(hserver: Foundation.HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsExA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), plevel, filter.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsExW(hserver: Foundation.HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsExW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), plevel, filter.toLong(), ppsessioninfo, pcount)).toInt()
}

public fun WTSEnumerateSessionsW(hserver: Foundation.HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSEnumerateSessionsW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), reserved.toLong(), version.toLong(), ppsessioninfo, pcount)).toInt()
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

public fun WTSGetListenerSecurityA(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSGetListenerSecurityA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor), nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun WTSGetListenerSecurityW(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSGetListenerSecurityW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor), nlength.toLong(), lpnlengthneeded)).toInt()
}

public fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSIsChildSessionsEnabled", longArrayOf(pbenabled)).toInt()
}

public fun WTSLogoffSession(hserver: Foundation.HANDLE, sessionid: UInt, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSLogoffSession", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), bwait.toLong())).toInt()
}

public fun WTSOpenServerA(pservername: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerA", longArrayOf(pservername))
    return Foundation.HANDLE()
}

public fun WTSOpenServerExA(pservername: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerExA", longArrayOf(pservername))
    return Foundation.HANDLE()
}

public fun WTSOpenServerExW(pservername: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerExW", longArrayOf(pservername))
    return Foundation.HANDLE()
}

public fun WTSOpenServerW(pservername: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSOpenServerW", longArrayOf(pservername))
    return Foundation.HANDLE()
}

public fun WTSQueryListenerConfigA(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryListenerConfigA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, pbuffer)).toInt()
}

public fun WTSQueryListenerConfigW(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQueryListenerConfigW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, pbuffer)).toInt()
}

public fun WTSQuerySessionInformationA(hserver: Foundation.HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQuerySessionInformationA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), wtsinfoclass.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSQuerySessionInformationW(hserver: Foundation.HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSQuerySessionInformationW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), wtsinfoclass.toLong(), ppbuffer, pbytesreturned)).toInt()
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

public fun WTSRegisterSessionNotification(hwnd: Foundation.HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSRegisterSessionNotification", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwflags.toLong())).toInt()
}

public fun WTSRegisterSessionNotificationEx(hserver: Foundation.HANDLE, hwnd: Foundation.HWND, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSRegisterSessionNotificationEx", longArrayOf(Win32DynamicFfi.objectSlot(hserver), Win32DynamicFfi.objectSlot(hwnd), dwflags.toLong())).toInt()
}

public fun WTSSendMessageA(hserver: Foundation.HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: UI.WindowsAndMessaging.MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSendMessageA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), ptitle, titlelength.toLong(), pmessage, messagelength.toLong(), Win32DynamicFfi.objectSlot(style), timeout.toLong(), presponse, bwait.toLong())).toInt()
}

public fun WTSSendMessageW(hserver: Foundation.HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: UI.WindowsAndMessaging.MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSendMessageW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), ptitle, titlelength.toLong(), pmessage, messagelength.toLong(), Win32DynamicFfi.objectSlot(style), timeout.toLong(), presponse, bwait.toLong())).toInt()
}

public fun WTSSetListenerSecurityA(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetListenerSecurityA", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toInt()
}

public fun WTSSetListenerSecurityW(hserver: Foundation.HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetListenerSecurityW", longArrayOf(Win32DynamicFfi.objectSlot(hserver), preserved, reserved.toLong(), plistenername, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toInt()
}

public fun WTSSetRenderHint(prenderhintid: Long, hwndowner: Foundation.HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetRenderHint", longArrayOf(prenderhintid, Win32DynamicFfi.objectSlot(hwndowner), renderhinttype.toLong(), cbhintdatalength.toLong(), phintdata)).toInt()
}

public fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetUserConfigA", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), pbuffer, datalength.toLong())).toInt()
}

public fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSSetUserConfigW", longArrayOf(pservername, pusername, wtsconfigclass.toLong(), pbuffer, datalength.toLong())).toInt()
}

public fun WTSShutdownSystem(hserver: Foundation.HANDLE, shutdownflag: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSShutdownSystem", longArrayOf(Win32DynamicFfi.objectSlot(hserver), shutdownflag.toLong())).toInt()
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

public fun WTSTerminateProcess(hserver: Foundation.HANDLE, processid: UInt, exitcode: UInt): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSTerminateProcess", longArrayOf(Win32DynamicFfi.objectSlot(hserver), processid.toLong(), exitcode.toLong())).toInt()
}

public fun WTSUnRegisterSessionNotification(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSUnRegisterSessionNotification", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun WTSUnRegisterSessionNotificationEx(hserver: Foundation.HANDLE, hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSUnRegisterSessionNotificationEx", longArrayOf(Win32DynamicFfi.objectSlot(hserver), Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun WTSVirtualChannelClose(hchannelhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelClose", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle))).toInt()
}

public fun WTSVirtualChannelOpen(hserver: Foundation.HANDLE, sessionid: UInt, pvirtualname: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelOpen", longArrayOf(Win32DynamicFfi.objectSlot(hserver), sessionid.toLong(), pvirtualname))
    return Foundation.HANDLE()
}

public fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): Foundation.HANDLE {
    Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelOpenEx", longArrayOf(sessionid.toLong(), pvirtualname, flags.toLong()))
    return Foundation.HANDLE()
}

public fun WTSVirtualChannelPurgeInput(hchannelhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelPurgeInput", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle))).toInt()
}

public fun WTSVirtualChannelPurgeOutput(hchannelhandle: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelPurgeOutput", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle))).toInt()
}

public fun WTSVirtualChannelQuery(hchannelhandle: Foundation.HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelQuery", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle), param1.toLong(), ppbuffer, pbytesreturned)).toInt()
}

public fun WTSVirtualChannelRead(hchannelhandle: Foundation.HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelRead", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle), timeout.toLong(), buffer, buffersize.toLong(), pbytesread)).toInt()
}

public fun WTSVirtualChannelWrite(hchannelhandle: Foundation.HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSVirtualChannelWrite", longArrayOf(Win32DynamicFfi.objectSlot(hchannelhandle), buffer, length.toLong(), pbyteswritten)).toInt()
}

public fun WTSWaitSystemEvent(hserver: Foundation.HANDLE, eventmask: UInt, peventflags: Long): BOOL {
    return Win32DynamicFfi.invoke("wtsapi32.dll", "WTSWaitSystemEvent", longArrayOf(Win32DynamicFfi.objectSlot(hserver), eventmask.toLong(), peventflags)).toInt()
}
