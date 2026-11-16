#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(uint32_t dwflags, uint32_t th32processid);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(void* lphe, uint32_t th32processid, uint64_t th32heapid);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(void* hsnapshot, void* lphl);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(void* hsnapshot, void* lphl);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(void* lphe);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(void* hsnapshot, void* lpme);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(void* hsnapshot, void* lpme);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(void* hsnapshot, void* lpme);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(void* hsnapshot, void* lpme);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(void* hsnapshot, void* lppe);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(void* hsnapshot, void* lppe);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(void* hsnapshot, void* lppe);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(void* hsnapshot, void* lppe);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(void* hsnapshot, void* lpte);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(void* hsnapshot, void* lpte);
int32_t windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(uint32_t th32processid, void* lpbaseaddress, void* lpbuffer, uint64_t cbread, void* lpnumberofbytesread);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WINDOWS_WIN32_SYSTEM_DIAGNOSTICS_TOOLHELP_WRAPPER_H */
