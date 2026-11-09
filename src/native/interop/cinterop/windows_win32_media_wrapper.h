#ifndef WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_media_timeBeginPeriod(uint32_t uperiod);
uint32_t windowssys_windows_win32_media_timeEndPeriod(uint32_t uperiod);
uint32_t windowssys_windows_win32_media_timeGetDevCaps(void* ptc, uint32_t cbtc);
uint32_t windowssys_windows_win32_media_timeGetSystemTime(void* pmmt, uint32_t cbmmt);
uint32_t windowssys_windows_win32_media_timeGetTime(void);
uint32_t windowssys_windows_win32_media_timeKillEvent(uint32_t utimerid);
uint32_t windowssys_windows_win32_media_timeSetEvent(uint32_t udelay, uint32_t uresolution, void* fptc, uint64_t dwuser, uint32_t fuevent);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_MEDIA_WINDOWS_WIN32_MEDIA_WRAPPER_H */
