@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

private val windowsWin32SecurityApplockerNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferCloseLevel(hlevelhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr<Handle>, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(levelhandle.rawAddress.toString(), inaccesstoken.rawAddress.toString(), outaccesstoken.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr<SaferLevelHandle>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), plevelhandle.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr<CVoid>, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(levelhandle.rawAddress.toString(), dwinfotype, lpquerybuffer.rawAddress.toString(), dwinbuffersize.toInt(), lpdwoutbuffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr<CVoid>, infobufferretsize: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress.toString(), infobufferretsize.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr<SaferCodePropertiesV2>, plevelhandle: MutPtr<SaferLevelHandle>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(dwnumproperties.toInt(), pcodeproperties.rawAddress.toString(), plevelhandle.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(hlevel.rawAddress.toString(), sztargetpath.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr<CVoid>, dwinbuffersize: UInt): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(levelhandle.rawAddress.toString(), dwinfotype, lpquerybuffer.rawAddress.toString(), dwinbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    if (windowsWin32SecurityApplockerNapiAddon != null) (windowsWin32SecurityApplockerNapiAddon.windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(szfullpathname.rawAddress.toString(), bfromshellexecute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
