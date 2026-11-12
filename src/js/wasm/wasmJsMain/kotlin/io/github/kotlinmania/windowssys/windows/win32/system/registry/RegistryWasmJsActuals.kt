@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemRegistryNapiAddon(): Boolean

private val windowsWin32SystemRegistryNapiAvailable: Boolean = initWindowsWin32SystemRegistryNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCloseKey(p0)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCloseKey(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegConnectRegistryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryExA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryExW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegConnectRegistryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCopyTreeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCopyTreeA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCopyTreeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCopyTreeW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyExA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyExA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyExW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegCreateKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteTreeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteTreeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteTreeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteTreeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteValueA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteValueA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDeleteValueW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDeleteValueW(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache()")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDisablePredefinedCache(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx()")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(p0)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegDisableReflectionKey(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(p0)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnableReflectionKey(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumKeyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumKeyExA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyExA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumKeyExW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyExW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumKeyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumValueA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumValueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegEnumValueW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegEnumValueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegFlushKey(p0)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegFlushKey(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegGetKeySecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegGetKeySecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegGetValueA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegGetValueA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegGetValueW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegGetValueW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadAppKeyA(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadAppKeyW(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadKeyA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadKeyW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadMUIStringA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegLoadMUIStringW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(p0: String, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenCurrentUser(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyExA(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyExW(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegOverridePredefKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegOverridePredefKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryReflectionKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryValueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryValueA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryValueExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryValueExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryValueExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryValueExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegQueryValueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegQueryValueW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegRenameKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegRenameKey(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegReplaceKeyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegReplaceKeyA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegReplaceKeyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegReplaceKeyW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegRestoreKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegRestoreKeyA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegRestoreKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegRestoreKeyW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSaveKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSaveKeyExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyExA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSaveKeyExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyExW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSaveKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetKeySecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetKeySecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetKeyValueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetKeyValueA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetKeyValueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetKeyValueW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetValueA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetValueA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetValueExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetValueExA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetValueExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetValueExW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegSetValueW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegSetValueW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegUnLoadKeyA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemRegistryRegUnLoadKeyW(p0: String, p1: String): Int

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, cbdatain: UInt, pcbdataout: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(hkeyprimary.rawAddress.toString(), pwszprimarysubkey.rawAddress.toString(), hkeyfallback.rawAddress.toString(), pwszfallbacksubkey.rawAddress.toString(), pwszvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), cbdatain.toInt(), pcbdataout.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCloseKey(hkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryA(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryExA(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), flags.toInt(), phkresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryExW(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), flags.toInt(), phkresult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegConnectRegistryW(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCopyTreeA(hkeysrc.rawAddress.toString(), lpsubkey.rawAddress.toString(), hkeydest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCopyTreeW(hkeysrc.rawAddress.toString(), lpsubkey.rawAddress.toString(), hkeydest.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegCreateKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt(), htransaction.rawAddress.toString(), pextendedparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt(), htransaction.rawAddress.toString(), pextendedparameter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteTreeA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteTreeW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteValueA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDeleteValueW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCache(): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDisablePredefinedCache().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegDisableReflectionKey(hbase.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnableReflectionKey(hbase.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyA(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), cchname.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyExA(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpreserved.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyExW(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpreserved.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumKeyW(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), cchname.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumValueA(hkey.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegEnumValueW(hkey.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegFlushKey(hkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegGetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegGetValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegGetValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadAppKeyA(lpfile.rawAddress.toString(), phkresult.rawAddress.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadAppKeyW(lpfile.rawAddress.toString(), phkresult.rawAddress.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadMUIStringA(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cboutbuf.toInt(), pcbdata.rawAddress.toString(), flags.toInt(), pszdirectory.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegLoadMUIStringW(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cboutbuf.toInt(), pcbdata.rawAddress.toString(), flags.toInt(), pszdirectory.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(hkey.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt(), hevent.rawAddress.toString(), fasynchronous).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenCurrentUser(samdesired.toInt(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(htoken.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegOverridePredefKey(hkey.rawAddress.toString(), hnewhkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(hkey.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpreserved.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcbmaxsubkeylen.rawAddress.toString(), lpcbmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcbmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(hkey.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpreserved.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcbmaxsubkeylen.rawAddress.toString(), lpcbmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcbmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr<Valenta>, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(hkey.rawAddress.toString(), valList.rawAddress.toString(), numVals.toInt(), lpvaluebuf.rawAddress.toString(), ldwtotsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr<Valentw>, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(hkey.rawAddress.toString(), valList.rawAddress.toString(), numVals.toInt(), lpvaluebuf.rawAddress.toString(), ldwtotsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr<Bool>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryReflectionKey(hbase.rawAddress.toString(), bisreflectiondisabled.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr<Int>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryValueExA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryValueExW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr<Int>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegQueryValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegRenameKey(hkey.rawAddress.toString(), lpsubkeyname.rawAddress.toString(), lpnewkeyname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegReplaceKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpnewfile.rawAddress.toString(), lpoldfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegReplaceKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpnewfile.rawAddress.toString(), lpoldfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegRestoreKeyA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegRestoreKeyW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyExA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyExW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSaveKeyW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetKeyValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetKeyValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetValueExA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetValueExW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegSetValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegUnLoadKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAvailable) wasmWindowssysWindowsWin32SystemRegistryRegUnLoadKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
