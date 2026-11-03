package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun ORCloseHive(handle: ORHKEY): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORCloseHive", longArrayOf(handle))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORCloseKey(keyhandle: ORHKEY): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORCloseKey", longArrayOf(keyhandle))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORCreateHive(horkey: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORCreateHive", longArrayOf(horkey))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORCreateKey(keyhandle: ORHKEY, lpsubkey: PCWSTR, lpclass: PCWSTR, dwoptions: UInt, psecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, phkresult: Long, pdwdisposition: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORCreateKey", longArrayOf(keyhandle, lpsubkey, lpclass, dwoptions.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor), phkresult, pdwdisposition))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORDeleteKey(handle: ORHKEY, lpsubkey: PCWSTR): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORDeleteKey", longArrayOf(handle, lpsubkey))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORDeleteValue(handle: ORHKEY, lpvaluename: PCWSTR): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORDeleteValue", longArrayOf(handle, lpvaluename))
    return Win32.Foundation.WIN32_ERROR()
}

public fun OREnumKey(handle: ORHKEY, dwindex: UInt, lpname: PWSTR, lpcname: Long, lpclass: PWSTR, lpcclass: Long, lpftlastwritetime: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "OREnumKey", longArrayOf(handle, dwindex.toLong(), lpname, lpcname, lpclass, lpcclass, lpftlastwritetime))
    return Win32.Foundation.WIN32_ERROR()
}

public fun OREnumValue(handle: ORHKEY, dwindex: UInt, lpvaluename: PWSTR, lpcvaluename: Long, lptype: Long, lpdata: Long, lpcbdata: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "OREnumValue", longArrayOf(handle, dwindex.toLong(), lpvaluename, lpcvaluename, lptype, lpdata, lpcbdata))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORGetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORGetKeySecurity", longArrayOf(handle, securityinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor), lpcbsecuritydescriptor))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORGetValue(handle: ORHKEY, lpsubkey: PCWSTR, lpvalue: PCWSTR, pdwtype: Long, pvdata: Long, pcbdata: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORGetValue", longArrayOf(handle, lpsubkey, lpvalue, pdwtype, pvdata, pcbdata))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORGetVersion(pdwmajorversion: Long, pdwminorversion: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORGetVersion", longArrayOf(pdwmajorversion, pdwminorversion))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORGetVirtualFlags(handle: ORHKEY, pdwflags: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORGetVirtualFlags", longArrayOf(handle, pdwflags))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORMergeHives(hivehandles: Long, hivecount: UInt, phkresult: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORMergeHives", longArrayOf(hivehandles, hivecount.toLong(), phkresult))
    return Win32.Foundation.WIN32_ERROR()
}

public fun OROpenHive(filepath: PCWSTR, horkey: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "OROpenHive", longArrayOf(filepath, horkey))
    return Win32.Foundation.WIN32_ERROR()
}

public fun OROpenHiveByHandle(filehandle: Win32.Foundation.HANDLE, horkey: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "OROpenHiveByHandle", longArrayOf(Win32DynamicFfi.objectSlot(filehandle), horkey))
    return Win32.Foundation.WIN32_ERROR()
}

public fun OROpenKey(handle: ORHKEY, lpsubkey: PCWSTR, phkresult: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "OROpenKey", longArrayOf(handle, lpsubkey, phkresult))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORQueryInfoKey(handle: ORHKEY, lpclass: PWSTR, lpcclass: Long, lpcsubkeys: Long, lpcmaxsubkeylen: Long, lpcmaxclasslen: Long, lpcvalues: Long, lpcmaxvaluenamelen: Long, lpcmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORQueryInfoKey", longArrayOf(handle, lpclass, lpcclass, lpcsubkeys, lpcmaxsubkeylen, lpcmaxclasslen, lpcvalues, lpcmaxvaluenamelen, lpcmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORRenameKey(handle: ORHKEY, lpnewname: PCWSTR): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORRenameKey", longArrayOf(handle, lpnewname))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORSaveHive(horkey: ORHKEY, hivepath: PCWSTR, osmajorversion: UInt, osminorversion: UInt): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORSaveHive", longArrayOf(horkey, hivepath, osmajorversion.toLong(), osminorversion.toLong()))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORSetKeySecurity(handle: ORHKEY, securityinformation: UInt, psecuritydescriptor: Win32.Security.PSECURITY_DESCRIPTOR): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORSetKeySecurity", longArrayOf(handle, securityinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor)))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORSetValue(handle: ORHKEY, lpvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORSetValue", longArrayOf(handle, lpvaluename, dwtype.toLong(), lpdata, cbdata.toLong()))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORSetVirtualFlags(handle: ORHKEY, dwflags: UInt): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORSetVirtualFlags", longArrayOf(handle, dwflags.toLong()))
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORShutdown(): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORShutdown", longArrayOf())
    return Win32.Foundation.WIN32_ERROR()
}

public fun ORStart(): Win32.Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("offreg.dll", "ORStart", longArrayOf())
    return Win32.Foundation.WIN32_ERROR()
}
