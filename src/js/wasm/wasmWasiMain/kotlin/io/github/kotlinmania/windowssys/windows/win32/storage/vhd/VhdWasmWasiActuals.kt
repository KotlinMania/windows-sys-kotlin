@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdAddVirtualDiskParent")

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ApplySnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdApplySnapshotVhdSet")

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdAttachVirtualDisk")

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk")

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCompactVirtualDisk")

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk")

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr, handle: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdCreateVirtualDisk")

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet")

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata")

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdDetachVirtualDisk")

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr, items: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata")

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdExpandVirtualDisk")

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr, overlapped: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdForkVirtualDisk")

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr, pathsbuffer: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths")

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr, sizeused: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetStorageDependencyInformation")

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr, virtualdiskinfo: MutPtr, sizeused: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskInformation")

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: MutPtr, metadata: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata")

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr, progress: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress")

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr, diskpath: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath")

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdMergeVirtualDisk")

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdMirrorVirtualDisk")

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ModifyVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdModifyVhdSet")

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr, handle: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdOpenVirtualDisk")

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr, rangecount: MutPtr, processedlength: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk")

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr, flags: RawScsiVirtualDiskFlag, response: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk")

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdResizeVirtualDisk")

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdSetVirtualDiskInformation")

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: UInt, metadata: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata")

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: TakeSnapshotVhdsetFlag): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet")
