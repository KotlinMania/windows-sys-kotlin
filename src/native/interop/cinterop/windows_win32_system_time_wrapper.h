#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(uint32_t dwindex, void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_FileTimeToSystemTime(void* lpfiletime, void* lpsystemtime);
uint32_t windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(void* ptimezoneinformation);
uint32_t windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(void* lptimezoneinformation, void* firstyear, void* lastyear);
uint32_t windowssys_windows_win32_system_time_GetTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(uint16_t wyear, void* pdtzi, void* ptzi);
int32_t windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(void* timezoneinformation, void* localfiletime, void* localsystemtime);
int32_t windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(void* timezoneinformation, void* localsystemtime, void* localfiletime);
int32_t windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_SetTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_SystemTimeToFileTime(void* lpsystemtime, void* lpfiletime);
int32_t windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);
int32_t windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H */
