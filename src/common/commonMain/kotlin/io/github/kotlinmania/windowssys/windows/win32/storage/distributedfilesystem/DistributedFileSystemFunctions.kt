package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsAdd", longArrayOf(dfsentrypath, servername, sharename, comment, flags.toLong())).toUInt()
}

public fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsAddFtRoot", longArrayOf(servername, rootshare, ftdfsname, comment, flags.toLong())).toUInt()
}

public fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsAddRootTarget", longArrayOf(pdfspath, ptargetpath, majorversion.toLong(), pcomment, flags.toLong())).toUInt()
}

public fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsAddStdRoot", longArrayOf(servername, rootshare, comment, flags.toLong())).toUInt()
}

public fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsEnum", longArrayOf(dfsname, level.toLong(), prefmaxlen.toLong(), buffer, entriesread, resumehandle)).toUInt()
}

public fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetClientInfo", longArrayOf(dfsentrypath, servername, sharename, level.toLong(), buffer)).toUInt()
}

public fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetFtContainerSecurity", longArrayOf(domainname, securityinformation.toLong(), ppsecuritydescriptor, lpcbsecuritydescriptor)).toUInt()
}

public fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetInfo", longArrayOf(dfsentrypath, servername, sharename, level.toLong(), buffer)).toUInt()
}

public fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetSecurity", longArrayOf(dfsentrypath, securityinformation.toLong(), ppsecuritydescriptor, lpcbsecuritydescriptor)).toUInt()
}

public fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetStdContainerSecurity", longArrayOf(machinename, securityinformation.toLong(), ppsecuritydescriptor, lpcbsecuritydescriptor)).toUInt()
}

public fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsGetSupportedNamespaceVersion", longArrayOf(origin.toLong(), pname, ppversioninfo)).toUInt()
}

public fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsMove", longArrayOf(olddfsentrypath, newdfsentrypath, flags.toLong())).toUInt()
}

public fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsRemove", longArrayOf(dfsentrypath, servername, sharename)).toUInt()
}

public fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsRemoveFtRoot", longArrayOf(servername, rootshare, ftdfsname, flags.toLong())).toUInt()
}

public fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsRemoveFtRootForced", longArrayOf(domainname, servername, rootshare, ftdfsname, flags.toLong())).toUInt()
}

public fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsRemoveRootTarget", longArrayOf(pdfspath, ptargetpath, flags.toLong())).toUInt()
}

public fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsRemoveStdRoot", longArrayOf(servername, rootshare, flags.toLong())).toUInt()
}

public fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsSetClientInfo", longArrayOf(dfsentrypath, servername, sharename, level.toLong(), buffer)).toUInt()
}

public fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsSetFtContainerSecurity", longArrayOf(domainname, securityinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toUInt()
}

public fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsSetInfo", longArrayOf(dfsentrypath, servername, sharename, level.toLong(), buffer)).toUInt()
}

public fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsSetSecurity", longArrayOf(dfsentrypath, securityinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toUInt()
}

public fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): UInt {
    return Win32DynamicFfi.invoke("netapi32.dll", "NetDfsSetStdContainerSecurity", longArrayOf(machinename, securityinformation.toLong(), Win32DynamicFfi.objectSlot(psecuritydescriptor))).toUInt()
}
