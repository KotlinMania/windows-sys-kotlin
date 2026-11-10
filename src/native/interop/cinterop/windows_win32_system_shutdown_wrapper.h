#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_shutdown_abortSystemShutdownA(void* lpmachinename);
int32_t windowssys_windows_win32_system_shutdown_abortSystemShutdownW(void* lpmachinename);
uint32_t windowssys_windows_win32_system_shutdown_checkForHiberboot(void* phiberboot, bool bclearflag);
int32_t windowssys_windows_win32_system_shutdown_exitWindowsEx(uint32_t uflags, uint32_t dwreason);
uint32_t windowssys_windows_win32_system_shutdown_initiateShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
uint32_t windowssys_windows_win32_system_shutdown_initiateShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwgraceperiod, uint32_t dwshutdownflags, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_initiateSystemShutdownA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssys_windows_win32_system_shutdown_initiateSystemShutdownExA(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_initiateSystemShutdownExW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown, uint32_t dwreason);
int32_t windowssys_windows_win32_system_shutdown_initiateSystemShutdownW(void* lpmachinename, void* lpmessage, uint32_t dwtimeout, int32_t bforceappsclosed, int32_t brebootaftershutdown);
int32_t windowssys_windows_win32_system_shutdown_lockWorkStation(void);
int32_t windowssys_windows_win32_system_shutdown_shutdownBlockReasonCreate(void* hwnd, void* pwszreason);
int32_t windowssys_windows_win32_system_shutdown_shutdownBlockReasonDestroy(void* hwnd);
int32_t windowssys_windows_win32_system_shutdown_shutdownBlockReasonQuery(void* hwnd, void* pwszbuff, void* pcchbuff);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WINDOWS_WIN32_SYSTEM_SHUTDOWN_WRAPPER_H */
