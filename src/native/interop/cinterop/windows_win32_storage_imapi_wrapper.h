#ifndef WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void windowssys_windows_win32_storage_imapi_CloseIMsgSession(int64_t lpmsgsess);
int32_t windowssys_windows_win32_storage_imapi_GetAttribIMsgOnIStg(void* lpobject, void* lpproptagarray, void* lpppropattrarray);
int32_t windowssys_windows_win32_storage_imapi_MapStorageSCode(int32_t stgscode);
int32_t windowssys_windows_win32_storage_imapi_OpenIMsgSession(void* lpmalloc, uint32_t ulflags, void* lppmsgsess);
int32_t windowssys_windows_win32_storage_imapi_SetAttribIMsgOnIStg(void* lpobject, void* lpproptags, void* lppropattrs, void* lpppropproblems);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_STORAGE_IMAPI_WINDOWS_WIN32_STORAGE_IMAPI_WRAPPER_H */
