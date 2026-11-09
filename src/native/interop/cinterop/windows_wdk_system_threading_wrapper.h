#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_threading_NtCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssys_windows_wdk_system_threading_NtCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssys_windows_wdk_system_threading_NtOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_NtOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssys_windows_wdk_system_threading_NtOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_NtQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_NtQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_NtSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssys_windows_wdk_system_threading_NtSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssys_windows_wdk_system_threading_NtTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssys_windows_wdk_system_threading_NtWaitForSingleObject(void* handle, bool alertable, void* timeout);
int32_t windowssys_windows_wdk_system_threading_ZwCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssys_windows_wdk_system_threading_ZwCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssys_windows_wdk_system_threading_ZwOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_ZwOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssys_windows_wdk_system_threading_ZwOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_ZwQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_ZwQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_ZwSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssys_windows_wdk_system_threading_ZwSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssys_windows_wdk_system_threading_ZwTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssys_windows_wdk_system_threading_ZwWaitForSingleObject(void* handle, bool alertable, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H */
