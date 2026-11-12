#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32SystemTimeEnumDynamicTimeZoneInformation(uint32_t dwindex, void* lptimezoneinformation);
int32_t windowssysWindowsWin32SystemTimeFileTimeToSystemTime(void* lpfiletime, void* lpsystemtime);
uint32_t windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformation(void* ptimezoneinformation);
uint32_t windowssysWindowsWin32SystemTimeGetDynamicTimeZoneInformationEffectiveYears(void* lptimezoneinformation, void* firstyear, void* lastyear);
uint32_t windowssysWindowsWin32SystemTimeGetTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssysWindowsWin32SystemTimeGetTimeZoneInformationForYear(uint16_t wyear, void* pdtzi, void* ptzi);
int32_t windowssysWindowsWin32SystemTimeLocalFileTimeToLocalSystemTime(void* timezoneinformation, void* localfiletime, void* localsystemtime);
int32_t windowssysWindowsWin32SystemTimeLocalSystemTimeToLocalFileTime(void* timezoneinformation, void* localsystemtime, void* localfiletime);
int32_t windowssysWindowsWin32SystemTimeSetDynamicTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssysWindowsWin32SystemTimeSetTimeZoneInformation(void* lptimezoneinformation);
int32_t windowssysWindowsWin32SystemTimeSystemTimeToFileTime(void* lpsystemtime, void* lpfiletime);
int32_t windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTime(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssysWindowsWin32SystemTimeSystemTimeToTzSpecificLocalTimeEx(void* lptimezoneinformation, void* lpuniversaltime, void* lplocaltime);
int32_t windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTime(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);
int32_t windowssysWindowsWin32SystemTimeTzSpecificLocalTimeToSystemTimeEx(void* lptimezoneinformation, void* lplocaltime, void* lpuniversaltime);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_TIME_WINDOWS_WIN32_SYSTEM_TIME_WRAPPER_H */
