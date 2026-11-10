@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32StorageDistributedfilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(dfsentrypath: Long, servername: Long, sharename: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(pdfspath: Long, ptargetpath: Long, majorversion: Int, pcomment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(servername: Long, rootshare: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(dfsname: Long, level: Int, prefmaxlen: Int, buffer: Long, entriesread: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(domainname: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(dfsentrypath: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(machinename: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(origin: Int, pname: Long, ppversioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(olddfsentrypath: Long, newdfsentrypath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(dfsentrypath: Long, servername: Long, sharename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(domainname: Long, servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(pdfspath: Long, ptargetpath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(servername: Long, rootshare: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(domainname: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(dfsentrypath: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(machinename: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L), (comment?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot((servername?.value ?: 0L), (rootshare?.value ?: 0L), (ftdfsname?.value ?: 0L), (comment?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget((pdfspath?.value ?: 0L), (ptargetpath?.value ?: 0L), majorversion.toInt(), (pcomment?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot((servername?.value ?: 0L), (rootshare?.value ?: 0L), (comment?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum((dfsname?.value ?: 0L), level.toInt(), prefmaxlen.toInt(), (buffer?.value ?: 0L), (entriesread?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L), level.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity((domainname?.value ?: 0L), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L), level.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity((dfsentrypath?.value ?: 0L), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity((machinename?.value ?: 0L), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(origin, (pname?.value ?: 0L), (ppversioninfo?.value ?: 0L)).toUInt()

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsMove((olddfsentrypath?.value ?: 0L), (newdfsentrypath?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L)).toUInt()

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot((servername?.value ?: 0L), (rootshare?.value ?: 0L), (ftdfsname?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced((domainname?.value ?: 0L), (servername?.value ?: 0L), (rootshare?.value ?: 0L), (ftdfsname?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget((pdfspath?.value ?: 0L), (ptargetpath?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot((servername?.value ?: 0L), (rootshare?.value ?: 0L), flags.toInt()).toUInt()

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L), level.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity((domainname?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo((dfsentrypath?.value ?: 0L), (servername?.value ?: 0L), (sharename?.value ?: 0L), level.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity((dfsentrypath?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity((machinename?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L)).toUInt()
