#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(void* pstg, void* punkouter, void* ppiunk);
int32_t windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(void* pstm, void* punkouter, void* ppiunk);
int32_t windowssysWindowsWin32StorageIndexserverLoadIFilter(void* pwcspath, void* punkouter, void* ppiunk);
int32_t windowssysWindowsWin32StorageIndexserverLoadIFilterEx(void* pwcspath, uint32_t dwflags, void* riid, void* ppiunk);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_INDEXSERVER_WINDOWS_WIN32_STORAGE_INDEXSERVER_WRAPPER_H */
