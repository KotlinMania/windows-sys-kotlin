#ifndef WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_foundation_closeHandle(void* hobject);
int32_t windowssys_windows_win32_foundation_compareObjectHandles(void* hfirstobjecthandle, void* hsecondobjecthandle);
int32_t windowssys_windows_win32_foundation_duplicateHandle(void* hsourceprocesshandle, void* hsourcehandle, void* htargetprocesshandle, void* lptargethandle, uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwoptions);
int32_t windowssys_windows_win32_foundation_freeLibrary(void* hlibmodule);
int32_t windowssys_windows_win32_foundation_getHandleInformation(void* hobject, void* lpdwflags);
uint32_t windowssys_windows_win32_foundation_getLastError(void);
void* windowssys_windows_win32_foundation_globalFree(void* hmem);
void* windowssys_windows_win32_foundation_localFree(void* hmem);
uint32_t windowssys_windows_win32_foundation_rtlNtStatusToDosError(int32_t status);
int32_t windowssys_windows_win32_foundation_setHandleInformation(void* hobject, uint32_t dwmask, uint32_t dwflags);
void windowssys_windows_win32_foundation_setLastError(uint32_t dwerrcode);
void windowssys_windows_win32_foundation_setLastErrorEx(uint32_t dwerrcode, uint32_t dwtype);
int32_t windowssys_windows_win32_foundation_sysAddRefString(void* bstrstring);
void* windowssys_windows_win32_foundation_sysAllocString(void* psz);
void* windowssys_windows_win32_foundation_sysAllocStringByteLen(void* psz, uint32_t len);
void* windowssys_windows_win32_foundation_sysAllocStringLen(void* strin, uint32_t ui);
void windowssys_windows_win32_foundation_sysFreeString(void* bstrstring);
int32_t windowssys_windows_win32_foundation_sysReAllocString(void* pbstr, void* psz);
int32_t windowssys_windows_win32_foundation_sysReAllocStringLen(void* pbstr, void* psz, uint32_t len);
void windowssys_windows_win32_foundation_sysReleaseString(void* bstrstring);
uint32_t windowssys_windows_win32_foundation_sysStringByteLen(void* bstr);
uint32_t windowssys_windows_win32_foundation_sysStringLen(void* pbstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H */
