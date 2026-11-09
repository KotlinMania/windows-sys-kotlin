@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWdkSystemOfflineregistryNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ORCloseHive(handle: ORHKEY): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORCloseHive(handle.toString()) as Int).toUInt() else 0u

public actual fun ORCloseKey(keyhandle: ORHKEY): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORCloseKey(keyhandle.toString()) as Int).toUInt() else 0u

public actual fun ORCreateHive(horkey: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORCreateHive(horkey.toString()) as Int).toUInt() else 0u

public actual fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORCreateKey(keyhandle.toString(), lpsubkey.toString(), lpclass.toString(), dwoptions.toInt(), psecuritydescriptor.toString(), phkresult.toString(), pdwdisposition.toString()) as Int).toUInt() else 0u

public actual fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(handle.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(handle.toString(), lpvaluename.toString()) as Int).toUInt() else 0u

public actual fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_OREnumKey(handle.toString(), dwindex.toInt(), lpname.toString(), lpcname.toString(), lpclass.toString(), lpcclass.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_OREnumValue(handle.toString(), dwindex.toInt(), lpvaluename.toString(), lpcvaluename.toString(), lptype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(handle.toString(), securityinformation.toInt(), psecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORGetValue(handle.toString(), lpsubkey.toString(), lpvalue.toString(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORGetVersion(pdwmajorversion.toString(), pdwminorversion.toString()) as Int).toUInt() else 0u

public actual fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(handle.toString(), pdwflags.toString()) as Int).toUInt() else 0u

public actual fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORMergeHives(hivehandles.toString(), hivecount.toInt(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun OROpenHive(filepath: PCWSTR, horkey: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_OROpenHive(filepath.toString(), horkey.toString()) as Int).toUInt() else 0u

public actual fun OROpenHiveByHandle(filehandle: HANDLE, horkey: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(filehandle.toString(), horkey.toString()) as Int).toUInt() else 0u

public actual fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_OROpenKey(handle.toString(), lpsubkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(handle.toString(), lpclass.toString(), lpcclass.toString(), lpcsubkeys.toString(), lpcmaxsubkeylen.toString(), lpcmaxclasslen.toString(), lpcvalues.toString(), lpcmaxvaluenamelen.toString(), lpcmaxvaluelen.toString(), lpcbsecuritydescriptor.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORRenameKey(handle.toString(), lpnewname.toString()) as Int).toUInt() else 0u

public actual fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORSaveHive(horkey.toString(), hivepath.toString(), osmajorversion.toInt(), osminorversion.toInt()) as Int).toUInt() else 0u

public actual fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(handle.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORSetValue(handle.toString(), lpvaluename.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(handle.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun ORShutdown(): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORShutdown() as Int).toUInt() else 0u

public actual fun ORStart(): WIN32_ERROR =
    if (_windowsWdkSystemOfflineregistryNapiAddon != null) (_windowsWdkSystemOfflineregistryNapiAddon.windowssys_windows_wdk_system_offlineregistry_ORStart() as Int).toUInt() else 0u
