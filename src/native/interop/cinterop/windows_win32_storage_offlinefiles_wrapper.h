#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

uint32_t windowssysWindowsWin32StorageOfflinefilesOfflineFilesEnable(int32_t benable, void* pbrebootrequired);
uint32_t windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatus(void* pbactive, void* pbenabled);
uint32_t windowssysWindowsWin32StorageOfflinefilesOfflineFilesQueryStatusEx(void* pbactive, void* pbenabled, void* pbavailable);
uint32_t windowssysWindowsWin32StorageOfflinefilesOfflineFilesStart(void);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WINDOWS_WIN32_STORAGE_OFFLINEFILES_WRAPPER_H */
