#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesEnable(int32_t benable, void* pbrebootrequired);
uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatus(void* pbactive, void* pbenabled);
uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesQueryStatusEx(void* pbactive, void* pbenabled, void* pbavailable);
uint32_t windowssys_windows_win32_storage_offlinefiles_OfflineFilesStart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H */
