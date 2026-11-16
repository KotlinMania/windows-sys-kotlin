#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32StorageVhdAddVirtualDiskParent(void* virtualdiskhandle, void* parentpath);
uint32_t windowssysWindowsWin32StorageVhdApplySnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssysWindowsWin32StorageVhdAttachVirtualDisk(void* virtualdiskhandle, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdBreakMirrorVirtualDisk(void* virtualdiskhandle);
uint32_t windowssysWindowsWin32StorageVhdCompactVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdCompleteForkVirtualDisk(void* virtualdiskhandle);
uint32_t windowssysWindowsWin32StorageVhdCreateVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, void* securitydescriptor, int32_t flags, uint32_t providerspecificflags, void* parameters, void* overlapped, void* handle);
uint32_t windowssysWindowsWin32StorageVhdDeleteSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssysWindowsWin32StorageVhdDeleteVirtualDiskMetadata(void* virtualdiskhandle, void* item);
uint32_t windowssysWindowsWin32StorageVhdDetachVirtualDisk(void* virtualdiskhandle, int32_t flags, uint32_t providerspecificflags);
uint32_t windowssysWindowsWin32StorageVhdEnumerateVirtualDiskMetadata(void* virtualdiskhandle, void* numberofitems, void* items);
uint32_t windowssysWindowsWin32StorageVhdExpandVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdForkVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdGetAllAttachedVirtualDiskPhysicalPaths(void* pathsbuffersizeinbytes, void* pathsbuffer);
uint32_t windowssysWindowsWin32StorageVhdGetStorageDependencyInformation(void* objecthandle, int32_t flags, uint32_t storagedependencyinfosize, void* storagedependencyinfo, void* sizeused);
uint32_t windowssysWindowsWin32StorageVhdGetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfosize, void* virtualdiskinfo, void* sizeused);
uint32_t windowssysWindowsWin32StorageVhdGetVirtualDiskMetadata(void* virtualdiskhandle, void* item, void* metadatasize, void* metadata);
uint32_t windowssysWindowsWin32StorageVhdGetVirtualDiskOperationProgress(void* virtualdiskhandle, void* overlapped, void* progress);
uint32_t windowssysWindowsWin32StorageVhdGetVirtualDiskPhysicalPath(void* virtualdiskhandle, void* diskpathsizeinbytes, void* diskpath);
uint32_t windowssysWindowsWin32StorageVhdMergeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdMirrorVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdModifyVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);
uint32_t windowssysWindowsWin32StorageVhdOpenVirtualDisk(void* virtualstoragetype, void* path, int32_t virtualdiskaccessmask, int32_t flags, void* parameters, void* handle);
uint32_t windowssysWindowsWin32StorageVhdQueryChangesVirtualDisk(void* virtualdiskhandle, void* changetrackingid, uint64_t byteoffset, uint64_t bytelength, int32_t flags, void* ranges, void* rangecount, void* processedlength);
uint32_t windowssysWindowsWin32StorageVhdRawSCSIVirtualDisk(void* virtualdiskhandle, void* parameters, int32_t flags, void* response);
uint32_t windowssysWindowsWin32StorageVhdResizeVirtualDisk(void* virtualdiskhandle, int32_t flags, void* parameters, void* overlapped);
uint32_t windowssysWindowsWin32StorageVhdSetVirtualDiskInformation(void* virtualdiskhandle, void* virtualdiskinfo);
uint32_t windowssysWindowsWin32StorageVhdSetVirtualDiskMetadata(void* virtualdiskhandle, void* item, uint32_t metadatasize, void* metadata);
uint32_t windowssysWindowsWin32StorageVhdTakeSnapshotVhdSet(void* virtualdiskhandle, void* parameters, int32_t flags);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_VHD_WINDOWS_WIN32_STORAGE_VHD_WRAPPER_H */
