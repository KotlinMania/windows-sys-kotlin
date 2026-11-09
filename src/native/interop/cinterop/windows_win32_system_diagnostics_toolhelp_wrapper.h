#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(uint32_t dwflags, uint32_t th32processid);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(void* lphe, uint32_t th32processid, uint64_t th32heapid);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(void* hsnapshot, void* lphl);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(void* hsnapshot, void* lphl);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(void* lphe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(void* hsnapshot, void* lpme);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(void* hsnapshot, void* lppe);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(void* hsnapshot, void* lpte);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(void* hsnapshot, void* lpte);
int32_t windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(uint32_t th32processid, void* lpbaseaddress, void* lpbuffer, uint64_t cbread, void* lpnumberofbytesread);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H */
