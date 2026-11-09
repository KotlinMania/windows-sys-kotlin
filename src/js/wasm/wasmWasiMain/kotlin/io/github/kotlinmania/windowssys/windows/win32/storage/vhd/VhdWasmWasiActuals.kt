@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public actual fun AddVirtualDiskParent(virtualdiskhandle: HANDLE, parentpath: PCWSTR): WIN32_ERROR =
    0u

public actual fun ApplySnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    0u

public actual fun AttachVirtualDisk(virtualdiskhandle: HANDLE, securitydescriptor: PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun BreakMirrorVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    0u

public actual fun CompactVirtualDisk(virtualdiskhandle: HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun CompleteForkVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    0u

public actual fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): WIN32_ERROR =
    0u

public actual fun DeleteSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    0u

public actual fun DeleteVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long): WIN32_ERROR =
    0u

public actual fun DetachVirtualDisk(virtualdiskhandle: HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): WIN32_ERROR =
    0u

public actual fun EnumerateVirtualDiskMetadata(virtualdiskhandle: HANDLE, numberofitems: Long, items: Long): WIN32_ERROR =
    0u

public actual fun ExpandVirtualDisk(virtualdiskhandle: HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun ForkVirtualDisk(virtualdiskhandle: HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): WIN32_ERROR =
    0u

public actual fun GetStorageDependencyInformation(objecthandle: HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): WIN32_ERROR =
    0u

public actual fun GetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): WIN32_ERROR =
    0u

public actual fun GetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: Long, metadata: Long): WIN32_ERROR =
    0u

public actual fun GetVirtualDiskOperationProgress(virtualdiskhandle: HANDLE, overlapped: Long, progress: Long): WIN32_ERROR =
    0u

public actual fun GetVirtualDiskPhysicalPath(virtualdiskhandle: HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): WIN32_ERROR =
    0u

public actual fun MergeVirtualDisk(virtualdiskhandle: HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun MirrorVirtualDisk(virtualdiskhandle: HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun ModifyVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): WIN32_ERROR =
    0u

public actual fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): WIN32_ERROR =
    0u

public actual fun QueryChangesVirtualDisk(virtualdiskhandle: HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): WIN32_ERROR =
    0u

public actual fun RawSCSIVirtualDisk(virtualdiskhandle: HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): WIN32_ERROR =
    0u

public actual fun ResizeVirtualDisk(virtualdiskhandle: HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    0u

public actual fun SetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfo: Long): WIN32_ERROR =
    0u

public actual fun SetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: UInt, metadata: Long): WIN32_ERROR =
    0u

public actual fun TakeSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    0u
