#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkSystemThreadingNtCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssysWindowsWdkSystemThreadingNtCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssysWindowsWdkSystemThreadingNtOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemThreadingNtOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssysWindowsWdkSystemThreadingNtOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemThreadingNtQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemThreadingNtQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemThreadingNtSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssysWindowsWdkSystemThreadingNtSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate);
int32_t windowssysWindowsWdkSystemThreadingNtSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssysWindowsWdkSystemThreadingNtTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssysWindowsWdkSystemThreadingNtWaitForSingleObject(void* handle, bool alertable, void* timeout);
int32_t windowssysWindowsWdkSystemThreadingZwCancelTimer(void* timerhandle, void* currentstate);
int32_t windowssysWindowsWdkSystemThreadingZwCreateTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes, int32_t timertype);
int32_t windowssysWindowsWdkSystemThreadingZwOpenEvent(void* eventhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemThreadingZwOpenProcess(void* processhandle, uint32_t desiredaccess, void* objectattributes, void* clientid);
int32_t windowssysWindowsWdkSystemThreadingZwOpenTimer(void* timerhandle, uint32_t desiredaccess, void* objectattributes);
int32_t windowssysWindowsWdkSystemThreadingZwQueryInformationProcess(void* processhandle, int32_t processinformationclass, void* processinformation, uint32_t processinformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemThreadingZwQueryInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemThreadingZwSetInformationThread(void* threadhandle, int32_t threadinformationclass, void* threadinformation, uint32_t threadinformationlength);
int32_t windowssysWindowsWdkSystemThreadingZwSetTimer(void* timerhandle, void* duetime, void* timerapcroutine, void* timercontext, bool resumetimer, int32_t period, void* previousstate);
int32_t windowssysWindowsWdkSystemThreadingZwSetTimerEx(void* timerhandle, int32_t timersetinformationclass, void* timersetinformation, uint32_t timersetinformationlength);
int32_t windowssysWindowsWdkSystemThreadingZwTerminateProcess(void* processhandle, int32_t exitstatus);
int32_t windowssysWindowsWdkSystemThreadingZwWaitForSingleObject(void* handle, bool alertable, void* timeout);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_THREADING_WINDOWS_WDK_SYSTEM_THREADING_WRAPPER_H */
