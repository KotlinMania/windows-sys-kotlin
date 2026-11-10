#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_jobobjects_assignProcessToJobObject(void* hjob, void* hprocess);
void* windowssys_windows_win32_system_jobobjects_createJobObjectA(void* lpjobattributes, void* lpname);
void* windowssys_windows_win32_system_jobobjects_createJobObjectW(void* lpjobattributes, void* lpname);
int32_t windowssys_windows_win32_system_jobobjects_createJobSet(uint32_t numjob, void* userjobset, uint32_t flags);
void windowssys_windows_win32_system_jobobjects_freeMemoryJobObject(void* buffer);
int32_t windowssys_windows_win32_system_jobobjects_isProcessInJob(void* processhandle, void* jobhandle, void* result);
void* windowssys_windows_win32_system_jobobjects_openJobObjectA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssys_windows_win32_system_jobobjects_openJobObjectW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssys_windows_win32_system_jobobjects_queryInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength, void* lpreturnlength);
uint32_t windowssys_windows_win32_system_jobobjects_queryIoRateControlInformationJobObject(void* hjob, void* volumename, void* infoblocks, void* infoblockcount);
int32_t windowssys_windows_win32_system_jobobjects_setInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength);
uint32_t windowssys_windows_win32_system_jobobjects_setIoRateControlInformationJobObject(void* hjob, void* ioratecontrolinfo);
int32_t windowssys_windows_win32_system_jobobjects_terminateJobObject(void* hjob, uint32_t uexitcode);
int32_t windowssys_windows_win32_system_jobobjects_userHandleGrantAccess(void* huserhandle, void* hjob, int32_t bgrant);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H */
