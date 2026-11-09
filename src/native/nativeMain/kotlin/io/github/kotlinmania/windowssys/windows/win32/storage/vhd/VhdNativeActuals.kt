@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AddVirtualDiskParent(virtualdiskhandle: HANDLE, parentpath: PCWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(virtualdiskhandle.toCPointer<ByteVar>(), parentpath.toCPointer<ByteVar>())

public actual fun ApplySnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(virtualdiskhandle.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>(), flags)

public actual fun AttachVirtualDisk(virtualdiskhandle: HANDLE, securitydescriptor: PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_AttachVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), securitydescriptor.toCPointer<ByteVar>(), flags, providerspecificflags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun BreakMirrorVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>())

public actual fun CompactVirtualDisk(virtualdiskhandle: HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_CompactVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun CompleteForkVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>())

public actual fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_CreateVirtualDisk(virtualstoragetype.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), virtualdiskaccessmask, securitydescriptor.toCPointer<ByteVar>(), flags, providerspecificflags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun DeleteSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(virtualdiskhandle.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>(), flags)

public actual fun DeleteVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(virtualdiskhandle.toCPointer<ByteVar>(), item.toCPointer<ByteVar>())

public actual fun DetachVirtualDisk(virtualdiskhandle: HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_DetachVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, providerspecificflags)

public actual fun EnumerateVirtualDiskMetadata(virtualdiskhandle: HANDLE, numberofitems: Long, items: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(virtualdiskhandle.toCPointer<ByteVar>(), numberofitems.toCPointer<ByteVar>(), items.toCPointer<ByteVar>())

public actual fun ExpandVirtualDisk(virtualdiskhandle: HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun ForkVirtualDisk(virtualdiskhandle: HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_ForkVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.toCPointer<ByteVar>(), pathsbuffer.toCPointer<ByteVar>())

public actual fun GetStorageDependencyInformation(objecthandle: HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(objecthandle.toCPointer<ByteVar>(), flags, storagedependencyinfosize, storagedependencyinfo.toCPointer<ByteVar>(), sizeused.toCPointer<ByteVar>())

public actual fun GetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(virtualdiskhandle.toCPointer<ByteVar>(), virtualdiskinfosize.toCPointer<ByteVar>(), virtualdiskinfo.toCPointer<ByteVar>(), sizeused.toCPointer<ByteVar>())

public actual fun GetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: Long, metadata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(virtualdiskhandle.toCPointer<ByteVar>(), item.toCPointer<ByteVar>(), metadatasize.toCPointer<ByteVar>(), metadata.toCPointer<ByteVar>())

public actual fun GetVirtualDiskOperationProgress(virtualdiskhandle: HANDLE, overlapped: Long, progress: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(virtualdiskhandle.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>(), progress.toCPointer<ByteVar>())

public actual fun GetVirtualDiskPhysicalPath(virtualdiskhandle: HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(virtualdiskhandle.toCPointer<ByteVar>(), diskpathsizeinbytes.toCPointer<ByteVar>(), diskpath.toCPointer<ByteVar>())

public actual fun MergeVirtualDisk(virtualdiskhandle: HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_MergeVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun MirrorVirtualDisk(virtualdiskhandle: HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun ModifyVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_ModifyVhdSet(virtualdiskhandle.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>(), flags)

public actual fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_OpenVirtualDisk(virtualstoragetype.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), virtualdiskaccessmask, flags, parameters.toCPointer<ByteVar>(), handle.toCPointer<ByteVar>())

public actual fun QueryChangesVirtualDisk(virtualdiskhandle: HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), changetrackingid.toCPointer<ByteVar>(), byteoffset, bytelength, flags, ranges.toCPointer<ByteVar>(), rangecount.toCPointer<ByteVar>(), processedlength.toCPointer<ByteVar>())

public actual fun RawSCSIVirtualDisk(virtualdiskhandle: HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>(), flags, response.toCPointer<ByteVar>())

public actual fun ResizeVirtualDisk(virtualdiskhandle: HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(virtualdiskhandle.toCPointer<ByteVar>(), flags, parameters.toCPointer<ByteVar>(), overlapped.toCPointer<ByteVar>())

public actual fun SetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfo: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(virtualdiskhandle.toCPointer<ByteVar>(), virtualdiskinfo.toCPointer<ByteVar>())

public actual fun SetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: UInt, metadata: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(virtualdiskhandle.toCPointer<ByteVar>(), item.toCPointer<ByteVar>(), metadatasize, metadata.toCPointer<ByteVar>())

public actual fun TakeSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(virtualdiskhandle.toCPointer<ByteVar>(), parameters.toCPointer<ByteVar>(), flags)
