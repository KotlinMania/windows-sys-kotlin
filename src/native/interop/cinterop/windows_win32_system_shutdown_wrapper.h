#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemShutdownAbortSystemShutdownA(void* lpmachinename);
int32_t windowssysWindowsWin32SystemShutdownAbortSystemShutdownW(void* lpmachinename);
uint32_t windowssysWindowsWin32SystemShutdownCheckForHiberboot(void* phiberboot, bool bclearflag);
int32_t windowssysWindowsWin32SystemShutdownExitWindowsEx(uint32_t uflags, uint32_t dwreason);
uint32_t windowssysWindowsWin32SystemShutdownInitiateShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
uint32_t windowssysWindowsWin32SystemShutdownInitiateShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
int32_t windowssysWindowsWin32SystemShutdownInitiateSystemShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssysWindowsWin32SystemShutdownInitiateSystemShutdownExW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssysWindowsWin32SystemShutdownInitiateSystemShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssysWindowsWin32SystemShutdownLockWorkStation(void);
int32_t windowssysWindowsWin32SystemShutdownShutdownBlockReasonCreate(void* hwnd, void* pwszreason);
int32_t windowssysWindowsWin32SystemShutdownShutdownBlockReasonDestroy(void* hwnd);
int32_t windowssysWindowsWin32SystemShutdownShutdownBlockReasonQuery(void* hwnd, void* pwszbuff, void* pcchbuff);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H */
