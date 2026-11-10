#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_vhd_addVirtualDiskParent(void* virtualdiskhandle, void* parentpath);
uint32_t windowssys_windows_win32_storage_vhd_applySnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_attachVirtualDisk(void* virtualdiskhandle, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk(void* virtualdiskhandle);
uint32_t windowssys_windows_win32_storage_vhd_compactVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_completeForkVirtualDisk(void* virtualdiskhandle);
uint32_t windowssys_windows_win32_storage_vhd_createVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped, void* handle);
uint32_t windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata(void* virtualdiskhandle, void* item);
uint32_t windowssys_windows_win32_storage_vhd_detachVirtualDisk(void* virtualdiskhandle, int32_t flags, uint32_t providerspecificflags);
uint32_t windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata(void* virtualdiskhandle, void* numberofitems, void* items);
uint32_t windowssys_windows_win32_storage_vhd_expandVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_forkVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths(void* pathsbuffersizeinbytes, void* pathsbuffer);
uint32_t windowssys_windows_win32_storage_vhd_getStorageDependencyInformation(void* objecthandle, int32_t flags, uint32_t storagedependencyinfosize, void* storagedependencyinfo, void* sizeused);
uint32_t windowssys_windows_win32_storage_vhd_getVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfosize, void* virtualdiskinfo, void* sizeused);
uint32_t windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata(void* virtualdiskhandle, void* item, void* metadatasize, void* metadata);
uint32_t windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress(void* virtualdiskhandle, void* overlapped, void* progress);
uint32_t windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath(void* virtualdiskhandle, void* diskpathsizeinbytes, void* diskpath);
uint32_t windowssys_windows_win32_storage_vhd_mergeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_mirrorVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_modifyVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssys_windows_win32_storage_vhd_openVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, int32_t flags, void* parameters, void* handle);
uint32_t windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk(void* virtualdiskhandle, void* changetrackingid, uint64_t byteoffset, uint64_t bytelength, int32_t flags, void* ranges, void* rangecount, void* processedlength);
uint32_t windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk(void* virtualdiskhandle, void* parameters, int32_t flags, void* response);
uint32_t windowssys_windows_win32_storage_vhd_resizeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssys_windows_win32_storage_vhd_setVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfo);
uint32_t windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata(void* virtualdiskhandle, void* item, uint32_t metadatasize, void* metadata);
uint32_t windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H */
