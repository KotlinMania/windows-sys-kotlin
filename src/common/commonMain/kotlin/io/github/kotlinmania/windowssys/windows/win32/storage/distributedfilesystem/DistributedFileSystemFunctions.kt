package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt

public expect fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt

public expect fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt

public expect fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt

public expect fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt

public expect fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt

public expect fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt

public expect fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt

public expect fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt

public expect fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt

public expect fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt

public expect fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt

public expect fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt

public expect fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt

public expect fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt

public expect fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt

public expect fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt

public expect fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt

public expect fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt

public expect fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt

public expect fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt
