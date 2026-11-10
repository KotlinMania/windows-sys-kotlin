#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_memory_addSecureMemoryCacheCallback(void* pfncallback);
int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPages2(void* objecthandle, void* numberofpages, void* pagearray, void* extendedparameters, uint32_t extendedparametercount);
int32_t windowssys_windows_win32_system_memory_allocateUserPhysicalPagesNuma(void* hprocess, void* numberofpages, void* pagearray, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_createFileMapping2(void* file, void* securityattributes, uint32_t desiredaccess, uint32_t pageprotection, uint32_t allocationattributes, uint64_t maximumsize, void* name, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_createFileMappingA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssys_windows_win32_system_memory_createFileMappingFromApp(void* hfile, void* securityattributes, uint32_t pageprotection, uint64_t maximumsize, void* name);
void* windowssys_windows_win32_system_memory_createFileMappingNumaA(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_createFileMappingNumaW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_createFileMappingW(void* hfile, void* lpfilemappingattributes, uint32_t flprotect, uint32_t dwmaximumsizehigh, uint32_t dwmaximumsizelow, void* lpname);
void* windowssys_windows_win32_system_memory_createMemoryResourceNotification(int32_t notificationtype);
uint32_t windowssys_windows_win32_system_memory_discardVirtualMemory(void* virtualaddress, uint64_t size);
int32_t windowssys_windows_win32_system_memory_flushViewOfFile(void* lpbaseaddress, uint64_t dwnumberofbytestoflush);
int32_t windowssys_windows_win32_system_memory_freeUserPhysicalPages(void* hprocess, void* numberofpages, void* pagearray);
uint64_t windowssys_windows_win32_system_memory_getLargePageMinimum(void);
int32_t windowssys_windows_win32_system_memory_getMemoryErrorHandlingCapabilities(void* capabilities);
void* windowssys_windows_win32_system_memory_getProcessHeap(void);
uint32_t windowssys_windows_win32_system_memory_getProcessHeaps(uint32_t numberofheaps, void* processheaps);
int32_t windowssys_windows_win32_system_memory_getProcessWorkingSetSizeEx(void* hprocess, void* lpminimumworkingsetsize, void* lpmaximumworkingsetsize, void* flags);
int32_t windowssys_windows_win32_system_memory_getSystemFileCacheSize(void* lpminimumfilecachesize, void* lpmaximumfilecachesize, void* lpflags);
uint32_t windowssys_windows_win32_system_memory_getWriteWatch(uint32_t dwflags, void* lpbaseaddress, uint64_t dwregionsize, void* lpaddresses, void* lpdwcount, void* lpdwgranularity);
void* windowssys_windows_win32_system_memory_globalAlloc(uint32_t uflags, uint64_t dwbytes);
uint32_t windowssys_windows_win32_system_memory_globalFlags(void* hmem);
void* windowssys_windows_win32_system_memory_globalHandle(void* pmem);
void* windowssys_windows_win32_system_memory_globalLock(void* hmem);
void* windowssys_windows_win32_system_memory_globalReAlloc(void* hmem, uint64_t dwbytes, uint32_t uflags);
uint64_t windowssys_windows_win32_system_memory_globalSize(void* hmem);
int32_t windowssys_windows_win32_system_memory_globalUnlock(void* hmem);
void* windowssys_windows_win32_system_memory_heapAlloc(void* hheap, uint32_t dwflags, uint64_t dwbytes);
uint64_t windowssys_windows_win32_system_memory_heapCompact(void* hheap, uint32_t dwflags);
void* windowssys_windows_win32_system_memory_heapCreate(uint32_t floptions, uint64_t dwinitialsize, uint64_t dwmaximumsize);
int32_t windowssys_windows_win32_system_memory_heapDestroy(void* hheap);
int32_t windowssys_windows_win32_system_memory_heapFree(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_heapLock(void* hheap);
int32_t windowssys_windows_win32_system_memory_heapQueryInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength, void* returnlength);
void* windowssys_windows_win32_system_memory_heapReAlloc(void* hheap, uint32_t dwflags, void* lpmem, uint64_t dwbytes);
int32_t windowssys_windows_win32_system_memory_heapSetInformation(void* heaphandle, int32_t heapinformationclass, void* heapinformation, uint64_t heapinformationlength);
uint64_t windowssys_windows_win32_system_memory_heapSize(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_heapSummary(void* hheap, uint32_t dwflags, void* lpsummary);
int32_t windowssys_windows_win32_system_memory_heapUnlock(void* hheap);
int32_t windowssys_windows_win32_system_memory_heapValidate(void* hheap, uint32_t dwflags, void* lpmem);
int32_t windowssys_windows_win32_system_memory_heapWalk(void* hheap, void* lpentry);
int32_t windowssys_windows_win32_system_memory_isBadReadPtr(void* lp, uint64_t ucb);
int32_t windowssys_windows_win32_system_memory_isBadStringPtrA(void* lpsz, uint64_t ucchmax);
int32_t windowssys_windows_win32_system_memory_isBadStringPtrW(void* lpsz, uint64_t ucchmax);
int32_t windowssys_windows_win32_system_memory_isBadWritePtr(void* lp, uint64_t ucb);
void* windowssys_windows_win32_system_memory_localAlloc(uint32_t uflags, uint64_t ubytes);
uint32_t windowssys_windows_win32_system_memory_localFlags(void* hmem);
void* windowssys_windows_win32_system_memory_localHandle(void* pmem);
void* windowssys_windows_win32_system_memory_localLock(void* hmem);
void* windowssys_windows_win32_system_memory_localReAlloc(void* hmem, uint64_t ubytes, uint32_t uflags);
uint64_t windowssys_windows_win32_system_memory_localSize(void* hmem);
int32_t windowssys_windows_win32_system_memory_localUnlock(void* hmem);
int32_t windowssys_windows_win32_system_memory_mapUserPhysicalPages(void* virtualaddress, uint64_t numberofpages, void* pagearray);
int32_t windowssys_windows_win32_system_memory_mapUserPhysicalPagesScatter(void* virtualaddresses, uint64_t numberofpages, void* pagearray);
uint32_t windowssys_windows_win32_system_memory_offerVirtualMemory(void* virtualaddress, uint64_t size, int32_t priority);
void* windowssys_windows_win32_system_memory_openDedicatedMemoryPartition(void* partition, uint64_t dedicatedmemorytypeid, uint32_t desiredaccess, int32_t inherithandle);
void* windowssys_windows_win32_system_memory_openFileMappingA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssys_windows_win32_system_memory_openFileMappingFromApp(uint32_t desiredaccess, int32_t inherithandle, void* name);
void* windowssys_windows_win32_system_memory_openFileMappingW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssys_windows_win32_system_memory_prefetchVirtualMemory(void* hprocess, uint64_t numberofentries, void* virtualaddresses, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_queryMemoryResourceNotification(void* resourcenotificationhandle, void* resourcestate);
int32_t windowssys_windows_win32_system_memory_queryPartitionInformation(void* partition, int32_t partitioninformationclass, void* partitioninformation, uint32_t partitioninformationlength);
int32_t windowssys_windows_win32_system_memory_queryVirtualMemoryInformation(void* process, void* virtualaddress, int32_t memoryinformationclass, void* memoryinformation, uint64_t memoryinformationsize, void* returnsize);
uint32_t windowssys_windows_win32_system_memory_reclaimVirtualMemory(void* virtualaddress, uint64_t size);
void* windowssys_windows_win32_system_memory_registerBadMemoryNotification(void* callback);
int32_t windowssys_windows_win32_system_memory_removeSecureMemoryCacheCallback(void* pfncallback);
uint32_t windowssys_windows_win32_system_memory_resetWriteWatch(void* lpbaseaddress, uint64_t dwregionsize);
uint64_t windowssys_windows_win32_system_memory_rtlCompareMemory(void* source1, void* source2, uint64_t length);
uint32_t windowssys_windows_win32_system_memory_rtlCrc32(void* buffer, uint64_t size, uint32_t initialcrc);
uint64_t windowssys_windows_win32_system_memory_rtlCrc64(void* buffer, uint64_t size, uint64_t initialcrc);
bool windowssys_windows_win32_system_memory_rtlIsZeroMemory(void* buffer, uint64_t length);
int32_t windowssys_windows_win32_system_memory_setProcessValidCallTargets(void* hprocess, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation);
int32_t windowssys_windows_win32_system_memory_setProcessValidCallTargetsForMappedView(void* process, void* virtualaddress, uint64_t regionsize, uint32_t numberofoffsets, void* offsetinformation, void* section, uint64_t expectedfileoffset);
int32_t windowssys_windows_win32_system_memory_setProcessWorkingSetSizeEx(void* hprocess, uint64_t dwminimumworkingsetsize, uint64_t dwmaximumworkingsetsize, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_setSystemFileCacheSize(uint64_t minimumfilecachesize, uint64_t maximumfilecachesize, uint32_t flags);
int32_t windowssys_windows_win32_system_memory_unregisterBadMemoryNotification(void* registrationhandle);
void* windowssys_windows_win32_system_memory_virtualAlloc(void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssys_windows_win32_system_memory_virtualAlloc2(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_virtualAlloc2FromApp(void* process, void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t pageprotection, void* extendedparameters, uint32_t parametercount);
void* windowssys_windows_win32_system_memory_virtualAllocEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect);
void* windowssys_windows_win32_system_memory_virtualAllocExNuma(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flallocationtype, uint32_t flprotect, uint32_t nndpreferred);
void* windowssys_windows_win32_system_memory_virtualAllocFromApp(void* baseaddress, uint64_t size, uint32_t allocationtype, uint32_t protection);
int32_t windowssys_windows_win32_system_memory_virtualFree(void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssys_windows_win32_system_memory_virtualFreeEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t dwfreetype);
int32_t windowssys_windows_win32_system_memory_virtualLock(void* lpaddress, uint64_t dwsize);
int32_t windowssys_windows_win32_system_memory_virtualProtect(void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssys_windows_win32_system_memory_virtualProtectEx(void* hprocess, void* lpaddress, uint64_t dwsize, uint32_t flnewprotect, void* lpfloldprotect);
int32_t windowssys_windows_win32_system_memory_virtualProtectFromApp(void* address, uint64_t size, uint32_t newprotection, void* oldprotection);
uint64_t windowssys_windows_win32_system_memory_virtualQuery(void* lpaddress, void* lpbuffer, uint64_t dwlength);
uint64_t windowssys_windows_win32_system_memory_virtualQueryEx(void* hprocess, void* lpaddress, void* lpbuffer, uint64_t dwlength);
int32_t windowssys_windows_win32_system_memory_virtualUnlock(void* lpaddress, uint64_t dwsize);
int32_t windowssys_windows_win32_system_memory_virtualUnlockEx(void* process, void* address, uint64_t size);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_MEMORY_WINDOWS_WIN32_SYSTEM_MEMORY_WRAPPER_H */
