@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRemotedesktopNapiAddon(): Boolean

private val windowsWin32SystemRemotedesktopNapiAvailable: Boolean = initWindowsWin32SystemRemotedesktopNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSCloseServer(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSCloseServer(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(p0: Int, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId()")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(p0: Int, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(p0)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(p0: String, p1: Int, p2: String): Int

public actual fun processIdToSessionId(dwprocessid: UInt, psessionid: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopProcessIdToSessionId(dwprocessid.toInt(), psessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCloseServer(hserver: Handle) {
    if (windowsWin32SystemRemotedesktopNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotedesktopWTSCloseServer(hserver.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSConnectSessionA(logonid: UInt, targetlogonid: UInt, ppassword: Pcstr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSConnectSessionA(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSConnectSessionW(logonid: UInt, targetlogonid: UInt, ppassword: Pcwstr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSConnectSessionW(logonid.toInt(), targetlogonid.toInt(), ppassword.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: ConstPtr, flag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSCreateListenerA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString(), flag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSCreateListenerW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: ConstPtr, flag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSCreateListenerW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString(), flag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSDisconnectSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSDisconnectSession(hserver.rawAddress.toString(), sessionid.toInt(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnableChildSessions(benable: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnableChildSessions(benable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plisteners.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateListenersW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plisteners: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateListenersW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plisteners.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesA(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesA(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExA(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExA(hserver.rawAddress.toString(), plevel.rawAddress.toString(), sessionid.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesExW(hserver: Handle, plevel: MutPtr, sessionid: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesExW(hserver.rawAddress.toString(), plevel.rawAddress.toString(), sessionid.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateProcessesW(hserver: Handle, reserved: UInt, version: UInt, ppprocessinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateProcessesW(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppprocessinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersA(pdomainname: Pcstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersA(pdomainname.rawAddress.toString(), reserved.toInt(), version.toInt(), ppserverinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateServersW(pdomainname: Pcwstr, reserved: UInt, version: UInt, ppserverinfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateServersW(pdomainname.rawAddress.toString(), reserved.toInt(), version.toInt(), ppserverinfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsA(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsA(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExA(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExA(hserver.rawAddress.toString(), plevel.rawAddress.toString(), filter.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsExW(hserver: Handle, plevel: MutPtr, filter: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsExW(hserver.rawAddress.toString(), plevel.rawAddress.toString(), filter.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSEnumerateSessionsW(hserver: Handle, reserved: UInt, version: UInt, ppsessioninfo: MutPtr, pcount: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSEnumerateSessionsW(hserver.rawAddress.toString(), reserved.toInt(), version.toInt(), ppsessioninfo.rawAddress.toString(), pcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemory(pmemory: MutPtr) {
    if (windowsWin32SystemRemotedesktopNapiAvailable) {
        wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemory(pmemory.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wTSFreeMemoryExA(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExA(wtstypeclass, pmemory.rawAddress.toString(), numberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSFreeMemoryExW(wtstypeclass: WtsTypeClass, pmemory: ConstPtr, numberofentries: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSFreeMemoryExW(wtstypeclass, pmemory.rawAddress.toString(), numberofentries.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetActiveConsoleSessionId(): UInt =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetActiveConsoleSessionId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetChildSessionId(psessionid: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetChildSessionId(psessionid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSGetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, nlength: UInt, lpnlengthneeded: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSGetListenerSecurityW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), nlength.toInt(), lpnlengthneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSIsChildSessionsEnabled(pbenabled: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSIsChildSessionsEnabled(pbenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSLogoffSession(hserver: Handle, sessionid: UInt, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSLogoffSession(hserver.rawAddress.toString(), sessionid.toInt(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerA(pservername: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerA(pservername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExA(pservername: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerExA(pservername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerExW(pservername: Pcwstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerExW(pservername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSOpenServerW(pservername: Pcwstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSOpenServerW(pservername.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, pbuffer: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryListenerConfigW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, pbuffer: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryListenerConfigW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationA(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationA(hserver.rawAddress.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQuerySessionInformationW(hserver: Handle, sessionid: UInt, wtsinfoclass: WtsInfoClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQuerySessionInformationW(hserver.rawAddress.toString(), sessionid.toInt(), wtsinfoclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigA(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserConfigW(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSQueryUserToken(sessionid: UInt, phtoken: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSQueryUserToken(sessionid.toInt(), phtoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotification(hwnd: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotification(hwnd.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSRegisterSessionNotificationEx(hserver.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageA(hserver: Handle, sessionid: UInt, ptitle: Pcstr, titlelength: UInt, pmessage: Pcstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSendMessageA(hserver.rawAddress.toString(), sessionid.toInt(), ptitle.rawAddress.toString(), titlelength.toInt(), pmessage.rawAddress.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSendMessageW(hserver: Handle, sessionid: UInt, ptitle: Pcwstr, titlelength: UInt, pmessage: Pcwstr, messagelength: UInt, style: MessageboxStyle, timeout: UInt, presponse: MutPtr, bwait: Bool): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSendMessageW(hserver.rawAddress.toString(), sessionid.toInt(), ptitle.rawAddress.toString(), titlelength.toInt(), pmessage.rawAddress.toString(), messagelength.toInt(), style.toInt(), timeout.toInt(), presponse.rawAddress.toString(), bwait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityA(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityA(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetListenerSecurityW(hserver: Handle, preserved: ConstPtr, reserved: UInt, plistenername: Pcwstr, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetListenerSecurityW(hserver.rawAddress.toString(), preserved.rawAddress.toString(), reserved.toInt(), plistenername.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetRenderHint(prenderhintid: MutPtr, hwndowner: Hwnd, renderhinttype: UInt, cbhintdatalength: UInt, phintdata: ConstPtr): Hresult =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetRenderHint(prenderhintid.rawAddress.toString(), hwndowner.rawAddress.toString(), renderhinttype.toInt(), cbhintdatalength.toInt(), phintdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigA(pservername: Pcstr, pusername: Pcstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcstr, datalength: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigA(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, pbuffer.rawAddress.toString(), datalength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSSetUserConfigW(pservername: Pcwstr, pusername: Pcwstr, wtsconfigclass: WtsConfigClass, pbuffer: Pcwstr, datalength: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSSetUserConfigW(pservername.rawAddress.toString(), pusername.rawAddress.toString(), wtsconfigclass, pbuffer.rawAddress.toString(), datalength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSShutdownSystem(hserver: Handle, shutdownflag: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSShutdownSystem(hserver.rawAddress.toString(), shutdownflag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionA(ptargetservername: Pcstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionA(ptargetservername.rawAddress.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStartRemoteControlSessionW(ptargetservername: Pcwstr, targetlogonid: UInt, hotkeyvk: UByte, hotkeymodifiers: UShort): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSStartRemoteControlSessionW(ptargetservername.rawAddress.toString(), targetlogonid.toInt(), hotkeyvk.toInt(), hotkeymodifiers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSStopRemoteControlSession(logonid: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSStopRemoteControlSession(logonid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSTerminateProcess(hserver: Handle, processid: UInt, exitcode: UInt): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSTerminateProcess(hserver.rawAddress.toString(), processid.toInt(), exitcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotification(hwnd: Hwnd): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotification(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSUnRegisterSessionNotificationEx(hserver: Handle, hwnd: Hwnd): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSUnRegisterSessionNotificationEx(hserver.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelClose(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelClose(hchannelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpen(hserver: Handle, sessionid: UInt, pvirtualname: Pcstr): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpen(hserver.rawAddress.toString(), sessionid.toInt(), pvirtualname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelOpenEx(sessionid: UInt, pvirtualname: Pcstr, flags: UInt): Handle =
    if (windowsWin32SystemRemotedesktopNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelOpenEx(sessionid.toInt(), pvirtualname.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeInput(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeInput(hchannelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelPurgeOutput(hchannelhandle: Handle): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelPurgeOutput(hchannelhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelQuery(hchannelhandle: Handle, param1: WtsVirtualClass, ppbuffer: MutPtr, pbytesreturned: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelQuery(hchannelhandle.rawAddress.toString(), param1, ppbuffer.rawAddress.toString(), pbytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelRead(hchannelhandle: Handle, timeout: UInt, buffer: Pstr, buffersize: UInt, pbytesread: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelRead(hchannelhandle.rawAddress.toString(), timeout.toInt(), buffer.rawAddress.toString(), buffersize.toInt(), pbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSVirtualChannelWrite(hchannelhandle: Handle, buffer: Pcstr, length: UInt, pbyteswritten: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSVirtualChannelWrite(hchannelhandle.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), pbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wTSWaitSystemEvent(hserver: Handle, eventmask: UInt, peventflags: MutPtr): Bool =
    if (windowsWin32SystemRemotedesktopNapiAvailable) wasmWindowssysWindowsWin32SystemRemotedesktopWTSWaitSystemEvent(hserver.rawAddress.toString(), eventmask.toInt(), peventflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
