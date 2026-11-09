#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_processstatus_EmptyWorkingSet(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_EnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_EnumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_EnumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_EnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_EnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssys_windows_win32_system_processstatus_EnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_GetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_GetPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssys_windows_win32_system_processstatus_GetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_GetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_GetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_GetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_GetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssys_windows_win32_system_processstatus_InitializeProcessForWsWatch(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_K32EmptyWorkingSet(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_K32EnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_K32EnumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_K32EnumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_K32EnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_K32EnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssys_windows_win32_system_processstatus_K32EnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_K32GetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_K32GetPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_K32GetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_K32GetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_K32GetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_K32GetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssys_windows_win32_system_processstatus_K32InitializeProcessForWsWatch(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_K32QueryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_K32QueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_QueryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_QueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H */
