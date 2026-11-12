#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssysWindowsWin32StorageImapiCloseIMsgSession(int64_t lpmsgsess);
int32_t windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(void* lpobject, void* lpproptagarray, void* lpppropattrarray);
int32_t windowssysWindowsWin32StorageImapiMapStorageSCode(int32_t stgscode);
int32_t windowssysWindowsWin32StorageImapiOpenIMsgSession(void* lpmalloc, uint32_t ulflags, void* lppmsgsess);
int32_t windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(void* lpobject, void* lpproptags, void* lppropattrs, void* lpppropproblems);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H */
