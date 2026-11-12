@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageDistributedfilesystemNapiAddon(): Boolean

private val windowsWin32StorageDistributedfilesystemNapiAvailable: Boolean = initWindowsWin32StorageDistributedfilesystemNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(p0: String, p1: Int, p2: String): Int

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAdd(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddFtRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddRootTarget(pdfspath.rawAddress.toString(), ptargetpath.rawAddress.toString(), majorversion.toInt(), pcomment.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsAddStdRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), comment.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: MutPtr<MutPtr<UByte>>, entriesread: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsEnum(dfsname.rawAddress.toString(), level.toInt(), prefmaxlen.toInt(), buffer.rawAddress.toString(), entriesread.rawAddress.toString(), resumehandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetClientInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetFtContainerSecurity(domainname.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSecurity(dfsentrypath.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>, lpcbsecuritydescriptor: MutPtr<UInt>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetStdContainerSecurity(machinename.rawAddress.toString(), securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString(), lpcbsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: MutPtr<MutPtr<DfsSupportedNamespaceVersionInfo>>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsGetSupportedNamespaceVersion(origin, pname.rawAddress.toString(), ppversioninfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsMove(olddfsentrypath.rawAddress.toString(), newdfsentrypath.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemove(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveFtRootForced(domainname.rawAddress.toString(), servername.rawAddress.toString(), rootshare.rawAddress.toString(), ftdfsname.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveRootTarget(pdfspath.rawAddress.toString(), ptargetpath.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsRemoveStdRoot(servername.rawAddress.toString(), rootshare.rawAddress.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetClientInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetFtContainerSecurity(domainname.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetInfo(dfsentrypath.rawAddress.toString(), servername.rawAddress.toString(), sharename.rawAddress.toString(), level.toInt(), buffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetSecurity(dfsentrypath.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWin32StorageDistributedfilesystemNapiAvailable) wasmWindowssysWindowsWin32StorageDistributedfilesystemNetDfsSetStdContainerSecurity(machinename.rawAddress.toString(), securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
