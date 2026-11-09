#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_systeminformation_NtQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_systeminformation_NtQuerySystemTime(void* systemtime);
int32_t windowssys_windows_wdk_system_systeminformation_NtQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);
int32_t windowssys_windows_wdk_system_systeminformation_ZwQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_systeminformation_ZwQuerySystemTime(void* systemtime);
int32_t windowssys_windows_wdk_system_systeminformation_ZwQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H */
