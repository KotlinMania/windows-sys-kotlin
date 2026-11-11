@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRCloseHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRCloseKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRCreateHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRCreateKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRDeleteKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRDeleteValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oREnumKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oREnumValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRGetValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRGetVersion
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRMergeHives
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oROpenHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oROpenKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRRenameKey
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRSaveHive
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRSetValue
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRShutdown
import io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_oRStart
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRCloseHive(handle?.value?.toCPointer<ByteVar>())

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRCloseKey(keyhandle?.value?.toCPointer<ByteVar>())

public actual fun oRCreateHive(horkey: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRCreateHive(horkey?.value?.toCPointer<ByteVar>())

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: COpaquePointer?, pdwdisposition: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRCreateKey(keyhandle?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), dwoptions, psecuritydescriptor?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>(), pdwdisposition?.value?.toCPointer<ByteVar>())

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRDeleteKey(handle?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>())

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRDeleteValue(handle?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>())

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: COpaquePointer?, lpclass: Pwstr, lpcclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oREnumKey(handle?.value?.toCPointer<ByteVar>(), dwindex, lpname?.value?.toCPointer<ByteVar>(), lpcname?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcclass?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oREnumValue(handle?.value?.toCPointer<ByteVar>(), dwindex, lpvaluename?.value?.toCPointer<ByteVar>(), lpcvaluename?.value?.toCPointer<ByteVar>(), lptype?.value?.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), lpcbdata?.value?.toCPointer<ByteVar>())

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRGetKeySecurity(handle?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRGetValue(handle?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), lpvalue?.value?.toCPointer<ByteVar>(), pdwtype?.value?.toCPointer<ByteVar>(), pvdata?.value?.toCPointer<ByteVar>(), pcbdata?.value?.toCPointer<ByteVar>())

public actual fun oRGetVersion(pdwmajorversion: COpaquePointer?, pdwminorversion: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRGetVersion(pdwmajorversion?.value?.toCPointer<ByteVar>(), pdwminorversion?.value?.toCPointer<ByteVar>())

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRGetVirtualFlags(handle?.value?.toCPointer<ByteVar>(), pdwflags?.value?.toCPointer<ByteVar>())

public actual fun oRMergeHives(hivehandles: COpaquePointer?, hivecount: UInt, phkresult: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRMergeHives(hivehandles?.value?.toCPointer<ByteVar>(), hivecount, phkresult?.value?.toCPointer<ByteVar>())

public actual fun oROpenHive(filepath: Pcwstr, horkey: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oROpenHive(filepath?.value?.toCPointer<ByteVar>(), horkey?.value?.toCPointer<ByteVar>())

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oROpenHiveByHandle(filehandle?.value?.toCPointer<ByteVar>(), horkey?.value?.toCPointer<ByteVar>())

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oROpenKey(handle?.value?.toCPointer<ByteVar>(), lpsubkey?.value?.toCPointer<ByteVar>(), phkresult?.value?.toCPointer<ByteVar>())

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcmaxsubkeylen: COpaquePointer?, lpcmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcmaxvaluenamelen: COpaquePointer?, lpcmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRQueryInfoKey(handle?.value?.toCPointer<ByteVar>(), lpclass?.value?.toCPointer<ByteVar>(), lpcclass?.value?.toCPointer<ByteVar>(), lpcsubkeys?.value?.toCPointer<ByteVar>(), lpcmaxsubkeylen?.value?.toCPointer<ByteVar>(), lpcmaxclasslen?.value?.toCPointer<ByteVar>(), lpcvalues?.value?.toCPointer<ByteVar>(), lpcmaxvaluenamelen?.value?.toCPointer<ByteVar>(), lpcmaxvaluelen?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpftlastwritetime?.value?.toCPointer<ByteVar>())

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRRenameKey(handle?.value?.toCPointer<ByteVar>(), lpnewname?.value?.toCPointer<ByteVar>())

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRSaveHive(horkey?.value?.toCPointer<ByteVar>(), hivepath?.value?.toCPointer<ByteVar>(), osmajorversion, osminorversion)

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRSetKeySecurity(handle?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRSetValue(handle?.value?.toCPointer<ByteVar>(), lpvaluename?.value?.toCPointer<ByteVar>(), dwtype, lpdata?.value?.toCPointer<ByteVar>(), cbdata)

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRSetVirtualFlags(handle?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun oRShutdown(): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRShutdown()

public actual fun oRStart(): Win32Error =
    windowssys_windows_wdk_system_offlineregistry_oRStart()
