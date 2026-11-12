#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_MEMORY_WINDOWS_WDK_SYSTEM_MEMORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_MEMORY_WINDOWS_WDK_SYSTEM_MEMORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkSystemMemoryNtMapViewOfSection(void* sectionhandle, void* processhandle, void* baseaddress, uint64_t zerobits, uint64_t commitsize, void* sectionoffset, void* viewsize, int32_t inheritdisposition, uint32_t allocationtype, uint32_t win32protect);
int32_t windowssysWindowsWdkSystemMemoryNtOpenSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(void* processhandle, void* baseaddress);
int32_t windowssysWindowsWdkSystemMemoryZwMapViewOfSection(void* sectionhandle, void* processhandle, void* baseaddress, uint64_t zerobits, uint64_t commitsize, void* sectionoffset, void* viewsize, int32_t inheritdisposition, uint32_t allocationtype, uint32_t win32protect);
int32_t windowssysWindowsWdkSystemMemoryZwOpenSection(void* sectionhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(void* processhandle, void* baseaddress);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_MEMORY_WINDOWS_WDK_SYSTEM_MEMORY_WRAPPER_H */
