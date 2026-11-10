@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val _windowsWdkSystemOfflineregistryNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRCloseHive((handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRCloseKey((keyhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateHive(horkey: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRCreateHive((horkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: COpaquePointer?, pdwdisposition: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRCreateKey((keyhandle?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), dwoptions.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString(), (pdwdisposition?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRDeleteKey((handle?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRDeleteValue((handle?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: COpaquePointer?, lpclass: Pwstr, lpcclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oREnumKey((handle?.value ?: 0L).toString(), dwindex.toInt(), (lpname?.value ?: 0L).toString(), (lpcname?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcclass?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oREnumValue((handle?.value ?: 0L).toString(), dwindex.toInt(), (lpvaluename?.value ?: 0L).toString(), (lpcvaluename?.value ?: 0L).toString(), (lptype?.value ?: 0L).toString(), (lpdata?.value ?: 0L).toString(), (lpcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity((handle?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRGetValue((handle?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (lpvalue?.value ?: 0L).toString(), (pdwtype?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVersion(pdwmajorversion: COpaquePointer?, pdwminorversion: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRGetVersion((pdwmajorversion?.value ?: 0L).toString(), (pdwminorversion?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags((handle?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRMergeHives(hivehandles: COpaquePointer?, hivecount: UInt, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRMergeHives((hivehandles?.value ?: 0L).toString(), hivecount.toInt(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHive(filepath: Pcwstr, horkey: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oROpenHive((filepath?.value ?: 0L).toString(), (horkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle((filehandle?.value ?: 0L).toString(), (horkey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oROpenKey((handle?.value ?: 0L).toString(), (lpsubkey?.value ?: 0L).toString(), (phkresult?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcmaxsubkeylen: COpaquePointer?, lpcmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcmaxvaluenamelen: COpaquePointer?, lpcmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey((handle?.value ?: 0L).toString(), (lpclass?.value ?: 0L).toString(), (lpcclass?.value ?: 0L).toString(), (lpcsubkeys?.value ?: 0L).toString(), (lpcmaxsubkeylen?.value ?: 0L).toString(), (lpcmaxclasslen?.value ?: 0L).toString(), (lpcvalues?.value ?: 0L).toString(), (lpcmaxvaluenamelen?.value ?: 0L).toString(), (lpcmaxvaluelen?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString(), (lpftlastwritetime?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRRenameKey((handle?.value ?: 0L).toString(), (lpnewname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRSaveHive((horkey?.value ?: 0L).toString(), (hivepath?.value ?: 0L).toString(), osmajorversion.toInt(), osminorversion.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity((handle?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRSetValue((handle?.value ?: 0L).toString(), (lpvaluename?.value ?: 0L).toString(), dwtype.toInt(), (lpdata?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags((handle?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRShutdown(): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRShutdown() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oRStart(): Win32Error =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_oRStart() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
