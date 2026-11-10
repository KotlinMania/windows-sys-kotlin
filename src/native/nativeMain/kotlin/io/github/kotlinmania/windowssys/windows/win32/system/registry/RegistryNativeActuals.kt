@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, cbdatain: UInt, pcbdataout: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_getRegistryValueWithFallbackW(hkeyprimary?.value?.toCPointer<ByteVar>(), pwszprimarysubkey?.value?.toCPointer<ByteVar>(), hkeyfallback?.value?.toCPointer<ByteVar>(), pwszfallbacksubkey?.value?.toCPointer<ByteVar>(), pwszvalue?.value?.toCPointer<ByteVar>(), dwflags, pdwtype?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), cbdatain, pcbdataout?.value?.toCPointer<ByteVar>())

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCloseKey(hkey?.value?.toCPointer<ByteVar>())

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regConnectRegistryA(lpmachinename?.value?.toCPointer<ByteVar>(), hkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regConnectRegistryExA(lpmachinename?.value?.toCPointer<ByteVar>(), hkey?.value?.toCPointer<ByteVar>(), flags, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regConnectRegistryExW(lpmachinename?.value?.toCPointer<ByteVar>(), hkey?.value?.toCPointer<ByteVar>(), flags, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regConnectRegistryW(lpmachinename?.value?.toCPointer<ByteVar>(), hkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCopyTreeA(hkeysrc?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), hkeydest?.value?.toCPointer<ByteVar>())

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCopyTreeW(hkeysrc?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), hkeydest?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyExA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyExW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyTransactedA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pextendedparemeter?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyTransactedW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), reserved, lpclass?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), lpdwdisposition?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pextendedparemeter?.value?.toCPointer<ByteVar>())

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regCreateKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyExA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyExW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyTransactedA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), samdesired, reserved, htransaction?.value?.toCPointer<ByteVar>(), pextendedparameter?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyTransactedW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), samdesired, reserved, htransaction?.value?.toCPointer<ByteVar>(), pextendedparameter?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyValueA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyValueW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>())

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteTreeA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteTreeW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteValueA(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>())

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDeleteValueW(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>())

public actual fun regDisablePredefinedCache(): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDisablePredefinedCache()

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDisablePredefinedCacheEx()

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regDisableReflectionKey(hbase?.value?.toCPointer<ByteVar>())

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnableReflectionKey(hbase?.value?.toCPointer<ByteVar>())

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumKeyA(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpname?.value?.toCPointer<ByteVar>(), cchname)

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumKeyExA(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcchclass?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: COpaquePointer?, lpreserved: COpaquePointer?, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumKeyExW(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpname?.value?.toCPointer<ByteVar>(), lpcchname?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcchclass?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumKeyW(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpname?.value?.toCPointer<ByteVar>(), cchname)

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumValueA(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpvaluename?.value?.toCPointer<ByteVar>(), lpcchvaluename?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regEnumValueW(hkey?.value?.toCPointer<ByteVar>(), dwindex, lpvaluename?.value?.toCPointer<ByteVar>(), lpcchvaluename?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regFlushKey(hkey?.value?.toCPointer<ByteVar>())

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regGetKeySecurity(hkey?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regGetValueA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvalue?.value?.toCPointer<ByteVar>(), dwflags, pdwtype?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), pcbdata?.value?.toCPointer<ByteVar>())

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regGetValueW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvalue?.value?.toCPointer<ByteVar>(), dwflags, pdwtype?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), pcbdata?.value?.toCPointer<ByteVar>())

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadAppKeyA(lpfile?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: COpaquePointer?, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadAppKeyW(lpfile?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>())

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>())

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadMUIStringA(hkey?.value?.toCPointer<ByteVar>(), pszvalue?.value?.toCPointer<ByteVar>(), pszoutbuf?.value?.toCPointer<ByteVar>(), cboutbuf, pcbdata?.value?.toCPointer<ByteVar>(), flags, pszdirectory?.value?.toCPointer<ByteVar>())

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: COpaquePointer?, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regLoadMUIStringW(hkey?.value?.toCPointer<ByteVar>(), pszvalue?.value?.toCPointer<ByteVar>(), pszoutbuf?.value?.toCPointer<ByteVar>(), cboutbuf, pcbdata?.value?.toCPointer<ByteVar>(), flags, pszdirectory?.value?.toCPointer<ByteVar>())

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regNotifyChangeKeyValue(hkey?.value?.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter, hevent?.value?.toCPointer<ByteVar>(), fasynchronous)

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenCurrentUser(samdesired, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyExA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), uloptions, samdesired, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyExW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), uloptions, samdesired, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyTransactedA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), uloptions, samdesired, phkresult?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pextendedparemeter?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: COpaquePointer?, htransaction: Handle, pextendedparemeter: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyTransactedW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), uloptions, samdesired, phkresult?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pextendedparemeter?.value?.toCPointer<ByteVar>())

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOpenUserClassesRoot(htoken?.value?.toCPointer<ByteVar>(), dwoptions, samdesired, phkresult?.value?.toCPointer<ByteVar>())

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regOverridePredefKey(hkey?.value?.toCPointer<ByteVar>(), hnewhkey?.value?.toCPointer<ByteVar>())

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryInfoKeyA(hkey?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcchclass?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lpcsubkeys?.value?.toCPointer<ByteVar>(), lpcbmaxsubkeylen?.value?.toCPointer<ByteVar>(), lpcbmaxclasslen?.value?.toCPointer<ByteVar>(), lpcvalues?.value?.toCPointer<ByteVar>(), lpcbmaxvaluenamelen?.value?.toCPointer<ByteVar>(), lpcbmaxvaluelen?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: COpaquePointer?, lpreserved: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcbmaxsubkeylen: COpaquePointer?, lpcbmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcbmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryInfoKeyW(hkey?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcchclass?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lpcsubkeys?.value?.toCPointer<ByteVar>(), lpcbmaxsubkeylen?.value?.toCPointer<ByteVar>(), lpcbmaxclasslen?.value?.toCPointer<ByteVar>(), lpcvalues?.value?.toCPointer<ByteVar>(), lpcbmaxvaluenamelen?.value?.toCPointer<ByteVar>(), lpcbmaxvaluelen?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryMultipleValuesA(hkey?.value?.toCPointer<ByteVar>(), valList?.value?.toCPointer<ByteVar>(), numVals, lpvaluebuf?.value?.toCPointer<ByteVar>(), ldwtotsize?.value?.toCPointer<ByteVar>())

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: COpaquePointer?, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryMultipleValuesW(hkey?.value?.toCPointer<ByteVar>(), valList?.value?.toCPointer<ByteVar>(), numVals, lpvaluebuf?.value?.toCPointer<ByteVar>(), ldwtotsize?.value?.toCPointer<ByteVar>())

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryReflectionKey(hbase?.value?.toCPointer<ByteVar>(), bisreflectiondisabled?.value?.toCPointer<ByteVar>())

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryValueA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryValueExA(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryValueExW(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regQueryValueW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regRenameKey(hkey?.value?.toCPointer<ByteVar>(), lpsubkeyname?.value?.toCPointer<ByteVar>(), lpnewkeyname?.value?.toCPointer<ByteVar>())

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regReplaceKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpnewfile?.value?.toCPointer<ByteVar>(), lpoldfile?.value?.toCPointer<ByteVar>())

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regReplaceKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpnewfile?.value?.toCPointer<ByteVar>(), lpoldfile?.value?.toCPointer<ByteVar>())

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regRestoreKeyA(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regRestoreKeyW(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSaveKeyA(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSaveKeyExA(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), flags)

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?, flags: RegSaveFormat): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSaveKeyExW(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), flags)

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSaveKeyW(hkey?.value?.toCPointer<ByteVar>(), lpfile?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetKeySecurity(hkey?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetKeyValueA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetKeyValueW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetValueA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetValueExA(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), reserved, dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetValueExW(hkey?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), reserved, dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regSetValueW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regUnLoadKeyA(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_regUnLoadKeyW(hkey?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())
