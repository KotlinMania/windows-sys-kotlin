package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("api-ms-win-core-state-helpers-l1-1-0.dll", "GetRegistryValueWithFallbackW", longArrayOf(hkeyprimary, pwszprimarysubkey, hkeyfallback, pwszfallbacksubkey, pwszvalue, dwflags.toLong(), pdwtype, pvdata, cbdatain.toLong(), pcbdataout))
    return Foundation.WIN32_ERROR()
}

public fun RegCloseKey(hkey: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCloseKey", longArrayOf(hkey))
    return Foundation.WIN32_ERROR()
}

public fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryA", longArrayOf(lpmachinename, hkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryExA", longArrayOf(lpmachinename, hkey, flags.toLong(), phkresult)).toInt()
}

public fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int {
    return Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryExW", longArrayOf(lpmachinename, hkey, flags.toLong(), phkresult)).toInt()
}

public fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegConnectRegistryW", longArrayOf(lpmachinename, hkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCopyTreeA", longArrayOf(hkeysrc, lpsubkey, hkeydest))
    return Foundation.WIN32_ERROR()
}

public fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCopyTreeW", longArrayOf(hkeysrc, lpsubkey, hkeydest))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyA", longArrayOf(hkey, lpsubkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyExA", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyExW", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Foundation.HANDLE, pextendedparemeter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyTransactedA", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition, Win32DynamicFfi.objectSlot(htransaction), pextendedparemeter))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Foundation.HANDLE, pextendedparemeter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyTransactedW", longArrayOf(hkey, lpsubkey, reserved.toLong(), lpclass, dwoptions.toLong(), samdesired.toLong(), lpsecurityattributes, phkresult, lpdwdisposition, Win32DynamicFfi.objectSlot(htransaction), pextendedparemeter))
    return Foundation.WIN32_ERROR()
}

public fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegCreateKeyW", longArrayOf(hkey, lpsubkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyA", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyExA", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyExW", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: Foundation.HANDLE, pextendedparameter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyTransactedA", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong(), Win32DynamicFfi.objectSlot(htransaction), pextendedparameter))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: Foundation.HANDLE, pextendedparameter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyTransactedW", longArrayOf(hkey, lpsubkey, samdesired.toLong(), reserved.toLong(), Win32DynamicFfi.objectSlot(htransaction), pextendedparameter))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyValueA", longArrayOf(hkey, lpsubkey, lpvaluename))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyValueW", longArrayOf(hkey, lpsubkey, lpvaluename))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteKeyW", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteTreeA", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteTreeW", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteValueA", longArrayOf(hkey, lpvaluename))
    return Foundation.WIN32_ERROR()
}

public fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDeleteValueW", longArrayOf(hkey, lpvaluename))
    return Foundation.WIN32_ERROR()
}

public fun RegDisablePredefinedCache(): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDisablePredefinedCache", longArrayOf())
    return Foundation.WIN32_ERROR()
}

public fun RegDisablePredefinedCacheEx(): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDisablePredefinedCacheEx", longArrayOf())
    return Foundation.WIN32_ERROR()
}

public fun RegDisableReflectionKey(hbase: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegDisableReflectionKey", longArrayOf(hbase))
    return Foundation.WIN32_ERROR()
}

public fun RegEnableReflectionKey(hbase: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnableReflectionKey", longArrayOf(hbase))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyA", longArrayOf(hkey, dwindex.toLong(), lpname, cchname.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyExA", longArrayOf(hkey, dwindex.toLong(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyExW", longArrayOf(hkey, dwindex.toLong(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumKeyW", longArrayOf(hkey, dwindex.toLong(), lpname, cchname.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumValueA", longArrayOf(hkey, dwindex.toLong(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegEnumValueW", longArrayOf(hkey, dwindex.toLong(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegFlushKey(hkey: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegFlushKey", longArrayOf(hkey))
    return Foundation.WIN32_ERROR()
}

public fun RegGetKeySecurity(hkey: HKEY, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegGetKeySecurity", longArrayOf(hkey, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor), lpcbsecuritydescriptor))
    return Foundation.WIN32_ERROR()
}

public fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegGetValueA", longArrayOf(hkey, lpsubkey, lpvalue, dwflags.toLong(), pdwtype, pvdata, pcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegGetValueW", longArrayOf(hkey, lpsubkey, lpvalue, dwflags.toLong(), pdwtype, pvdata, pcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadAppKeyA", longArrayOf(lpfile, phkresult, samdesired.toLong(), dwoptions.toLong(), reserved.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadAppKeyW", longArrayOf(lpfile, phkresult, samdesired.toLong(), dwoptions.toLong(), reserved.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadKeyA", longArrayOf(hkey, lpsubkey, lpfile))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadKeyW", longArrayOf(hkey, lpsubkey, lpfile))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadMUIStringA", longArrayOf(hkey, pszvalue, pszoutbuf, cboutbuf.toLong(), pcbdata, flags.toLong(), pszdirectory))
    return Foundation.WIN32_ERROR()
}

public fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegLoadMUIStringW", longArrayOf(hkey, pszvalue, pszoutbuf, cboutbuf.toLong(), pcbdata, flags.toLong(), pszdirectory))
    return Foundation.WIN32_ERROR()
}

public fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: Foundation.HANDLE, fasynchronous: BOOL): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegNotifyChangeKeyValue", longArrayOf(hkey, bwatchsubtree.toLong(), dwnotifyfilter.toLong(), Win32DynamicFfi.objectSlot(hevent), fasynchronous.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenCurrentUser", longArrayOf(samdesired.toLong(), phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyA", longArrayOf(hkey, lpsubkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyExA", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyExW", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: Foundation.HANDLE, pextendedparemeter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyTransactedA", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult, Win32DynamicFfi.objectSlot(htransaction), pextendedparemeter))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: Foundation.HANDLE, pextendedparemeter: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyTransactedW", longArrayOf(hkey, lpsubkey, uloptions.toLong(), samdesired.toLong(), phkresult, Win32DynamicFfi.objectSlot(htransaction), pextendedparemeter))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenKeyW", longArrayOf(hkey, lpsubkey, phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOpenUserClassesRoot(htoken: Foundation.HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOpenUserClassesRoot", longArrayOf(Win32DynamicFfi.objectSlot(htoken), dwoptions.toLong(), samdesired.toLong(), phkresult))
    return Foundation.WIN32_ERROR()
}

public fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegOverridePredefKey", longArrayOf(hkey, hnewhkey))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryInfoKeyA", longArrayOf(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryInfoKeyW", longArrayOf(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryMultipleValuesA", longArrayOf(hkey, val_list, num_vals.toLong(), lpvaluebuf, ldwtotsize))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryMultipleValuesW", longArrayOf(hkey, val_list, num_vals.toLong(), lpvaluebuf, ldwtotsize))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryReflectionKey", longArrayOf(hbase, bisreflectiondisabled))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueA", longArrayOf(hkey, lpsubkey, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueExA", longArrayOf(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueExW", longArrayOf(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegQueryValueW", longArrayOf(hkey, lpsubkey, lpdata, lpcbdata))
    return Foundation.WIN32_ERROR()
}

public fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegRenameKey", longArrayOf(hkey, lpsubkeyname, lpnewkeyname))
    return Foundation.WIN32_ERROR()
}

public fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegReplaceKeyA", longArrayOf(hkey, lpsubkey, lpnewfile, lpoldfile))
    return Foundation.WIN32_ERROR()
}

public fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegReplaceKeyW", longArrayOf(hkey, lpsubkey, lpnewfile, lpoldfile))
    return Foundation.WIN32_ERROR()
}

public fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegRestoreKeyA", longArrayOf(hkey, lpfile, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegRestoreKeyW", longArrayOf(hkey, lpfile, dwflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyA", longArrayOf(hkey, lpfile, lpsecurityattributes))
    return Foundation.WIN32_ERROR()
}

public fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyExA", longArrayOf(hkey, lpfile, lpsecurityattributes, flags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyExW", longArrayOf(hkey, lpfile, lpsecurityattributes, flags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSaveKeyW", longArrayOf(hkey, lpfile, lpsecurityattributes))
    return Foundation.WIN32_ERROR()
}

public fun RegSetKeySecurity(hkey: HKEY, securityinformation: Security.OBJECT_SECURITY_INFORMATION, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeySecurity", longArrayOf(hkey, Win32DynamicFfi.objectSlot(securityinformation), Win32DynamicFfi.objectSlot(psecuritydescriptor)))
    return Foundation.WIN32_ERROR()
}

public fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeyValueA", longArrayOf(hkey, lpsubkey, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetKeyValueW", longArrayOf(hkey, lpsubkey, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueA", longArrayOf(hkey, lpsubkey, dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueExA", longArrayOf(hkey, lpvaluename, reserved.toLong(), dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueExW", longArrayOf(hkey, lpvaluename, reserved.toLong(), dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegSetValueW", longArrayOf(hkey, lpsubkey, dwtype.toLong(), lpdata, cbdata.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegUnLoadKeyA", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}

public fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("advapi32.dll", "RegUnLoadKeyW", longArrayOf(hkey, lpsubkey))
    return Foundation.WIN32_ERROR()
}
