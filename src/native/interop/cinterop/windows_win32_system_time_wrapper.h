#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_time_enumDynamicTimeZoneInformation(uint32_t dwindex, void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_fileTimeToSystemTime(void* lpfiletime, void* lpsystemtime);
uint32_t windowssys_windows_win32_system_time_getDynamicTimeZoneInformation(void* ptimezoneinformation);
uint32_t windowssys_windows_win32_system_time_getDynamicTimeZoneInformationEffectiveYears(void* lptimezoneinformation, void* firstyear, void* lastyear);
uint32_t windowssys_windows_win32_system_time_getTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_getTimeZoneInformationForYear(uint16_t wyear, void* pdtzi, void* ptzi);
int32_t windowssys_windows_win32_system_time_localFileTimeToLocalSystemTime(void* timezoneinformation, void* localfiletime, void* localsystemtime);
int32_t windowssys_windows_win32_system_time_localSystemTimeToLocalFileTime(void* timezoneinformation, void* localsystemtime, void* localfiletime);
int32_t windowssys_windows_win32_system_time_setDynamicTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_setTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssys_windows_win32_system_time_systemTimeToFileTime(void* lpsystemtime, void* lpfiletime);
int32_t windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTime(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssys_windows_win32_system_time_systemTimeToTzSpecificLocalTimeEx(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTime(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);
int32_t windowssys_windows_win32_system_time_tzSpecificLocalTimeToSystemTimeEx(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H */
