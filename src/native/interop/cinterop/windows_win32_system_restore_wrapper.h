#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTORE_WINDOWS_WIN32_SYSTEM_RESTORE_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTORE_WINDOWS_WIN32_SYSTEM_RESTORE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_system_restore_sRRemoveRestorePoint(uint32_t dwrpnum);
int32_t windowssys_windows_win32_system_restore_sRSetRestorePointA(void* prestoreptspec, void* psmgrstatus);
int32_t windowssys_windows_win32_system_restore_sRSetRestorePointW(void* prestoreptspec, void* psmgrstatus);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_RESTORE_WINDOWS_WIN32_SYSTEM_RESTORE_WRAPPER_H */
