#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32SystemIisGetExtensionVersion(void* pver);
int32_t windowssysWindowsWin32SystemIisGetFilterVersion(void* pver);
uint32_t windowssysWindowsWin32SystemIisHttpExtensionProc(void* pecb);
uint32_t windowssysWindowsWin32SystemIisHttpFilterProc(void* pfc, uint32_t notificationtype, void* pvnotification);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_IIS_WINDOWS_WIN32_SYSTEM_IIS_WRAPPER_H */
