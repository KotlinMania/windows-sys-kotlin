@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId")

public actual fun wTSCloseServer(hserver: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSCloseServer")

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA")

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW")

public actual fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr<Wtslistenerconfiga>, flag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA")

public actual fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr<Wtslistenerconfigw>, flag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW")

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions")
private external fun wasiWindowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable: Int): Int

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    wasiWindowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable)

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<Byte>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA")

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plisteners: MutPtr<MutPtr<UShort>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW")

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfoa>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA")

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pstr>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA")

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr<UInt>, sessionid: UInt, ppprocessinfo: MutPtr<Pwstr>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW")

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr<MutPtr<WtsProcessInfow>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW")

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfoa>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA")

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr<MutPtr<WtsServerInfow>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW")

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfoa>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA")

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1a>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA")

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr<UInt>, filter: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfo1w>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW")

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr<MutPtr<WtsSessionInfow>>, pcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW")

public actual fun wTSFreeMemory(pmemory: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory")

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA")

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr<CVoid>, numberofentries: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId")
private external fun wasiWindowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId(): Int

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    wasiWindowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId().toUInt()

public actual fun wTSGetChildSessionId(psessionid: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId")

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA")

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW")

public actual fun wTSIsChildSessionsEnabled(pbenabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled")

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession")

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA")

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA")

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW")

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW")

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr<Wtslistenerconfiga>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA")

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr<Wtslistenerconfigw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW")

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA")

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW")

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pstr>, pbytesreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA")

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr<Pwstr>, pbytesreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW")

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr<Handle>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken")

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification")

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx")

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA")

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr<MessageboxResult>, bwait: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW")

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA")

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr<CVoid>, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW")

public actual fun wTSSetRenderHint(prenderhintid: MutPtr<ULong>, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr<UByte>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint")

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA")

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW")

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem")

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA")

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession")
private external fun wasiWindowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid: Int): Int

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    wasiWindowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid.toInt())

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess")

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification")

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx")

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose")

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen")

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx")

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput")

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput")

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr<MutPtr<CVoid>>, pbytesreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery")

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead")

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite")

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent")
