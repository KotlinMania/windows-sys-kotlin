package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("api-ms-win-core-state-helpers-l1-1-0.dll", "GetRegistryValueWithFallbackW", longArrayOf(hkeyprimary, pwszprimarysubkey, hkeyfallback, pwszfallbacksubkey, pwszvalue, dwflags.toLong(), pdwtype, pvdata, cbdatain.toLong(), pcbdataout)).toUInt()
}

public fun RegCloseKey(hkey: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCloseKey", longArrayOf(hkey)).toUInt()
}

public fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryA", longArrayOf(lpmachinename, hkey, phkresult)).toUInt()
}

public fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryExA", longArrayOf(lpmachinename, hkey, flags.toLong(), phkresult)).toInt()
}

public fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryExW", longArrayOf(lpmachinename, hkey, flags.toLong(), phkresult)).toInt()
}

public fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryW", longArrayOf(lpmachinename, hkey, phkresult)).toUInt()
}

public fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCopyTreeA", longArrayOf(hkeysrc, lpsubkey, hkeydest)).toUInt()
}

public fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCopyTreeW", longArrayOf(hkeysrc, lpsubkey, hkeydest)).toUInt()
}

public fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyA", longArrayOf(hkey, lpsubkey, phkresult)).toUInt()
}

public fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyExA", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition)).toUInt()
}

public fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyExW", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition)).toUInt()
}

public fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyTransactedA", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter)).toUInt()
}

public fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyTransactedW", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter)).toUInt()
}

public fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyW", longArrayOf(hkey, lpsubkey, phkresult)).toUInt()
}

public fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyA", longArrayOf(hkey, lpsubkey)).toUInt()
}

public fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyExA", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong())).toUInt()
}

public fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyExW", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong())).toUInt()
}

public fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyTransactedA", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong(), htransaction, pextendedparameter)).toUInt()
}

public fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyTransactedW", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong(), htransaction, pextendedparameter)).toUInt()
}

public fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyValueA", longArrayOf(hkey, lpsubkey, lpvaluename)).toUInt()
}

public fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyValueW", longArrayOf(hkey, lpsubkey, lpvaluename)).toUInt()
}

public fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyW", longArrayOf(hkey, lpsubkey)).toUInt()
}

public fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteTreeA", longArrayOf(hkey, lpsubkey)).toUInt()
}

public fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteTreeW", longArrayOf(hkey, lpsubkey)).toUInt()
}

public fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteValueA", longArrayOf(hkey, lpvaluename)).toUInt()
}

public fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteValueW", longArrayOf(hkey, lpvaluename)).toUInt()
}

public fun RegDisablePredefinedCache(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDisablePredefinedCache", longArrayOf()).toUInt()
}

public fun RegDisablePredefinedCacheEx(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDisablePredefinedCacheEx", longArrayOf()).toUInt()
}

public fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegDisableReflectionKey", longArrayOf(hbase)).toUInt()
}

public fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnableReflectionKey", longArrayOf(hbase)).toUInt()
}

public fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyA", longArrayOf(hkey, dwindex.toLong(), lpname, cchname.toLong())).toUInt()
}

public fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyExA", longArrayOf(hkey, dwindex.toLong(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime)).toUInt()
}

public fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyExW", longArrayOf(hkey, dwindex.toLong(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime)).toUInt()
}

public fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyW", longArrayOf(hkey, dwindex.toLong(), lpname, cchname.toLong())).toUInt()
}

public fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumValueA", longArrayOf(hkey, dwindex.toLong(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata)).toUInt()
}

public fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegEnumValueW", longArrayOf(hkey, dwindex.toLong(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata)).toUInt()
}

public fun RegFlushKey(hkey: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegFlushKey", longArrayOf(hkey)).toUInt()
}

public fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegGetKeySecurity", longArrayOf(hkey, securityinformation.toLong(), psecuritydescriptor, lpcbsecuritydescriptor)).toUInt()
}

public fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegGetValueA", longArrayOf(hkey, lpsubkey, lpvalue, dwflags.toLong(), pdwtype, pvdata, pcbdata)).toUInt()
}

public fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegGetValueW", longArrayOf(hkey, lpsubkey, lpvalue, dwflags.toLong(), pdwtype, pvdata, pcbdata)).toUInt()
}

public fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadAppKeyA", longArrayOf(lpfile, phkresult, samdesired.toLong(), dwoptions.toLong(), reserved.toLong())).toUInt()
}

public fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadAppKeyW", longArrayOf(lpfile, phkresult, samdesired.toLong(), dwoptions.toLong(), reserved.toLong())).toUInt()
}

public fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadKeyA", longArrayOf(hkey, lpsubkey, lpfile)).toUInt()
}

public fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadKeyW", longArrayOf(hkey, lpsubkey, lpfile)).toUInt()
}

public fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadMUIStringA", longArrayOf(hkey, pszvalue, pszoutbuf, cboutbuf.toLong(), pcbdata, flags.toLong(), pszdirectory)).toUInt()
}

public fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegLoadMUIStringW", longArrayOf(hkey, pszvalue, pszoutbuf, cboutbuf.toLong(), pcbdata, flags.toLong(), pszdirectory)).toUInt()
}

public fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegNotifyChangeKeyValue", longArrayOf(hkey, bwatchsubtree.toLong(), dwnotifyfilter.toLong(), hevent, fasynchronous.toLong())).toUInt()
}

public fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenCurrentUser", longArrayOf(samdesired.toLong(), phkresult)).toUInt()
}

public fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyA", longArrayOf(hkey, lpsubkey, phkresult)).toUInt()
}

public fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyExA", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult)).toUInt()
}

public fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyExW", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult)).toUInt()
}

public fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyTransactedA", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult, htransaction, pextendedparemeter)).toUInt()
}

public fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyTransactedW", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult, htransaction, pextendedparemeter)).toUInt()
}

public fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyW", longArrayOf(hkey, lpsubkey, phkresult)).toUInt()
}

public fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOpenUserClassesRoot", longArrayOf(htoken, dwoptions.toLong(), samdesired.toLong(), phkresult)).toUInt()
}

public fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegOverridePredefKey", longArrayOf(hkey, hnewhkey)).toUInt()
}

public fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryInfoKeyA", longArrayOf(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime)).toUInt()
}

public fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryInfoKeyW", longArrayOf(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime)).toUInt()
}

public fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryMultipleValuesA", longArrayOf(hkey, val_list, num_vals.toLong(), lpvaluebuf, ldwtotsize)).toUInt()
}

public fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryMultipleValuesW", longArrayOf(hkey, val_list, num_vals.toLong(), lpvaluebuf, ldwtotsize)).toUInt()
}

public fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryReflectionKey", longArrayOf(hbase, bisreflectiondisabled)).toUInt()
}

public fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueA", longArrayOf(hkey, lpsubkey, lpdata, lpcbdata)).toUInt()
}

public fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueExA", longArrayOf(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata)).toUInt()
}

public fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueExW", longArrayOf(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata)).toUInt()
}

public fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueW", longArrayOf(hkey, lpsubkey, lpdata, lpcbdata)).toUInt()
}

public fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegRenameKey", longArrayOf(hkey, lpsubkeyname, lpnewkeyname)).toUInt()
}

public fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegReplaceKeyA", longArrayOf(hkey, lpsubkey, lpnewfile, lpoldfile)).toUInt()
}

public fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegReplaceKeyW", longArrayOf(hkey, lpsubkey, lpnewfile, lpoldfile)).toUInt()
}

public fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegRestoreKeyA", longArrayOf(hkey, lpfile, dwflags.toLong())).toUInt()
}

public fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegRestoreKeyW", longArrayOf(hkey, lpfile, dwflags.toLong())).toUInt()
}

public fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyA", longArrayOf(hkey, lpfile, lpsecurityattributes)).toUInt()
}

public fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyExA", longArrayOf(hkey, lpfile, lpsecurityattributes, flags.toLong())).toUInt()
}

public fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyExW", longArrayOf(hkey, lpfile, lpsecurityattributes, flags.toLong())).toUInt()
}

public fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyW", longArrayOf(hkey, lpfile, lpsecurityattributes)).toUInt()
}

public fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeySecurity", longArrayOf(hkey, securityinformation.toLong(), psecuritydescriptor)).toUInt()
}

public fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeyValueA", longArrayOf(hkey, lpsubkey, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeyValueW", longArrayOf(hkey, lpsubkey, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueA", longArrayOf(hkey, lpsubkey, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueExA", longArrayOf(hkey, lpvaluename, reserved.toLong(), dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueExW", longArrayOf(hkey, lpvaluename, reserved.toLong(), dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueW", longArrayOf(hkey, lpsubkey, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegUnLoadKeyA", longArrayOf(hkey, lpsubkey)).toUInt()
}

public fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegUnLoadKeyW", longArrayOf(hkey, lpsubkey)).toUInt()
}
