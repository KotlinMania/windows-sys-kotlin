package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes

public expect fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, cbdatain: UInt, pcbdataout: MutPtr<UInt>): Win32Error

public expect fun regCloseKey(hkey: Hkey): Win32Error

public expect fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int

public expect fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int

public expect fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error

public expect fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error

public expect fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error

public expect fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error

public expect fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error

public expect fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error

public expect fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error

public expect fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error

public expect fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error

public expect fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error

public expect fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error

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

public expect fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error

public expect fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error

public expect fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error

public expect fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error

public expect fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error

public expect fun regFlushKey(hkey: Hkey): Win32Error

public expect fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Win32Error

public expect fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error

public expect fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error

public expect fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error

public expect fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error

public expect fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error

public expect fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcstr): Win32Error

public expect fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcwstr): Win32Error

public expect fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error

public expect fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error

public expect fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error

public expect fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error

public expect fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error

public expect fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error

public expect fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error

public expect fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr<Valenta>, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr<UInt>): Win32Error

public expect fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr<Valentw>, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr<UInt>): Win32Error

public expect fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr<Bool>): Win32Error

public expect fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr<Int>): Win32Error

public expect fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error

public expect fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error

public expect fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr<Int>): Win32Error

public expect fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error

public expect fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error

public expect fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error

public expect fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error

public expect fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error

public expect fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error

public expect fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error

public expect fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error

public expect fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error

public expect fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error

public expect fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error

public expect fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error

public expect fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error

public expect fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error

public expect fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error

public expect fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error

public expect fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error

public expect fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error
