@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ORCloseHive(handle: ORHKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORCloseHive(handle.toCPointer<ByteVar>())

public actual fun ORCloseKey(keyhandle: ORHKEY): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORCloseKey(keyhandle.toCPointer<ByteVar>())

public actual fun ORCreateHive(horkey: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORCreateHive(horkey.toCPointer<ByteVar>())

public actual fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORCreateKey(keyhandle.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), dwoptions, psecuritydescriptor.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>(), pdwdisposition.toCPointer<ByteVar>())

public actual fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORDeleteKey(handle.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>())

public actual fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORDeleteValue(handle.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>())

public actual fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_OREnumKey(handle.toCPointer<ByteVar>(), dwindex, lpname.toCPointer<ByteVar>(), lpcname.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcclass.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_OREnumValue(handle.toCPointer<ByteVar>(), dwindex, lpvaluename.toCPointer<ByteVar>(), lpcvaluename.toCPointer<ByteVar>(), lptype.toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), lpcbdata.toCPointer<ByteVar>())

public actual fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORGetKeySecurity(handle.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORGetValue(handle.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), lpvalue.toCPointer<ByteVar>(), pdwtype.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), pcbdata.toCPointer<ByteVar>())

public actual fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORGetVersion(pdwmajorversion.toCPointer<ByteVar>(), pdwminorversion.toCPointer<ByteVar>())

public actual fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORGetVirtualFlags(handle.toCPointer<ByteVar>(), pdwflags.toCPointer<ByteVar>())

public actual fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORMergeHives(hivehandles.toCPointer<ByteVar>(), hivecount, phkresult.toCPointer<ByteVar>())

public actual fun OROpenHive(filepath: PCWSTR, horkey: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_OROpenHive(filepath.toCPointer<ByteVar>(), horkey.toCPointer<ByteVar>())

public actual fun OROpenHiveByHandle(filehandle: HANDLE, horkey: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_OROpenHiveByHandle(filehandle.toCPointer<ByteVar>(), horkey.toCPointer<ByteVar>())

public actual fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_OROpenKey(handle.toCPointer<ByteVar>(), lpsubkey.toCPointer<ByteVar>(), phkresult.toCPointer<ByteVar>())

public actual fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORQueryInfoKey(handle.toCPointer<ByteVar>(), lpclass.toCPointer<ByteVar>(), lpcclass.toCPointer<ByteVar>(), lpcsubkeys.toCPointer<ByteVar>(), lpcmaxsubkeylen.toCPointer<ByteVar>(), lpcmaxclasslen.toCPointer<ByteVar>(), lpcvalues.toCPointer<ByteVar>(), lpcmaxvaluenamelen.toCPointer<ByteVar>(), lpcmaxvaluelen.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>(), lpftlastwritetime.toCPointer<ByteVar>())

public actual fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORRenameKey(handle.toCPointer<ByteVar>(), lpnewname.toCPointer<ByteVar>())

public actual fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORSaveHive(horkey.toCPointer<ByteVar>(), hivepath.toCPointer<ByteVar>(), osmajorversion, osminorversion)

public actual fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORSetKeySecurity(handle.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORSetValue(handle.toCPointer<ByteVar>(), lpvaluename.toCPointer<ByteVar>(), dwtype, lpdata.toCPointer<ByteVar>(), cbdata)

public actual fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORSetVirtualFlags(handle.toCPointer<ByteVar>(), dwflags)

public actual fun ORShutdown(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORShutdown()

public actual fun ORStart(): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry.cinterop.windowssys_windows_wdk_system_offlineregistry_ORStart()
