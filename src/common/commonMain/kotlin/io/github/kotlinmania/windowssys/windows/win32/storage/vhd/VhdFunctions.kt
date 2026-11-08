package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

public fun AddVirtualDiskParent(virtualdiskhandle: HANDLE, parentpath: PCWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "AddVirtualDiskParent", longArrayOf(virtualdiskhandle, parentpath)).toUInt()
}

public fun ApplySnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "ApplySnapshotVhdSet", longArrayOf(virtualdiskhandle, parameters, flags.toLong())).toUInt()
}

public fun AttachVirtualDisk(virtualdiskhandle: HANDLE, securitydescriptor: PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "AttachVirtualDisk", longArrayOf(virtualdiskhandle, securitydescriptor, flags.toLong(), providerspecificflags.toLong(), parameters, overlapped)).toUInt()
}

public fun BreakMirrorVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "BreakMirrorVirtualDisk", longArrayOf(virtualdiskhandle)).toUInt()
}

public fun CompactVirtualDisk(virtualdiskhandle: HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "CompactVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun CompleteForkVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "CompleteForkVirtualDisk", longArrayOf(virtualdiskhandle)).toUInt()
}

public fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "CreateVirtualDisk", longArrayOf(virtualstoragetype, path, virtualdiskaccessmask.toLong(), securitydescriptor, flags.toLong(), providerspecificflags.toLong(), parameters, overlapped, handle)).toUInt()
}

public fun DeleteSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "DeleteSnapshotVhdSet", longArrayOf(virtualdiskhandle, parameters, flags.toLong())).toUInt()
}

public fun DeleteVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "DeleteVirtualDiskMetadata", longArrayOf(virtualdiskhandle, item)).toUInt()
}

public fun DetachVirtualDisk(virtualdiskhandle: HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "DetachVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), providerspecificflags.toLong())).toUInt()
}

public fun EnumerateVirtualDiskMetadata(virtualdiskhandle: HANDLE, numberofitems: Long, items: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "EnumerateVirtualDiskMetadata", longArrayOf(virtualdiskhandle, numberofitems, items)).toUInt()
}

public fun ExpandVirtualDisk(virtualdiskhandle: HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "ExpandVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun ForkVirtualDisk(virtualdiskhandle: HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "ForkVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetAllAttachedVirtualDiskPhysicalPaths", longArrayOf(pathsbuffersizeinbytes, pathsbuffer)).toUInt()
}

public fun GetStorageDependencyInformation(objecthandle: HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetStorageDependencyInformation", longArrayOf(objecthandle, flags.toLong(), storagedependencyinfosize.toLong(), storagedependencyinfo, sizeused)).toUInt()
}

public fun GetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskInformation", longArrayOf(virtualdiskhandle, virtualdiskinfosize, virtualdiskinfo, sizeused)).toUInt()
}

public fun GetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: Long, metadata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskMetadata", longArrayOf(virtualdiskhandle, item, metadatasize, metadata)).toUInt()
}

public fun GetVirtualDiskOperationProgress(virtualdiskhandle: HANDLE, overlapped: Long, progress: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskOperationProgress", longArrayOf(virtualdiskhandle, overlapped, progress)).toUInt()
}

public fun GetVirtualDiskPhysicalPath(virtualdiskhandle: HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskPhysicalPath", longArrayOf(virtualdiskhandle, diskpathsizeinbytes, diskpath)).toUInt()
}

public fun MergeVirtualDisk(virtualdiskhandle: HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "MergeVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun MirrorVirtualDisk(virtualdiskhandle: HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "MirrorVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun ModifyVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "ModifyVhdSet", longArrayOf(virtualdiskhandle, parameters, flags.toLong())).toUInt()
}

public fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "OpenVirtualDisk", longArrayOf(virtualstoragetype, path, virtualdiskaccessmask.toLong(), flags.toLong(), parameters, handle)).toUInt()
}

public fun QueryChangesVirtualDisk(virtualdiskhandle: HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "QueryChangesVirtualDisk", longArrayOf(virtualdiskhandle, changetrackingid, byteoffset.toLong(), bytelength.toLong(), flags.toLong(), ranges, rangecount, processedlength)).toUInt()
}

public fun RawSCSIVirtualDisk(virtualdiskhandle: HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "RawSCSIVirtualDisk", longArrayOf(virtualdiskhandle, parameters, flags.toLong(), response)).toUInt()
}

public fun ResizeVirtualDisk(virtualdiskhandle: HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "ResizeVirtualDisk", longArrayOf(virtualdiskhandle, flags.toLong(), parameters, overlapped)).toUInt()
}

public fun SetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfo: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "SetVirtualDiskInformation", longArrayOf(virtualdiskhandle, virtualdiskinfo)).toUInt()
}

public fun SetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: UInt, metadata: Long): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "SetVirtualDiskMetadata", longArrayOf(virtualdiskhandle, item, metadatasize.toLong(), metadata)).toUInt()
}

public fun TakeSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR {
    return Win32DynamicFfi.invoke("virtdisk.dll", "TakeSnapshotVhdSet", longArrayOf(virtualdiskhandle, parameters, flags.toLong())).toUInt()
}
