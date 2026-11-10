@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32SystemRegistryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW(hkeyprimary: Long, pwszprimarysubkey: Long, hkeyfallback: Long, pwszfallbacksubkey: Long, pwszvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, cbdatain: Int, pcbdataout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regConnectRegistryA(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regConnectRegistryExA(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regConnectRegistryExW(lpmachinename: Long, hkey: Long, flags: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regConnectRegistryW(lpmachinename: Long, hkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCopyTreeA(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCopyTreeW(hkeysrc: Long, lpsubkey: Long, hkeydest: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyExA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyExW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyTransactedA(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyTransactedW(hkey: Long, lpsubkey: Long, reserved: Int, lpclass: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regCreateKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyExA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyExW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyTransactedA(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyTransactedW(hkey: Long, lpsubkey: Long, samdesired: Int, reserved: Int, htransaction: Long, pextendedparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteKeyW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteTreeA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteTreeW(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteValueA(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDeleteValueW(hkey: Long, lpvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDisablePredefinedCache(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regDisableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnableReflectionKey(hbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumKeyA(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumKeyExA(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumKeyExW(hkey: Long, dwindex: Int, lpname: Long, lpcchname: Long, lpreserved: Long, lpclass: Long, lpcchclass: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumKeyW(hkey: Long, dwindex: Int, lpname: Long, cchname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumValueA(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regEnumValueW(hkey: Long, dwindex: Int, lpvaluename: Long, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regFlushKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regGetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regGetValueA(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regGetValueW(hkey: Long, lpsubkey: Long, lpvalue: Long, dwflags: Int, pdwtype: Long, pvdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadAppKeyA(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadAppKeyW(lpfile: Long, phkresult: Long, samdesired: Int, dwoptions: Int, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadKeyA(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadKeyW(hkey: Long, lpsubkey: Long, lpfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadMUIStringA(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regLoadMUIStringW(hkey: Long, pszvalue: Long, pszoutbuf: Long, cboutbuf: Int, pcbdata: Long, flags: Int, pszdirectory: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regNotifyChangeKeyValue(hkey: Long, bwatchsubtree: Int, dwnotifyfilter: Int, hevent: Long, fasynchronous: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenCurrentUser(samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyA(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyExA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyExW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyTransactedA(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyTransactedW(hkey: Long, lpsubkey: Long, uloptions: Int, samdesired: Int, phkresult: Long, htransaction: Long, pextendedparemeter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenKeyW(hkey: Long, lpsubkey: Long, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOpenUserClassesRoot(htoken: Long, dwoptions: Int, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regOverridePredefKey(hkey: Long, hnewhkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryInfoKeyA(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryInfoKeyW(hkey: Long, lpclass: Long, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryMultipleValuesA(hkey: Long, valList: Long, numVals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryMultipleValuesW(hkey: Long, valList: Long, numVals: Int, lpvaluebuf: Long, ldwtotsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryReflectionKey(hbase: Long, bisreflectiondisabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryValueA(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryValueExA(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryValueExW(hkey: Long, lpvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regQueryValueW(hkey: Long, lpsubkey: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regRenameKey(hkey: Long, lpsubkeyname: Long, lpnewkeyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regReplaceKeyA(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regReplaceKeyW(hkey: Long, lpsubkey: Long, lpnewfile: Long, lpoldfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regRestoreKeyA(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regRestoreKeyW(hkey: Long, lpfile: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSaveKeyA(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSaveKeyExA(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSaveKeyExW(hkey: Long, lpfile: Long, lpsecurityattributes: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSaveKeyW(hkey: Long, lpfile: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetKeyValueA(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetKeyValueW(hkey: Long, lpsubkey: Long, lpvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetValueA(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetValueExA(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetValueExW(hkey: Long, lpvaluename: Long, reserved: Int, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regSetValueW(hkey: Long, lpsubkey: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regUnLoadKeyA(hkey: Long, lpsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_registry_regUnLoadKeyW(hkey: Long, lpsubkey: Long): Int
}

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, cbdatain: UInt, pcbdataout: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW((hkeyprimary?.value ?: 0L), (pwszprimarysubkey?.value ?: 0L), (hkeyfallback?.value ?: 0L), (pwszfallbacksubkey?.value ?: 0L), (pwszvalue?.value ?: 0L), dwflags.toInt(), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), cbdatain.toInt(), (pcbdataout?.value ?: 0L)).toUInt()

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCloseKey((hkey?.value ?: 0L)).toUInt()

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regConnectRegistryA((lpmachinename?.value ?: 0L), (hkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regConnectRegistryExA((lpmachinename?.value ?: 0L), (hkey?.value ?: 0L), flags.toInt(), (phkresult?.value ?: 0L))

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regConnectRegistryExW((lpmachinename?.value ?: 0L), (hkey?.value ?: 0L), flags.toInt(), (phkresult?.value ?: 0L))

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regConnectRegistryW((lpmachinename?.value ?: 0L), (hkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCopyTreeA((hkeysrc?.value ?: 0L), (lpsubkey?.value ?: 0L), (hkeydest?.value ?: 0L)).toUInt()

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCopyTreeW((hkeysrc?.value ?: 0L), (lpsubkey?.value ?: 0L), (hkeydest?.value ?: 0L)).toUInt()

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyExA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), reserved.toInt(), (lpclass?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L)).toUInt()

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyExW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), reserved.toInt(), (lpclass?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L)).toUInt()

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyTransactedA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), reserved.toInt(), (lpclass?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L), (htransaction?.value ?: 0L), (pextendedparemeter?.value ?: 0L)).toUInt()

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyTransactedW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), reserved.toInt(), (lpclass?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L), (htransaction?.value ?: 0L), (pextendedparemeter?.value ?: 0L)).toUInt()

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regCreateKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyExA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyExW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), samdesired.toInt(), reserved.toInt()).toUInt()

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyTransactedA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), samdesired.toInt(), reserved.toInt(), (htransaction?.value ?: 0L), (pextendedparameter?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyTransactedW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), samdesired.toInt(), reserved.toInt(), (htransaction?.value ?: 0L), (pextendedparameter?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyValueA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvaluename?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyValueW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvaluename?.value ?: 0L)).toUInt()

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteTreeA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteTreeW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteValueA((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L)).toUInt()

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDeleteValueW((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L)).toUInt()

public actual fun regDisablePredefinedCache(): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDisablePredefinedCache().toUInt()

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx().toUInt()

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regDisableReflectionKey((hbase?.value ?: 0L)).toUInt()

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnableReflectionKey((hbase?.value ?: 0L)).toUInt()

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumKeyA((hkey?.value ?: 0L), dwindex.toInt(), (lpname?.value ?: 0L), cchname.toInt()).toUInt()

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumKeyExA((hkey?.value ?: 0L), dwindex.toInt(), (lpname?.value ?: 0L), (lpcchname?.value ?: 0L), (lpreserved?.value ?: 0L), (lpclass?.value ?: 0L), (lpcchclass?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumKeyExW((hkey?.value ?: 0L), dwindex.toInt(), (lpname?.value ?: 0L), (lpcchname?.value ?: 0L), (lpreserved?.value ?: 0L), (lpclass?.value ?: 0L), (lpcchclass?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumKeyW((hkey?.value ?: 0L), dwindex.toInt(), (lpname?.value ?: 0L), cchname.toInt()).toUInt()

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumValueA((hkey?.value ?: 0L), dwindex.toInt(), (lpvaluename?.value ?: 0L), (lpcchvaluename?.value ?: 0L), (lpreserved?.value ?: 0L), (lptype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regEnumValueW((hkey?.value ?: 0L), dwindex.toInt(), (lpvaluename?.value ?: 0L), (lpcchvaluename?.value ?: 0L), (lpreserved?.value ?: 0L), (lptype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regFlushKey((hkey?.value ?: 0L)).toUInt()

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regGetKeySecurity((hkey?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regGetValueA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvalue?.value ?: 0L), dwflags.toInt(), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regGetValueW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvalue?.value ?: 0L), dwflags.toInt(), (pdwtype?.value ?: 0L), (pvdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadAppKeyA((lpfile?.value ?: 0L), (phkresult?.value ?: 0L), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadAppKeyW((lpfile?.value ?: 0L), (phkresult?.value ?: 0L), samdesired.toInt(), dwoptions.toInt(), reserved.toInt()).toUInt()

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpfile?.value ?: 0L)).toUInt()

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpfile?.value ?: 0L)).toUInt()

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadMUIStringA((hkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pszoutbuf?.value ?: 0L), cboutbuf.toInt(), (pcbdata?.value ?: 0L), flags.toInt(), (pszdirectory?.value ?: 0L)).toUInt()

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regLoadMUIStringW((hkey?.value ?: 0L), (pszvalue?.value ?: 0L), (pszoutbuf?.value ?: 0L), cboutbuf.toInt(), (pcbdata?.value ?: 0L), flags.toInt(), (pszdirectory?.value ?: 0L)).toUInt()

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regNotifyChangeKeyValue((hkey?.value ?: 0L), bwatchsubtree, dwnotifyfilter.toInt(), (hevent?.value ?: 0L), fasynchronous).toUInt()

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenCurrentUser(samdesired.toInt(), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyExA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyExW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyTransactedA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L), (htransaction?.value ?: 0L), (pextendedparemeter?.value ?: 0L)).toUInt()

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyTransactedW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), uloptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L), (htransaction?.value ?: 0L), (pextendedparemeter?.value ?: 0L)).toUInt()

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOpenUserClassesRoot((htoken?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (phkresult?.value ?: 0L)).toUInt()

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regOverridePredefKey((hkey?.value ?: 0L), (hnewhkey?.value ?: 0L)).toUInt()

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryInfoKeyA((hkey?.value ?: 0L), (lpclass?.value ?: 0L), (lpcchclass?.value ?: 0L), (lpreserved?.value ?: 0L), (lpcsubkeys?.value ?: 0L), (lpcbmaxsubkeylen?.value ?: 0L), (lpcbmaxclasslen?.value ?: 0L), (lpcvalues?.value ?: 0L), (lpcbmaxvaluenamelen?.value ?: 0L), (lpcbmaxvaluelen?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryInfoKeyW((hkey?.value ?: 0L), (lpclass?.value ?: 0L), (lpcchclass?.value ?: 0L), (lpreserved?.value ?: 0L), (lpcsubkeys?.value ?: 0L), (lpcbmaxsubkeylen?.value ?: 0L), (lpcbmaxclasslen?.value ?: 0L), (lpcvalues?.value ?: 0L), (lpcbmaxvaluenamelen?.value ?: 0L), (lpcbmaxvaluelen?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L), (lpftlastwritetime?.value ?: 0L)).toUInt()

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryMultipleValuesA((hkey?.value ?: 0L), (valList?.value ?: 0L), numVals.toInt(), (lpvaluebuf?.value ?: 0L), (ldwtotsize?.value ?: 0L)).toUInt()

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryMultipleValuesW((hkey?.value ?: 0L), (valList?.value ?: 0L), numVals.toInt(), (lpvaluebuf?.value ?: 0L), (ldwtotsize?.value ?: 0L)).toUInt()

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryReflectionKey((hbase?.value ?: 0L), (bisreflectiondisabled?.value ?: 0L)).toUInt()

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryValueA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryValueExA((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L), (lpreserved?.value ?: 0L), (lptype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryValueExW((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L), (lpreserved?.value ?: 0L), (lptype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regQueryValueW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regRenameKey((hkey?.value ?: 0L), (lpsubkeyname?.value ?: 0L), (lpnewkeyname?.value ?: 0L)).toUInt()

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regReplaceKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpnewfile?.value ?: 0L), (lpoldfile?.value ?: 0L)).toUInt()

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regReplaceKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpnewfile?.value ?: 0L), (lpoldfile?.value ?: 0L)).toUInt()

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regRestoreKeyA((hkey?.value ?: 0L), (lpfile?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regRestoreKeyW((hkey?.value ?: 0L), (lpfile?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSaveKeyA((hkey?.value ?: 0L), (lpfile?.value ?: 0L), (lpsecurityattributes?.value ?: 0L)).toUInt()

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSaveKeyExA((hkey?.value ?: 0L), (lpfile?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), flags.toInt()).toUInt()

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSaveKeyExW((hkey?.value ?: 0L), (lpfile?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), flags.toInt()).toUInt()

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSaveKeyW((hkey?.value ?: 0L), (lpfile?.value ?: 0L), (lpsecurityattributes?.value ?: 0L)).toUInt()

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetKeySecurity((hkey?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetKeyValueA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvaluename?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetKeyValueW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpvaluename?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetValueA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetValueExA((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetValueExW((hkey?.value ?: 0L), (lpvaluename?.value ?: 0L), reserved.toInt(), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regSetValueW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regUnLoadKeyA((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    WindowsWin32SystemRegistryJniBridge.windowssys_windows_win32_system_registry_regUnLoadKeyW((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L)).toUInt()
