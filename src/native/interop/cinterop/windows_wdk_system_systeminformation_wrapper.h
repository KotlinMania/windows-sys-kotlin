#ifndef WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_wdk_system_systeminformation_ntQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_systeminformation_ntQuerySystemTime(void* systemtime);
int32_t windowssys_windows_wdk_system_systeminformation_ntQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);
int32_t windowssys_windows_wdk_system_systeminformation_zwQuerySystemInformation(int32_t systeminformationclass, void* systeminformation, uint32_t systeminformationlength, void* returnlength);
int32_t windowssys_windows_wdk_system_systeminformation_zwQuerySystemTime(void* systemtime);
int32_t windowssys_windows_wdk_system_systeminformation_zwQueryTimerResolution(void* maximumtime, void* minimumtime, void* currenttime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WINDOWS_WDK_SYSTEM_SYSTEMINFORMATION_WRAPPER_H */
