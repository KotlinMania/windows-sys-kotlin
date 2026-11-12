@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWin32StorageDistributedfilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(pdfspath.rawAddress.toString(), ptargetpath.rawAddress.toString(), majorversion.toInt(), pcomment.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: MutPtr<MutPtr<UByte>>, entriesread: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(dfsname.rawAddress.toString(), level.toInt(), prefmaxlen.toInt(), buffer.rawAddress.toString(), entriesread.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(domainname.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(dfsentrypath.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(machinename.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: MutPtr<MutPtr<DfsSupportedNamespaceVersionInfo>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(origin, pname.rawAddress.toString(), ppversioninfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(olddfsentrypath.rawAddress.toString(), newdfsentrypath.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(domainname.rawAddress.toString(), servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(pdfspath.rawAddress.toString(), ptargetpath.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(domainname.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(dfsentrypath.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAddon != null) (windowsWin32StorageDistributedfilesystemNapiAddon.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(machinename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
