#ifndef WINDOWS_SYS_WRAPPER_H
#define WINDOWS_SYS_WRAPPER_H

#include "win32extras.h"

#ifdef __cplusplus
extern "C" {
#endif

/* Standard Win32 API C wrappers for Kotlin/Native cinterop */
static inline BOOL windows_sys_close_handle(HANDLE hObject) {
    return CloseHandle(hObject);
}

static inline DWORD windows_sys_get_last_error(void) {
    return GetLastError();
}

static inline void windows_sys_set_last_error(DWORD dwErrCode) {
    SetLastError(dwErrCode);
}

static inline HLOCAL windows_sys_local_free(HLOCAL hMem) {
    return LocalFree(hMem);
}

static inline BOOL windows_sys_set_handle_information(HANDLE hObject, DWORD dwMask, DWORD dwFlags) {
    return SetHandleInformation(hObject, dwMask, dwFlags);
}

static inline BOOL windows_sys_get_handle_information(HANDLE hObject, LPDWORD lpdwFlags) {
    return GetHandleInformation(hObject, lpdwFlags);
}

static inline BOOL windows_sys_duplicate_handle(
    HANDLE hSourceProcessHandle,
    HANDLE hSourceHandle,
    HANDLE hTargetProcessHandle,
    LPHANDLE lpTargetHandle,
    DWORD dwDesiredAccess,
    BOOL bInheritHandle,
    DWORD dwOptions
) {
    return DuplicateHandle(
        hSourceProcessHandle,
        hSourceHandle,
        hTargetProcessHandle,
        lpTargetHandle,
        dwDesiredAccess,
        bInheritHandle,
        dwOptions
    );
}

static inline BOOL windows_sys_compare_object_handles(HANDLE hFirstObjectHandle, HANDLE hSecondObjectHandle) {
    return CompareObjectHandles(hFirstObjectHandle, hSecondObjectHandle);
}

static inline DWORD windows_sys_get_file_attributes_w(LPCWSTR lpFileName) {
    return GetFileAttributesW(lpFileName);
}

static inline BOOL windows_sys_set_file_attributes_w(LPCWSTR lpFileName, DWORD dwFileAttributes) {
    return SetFileAttributesW(lpFileName, dwFileAttributes);
}

#ifdef __cplusplus
}
#endif

#endif /* WINDOWS_SYS_WRAPPER_H */
