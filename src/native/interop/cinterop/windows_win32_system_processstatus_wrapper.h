#ifndef WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H
#define WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t windowssys_windows_win32_system_processstatus_emptyWorkingSet(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_enumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_enumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_enumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_enumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_enumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssys_windows_win32_system_processstatus_enumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_getModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_getPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssys_windows_win32_system_processstatus_getProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_getProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_getProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_getWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_getWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssys_windows_win32_system_processstatus_initializeProcessForWsWatch(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_k32EmptyWorkingSet(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_k32EnumDeviceDrivers(void* lpimagebase, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_k32EnumPageFilesA(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_k32EnumPageFilesW(void* pcallbackroutine, void* pcontext);
int32_t windowssys_windows_win32_system_processstatus_k32EnumProcessModules(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded);
int32_t windowssys_windows_win32_system_processstatus_k32EnumProcessModulesEx(void* hprocess, void* lphmodule, uint32_t cb, void* lpcbneeded, uint32_t dwfilterflag);
int32_t windowssys_windows_win32_system_processstatus_k32EnumProcesses(void* lpidprocess, uint32_t cb, void* lpcbneeded);
uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverBaseNameW(void* imagebase, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameA(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetDeviceDriverFileNameW(void* imagebase, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetMappedFileNameA(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetMappedFileNameW(void* hprocess, void* lpv, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameA(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleBaseNameW(void* hprocess, void* hmodule, void* lpbasename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExA(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetModuleFileNameExW(void* hprocess, void* hmodule, void* lpfilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_k32GetModuleInformation(void* hprocess, void* hmodule, void* lpmodinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_k32GetPerformanceInfo(void* pperformanceinformation, uint32_t cb);
uint32_t windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameA(void* hprocess, void* lpimagefilename, uint32_t nsize);
uint32_t windowssys_windows_win32_system_processstatus_k32GetProcessImageFileNameW(void* hprocess, void* lpimagefilename, uint32_t nsize);
int32_t windowssys_windows_win32_system_processstatus_k32GetProcessMemoryInfo(void* process, void* ppsmemcounters, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_k32GetWsChanges(void* hprocess, void* lpwatchinfo, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_k32GetWsChangesEx(void* hprocess, void* lpwatchinfoex, void* cb);
int32_t windowssys_windows_win32_system_processstatus_k32InitializeProcessForWsWatch(void* hprocess);
int32_t windowssys_windows_win32_system_processstatus_k32QueryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_k32QueryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_queryWorkingSet(void* hprocess, void* pv, uint32_t cb);
int32_t windowssys_windows_win32_system_processstatus_queryWorkingSetEx(void* hprocess, void* pv, uint32_t cb);

#ifdef __cplusplus
}
#endif

#endif /* WINDOWSSYS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WINDOWS_WIN32_SYSTEM_PROCESSSTATUS_WRAPPER_H */
