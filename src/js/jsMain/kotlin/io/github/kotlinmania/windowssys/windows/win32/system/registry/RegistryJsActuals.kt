@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWin32SystemRegistryNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(hkeyprimary.toString(), pwszprimarysubkey.toString(), hkeyfallback.toString(), pwszfallbacksubkey.toString(), pwszvalue.toString(), dwflags.toInt(), pdwtype.toString(), pvdata.toString(), cbdatain.toInt(), pcbdataout.toString()) as Int).toUInt() else 0u

public actual fun RegCloseKey(hkey: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCloseKey(hkey.toString()) as Int).toUInt() else 0u

public actual fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegConnectRegistryA(lpmachinename.toString(), hkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegConnectRegistryExA(lpmachinename.toString(), hkey.toString(), flags.toInt(), phkresult.toString()) as Int) else 0

public actual fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegConnectRegistryExW(lpmachinename.toString(), hkey.toString(), flags.toInt(), phkresult.toString()) as Int) else 0

public actual fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegConnectRegistryW(lpmachinename.toString(), hkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCopyTreeA(hkeysrc.toString(), lpsubkey.toString(), hkeydest.toString()) as Int).toUInt() else 0u

public actual fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCopyTreeW(hkeysrc.toString(), lpsubkey.toString(), hkeydest.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyA(hkey.toString(), lpsubkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyExA(hkey.toString(), lpsubkey.toString(), reserved.toInt(), lpclass.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyExW(hkey.toString(), lpsubkey.toString(), reserved.toInt(), lpclass.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(hkey.toString(), lpsubkey.toString(), reserved.toInt(), lpclass.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString(), htransaction.toString(), pextendedparemeter.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(hkey.toString(), lpsubkey.toString(), reserved.toInt(), lpclass.toString(), dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.toString(), phkresult.toString(), lpdwdisposition.toString(), htransaction.toString(), pextendedparemeter.toString()) as Int).toUInt() else 0u

public actual fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegCreateKeyW(hkey.toString(), lpsubkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyA(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyExA(hkey.toString(), lpsubkey.toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyExW(hkey.toString(), lpsubkey.toString(), samdesired.toInt(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(hkey.toString(), lpsubkey.toString(), samdesired.toInt(), reserved.toInt(), htransaction.toString(), pextendedparameter.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(hkey.toString(), lpsubkey.toString(), samdesired.toInt(), reserved.toInt(), htransaction.toString(), pextendedparameter.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyValueA(hkey.toString(), lpsubkey.toString(), lpvaluename.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyValueW(hkey.toString(), lpsubkey.toString(), lpvaluename.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteKeyW(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteTreeA(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteTreeW(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteValueA(hkey.toString(), lpvaluename.toString()) as Int).toUInt() else 0u

public actual fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDeleteValueW(hkey.toString(), lpvaluename.toString()) as Int).toUInt() else 0u

public actual fun RegDisablePredefinedCache(): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDisablePredefinedCache() as Int).toUInt() else 0u

public actual fun RegDisablePredefinedCacheEx(): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx() as Int).toUInt() else 0u

public actual fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegDisableReflectionKey(hbase.toString()) as Int).toUInt() else 0u

public actual fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnableReflectionKey(hbase.toString()) as Int).toUInt() else 0u

public actual fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumKeyA(hkey.toString(), dwindex.toInt(), lpname.toString(), cchname.toInt()) as Int).toUInt() else 0u

public actual fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumKeyExA(hkey.toString(), dwindex.toInt(), lpname.toString(), lpcchname.toString(), lpreserved.toString(), lpclass.toString(), lpcchclass.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumKeyExW(hkey.toString(), dwindex.toInt(), lpname.toString(), lpcchname.toString(), lpreserved.toString(), lpclass.toString(), lpcchclass.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumKeyW(hkey.toString(), dwindex.toInt(), lpname.toString(), cchname.toInt()) as Int).toUInt() else 0u

public actual fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumValueA(hkey.toString(), dwindex.toInt(), lpvaluename.toString(), lpcchvaluename.toString(), lpreserved.toString(), lptype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegEnumValueW(hkey.toString(), dwindex.toInt(), lpvaluename.toString(), lpcchvaluename.toString(), lpreserved.toString(), lptype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegFlushKey(hkey: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegFlushKey(hkey.toString()) as Int).toUInt() else 0u

public actual fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegGetKeySecurity(hkey.toString(), securityinformation.toInt(), psecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegGetValueA(hkey.toString(), lpsubkey.toString(), lpvalue.toString(), dwflags.toInt(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegGetValueW(hkey.toString(), lpsubkey.toString(), lpvalue.toString(), dwflags.toInt(), pdwtype.toString(), pvdata.toString(), pcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadAppKeyA(lpfile.toString(), phkresult.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadAppKeyW(lpfile.toString(), phkresult.toString(), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()) as Int).toUInt() else 0u

public actual fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadKeyA(hkey.toString(), lpsubkey.toString(), lpfile.toString()) as Int).toUInt() else 0u

public actual fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadKeyW(hkey.toString(), lpsubkey.toString(), lpfile.toString()) as Int).toUInt() else 0u

public actual fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadMUIStringA(hkey.toString(), pszvalue.toString(), pszoutbuf.toString(), cboutbuf.toInt(), pcbdata.toString(), flags.toInt(), pszdirectory.toString()) as Int).toUInt() else 0u

public actual fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegLoadMUIStringW(hkey.toString(), pszvalue.toString(), pszoutbuf.toString(), cboutbuf.toInt(), pcbdata.toString(), flags.toInt(), pszdirectory.toString()) as Int).toUInt() else 0u

public actual fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(hkey.toString(), bwatchsubtree, dwnotifyfilter.toInt(), hevent.toString(), fasynchronous) as Int).toUInt() else 0u

public actual fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenCurrentUser(samdesired.toInt(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyA(hkey.toString(), lpsubkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyExA(hkey.toString(), lpsubkey.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyExW(hkey.toString(), lpsubkey.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(hkey.toString(), lpsubkey.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.toString(), htransaction.toString(), pextendedparemeter.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(hkey.toString(), lpsubkey.toString(), uloptions.toInt(), samdesired.toInt(), phkresult.toString(), htransaction.toString(), pextendedparemeter.toString()) as Int).toUInt() else 0u

public actual fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenKeyW(hkey.toString(), lpsubkey.toString(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(htoken.toString(), dwoptions.toInt(), samdesired.toInt(), phkresult.toString()) as Int).toUInt() else 0u

public actual fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegOverridePredefKey(hkey.toString(), hnewhkey.toString()) as Int).toUInt() else 0u

public actual fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryInfoKeyA(hkey.toString(), lpclass.toString(), lpcchclass.toString(), lpreserved.toString(), lpcsubkeys.toString(), lpcbmaxsubkeylen.toString(), lpcbmaxclasslen.toString(), lpcvalues.toString(), lpcbmaxvaluenamelen.toString(), lpcbmaxvaluelen.toString(), lpcbsecuritydescriptor.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryInfoKeyW(hkey.toString(), lpclass.toString(), lpcchclass.toString(), lpreserved.toString(), lpcsubkeys.toString(), lpcbmaxsubkeylen.toString(), lpcbmaxclasslen.toString(), lpcvalues.toString(), lpcbmaxvaluenamelen.toString(), lpcbmaxvaluelen.toString(), lpcbsecuritydescriptor.toString(), lpftlastwritetime.toString()) as Int).toUInt() else 0u

public actual fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(hkey.toString(), val_list.toString(), num_vals.toInt(), lpvaluebuf.toString(), ldwtotsize.toString()) as Int).toUInt() else 0u

public actual fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(hkey.toString(), val_list.toString(), num_vals.toInt(), lpvaluebuf.toString(), ldwtotsize.toString()) as Int).toUInt() else 0u

public actual fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryReflectionKey(hbase.toString(), bisreflectiondisabled.toString()) as Int).toUInt() else 0u

public actual fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryValueA(hkey.toString(), lpsubkey.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryValueExA(hkey.toString(), lpvaluename.toString(), lpreserved.toString(), lptype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryValueExW(hkey.toString(), lpvaluename.toString(), lpreserved.toString(), lptype.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegQueryValueW(hkey.toString(), lpsubkey.toString(), lpdata.toString(), lpcbdata.toString()) as Int).toUInt() else 0u

public actual fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegRenameKey(hkey.toString(), lpsubkeyname.toString(), lpnewkeyname.toString()) as Int).toUInt() else 0u

public actual fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegReplaceKeyA(hkey.toString(), lpsubkey.toString(), lpnewfile.toString(), lpoldfile.toString()) as Int).toUInt() else 0u

public actual fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegReplaceKeyW(hkey.toString(), lpsubkey.toString(), lpnewfile.toString(), lpoldfile.toString()) as Int).toUInt() else 0u

public actual fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegRestoreKeyA(hkey.toString(), lpfile.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegRestoreKeyW(hkey.toString(), lpfile.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSaveKeyA(hkey.toString(), lpfile.toString(), lpsecurityattributes.toString()) as Int).toUInt() else 0u

public actual fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSaveKeyExA(hkey.toString(), lpfile.toString(), lpsecurityattributes.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSaveKeyExW(hkey.toString(), lpfile.toString(), lpsecurityattributes.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSaveKeyW(hkey.toString(), lpfile.toString(), lpsecurityattributes.toString()) as Int).toUInt() else 0u

public actual fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetKeySecurity(hkey.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetKeyValueA(hkey.toString(), lpsubkey.toString(), lpvaluename.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetKeyValueW(hkey.toString(), lpsubkey.toString(), lpvaluename.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetValueA(hkey.toString(), lpsubkey.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetValueExA(hkey.toString(), lpvaluename.toString(), reserved.toInt(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetValueExW(hkey.toString(), lpvaluename.toString(), reserved.toInt(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegSetValueW(hkey.toString(), lpsubkey.toString(), dwtype.toInt(), lpdata.toString(), cbdata.toInt()) as Int).toUInt() else 0u

public actual fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegUnLoadKeyA(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u

public actual fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    if (_windowsWin32SystemRegistryNapiAddon != null) (_windowsWin32SystemRegistryNapiAddon.windowssys_windows_win32_system_registry_RegUnLoadKeyW(hkey.toString(), lpsubkey.toString()) as Int).toUInt() else 0u
