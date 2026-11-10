@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageDistributedfilesystemNapiAddon(): Boolean

private val _windowsWin32StorageDistributedfilesystemNapiAvailable: Boolean = _initWindowsWin32StorageDistributedfilesystemNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsMove(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity(p0: String, p1: Int, p2: String): Int

public actual fun netDfsAdd(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAdd((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddFtRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, majorversion: UInt, pcomment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddRootTarget((pdfspath?.value ?: 0L).toString(), (ptargetpath?.value ?: 0L).toString(), majorversion.toInt(), (pcomment?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsAddStdRoot(servername: Pcwstr, rootshare: Pcwstr, comment: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsAddStdRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (comment?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsEnum(dfsname: Pcwstr, level: UInt, prefmaxlen: UInt, buffer: COpaquePointer?, entriesread: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsEnum((dfsname?.value ?: 0L).toString(), level.toInt(), prefmaxlen.toInt(), (buffer?.value ?: 0L).toString(), (entriesread?.value ?: 0L).toString(), (resumehandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetClientInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetFtContainerSecurity((domainname?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSecurity((dfsentrypath?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, ppsecuritydescriptor: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetStdContainerSecurity((machinename?.value ?: 0L).toString(), securityinformation.toInt(), (ppsecuritydescriptor?.value ?: 0L).toString(), (lpcbsecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsGetSupportedNamespaceVersion(origin: DfsNamespaceVersionOrigin, pname: Pcwstr, ppversioninfo: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsGetSupportedNamespaceVersion(origin, (pname?.value ?: 0L).toString(), (ppversioninfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsMove(olddfsentrypath: Pcwstr, newdfsentrypath: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsMove((olddfsentrypath?.value ?: 0L).toString(), (newdfsentrypath?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemove(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemove((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRoot(servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveFtRootForced(domainname: Pcwstr, servername: Pcwstr, rootshare: Pcwstr, ftdfsname: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveFtRootForced((domainname?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), (ftdfsname?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveRootTarget(pdfspath: Pcwstr, ptargetpath: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveRootTarget((pdfspath?.value ?: 0L).toString(), (ptargetpath?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsRemoveStdRoot(servername: Pcwstr, rootshare: Pcwstr, flags: UInt): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsRemoveStdRoot((servername?.value ?: 0L).toString(), (rootshare?.value ?: 0L).toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetClientInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetClientInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetFtContainerSecurity(domainname: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetFtContainerSecurity((domainname?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetInfo(dfsentrypath: Pcwstr, servername: Pcwstr, sharename: Pcwstr, level: UInt, buffer: COpaquePointer?): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetInfo((dfsentrypath?.value ?: 0L).toString(), (servername?.value ?: 0L).toString(), (sharename?.value ?: 0L).toString(), level.toInt(), (buffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetSecurity(dfsentrypath: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetSecurity((dfsentrypath?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netDfsSetStdContainerSecurity(machinename: Pcwstr, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWin32StorageDistributedfilesystemNapiAvailable) _wasm_windowssys_windows_win32_storage_distributedfilesystem_netDfsSetStdContainerSecurity((machinename?.value ?: 0L).toString(), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
