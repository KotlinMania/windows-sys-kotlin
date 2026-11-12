@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32StorageVhdJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdAddVirtualDiskParent(virtualdiskhandle: Long, parentpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdAttachVirtualDisk(virtualdiskhandle: Long, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdCompactVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdCreateVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(virtualdiskhandle: Long, item: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdDetachVirtualDisk(virtualdiskhandle: Long, flags: Int, providerspecificflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(virtualdiskhandle: Long, numberofitems: Long, items: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdExpandVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdForkVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(objecthandle: Long, flags: Int, storagedependencyinfosize: Int, storagedependencyinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Long, metadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(virtualdiskhandle: Long, overlapped: Long, progress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(virtualdiskhandle: Long, diskpathsizeinbytes: Long, diskpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdMergeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdMirrorVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdModifyVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdOpenVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, flags: Int, parameters: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(virtualdiskhandle: Long, changetrackingid: Long, byteoffset: Long, bytelength: Long, flags: Int, ranges: Long, rangecount: Long, processedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(virtualdiskhandle: Long, parameters: Long, flags: Int, response: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdResizeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Int, metadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int
}

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdAddVirtualDiskParent(virtualdiskhandle.rawAddress, parentpath.rawAddress).toUInt()

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ApplySnapshotVhdsetParameters>, flags: ApplySnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(virtualdiskhandle.rawAddress, parameters.rawAddress, flags).toUInt()

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<AttachVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdAttachVirtualDisk(virtualdiskhandle.rawAddress, securitydescriptor.rawAddress, flags, providerspecificflags.toInt(), parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(virtualdiskhandle.rawAddress).toUInt()

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr<CompactVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdCompactVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(virtualdiskhandle.rawAddress).toUInt()

public actual fun createVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr<CreateVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>, handle: MutPtr<Handle>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdCreateVirtualDisk(virtualstoragetype.rawAddress, path.rawAddress, virtualdiskaccessmask, securitydescriptor.rawAddress, flags, providerspecificflags.toInt(), parameters.rawAddress, overlapped.rawAddress, handle.rawAddress).toUInt()

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<DeleteSnapshotVhdsetParameters>, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(virtualdiskhandle.rawAddress, parameters.rawAddress, flags).toUInt()

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(virtualdiskhandle.rawAddress, item.rawAddress).toUInt()

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdDetachVirtualDisk(virtualdiskhandle.rawAddress, flags, providerspecificflags.toInt()).toUInt()

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr<UInt>, items: MutPtr<Guid>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(virtualdiskhandle.rawAddress, numberofitems.rawAddress, items.rawAddress).toUInt()

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr<ExpandVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdExpandVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr<ForkVirtualDiskParameters>, overlapped: MutPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdForkVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr<UInt>, pathsbuffer: Pwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.rawAddress, pathsbuffer.rawAddress).toUInt()

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr<StorageDependencyInfo>, sizeused: MutPtr<UInt>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(objecthandle.rawAddress, flags, storagedependencyinfosize.toInt(), storagedependencyinfo.rawAddress, sizeused.rawAddress).toUInt()

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr<UInt>, virtualdiskinfo: MutPtr<GetVirtualDiskInfo>, sizeused: MutPtr<UInt>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(virtualdiskhandle.rawAddress, virtualdiskinfosize.rawAddress, virtualdiskinfo.rawAddress, sizeused.rawAddress).toUInt()

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: MutPtr<UInt>, metadata: MutPtr<CVoid>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(virtualdiskhandle.rawAddress, item.rawAddress, metadatasize.rawAddress, metadata.rawAddress).toUInt()

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr<Overlapped>, progress: MutPtr<VirtualDiskProgress>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(virtualdiskhandle.rawAddress, overlapped.rawAddress, progress.rawAddress).toUInt()

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr<UInt>, diskpath: Pwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(virtualdiskhandle.rawAddress, diskpathsizeinbytes.rawAddress, diskpath.rawAddress).toUInt()

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr<MergeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdMergeVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr<MirrorVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdMirrorVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<ModifyVhdsetParameters>, flags: ModifyVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdModifyVhdSet(virtualdiskhandle.rawAddress, parameters.rawAddress, flags).toUInt()

public actual fun openVirtualDisk(virtualstoragetype: ConstPtr<VirtualStorageType>, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr<OpenVirtualDiskParameters>, handle: MutPtr<Handle>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdOpenVirtualDisk(virtualstoragetype.rawAddress, path.rawAddress, virtualdiskaccessmask, flags, parameters.rawAddress, handle.rawAddress).toUInt()

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr<QueryChangesVirtualDiskRange>, rangecount: MutPtr<UInt>, processedlength: MutPtr<ULong>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(virtualdiskhandle.rawAddress, changetrackingid.rawAddress, byteoffset.toLong(), bytelength.toLong(), flags, ranges.rawAddress, rangecount.rawAddress, processedlength.rawAddress).toUInt()

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr<RawScsiVirtualDiskParameters>, flags: RawScsiVirtualDiskFlag, response: MutPtr<RawScsiVirtualDiskResponse>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(virtualdiskhandle.rawAddress, parameters.rawAddress, flags, response.rawAddress).toUInt()

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr<ResizeVirtualDiskParameters>, overlapped: ConstPtr<Overlapped>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdResizeVirtualDisk(virtualdiskhandle.rawAddress, flags, parameters.rawAddress, overlapped.rawAddress).toUInt()

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr<SetVirtualDiskInfo>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(virtualdiskhandle.rawAddress, virtualdiskinfo.rawAddress).toUInt()

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr<Guid>, metadatasize: UInt, metadata: ConstPtr<CVoid>): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(virtualdiskhandle.rawAddress, item.rawAddress, metadatasize.toInt(), metadata.rawAddress).toUInt()

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr<TakeSnapshotVhdsetParameters>, flags: TakeSnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(virtualdiskhandle.rawAddress, parameters.rawAddress, flags).toUInt()
