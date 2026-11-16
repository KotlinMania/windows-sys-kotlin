@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWdkSystemOfflineregistryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORCloseHive(handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORCloseKey(keyhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateHive(horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORCreateHive(horkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr, pdwdisposition: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORCreateKey(keyhandle.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpclass.rawAddress.toString(), dwoptions.toInt(), psecuritydescriptor.rawAddress.toString(), phkresult.rawAddress.toString(), pdwdisposition.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORDeleteKey(handle.rawAddress.toString(), lpsubkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORDeleteValue(handle.rawAddress.toString(), lpvaluename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr, lpclass: Pwstr, lpcclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryOREnumKey(handle.rawAddress.toString(), dwindex.toInt(), lpname.rawAddress.toString(), lpcname.rawAddress.toString(), lpclass.rawAddress.toString(), lpcclass.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryOREnumValue(handle.rawAddress.toString(), dwindex.toInt(), lpvaluename.rawAddress.toString(), lpcvaluename.rawAddress.toString(), lptype.rawAddress.toString(), lpdata.rawAddress.toString(), lpcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity(handle.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORGetValue(handle.rawAddress.toString(), lpsubkey.rawAddress.toString(), lpvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVersion(pdwmajorversion: MutPtr, pdwminorversion: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORGetVersion(pdwmajorversion.rawAddress.toString(), pdwminorversion.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags(handle.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRMergeHives(hivehandles: ConstPtr, hivecount: UInt, phkresult: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORMergeHives(hivehandles.rawAddress.toString(), hivecount.toInt(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHive(filepath: Pcwstr, horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryOROpenHive(filepath.rawAddress.toString(), horkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle(filehandle.rawAddress.toString(), horkey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryOROpenKey(handle.rawAddress.toString(), lpsubkey.rawAddress.toString(), phkresult.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr, lpcsubkeys: MutPtr, lpcmaxsubkeylen: MutPtr, lpcmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcmaxvaluenamelen: MutPtr, lpcmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey(handle.rawAddress.toString(), lpclass.rawAddress.toString(), lpcclass.rawAddress.toString(), lpcsubkeys.rawAddress.toString(), lpcmaxsubkeylen.rawAddress.toString(), lpcmaxclasslen.rawAddress.toString(), lpcvalues.rawAddress.toString(), lpcmaxvaluenamelen.rawAddress.toString(), lpcmaxvaluelen.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString(), lpftlastwritetime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORRenameKey(handle.rawAddress.toString(), lpnewname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORSaveHive(horkey.rawAddress.toString(), hivepath.rawAddress.toString(), osmajorversion.toInt(), osminorversion.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity(handle.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORSetValue(handle.rawAddress.toString(), lpvaluename.rawAddress.toString(), dwtype.toInt(), lpdata.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags(handle.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRShutdown(): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORShutdown() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRStart(): Win32Error =
    if (windowsWdkSystemOfflineregistryNapiAddon != null) (windowsWdkSystemOfflineregistryNapiAddon.windowssysWindowsWdkSystemOfflineregistryORStart() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
