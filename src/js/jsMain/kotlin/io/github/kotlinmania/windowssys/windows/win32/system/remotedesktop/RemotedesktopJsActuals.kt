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

private val _windowsWin32SystemRemotedesktopNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun ProcessIdToSessionId(dwprocessid: UInt, psessionid: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_ProcessIdToSessionId(dwprocessid.toInt(), psessionid.toString()) as Int) else 0

public actual fun WTSCloseServer(hserver: HANDLE) {
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) {
        _windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSCloseServer(hserver.toString())
    }
}

public actual fun WTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: PCSTR, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), ppassword.toString(), bwait) as Int) else 0

public actual fun WTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: PCWSTR, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), ppassword.toString(), bwait) as Int) else 0

public actual fun WTSCreateListenerA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long, flag: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerA(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), pbuffer.toString(), flag.toInt()) as Int) else 0

public actual fun WTSCreateListenerW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long, flag: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSCreateListenerW(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), pbuffer.toString(), flag.toInt()) as Int) else 0

public actual fun WTSDisconnectSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSDisconnectSession(hserver.toString(), sessionid.toInt(), bwait) as Int) else 0

public actual fun WTSEnableChildSessions(benable: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnableChildSessions(benable) as Int) else 0

public actual fun WTSEnumerateListenersA(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersA(hserver.toString(), preserved.toString(), reserved.toInt(), plisteners.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateListenersW(hserver: HANDLE, preserved: Long, reserved: UInt, plisteners: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateListenersW(hserver.toString(), preserved.toString(), reserved.toInt(), plisteners.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateProcessesA(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesA(hserver.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateProcessesExA(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExA(hserver.toString(), plevel.toString(), sessionid.toInt(), ppprocessinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateProcessesExW(hserver: HANDLE, plevel: Long, sessionid: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesExW(hserver.toString(), plevel.toString(), sessionid.toInt(), ppprocessinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateProcessesW(hserver: HANDLE, reserved: UInt, version: UInt, ppprocessinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateProcessesW(hserver.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateServersA(pdomainname: PCSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersA(pdomainname.toString(), reserved.toInt(), version.toInt(), ppserverinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateServersW(pdomainname: PCWSTR, reserved: UInt, version: UInt, ppserverinfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateServersW(pdomainname.toString(), reserved.toInt(), version.toInt(), ppserverinfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateSessionsA(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsA(hserver.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateSessionsExA(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExA(hserver.toString(), plevel.toString(), filter.toInt(), ppsessioninfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateSessionsExW(hserver: HANDLE, plevel: Long, filter: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsExW(hserver.toString(), plevel.toString(), filter.toInt(), ppsessioninfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSEnumerateSessionsW(hserver: HANDLE, reserved: UInt, version: UInt, ppsessioninfo: Long, pcount: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSEnumerateSessionsW(hserver.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.toString(), pcount.toString()) as Int) else 0

public actual fun WTSFreeMemory(pmemory: Long) {
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) {
        _windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSFreeMemory(pmemory.toString())
    }
}

public actual fun WTSFreeMemoryExA(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExA(wtstypeclass, pmemory.toString(), numberofentries.toInt()) as Int) else 0

public actual fun WTSFreeMemoryExW(wtstypeclass: WTS_TYPE_CLASS, pmemory: Long, numberofentries: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSFreeMemoryExW(wtstypeclass, pmemory.toString(), numberofentries.toInt()) as Int) else 0

public actual fun WTSGetActiveConsoleSessionId(): UInt =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSGetActiveConsoleSessionId() as Int).toUInt() else 0u

public actual fun WTSGetChildSessionId(psessionid: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSGetChildSessionId(psessionid.toString()) as Int) else 0

public actual fun WTSGetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityA(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), securityinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun WTSGetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, nlength: UInt, lpnlengthneeded: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSGetListenerSecurityW(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), securityinformation.toInt(), psecuritydescriptor.toString(), nlength.toInt(), lpnlengthneeded.toString()) as Int) else 0

public actual fun WTSIsChildSessionsEnabled(pbenabled: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSIsChildSessionsEnabled(pbenabled.toString()) as Int) else 0

public actual fun WTSLogoffSession(hserver: HANDLE, sessionid: UInt, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSLogoffSession(hserver.toString(), sessionid.toInt(), bwait) as Int) else 0

public actual fun WTSOpenServerA(pservername: PCSTR): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSOpenServerA(pservername.toString()) as String).toLong() else 0L

public actual fun WTSOpenServerExA(pservername: PCSTR): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExA(pservername.toString()) as String).toLong() else 0L

public actual fun WTSOpenServerExW(pservername: PCWSTR): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSOpenServerExW(pservername.toString()) as String).toLong() else 0L

public actual fun WTSOpenServerW(pservername: PCWSTR): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSOpenServerW(pservername.toString()) as String).toLong() else 0L

public actual fun WTSQueryListenerConfigA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, pbuffer: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigA(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), pbuffer.toString()) as Int) else 0

public actual fun WTSQueryListenerConfigW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, pbuffer: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQueryListenerConfigW(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), pbuffer.toString()) as Int) else 0

public actual fun WTSQuerySessionInformationA(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationA(hserver.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.toString(), pbytesreturned.toString()) as Int) else 0

public actual fun WTSQuerySessionInformationW(hserver: HANDLE, sessionid: UInt, wtsinfoclass: WTS_INFO_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQuerySessionInformationW(hserver.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.toString(), pbytesreturned.toString()) as Int) else 0

public actual fun WTSQueryUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigA(pservername.toString(), pusername.toString(), wtsconfigclass, ppbuffer.toString(), pbytesreturned.toString()) as Int) else 0

public actual fun WTSQueryUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQueryUserConfigW(pservername.toString(), pusername.toString(), wtsconfigclass, ppbuffer.toString(), pbytesreturned.toString()) as Int) else 0

public actual fun WTSQueryUserToken(sessionid: UInt, phtoken: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSQueryUserToken(sessionid.toInt(), phtoken.toString()) as Int) else 0

public actual fun WTSRegisterSessionNotification(hwnd: HWND, dwflags: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotification(hwnd.toString(), dwflags.toInt()) as Int) else 0

public actual fun WTSRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND, dwflags: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSRegisterSessionNotificationEx(hserver.toString(), hwnd.toString(), dwflags.toInt()) as Int) else 0

public actual fun WTSSendMessageA(hserver: HANDLE, sessionid: UInt, ptitle: PCSTR, titlelength: UInt, pmessage: PCSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSendMessageA(hserver.toString(), sessionid.toInt(), ptitle.toString(), titlelength.toInt(), pmessage.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.toString(), bwait) as Int) else 0

public actual fun WTSSendMessageW(hserver: HANDLE, sessionid: UInt, ptitle: PCWSTR, titlelength: UInt, pmessage: PCWSTR, messagelength: UInt, style: MESSAGEBOX_STYLE, timeout: UInt, presponse: Long, bwait: BOOL): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSendMessageW(hserver.toString(), sessionid.toInt(), ptitle.toString(), titlelength.toInt(), pmessage.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.toString(), bwait) as Int) else 0

public actual fun WTSSetListenerSecurityA(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityA(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0

public actual fun WTSSetListenerSecurityW(hserver: HANDLE, preserved: Long, reserved: UInt, plistenername: PCWSTR, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSetListenerSecurityW(hserver.toString(), preserved.toString(), reserved.toInt(), plistenername.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int) else 0

public actual fun WTSSetRenderHint(prenderhintid: Long, hwndowner: HWND, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: Long): HRESULT =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSetRenderHint(prenderhintid.toString(), hwndowner.toString(), renderhinttype.toInt(), cbhintdatalength.toInt(), phintdata.toString()) as Int) else 0

public actual fun WTSSetUserConfigA(pservername: PCSTR, pusername: PCSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCSTR, datalength: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigA(pservername.toString(), pusername.toString(), wtsconfigclass, pbuffer.toString(), datalength.toInt()) as Int) else 0

public actual fun WTSSetUserConfigW(pservername: PCWSTR, pusername: PCWSTR, wtsconfigclass: WTS_CONFIG_CLASS, pbuffer: PCWSTR, datalength: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSSetUserConfigW(pservername.toString(), pusername.toString(), wtsconfigclass, pbuffer.toString(), datalength.toInt()) as Int) else 0

public actual fun WTSShutdownSystem(hserver: HANDLE, shutdownflag: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSShutdownSystem(hserver.toString(), shutdownflag.toInt()) as Int) else 0

public actual fun WTSStartRemoteControlSessionA(ptargetservername: PCSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionA(ptargetservername.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else 0

public actual fun WTSStartRemoteControlSessionW(ptargetservername: PCWSTR, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSStartRemoteControlSessionW(ptargetservername.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else 0

public actual fun WTSStopRemoteControlSession(logonid: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSStopRemoteControlSession(logonid.toInt()) as Int) else 0

public actual fun WTSTerminateProcess(hserver: HANDLE, processid: UInt, exitcode: UInt): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSTerminateProcess(hserver.toString(), processid.toInt(), exitcode.toInt()) as Int) else 0

public actual fun WTSUnRegisterSessionNotification(hwnd: HWND): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotification(hwnd.toString()) as Int) else 0

public actual fun WTSUnRegisterSessionNotificationEx(hserver: HANDLE, hwnd: HWND): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSUnRegisterSessionNotificationEx(hserver.toString(), hwnd.toString()) as Int) else 0

public actual fun WTSVirtualChannelClose(hchannelhandle: HANDLE): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelClose(hchannelhandle.toString()) as Int) else 0

public actual fun WTSVirtualChannelOpen(hserver: HANDLE, sessionid: UInt, pvirtualname: PCSTR): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpen(hserver.toString(), sessionid.toInt(), pvirtualname.toString()) as String).toLong() else 0L

public actual fun WTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: PCSTR, flags: UInt): HANDLE =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelOpenEx(sessionid.toInt(), pvirtualname.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun WTSVirtualChannelPurgeInput(hchannelhandle: HANDLE): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeInput(hchannelhandle.toString()) as Int) else 0

public actual fun WTSVirtualChannelPurgeOutput(hchannelhandle: HANDLE): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelPurgeOutput(hchannelhandle.toString()) as Int) else 0

public actual fun WTSVirtualChannelQuery(hchannelhandle: HANDLE, param1: WTS_VIRTUAL_CLASS, ppbuffer: Long, pbytesreturned: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelQuery(hchannelhandle.toString(), param1, ppbuffer.toString(), pbytesreturned.toString()) as Int) else 0

public actual fun WTSVirtualChannelRead(hchannelhandle: HANDLE, timeout: UInt, buffer: PSTR, buffersize: UInt, pbytesread: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelRead(hchannelhandle.toString(), timeout.toInt(), buffer.toString(), buffersize.toInt(), pbytesread.toString()) as Int) else 0

public actual fun WTSVirtualChannelWrite(hchannelhandle: HANDLE, buffer: PCSTR, length: UInt, pbyteswritten: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSVirtualChannelWrite(hchannelhandle.toString(), buffer.toString(), length.toInt(), pbyteswritten.toString()) as Int) else 0

public actual fun WTSWaitSystemEvent(hserver: HANDLE, eventmask: UInt, peventflags: Long): BOOL =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_WTSWaitSystemEvent(hserver.toString(), eventmask.toInt(), peventflags.toString()) as Int) else 0
