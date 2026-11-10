@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val _windowsWin32SystemRemotedesktopNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_processIdToSessionId(dwprocessid.toInt(), (psessionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCloseServer(hserver: Handle) {
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) {
        _windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSCloseServer((hserver?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), (ppassword?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), (ppassword?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerA((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), flag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?, flag: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSCreateListenerW((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString(), flag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSDisconnectSession((hserver?.value ?: 0L).toString(), sessionid.toInt(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnableChildSessions(benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersA((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plisteners?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plisteners: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateListenersW((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plisteners?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesA((hserver?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppprocessinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExA((hserver?.value ?: 0L).toString(), (plevel?.value ?: 0L).toString(), sessionid.toInt(), (ppprocessinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: COpaquePointer?, sessionid: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesExW((hserver?.value ?: 0L).toString(), (plevel?.value ?: 0L).toString(), sessionid.toInt(), (ppprocessinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateProcessesW((hserver?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppprocessinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersA((pdomainname?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppserverinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateServersW((pdomainname?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppserverinfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsA((hserver?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppsessioninfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExA((hserver?.value ?: 0L).toString(), (plevel?.value ?: 0L).toString(), filter.toInt(), (ppsessioninfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: COpaquePointer?, filter: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsExW((hserver?.value ?: 0L).toString(), (plevel?.value ?: 0L).toString(), filter.toInt(), (ppsessioninfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: COpaquePointer?, pcount: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSEnumerateSessionsW((hserver?.value ?: 0L).toString(), reserved.toInt(), version.toInt(), (ppsessioninfo?.value ?: 0L).toString(), (pcount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemory(pmemory: COpaquePointer?) {
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) {
        _windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSFreeMemory((pmemory?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExA(wtstypeclass, (pmemory?.value ?: 0L).toString(), numberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: COpaquePointer?, numberofentries: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSFreeMemoryExW(wtstypeclass, (pmemory?.value ?: 0L).toString(), numberofentries.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSGetActiveConsoleSessionId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetChildSessionId(psessionid: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSGetChildSessionId((psessionid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityA((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSGetListenerSecurityW((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), nlength.toInt(), (lpnlengthneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSIsChildSessionsEnabled(pbenabled: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSIsChildSessionsEnabled((pbenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSLogoffSession((hserver?.value ?: 0L).toString(), sessionid.toInt(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSOpenServerA((pservername?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExA((pservername?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSOpenServerExW((pservername?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSOpenServerW((pservername?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, pbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigA((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, pbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQueryListenerConfigW((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), (pbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationA((hserver?.value ?: 0L).toString(), sessionid.toInt(), wtsinfoclass, (ppbuffer?.value ?: 0L).toString(), (pbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQuerySessionInformationW((hserver?.value ?: 0L).toString(), sessionid.toInt(), wtsinfoclass, (ppbuffer?.value ?: 0L).toString(), (pbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigA((pservername?.value ?: 0L).toString(), (pusername?.value ?: 0L).toString(), wtsconfigclass, (ppbuffer?.value ?: 0L).toString(), (pbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQueryUserConfigW((pservername?.value ?: 0L).toString(), (pusername?.value ?: 0L).toString(), wtsconfigclass, (ppbuffer?.value ?: 0L).toString(), (pbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSQueryUserToken(sessionid.toInt(), (phtoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotification((hwnd?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSRegisterSessionNotificationEx((hserver?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSendMessageA((hserver?.value ?: 0L).toString(), sessionid.toInt(), (ptitle?.value ?: 0L).toString(), titlelength.toInt(), (pmessage?.value ?: 0L).toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), (presponse?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: COpaquePointer?, bwait: Bool): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSendMessageW((hserver?.value ?: 0L).toString(), sessionid.toInt(), (ptitle?.value ?: 0L).toString(), titlelength.toInt(), (pmessage?.value ?: 0L).toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), (presponse?.value ?: 0L).toString(), bwait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityA((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: COpaquePointer?, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSetListenerSecurityW((hserver?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString(), reserved.toInt(), (plistenername?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetRenderHint(prenderhintid: COpaquePointer?, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: COpaquePointer?): Hresult =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSetRenderHint((prenderhintid?.value ?: 0L).toString(), (hwndowner?.value ?: 0L).toString(), renderhinttype.toInt(), cbhintdatalength.toInt(), (phintdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigA((pservername?.value ?: 0L).toString(), (pusername?.value ?: 0L).toString(), wtsconfigclass, (pbuffer?.value ?: 0L).toString(), datalength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSSetUserConfigW((pservername?.value ?: 0L).toString(), (pusername?.value ?: 0L).toString(), wtsconfigclass, (pbuffer?.value ?: 0L).toString(), datalength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSShutdownSystem((hserver?.value ?: 0L).toString(), shutdownflag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionA((ptargetservername?.value ?: 0L).toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSStartRemoteControlSessionW((ptargetservername?.value ?: 0L).toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSStopRemoteControlSession(logonid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSTerminateProcess((hserver?.value ?: 0L).toString(), processid.toInt(), exitcode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotification((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSUnRegisterSessionNotificationEx((hserver?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelClose((hchannelhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpen((hserver?.value ?: 0L).toString(), sessionid.toInt(), (pvirtualname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelOpenEx(sessionid.toInt(), (pvirtualname?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeInput((hchannelhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelPurgeOutput((hchannelhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: COpaquePointer?, pbytesreturned: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelQuery((hchannelhandle?.value ?: 0L).toString(), param1, (ppbuffer?.value ?: 0L).toString(), (pbytesreturned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelRead((hchannelhandle?.value ?: 0L).toString(), timeout.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (pbytesread?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSVirtualChannelWrite((hchannelhandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (pbyteswritten?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: COpaquePointer?): Bool =
    if (_windowsWin32SystemRemotedesktopNapiAddon != null) (_windowsWin32SystemRemotedesktopNapiAddon.windowssys_windows_win32_system_remotedesktop_wTSWaitSystemEvent((hserver?.value ?: 0L).toString(), eventmask.toInt(), (peventflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
