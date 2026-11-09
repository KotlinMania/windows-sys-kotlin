#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_vhd_AddVirtualDiskParent(void* virtualdiskhandle, void* parentpath);
uint32_t windowssys_windows_win32_storage_vhd_ApplySnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_AttachVirtualDisk(void* virtualdiskhandle, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_BreakMirrorVirtualDisk(void* virtualdiskhandle);
uint32_t windowssys_windows_win32_storage_vhd_CompactVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_CompleteForkVirtualDisk(void* virtualdiskhandle);
uint32_t windowssys_windows_win32_storage_vhd_CreateVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped, void* handle);
uint32_t windowssys_windows_win32_storage_vhd_DeleteSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_DeleteVirtualDiskMetadata(void* virtualdiskhandle, void* item);
uint32_t windowssys_windows_win32_storage_vhd_DetachVirtualDisk(void* virtualdiskhandle, int32_t flags, uint32_t providerspecificflags);
uint32_t windowssys_windows_win32_storage_vhd_EnumerateVirtualDiskMetadata(void* virtualdiskhandle, void* numberofitems, void* items);
uint32_t windowssys_windows_win32_storage_vhd_ExpandVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_ForkVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_GetAllAttachedVirtualDiskPhysicalPaths(void* pathsbuffersizeinbytes, void* pathsbuffer);
uint32_t windowssys_windows_win32_storage_vhd_GetStorageDependencyInformation(void* objecthandle, int32_t flags, uint32_t storagedependencyinfosize, void* storagedependencyinfo, void* sizeused);
uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfosize, void* virtualdiskinfo, void* sizeused);
uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskMetadata(void* virtualdiskhandle, void* item, void* metadatasize, void* metadata);
uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskOperationProgress(void* virtualdiskhandle, void* overlapped, void* progress);
uint32_t windowssys_windows_win32_storage_vhd_GetVirtualDiskPhysicalPath(void* virtualdiskhandle, void* diskpathsizeinbytes, void* diskpath);
uint32_t windowssys_windows_win32_storage_vhd_MergeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_MirrorVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_ModifyVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_OpenVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, int32_t flags, void* parameters, void* handle);
uint32_t windowssys_windows_win32_storage_vhd_QueryChangesVirtualDisk(void* virtualdiskhandle, void* changetrackingid, uint64_t byteoffset, uint64_t bytelength, int32_t flags, void* ranges, void* rangecount, void* processedlength);
uint32_t windowssys_windows_win32_storage_vhd_RawSCSIVirtualDisk(void* virtualdiskhandle, void* parameters, int32_t flags, void* response);
uint32_t windowssys_windows_win32_storage_vhd_ResizeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_SetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfo);
uint32_t windowssys_windows_win32_storage_vhd_SetVirtualDiskMetadata(void* virtualdiskhandle, void* item, uint32_t metadatasize, void* metadata);
uint32_t windowssys_windows_win32_storage_vhd_TakeSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H */
