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

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, cbdatain: UInt, pcbdataout: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDisablePredefinedCache(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
