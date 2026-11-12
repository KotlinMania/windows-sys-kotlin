#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(void* systemtime);
int32_t windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);
int32_t windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(void* systemtime);
int32_t windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H */
