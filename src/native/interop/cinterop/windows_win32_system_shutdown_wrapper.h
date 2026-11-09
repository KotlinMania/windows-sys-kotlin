#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_shutdown_AbortSystemShutdownA(void* lpmachinename);
int32_t windowssys_windows_win32_system_shutdown_AbortSystemShutdownW(void* lpmachinename);
uint32_t windowssys_windows_win32_system_shutdown_CheckForHiberboot(void* phiberboot, bool bclearflag);
int32_t windowssys_windows_win32_system_shutdown_ExitWindowsEx(uint32_t uflags, uint32_t dwreason);
uint32_t windowssys_windows_win32_system_shutdown_InitiateShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
uint32_t windowssys_windows_win32_system_shutdown_InitiateShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownExW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_InitiateSystemShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssys_windows_win32_system_shutdown_LockWorkStation(void);
int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonCreate(void* hwnd, void* pwszreason);
int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonDestroy(void* hwnd);
int32_t windowssys_windows_win32_system_shutdown_ShutdownBlockReasonQuery(void* hwnd, void* pwszbuff, void* pcchbuff);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H */
