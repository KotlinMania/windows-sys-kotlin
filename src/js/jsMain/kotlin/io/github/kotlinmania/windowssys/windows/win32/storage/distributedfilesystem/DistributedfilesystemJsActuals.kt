@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWin32StorageDistributedfilesystemNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun NetDfsAdd(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAdd(dfsentrypath.toString(), servername.toString(), sharename.toString(), comment.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsAddFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddFtRoot(servername.toString(), rootshare.toString(), ftdfsname.toString(), comment.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsAddRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, majorversion: UInt, pcomment: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddRootTarget(pdfspath.toString(), ptargetpath.toString(), majorversion.toInt(), pcomment.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsAddStdRoot(servername: PCWSTR, rootshare: PCWSTR, comment: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsAddStdRoot(servername.toString(), rootshare.toString(), comment.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsEnum(dfsname: PCWSTR, level: UInt, prefmaxlen: UInt, buffer: Long, entriesread: Long, resumehandle: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsEnum(dfsname.toString(), level.toInt(), prefmaxlen.toInt(), buffer.toString(), entriesread.toString(), resumehandle.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetClientInfo(dfsentrypath.toString(), servername.toString(), sharename.toString(), level.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetFtContainerSecurity(domainname.toString(), securityinformation.toInt(), ppsecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetInfo(dfsentrypath.toString(), servername.toString(), sharename.toString(), level.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSecurity(dfsentrypath.toString(), securityinformation.toInt(), ppsecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, ppsecuritydescriptor: Long, lpcbsecuritydescriptor: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetStdContainerSecurity(machinename.toString(), securityinformation.toInt(), ppsecuritydescriptor.toString(), lpcbsecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun NetDfsGetSupportedNamespaceVersion(origin: DFS_NAMESPACE_VERSION_ORIGIN, pname: PCWSTR, ppversioninfo: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsGetSupportedNamespaceVersion(origin, pname.toString(), ppversioninfo.toString()) as Int).toUInt() else 0u

public actual fun NetDfsMove(olddfsentrypath: PCWSTR, newdfsentrypath: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsMove(olddfsentrypath.toString(), newdfsentrypath.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsRemove(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemove(dfsentrypath.toString(), servername.toString(), sharename.toString()) as Int).toUInt() else 0u

public actual fun NetDfsRemoveFtRoot(servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRoot(servername.toString(), rootshare.toString(), ftdfsname.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsRemoveFtRootForced(domainname: PCWSTR, servername: PCWSTR, rootshare: PCWSTR, ftdfsname: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveFtRootForced(domainname.toString(), servername.toString(), rootshare.toString(), ftdfsname.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsRemoveRootTarget(pdfspath: PCWSTR, ptargetpath: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveRootTarget(pdfspath.toString(), ptargetpath.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsRemoveStdRoot(servername: PCWSTR, rootshare: PCWSTR, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsRemoveStdRoot(servername.toString(), rootshare.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun NetDfsSetClientInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetClientInfo(dfsentrypath.toString(), servername.toString(), sharename.toString(), level.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetDfsSetFtContainerSecurity(domainname: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetFtContainerSecurity(domainname.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun NetDfsSetInfo(dfsentrypath: PCWSTR, servername: PCWSTR, sharename: PCWSTR, level: UInt, buffer: Long): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetInfo(dfsentrypath.toString(), servername.toString(), sharename.toString(), level.toInt(), buffer.toString()) as Int).toUInt() else 0u

public actual fun NetDfsSetSecurity(dfsentrypath: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetSecurity(dfsentrypath.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int).toUInt() else 0u

public actual fun NetDfsSetStdContainerSecurity(machinename: PCWSTR, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_NetDfsSetStdContainerSecurity(machinename.toString(), securityinformation.toInt(), psecuritydescriptor.toString()) as Int).toUInt() else 0u
