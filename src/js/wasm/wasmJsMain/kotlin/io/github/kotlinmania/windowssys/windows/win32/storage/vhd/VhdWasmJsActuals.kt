@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32StorageVhdNapiAddon(): Boolean

private val _windowsWin32StorageVhdNapiAvailable: Boolean = _initWindowsWin32StorageVhdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_addVirtualDiskParent(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_addVirtualDiskParent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_applySnapshotVhdSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_applySnapshotVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_attachVirtualDisk(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_attachVirtualDisk(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk(p0)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_compactVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_compactVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_completeForkVirtualDisk(p0)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_completeForkVirtualDisk(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_createVirtualDisk(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_createVirtualDisk(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_detachVirtualDisk(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_detachVirtualDisk(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_expandVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_expandVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_forkVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_forkVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getStorageDependencyInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getStorageDependencyInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getVirtualDiskInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_mergeVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_mergeVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_mirrorVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_mirrorVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_modifyVhdSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_modifyVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_openVirtualDisk(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_openVirtualDisk(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_resizeVirtualDisk(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_resizeVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_setVirtualDiskInformation(p0, p1)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_setVirtualDiskInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet(p0: String, p1: String, p2: Int): Int

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_addVirtualDiskParent((virtualdiskhandle?.value ?: 0L).toString(), (parentpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ApplySnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_applySnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_attachVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk((virtualdiskhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_compactVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_completeForkVirtualDisk((virtualdiskhandle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_createVirtualDisk((virtualstoragetype?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), virtualdiskaccessmask, (securitydescriptor?.value ?: 0L).toString(), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_detachVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, providerspecificflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: COpaquePointer?, items: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (numberofitems?.value ?: 0L).toString(), (items?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_expandVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_forkVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: COpaquePointer?, pathsbuffer: Pwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths((pathsbuffersizeinbytes?.value ?: 0L).toString(), (pathsbuffer?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getStorageDependencyInformation((objecthandle?.value ?: 0L).toString(), flags, storagedependencyinfosize.toInt(), (storagedependencyinfo?.value ?: 0L).toString(), (sizeused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: COpaquePointer?, virtualdiskinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskInformation((virtualdiskhandle?.value ?: 0L).toString(), (virtualdiskinfosize?.value ?: 0L).toString(), (virtualdiskinfo?.value ?: 0L).toString(), (sizeused?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: COpaquePointer?, metadata: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString(), (metadatasize?.value ?: 0L).toString(), (metadata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: COpaquePointer?, progress: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress((virtualdiskhandle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), (progress?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: COpaquePointer?, diskpath: Pwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath((virtualdiskhandle?.value ?: 0L).toString(), (diskpathsizeinbytes?.value ?: 0L).toString(), (diskpath?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_mergeVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_mirrorVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ModifyVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_modifyVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_openVirtualDisk((virtualstoragetype?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), virtualdiskaccessmask, flags, (parameters?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: COpaquePointer?, rangecount: COpaquePointer?, processedlength: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (changetrackingid?.value ?: 0L).toString(), byteoffset.toString(), bytelength.toString(), flags, (ranges?.value ?: 0L).toString(), (rangecount?.value ?: 0L).toString(), (processedlength?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: RawScsiVirtualDiskFlag, response: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags, (response?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_resizeVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_setVirtualDiskInformation((virtualdiskhandle?.value ?: 0L).toString(), (virtualdiskinfo?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: UInt, metadata: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString(), metadatasize.toInt(), (metadata?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: TakeSnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAvailable) _wasm_windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
