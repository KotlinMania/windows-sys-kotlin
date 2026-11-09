@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun ORCloseHive(handle: ORHKEY): WIN32_ERROR =
    0u

public actual fun ORCloseKey(keyhandle: ORHKEY): WIN32_ERROR =
    0u

public actual fun ORCreateHive(horkey: Long): WIN32_ERROR =
    0u

public actual fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): WIN32_ERROR =
    0u

public actual fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): WIN32_ERROR =
    0u

public actual fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): WIN32_ERROR =
    0u

public actual fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR =
    0u

public actual fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR =
    0u

public actual fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR =
    0u

public actual fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): WIN32_ERROR =
    0u

public actual fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): WIN32_ERROR =
    0u

public actual fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): WIN32_ERROR =
    0u

public actual fun OROpenHive(filepath: PCWSTR, horkey: Long): WIN32_ERROR =
    0u

public actual fun OROpenHiveByHandle(filehandle: HANDLE, horkey: Long): WIN32_ERROR =
    0u

public actual fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR =
    0u

public actual fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR =
    0u

public actual fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): WIN32_ERROR =
    0u

public actual fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): WIN32_ERROR =
    0u

public actual fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR =
    0u

public actual fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR =
    0u

public actual fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): WIN32_ERROR =
    0u

public actual fun ORShutdown(): WIN32_ERROR =
    0u

public actual fun ORStart(): WIN32_ERROR =
    0u
