#include "windows_sys_wrapper.h"

/* Non-inline definitions if compiled as a separate compilation unit */
BOOL windows_sys_c_close_handle(HANDLE hObject) {
    return CloseHandle(hObject);
}

DWORD windows_sys_c_get_last_error(void) {
    return GetLastError();
}

void windows_sys_c_set_last_error(DWORD dwErrCode) {
    SetLastError(dwErrCode);
}

HLOCAL windows_sys_c_local_free(HLOCAL hMem) {
    return LocalFree(hMem);
}

BOOL windows_sys_c_set_handle_information(HANDLE hObject, DWORD dwMask, DWORD dwFlags) {
    return SetHandleInformation(hObject, dwMask, dwFlags);
}

BOOL windows_sys_c_get_handle_information(HANDLE hObject, LPDWORD lpdwFlags) {
    return GetHandleInformation(hObject, lpdwFlags);
}

BOOL windows_sys_c_duplicate_handle(
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

BOOL windows_sys_c_compare_object_handles(HANDLE hFirstObjectHandle, HANDLE hSecondObjectHandle) {
    return CompareObjectHandles(hFirstObjectHandle, hSecondObjectHandle);
}

DWORD windows_sys_c_get_file_attributes_w(LPCWSTR lpFileName) {
    return GetFileAttributesW(lpFileName);
}

BOOL windows_sys_c_set_file_attributes_w(LPCWSTR lpFileName, DWORD dwFileAttributes) {
    return SetFileAttributesW(lpFileName, dwFileAttributes);
}
