package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr, pvdata: MutPtr, cbdatain: UInt, pcbdataout: MutPtr): Win32Error

public expect fun regCloseKey(hkey: Hkey): Win32Error

public expect fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr): Win32Error

public expect fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int

public expect fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr): Int

public expect fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr): Win32Error

public expect fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error

public expect fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error

public expect fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error

public expect fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error

public expect fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Win32Error

public expect fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error

public expect fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error

public expect fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error

public expect fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error

public expect fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error

public expect fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error

public expect fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error

public expect fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr): Win32Error

public expect fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error

public expect fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error

public expect fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error

public expect fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error

public expect fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error

public expect fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error

public expect fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error

public expect fun regDisablePredefinedCache(): Win32Error

public expect fun regDisablePredefinedCacheEx(): Win32Error

public expect fun regDisableReflectionKey(hbase: Hkey): Win32Error

public expect fun regEnableReflectionKey(hbase: Hkey): Win32Error

public expect fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error

public expect fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr, lpreserved: ConstPtr, lpclass: Pwstr, lpcchclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error

public expect fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error

public expect fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error

public expect fun regFlushKey(hkey: Hkey): Win32Error

public expect fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error

public expect fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error

public expect fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error

public expect fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error

public expect fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error

public expect fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcstr): Win32Error

public expect fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr, flags: UInt, pszdirectory: Pcwstr): Win32Error

public expect fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error

public expect fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr): Win32Error

public expect fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr): Win32Error

public expect fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error

public expect fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr): Win32Error

public expect fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error

public expect fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr, htransaction: Handle, pextendedparemeter: ConstPtr): Win32Error

public expect fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error

public expect fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr): Win32Error

public expect fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error

public expect fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr, lpreserved: ConstPtr, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcbmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr): Win32Error

public expect fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr): Win32Error

public expect fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr): Win32Error

public expect fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr): Win32Error

public expect fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error

public expect fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error

public expect fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr): Win32Error

public expect fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error

public expect fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error

public expect fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error

public expect fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error

public expect fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error

public expect fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr): Win32Error

public expect fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error

public expect fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr, flags: RegSaveFormat): Win32Error

public expect fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr): Win32Error

public expect fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error

public expect fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error

public expect fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error

public expect fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error

public expect fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error

public expect fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr, cbdata: UInt): Win32Error

public expect fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error

public expect fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error

public expect fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error
