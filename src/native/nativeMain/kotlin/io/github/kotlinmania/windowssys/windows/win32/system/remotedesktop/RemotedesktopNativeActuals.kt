@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_processIdToSessionId(dwprocessid, psessionid?.value?.toCPointer<ByteVar>())

public actual fun wTSCloseServer(hserver: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSCloseServer(hserver?.value?.toCPointer<ByteVar>())
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(logonid, targetlogonid, ppassword?.value?.toCPointer<ByteVar>(), bwait)

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(logonid, targetlogonid, ppassword?.value?.toCPointer<ByteVar>(), bwait)

public actual fun wTSCreateListenerA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), flag)

public actual fun wTSCreateListenerW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>(), flag)

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession(hserver?.value?.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(benable)

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plisteners?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plisteners?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA(hserver?.value?.toCPointer<ByteVar>(), reserved, version, ppprocessinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA(hserver?.value?.toCPointer<ByteVar>(), plevel?.value?.toCPointer<ByteVar>(), sessionid, ppprocessinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW(hserver?.value?.toCPointer<ByteVar>(), plevel?.value?.toCPointer<ByteVar>(), sessionid, ppprocessinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW(hserver?.value?.toCPointer<ByteVar>(), reserved, version, ppprocessinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA(pdomainname?.value?.toCPointer<ByteVar>(), reserved, version, ppserverinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW(pdomainname?.value?.toCPointer<ByteVar>(), reserved, version, ppserverinfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA(hserver?.value?.toCPointer<ByteVar>(), reserved, version, ppsessioninfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA(hserver?.value?.toCPointer<ByteVar>(), plevel?.value?.toCPointer<ByteVar>(), filter, ppsessioninfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW(hserver?.value?.toCPointer<ByteVar>(), plevel?.value?.toCPointer<ByteVar>(), filter, ppsessioninfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW(hserver?.value?.toCPointer<ByteVar>(), reserved, version, ppsessioninfo?.value?.toCPointer<ByteVar>(), pcount?.value?.toCPointer<ByteVar>())

public actual fun wTSFreeMemory(pmemory: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSFreeMemory(pmemory?.value?.toCPointer<ByteVar>())
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(wtstypeclass, pmemory?.value?.toCPointer<ByteVar>(), numberofentries)

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(wtstypeclass, pmemory?.value?.toCPointer<ByteVar>(), numberofentries)

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId()

public actual fun wTSGetChildSessionId(psessionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId(psessionid?.value?.toCPointer<ByteVar>())

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), nlength, lpnlengthneeded?.value?.toCPointer<ByteVar>())

public actual fun wTSIsChildSessionsEnabled(pbenabled: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled(pbenabled?.value?.toCPointer<ByteVar>())

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSLogoffSession(hserver?.value?.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSOpenServerA(pservername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA(pservername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW(pservername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSOpenServerW(pservername?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>())

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), pbuffer?.value?.toCPointer<ByteVar>())

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA(hserver?.value?.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer?.value?.toCPointer<ByteVar>(), pbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW(hserver?.value?.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer?.value?.toCPointer<ByteVar>(), pbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA(pservername?.value?.toCPointer<ByteVar>(), pusername?.value?.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer?.value?.toCPointer<ByteVar>(), pbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW(pservername?.value?.toCPointer<ByteVar>(), pusername?.value?.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer?.value?.toCPointer<ByteVar>(), pbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(sessionid, phtoken?.value?.toCPointer<ByteVar>())

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification(hwnd?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx(hserver?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSendMessageA(hserver?.value?.toCPointer<ByteVar>(), sessionid, ptitle?.value?.toCPointer<ByteVar>(), titlelength, pmessage?.value?.toCPointer<ByteVar>(), messagelength, style, timeout, presponse?.value?.toCPointer<ByteVar>(), bwait)

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSendMessageW(hserver?.value?.toCPointer<ByteVar>(), sessionid, ptitle?.value?.toCPointer<ByteVar>(), titlelength, pmessage?.value?.toCPointer<ByteVar>(), messagelength, style, timeout, presponse?.value?.toCPointer<ByteVar>(), bwait)

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW(hserver?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>(), reserved, plistenername?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun wTSSetRenderHint(prenderhintid: COpaquePointer?, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint(prenderhintid?.value?.toCPointer<ByteVar>(), hwndowner?.value?.toCPointer<ByteVar>(), renderhinttype, cbhintdatalength, phintdata?.value?.toCPointer<ByteVar>())

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA(pservername?.value?.toCPointer<ByteVar>(), pusername?.value?.toCPointer<ByteVar>(), wtsconfigclass, pbuffer?.value?.toCPointer<ByteVar>(), datalength)

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW(pservername?.value?.toCPointer<ByteVar>(), pusername?.value?.toCPointer<ByteVar>(), wtsconfigclass, pbuffer?.value?.toCPointer<ByteVar>(), datalength)

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem(hserver?.value?.toCPointer<ByteVar>(), shutdownflag)

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA(ptargetservername?.value?.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW(ptargetservername?.value?.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(logonid)

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess(hserver?.value?.toCPointer<ByteVar>(), processid, exitcode)

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification(hwnd?.value?.toCPointer<ByteVar>())

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx(hserver?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose(hchannelhandle?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen(hserver?.value?.toCPointer<ByteVar>(), sessionid, pvirtualname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(sessionid, pvirtualname?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput(hchannelhandle?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput(hchannelhandle?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery(hchannelhandle?.value?.toCPointer<ByteVar>(), param1, ppbuffer?.value?.toCPointer<ByteVar>(), pbytesreturned?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead(hchannelhandle?.value?.toCPointer<ByteVar>(), timeout, buffer?.value?.toCPointer<ByteVar>(), buffersize, pbytesread?.value?.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite(hchannelhandle?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), length, pbyteswritten?.value?.toCPointer<ByteVar>())

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent(hserver?.value?.toCPointer<ByteVar>(), eventmask, peventflags?.value?.toCPointer<ByteVar>())
