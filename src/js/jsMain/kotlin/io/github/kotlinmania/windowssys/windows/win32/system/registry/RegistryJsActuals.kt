@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val _windowsWin32SystemRegistryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, cbdatain: UInt, pcbdataout: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW((hkeyprimary?.value ?: 0L).toString(), (pwszprimarysubkey?.value ?: 0L).toString(), (hkeyfallback?.value ?: 0L).toString(), (pwszfallbacksubkey?.value ?: 0L).toString(), (pwszvalue?.value ?: 0L).toString(), dwflags.toInt(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), cbdatain.toInt(), (pcbdataout?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCloseKey((hkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regConnectRegistryA((lpmachinename?.value ?: 0L).toString(), (hkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regConnectRegistryExA((lpmachinename?.value ?: 0L).toString(), (hkey?.value ?: 0L).toString(), flags.toInt(), (phkresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regConnectRegistryExW((lpmachinename?.value ?: 0L).toString(), (hkey?.value ?: 0L).toString(), flags.toInt(), (phkresult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regConnectRegistryW((lpmachinename?.value ?: 0L).toString(), (hkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCopyTreeA((hkeysrc?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (hkeydest?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCopyTreeW((hkeysrc?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (hkeydest?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyExA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyExW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyTransactedA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pextendedparemeter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyTransactedW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), reserved.toInt(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (lpdwdisposition?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pextendedparemeter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regCreateKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyExA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyExW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyTransactedA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), samdesired.toInt(), reserved.toInt(), (htransaction?.value ?: 0L).toString(), (pextendedparameter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyTransactedW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), samdesired.toInt(), reserved.toInt(), (htransaction?.value ?: 0L).toString(), (pextendedparameter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyValueA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyValueW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteTreeA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteTreeW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteValueA((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDeleteValueW((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCache(): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDisablePredefinedCache() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regDisableReflectionKey((hbase?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnableReflectionKey((hbase?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumKeyA((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpname?.value ?: 0L).toString(), cchname.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumKeyExA((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcchclass?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumKeyExW((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpname?.value ?: 0L).toString(), (lpcchname?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcchclass?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumKeyW((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpname?.value ?: 0L).toString(), cchname.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumValueA((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpvaluename?.value ?: 0L).toString(), (lpcchvaluename?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regEnumValueW((hkey?.value ?: 0L).toString(), dwindex.toInt(), (lpvaluename?.value ?: 0L).toString(), (lpcchvaluename?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regFlushKey((hkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regGetKeySecurity((hkey?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regGetValueA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString(), dwflags.toInt(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regGetValueW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString(), dwflags.toInt(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadAppKeyA((lpfile?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadAppKeyW((lpfile?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadMUIStringA((hkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pszoutbuf?.value ?: 0L).toString(), cboutbuf.toInt(), (pcbdata?.value ?: 0L).toString(), flags.toInt(), (pszdirectory?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regLoadMUIStringW((hkey?.value ?: 0L).toString(), (pszvalue?.value ?: 0L).toString(), (pszoutbuf?.value ?: 0L).toString(), cboutbuf.toInt(), (pcbdata?.value ?: 0L).toString(), flags.toInt(), (pszdirectory?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regNotifyChangeKeyValue((hkey?.value ?: 0L).toString(), bwatchsubtree, dwnotifyfilter.toInt(), (hevent?.value ?: 0L).toString(), fasynchronous) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenCurrentUser(samdesired.toInt(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyExA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyExW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyTransactedA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pextendedparemeter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyTransactedW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L).toString(), (htransaction?.value ?: 0L).toString(), (pextendedparemeter?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOpenUserClassesRoot((htoken?.value ?: 0L).toString(), dwoptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regOverridePredefKey((hkey?.value ?: 0L).toString(), (hnewhkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryInfoKeyA((hkey?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcchclass?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lpcsubkeys?.value ?: 0L).toString(), (lpcbmaxsubkeylen?.value ?: 0L).toString(), (lpcbmaxclasslen?.value ?: 0L).toString(), (lpcvalues?.value ?: 0L).toString(), (lpcbmaxvaluenamelen?.value ?: 0L).toString(), (lpcbmaxvaluelen?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryInfoKeyW((hkey?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcchclass?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lpcsubkeys?.value ?: 0L).toString(), (lpcbmaxsubkeylen?.value ?: 0L).toString(), (lpcbmaxclasslen?.value ?: 0L).toString(), (lpcvalues?.value ?: 0L).toString(), (lpcbmaxvaluenamelen?.value ?: 0L).toString(), (lpcbmaxvaluelen?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryMultipleValuesA((hkey?.value ?: 0L).toString(), (valList?.value ?: 0L).toString(), numVals.toInt(), (lpvaluebuf?.value ?: 0L).toString(), (ldwtotsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryMultipleValuesW((hkey?.value ?: 0L).toString(), (valList?.value ?: 0L).toString(), numVals.toInt(), (lpvaluebuf?.value ?: 0L).toString(), (ldwtotsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryReflectionKey((hbase?.value ?: 0L).toString(), (bisreflectiondisabled?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryValueA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryValueExA((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryValueExW((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), (lpreserved?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regQueryValueW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regRenameKey((hkey?.value ?: 0L).toString(), (lpsubkeyname?.value ?: 0L).toString(), (lpnewkeyname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regReplaceKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpnewfile?.value ?: 0L).toString(), (lpoldfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regReplaceKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpnewfile?.value ?: 0L).toString(), (lpoldfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regRestoreKeyA((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regRestoreKeyW((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSaveKeyA((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSaveKeyExA((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSaveKeyExW((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSaveKeyW((hkey?.value ?: 0L).toString(), (lpfile?.value ?: 0L).toString(), (lpsecurityattributes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetKeySecurity((hkey?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetKeyValueA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetKeyValueW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetValueA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetValueExA((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetValueExW((hkey?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regSetValueW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regUnLoadKeyA((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_regUnLoadKeyW((hkey?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
