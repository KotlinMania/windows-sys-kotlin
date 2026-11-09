#ifndef WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_foundation_CloseHandle(void* hobject);
int32_t windowssys_windows_win32_foundation_CompareObjectHandles(void* hfirstobjecthandle, void* hsecondobjecthandle);
int32_t windowssys_windows_win32_foundation_DuplicateHandle(void* hsourceprocesshandle, void* hsourcehandle, void* htargetprocesshandle, void* lptargethandle, uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwoptions);
int32_t windowssys_windows_win32_foundation_FreeLibrary(void* hlibmodule);
int32_t windowssys_windows_win32_foundation_GetHandleInformation(void* hobject, void* lpdwflags);
uint32_t windowssys_windows_win32_foundation_GetLastError(void);
void* windowssys_windows_win32_foundation_GlobalFree(void* hmem);
void* windowssys_windows_win32_foundation_LocalFree(void* hmem);
uint32_t windowssys_windows_win32_foundation_RtlNtStatusToDosError(int32_t status);
int32_t windowssys_windows_win32_foundation_SetHandleInformation(void* hobject, uint32_t dwmask, uint32_t dwflags);
void windowssys_windows_win32_foundation_SetLastError(uint32_t dwerrcode);
void windowssys_windows_win32_foundation_SetLastErrorEx(uint32_t dwerrcode, uint32_t dwtype);
int32_t windowssys_windows_win32_foundation_SysAddRefString(void* bstrstring);
void* windowssys_windows_win32_foundation_SysAllocString(void* psz);
void* windowssys_windows_win32_foundation_SysAllocStringByteLen(void* psz, uint32_t len);
void* windowssys_windows_win32_foundation_SysAllocStringLen(void* strin, uint32_t ui);
void windowssys_windows_win32_foundation_SysFreeString(void* bstrstring);
int32_t windowssys_windows_win32_foundation_SysReAllocString(void* pbstr, void* psz);
int32_t windowssys_windows_win32_foundation_SysReAllocStringLen(void* pbstr, void* psz, uint32_t len);
void windowssys_windows_win32_foundation_SysReleaseString(void* bstrstring);
uint32_t windowssys_windows_win32_foundation_SysStringByteLen(void* bstr);
uint32_t windowssys_windows_win32_foundation_SysStringLen(void* pbstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H */
