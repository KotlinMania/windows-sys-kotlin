package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun AddVirtualDiskParent(virtualdiskhandle: Foundation.HANDLE, parentpath: PCWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "AddVirtualDiskParent", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parentpath))
    return Foundation.WIN32_ERROR()
}

public fun ApplySnapshotVhdSet(virtualdiskhandle: Foundation.HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "ApplySnapshotVhdSet", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parameters, flags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun AttachVirtualDisk(virtualdiskhandle: Foundation.HANDLE, securitydescriptor: Security.PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "AttachVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), Win32DynamicFfi.objectSlot(securitydescriptor), flags.toLong(), providerspecificflags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun BreakMirrorVirtualDisk(virtualdiskhandle: Foundation.HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "BreakMirrorVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle)))
    return Foundation.WIN32_ERROR()
}

public fun CompactVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "CompactVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun CompleteForkVirtualDisk(virtualdiskhandle: Foundation.HANDLE): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "CompleteForkVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle)))
    return Foundation.WIN32_ERROR()
}

public fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: Security.PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "CreateVirtualDisk", longArrayOf(virtualstoragetype, path, virtualdiskaccessmask.toLong(), Win32DynamicFfi.objectSlot(securitydescriptor), flags.toLong(), providerspecificflags.toLong(), parameters, overlapped, handle))
    return Foundation.WIN32_ERROR()
}

public fun DeleteSnapshotVhdSet(virtualdiskhandle: Foundation.HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "DeleteSnapshotVhdSet", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parameters, flags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun DeleteVirtualDiskMetadata(virtualdiskhandle: Foundation.HANDLE, item: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "DeleteVirtualDiskMetadata", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), item))
    return Foundation.WIN32_ERROR()
}

public fun DetachVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "DetachVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), providerspecificflags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun EnumerateVirtualDiskMetadata(virtualdiskhandle: Foundation.HANDLE, numberofitems: Long, items: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "EnumerateVirtualDiskMetadata", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), numberofitems, items))
    return Foundation.WIN32_ERROR()
}

public fun ExpandVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "ExpandVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun ForkVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "ForkVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetAllAttachedVirtualDiskPhysicalPaths", longArrayOf(pathsbuffersizeinbytes, pathsbuffer))
    return Foundation.WIN32_ERROR()
}

public fun GetStorageDependencyInformation(objecthandle: Foundation.HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetStorageDependencyInformation", longArrayOf(Win32DynamicFfi.objectSlot(objecthandle), flags.toLong(), storagedependencyinfosize.toLong(), storagedependencyinfo, sizeused))
    return Foundation.WIN32_ERROR()
}

public fun GetVirtualDiskInformation(virtualdiskhandle: Foundation.HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskInformation", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), virtualdiskinfosize, virtualdiskinfo, sizeused))
    return Foundation.WIN32_ERROR()
}

public fun GetVirtualDiskMetadata(virtualdiskhandle: Foundation.HANDLE, item: Long, metadatasize: Long, metadata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskMetadata", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), item, metadatasize, metadata))
    return Foundation.WIN32_ERROR()
}

public fun GetVirtualDiskOperationProgress(virtualdiskhandle: Foundation.HANDLE, overlapped: Long, progress: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskOperationProgress", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), overlapped, progress))
    return Foundation.WIN32_ERROR()
}

public fun GetVirtualDiskPhysicalPath(virtualdiskhandle: Foundation.HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "GetVirtualDiskPhysicalPath", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), diskpathsizeinbytes, diskpath))
    return Foundation.WIN32_ERROR()
}

public fun MergeVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "MergeVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun MirrorVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "MirrorVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun ModifyVhdSet(virtualdiskhandle: Foundation.HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "ModifyVhdSet", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parameters, flags.toLong()))
    return Foundation.WIN32_ERROR()
}

public fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "OpenVirtualDisk", longArrayOf(virtualstoragetype, path, virtualdiskaccessmask.toLong(), flags.toLong(), parameters, handle))
    return Foundation.WIN32_ERROR()
}

public fun QueryChangesVirtualDisk(virtualdiskhandle: Foundation.HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "QueryChangesVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), changetrackingid, byteoffset.toLong(), bytelength.toLong(), flags.toLong(), ranges, rangecount, processedlength))
    return Foundation.WIN32_ERROR()
}

public fun RawSCSIVirtualDisk(virtualdiskhandle: Foundation.HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "RawSCSIVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parameters, flags.toLong(), response))
    return Foundation.WIN32_ERROR()
}

public fun ResizeVirtualDisk(virtualdiskhandle: Foundation.HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "ResizeVirtualDisk", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), flags.toLong(), parameters, overlapped))
    return Foundation.WIN32_ERROR()
}

public fun SetVirtualDiskInformation(virtualdiskhandle: Foundation.HANDLE, virtualdiskinfo: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "SetVirtualDiskInformation", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), virtualdiskinfo))
    return Foundation.WIN32_ERROR()
}

public fun SetVirtualDiskMetadata(virtualdiskhandle: Foundation.HANDLE, item: Long, metadatasize: UInt, metadata: Long): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "SetVirtualDiskMetadata", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), item, metadatasize.toLong(), metadata))
    return Foundation.WIN32_ERROR()
}

public fun TakeSnapshotVhdSet(virtualdiskhandle: Foundation.HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): Foundation.WIN32_ERROR {
    Win32DynamicFfi.invoke("virtdisk.dll", "TakeSnapshotVhdSet", longArrayOf(Win32DynamicFfi.objectSlot(virtualdiskhandle), parameters, flags.toLong()))
    return Foundation.WIN32_ERROR()
}
