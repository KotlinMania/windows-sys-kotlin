@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWin32StorageDistributedfilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsAdd(dfsentrypath: Long, servername: Long, sharename: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddRootTarget(pdfspath: Long, ptargetpath: Long, majorversion: Int, pcomment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddStdRoot(servername: Long, rootshare: Long, comment: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsEnum(dfsname: Long, level: Int, prefmaxlen: Int, buffer: Long, entriesread: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetFtContainerSecurity(domainname: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSecurity(dfsentrypath: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetStdContainerSecurity(machinename: Long, securityinformation: Int, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSupportedNamespaceVersion(origin: Int, pname: Long, ppversioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsMove(olddfsentrypath: Long, newdfsentrypath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemove(dfsentrypath: Long, servername: Long, sharename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRoot(servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRootForced(domainname: Long, servername: Long, rootshare: Long, ftdfsname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveRootTarget(pdfspath: Long, ptargetpath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveStdRoot(servername: Long, rootshare: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetClientInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetFtContainerSecurity(domainname: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetInfo(dfsentrypath: Long, servername: Long, sharename: Long, level: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetSecurity(dfsentrypath: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetStdContainerSecurity(machinename: Long, securityinformation: Int, psecuritydescriptor: Long): Int
}

public actual fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAdd(dfsentrypath, servername, sharename, comment, flags.toInt()).toUInt()

public actual fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddFtRoot(servername, rootshare, ftdfsname, comment, flags.toInt()).toUInt()

public actual fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddRootTarget(pdfspath, ptargetpath, majorversion.toInt(), pcomment, flags.toInt()).toUInt()

public actual fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddStdRoot(servername, rootshare, comment, flags.toInt()).toUInt()

public actual fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsEnum(dfsname, level.toInt(), prefmaxlen.toInt(), buffer, entriesread, resumehandle).toUInt()

public actual fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetClientInfo(dfsentrypath, servername, sharename, level.toInt(), buffer).toUInt()

public actual fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetFtContainerSecurity(domainname, securityinformation.toInt(), ppsecuritydescriptor, lpcbsecuritydescriptor).toUInt()

public actual fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetInfo(dfsentrypath, servername, sharename, level.toInt(), buffer).toUInt()

public actual fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSecurity(dfsentrypath, securityinformation.toInt(), ppsecuritydescriptor, lpcbsecuritydescriptor).toUInt()

public actual fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetStdContainerSecurity(machinename, securityinformation.toInt(), ppsecuritydescriptor, lpcbsecuritydescriptor).toUInt()

public actual fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSupportedNamespaceVersion(origin, pname, ppversioninfo).toUInt()

public actual fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsMove(olddfsentrypath, newdfsentrypath, flags.toInt()).toUInt()

public actual fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemove(dfsentrypath, servername, sharename).toUInt()

public actual fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRoot(servername, rootshare, ftdfsname, flags.toInt()).toUInt()

public actual fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRootForced(domainname, servername, rootshare, ftdfsname, flags.toInt()).toUInt()

public actual fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveRootTarget(pdfspath, ptargetpath, flags.toInt()).toUInt()

public actual fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveStdRoot(servername, rootshare, flags.toInt()).toUInt()

public actual fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetClientInfo(dfsentrypath, servername, sharename, level.toInt(), buffer).toUInt()

public actual fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetFtContainerSecurity(domainname, securityinformation.toInt(), psecuritydescriptor).toUInt()

public actual fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetInfo(dfsentrypath, servername, sharename, level.toInt(), buffer).toUInt()

public actual fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetSecurity(dfsentrypath, securityinformation.toInt(), psecuritydescriptor).toUInt()

public actual fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWin32StorageDistributedfilesystemJniBridge.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetStdContainerSecurity(machinename, securityinformation.toInt(), psecuritydescriptor).toUInt()
