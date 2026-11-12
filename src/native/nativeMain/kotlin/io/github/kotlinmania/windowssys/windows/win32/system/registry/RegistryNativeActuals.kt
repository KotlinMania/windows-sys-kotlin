@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCloseKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegConnectRegistryA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegConnectRegistryExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegConnectRegistryExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegConnectRegistryW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCopyTreeA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCopyTreeW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegCreateKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteTreeA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteTreeW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDeleteValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegDisableReflectionKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnableReflectionKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumKeyExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumKeyExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegEnumValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegFlushKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegGetKeySecurity
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegGetValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegGetValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadAppKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadAppKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadMUIStringA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegLoadMUIStringW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenCurrentUser
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegOverridePredefKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryReflectionKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryValueExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryValueExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegQueryValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegRenameKey
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegReplaceKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegReplaceKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegRestoreKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegRestoreKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSaveKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSaveKeyExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSaveKeyExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSaveKeyW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetKeySecurity
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetKeyValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetKeyValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetValueA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetValueExA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetValueExW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegSetValueW
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegUnLoadKeyA
import io.github.kotlinmania.windowssys.windows.win32.system.registry.cinterop.windowssysWindowsWin32SystemRegistryRegUnLoadKeyW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun getRegistryValueWithFallbackW(hkeyprimary: Hkey, pwszprimarysubkey: Pcwstr, hkeyfallback: Hkey, pwszfallbacksubkey: Pcwstr, pwszvalue: Pcwstr, dwflags: UInt, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, cbdatain: UInt, pcbdataout: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryGetRegistryValueWithFallbackW(hkeyprimary.rawAddress.toCPointer<ByteVar>(), pwszprimarysubkey.rawAddress.toCPointer<ByteVar>(), hkeyfallback.rawAddress.toCPointer<ByteVar>(), pwszfallbacksubkey.rawAddress.toCPointer<ByteVar>(), pwszvalue.rawAddress.toCPointer<ByteVar>(), dwflags, pdwtype.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), cbdatain, pcbdataout.rawAddress.toCPointer<ByteVar>())

public actual fun regCloseKey(hkey: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCloseKey(hkey.rawAddress.toCPointer<ByteVar>())

public actual fun regConnectRegistryA(lpmachinename: Pcstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegConnectRegistryA(lpmachinename.rawAddress.toCPointer<ByteVar>(), hkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regConnectRegistryExA(lpmachinename: Pcstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int =
    windowssysWindowsWin32SystemRegistryRegConnectRegistryExA(lpmachinename.rawAddress.toCPointer<ByteVar>(), hkey.rawAddress.toCPointer<ByteVar>(), flags, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regConnectRegistryExW(lpmachinename: Pcwstr, hkey: Hkey, flags: UInt, phkresult: MutPtr<Hkey>): Int =
    windowssysWindowsWin32SystemRegistryRegConnectRegistryExW(lpmachinename.rawAddress.toCPointer<ByteVar>(), hkey.rawAddress.toCPointer<ByteVar>(), flags, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regConnectRegistryW(lpmachinename: Pcwstr, hkey: Hkey, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegConnectRegistryW(lpmachinename.rawAddress.toCPointer<ByteVar>(), hkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regCopyTreeA(hkeysrc: Hkey, lpsubkey: Pcstr, hkeydest: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCopyTreeA(hkeysrc.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), hkeydest.rawAddress.toCPointer<ByteVar>())

public actual fun regCopyTreeW(hkeysrc: Hkey, lpsubkey: Pcwstr, hkeydest: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCopyTreeW(hkeysrc.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), hkeydest.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyExA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyExA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), reserved, lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), lpdwdisposition.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyExW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyExW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), reserved, lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), lpdwdisposition.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, reserved: UInt, lpclass: Pcstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), reserved, lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), lpdwdisposition.rawAddress.toCPointer<ByteVar>(), htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparemeter.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, reserved: UInt, lpclass: Pcwstr, dwoptions: RegOpenCreateOptions, samdesired: RegSamFlags, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<RegCreateKeyDisposition>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyTransactedW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), reserved, lpclass.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), lpdwdisposition.rawAddress.toCPointer<ByteVar>(), htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparemeter.rawAddress.toCPointer<ByteVar>())

public actual fun regCreateKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegCreateKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyExA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyExA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun regDeleteKeyExW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyExW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), samdesired, reserved)

public actual fun regDeleteKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), samdesired, reserved, htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparameter.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, samdesired: UInt, reserved: UInt, htransaction: Handle, pextendedparameter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyTransactedW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), samdesired, reserved, htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparameter.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteTreeA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteTreeA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteTreeW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteTreeW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteValueA(hkey: Hkey, lpvaluename: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>())

public actual fun regDeleteValueW(hkey: Hkey, lpvaluename: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDeleteValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>())

public actual fun regDisablePredefinedCache(): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDisablePredefinedCache()

public actual fun regDisablePredefinedCacheEx(): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDisablePredefinedCacheEx()

public actual fun regDisableReflectionKey(hbase: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegDisableReflectionKey(hbase.rawAddress.toCPointer<ByteVar>())

public actual fun regEnableReflectionKey(hbase: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnableReflectionKey(hbase.rawAddress.toCPointer<ByteVar>())

public actual fun regEnumKeyA(hkey: Hkey, dwindex: UInt, lpname: Pstr, cchname: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumKeyA(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpname.rawAddress.toCPointer<ByteVar>(), cchname)

public actual fun regEnumKeyExA(hkey: Hkey, dwindex: UInt, lpname: Pstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumKeyExA(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpname.rawAddress.toCPointer<ByteVar>(), lpcchname.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcchclass.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun regEnumKeyExW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, lpcchname: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumKeyExW(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpname.rawAddress.toCPointer<ByteVar>(), lpcchname.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcchclass.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun regEnumKeyW(hkey: Hkey, dwindex: UInt, lpname: Pwstr, cchname: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumKeyW(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpname.rawAddress.toCPointer<ByteVar>(), cchname)

public actual fun regEnumValueA(hkey: Hkey, dwindex: UInt, lpvaluename: Pstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumValueA(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpvaluename.rawAddress.toCPointer<ByteVar>(), lpcchvaluename.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regEnumValueW(hkey: Hkey, dwindex: UInt, lpvaluename: Pwstr, lpcchvaluename: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lptype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegEnumValueW(hkey.rawAddress.toCPointer<ByteVar>(), dwindex, lpvaluename.rawAddress.toCPointer<ByteVar>(), lpcchvaluename.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regFlushKey(hkey: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegFlushKey(hkey.rawAddress.toCPointer<ByteVar>())

public actual fun regGetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegGetKeySecurity(hkey.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun regGetValueA(hkey: Hkey, lpsubkey: Pcstr, lpvalue: Pcstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegGetValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvalue.rawAddress.toCPointer<ByteVar>(), dwflags, pdwtype.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), pcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regGetValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, dwflags: RegRoutineFlags, pdwtype: MutPtr<RegValueType>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegGetValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvalue.rawAddress.toCPointer<ByteVar>(), dwflags, pdwtype.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), pcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regLoadAppKeyA(lpfile: Pcstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadAppKeyA(lpfile.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun regLoadAppKeyW(lpfile: Pcwstr, phkresult: MutPtr<Hkey>, samdesired: UInt, dwoptions: UInt, reserved: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadAppKeyW(lpfile.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>(), samdesired, dwoptions, reserved)

public actual fun regLoadKeyA(hkey: Hkey, lpsubkey: Pcstr, lpfile: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>())

public actual fun regLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpfile: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>())

public actual fun regLoadMUIStringA(hkey: Hkey, pszvalue: Pcstr, pszoutbuf: Pstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadMUIStringA(hkey.rawAddress.toCPointer<ByteVar>(), pszvalue.rawAddress.toCPointer<ByteVar>(), pszoutbuf.rawAddress.toCPointer<ByteVar>(), cboutbuf, pcbdata.rawAddress.toCPointer<ByteVar>(), flags, pszdirectory.rawAddress.toCPointer<ByteVar>())

public actual fun regLoadMUIStringW(hkey: Hkey, pszvalue: Pcwstr, pszoutbuf: Pwstr, cboutbuf: UInt, pcbdata: MutPtr<UInt>, flags: UInt, pszdirectory: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegLoadMUIStringW(hkey.rawAddress.toCPointer<ByteVar>(), pszvalue.rawAddress.toCPointer<ByteVar>(), pszoutbuf.rawAddress.toCPointer<ByteVar>(), cboutbuf, pcbdata.rawAddress.toCPointer<ByteVar>(), flags, pszdirectory.rawAddress.toCPointer<ByteVar>())

public actual fun regNotifyChangeKeyValue(hkey: Hkey, bwatchsubtree: Bool, dwnotifyfilter: RegNotifyFilter, hevent: Handle, fasynchronous: Bool): Win32Error =
    windowssysWindowsWin32SystemRegistryRegNotifyChangeKeyValue(hkey.rawAddress.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter, hevent.rawAddress.toCPointer<ByteVar>(), fasynchronous)

public actual fun regOpenCurrentUser(samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenCurrentUser(samdesired, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyA(hkey: Hkey, lpsubkey: Pcstr, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyExA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyExA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyExW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyExW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyTransactedA(hkey: Hkey, lpsubkey: Pcstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.rawAddress.toCPointer<ByteVar>(), htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparemeter.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyTransactedW(hkey: Hkey, lpsubkey: Pcwstr, uloptions: UInt, samdesired: RegSamFlags, phkresult: MutPtr<Hkey>, htransaction: Handle, pextendedparemeter: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyTransactedW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), uloptions, samdesired, phkresult.rawAddress.toCPointer<ByteVar>(), htransaction.rawAddress.toCPointer<ByteVar>(), pextendedparemeter.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenKeyW(hkey: Hkey, lpsubkey: Pcwstr, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOpenUserClassesRoot(htoken: Handle, dwoptions: UInt, samdesired: UInt, phkresult: MutPtr<Hkey>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOpenUserClassesRoot(htoken.rawAddress.toCPointer<ByteVar>(), dwoptions, samdesired, phkresult.rawAddress.toCPointer<ByteVar>())

public actual fun regOverridePredefKey(hkey: Hkey, hnewhkey: Hkey): Win32Error =
    windowssysWindowsWin32SystemRegistryRegOverridePredefKey(hkey.rawAddress.toCPointer<ByteVar>(), hnewhkey.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryInfoKeyA(hkey: Hkey, lpclass: Pstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryInfoKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcchclass.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lpcsubkeys.rawAddress.toCPointer<ByteVar>(), lpcbmaxsubkeylen.rawAddress.toCPointer<ByteVar>(), lpcbmaxclasslen.rawAddress.toCPointer<ByteVar>(), lpcvalues.rawAddress.toCPointer<ByteVar>(), lpcbmaxvaluenamelen.rawAddress.toCPointer<ByteVar>(), lpcbmaxvaluelen.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryInfoKeyW(hkey: Hkey, lpclass: Pwstr, lpcchclass: MutPtr<UInt>, lpreserved: ConstPtr<UInt>, lpcsubkeys: MutPtr<UInt>, lpcbmaxsubkeylen: MutPtr<UInt>, lpcbmaxclasslen: MutPtr<UInt>, lpcvalues: MutPtr<UInt>, lpcbmaxvaluenamelen: MutPtr<UInt>, lpcbmaxvaluelen: MutPtr<UInt>, lpcbsecuritydescriptor: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryInfoKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpclass.rawAddress.toCPointer<ByteVar>(), lpcchclass.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lpcsubkeys.rawAddress.toCPointer<ByteVar>(), lpcbmaxsubkeylen.rawAddress.toCPointer<ByteVar>(), lpcbmaxclasslen.rawAddress.toCPointer<ByteVar>(), lpcvalues.rawAddress.toCPointer<ByteVar>(), lpcbmaxvaluenamelen.rawAddress.toCPointer<ByteVar>(), lpcbmaxvaluelen.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpftlastwritetime.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryMultipleValuesA(hkey: Hkey, valList: MutPtr<Valenta>, numVals: UInt, lpvaluebuf: Pstr, ldwtotsize: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesA(hkey.rawAddress.toCPointer<ByteVar>(), valList.rawAddress.toCPointer<ByteVar>(), numVals, lpvaluebuf.rawAddress.toCPointer<ByteVar>(), ldwtotsize.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryMultipleValuesW(hkey: Hkey, valList: MutPtr<Valentw>, numVals: UInt, lpvaluebuf: Pwstr, ldwtotsize: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryMultipleValuesW(hkey.rawAddress.toCPointer<ByteVar>(), valList.rawAddress.toCPointer<ByteVar>(), numVals, lpvaluebuf.rawAddress.toCPointer<ByteVar>(), ldwtotsize.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryReflectionKey(hbase: Hkey, bisreflectiondisabled: MutPtr<Bool>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryReflectionKey(hbase.rawAddress.toCPointer<ByteVar>(), bisreflectiondisabled.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryValueA(hkey: Hkey, lpsubkey: Pcstr, lpdata: Pstr, lpcbdata: MutPtr<Int>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryValueExA(hkey: Hkey, lpvaluename: Pcstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryValueExA(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryValueExW(hkey: Hkey, lpvaluename: Pcwstr, lpreserved: ConstPtr<UInt>, lptype: MutPtr<RegValueType>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryValueExW(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>(), lptype.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regQueryValueW(hkey: Hkey, lpsubkey: Pcwstr, lpdata: Pwstr, lpcbdata: MutPtr<Int>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegQueryValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpdata.rawAddress.toCPointer<ByteVar>(), lpcbdata.rawAddress.toCPointer<ByteVar>())

public actual fun regRenameKey(hkey: Hkey, lpsubkeyname: Pcwstr, lpnewkeyname: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegRenameKey(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkeyname.rawAddress.toCPointer<ByteVar>(), lpnewkeyname.rawAddress.toCPointer<ByteVar>())

public actual fun regReplaceKeyA(hkey: Hkey, lpsubkey: Pcstr, lpnewfile: Pcstr, lpoldfile: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegReplaceKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpnewfile.rawAddress.toCPointer<ByteVar>(), lpoldfile.rawAddress.toCPointer<ByteVar>())

public actual fun regReplaceKeyW(hkey: Hkey, lpsubkey: Pcwstr, lpnewfile: Pcwstr, lpoldfile: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegReplaceKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpnewfile.rawAddress.toCPointer<ByteVar>(), lpoldfile.rawAddress.toCPointer<ByteVar>())

public actual fun regRestoreKeyA(hkey: Hkey, lpfile: Pcstr, dwflags: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegRestoreKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun regRestoreKeyW(hkey: Hkey, lpfile: Pcwstr, dwflags: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegRestoreKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun regSaveKeyA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSaveKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), lpsecurityattributes.rawAddress.toCPointer<ByteVar>())

public actual fun regSaveKeyExA(hkey: Hkey, lpfile: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSaveKeyExA(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun regSaveKeyExW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, flags: RegSaveFormat): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSaveKeyExW(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun regSaveKeyW(hkey: Hkey, lpfile: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSaveKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpfile.rawAddress.toCPointer<ByteVar>(), lpsecurityattributes.rawAddress.toCPointer<ByteVar>())

public actual fun regSetKeySecurity(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetKeySecurity(hkey.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun regSetKeyValueA(hkey: Hkey, lpsubkey: Pcstr, lpvaluename: Pcstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetKeyValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regSetKeyValueW(hkey: Hkey, lpsubkey: Pcwstr, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetKeyValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueA(hkey: Hkey, lpsubkey: Pcstr, dwtype: RegValueType, lpdata: Pcstr, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetValueA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueExA(hkey: Hkey, lpvaluename: Pcstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetValueExA(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), reserved, dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueExW(hkey: Hkey, lpvaluename: Pcwstr, reserved: UInt, dwtype: RegValueType, lpdata: ConstPtr<UByte>, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetValueExW(hkey.rawAddress.toCPointer<ByteVar>(), lpvaluename.rawAddress.toCPointer<ByteVar>(), reserved, dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regSetValueW(hkey: Hkey, lpsubkey: Pcwstr, dwtype: RegValueType, lpdata: Pcwstr, cbdata: UInt): Win32Error =
    windowssysWindowsWin32SystemRegistryRegSetValueW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>(), dwtype, lpdata.rawAddress.toCPointer<ByteVar>(), cbdata)

public actual fun regUnLoadKeyA(hkey: Hkey, lpsubkey: Pcstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegUnLoadKeyA(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())

public actual fun regUnLoadKeyW(hkey: Hkey, lpsubkey: Pcwstr): Win32Error =
    windowssysWindowsWin32SystemRegistryRegUnLoadKeyW(hkey.rawAddress.toCPointer<ByteVar>(), lpsubkey.rawAddress.toCPointer<ByteVar>())
