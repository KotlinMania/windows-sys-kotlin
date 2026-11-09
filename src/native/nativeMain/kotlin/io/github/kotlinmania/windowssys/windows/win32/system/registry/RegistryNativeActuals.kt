@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun GetRegistryValueWithFallbackW(hkeyprimary: HKEY, pwszprimarysubkey: PCWSTR, hkeyfallback: HKEY, pwszfallbacksubkey: PCWSTR, pwszvalue: PCWSTR, dwflags: UInt, pdwtype: Long, pvdata: Long, cbdatain: UInt, pcbdataout: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_GetRegistryValueWithFallbackW(hkeyprimary.toCPointer<ByteVar>(), pwszprimarysubkey.toCPointer<ByteVar>(), hkeyfallback.toCPointer<ByteVar>(), pwszfallbacksubkey.toCPointer<ByteVar>(), pwszvalue.toCPointer<ByteVar>(), dwflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), cbdatain, pcbdataout.toCPointer<ByteVar>())

public actual fun RegCloseKey(hkey: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCloseKey(hkey.toCPointer<ByteVar>())

public actual fun RegConnectRegistryA(lpmachinename: PCSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegConnectRegistryA(lpmachinename.toCPointer<ByteVar>(), hkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegConnectRegistryExA(lpmachinename: PCSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegConnectRegistryExA(lpmachinename.toCPointer<ByteVar>(), hkey.toCPointer<ByteVar>(), flags, phkresult.toCPointer<ByteVar>())

public actual fun RegConnectRegistryExW(lpmachinename: PCWSTR, hkey: HKEY, flags: UInt, phkresult: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegConnectRegistryExW(lpmachinename.toCPointer<ByteVar>(), hkey.toCPointer<ByteVar>(), flags, phkresult.toCPointer<ByteVar>())

public actual fun RegConnectRegistryW(lpmachinename: PCWSTR, hkey: HKEY, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegConnectRegistryW(lpmachinename.toCPointer<ByteVar>(), hkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegCopyTreeA(hkeysrc: HKEY, lpsubkey: PCSTR, hkeydest: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCopyTreeA(hkeysrc.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), hkeydest.toCPointer<ByteVar>())

public actual fun RegCopyTreeW(hkeysrc: HKEY, lpsubkey: PCWSTR, hkeydest: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCopyTreeW(hkeysrc.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), hkeydest.toCPointer<ByteVar>())

public actual fun RegCreateKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegCreateKeyExA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyExA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), reserved, lpclass.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>())

public actual fun RegCreateKeyExW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyExW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), reserved, lpclass.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>())

public actual fun RegCreateKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, reserved: UInt, lpclass: PCSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyTransactedA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), reserved, lpclass.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pextendedparemeter.toCPointer<ByteVar>())

public actual fun RegCreateKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, reserved: UInt, lpclass: PCWSTR, dwoptions: REG_OPEN_CREATE_OPTIONS, samdesired: REG_SAM_FLAGS, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyTransactedW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), reserved, lpclass.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), lpdwdisposition.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pextendedparemeter.toCPointer<ByteVar>())

public actual fun RegCreateKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegCreateKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegDeleteKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun RegDeleteKeyExA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyExA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun RegDeleteKeyExW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyExW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun RegDeleteKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), samdesired, reserved, htransaction.toCPointer<ByteVar>(), pextendedparameter.toCPointer<ByteVar>())

public actual fun RegDeleteKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, samdesired: UInt, reserved: UInt, htransaction: HANDLE, pextendedparameter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyTransactedW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), samdesired, reserved, htransaction.toCPointer<ByteVar>(), pextendedparameter.toCPointer<ByteVar>())

public actual fun RegDeleteKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyValueA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>())

public actual fun RegDeleteKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyValueW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>())

public actual fun RegDeleteKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun RegDeleteTreeA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteTreeA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun RegDeleteTreeW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteTreeW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun RegDeleteValueA(hkey: HKEY, lpvaluename: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteValueA(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>())

public actual fun RegDeleteValueW(hkey: HKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDeleteValueW(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>())

public actual fun RegDisablePredefinedCache(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDisablePredefinedCache()

public actual fun RegDisablePredefinedCacheEx(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDisablePredefinedCacheEx()

public actual fun RegDisableReflectionKey(hbase: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegDisableReflectionKey(hbase.toCPointer<ByteVar>())

public actual fun RegEnableReflectionKey(hbase: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnableReflectionKey(hbase.toCPointer<ByteVar>())

public actual fun RegEnumKeyA(hkey: HKEY, dwindex: UInt, lpname: PSTR, cchname: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumKeyA(hkey.toCPointer<ByteVar>(), dwindex, lpname.toCPointer<ByteVar>(), cchname)

public actual fun RegEnumKeyExA(hkey: HKEY, dwindex: UInt, lpname: PSTR, lpcchname: Long, lpreserved: Long, lpclass: PSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumKeyExA(hkey.toCPointer<ByteVar>(), dwindex, lpname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcchclass.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun RegEnumKeyExW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, lpcchname: Long, lpreserved: Long, lpclass: PWSTR, lpcchclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumKeyExW(hkey.toCPointer<ByteVar>(), dwindex, lpname.toCPointer<ByteVar>(), lpcchname.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcchclass.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun RegEnumKeyW(hkey: HKEY, dwindex: UInt, lpname: PWSTR, cchname: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumKeyW(hkey.toCPointer<ByteVar>(), dwindex, lpname.toCPointer<ByteVar>(), cchname)

public actual fun RegEnumValueA(hkey: HKEY, dwindex: UInt, lpvaluename: PSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumValueA(hkey.toCPointer<ByteVar>(), dwindex, lpvaluename.toCPointer<ByteVar>(), lpcchvaluename.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegEnumValueW(hkey: HKEY, dwindex: UInt, lpvaluename: PWSTR, lpcchvaluename: Long, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegEnumValueW(hkey.toCPointer<ByteVar>(), dwindex, lpvaluename.toCPointer<ByteVar>(), lpcchvaluename.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegFlushKey(hkey: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegFlushKey(hkey.toCPointer<ByteVar>())

public actual fun RegGetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegGetKeySecurity(hkey.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun RegGetValueA(hkey: HKEY, lpsubkey: PCSTR, lpvalue: PCSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegGetValueA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>(), dwflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun RegGetValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, dwflags: REG_ROUTINE_FLAGS, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegGetValueW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>(), dwflags, pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun RegLoadAppKeyA(lpfile: PCSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadAppKeyA(lpfile.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun RegLoadAppKeyW(lpfile: PCWSTR, phkresult: Long, samdesired: UInt, dwoptions: UInt, reserved: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadAppKeyW(lpfile.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun RegLoadKeyA(hkey: HKEY, lpsubkey: PCSTR, lpfile: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>())

public actual fun RegLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpfile: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>())

public actual fun RegLoadMUIStringA(hkey: HKEY, pszvalue: PCSTR, pszoutbuf: PSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadMUIStringA(hkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pszoutbuf.toCPointer<ByteVar>(), cboutbuf, pcbdata.toCPointer<ByteVar>(), flags, pszdirectory.toCPointer<ByteVar>())

public actual fun RegLoadMUIStringW(hkey: HKEY, pszvalue: PCWSTR, pszoutbuf: PWSTR, cboutbuf: UInt, pcbdata: Long, flags: UInt, pszdirectory: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegLoadMUIStringW(hkey.toCPointer<ByteVar>(), pszvalue.toCPointer<ByteVar>(), pszoutbuf.toCPointer<ByteVar>(), cboutbuf, pcbdata.toCPointer<ByteVar>(), flags, pszdirectory.toCPointer<ByteVar>())

public actual fun RegNotifyChangeKeyValue(hkey: HKEY, bwatchsubtree: BOOL, dwnotifyfilter: REG_NOTIFY_FILTER, hevent: HANDLE, fasynchronous: BOOL): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegNotifyChangeKeyValue(hkey.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter, hevent.toCPointer<ByteVar>(), fasynchronous)

public actual fun RegOpenCurrentUser(samdesired: UInt, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenCurrentUser(samdesired, phkresult.toCPointer<ByteVar>())

public actual fun RegOpenKeyA(hkey: HKEY, lpsubkey: PCSTR, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegOpenKeyExA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyExA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.toCPointer<ByteVar>())

public actual fun RegOpenKeyExW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyExW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.toCPointer<ByteVar>())

public actual fun RegOpenKeyTransactedA(hkey: HKEY, lpsubkey: PCSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyTransactedA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pextendedparemeter.toCPointer<ByteVar>())

public actual fun RegOpenKeyTransactedW(hkey: HKEY, lpsubkey: PCWSTR, uloptions: UInt, samdesired: REG_SAM_FLAGS, phkresult: Long, htransaction: HANDLE, pextendedparemeter: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyTransactedW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pextendedparemeter.toCPointer<ByteVar>())

public actual fun RegOpenKeyW(hkey: HKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun RegOpenUserClassesRoot(htoken: HANDLE, dwoptions: UInt, samdesired: UInt, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOpenUserClassesRoot(htoken.toCPointer<ByteVar>(), dwoptions, samdesired, phkresult.toCPointer<ByteVar>())

public actual fun RegOverridePredefKey(hkey: HKEY, hnewhkey: HKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegOverridePredefKey(hkey.toCPointer<ByteVar>(), hnewhkey.toCPointer<ByteVar>())

public actual fun RegQueryInfoKeyA(hkey: HKEY, lpclass: PSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryInfoKeyA(hkey.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcchclass.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lpcsubkeys.toCPointer<ByteVar>(), lpcbmaxsubkeylen.toCPointer<ByteVar>(), lpcbmaxclasslen.toCPointer<ByteVar>(), lpcvalues.toCPointer<ByteVar>(), lpcbmaxvaluenamelen.toCPointer<ByteVar>(), lpcbmaxvaluelen.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun RegQueryInfoKeyW(hkey: HKEY, lpclass: PWSTR, lpcchclass: Long, lpreserved: Long, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcbmaxclasslen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryInfoKeyW(hkey.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcchclass.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lpcsubkeys.toCPointer<ByteVar>(), lpcbmaxsubkeylen.toCPointer<ByteVar>(), lpcbmaxclasslen.toCPointer<ByteVar>(), lpcvalues.toCPointer<ByteVar>(), lpcbmaxvaluenamelen.toCPointer<ByteVar>(), lpcbmaxvaluelen.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun RegQueryMultipleValuesA(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PSTR, ldwtotsize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryMultipleValuesA(hkey.toCPointer<ByteVar>(), val_list.toCPointer<ByteVar>(), num_vals, lpvaluebuf.toCPointer<ByteVar>(), ldwtotsize.toCPointer<ByteVar>())

public actual fun RegQueryMultipleValuesW(hkey: HKEY, val_list: Long, num_vals: UInt, lpvaluebuf: PWSTR, ldwtotsize: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryMultipleValuesW(hkey.toCPointer<ByteVar>(), val_list.toCPointer<ByteVar>(), num_vals, lpvaluebuf.toCPointer<ByteVar>(), ldwtotsize.toCPointer<ByteVar>())

public actual fun RegQueryReflectionKey(hbase: HKEY, bisreflectiondisabled: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryReflectionKey(hbase.toCPointer<ByteVar>(), bisreflectiondisabled.toCPointer<ByteVar>())

public actual fun RegQueryValueA(hkey: HKEY, lpsubkey: PCSTR, lpdata: PSTR, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryValueA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegQueryValueExA(hkey: HKEY, lpvaluename: PCSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryValueExA(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegQueryValueExW(hkey: HKEY, lpvaluename: PCWSTR, lpreserved: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryValueExW(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegQueryValueW(hkey: HKEY, lpsubkey: PCWSTR, lpdata: PWSTR, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegQueryValueW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun RegRenameKey(hkey: HKEY, lpsubkeyname: PCWSTR, lpnewkeyname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegRenameKey(hkey.toCPointer<ByteVar>(), lpsubkeyname.toCPointer<ByteVar>(), lpnewkeyname.toCPointer<ByteVar>())

public actual fun RegReplaceKeyA(hkey: HKEY, lpsubkey: PCSTR, lpnewfile: PCSTR, lpoldfile: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegReplaceKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpnewfile.toCPointer<ByteVar>(), lpoldfile.toCPointer<ByteVar>())

public actual fun RegReplaceKeyW(hkey: HKEY, lpsubkey: PCWSTR, lpnewfile: PCWSTR, lpoldfile: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegReplaceKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpnewfile.toCPointer<ByteVar>(), lpoldfile.toCPointer<ByteVar>())

public actual fun RegRestoreKeyA(hkey: HKEY, lpfile: PCSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegRestoreKeyA(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), dwflags)

public actual fun RegRestoreKeyW(hkey: HKEY, lpfile: PCWSTR, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegRestoreKeyW(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), dwflags)

public actual fun RegSaveKeyA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSaveKeyA(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun RegSaveKeyExA(hkey: HKEY, lpfile: PCSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSaveKeyExA(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), flags)

public actual fun RegSaveKeyExW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long, flags: REG_SAVE_FORMAT): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSaveKeyExW(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), flags)

public actual fun RegSaveKeyW(hkey: HKEY, lpfile: PCWSTR, lpsecurityattributes: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSaveKeyW(hkey.toCPointer<ByteVar>(), lpfile.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun RegSetKeySecurity(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetKeySecurity(hkey.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun RegSetKeyValueA(hkey: HKEY, lpsubkey: PCSTR, lpvaluename: PCSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetKeyValueA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegSetKeyValueW(hkey: HKEY, lpsubkey: PCWSTR, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetKeyValueW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegSetValueA(hkey: HKEY, lpsubkey: PCSTR, dwtype: REG_VALUE_TYPE, lpdata: PCSTR, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetValueA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegSetValueExA(hkey: HKEY, lpvaluename: PCSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetValueExA(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), reserved, dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegSetValueExW(hkey: HKEY, lpvaluename: PCWSTR, reserved: UInt, dwtype: REG_VALUE_TYPE, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetValueExW(hkey.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), reserved, dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegSetValueW(hkey: HKEY, lpsubkey: PCWSTR, dwtype: REG_VALUE_TYPE, lpdata: PCWSTR, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegSetValueW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun RegUnLoadKeyA(hkey: HKEY, lpsubkey: PCSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegUnLoadKeyA(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun RegUnLoadKeyW(hkey: HKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssys_windows_win32_system_registry_RegUnLoadKeyW(hkey.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())
