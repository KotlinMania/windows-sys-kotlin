package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun oRCloseHive(handle: Orhkey): Win32Error

public expect fun oRCloseKey(keyhandle: Orhkey): Win32Error

public expect fun oRCreateHive(horkey: COpaquePointer?): Win32Error

public expect fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: COpaquePointer?, pdwdisposition: COpaquePointer?): Win32Error

public expect fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error

public expect fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error

public expect fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: COpaquePointer?, lpclass: Pwstr, lpcclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error

public expect fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error

public expect fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error

public expect fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error

public expect fun oRGetVersion(pdwmajorversion: COpaquePointer?, pdwminorversion: COpaquePointer?): Win32Error

public expect fun oRGetVirtualFlags(handle: Orhkey, pdwflags: COpaquePointer?): Win32Error

public expect fun oRMergeHives(hivehandles: COpaquePointer?, hivecount: UInt, phkresult: COpaquePointer?): Win32Error

public expect fun oROpenHive(filepath: Pcwstr, horkey: COpaquePointer?): Win32Error

public expect fun oROpenHiveByHandle(filehandle: Handle, horkey: COpaquePointer?): Win32Error

public expect fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error

public expect fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcmaxsubkeylen: COpaquePointer?, lpcmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcmaxvaluenamelen: COpaquePointer?, lpcmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error

public expect fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error

public expect fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error

public expect fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error

public expect fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error

public expect fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error

public expect fun oRShutdown(): Win32Error

public expect fun oRStart(): Win32Error
