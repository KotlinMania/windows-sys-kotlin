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

private object WindowsWin32SystemRegistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(hkeyprimary: Long, pwszprimarysubkey: Long, hkeyfallback: Long, pwszfallbacksubkey: Long, pwszvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, cbdatain: Int, pcbdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegConnectRegistryA(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegConnectRegistryExA(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegConnectRegistryExW(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegConnectRegistryW(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCopyTreeA(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCopyTreeW(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyExA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyExW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegCreateKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyExA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyExW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteKeyW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteTreeA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteTreeW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteValueA(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDeleteValueW(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDisablePredefinedCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegDisableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumKeyA(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumKeyExA(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumKeyExW(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumKeyW(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumValueA(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegEnumValueW(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegFlushKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegGetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegGetValueA(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegGetValueW(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadAppKeyA(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadAppKeyW(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadKeyA(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadKeyW(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadMUIStringA(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegLoadMUIStringW(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(hkey: Long, bwatchsubtree: Int, dwnotifyfilter: Int, hevent: Long, fasynchronous: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenCurrentUser(samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyExA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyExW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(htoken: Long, dwoptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegOverridePredefKey(hkey: Long, hnewhkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryInfoKeyA(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryInfoKeyW(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(hkey: Long, val_list: Long, num_vals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(hkey: Long, val_list: Long, num_vals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryReflectionKey(hbase: Long, bisreflectiondisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryValueA(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryValueExA(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryValueExW(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegQueryValueW(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegRenameKey(hkey: Long, lpsubkeyname: Long, lpnewkeyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegReplaceKeyA(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegReplaceKeyW(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegRestoreKeyA(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegRestoreKeyW(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSaveKeyA(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSaveKeyExA(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSaveKeyExW(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSaveKeyW(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetValueA(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetValueExA(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetValueExW(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegSetValueW(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegUnLoadKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_RegUnLoadKeyW(hkey: Long, lpsubkey: Long): Int
}

public actual fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(hkeyprimary, pwszprimarysubkey, hkeyfallback, pwszfallbacksubkey, pwszvalue, dwflags.toInt(), pdwtype, pvdata, cbdatain.toInt(), pcbdataout).toUInt()

public actual fun RegCloseKey(hkey: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCloseKey(hkey).toUInt()

public actual fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegConnectRegistryA(lpmachinename, hkey, phkresult).toUInt()

public actual fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegConnectRegistryExA(lpmachinename, hkey, flags.toInt(), phkresult)

public actual fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegConnectRegistryExW(lpmachinename, hkey, flags.toInt(), phkresult)

public actual fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegConnectRegistryW(lpmachinename, hkey, phkresult).toUInt()

public actual fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCopyTreeA(hkeysrc, lpsubkey, hkeydest).toUInt()

public actual fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCopyTreeW(hkeysrc, lpsubkey, hkeydest).toUInt()

public actual fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyA(hkey, lpsubkey, phkresult).toUInt()

public actual fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyExA(hkey, lpsubkey, reserved.toInt(), lpclass, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition).toUInt()

public actual fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyExW(hkey, lpsubkey, reserved.toInt(), lpclass, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition).toUInt()

public actual fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(hkey, lpsubkey, reserved.toInt(), lpclass, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter).toUInt()

public actual fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(hkey, lpsubkey, reserved.toInt(), lpclass, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition, htransaction, pextendedparemeter).toUInt()

public actual fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegCreateKeyW(hkey, lpsubkey, phkresult).toUInt()

public actual fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyA(hkey, lpsubkey).toUInt()

public actual fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyExA(hkey, lpsubkey, samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyExW(hkey, lpsubkey, samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(hkey, lpsubkey, samdesired.toInt(), reserved.toInt(), htransaction, pextendedparameter).toUInt()

public actual fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(hkey, lpsubkey, samdesired.toInt(), reserved.toInt(), htransaction, pextendedparameter).toUInt()

public actual fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyValueA(hkey, lpsubkey, lpvaluename).toUInt()

public actual fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyValueW(hkey, lpsubkey, lpvaluename).toUInt()

public actual fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteKeyW(hkey, lpsubkey).toUInt()

public actual fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteTreeA(hkey, lpsubkey).toUInt()

public actual fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteTreeW(hkey, lpsubkey).toUInt()

public actual fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteValueA(hkey, lpvaluename).toUInt()

public actual fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDeleteValueW(hkey, lpvaluename).toUInt()

public actual fun RegDisablePredefinedCache(): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDisablePredefinedCache().toUInt()

public actual fun RegDisablePredefinedCacheEx(): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx().toUInt()

public actual fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegDisableReflectionKey(hbase).toUInt()

public actual fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnableReflectionKey(hbase).toUInt()

public actual fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumKeyA(hkey, dwindex.toInt(), lpname, cchname.toInt()).toUInt()

public actual fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumKeyExA(hkey, dwindex.toInt(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime).toUInt()

public actual fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumKeyExW(hkey, dwindex.toInt(), lpname, lpcchname, lpreserved, lpclass, lpcchclass, lpftlastwritetime).toUInt()

public actual fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumKeyW(hkey, dwindex.toInt(), lpname, cchname.toInt()).toUInt()

public actual fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumValueA(hkey, dwindex.toInt(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata).toUInt()

public actual fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegEnumValueW(hkey, dwindex.toInt(), lpvaluename, lpcchvaluename, lpreserved, lptype, lpdata, lpcbdata).toUInt()

public actual fun RegFlushKey(hkey: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegFlushKey(hkey).toUInt()

public actual fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegGetKeySecurity(hkey, securityinformation.toInt(), psecuritydescriptor, lpcbsecuritydescriptor).toUInt()

public actual fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegGetValueA(hkey, lpsubkey, lpvalue, dwflags.toInt(), pdwtype, pvdata, pcbdata).toUInt()

public actual fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegGetValueW(hkey, lpsubkey, lpvalue, dwflags.toInt(), pdwtype, pvdata, pcbdata).toUInt()

public actual fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadAppKeyA(lpfile, phkresult, samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadAppKeyW(lpfile, phkresult, samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadKeyA(hkey, lpsubkey, lpfile).toUInt()

public actual fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadKeyW(hkey, lpsubkey, lpfile).toUInt()

public actual fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadMUIStringA(hkey, pszvalue, pszoutbuf, cboutbuf.toInt(), pcbdata, flags.toInt(), pszdirectory).toUInt()

public actual fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegLoadMUIStringW(hkey, pszvalue, pszoutbuf, cboutbuf.toInt(), pcbdata, flags.toInt(), pszdirectory).toUInt()

public actual fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(hkey, bwatchsubtree, dwnotifyfilter.toInt(), hevent, fasynchronous).toUInt()

public actual fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenCurrentUser(samdesired.toInt(), phkresult).toUInt()

public actual fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyA(hkey, lpsubkey, phkresult).toUInt()

public actual fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyExA(hkey, lpsubkey, uloptions.toInt(), samdesired.toInt(), phkresult).toUInt()

public actual fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyExW(hkey, lpsubkey, uloptions.toInt(), samdesired.toInt(), phkresult).toUInt()

public actual fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(hkey, lpsubkey, uloptions.toInt(), samdesired.toInt(), phkresult, htransaction, pextendedparemeter).toUInt()

public actual fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(hkey, lpsubkey, uloptions.toInt(), samdesired.toInt(), phkresult, htransaction, pextendedparemeter).toUInt()

public actual fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenKeyW(hkey, lpsubkey, phkresult).toUInt()

public actual fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(htoken, dwoptions.toInt(), samdesired.toInt(), phkresult).toUInt()

public actual fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegOverridePredefKey(hkey, hnewhkey).toUInt()

public actual fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryInfoKeyA(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime).toUInt()

public actual fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryInfoKeyW(hkey, lpclass, lpcchclass, lpreserved, lpcsubkeys, lpcbmaxsubkeylen, lpcbmaxclasslen, lpcvalues, lpcbmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime).toUInt()

public actual fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(hkey, val_list, num_vals.toInt(), lpvaluebuf, ldwtotsize).toUInt()

public actual fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(hkey, val_list, num_vals.toInt(), lpvaluebuf, ldwtotsize).toUInt()

public actual fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryReflectionKey(hbase, bisreflectiondisabled).toUInt()

public actual fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryValueA(hkey, lpsubkey, lpdata, lpcbdata).toUInt()

public actual fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryValueExA(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata).toUInt()

public actual fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryValueExW(hkey, lpvaluename, lpreserved, lptype, lpdata, lpcbdata).toUInt()

public actual fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegQueryValueW(hkey, lpsubkey, lpdata, lpcbdata).toUInt()

public actual fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegRenameKey(hkey, lpsubkeyname, lpnewkeyname).toUInt()

public actual fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegReplaceKeyA(hkey, lpsubkey, lpnewfile, lpoldfile).toUInt()

public actual fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegReplaceKeyW(hkey, lpsubkey, lpnewfile, lpoldfile).toUInt()

public actual fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegRestoreKeyA(hkey, lpfile, dwflags.toInt()).toUInt()

public actual fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegRestoreKeyW(hkey, lpfile, dwflags.toInt()).toUInt()

public actual fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSaveKeyA(hkey, lpfile, lpsecurityattributes).toUInt()

public actual fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSaveKeyExA(hkey, lpfile, lpsecurityattributes, flags.toInt()).toUInt()

public actual fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSaveKeyExW(hkey, lpfile, lpsecurityattributes, flags.toInt()).toUInt()

public actual fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSaveKeyW(hkey, lpfile, lpsecurityattributes).toUInt()

public actual fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetKeySecurity(hkey, securityinformation.toInt(), psecuritydescriptor).toUInt()

public actual fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetKeyValueA(hkey, lpsubkey, lpvaluename, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetKeyValueW(hkey, lpsubkey, lpvaluename, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetValueA(hkey, lpsubkey, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetValueExA(hkey, lpvaluename, reserved.toInt(), dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetValueExW(hkey, lpvaluename, reserved.toInt(), dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegSetValueW(hkey, lpsubkey, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegUnLoadKeyA(hkey, lpsubkey).toUInt()

public actual fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_RegUnLoadKeyW(hkey, lpsubkey).toUInt()
