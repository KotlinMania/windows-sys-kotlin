@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt =
    0u

public actual fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    0u

public actual fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    0u

public actual fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    0u

public actual fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    0u

public actual fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    0u

public actual fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt =
    0u

public actual fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt =
    0u

public actual fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt =
    0u

public actual fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    0u

public actual fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    0u

public actual fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u

public actual fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    0u
