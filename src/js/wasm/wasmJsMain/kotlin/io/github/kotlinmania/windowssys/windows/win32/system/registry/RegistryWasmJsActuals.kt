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

public actual fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR =
    0u

public actual fun RegCloseKey(hkey: HKEY): WIN32_ERROR =
    0u

public actual fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    0

public actual fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    0

public actual fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR =
    0u

public actual fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR =
    0u

public actual fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    0u

public actual fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    0u

public actual fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    0u

public actual fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    0u

public actual fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR =
    0u

public actual fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegDisablePredefinedCache(): WIN32_ERROR =
    0u

public actual fun RegDisablePredefinedCacheEx(): WIN32_ERROR =
    0u

public actual fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR =
    0u

public actual fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR =
    0u

public actual fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR =
    0u

public actual fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR =
    0u

public actual fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegFlushKey(hkey: HKEY): WIN32_ERROR =
    0u

public actual fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    0u

public actual fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    0u

public actual fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    0u

public actual fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR =
    0u

public actual fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR =
    0u

public actual fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR =
    0u

public actual fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    0u

public actual fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR =
    0u

public actual fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR =
    0u

public actual fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR =
    0u

public actual fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR =
    0u

public actual fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR =
    0u

public actual fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR =
    0u

public actual fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR =
    0u

public actual fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR =
    0u

public actual fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    0u

public actual fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    0u

public actual fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR =
    0u

public actual fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    0u

public actual fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    0u

public actual fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    0u
