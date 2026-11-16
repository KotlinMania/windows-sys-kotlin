#ifndef WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssysWindowsWin32FoundationCloseHandle(void* hobject);
int32_t windowssysWindowsWin32FoundationCompareObjectHandles(void* hfirstobjecthandle, void* hsecondobjecthandle);
int32_t windowssysWindowsWin32FoundationDuplicateHandle(void* hsourceprocesshandle, void* hsourcehandle, void* htargetprocesshandle, void* lptargethandle, uint32_t dwdesiredaccess, int32_t binherithandle, uint32_t dwoptions);
int32_t windowssysWindowsWin32FoundationFreeLibrary(void* hlibmodule);
int32_t windowssysWindowsWin32FoundationGetHandleInformation(void* hobject, void* lpdwflags);
uint32_t windowssysWindowsWin32FoundationGetLastError(void);
void* windowssysWindowsWin32FoundationGlobalFree(void* hmem);
void* windowssysWindowsWin32FoundationLocalFree(void* hmem);
uint32_t windowssysWindowsWin32FoundationRtlNtStatusToDosError(int32_t status);
int32_t windowssysWindowsWin32FoundationSetHandleInformation(void* hobject, uint32_t dwmask, uint32_t dwflags);
void windowssysWindowsWin32FoundationSetLastError(uint32_t dwerrcode);
void windowssysWindowsWin32FoundationSetLastErrorEx(uint32_t dwerrcode, uint32_t dwtype);
int32_t windowssysWindowsWin32FoundationSysAddRefString(void* bstrstring);
void* windowssysWindowsWin32FoundationSysAllocString(void* psz);
void* windowssysWindowsWin32FoundationSysAllocStringByteLen(void* psz, uint32_t len);
void* windowssysWindowsWin32FoundationSysAllocStringLen(void* strin, uint32_t ui);
void windowssysWindowsWin32FoundationSysFreeString(void* bstrstring);
int32_t windowssysWindowsWin32FoundationSysReAllocString(void* pbstr, void* psz);
int32_t windowssysWindowsWin32FoundationSysReAllocStringLen(void* pbstr, void* psz, uint32_t len);
void windowssysWindowsWin32FoundationSysReleaseString(void* bstrstring);
uint32_t windowssysWindowsWin32FoundationSysStringByteLen(void* bstr);
uint32_t windowssysWindowsWin32FoundationSysStringLen(void* pbstr);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_FOUNDATION_WINDOWS_WIN32_FOUNDATION_WRAPPER_H */
