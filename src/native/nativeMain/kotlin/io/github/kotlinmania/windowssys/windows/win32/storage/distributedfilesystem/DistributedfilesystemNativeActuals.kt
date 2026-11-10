@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>(), comment?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(servername?.value?.toCPointer<ByteVar>(), rootshare?.value?.toCPointer<ByteVar>(), ftdfsname?.value?.toCPointer<ByteVar>(), comment?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(pdfspath?.value?.toCPointer<ByteVar>(), ptargetpath?.value?.toCPointer<ByteVar>(), majorversion, pcomment?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(servername?.value?.toCPointer<ByteVar>(), rootshare?.value?.toCPointer<ByteVar>(), comment?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(dfsname?.value?.toCPointer<ByteVar>(), level, prefmaxlen, buffer?.value?.toCPointer<ByteVar>(), entriesread?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>(), level, buffer?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(domainname?.value?.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>(), level, buffer?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(dfsentrypath?.value?.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(machinename?.value?.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor?.value?.toCPointer<ByteVar>(), lpcbsecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(origin, pname?.value?.toCPointer<ByteVar>(), ppversioninfo?.value?.toCPointer<ByteVar>())

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(olddfsentrypath?.value?.toCPointer<ByteVar>(), newdfsentrypath?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>())

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(servername?.value?.toCPointer<ByteVar>(), rootshare?.value?.toCPointer<ByteVar>(), ftdfsname?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(domainname?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), rootshare?.value?.toCPointer<ByteVar>(), ftdfsname?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(pdfspath?.value?.toCPointer<ByteVar>(), ptargetpath?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(servername?.value?.toCPointer<ByteVar>(), rootshare?.value?.toCPointer<ByteVar>(), flags)

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>(), level, buffer?.value?.toCPointer<ByteVar>())

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(domainname?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(dfsentrypath?.value?.toCPointer<ByteVar>(), servername?.value?.toCPointer<ByteVar>(), sharename?.value?.toCPointer<ByteVar>(), level, buffer?.value?.toCPointer<ByteVar>())

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(dfsentrypath?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(machinename?.value?.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor?.value?.toCPointer<ByteVar>())
