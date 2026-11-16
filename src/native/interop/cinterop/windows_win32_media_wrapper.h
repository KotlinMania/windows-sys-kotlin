#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32MediaTimeBeginPeriod(uint32_t uperiod);
uint32_t windowssysWindowsWin32MediaTimeEndPeriod(uint32_t uperiod);
uint32_t windowssysWindowsWin32MediaTimeGetDevCaps(void* ptc, uint32_t cbtc);
uint32_t windowssysWindowsWin32MediaTimeGetSystemTime(void* pmmt, uint32_t cbmmt);
uint32_t windowssysWindowsWin32MediaTimeGetTime(void);
uint32_t windowssysWindowsWin32MediaTimeKillEvent(uint32_t utimerid);
uint32_t windowssysWindowsWin32MediaTimeSetEvent(uint32_t udelay, uint32_t uresolution, void* fptc, uint64_t dwuser, uint32_t fuevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H */
