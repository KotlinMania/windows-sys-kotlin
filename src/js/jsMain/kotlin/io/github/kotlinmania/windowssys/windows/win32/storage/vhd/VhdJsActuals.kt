@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR

private val _windowsWin32StorageVhdNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AddVirtualDiskParent(virtualdiskhandle: HANDLE, parentpath: PCWSTR): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(virtualdiskhandle.toString(), parentpath.toString()) as Int).toUInt() else 0u

public actual fun ApplySnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: APPLY_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(virtualdiskhandle.toString(), parameters.toString(), flags) as Int).toUInt() else 0u

public actual fun AttachVirtualDisk(virtualdiskhandle: HANDLE, securitydescriptor: PSECURITY_DESCRIPTOR, flags: ATTACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_AttachVirtualDisk(virtualdiskhandle.toString(), securitydescriptor.toString(), flags, providerspecificflags.toInt(), parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun BreakMirrorVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(virtualdiskhandle.toString()) as Int).toUInt() else 0u

public actual fun CompactVirtualDisk(virtualdiskhandle: HANDLE, flags: COMPACT_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_CompactVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun CompleteForkVirtualDisk(virtualdiskhandle: HANDLE): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(virtualdiskhandle.toString()) as Int).toUInt() else 0u

public actual fun CreateVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, securitydescriptor: PSECURITY_DESCRIPTOR, flags: CREATE_VIRTUAL_DISK_FLAG, providerspecificflags: UInt, parameters: Long, overlapped: Long, handle: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_CreateVirtualDisk(virtualstoragetype.toString(), path.toString(), virtualdiskaccessmask, securitydescriptor.toString(), flags, providerspecificflags.toInt(), parameters.toString(), overlapped.toString(), handle.toString()) as Int).toUInt() else 0u

public actual fun DeleteSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: DELETE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(virtualdiskhandle.toString(), parameters.toString(), flags) as Int).toUInt() else 0u

public actual fun DeleteVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(virtualdiskhandle.toString(), item.toString()) as Int).toUInt() else 0u

public actual fun DetachVirtualDisk(virtualdiskhandle: HANDLE, flags: DETACH_VIRTUAL_DISK_FLAG, providerspecificflags: UInt): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_DetachVirtualDisk(virtualdiskhandle.toString(), flags, providerspecificflags.toInt()) as Int).toUInt() else 0u

public actual fun EnumerateVirtualDiskMetadata(virtualdiskhandle: HANDLE, numberofitems: Long, items: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(virtualdiskhandle.toString(), numberofitems.toString(), items.toString()) as Int).toUInt() else 0u

public actual fun ExpandVirtualDisk(virtualdiskhandle: HANDLE, flags: EXPAND_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun ForkVirtualDisk(virtualdiskhandle: HANDLE, flags: FORK_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_ForkVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: PWSTR): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes.toString(), pathsbuffer.toString()) as Int).toUInt() else 0u

public actual fun GetStorageDependencyInformation(objecthandle: HANDLE, flags: GET_STORAGE_DEPENDENCY_FLAG, storagedependencyinfosize: UInt, storagedependencyinfo: Long, sizeused: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(objecthandle.toString(), flags, storagedependencyinfosize.toInt(), storagedependencyinfo.toString(), sizeused.toString()) as Int).toUInt() else 0u

public actual fun GetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(virtualdiskhandle.toString(), virtualdiskinfosize.toString(), virtualdiskinfo.toString(), sizeused.toString()) as Int).toUInt() else 0u

public actual fun GetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: Long, metadata: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(virtualdiskhandle.toString(), item.toString(), metadatasize.toString(), metadata.toString()) as Int).toUInt() else 0u

public actual fun GetVirtualDiskOperationProgress(virtualdiskhandle: HANDLE, overlapped: Long, progress: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(virtualdiskhandle.toString(), overlapped.toString(), progress.toString()) as Int).toUInt() else 0u

public actual fun GetVirtualDiskPhysicalPath(virtualdiskhandle: HANDLE, diskpathsizeinbytes: Long, diskpath: PWSTR): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(virtualdiskhandle.toString(), diskpathsizeinbytes.toString(), diskpath.toString()) as Int).toUInt() else 0u

public actual fun MergeVirtualDisk(virtualdiskhandle: HANDLE, flags: MERGE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_MergeVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun MirrorVirtualDisk(virtualdiskhandle: HANDLE, flags: MIRROR_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun ModifyVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: MODIFY_VHDSET_FLAG): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_ModifyVhdSet(virtualdiskhandle.toString(), parameters.toString(), flags) as Int).toUInt() else 0u

public actual fun OpenVirtualDisk(virtualstoragetype: Long, path: PCWSTR, virtualdiskaccessmask: VIRTUAL_DISK_ACCESS_MASK, flags: OPEN_VIRTUAL_DISK_FLAG, parameters: Long, handle: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_OpenVirtualDisk(virtualstoragetype.toString(), path.toString(), virtualdiskaccessmask, flags, parameters.toString(), handle.toString()) as Int).toUInt() else 0u

public actual fun QueryChangesVirtualDisk(virtualdiskhandle: HANDLE, changetrackingid: PCWSTR, byteoffset: ULong, bytelength: ULong, flags: QUERY_CHANGES_VIRTUAL_DISK_FLAG, ranges: Long, rangecount: Long, processedlength: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(virtualdiskhandle.toString(), changetrackingid.toString(), byteoffset.toString(), bytelength.toString(), flags, ranges.toString(), rangecount.toString(), processedlength.toString()) as Int).toUInt() else 0u

public actual fun RawSCSIVirtualDisk(virtualdiskhandle: HANDLE, parameters: Long, flags: RAW_SCSI_VIRTUAL_DISK_FLAG, response: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(virtualdiskhandle.toString(), parameters.toString(), flags, response.toString()) as Int).toUInt() else 0u

public actual fun ResizeVirtualDisk(virtualdiskhandle: HANDLE, flags: RESIZE_VIRTUAL_DISK_FLAG, parameters: Long, overlapped: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(virtualdiskhandle.toString(), flags, parameters.toString(), overlapped.toString()) as Int).toUInt() else 0u

public actual fun SetVirtualDiskInformation(virtualdiskhandle: HANDLE, virtualdiskinfo: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(virtualdiskhandle.toString(), virtualdiskinfo.toString()) as Int).toUInt() else 0u

public actual fun SetVirtualDiskMetadata(virtualdiskhandle: HANDLE, item: Long, metadatasize: UInt, metadata: Long): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(virtualdiskhandle.toString(), item.toString(), metadatasize.toInt(), metadata.toString()) as Int).toUInt() else 0u

public actual fun TakeSnapshotVhdSet(virtualdiskhandle: HANDLE, parameters: Long, flags: TAKE_SNAPSHOT_VHDSET_FLAG): WIN32_ERROR =
    if (_windowsWin32StorageVhdNapiAddon != null) (_windowsWin32StorageVhdNapiAddon.windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(virtualdiskhandle.toString(), parameters.toString(), flags) as Int).toUInt() else 0u
