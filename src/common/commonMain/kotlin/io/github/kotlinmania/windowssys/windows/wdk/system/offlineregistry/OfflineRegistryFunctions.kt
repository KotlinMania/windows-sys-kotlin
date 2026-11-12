package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun oRCloseHive(handle: Orhkey): Win32Error

public expect fun oRCloseKey(keyhandle: Orhkey): Win32Error

public expect fun oRCreateHive(horkey: MutPtr): Win32Error

public expect fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr, pdwdisposition: MutPtr): Win32Error

public expect fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error

public expect fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error

public expect fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr, lpclass: Pwstr, lpcclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error

public expect fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error

public expect fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error

public expect fun oRGetVersion(pdwmajorversion: MutPtr, pdwminorversion: MutPtr): Win32Error

public expect fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr): Win32Error

public expect fun oRMergeHives(hivehandles: ConstPtr, hivecount: UInt, phkresult: MutPtr): Win32Error

public expect fun oROpenHive(filepath: Pcwstr, horkey: MutPtr): Win32Error

public expect fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr): Win32Error

public expect fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error

public expect fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr, lpcsubkeys: MutPtr, lpcmaxsubkeylen: MutPtr, lpcmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcmaxvaluenamelen: MutPtr, lpcmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error

public expect fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error

public expect fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error

public expect fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error

public expect fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error

public expect fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error

public expect fun oRShutdown(): Win32Error

public expect fun oRStart(): Win32Error
