@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity
import io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem.cinterop.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>(), comment.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(servername.rawAddress.toCPointer<ByteVar>(), rootshare.rawAddress.toCPointer<ByteVar>(), ftdfsname.rawAddress.toCPointer<ByteVar>(), comment.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(pdfspath.rawAddress.toCPointer<ByteVar>(), ptargetpath.rawAddress.toCPointer<ByteVar>(), majorversion, pcomment.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(servername.rawAddress.toCPointer<ByteVar>(), rootshare.rawAddress.toCPointer<ByteVar>(), comment.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: MutPtr, entriesread: MutPtr, resumehandle: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(dfsname.rawAddress.toCPointer<ByteVar>(), level, prefmaxlen, buffer.rawAddress.toCPointer<ByteVar>(), entriesread.rawAddress.toCPointer<ByteVar>(), resumehandle.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>(), level, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr, lpcbsecuritydescriptor: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(domainname.rawAddress.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>(), level, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr, lpcbsecuritydescriptor: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(dfsentrypath.rawAddress.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr, lpcbsecuritydescriptor: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(machinename.rawAddress.toCPointer<ByteVar>(), securityinformation, ppsecuritydescriptor.rawAddress.toCPointer<ByteVar>(), lpcbsecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: MutPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(origin, pname.rawAddress.toCPointer<ByteVar>(), ppversioninfo.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(olddfsentrypath.rawAddress.toCPointer<ByteVar>(), newdfsentrypath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(servername.rawAddress.toCPointer<ByteVar>(), rootshare.rawAddress.toCPointer<ByteVar>(), ftdfsname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(domainname.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), rootshare.rawAddress.toCPointer<ByteVar>(), ftdfsname.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(pdfspath.rawAddress.toCPointer<ByteVar>(), ptargetpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(servername.rawAddress.toCPointer<ByteVar>(), rootshare.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>(), level, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(domainname.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(dfsentrypath.rawAddress.toCPointer<ByteVar>(), servername.rawAddress.toCPointer<ByteVar>(), sharename.rawAddress.toCPointer<ByteVar>(), level, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(dfsentrypath.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(machinename.rawAddress.toCPointer<ByteVar>(), securityinformation, psecuritydescriptor.rawAddress.toCPointer<ByteVar>())
