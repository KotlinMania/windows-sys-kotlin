@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAdd(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>(), comment.toCPointer<ByteVar>(), flags)

public actual fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddFtRoot(servername.toCPointer<ByteVar>(), rootshare.toCPointer<ByteVar>(), ftdfsname.toCPointer<ByteVar>(), comment.toCPointer<ByteVar>(), flags)

public actual fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddRootTarget(pdfspath.toCPointer<ByteVar>(), ptargetpath.toCPointer<ByteVar>(), majorversion, pcomment.toCPointer<ByteVar>(), flags)

public actual fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddStdRoot(servername.toCPointer<ByteVar>(), rootshare.toCPointer<ByteVar>(), comment.toCPointer<ByteVar>(), flags)

public actual fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsEnum(dfsname.toCPointer<ByteVar>(), level, prefmaxlen, buffer.toCPointer<ByteVar>(), entriesread.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetClientInfo(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>(), level, buffer.toCPointer<ByteVar>())

public actual fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetFtContainerSecurity(domainname.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetInfo(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>(), level, buffer.toCPointer<ByteVar>())

public actual fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSecurity(dfsentrypath.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetStdContainerSecurity(machinename.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.toCPointer<ByteVar>(), lpcbsecuritydescriptor.toCPointer<ByteVar>())

public actual fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSupportedNamespaceVersion(origin, pname.toCPointer<ByteVar>(), ppversioninfo.toCPointer<ByteVar>())

public actual fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsMove(olddfsentrypath.toCPointer<ByteVar>(), newdfsentrypath.toCPointer<ByteVar>(), flags)

public actual fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemove(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>())

public actual fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRoot(servername.toCPointer<ByteVar>(), rootshare.toCPointer<ByteVar>(), ftdfsname.toCPointer<ByteVar>(), flags)

public actual fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRootForced(domainname.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), rootshare.toCPointer<ByteVar>(), ftdfsname.toCPointer<ByteVar>(), flags)

public actual fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveRootTarget(pdfspath.toCPointer<ByteVar>(), ptargetpath.toCPointer<ByteVar>(), flags)

public actual fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveStdRoot(servername.toCPointer<ByteVar>(), rootshare.toCPointer<ByteVar>(), flags)

public actual fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetClientInfo(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>(), level, buffer.toCPointer<ByteVar>())

public actual fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetFtContainerSecurity(domainname.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetInfo(dfsentrypath.toCPointer<ByteVar>(), servername.toCPointer<ByteVar>(), sharename.toCPointer<ByteVar>(), level, buffer.toCPointer<ByteVar>())

public actual fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetSecurity(dfsentrypath.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())

public actual fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetStdContainerSecurity(machinename.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.toCPointer<ByteVar>())
