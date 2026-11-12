@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdAddVirtualDiskParent
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdApplySnapshotVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdAttachVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdCompactVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdCreateVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdDetachVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdExpandVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdForkVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetStorageDependencyInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetVirtualDiskInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdMergeVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdMirrorVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdModifyVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdOpenVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdResizeVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdSetVirtualDiskInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    windowssysWindowsWin32StorageVhdAddVirtualDiskParent(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parentpath.rawAddress.toCPointer<ByteVar>())

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ApplySnapshotVhdsetParameters>, flags: ApplySnapshotVhdsetFlag): Win32Error =
    windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parameters.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<AttachVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdAttachVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), securitydescriptor.rawAddress.toCPointer<ByteVar>(), flags, providerspecificflags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>())

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr<CompactVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdCompactVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>())

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<CreateVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>, handle: MutPtr<Handle>): Win32Error =
    windowssysWindowsWin32StorageVhdCreateVirtualDisk(virtualstoragetype.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), virtualdiskaccessmask, securitydescriptor.rawAddress.toCPointer<ByteVar>(), flags, providerspecificflags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<DeleteSnapshotVhdsetParameters>, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parameters.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>): Win32Error =
    windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), item.rawAddress.toCPointer<ByteVar>())

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    windowssysWindowsWin32StorageVhdDetachVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, providerspecificflags)

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr<UInt>, items: MutPtr<Guid>): Win32Error =
    windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), numberofitems.rawAddress.toCPointer<ByteVar>(), items.rawAddress.toCPointer<ByteVar>())

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr<ExpandVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdExpandVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr<ForkVirtualDiskParameters>, overlapped: MutPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdForkVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr<UInt>, pathsbuffer: Pwstr): Win32Error =
    windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.rawAddress.toCPointer<ByteVar>(), pathsbuffer.rawAddress.toCPointer<ByteVar>())

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr<StorageDependencyInfo>, sizeused: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(objecthandle.rawAddress.toCPointer<ByteVar>(), flags, storagedependencyinfosize, storagedependencyinfo.rawAddress.toCPointer<ByteVar>(), sizeused.rawAddress.toCPointer<ByteVar>())

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr<UInt>, virtualdiskinfo: MutPtr<GetVirtualDiskInfo>, sizeused: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), virtualdiskinfosize.rawAddress.toCPointer<ByteVar>(), virtualdiskinfo.rawAddress.toCPointer<ByteVar>(), sizeused.rawAddress.toCPointer<ByteVar>())

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: MutPtr<UInt>, metadata: MutPtr<CVoid>): Win32Error =
    windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), item.rawAddress.toCPointer<ByteVar>(), metadatasize.rawAddress.toCPointer<ByteVar>(), metadata.rawAddress.toCPointer<ByteVar>())

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr<Overlapped>, progress: MutPtr<VirtualDiskProgress>): Win32Error =
    windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>(), progress.rawAddress.toCPointer<ByteVar>())

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr<UInt>, diskpath: Pwstr): Win32Error =
    windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), diskpathsizeinbytes.rawAddress.toCPointer<ByteVar>(), diskpath.rawAddress.toCPointer<ByteVar>())

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr<MergeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdMergeVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr<MirrorVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdMirrorVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ModifyVhdsetParameters>, flags: ModifyVhdsetFlag): Win32Error =
    windowssysWindowsWin32StorageVhdModifyVhdSet(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parameters.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr<OpenVirtualDiskParameters>, handle: MutPtr<Handle>): Win32Error =
    windowssysWindowsWin32StorageVhdOpenVirtualDisk(virtualstoragetype.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>(), virtualdiskaccessmask, flags, parameters.rawAddress.toCPointer<ByteVar>(), handle.rawAddress.toCPointer<ByteVar>())

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr<QueryChangesVirtualDiskRange>, rangecount: MutPtr<UInt>, processedlength: MutPtr<ULong>): Win32Error =
    windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), changetrackingid.rawAddress.toCPointer<ByteVar>(), byteoffset, bytelength, flags, ranges.rawAddress.toCPointer<ByteVar>(), rangecount.rawAddress.toCPointer<ByteVar>(), processedlength.rawAddress.toCPointer<ByteVar>())

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr<RawScsiVirtualDiskParameters>, flags: RawScsiVirtualDiskFlag, response: MutPtr<RawScsiVirtualDiskResponse>): Win32Error =
    windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parameters.rawAddress.toCPointer<ByteVar>(), flags, response.rawAddress.toCPointer<ByteVar>())

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr<ResizeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    windowssysWindowsWin32StorageVhdResizeVirtualDisk(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), flags, parameters.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr<SetVirtualDiskInfo>): Win32Error =
    windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), virtualdiskinfo.rawAddress.toCPointer<ByteVar>())

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: UInt, metadata: ConstPtr<CVoid>): Win32Error =
    windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), item.rawAddress.toCPointer<ByteVar>(), metadatasize, metadata.rawAddress.toCPointer<ByteVar>())

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<TakeSnapshotVhdsetParameters>, flags: TakeSnapshotVhdsetFlag): Win32Error =
    windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(virtualdiskhandle.rawAddress.toCPointer<ByteVar>(), parameters.rawAddress.toCPointer<ByteVar>(), flags)
