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

public expect fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr<UInt>): Bool

public expect fun wTSCloseServer(hserver: Handle)

public expect fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool

public expect fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool

public expect fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr<Wtslistenerconfiga>, flag: UInt): Bool

public expect fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr<Wtslistenerconfigw>, flag: UInt): Bool

public expect fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool

public expect fun wTSEnableChildSessions(benable: Bool): Bool

public expect fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<Byte>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<UShort>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfoa>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pstr>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pwstr>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfow>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfoa>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfow>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfoa>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1a>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1w>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfow>>, pcount: MutPtr<UInt>): Bool

public expect fun wTSFreeMemory(pmemory: MutPtr<CVoid>)

public expect fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool

public expect fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool

public expect fun wTSGetActiveConsoleSessionId(): UInt

public expect fun wTSGetChildSessionId(psessionid: MutPtr<UInt>): Bool

public expect fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool

public expect fun wTSIsChildSessionsEnabled(pbenabled: MutPtr<Bool>): Bool

public expect fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool

public expect fun wTSOpenServerA(pservername: Pcstr): Handle

public expect fun wTSOpenServerExA(pservername: Pcstr): Handle

public expect fun wTSOpenServerExW(pservername: Pcwstr): Handle

public expect fun wTSOpenServerW(pservername: Pcwstr): Handle

public expect fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr<Wtslistenerconfiga>): Bool

public expect fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr<Wtslistenerconfigw>): Bool

public expect fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool

public expect fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool

public expect fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool

public expect fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool

public expect fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr<Handle>): Bool

public expect fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool

public expect fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool

public expect fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool

public expect fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool

public expect fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool

public expect fun wTSSetRenderHint(prenderhintid: MutPtr<ULong>, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr<UByte>): Hresult

public expect fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool

public expect fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool

public expect fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool

public expect fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool

public expect fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool

public expect fun wTSStopRemoteControlSession(logonid: UInt): Bool

public expect fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool

public expect fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool

public expect fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool

public expect fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool

public expect fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle

public expect fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle

public expect fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool

public expect fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool

public expect fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr<MutPtr<CVoid>>, pbytesreturned: MutPtr<UInt>): Bool

public expect fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr<UInt>): Bool

public expect fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr<UInt>): Bool

public expect fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr<UInt>): Bool
