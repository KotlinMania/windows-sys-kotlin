#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_storage_indexserver_bindIFilterFromStorage(void* pstg, void* punkouter, void* ppiunk);
int32_t windowssys_windows_win32_storage_indexserver_bindIFilterFromStream(void* pstm, void* punkouter, void* ppiunk);
int32_t windowssys_windows_win32_storage_indexserver_loadIFilter(void* pwcspath, void* punkouter, void* ppiunk);
int32_t windowssys_windows_win32_storage_indexserver_loadIFilterEx(void* pwcspath, uint32_t dwflags, void* riid, void* ppiunk);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H */
