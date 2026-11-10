@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val _windowsWin32StorageDistributedfilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget((pdfspath?.value ?: 0L).toString(), (ptargetpath?.value ?: 0L).toString(), majorversion.toInt(), (pcomment?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum((dfsname?.value ?: 0L).toString(), level.toInt(), prefmaxlen.toInt(), (buffer?.value ?: 0L).toString(), (entriesread?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity((domainname?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity((dfsentrypath?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity((machinename?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(origin, (pname?.value ?: 0L).toString(), (ppversioninfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsMove((olddfsentrypath?.value ?: 0L).toString(), (newdfsentrypath?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced((domainname?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget((pdfspath?.value ?: 0L).toString(), (ptargetpath?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity((domainname?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity((dfsentrypath?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAddon != null) (_windowsWin32StorageDistributedfilesystemNapiAddon.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity((machinename?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
