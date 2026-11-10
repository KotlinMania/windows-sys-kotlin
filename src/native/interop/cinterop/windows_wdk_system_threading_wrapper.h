#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_threading_ntCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssys_windows_wdk_system_threading_ntCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssys_windows_wdk_system_threading_ntOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_ntOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssys_windows_wdk_system_threading_ntOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_ntQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_ntQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_ntSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssys_windows_wdk_system_threading_ntSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate);
int32_t windowssys_windows_wdk_system_threading_ntSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssys_windows_wdk_system_threading_ntTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssys_windows_wdk_system_threading_ntWaitForSingleObject(void* handle, bool alertable, void* timeout);
int32_t windowssys_windows_wdk_system_threading_zwCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssys_windows_wdk_system_threading_zwCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssys_windows_wdk_system_threading_zwOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_zwOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssys_windows_wdk_system_threading_zwOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssys_windows_wdk_system_threading_zwQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_zwQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_threading_zwSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssys_windows_wdk_system_threading_zwSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate);
int32_t windowssys_windows_wdk_system_threading_zwSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssys_windows_wdk_system_threading_zwTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssys_windows_wdk_system_threading_zwWaitForSingleObject(void* handle, bool alertable, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H */
