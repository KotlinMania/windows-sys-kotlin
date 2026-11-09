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

public expect fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR

public expect fun RegCloseKey(hkey: HKEY): WIN32_ERROR

public expect fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR

public expect fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int

public expect fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int

public expect fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR

public expect fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR

public expect fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR

public expect fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR

public expect fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR

public expect fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR

public expect fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR

public expect fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR

public expect fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR

public expect fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR

public expect fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR

public expect fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR

public expect fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR

public expect fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR

public expect fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR

public expect fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR

public expect fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR

public expect fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR

public expect fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR

public expect fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR

public expect fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR

public expect fun RegDisablePredefinedCache(): WIN32_ERROR

public expect fun RegDisablePredefinedCacheEx(): WIN32_ERROR

public expect fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR

public expect fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR

public expect fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR

public expect fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR

public expect fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR

public expect fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR

public expect fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR

public expect fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR

public expect fun RegFlushKey(hkey: HKEY): WIN32_ERROR

public expect fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR

public expect fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR

public expect fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR

public expect fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR

public expect fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR

public expect fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR

public expect fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR

public expect fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR

public expect fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR

public expect fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR

public expect fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR

public expect fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR

public expect fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR

public expect fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR

public expect fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR

public expect fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR

public expect fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR

public expect fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR

public expect fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR

public expect fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR

public expect fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR

public expect fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR

public expect fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR

public expect fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR

public expect fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR

public expect fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR

public expect fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR

public expect fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR

public expect fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR

public expect fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR

public expect fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR

public expect fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR

public expect fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR

public expect fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR

public expect fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR

public expect fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR

public expect fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR

public expect fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR

public expect fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR

public expect fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR

public expect fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR

public expect fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR

public expect fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR

public expect fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR

public expect fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR
