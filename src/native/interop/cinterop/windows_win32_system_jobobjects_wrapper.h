#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_jobobjects_AssignProcessToJobObject(void* hjob, void* hprocess);
void* windowssys_windows_win32_system_jobobjects_CreateJobObjectA(void* lpjobattributes, void* lpname);
void* windowssys_windows_win32_system_jobobjects_CreateJobObjectW(void* lpjobattributes, void* lpname);
int32_t windowssys_windows_win32_system_jobobjects_CreateJobSet(uint32_t numjob, void* userjobset, uint32_t flags);
void windowssys_windows_win32_system_jobobjects_FreeMemoryJobObject(void* buffer);
int32_t windowssys_windows_win32_system_jobobjects_IsProcessInJob(void* processhandle, void* jobhandle, void* result);
void* windowssys_windows_win32_system_jobobjects_OpenJobObjectA(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
void* windowssys_windows_win32_system_jobobjects_OpenJobObjectW(uint32_t dwdesiredaccess, int32_t binherithandle, void* lpname);
int32_t windowssys_windows_win32_system_jobobjects_QueryInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength, void* lpreturnlength);
uint32_t windowssys_windows_win32_system_jobobjects_QueryIoRateControlInformationJobObject(void* hjob, void* volumename, void* infoblocks, void* infoblockcount);
int32_t windowssys_windows_win32_system_jobobjects_SetInformationJobObject(void* hjob, int32_t jobobjectinformationclass, void* lpjobobjectinformation, uint32_t cbjobobjectinformationlength);
uint32_t windowssys_windows_win32_system_jobobjects_SetIoRateControlInformationJobObject(void* hjob, void* ioratecontrolinfo);
int32_t windowssys_windows_win32_system_jobobjects_TerminateJobObject(void* hjob, uint32_t uexitcode);
int32_t windowssys_windows_win32_system_jobobjects_UserHandleGrantAccess(void* huserhandle, void* hjob, int32_t bgrant);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WINDOWS_WIN32_SYSTEM_JOBOBJECTS_WRAPPER_H */
