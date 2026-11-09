@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private object WindowsWin32StorageVhdJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(virtualdiskhandle: Long, parentpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_AttachVirtualDisk(virtualdiskhandle: Long, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_CompactVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_CreateVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(virtualdiskhandle: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_DetachVirtualDisk(virtualdiskhandle: Long, flags: Int, providerspecificflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(virtualdiskhandle: Long, numberofitems: Long, items: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_ForkVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(objecthandle: Long, flags: Int, storagedependencyinfosize: Int, storagedependencyinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Long, metadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(virtualdiskhandle: Long, overlapped: Long, progress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(virtualdiskhandle: Long, diskpathsizeinbytes: Long, diskpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_MergeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_ModifyVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_OpenVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, flags: Int, parameters: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(virtualdiskhandle: Long, changetrackingid: Long, byteoffset: Long, bytelength: Long, flags: Int, ranges: Long, rangecount: Long, processedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(virtualdiskhandle: Long, parameters: Long, flags: Int, response: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Int, metadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int
}

public actual fun AddVirtualDiskParent(virtualdiskhandle: HANDLE, parentpath: PCWSTR): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(virtualdiskhandle, parentpath).toUInt()

public actual fun ApplySnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(virtualdiskhandle, parameters, flags).toUInt()

public actual fun AttachVirtualDisk(virtualdiskhandle: HANDLE, securitydescriptor: PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_AttachVirtualDisk(virtualdiskhandle, securitydescriptor, flags, providerspecificflags.toInt(), parameters, overlapped).toUInt()

public actual fun BreakMirrorVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(virtualdiskhandle).toUInt()

public actual fun CompactVirtualDisk(virtualdiskhandle: HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_CompactVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun CompleteForkVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(virtualdiskhandle).toUInt()

public actual fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_CreateVirtualDisk(virtualstoragetype, path, virtualdiskaccessmask, securitydescriptor, flags, providerspecificflags.toInt(), parameters, overlapped, handle).toUInt()

public actual fun DeleteSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(virtualdiskhandle, parameters, flags).toUInt()

public actual fun DeleteVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(virtualdiskhandle, item).toUInt()

public actual fun DetachVirtualDisk(virtualdiskhandle: HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_DetachVirtualDisk(virtualdiskhandle, flags, providerspecificflags.toInt()).toUInt()

public actual fun EnumerateVirtualDiskMetadata(virtualdiskhandle: HANDLE, numberofitems: Long, items: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(virtualdiskhandle, numberofitems, items).toUInt()

public actual fun ExpandVirtualDisk(virtualdiskhandle: HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun ForkVirtualDisk(virtualdiskhandle: HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_ForkVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes, pathsbuffer).toUInt()

public actual fun GetStorageDependencyInformation(objecthandle: HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(objecthandle, flags, storagedependencyinfosize.toInt(), storagedependencyinfo, sizeused).toUInt()

public actual fun GetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(virtualdiskhandle, virtualdiskinfosize, virtualdiskinfo, sizeused).toUInt()

public actual fun GetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: Long, metadata: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(virtualdiskhandle, item, metadatasize, metadata).toUInt()

public actual fun GetVirtualDiskOperationProgress(virtualdiskhandle: HANDLE, overlapped: Long, progress: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(virtualdiskhandle, overlapped, progress).toUInt()

public actual fun GetVirtualDiskPhysicalPath(virtualdiskhandle: HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(virtualdiskhandle, diskpathsizeinbytes, diskpath).toUInt()

public actual fun MergeVirtualDisk(virtualdiskhandle: HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_MergeVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun MirrorVirtualDisk(virtualdiskhandle: HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun ModifyVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_ModifyVhdSet(virtualdiskhandle, parameters, flags).toUInt()

public actual fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_OpenVirtualDisk(virtualstoragetype, path, virtualdiskaccessmask, flags, parameters, handle).toUInt()

public actual fun QueryChangesVirtualDisk(virtualdiskhandle: HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(virtualdiskhandle, changetrackingid, byteoffset.toLong(), bytelength.toLong(), flags, ranges, rangecount, processedlength).toUInt()

public actual fun RawSCSIVirtualDisk(virtualdiskhandle: HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(virtualdiskhandle, parameters, flags, response).toUInt()

public actual fun ResizeVirtualDisk(virtualdiskhandle: HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(virtualdiskhandle, flags, parameters, overlapped).toUInt()

public actual fun SetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfo: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(virtualdiskhandle, virtualdiskinfo).toUInt()

public actual fun SetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: UInt, metadata: Long): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(virtualdiskhandle, item, metadatasize.toInt(), metadata).toUInt()

public actual fun TakeSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(virtualdiskhandle, parameters, flags).toUInt()
