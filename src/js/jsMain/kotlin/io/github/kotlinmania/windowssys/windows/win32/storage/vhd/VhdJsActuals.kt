@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val _windowsWin32StorageVhdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_addVirtualDiskParent((virtualdiskhandle?.value ?: 0L).toString(), (parentpath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ApplySnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_applySnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_attachVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk((virtualdiskhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_compactVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_completeForkVirtualDisk((virtualdiskhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_createVirtualDisk((virtualstoragetype?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), virtualdiskaccessmask, (securitydescriptor?.value ?: 0L).toString(), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_detachVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, providerspecificflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: COpaquePointer?, items: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (numberofitems?.value ?: 0L).toString(), (items?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_expandVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_forkVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: COpaquePointer?, pathsbuffer: Pwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths((pathsbuffersizeinbytes?.value ?: 0L).toString(), (pathsbuffer?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getStorageDependencyInformation((objecthandle?.value ?: 0L).toString(), flags, storagedependencyinfosize.toInt(), (storagedependencyinfo?.value ?: 0L).toString(), (sizeused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: COpaquePointer?, virtualdiskinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getVirtualDiskInformation((virtualdiskhandle?.value ?: 0L).toString(), (virtualdiskinfosize?.value ?: 0L).toString(), (virtualdiskinfo?.value ?: 0L).toString(), (sizeused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: COpaquePointer?, metadata: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString(), (metadatasize?.value ?: 0L).toString(), (metadata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: COpaquePointer?, progress: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress((virtualdiskhandle?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString(), (progress?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: COpaquePointer?, diskpath: Pwstr): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath((virtualdiskhandle?.value ?: 0L).toString(), (diskpathsizeinbytes?.value ?: 0L).toString(), (diskpath?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_mergeVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_mirrorVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ModifyVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_modifyVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_openVirtualDisk((virtualstoragetype?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), virtualdiskaccessmask, flags, (parameters?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: COpaquePointer?, rangecount: COpaquePointer?, processedlength: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (changetrackingid?.value ?: 0L).toString(), byteoffset.toString(), bytelength.toString(), flags, (ranges?.value ?: 0L).toString(), (rangecount?.value ?: 0L).toString(), (processedlength?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: RawScsiVirtualDiskFlag, response: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags, (response?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_resizeVirtualDisk((virtualdiskhandle?.value ?: 0L).toString(), flags, (parameters?.value ?: 0L).toString(), (overlapped?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_setVirtualDiskInformation((virtualdiskhandle?.value ?: 0L).toString(), (virtualdiskinfo?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: UInt, metadata: COpaquePointer?): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L).toString(), (item?.value ?: 0L).toString(), metadatasize.toInt(), (metadata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: TakeSnapshotVhdsetFlag): Win32Error =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet((virtualdiskhandle?.value ?: 0L).toString(), (parameters?.value ?: 0L).toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
