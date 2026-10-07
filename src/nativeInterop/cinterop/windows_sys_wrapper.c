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

DWORD windows_sys_c_get_file_attributes_a(LPCSTR lpFileName) {
    return GetFileAttributesA(lpFileName);
}

BOOL windows_sys_c_set_file_attributes_a(LPCSTR lpFileName, DWORD dwFileAttributes) {
    return SetFileAttributesA(lpFileName, dwFileAttributes);
}

HANDLE windows_sys_c_create_file_w(
    LPCWSTR lpFileName,
    DWORD dwDesiredAccess,
    DWORD dwShareMode,
    LPSECURITY_ATTRIBUTES lpSecurityAttributes,
    DWORD dwCreationDisposition,
    DWORD dwFlagsAndAttributes,
    HANDLE hTemplateFile
) {
    return CreateFileW(
        lpFileName,
        dwDesiredAccess,
        dwShareMode,
        lpSecurityAttributes,
        dwCreationDisposition,
        dwFlagsAndAttributes,
        hTemplateFile
    );
}

HANDLE windows_sys_c_create_file_a(
    LPCSTR lpFileName,
    DWORD dwDesiredAccess,
    DWORD dwShareMode,
    LPSECURITY_ATTRIBUTES lpSecurityAttributes,
    DWORD dwCreationDisposition,
    DWORD dwFlagsAndAttributes,
    HANDLE hTemplateFile
) {
    return CreateFileA(
        lpFileName,
        dwDesiredAccess,
        dwShareMode,
        lpSecurityAttributes,
        dwCreationDisposition,
        dwFlagsAndAttributes,
        hTemplateFile
    );
}

BOOL windows_sys_c_delete_file_w(LPCWSTR lpFileName) {
    return DeleteFileW(lpFileName);
}

BOOL windows_sys_c_delete_file_a(LPCSTR lpFileName) {
    return DeleteFileA(lpFileName);
}

BOOL windows_sys_c_flush_file_buffers(HANDLE hFile) {
    return FlushFileBuffers(hFile);
}

BOOL windows_sys_c_are_file_apis_ansi(void) {
    return AreFileApisANSI();
}

DWORD windows_sys_c_get_file_size(HANDLE hFile, LPDWORD lpFileSizeHigh) {
    return GetFileSize(hFile, lpFileSizeHigh);
}

DWORD windows_sys_c_set_file_pointer(
    HANDLE hFile,
    LONG lDistanceToMove,
    PLONG lpDistanceToMoveHigh,
    DWORD dwMoveMethod
) {
    return SetFilePointer(hFile, lDistanceToMove, lpDistanceToMoveHigh, dwMoveMethod);
}

HANDLE windows_sys_c_get_current_process(void) {
    return GetCurrentProcess();
}

DWORD windows_sys_c_get_current_process_id(void) {
    return GetCurrentProcessId();
}

HANDLE windows_sys_c_get_current_thread(void) {
    return GetCurrentThread();
}

DWORD windows_sys_c_get_current_thread_id(void) {
    return GetCurrentThreadId();
}

BOOL windows_sys_c_terminate_process(HANDLE hProcess, UINT uExitCode) {
    return TerminateProcess(hProcess, uExitCode);
}

void windows_sys_c_exit_process(UINT uExitCode) {
    ExitProcess(uExitCode);
}

HANDLE windows_sys_c_open_process(DWORD dwDesiredAccess, BOOL bInheritHandle, DWORD dwProcessId) {
    return OpenProcess(dwDesiredAccess, bInheritHandle, dwProcessId);
}
