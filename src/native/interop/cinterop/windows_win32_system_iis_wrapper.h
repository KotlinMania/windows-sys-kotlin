#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_iis_GetExtensionVersion(void* pver);
int32_t windowssys_windows_win32_system_iis_GetFilterVersion(void* pver);
uint32_t windowssys_windows_win32_system_iis_HttpExtensionProc(void* pecb);
uint32_t windowssys_windows_win32_system_iis_HttpFilterProc(void* pfc, uint32_t notificationtype, void* pvnotification);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H */
