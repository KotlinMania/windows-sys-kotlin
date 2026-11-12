@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageVhdNapiAddon(): Boolean

private val windowsWin32StorageVhdNapiAvailable: Boolean = initWindowsWin32StorageVhdNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdAddVirtualDiskParent(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageVhdAddVirtualDiskParent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdApplySnapshotVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdAttachVirtualDisk(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageVhdAttachVirtualDisk(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(p0)")
private external fun wasmWindowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdCompactVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdCompactVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(p0)")
private external fun wasmWindowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdCreateVirtualDisk(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32StorageVhdCreateVirtualDisk(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdDetachVirtualDisk(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdDetachVirtualDisk(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdExpandVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdExpandVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdForkVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdForkVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetStorageDependencyInformation(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdMergeVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdMergeVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdMirrorVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdMirrorVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdModifyVhdSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdModifyVhdSet(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdOpenVirtualDisk(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageVhdOpenVirtualDisk(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdResizeVirtualDisk(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdResizeVirtualDisk(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageVhdSetVirtualDiskInformation(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(p0: String, p1: String, p2: Int): Int

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdAddVirtualDiskParent(virtualdiskhandle.rawAddress.toString(), parentpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ApplySnapshotVhdsetParameters>, flags: ApplySnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdApplySnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<AttachVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdAttachVirtualDisk(virtualdiskhandle.rawAddress.toString(), securitydescriptor.rawAddress.toString(), flags, providerspecificflags.toInt(), parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(virtualdiskhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr<CompactVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdCompactVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(virtualdiskhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<CreateVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>, handle: MutPtr<Handle>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdCreateVirtualDisk(virtualstoragetype.rawAddress.toString(), path.rawAddress.toString(), virtualdiskaccessmask, securitydescriptor.rawAddress.toString(), flags, providerspecificflags.toInt(), parameters.rawAddress.toString(), overlapped.rawAddress.toString(), handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<DeleteSnapshotVhdsetParameters>, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdDetachVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, providerspecificflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr<UInt>, items: MutPtr<Guid>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), numberofitems.rawAddress.toString(), items.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr<ExpandVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdExpandVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr<ForkVirtualDiskParameters>, overlapped: MutPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdForkVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr<UInt>, pathsbuffer: Pwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.rawAddress.toString(), pathsbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr<StorageDependencyInfo>, sizeused: MutPtr<UInt>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetStorageDependencyInformation(objecthandle.rawAddress.toString(), flags, storagedependencyinfosize.toInt(), storagedependencyinfo.rawAddress.toString(), sizeused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr<UInt>, virtualdiskinfo: MutPtr<GetVirtualDiskInfo>, sizeused: MutPtr<UInt>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskInformation(virtualdiskhandle.rawAddress.toString(), virtualdiskinfosize.rawAddress.toString(), virtualdiskinfo.rawAddress.toString(), sizeused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: MutPtr<UInt>, metadata: MutPtr<CVoid>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString(), metadatasize.rawAddress.toString(), metadata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr<Overlapped>, progress: MutPtr<VirtualDiskProgress>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(virtualdiskhandle.rawAddress.toString(), overlapped.rawAddress.toString(), progress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr<UInt>, diskpath: Pwstr): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(virtualdiskhandle.rawAddress.toString(), diskpathsizeinbytes.rawAddress.toString(), diskpath.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr<MergeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdMergeVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr<MirrorVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdMirrorVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ModifyVhdsetParameters>, flags: ModifyVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdModifyVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr<OpenVirtualDiskParameters>, handle: MutPtr<Handle>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdOpenVirtualDisk(virtualstoragetype.rawAddress.toString(), path.rawAddress.toString(), virtualdiskaccessmask, flags, parameters.rawAddress.toString(), handle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr<QueryChangesVirtualDiskRange>, rangecount: MutPtr<UInt>, processedlength: MutPtr<ULong>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(virtualdiskhandle.rawAddress.toString(), changetrackingid.rawAddress.toString(), byteoffset.toString(), bytelength.toString(), flags, ranges.rawAddress.toString(), rangecount.rawAddress.toString(), processedlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr<RawScsiVirtualDiskParameters>, flags: RawScsiVirtualDiskFlag, response: MutPtr<RawScsiVirtualDiskResponse>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags, response.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr<ResizeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdResizeVirtualDisk(virtualdiskhandle.rawAddress.toString(), flags, parameters.rawAddress.toString(), overlapped.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr<SetVirtualDiskInfo>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdSetVirtualDiskInformation(virtualdiskhandle.rawAddress.toString(), virtualdiskinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: UInt, metadata: ConstPtr<CVoid>): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toString(), item.rawAddress.toString(), metadatasize.toInt(), metadata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<TakeSnapshotVhdsetParameters>, flags: TakeSnapshotVhdsetFlag): Win32Error =
    if (windowsWin32StorageVhdNapiAvailable) wasmWindowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(virtualdiskhandle.rawAddress.toString(), parameters.rawAddress.toString(), flags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
