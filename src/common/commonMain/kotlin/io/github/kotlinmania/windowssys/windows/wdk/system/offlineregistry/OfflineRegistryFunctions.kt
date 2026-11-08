package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun ORCloseHive(handle: ORHKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORCloseHive", longArrayOf(handle)).toUInt()
}

public fun ORCloseKey(keyhandle: ORHKEY): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORCloseKey", longArrayOf(keyhandle)).toUInt()
}

public fun ORCreateHive(horkey: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORCreateHive", longArrayOf(horkey)).toUInt()
}

public fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORCreateKey", longArrayOf(keyhandle, lpsubkey, lpclass, dwoptions.toLong(), psecuritydescriptor, phkresult, pdwdisposition)).toUInt()
}

public fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORDeleteKey", longArrayOf(handle, lpsubkey)).toUInt()
}

public fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORDeleteValue", longArrayOf(handle, lpvaluename)).toUInt()
}

public fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "OREnumKey", longArrayOf(handle, dwindex.toLong(), lpname, lpcname, lpclass, lpcclass, lpftlastwritetime)).toUInt()
}

public fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "OREnumValue", longArrayOf(handle, dwindex.toLong(), lpvaluename, lpcvaluename, lptype, lpdata, lpcbdata)).toUInt()
}

public fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORGetKeySecurity", longArrayOf(handle, securityinformation.toLong(), psecuritydescriptor, lpcbsecuritydescriptor)).toUInt()
}

public fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORGetValue", longArrayOf(handle, lpsubkey, lpvalue, pdwtype, pvdata, pcbdata)).toUInt()
}

public fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORGetVersion", longArrayOf(pdwmajorversion, pdwminorversion)).toUInt()
}

public fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORGetVirtualFlags", longArrayOf(handle, pdwflags)).toUInt()
}

public fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORMergeHives", longArrayOf(hivehandles, hivecount.toLong(), phkresult)).toUInt()
}

public fun OROpenHive(filepath: PCWSTR, horkey: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "OROpenHive", longArrayOf(filepath, horkey)).toUInt()
}

public fun OROpenHiveByHandle(filehandle: HANDLE, horkey: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "OROpenHiveByHandle", longArrayOf(filehandle, horkey)).toUInt()
}

public fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "OROpenKey", longArrayOf(handle, lpsubkey, phkresult)).toUInt()
}

public fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORQueryInfoKey", longArrayOf(handle, lpclass, lpcclass, lpcsubkeys, lpcmaxsubkeylen, lpcmaxclasslen, lpcvalues, lpcmaxvaluenamelen, lpcmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime)).toUInt()
}

public fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORRenameKey", longArrayOf(handle, lpnewname)).toUInt()
}

public fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORSaveHive", longArrayOf(horkey, hivepath, osmajorversion.toLong(), osminorversion.toLong())).toUInt()
}

public fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORSetKeySecurity", longArrayOf(handle, securityinformation.toLong(), psecuritydescriptor)).toUInt()
}

public fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORSetValue", longArrayOf(handle, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong())).toUInt()
}

public fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORSetVirtualFlags", longArrayOf(handle, dwflags.toLong())).toUInt()
}

public fun ORShutdown(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORShutdown", longArrayOf()).toUInt()
}

public fun ORStart(): WIN32_ERROR {
    return Win32DynamicFfi.invoke("offreg.dll", "ORStart", longArrayOf()).toUInt()
}
