@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSCloseServer
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite
import io.github.kotlinmania.windowssys.windows.win32.system.remotedesktop.cinterop.windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(dwprocessid, psessionid.rawAddress.toCPointer<ByteVar>())

public actual fun wTSCloseServer(hserver: Handle) {
    windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(hserver.rawAddress.toCPointer<ByteVar>())
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(logonid, targetlogonid, ppassword.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(logonid, targetlogonid, ppassword.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr, flag: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr, flag: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>(), flag)

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable)

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plisteners.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plisteners.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(hserver.rawAddress.toCPointer<ByteVar>(), reserved, version, ppprocessinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(hserver.rawAddress.toCPointer<ByteVar>(), plevel.rawAddress.toCPointer<ByteVar>(), sessionid, ppprocessinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(hserver.rawAddress.toCPointer<ByteVar>(), plevel.rawAddress.toCPointer<ByteVar>(), sessionid, ppprocessinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(hserver.rawAddress.toCPointer<ByteVar>(), reserved, version, ppprocessinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(pdomainname.rawAddress.toCPointer<ByteVar>(), reserved, version, ppserverinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(pdomainname.rawAddress.toCPointer<ByteVar>(), reserved, version, ppserverinfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(hserver.rawAddress.toCPointer<ByteVar>(), reserved, version, ppsessioninfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(hserver.rawAddress.toCPointer<ByteVar>(), plevel.rawAddress.toCPointer<ByteVar>(), filter, ppsessioninfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(hserver.rawAddress.toCPointer<ByteVar>(), plevel.rawAddress.toCPointer<ByteVar>(), filter, ppsessioninfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(hserver.rawAddress.toCPointer<ByteVar>(), reserved, version, ppsessioninfo.rawAddress.toCPointer<ByteVar>(), pcount.rawAddress.toCPointer<ByteVar>())

public actual fun wTSFreeMemory(pmemory: MutPtr) {
    windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(pmemory.rawAddress.toCPointer<ByteVar>())
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(wtstypeclass, pmemory.rawAddress.toCPointer<ByteVar>(), numberofentries)

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(wtstypeclass, pmemory.rawAddress.toCPointer<ByteVar>(), numberofentries)

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId()

public actual fun wTSGetChildSessionId(psessionid: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(psessionid.rawAddress.toCPointer<ByteVar>())

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), nlength, lpnlengthneeded.rawAddress.toCPointer<ByteVar>())

public actual fun wTSIsChildSessionsEnabled(pbenabled: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(pbenabled.rawAddress.toCPointer<ByteVar>())

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, bwait)

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(pservername.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(pservername.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(pservername.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(pservername.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), pbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer.rawAddress.toCPointer<ByteVar>(), pbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, wtsinfoclass, ppbuffer.rawAddress.toCPointer<ByteVar>(), pbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(pservername.rawAddress.toCPointer<ByteVar>(), pusername.rawAddress.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer.rawAddress.toCPointer<ByteVar>(), pbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(pservername.rawAddress.toCPointer<ByteVar>(), pusername.rawAddress.toCPointer<ByteVar>(), wtsconfigclass, ppbuffer.rawAddress.toCPointer<ByteVar>(), pbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(sessionid, phtoken.rawAddress.toCPointer<ByteVar>())

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(hwnd.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(hserver.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, ptitle.rawAddress.toCPointer<ByteVar>(), titlelength, pmessage.rawAddress.toCPointer<ByteVar>(), messagelength, style, timeout, presponse.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, ptitle.rawAddress.toCPointer<ByteVar>(), titlelength, pmessage.rawAddress.toCPointer<ByteVar>(), messagelength, style, timeout, presponse.rawAddress.toCPointer<ByteVar>(), bwait)

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(hserver.rawAddress.toCPointer<ByteVar>(), preserved.rawAddress.toCPointer<ByteVar>(), reserved, plistenername.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun wTSSetRenderHint(prenderhintid: MutPtr, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr): Hresult =
    windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(prenderhintid.rawAddress.toCPointer<ByteVar>(), hwndowner.rawAddress.toCPointer<ByteVar>(), renderhinttype, cbhintdatalength, phintdata.rawAddress.toCPointer<ByteVar>())

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(pservername.rawAddress.toCPointer<ByteVar>(), pusername.rawAddress.toCPointer<ByteVar>(), wtsconfigclass, pbuffer.rawAddress.toCPointer<ByteVar>(), datalength)

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(pservername.rawAddress.toCPointer<ByteVar>(), pusername.rawAddress.toCPointer<ByteVar>(), wtsconfigclass, pbuffer.rawAddress.toCPointer<ByteVar>(), datalength)

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(hserver.rawAddress.toCPointer<ByteVar>(), shutdownflag)

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(ptargetservername.rawAddress.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(ptargetservername.rawAddress.toCPointer<ByteVar>(), targetlogonid, hotkeyvk, hotkeymodifiers)

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid)

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(hserver.rawAddress.toCPointer<ByteVar>(), processid, exitcode)

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(hserver.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(hchannelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(hserver.rawAddress.toCPointer<ByteVar>(), sessionid, pvirtualname.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(sessionid, pvirtualname.rawAddress.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L)

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(hchannelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(hchannelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(hchannelhandle.rawAddress.toCPointer<ByteVar>(), param1, ppbuffer.rawAddress.toCPointer<ByteVar>(), pbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(hchannelhandle.rawAddress.toCPointer<ByteVar>(), timeout, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, pbytesread.rawAddress.toCPointer<ByteVar>())

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(hchannelhandle.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), length, pbyteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr): Bool =
    windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(hserver.rawAddress.toCPointer<ByteVar>(), eventmask, peventflags.rawAddress.toCPointer<ByteVar>())
