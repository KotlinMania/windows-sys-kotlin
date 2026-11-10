#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(uint32_t dwflags, uint32_t th32processid);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_heap32First(void* lphe, uint32_t th32processid, uint64_t th32heapid);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst(void* hsnapshot, void* lphl);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext(void* hsnapshot, void* lphl);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next(void* lphe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_module32First(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_module32Next(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_process32First(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_process32Next(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_thread32First(void* hsnapshot, void* lpte);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next(void* hsnapshot, void* lpte);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(uint32_t th32processid, void* lpbaseaddress, void* lpbuffer, uint64_t cbread, void* lpnumberofbytesread);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H */
