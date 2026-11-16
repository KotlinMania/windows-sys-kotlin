#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemMemoryAddSecureMemoryCacheCallback(void* pfncallback);
int32_t windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
int32_t windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPages2(void* objecthandle, void* numberofpages, void* pagearray, void* extendedparameters, uint32_t extendedparametercount);
int32_t windowssysWindowsWin32SystemMemoryAllocateUserPhysicalPagesNuma(void* hprocess, void* numberofpages, void* pagearray, uint32_t nndpreferred);
void* windowssysWindowsWin32SystemMemoryCreateFileMapping2(void* file, void* securityattributes, uint32_t desiredaccess, uint32_t pageprotection, uint32_t allocationattributes, uint64_t maximumsize, void* name, void* extendedparameters, uint32_t parametercount);
void* windowssysWindowsWin32SystemMemoryCreateFileMappingA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssysWindowsWin32SystemMemoryCreateFileMappingFromApp(void* hfile, void* securityattributes, uint32_t pageprotection, uint64_t maximumsize, void* name);
void* windowssysWindowsWin32SystemMemoryCreateFileMappingNumaA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssysWindowsWin32SystemMemoryCreateFileMappingNumaW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssysWindowsWin32SystemMemoryCreateFileMappingW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssysWindowsWin32SystemMemoryCreateMemoryResourceNotification(int32_t notificationtype);
uint32_t windowssysWindowsWin32SystemMemoryDiscardVirtualMemory(void* virtualaddress, uint64_t size);
int32_t windowssysWindowsWin32SystemMemoryFlushViewOfFile(void* lpbaseaddress, uint64_t dwnumberofbytestoflush);
int32_t windowssysWindowsWin32SystemMemoryFreeUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
uint64_t windowssysWindowsWin32SystemMemoryGetLargePageMinimum(void);
int32_t windowssysWindowsWin32SystemMemoryGetMemoryErrorHandlingCapabilities(void* capabilities);
void* windowssysWindowsWin32SystemMemoryGetProcessHeap(void);
uint32_t windowssysWindowsWin32SystemMemoryGetProcessHeaps(uint32_t numberofheaps, void* processheaps);
int32_t windowssysWindowsWin32SystemMemoryGetProcessWorkingSetSizeEx(void* hprocess, void* lpminimumworkingsetsize, void* lpmaximumworkingsetsize, void* flags);
int32_t windowssysWindowsWin32SystemMemoryGetSystemFileCacheSize(void* lpminimumfilecachesize, void* lpmaximumfilecachesize, void* lpflags);
uint32_t windowssysWindowsWin32SystemMemoryGetWriteWatch(uint32_t dwflags, void* lpbaseaddress, uint64_t dwregionsize, void* lpaddresses, void* lpdwcount, void* lpdwgranularity);
void* windowssysWindowsWin32SystemMemoryGlobalAlloc(uint32_t uflags, uint64_t dwbytes);
uint32_t windowssysWindowsWin32SystemMemoryGlobalFlags(void* hmem);
void* windowssysWindowsWin32SystemMemoryGlobalHandle(void* pmem);
void* windowssysWindowsWin32SystemMemoryGlobalLock(void* hmem);
void* windowssysWindowsWin32SystemMemoryGlobalReAlloc(void* hmem, uint64_t dwbytes, uint32_t uflags);
uint64_t windowssysWindowsWin32SystemMemoryGlobalSize(void* hmem);
int32_t windowssysWindowsWin32SystemMemoryGlobalUnlock(void* hmem);
void* windowssysWindowsWin32SystemMemoryHeapAlloc(void* hheap, uint32_t dwflags, uint64_t dwbytes);
uint64_t windowssysWindowsWin32SystemMemoryHeapCompact(void* hheap, uint32_t dwflags);
void* windowssysWindowsWin32SystemMemoryHeapCreate(uint32_t floptions, uint64_t dwinitialsize, uint64_t dwmaximumsize);
int32_t windowssysWindowsWin32SystemMemoryHeapDestroy(void* hheap);
int32_t windowssysWindowsWin32SystemMemoryHeapFree(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssysWindowsWin32SystemMemoryHeapLock(void* hheap);
int32_t windowssysWindowsWin32SystemMemoryHeapQueryInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength, void* returnlength);
void* windowssysWindowsWin32SystemMemoryHeapReAlloc(void* hheap, uint32_t dwflags, void* lpmem, uint64_t dwbytes);
int32_t windowssysWindowsWin32SystemMemoryHeapSetInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength);
uint64_t windowssysWindowsWin32SystemMemoryHeapSize(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssysWindowsWin32SystemMemoryHeapSummary(void* hheap, uint32_t dwflags, void* lpsummary);
int32_t windowssysWindowsWin32SystemMemoryHeapUnlock(void* hheap);
int32_t windowssysWindowsWin32SystemMemoryHeapValidate(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssysWindowsWin32SystemMemoryHeapWalk(void* hheap, void* lpentry);
int32_t windowssysWindowsWin32SystemMemoryIsBadReadPtr(void* lp, uint64_t ucb);
int32_t windowssysWindowsWin32SystemMemoryIsBadStringPtrA(void* lpsz, uint64_t ucchmax);
int32_t windowssysWindowsWin32SystemMemoryIsBadStringPtrW(void* lpsz, uint64_t ucchmax);
int32_t windowssysWindowsWin32SystemMemoryIsBadWritePtr(void* lp, uint64_t ucb);
void* windowssysWindowsWin32SystemMemoryLocalAlloc(uint32_t uflags, uint64_t ubytes);
uint32_t windowssysWindowsWin32SystemMemoryLocalFlags(void* hmem);
void* windowssysWindowsWin32SystemMemoryLocalHandle(void* pmem);
void* windowssysWindowsWin32SystemMemoryLocalLock(void* hmem);
void* windowssysWindowsWin32SystemMemoryLocalReAlloc(void* hmem, uint64_t ubytes, uint32_t uflags);
uint64_t windowssysWindowsWin32SystemMemoryLocalSize(void* hmem);
int32_t windowssysWindowsWin32SystemMemoryLocalUnlock(void* hmem);
int32_t windowssysWindowsWin32SystemMemoryMapUserPhysicalPages(void* virtualaddress, uint64_t numberofpages, void* pagearray);
int32_t windowssysWindowsWin32SystemMemoryMapUserPhysicalPagesScatter(void* virtualaddresses, uint64_t numberofpages, void* pagearray);
uint32_t windowssysWindowsWin32SystemMemoryOfferVirtualMemory(void* virtualaddress, uint64_t size, int32_t priority);
void* windowssysWindowsWin32SystemMemoryOpenDedicatedMemoryPartition(void* partition, uint64_t dedicatedmemorytypeid, uint32_t desiredaccess, int32_t inherithandle);
void* windowssysWindowsWin32SystemMemoryOpenFileMappingA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssysWindowsWin32SystemMemoryOpenFileMappingFromApp(uint32_t desiredaccess, int32_t inherithandle, void* name);
void* windowssysWindowsWin32SystemMemoryOpenFileMappingW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssysWindowsWin32SystemMemoryPrefetchVirtualMemory(void* hprocess, uint64_t numberofentries, void* virtualaddresses, uint32_t flags);
int32_t windowssysWindowsWin32SystemMemoryQueryMemoryResourceNotification(void* resourcenotificationhandle, void* resourcestate);
int32_t windowssysWindowsWin32SystemMemoryQueryPartitionInformation(void* partition, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength);
int32_t windowssysWindowsWin32SystemMemoryQueryVirtualMemoryInformation(void* process, void* virtualaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationsize, void* returnsize);
uint32_t windowssysWindowsWin32SystemMemoryReclaimVirtualMemory(void* virtualaddress, uint64_t size);
void* windowssysWindowsWin32SystemMemoryRegisterBadMemoryNotification(void* callback);
int32_t windowssysWindowsWin32SystemMemoryRemoveSecureMemoryCacheCallback(void* pfncallback);
uint32_t windowssysWindowsWin32SystemMemoryResetWriteWatch(void* lpbaseaddress, uint64_t dwregionsize);
uint64_t windowssysWindowsWin32SystemMemoryRtlCompareMemory(void* source1, void* source2, uint64_t length);
uint32_t windowssysWindowsWin32SystemMemoryRtlCrc32(void* buffer, uint64_t size, uint32_t initialcrc);
uint64_t windowssysWindowsWin32SystemMemoryRtlCrc64(void* buffer, uint64_t size, uint64_t initialcrc);
bool windowssysWindowsWin32SystemMemoryRtlIsZeroMemory(void* buffer, uint64_t length);
int32_t windowssysWindowsWin32SystemMemorySetProcessValidCallTargets(void* hprocess, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation);
int32_t windowssysWindowsWin32SystemMemorySetProcessValidCallTargetsForMappedView(void* process, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation, void* section, uint64_t expectedfileoffset);
int32_t windowssysWindowsWin32SystemMemorySetProcessWorkingSetSizeEx(void* hprocess, uint64_t dwminimumworkingsetsize, uint64_t dwmaximumworkingsetsize, uint32_t flags);
int32_t windowssysWindowsWin32SystemMemorySetSystemFileCacheSize(uint64_t minimumfilecachesize, uint64_t maximumfilecachesize, uint32_t flags);
int32_t windowssysWindowsWin32SystemMemoryUnregisterBadMemoryNotification(void* registrationhandle);
void* windowssysWindowsWin32SystemMemoryVirtualAlloc(void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssysWindowsWin32SystemMemoryVirtualAlloc2(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssysWindowsWin32SystemMemoryVirtualAlloc2FromApp(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssysWindowsWin32SystemMemoryVirtualAllocEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssysWindowsWin32SystemMemoryVirtualAllocExNuma(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect, uint32_t nndpreferred);
void* windowssysWindowsWin32SystemMemoryVirtualAllocFromApp(void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t protection);
int32_t windowssysWindowsWin32SystemMemoryVirtualFree(void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssysWindowsWin32SystemMemoryVirtualFreeEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssysWindowsWin32SystemMemoryVirtualLock(void* lpaddress, uint64_t dwsize);
int32_t windowssysWindowsWin32SystemMemoryVirtualProtect(void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssysWindowsWin32SystemMemoryVirtualProtectEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssysWindowsWin32SystemMemoryVirtualProtectFromApp(void* address, uint64_t size, uint32_t newprotection, void* oldprotection);
uint64_t windowssysWindowsWin32SystemMemoryVirtualQuery(void* lpaddress, void* lpbuffer, uint64_t dwlength);
uint64_t windowssysWindowsWin32SystemMemoryVirtualQueryEx(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t dwlength);
int32_t windowssysWindowsWin32SystemMemoryVirtualUnlock(void* lpaddress, uint64_t dwsize);
int32_t windowssysWindowsWin32SystemMemoryVirtualUnlockEx(void* process, void* address, uint64_t size);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H */
