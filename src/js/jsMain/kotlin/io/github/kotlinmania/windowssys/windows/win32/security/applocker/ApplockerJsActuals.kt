@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

private val _windowsWin32SecurityApplockerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferCloseLevel((hlevelhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel((levelhandle?.value ?: 0L).toString(), (inaccesstoken?.value ?: 0L).toString(), (outaccesstoken?.value ?: 0L).toString(), dwflags.toInt(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), (plevelhandle?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferGetLevelInformation((levelhandle?.value ?: 0L).toString(), dwinfotype, (lpquerybuffer?.value ?: 0L).toString(), dwinbuffersize.toInt(), (lpdwoutbuffersize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L).toString(), (infobufferretsize?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferIdentifyLevel(dwnumproperties.toInt(), (pcodeproperties?.value ?: 0L).toString(), (plevelhandle?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferRecordEventLogEntry((hlevel?.value ?: 0L).toString(), (sztargetpath?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferSetLevelInformation((levelhandle?.value ?: 0L).toString(), dwinfotype, (lpquerybuffer?.value ?: 0L).toString(), dwinbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    if (_windowsWin32SecurityApplockerNapiAddon != null) (_windowsWin32SecurityApplockerNapiAddon.windowssys_windows_win32_security_applocker_saferiIsExecutableFileType((szfullpathname?.value ?: 0L).toString(), bfromshellexecute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
