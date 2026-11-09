#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_memory_AddSecureMemoryCacheCallback(void* pfncallback);
int32_t windowssys_windows_win32_system_memory_AllocateUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
int32_t windowssys_windows_win32_system_memory_AllocateUserPhysicalPages2(void* objecthandle, void* numberofpages, void* pagearray, void* extendedparameters, uint32_t extendedparametercount);
int32_t windowssys_windows_win32_system_memory_AllocateUserPhysicalPagesNuma(void* hprocess, void* numberofpages, void* pagearray, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_CreateFileMapping2(void* file, void* securityattributes, uint32_t desiredaccess, uint32_t pageprotection, uint32_t allocationattributes, uint64_t maximumsize, void* name, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_CreateFileMappingA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssys_windows_win32_system_memory_CreateFileMappingFromApp(void* hfile, void* securityattributes, uint32_t pageprotection, uint64_t maximumsize, void* name);
void* windowssys_windows_win32_system_memory_CreateFileMappingNumaA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_CreateFileMappingNumaW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_CreateFileMappingW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssys_windows_win32_system_memory_CreateMemoryResourceNotification(int32_t notificationtype);
uint32_t windowssys_windows_win32_system_memory_DiscardVirtualMemory(void* virtualaddress, uint64_t size);
int32_t windowssys_windows_win32_system_memory_FlushViewOfFile(void* lpbaseaddress, uint64_t dwnumberofbytestoflush);
int32_t windowssys_windows_win32_system_memory_FreeUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
uint64_t windowssys_windows_win32_system_memory_GetLargePageMinimum(void);
int32_t windowssys_windows_win32_system_memory_GetMemoryErrorHandlingCapabilities(void* capabilities);
void* windowssys_windows_win32_system_memory_GetProcessHeap(void);
uint32_t windowssys_windows_win32_system_memory_GetProcessHeaps(uint32_t numberofheaps, void* processheaps);
int32_t windowssys_windows_win32_system_memory_GetProcessWorkingSetSizeEx(void* hprocess, void* lpminimumworkingsetsize, void* lpmaximumworkingsetsize, void* flags);
int32_t windowssys_windows_win32_system_memory_GetSystemFileCacheSize(void* lpminimumfilecachesize, void* lpmaximumfilecachesize, void* lpflags);
uint32_t windowssys_windows_win32_system_memory_GetWriteWatch(uint32_t dwflags, void* lpbaseaddress, uint64_t dwregionsize, void* lpaddresses, void* lpdwcount, void* lpdwgranularity);
void* windowssys_windows_win32_system_memory_GlobalAlloc(uint32_t uflags, uint64_t dwbytes);
uint32_t windowssys_windows_win32_system_memory_GlobalFlags(void* hmem);
void* windowssys_windows_win32_system_memory_GlobalHandle(void* pmem);
void* windowssys_windows_win32_system_memory_GlobalLock(void* hmem);
void* windowssys_windows_win32_system_memory_GlobalReAlloc(void* hmem, uint64_t dwbytes, uint32_t uflags);
uint64_t windowssys_windows_win32_system_memory_GlobalSize(void* hmem);
int32_t windowssys_windows_win32_system_memory_GlobalUnlock(void* hmem);
void* windowssys_windows_win32_system_memory_HeapAlloc(void* hheap, uint32_t dwflags, uint64_t dwbytes);
uint64_t windowssys_windows_win32_system_memory_HeapCompact(void* hheap, uint32_t dwflags);
void* windowssys_windows_win32_system_memory_HeapCreate(uint32_t floptions, uint64_t dwinitialsize, uint64_t dwmaximumsize);
int32_t windowssys_windows_win32_system_memory_HeapDestroy(void* hheap);
int32_t windowssys_windows_win32_system_memory_HeapFree(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_HeapLock(void* hheap);
int32_t windowssys_windows_win32_system_memory_HeapQueryInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength, void* returnlength);
void* windowssys_windows_win32_system_memory_HeapReAlloc(void* hheap, uint32_t dwflags, void* lpmem, uint64_t dwbytes);
int32_t windowssys_windows_win32_system_memory_HeapSetInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength);
uint64_t windowssys_windows_win32_system_memory_HeapSize(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_HeapSummary(void* hheap, uint32_t dwflags, void* lpsummary);
int32_t windowssys_windows_win32_system_memory_HeapUnlock(void* hheap);
int32_t windowssys_windows_win32_system_memory_HeapValidate(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_HeapWalk(void* hheap, void* lpentry);
int32_t windowssys_windows_win32_system_memory_IsBadReadPtr(void* lp, uint64_t ucb);
int32_t windowssys_windows_win32_system_memory_IsBadStringPtrA(void* lpsz, uint64_t ucchmax);
int32_t windowssys_windows_win32_system_memory_IsBadStringPtrW(void* lpsz, uint64_t ucchmax);
int32_t windowssys_windows_win32_system_memory_IsBadWritePtr(void* lp, uint64_t ucb);
void* windowssys_windows_win32_system_memory_LocalAlloc(uint32_t uflags, uint64_t ubytes);
uint32_t windowssys_windows_win32_system_memory_LocalFlags(void* hmem);
void* windowssys_windows_win32_system_memory_LocalHandle(void* pmem);
void* windowssys_windows_win32_system_memory_LocalLock(void* hmem);
void* windowssys_windows_win32_system_memory_LocalReAlloc(void* hmem, uint64_t ubytes, uint32_t uflags);
uint64_t windowssys_windows_win32_system_memory_LocalSize(void* hmem);
int32_t windowssys_windows_win32_system_memory_LocalUnlock(void* hmem);
int32_t windowssys_windows_win32_system_memory_MapUserPhysicalPages(void* virtualaddress, uint64_t numberofpages, void* pagearray);
int32_t windowssys_windows_win32_system_memory_MapUserPhysicalPagesScatter(void* virtualaddresses, uint64_t numberofpages, void* pagearray);
uint32_t windowssys_windows_win32_system_memory_OfferVirtualMemory(void* virtualaddress, uint64_t size, int32_t priority);
void* windowssys_windows_win32_system_memory_OpenDedicatedMemoryPartition(void* partition, uint64_t dedicatedmemorytypeid, uint32_t desiredaccess, int32_t inherithandle);
void* windowssys_windows_win32_system_memory_OpenFileMappingA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssys_windows_win32_system_memory_OpenFileMappingFromApp(uint32_t desiredaccess, int32_t inherithandle, void* name);
void* windowssys_windows_win32_system_memory_OpenFileMappingW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssys_windows_win32_system_memory_PrefetchVirtualMemory(void* hprocess, uint64_t numberofentries, void* virtualaddresses, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_QueryMemoryResourceNotification(void* resourcenotificationhandle, void* resourcestate);
int32_t windowssys_windows_win32_system_memory_QueryPartitionInformation(void* partition, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength);
int32_t windowssys_windows_win32_system_memory_QueryVirtualMemoryInformation(void* process, void* virtualaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationsize, void* returnsize);
uint32_t windowssys_windows_win32_system_memory_ReclaimVirtualMemory(void* virtualaddress, uint64_t size);
void* windowssys_windows_win32_system_memory_RegisterBadMemoryNotification(void* callback);
int32_t windowssys_windows_win32_system_memory_RemoveSecureMemoryCacheCallback(void* pfncallback);
uint32_t windowssys_windows_win32_system_memory_ResetWriteWatch(void* lpbaseaddress, uint64_t dwregionsize);
uint64_t windowssys_windows_win32_system_memory_RtlCompareMemory(void* source1, void* source2, uint64_t length);
uint32_t windowssys_windows_win32_system_memory_RtlCrc32(void* buffer, uint64_t size, uint32_t initialcrc);
uint64_t windowssys_windows_win32_system_memory_RtlCrc64(void* buffer, uint64_t size, uint64_t initialcrc);
bool windowssys_windows_win32_system_memory_RtlIsZeroMemory(void* buffer, uint64_t length);
int32_t windowssys_windows_win32_system_memory_SetProcessValidCallTargets(void* hprocess, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation);
int32_t windowssys_windows_win32_system_memory_SetProcessValidCallTargetsForMappedView(void* process, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation, void* section, uint64_t expectedfileoffset);
int32_t windowssys_windows_win32_system_memory_SetProcessWorkingSetSizeEx(void* hprocess, uint64_t dwminimumworkingsetsize, uint64_t dwmaximumworkingsetsize, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_SetSystemFileCacheSize(uint64_t minimumfilecachesize, uint64_t maximumfilecachesize, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_UnregisterBadMemoryNotification(void* registrationhandle);
void* windowssys_windows_win32_system_memory_VirtualAlloc(void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssys_windows_win32_system_memory_VirtualAlloc2(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_VirtualAlloc2FromApp(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_VirtualAllocEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssys_windows_win32_system_memory_VirtualAllocExNuma(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_VirtualAllocFromApp(void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t protection);
int32_t windowssys_windows_win32_system_memory_VirtualFree(void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssys_windows_win32_system_memory_VirtualFreeEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssys_windows_win32_system_memory_VirtualLock(void* lpaddress, uint64_t dwsize);
int32_t windowssys_windows_win32_system_memory_VirtualProtect(void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssys_windows_win32_system_memory_VirtualProtectEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssys_windows_win32_system_memory_VirtualProtectFromApp(void* address, uint64_t size, uint32_t newprotection, void* oldprotection);
uint64_t windowssys_windows_win32_system_memory_VirtualQuery(void* lpaddress, void* lpbuffer, uint64_t dwlength);
uint64_t windowssys_windows_win32_system_memory_VirtualQueryEx(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t dwlength);
int32_t windowssys_windows_win32_system_memory_VirtualUnlock(void* lpaddress, uint64_t dwsize);
int32_t windowssys_windows_win32_system_memory_VirtualUnlockEx(void* process, void* address, uint64_t size);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H */
