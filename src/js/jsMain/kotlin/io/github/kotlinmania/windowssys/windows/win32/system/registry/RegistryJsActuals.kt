@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWin32SystemRegistryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr, pvdata: MutPtr, cbdatain: UInt, pcbdataout: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(hkeyprimary.rawAddress.toString(), pwszprimarysubkey.rawAddress.toString(), hkeyfallback.rawAddress.toString(), pwszfallbacksubkey.rawAddress.toString(), pwszvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), cbdatain.toInt(), pcbdataout.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCloseKey(hkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegConnectRegistryA(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), flags.toInt(), phkresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), flags.toInt(), phkresult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegConnectRegistryW(lpmachinename.rawAddress.toString(), hkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCopyTreeA(hkeysrc.rawAddress.toString(), lpsubkey.rawAddress.toString(), hkeydest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCopyTreeW(hkeysrc.rawAddress.toString(), lpsubkey.rawAddress.toString(), hkeydest.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), reserved.toInt(), lpclass.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress.toString(), phkresult.rawAddress.toString(), lpdwdisposition.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegCreateKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt(), htransaction.rawAddress.toString(), pextendedparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), samdesired.toInt(), reserved.toInt(), htransaction.rawAddress.toString(), pextendedparameter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteTreeA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteTreeW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteValueA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDeleteValueW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCache(): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(hbase.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(hbase.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumKeyA(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), cchname.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumKeyExA(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpreserved.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pwstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumKeyExW(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcchname.rawAddress.toString(), lpreserved.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumKeyW(hkey.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), cchname.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumValueA(hkey.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegEnumValueW(hkey.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcchvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegFlushKey(hkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegGetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegGetValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegGetValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), dwflags.toInt(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(lpfile.rawAddress.toString(), phkresult.rawAddress.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(lpfile.rawAddress.toString(), phkresult.rawAddress.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cboutbuf.toInt(), pcbdata.rawAddress.toString(), flags.toInt(), pszdirectory.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cboutbuf.toInt(), pcbdata.rawAddress.toString(), flags.toInt(), pszdirectory.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(hkey.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt(), hevent.rawAddress.toString(), fasynchronous) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(samdesired.toInt(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyExA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyExW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString(), htransaction.rawAddress.toString(), pextendedparemeter.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(htoken.rawAddress.toString(), dwoptions.toInt(), samdesired.toInt(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegOverridePredefKey(hkey.rawAddress.toString(), hnewhkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(hkey.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpreserved.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcbmaxsubkeylen.rawAddress.toString(), lpcbmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcbmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(hkey.rawAddress.toString(), lpclass.rawAddress.toString(), lpcchclass.rawAddress.toString(), lpreserved.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcbmaxsubkeylen.rawAddress.toString(), lpcbmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcbmaxvaluenamelen.rawAddress.toString(), lpcbmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(hkey.rawAddress.toString(), valList.rawAddress.toString(), numVals.toInt(), lpvaluebuf.rawAddress.toString(), ldwtotsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(hkey.rawAddress.toString(), valList.rawAddress.toString(), numVals.toInt(), lpvaluebuf.rawAddress.toString(), ldwtotsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(hbase.rawAddress.toString(), bisreflectiondisabled.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryValueExA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryValueExW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), lpreserved.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegQueryValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegRenameKey(hkey.rawAddress.toString(), lpsubkeyname.rawAddress.toString(), lpnewkeyname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegReplaceKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpnewfile.rawAddress.toString(), lpoldfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegReplaceKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpnewfile.rawAddress.toString(), lpoldfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegRestoreKeyA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegRestoreKeyW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSaveKeyA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSaveKeyExA(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSaveKeyExW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSaveKeyW(hkey.rawAddress.toString(), lpfile.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetKeySecurity(hkey.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetKeyValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetKeyValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetValueA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetValueExA(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetValueExW(hkey.rawAddress.toString(), lpvaluename.rawAddress.toString(), reserved.toInt(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegSetValueW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWin32SystemRegistryNapiAddon != null) (windowsWin32SystemRegistryNapiAddon.windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(hkey.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
