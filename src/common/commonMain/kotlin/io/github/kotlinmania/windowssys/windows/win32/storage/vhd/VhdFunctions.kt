package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error

public expect fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ApplySnapshotVhdsetFlag): Win32Error

public expect fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error

public expect fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error

public expect fun createVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: ConstPtr, overlapped: ConstPtr, handle: MutPtr): Win32Error

public expect fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: DeleteSnapshotVhdsetFlag): Win32Error

public expect fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr): Win32Error

public expect fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error

public expect fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: MutPtr, items: MutPtr): Win32Error

public expect fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: ConstPtr, overlapped: MutPtr): Win32Error

public expect fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: MutPtr, pathsbuffer: Pwstr): Win32Error

public expect fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: MutPtr, sizeused: MutPtr): Win32Error

public expect fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: MutPtr, virtualdiskinfo: MutPtr, sizeused: MutPtr): Win32Error

public expect fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: MutPtr, metadata: MutPtr): Win32Error

public expect fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: ConstPtr, progress: MutPtr): Win32Error

public expect fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: MutPtr, diskpath: Pwstr): Win32Error

public expect fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun modifyVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: ModifyVhdsetFlag): Win32Error

public expect fun openVirtualDisk(virtualstoragetype: ConstPtr, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: ConstPtr, handle: MutPtr): Win32Error

public expect fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: MutPtr, rangecount: MutPtr, processedlength: MutPtr): Win32Error

public expect fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: ConstPtr, flags: RawScsiVirtualDiskFlag, response: MutPtr): Win32Error

public expect fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: ConstPtr, overlapped: ConstPtr): Win32Error

public expect fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: ConstPtr): Win32Error

public expect fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: ConstPtr, metadatasize: UInt, metadata: ConstPtr): Win32Error

public expect fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: ConstPtr, flags: TakeSnapshotVhdsetFlag): Win32Error
