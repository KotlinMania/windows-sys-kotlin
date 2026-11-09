package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public expect fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt

public expect fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt

public expect fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt

public expect fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt

public expect fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt

public expect fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt

public expect fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt

public expect fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt

public expect fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt

public expect fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt

public expect fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt

public expect fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt

public expect fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt

public expect fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt

public expect fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt

public expect fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt

public expect fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt

public expect fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt

public expect fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt

public expect fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt

public expect fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt

public expect fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt
