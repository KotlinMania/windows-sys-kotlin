@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private val windowsWin32StorageVhdNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdAddVirtualDiskParent(virtualdiskhandle.rawAddress.toString(), parentpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ApplySnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdAttachVirtualDisk(virtualdiskhandle.rawAddress.toString(), securitydescriptor.rawAddress.toString(), flags, providerspecificflags.toInt(), parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(virtualdiskhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdCompactVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(virtualdiskhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr, handle: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdCreateVirtualDisk(virtualstoragetype.rawAddress.toString(), path.rawAddress.toString(), virtualdiskaccessmask, securitydescriptor.rawAddress.toString(), flags, providerspecificflags.toInt(), parameters.rawAddress.toString(), overlapped.rawAddress.toString(), handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdDetachVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, providerspecificflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr, items: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), numberofitems.rawAddress.toString(), items.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdExpandVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr, overlapped: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdForkVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr, pathsbuffer: Pwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.rawAddress.toString(), pathsbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr, sizeused: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(objecthandle.rawAddress.toString(), flags, storagedependencyinfosize.toInt(), storagedependencyinfo.rawAddress.toString(), sizeused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr, virtualdiskinfo: MutPtr, sizeused: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(virtualdiskhandle.rawAddress.toString(), virtualdiskinfosize.rawAddress.toString(), virtualdiskinfo.rawAddress.toString(), sizeused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: MutPtr, metadata: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString(), metadatasize.rawAddress.toString(), metadata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr, progress: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(virtualdiskhandle.rawAddress.toString(), overlapped.rawAddress.toString(), progress.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr, diskpath: Pwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(virtualdiskhandle.rawAddress.toString(), diskpathsizeinbytes.rawAddress.toString(), diskpath.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdMergeVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdMirrorVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ModifyVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdModifyVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr, handle: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdOpenVirtualDisk(virtualstoragetype.rawAddress.toString(), path.rawAddress.toString(), virtualdiskaccessmask, flags, parameters.rawAddress.toString(), handle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr, rangecount: MutPtr, processedlength: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(virtualdiskhandle.rawAddress.toString(), changetrackingid.rawAddress.toString(), byteoffset.toString(), bytelength.toString(), flags, ranges.rawAddress.toString(), rangecount.rawAddress.toString(), processedlength.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr, flags: RawScsiVirtualDiskFlag, response: MutPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags, response.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdResizeVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(virtualdiskhandle.rawAddress.toString(), virtualdiskinfo.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: UInt, metadata: ConstPtr): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString(), metadatasize.toInt(), metadata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: TakeSnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAddon != null) (windowsWin32StorageVhdNapiAddon.windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
