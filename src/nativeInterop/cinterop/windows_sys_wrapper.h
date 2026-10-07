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

static inline DWORD windows_sys_get_file_attributes_a(LPCSTR lpFileName) {
    return GetFileAttributesA(lpFileName);
}

static inline BOOL windows_sys_set_file_attributes_a(LPCSTR lpFileName, DWORD dwFileAttributes) {
    return SetFileAttributesA(lpFileName, dwFileAttributes);
}

static inline HANDLE windows_sys_create_file_w(
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

static inline HANDLE windows_sys_create_file_a(
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

static inline BOOL windows_sys_delete_file_w(LPCWSTR lpFileName) {
    return DeleteFileW(lpFileName);
}

static inline BOOL windows_sys_delete_file_a(LPCSTR lpFileName) {
    return DeleteFileA(lpFileName);
}

static inline BOOL windows_sys_flush_file_buffers(HANDLE hFile) {
    return FlushFileBuffers(hFile);
}

static inline BOOL windows_sys_are_file_apis_ansi(void) {
    return AreFileApisANSI();
}

static inline DWORD windows_sys_get_file_size(HANDLE hFile, LPDWORD lpFileSizeHigh) {
    return GetFileSize(hFile, lpFileSizeHigh);
}

static inline DWORD windows_sys_set_file_pointer(
    HANDLE hFile,
    LONG lDistanceToMove,
    PLONG lpDistanceToMoveHigh,
    DWORD dwMoveMethod
) {
    return SetFilePointer(hFile, lDistanceToMove, lpDistanceToMoveHigh, dwMoveMethod);
}

/* System / Threading */
static inline HANDLE windows_sys_get_current_process(void) {
    return GetCurrentProcess();
}

static inline DWORD windows_sys_get_current_process_id(void) {
    return GetCurrentProcessId();
}

static inline HANDLE windows_sys_get_current_thread(void) {
    return GetCurrentThread();
}

static inline DWORD windows_sys_get_current_thread_id(void) {
    return GetCurrentThreadId();
}

static inline BOOL windows_sys_terminate_process(HANDLE hProcess, UINT uExitCode) {
    return TerminateProcess(hProcess, uExitCode);
}

static inline void windows_sys_exit_process(UINT uExitCode) {
    ExitProcess(uExitCode);
}

static inline HANDLE windows_sys_open_process(DWORD dwDesiredAccess, BOOL bInheritHandle, DWORD dwProcessId) {
    return OpenProcess(dwDesiredAccess, bInheritHandle, dwProcessId);
}

#ifdef __cplusplus
}
#endif

#endif /* WINDOWS_SYS_WRAPPER_H */
