@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle

private val windowsWin32SystemRemotedesktopNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(dwprocessid.toInt(), psessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCloseServer(hserver: Handle) {
    if (windowsWin32SystemRemotedesktopNapiAddon != null) {
        windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(hserver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr, flag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString(), flag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr, flag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString(), flag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(hserver.rawAddress.toString(), sessionid.toInt(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plisteners.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plisteners.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(hserver.rawAddress.toString(), plevel.rawAddress.toString(), sessionid.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(hserver.rawAddress.toString(), plevel.rawAddress.toString(), sessionid.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(pdomainname.rawAddress.toString(), reserved.toInt(), version.toInt(), ppserverinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(pdomainname.rawAddress.toString(), reserved.toInt(), version.toInt(), ppserverinfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(hserver.rawAddress.toString(), plevel.rawAddress.toString(), filter.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(hserver.rawAddress.toString(), plevel.rawAddress.toString(), filter.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemory(pmemory: MutPtr) {
    if (windowsWin32SystemRemotedesktopNapiAddon != null) {
        windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(wtstypeclass, pmemory.rawAddress.toString(), numberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(wtstypeclass, pmemory.rawAddress.toString(), numberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetChildSessionId(psessionid: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(psessionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSIsChildSessionsEnabled(pbenabled: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(pbenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(hserver.rawAddress.toString(), sessionid.toInt(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(pservername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(pservername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(pservername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(pservername.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(hserver.rawAddress.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(hserver.rawAddress.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(sessionid.toInt(), phtoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(hwnd.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(hserver.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(hserver.rawAddress.toString(), sessionid.toInt(), ptitle.rawAddress.toString(), titlelength.toInt(), pmessage.rawAddress.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(hserver.rawAddress.toString(), sessionid.toInt(), ptitle.rawAddress.toString(), titlelength.toInt(), pmessage.rawAddress.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress.toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetRenderHint(prenderhintid: MutPtr, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr): Hresult =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(prenderhintid.rawAddress.toString(), hwndowner.rawAddress.toString(), renderhinttype.toInt(), cbhintdatalength.toInt(), phintdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, pbuffer.rawAddress.toString(), datalength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, pbuffer.rawAddress.toString(), datalength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(hserver.rawAddress.toString(), shutdownflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(ptargetservername.rawAddress.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(ptargetservername.rawAddress.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(hserver.rawAddress.toString(), processid.toInt(), exitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(hserver.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(hchannelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(hserver.rawAddress.toString(), sessionid.toInt(), pvirtualname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) MutPtr((windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(sessionid.toInt(), pvirtualname.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(hchannelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(hchannelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(hchannelhandle.rawAddress.toString(), param1, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(hchannelhandle.rawAddress.toString(), timeout.toInt(), buffer.rawAddress.toString(), buffersize.toInt(), pbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(hchannelhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), pbyteswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAddon != null) (windowsWin32SystemRemotedesktopNapiAddon.windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(hserver.rawAddress.toString(), eventmask.toInt(), peventflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
