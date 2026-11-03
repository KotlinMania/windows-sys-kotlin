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

/* ProcessStatus */
static inline BOOL windows_sys_k32_empty_working_set(HANDLE hProcess) {
    return K32EmptyWorkingSet(hProcess);
}

/* Time */
static inline DWORD windows_sys_get_time_zone_information(LPTIME_ZONE_INFORMATION lpTimeZoneInformation) {
    if (!lpTimeZoneInformation) {
        SetLastError(87);
        return 0xFFFFFFFFU;
    }
    return GetTimeZoneInformation(lpTimeZoneInformation);
}

static inline BOOL windows_sys_get_time_zone_information_for_year(
    USHORT wYear,
    PDYNAMIC_TIME_ZONE_INFORMATION pdtzi,
    LPTIME_ZONE_INFORMATION ptzi
) {
    if (!ptzi) {
        SetLastError(87);
        return FALSE;
    }
    return GetTimeZoneInformationForYear(wYear, pdtzi, ptzi);
}

static inline BOOL windows_sys_system_time_to_file_time(
    const SYSTEMTIME *lpSystemTime,
    LPFILETIME lpFileTime
) {
    if (!lpSystemTime || !lpFileTime) {
        SetLastError(87);
        return FALSE;
    }
    return SystemTimeToFileTime(lpSystemTime, lpFileTime);
}

static inline BOOL windows_sys_system_time_to_tz_specific_local_time(
    const TIME_ZONE_INFORMATION *lpTimeZoneInformation,
    const SYSTEMTIME *lpUniversalTime,
    LPSYSTEMTIME lpLocalTime
) {
    if (!lpUniversalTime || !lpLocalTime) {
        SetLastError(87);
        return FALSE;
    }
    return SystemTimeToTzSpecificLocalTime(lpTimeZoneInformation, lpUniversalTime, lpLocalTime);
}

static inline BOOL windows_sys_tz_specific_local_time_to_system_time(
    const TIME_ZONE_INFORMATION *lpTimeZoneInformation,
    const SYSTEMTIME *lpLocalTime,
    LPSYSTEMTIME lpUniversalTime
) {
    if (!lpLocalTime || !lpUniversalTime) {
        SetLastError(87);
        return FALSE;
    }
    return TzSpecificLocalTimeToSystemTime(lpTimeZoneInformation, lpLocalTime, lpUniversalTime);
}

/* Shutdown */
static inline BOOL windows_sys_lock_work_station(void) {
    return LockWorkStation();
}

/* Pipes */
static inline BOOL windows_sys_disconnect_named_pipe(HANDLE hNamedPipe) {
    return DisconnectNamedPipe(hNamedPipe);
}

/* UI / Shell */
static inline HRESULT windows_sys_sh_get_known_folder_path(
    const GUID *rfid,
    DWORD dwFlags,
    HANDLE hToken,
    PWSTR *ppszPath
) {
    if (!rfid || !ppszPath) {
        return (HRESULT)0x80070057; /* E_INVALIDARG */
    }
    return SHGetKnownFolderPath(rfid, dwFlags, hToken, ppszPath);
}

/* System / Com */
static inline void windows_sys_co_task_mem_free(LPVOID pv) {
    CoTaskMemFree(pv);
}

/* Globalization */
static inline int windows_sys_lstrlen_w(LPCWSTR lpString) {
    if (!lpString) return 0;
    return lstrlenW(lpString);
}

static inline BOOL windows_sys_get_user_preferred_ui_languages(
    DWORD dwFlags,
    PULONG pulNumLanguages,
    LPWSTR pwszLanguagesBuffer,
    PULONG pcchLanguagesBuffer
) {
    if (!pulNumLanguages || !pcchLanguagesBuffer) {
        SetLastError(87);
        return FALSE;
    }
    return GetUserPreferredUILanguages(dwFlags, pulNumLanguages, pwszLanguagesBuffer, pcchLanguagesBuffer);
}

/* System / Console */
static inline BOOL windows_sys_get_console_mode(HANDLE hConsoleHandle, LPDWORD lpMode) {
    if (!lpMode) {
        SetLastError(87);
        return FALSE;
    }
    return GetConsoleMode(hConsoleHandle, lpMode);
}

static inline BOOL windows_sys_set_console_mode(HANDLE hConsoleHandle, DWORD dwMode) {
    return SetConsoleMode(hConsoleHandle, dwMode);
}

static inline HANDLE windows_sys_get_std_handle(DWORD nStdHandle) {
    return GetStdHandle(nStdHandle);
}

static inline BOOL windows_sys_get_console_screen_buffer_info(
    HANDLE hConsoleOutput,
    PCONSOLE_SCREEN_BUFFER_INFO lpConsoleScreenBufferInfo
) {
    if (!lpConsoleScreenBufferInfo) {
        SetLastError(87);
        return FALSE;
    }
    return GetConsoleScreenBufferInfo(hConsoleOutput, lpConsoleScreenBufferInfo);
}

static inline BOOL windows_sys_set_console_text_attribute(HANDLE hConsoleOutput, WORD wAttributes) {
    return SetConsoleTextAttribute(hConsoleOutput, wAttributes);
}

static inline BOOL windows_sys_get_console_cursor_info(
    HANDLE hConsoleOutput,
    PCONSOLE_CURSOR_INFO lpConsoleCursorInfo
) {
    if (!lpConsoleCursorInfo) {
        SetLastError(87);
        return FALSE;
    }
    return GetConsoleCursorInfo(hConsoleOutput, lpConsoleCursorInfo);
}

static inline BOOL windows_sys_set_console_cursor_info(
    HANDLE hConsoleOutput,
    const CONSOLE_CURSOR_INFO *lpConsoleCursorInfo
) {
    if (!lpConsoleCursorInfo) {
        SetLastError(87);
        return FALSE;
    }
    return SetConsoleCursorInfo(hConsoleOutput, lpConsoleCursorInfo);
}

static inline BOOL windows_sys_set_console_cursor_position(HANDLE hConsoleOutput, SHORT x, SHORT y) {
    COORD pos;
    pos.X = x;
    pos.Y = y;
    return SetConsoleCursorPosition(hConsoleOutput, pos);
}

static inline BOOL windows_sys_get_number_of_console_input_events(
    HANDLE hConsoleInput,
    LPDWORD lpcNumberOfEvents
) {
    if (!lpcNumberOfEvents) {
        SetLastError(87);
        return FALSE;
    }
    return GetNumberOfConsoleInputEvents(hConsoleInput, lpcNumberOfEvents);
}

static inline BOOL windows_sys_read_console_input_w(
    HANDLE hConsoleInput,
    PINPUT_RECORD lpBuffer,
    DWORD nLength,
    LPDWORD lpNumberOfEventsRead
) {
    if (!lpBuffer || !lpNumberOfEventsRead) {
        SetLastError(87);
        return FALSE;
    }
    return ReadConsoleInputW(hConsoleInput, lpBuffer, nLength, lpNumberOfEventsRead);
}

/* System / LibraryLoader */
static inline HMODULE windows_sys_load_library_w(LPCWSTR lpLibFileName) {
    if (!lpLibFileName) {
        SetLastError(87);
        return NULL;
    }
    return LoadLibraryW(lpLibFileName);
}

static inline BOOL windows_sys_free_library(HMODULE hLibModule) {
    return FreeLibrary(hLibModule);
}

static inline FARPROC windows_sys_get_proc_address(HMODULE hModule, LPCSTR lpProcName) {
    if (!lpProcName) {
        SetLastError(87);
        return NULL;
    }
    return GetProcAddress(hModule, lpProcName);
}

static inline HMODULE windows_sys_get_module_handle_w(LPCWSTR lpModuleName) {
    return GetModuleHandleW(lpModuleName);
}

/* Storage / FileSystem additions */
static inline DWORD windows_sys_get_full_path_name_w(
    LPCWSTR lpFileName,
    DWORD nBufferLength,
    LPWSTR lpBuffer,
    LPWSTR *lpFilePart
) {
    if (!lpFileName) {
        SetLastError(87);
        return 0;
    }
    return GetFullPathNameW(lpFileName, nBufferLength, lpBuffer, lpFilePart);
}

static inline BOOL windows_sys_get_file_information_by_handle(
    HANDLE hFile,
    LPBY_HANDLE_FILE_INFORMATION lpFileInformation
) {
    if (!lpFileInformation) {
        SetLastError(87);
        return FALSE;
    }
    return GetFileInformationByHandle(hFile, lpFileInformation);
}

static inline DWORD windows_sys_get_file_type(HANDLE hFile) {
    return GetFileType(hFile);
}

/* System / SystemInformation */
static inline BOOL windows_sys_get_computer_name_ex_w(
    int NameType,
    LPWSTR lpBuffer,
    LPDWORD nSize
) {
    if (!nSize) {
        SetLastError(87);
        return FALSE;
    }
    return GetComputerNameExW((COMPUTER_NAME_FORMAT)NameType, lpBuffer, nSize);
}

/* System / Environment */
static inline BOOL windows_sys_set_environment_variable_a(LPCSTR lpName, LPCSTR lpValue) {
    return SetEnvironmentVariableA(lpName, lpValue);
}

static inline BOOL windows_sys_set_environment_variable_w(LPCWSTR lpName, LPCWSTR lpValue) {
    return SetEnvironmentVariableW(lpName, lpValue);
}

static inline DWORD windows_sys_get_environment_variable_a(LPCSTR lpName, LPSTR lpBuffer, DWORD nSize) {
    return GetEnvironmentVariableA(lpName, lpBuffer, nSize);
}

static inline DWORD windows_sys_get_environment_variable_w(LPCWSTR lpName, LPWSTR lpBuffer, DWORD nSize) {
    return GetEnvironmentVariableW(lpName, lpBuffer, nSize);
}

static inline DWORD windows_sys_expand_environment_strings_a(LPCSTR lpSrc, LPSTR lpDst, DWORD nSize) {
    return ExpandEnvironmentStringsA(lpSrc, lpDst, nSize);
}

static inline DWORD windows_sys_expand_environment_strings_w(LPCWSTR lpSrc, LPWSTR lpDst, DWORD nSize) {
    return ExpandEnvironmentStringsW(lpSrc, lpDst, nSize);
}

static inline LPCH windows_sys_get_environment_strings(void) {
    return GetEnvironmentStrings();
}

static inline LPWCH windows_sys_get_environment_strings_w(void) {
    return GetEnvironmentStringsW();
}

static inline BOOL windows_sys_free_environment_strings_a(LPCSTR penv) {
    return FreeEnvironmentStringsA((LPCH)penv);
}

static inline BOOL windows_sys_free_environment_strings_w(LPCWSTR penv) {
    return FreeEnvironmentStringsW((LPWCH)penv);
}

static inline BOOL windows_sys_set_environment_strings_w(LPCWSTR NewEnvironment) {
    return SetEnvironmentStringsW((LPWCH)NewEnvironment);
}

static inline DWORD windows_sys_get_current_directory_a(DWORD nBufferLength, LPSTR lpBuffer) {
    return GetCurrentDirectoryA(nBufferLength, lpBuffer);
}

static inline DWORD windows_sys_get_current_directory_w(DWORD nBufferLength, LPWSTR lpBuffer) {
    return GetCurrentDirectoryW(nBufferLength, lpBuffer);
}

static inline BOOL windows_sys_set_current_directory_a(LPCSTR lpPathName) {
    return SetCurrentDirectoryA(lpPathName);
}

static inline BOOL windows_sys_set_current_directory_w(LPCWSTR lpPathName) {
    return SetCurrentDirectoryW(lpPathName);
}

static inline LPCSTR windows_sys_get_command_line_a(void) {
    return GetCommandLineA();
}

static inline LPCWSTR windows_sys_get_command_line_w(void) {
    return GetCommandLineW();
}

static inline BOOL windows_sys_need_current_directory_for_exe_path_a(LPCSTR ExeName) {
    return NeedCurrentDirectoryForExePathA(ExeName);
}

static inline BOOL windows_sys_need_current_directory_for_exe_path_w(LPCWSTR ExeName) {
    return NeedCurrentDirectoryForExePathW(ExeName);
}

#ifdef __cplusplus
}
#endif

#endif /* WINDOWS_SYS_WRAPPER_H */
