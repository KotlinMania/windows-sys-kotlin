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

BOOL windows_sys_c_k32_empty_working_set(HANDLE hProcess) {
    return K32EmptyWorkingSet(hProcess);
}

DWORD windows_sys_c_get_time_zone_information(LPTIME_ZONE_INFORMATION lpTimeZoneInformation) {
    if (!lpTimeZoneInformation) {
        SetLastError(87);
        return 0xFFFFFFFFU;
    }
    return GetTimeZoneInformation(lpTimeZoneInformation);
}

BOOL windows_sys_c_get_time_zone_information_for_year(
    USHORT wYear,
    PDYNAMIC_TIME_ZONE_INFORMATION pdtzi,
    LPTIME_ZONE_INFORMATION ptzi
) {
    return windows_sys_get_time_zone_information_for_year(wYear, pdtzi, ptzi);
}

BOOL windows_sys_c_system_time_to_file_time(
    const SYSTEMTIME *lpSystemTime,
    LPFILETIME lpFileTime
) {
    return windows_sys_system_time_to_file_time(lpSystemTime, lpFileTime);
}

BOOL windows_sys_c_system_time_to_tz_specific_local_time(
    const TIME_ZONE_INFORMATION *lpTimeZoneInformation,
    const SYSTEMTIME *lpUniversalTime,
    LPSYSTEMTIME lpLocalTime
) {
    return windows_sys_system_time_to_tz_specific_local_time(lpTimeZoneInformation, lpUniversalTime, lpLocalTime);
}

BOOL windows_sys_c_tz_specific_local_time_to_system_time(
    const TIME_ZONE_INFORMATION *lpTimeZoneInformation,
    const SYSTEMTIME *lpLocalTime,
    LPSYSTEMTIME lpUniversalTime
) {
    return windows_sys_tz_specific_local_time_to_system_time(lpTimeZoneInformation, lpLocalTime, lpUniversalTime);
}

BOOL windows_sys_c_lock_work_station(void) {
    return LockWorkStation();
}

BOOL windows_sys_c_disconnect_named_pipe(HANDLE hNamedPipe) {
    return DisconnectNamedPipe(hNamedPipe);
}

HRESULT windows_sys_c_sh_get_known_folder_path(
    const GUID *rfid,
    DWORD dwFlags,
    HANDLE hToken,
    PWSTR *ppszPath
) {
    return windows_sys_sh_get_known_folder_path(rfid, dwFlags, hToken, ppszPath);
}

void windows_sys_c_co_task_mem_free(LPVOID pv) {
    windows_sys_co_task_mem_free(pv);
}

int windows_sys_c_lstrlen_w(LPCWSTR lpString) {
    return windows_sys_lstrlen_w(lpString);
}

BOOL windows_sys_c_get_user_preferred_ui_languages(
    DWORD dwFlags,
    PULONG pulNumLanguages,
    LPWSTR pwszLanguagesBuffer,
    PULONG pcchLanguagesBuffer
) {
    return windows_sys_get_user_preferred_ui_languages(dwFlags, pulNumLanguages, pwszLanguagesBuffer, pcchLanguagesBuffer);
}

BOOL windows_sys_c_get_console_mode(HANDLE hConsoleHandle, LPDWORD lpMode) {
    return windows_sys_get_console_mode(hConsoleHandle, lpMode);
}

BOOL windows_sys_c_set_console_mode(HANDLE hConsoleHandle, DWORD dwMode) {
    return windows_sys_set_console_mode(hConsoleHandle, dwMode);
}

HANDLE windows_sys_c_get_std_handle(DWORD nStdHandle) {
    return windows_sys_get_std_handle(nStdHandle);
}

BOOL windows_sys_c_get_console_screen_buffer_info(
    HANDLE hConsoleOutput,
    PCONSOLE_SCREEN_BUFFER_INFO lpConsoleScreenBufferInfo
) {
    return windows_sys_get_console_screen_buffer_info(hConsoleOutput, lpConsoleScreenBufferInfo);
}

BOOL windows_sys_c_set_console_text_attribute(HANDLE hConsoleOutput, WORD wAttributes) {
    return windows_sys_set_console_text_attribute(hConsoleOutput, wAttributes);
}

BOOL windows_sys_c_get_console_cursor_info(
    HANDLE hConsoleOutput,
    PCONSOLE_CURSOR_INFO lpConsoleCursorInfo
) {
    return windows_sys_get_console_cursor_info(hConsoleOutput, lpConsoleCursorInfo);
}

BOOL windows_sys_c_set_console_cursor_info(
    HANDLE hConsoleOutput,
    const CONSOLE_CURSOR_INFO *lpConsoleCursorInfo
) {
    return windows_sys_set_console_cursor_info(hConsoleOutput, lpConsoleCursorInfo);
}

BOOL windows_sys_c_set_console_cursor_position(HANDLE hConsoleOutput, SHORT x, SHORT y) {
    return windows_sys_set_console_cursor_position(hConsoleOutput, x, y);
}

BOOL windows_sys_c_get_number_of_console_input_events(
    HANDLE hConsoleInput,
    LPDWORD lpcNumberOfEvents
) {
    return windows_sys_get_number_of_console_input_events(hConsoleInput, lpcNumberOfEvents);
}

BOOL windows_sys_c_read_console_input_w(
    HANDLE hConsoleInput,
    PINPUT_RECORD lpBuffer,
    DWORD nLength,
    LPDWORD lpNumberOfEventsRead
) {
    return windows_sys_read_console_input_w(hConsoleInput, lpBuffer, nLength, lpNumberOfEventsRead);
}

HMODULE windows_sys_c_load_library_w(LPCWSTR lpLibFileName) {
    return windows_sys_load_library_w(lpLibFileName);
}

BOOL windows_sys_c_free_library(HMODULE hLibModule) {
    return windows_sys_free_library(hLibModule);
}

FARPROC windows_sys_c_get_proc_address(HMODULE hModule, LPCSTR lpProcName) {
    return windows_sys_get_proc_address(hModule, lpProcName);
}

HMODULE windows_sys_c_get_module_handle_w(LPCWSTR lpModuleName) {
    return windows_sys_get_module_handle_w(lpModuleName);
}

DWORD windows_sys_c_get_full_path_name_w(
    LPCWSTR lpFileName,
    DWORD nBufferLength,
    LPWSTR lpBuffer,
    LPWSTR *lpFilePart
) {
    return windows_sys_get_full_path_name_w(lpFileName, nBufferLength, lpBuffer, lpFilePart);
}

BOOL windows_sys_c_get_file_information_by_handle(
    HANDLE hFile,
    LPBY_HANDLE_FILE_INFORMATION lpFileInformation
) {
    return windows_sys_get_file_information_by_handle(hFile, lpFileInformation);
}

DWORD windows_sys_c_get_file_type(HANDLE hFile) {
    return windows_sys_get_file_type(hFile);
}

BOOL windows_sys_c_get_computer_name_ex_w(
    int NameType,
    LPWSTR lpBuffer,
    LPDWORD nSize
) {
    return windows_sys_get_computer_name_ex_w(NameType, lpBuffer, nSize);
}
