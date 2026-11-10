package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public expect fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error

public expect fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ApplySnapshotVhdsetFlag): Win32Error

public expect fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error

public expect fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error

public expect fun createVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?, handle: COpaquePointer?): Win32Error

public expect fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: DeleteSnapshotVhdsetFlag): Win32Error

public expect fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?): Win32Error

public expect fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error

public expect fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: COpaquePointer?, items: COpaquePointer?): Win32Error

public expect fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: COpaquePointer?, pathsbuffer: Pwstr): Win32Error

public expect fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error

public expect fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: COpaquePointer?, virtualdiskinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error

public expect fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: COpaquePointer?, metadata: COpaquePointer?): Win32Error

public expect fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: COpaquePointer?, progress: COpaquePointer?): Win32Error

public expect fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: COpaquePointer?, diskpath: Pwstr): Win32Error

public expect fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun modifyVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ModifyVhdsetFlag): Win32Error

public expect fun openVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: COpaquePointer?, handle: COpaquePointer?): Win32Error

public expect fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: COpaquePointer?, rangecount: COpaquePointer?, processedlength: COpaquePointer?): Win32Error

public expect fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: RawScsiVirtualDiskFlag, response: COpaquePointer?): Win32Error

public expect fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error

public expect fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: COpaquePointer?): Win32Error

public expect fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: UInt, metadata: COpaquePointer?): Win32Error

public expect fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: TakeSnapshotVhdsetFlag): Win32Error
