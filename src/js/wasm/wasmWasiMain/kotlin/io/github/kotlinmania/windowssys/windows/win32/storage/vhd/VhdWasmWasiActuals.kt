@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdAddVirtualDiskParent")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ApplySnapshotVhdsetParameters>, flags: ApplySnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdApplySnapshotVhdSet")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<AttachVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdAttachVirtualDisk")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr<CompactVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCompactVirtualDisk")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk")

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<CreateVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>, handle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCreateVirtualDisk")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<DeleteSnapshotVhdsetParameters>, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDetachVirtualDisk")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr<UInt>, items: MutPtr<Guid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr<ExpandVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdExpandVirtualDisk")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr<ForkVirtualDiskParameters>, overlapped: MutPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdForkVirtualDisk")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr<UInt>, pathsbuffer: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr<StorageDependencyInfo>, sizeused: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetStorageDependencyInformation")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr<UInt>, virtualdiskinfo: MutPtr<GetVirtualDiskInfo>, sizeused: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskInformation")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: MutPtr<UInt>, metadata: MutPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr<Overlapped>, progress: MutPtr<VirtualDiskProgress>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr<UInt>, diskpath: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr<MergeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdMergeVirtualDisk")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr<MirrorVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdMirrorVirtualDisk")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ModifyVhdsetParameters>, flags: ModifyVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdModifyVhdSet")

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr<OpenVirtualDiskParameters>, handle: MutPtr<Handle>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdOpenVirtualDisk")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr<QueryChangesVirtualDiskRange>, rangecount: MutPtr<UInt>, processedlength: MutPtr<ULong>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr<RawScsiVirtualDiskParameters>, flags: RawScsiVirtualDiskFlag, response: MutPtr<RawScsiVirtualDiskResponse>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr<ResizeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdResizeVirtualDisk")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr<SetVirtualDiskInfo>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdSetVirtualDiskInformation")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: UInt, metadata: ConstPtr<CVoid>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<TakeSnapshotVhdsetParameters>, flags: TakeSnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet")
