#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemJobobjectsAssignProcessToJobObject(void* hjob, void* hprocess);
void* windowssysWindowsWin32SystemJobobjectsCreateJobObjectA(void* lpjobattributes, void* lpname);
void* windowssysWindowsWin32SystemJobobjectsCreateJobObjectW(void* lpjobattributes, void* lpname);
int32_t windowssysWindowsWin32SystemJobobjectsCreateJobSet(uint32_t numjob, void* userjobset, uint32_t flags);
void windowssysWindowsWin32SystemJobobjectsFreeMemoryJobObject(void* buffer);
int32_t windowssysWindowsWin32SystemJobobjectsIsProcessInJob(void* processhandle, void* jobhandle, void* result);
void* windowssysWindowsWin32SystemJobobjectsOpenJobObjectA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssysWindowsWin32SystemJobobjectsOpenJobObjectW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssysWindowsWin32SystemJobobjectsQueryInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength, void* lpreturnlength);
uint32_t windowssysWindowsWin32SystemJobobjectsQueryIoRateControlInformationJobObject(void* hjob, void* volumename, void* infoblocks, void* infoblockcount);
int32_t windowssysWindowsWin32SystemJobobjectsSetInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength);
uint32_t windowssysWindowsWin32SystemJobobjectsSetIoRateControlInformationJobObject(void* hjob, void* ioratecontrolinfo);
int32_t windowssysWindowsWin32SystemJobobjectsTerminateJobObject(void* hjob, uint32_t uexitcode);
int32_t windowssysWindowsWin32SystemJobobjectsUserHandleGrantAccess(void* huserhandle, void* hjob, int32_t bgrant);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H */
